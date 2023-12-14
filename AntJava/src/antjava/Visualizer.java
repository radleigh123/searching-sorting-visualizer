package antjava;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JPanel;

public class Visualizer {
    private final JPanel panel;
    private int arraySize = 0;
    private final int[] array;
    private final int delay = 1;
    private int comIndex1 = -1;
    private int comIndex2 = -1;

    public Visualizer(JPanel panel) {
        this.panel = panel;
        arraySize = panel.getHeight();
        this.array = generateRandomArray(arraySize);
    }

    public void bubbleSort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                setCompareIndices(j, j + 1);
                Data.B_iterate++;

                if (array[j] > array[j + 1]) {
                    Data.B_swap++;

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    panel.repaint();
                    sleep(0);
                }
            }
        }
        
        Data.ITERATE_LABEL.setText("" + Data.B_iterate);
        Data.SWAP_LABEL.setText("" + Data.B_swap);
        visualizeSorted();
    }
    
    public void mergeSort() {
        mergeSort(0, array.length - 1);
        Data.ITERATE_LABEL.setText("" + Data.iterate);
        Data.SWAP_LABEL.setText("" + Data.swap);
        visualizeSorted();
    }

    private void mergeSort(int low, int high) {
        Data.iterate++;
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);

            updateCompareIndices(-1, -1);
            panel.repaint();
            sleep(delay);
        }
    }

    private void merge(int low, int mid, int high) {
        int[] temp = new int[array.length];
        System.arraycopy(array, 0, temp, 0, array.length);

        int i = low, j = mid + 1, k = low;
        Data.iterate++;
        while (i <= mid && j <= high) {
            setCompareIndices(i, j);
            Data.iterate++;
            if (temp[i] <= temp[j]) {
                Data.swap++;
                array[k++] = temp[i++];
            } else {
                Data.swap++;
                array[k++] = temp[j++];
            }
        }

        while (i <= mid) {
            Data.swap++;
            Data.iterate++;
            array[k++] = temp[i++];
        }

        updateCompareIndices(-1, -1);
    }
    
    public void quickSort() {
        quickSort(0, array.length - 1);
        Data.ITERATE_LABEL.setText("" + Data.iterate);
        Data.SWAP_LABEL.setText("" + Data.swap);
        visualizeSorted();
    }

    private void quickSort(int low, int high) {
        Data.iterate++;
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
            updateCompareIndices(-1, -1);
            panel.repaint();
            sleep(delay);
        }
    }

    private int partition(int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            setCompareIndices(j, high);
            Data.iterate++;
            if (array[j] <= pivot) {
                Data.swap++;
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        Data.swap++;
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        updateCompareIndices(-1, -1);

        return i + 1;
    }

    public void linearSearch(int target) {
        for (int i = 0; i < array.length; i++) {
            Data.iterate++;
            setCompareIndices(i, -1);
            if (array[i] == target) {
                Data.ITERATE_LABEL.setText("" + Data.iterate);
                Data.SWAP_LABEL.setText("" + Data.swap);
                showDialog(i, target);
                setCompareIndices(i, -1);
                return;
            }
        }

        Data.ITERATE_LABEL.setText("" + Data.iterate);
        Data.SWAP_LABEL.setText("" + Data.swap);
        javax.swing.JOptionPane.showMessageDialog(null, "Not found");
        setCompareIndices(-1, -1);
    }

    public void binarySearch(int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            Data.iterate++;
            int mid = (left + right) / 2;
            setSearchCompareIndices(mid, -1);
            if (array[mid] == target) {
                setSearchCompareIndices(mid, -1);
                Data.ITERATE_LABEL.setText("" + Data.iterate);
                Data.SWAP_LABEL.setText("" + Data.swap);
                showDialog(mid, target);
                return;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        Data.ITERATE_LABEL.setText("" + Data.iterate);
        Data.SWAP_LABEL.setText("" + Data.swap);
        javax.swing.JOptionPane.showMessageDialog(null, "Not found");
        setCompareIndices(-1, -1);
    }

    private int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size) + 1;
        }
        return arr;
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void updateCompareIndices(int index1, int index2) {
        this.comIndex1 = index1;
        this.comIndex2 = index2;
    }

    public void setCompareIndices(int index1, int index2) {
        updateCompareIndices(index1, index2);
        panel.repaint();
        sleep(delay);
    }

    public void setSearchCompareIndices(int index1, int index2) {
        updateCompareIndices(index1, index2);
        panel.repaint();
        sleep(250);
    }

    public boolean isRunning() {
        return comIndex1 != -1 && comIndex2 != -1;
    }
    
    public void paint(Graphics g) {
        g.setColor(panel.getBackground());
        g.fillRect(0, 0, panel.getWidth(), panel.getHeight());

        int barWidth = panel.getWidth() / array.length;
        for (int i = 0; i < array.length; i++) {
            int barHeight = array[i] * (panel.getHeight() / Arrays.stream(array).max().orElse(1));

            if (i == comIndex1 || i == comIndex2) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.CYAN);
            }

            g.fillRect(i * barWidth, panel.getHeight() - barHeight, barWidth, barHeight);
        }
    }

    public void visualizeSorted() {
        panel.repaint();
        Graphics g = panel.getGraphics();
        g.setColor(panel.getBackground());
        g.fillRect(0, 0, panel.getWidth(), panel.getHeight());

        int barWidth = panel.getWidth() / array.length;

        for (int i = 0; i < array.length; i++) {
            int barHeight = array[i] * (panel.getHeight() / Arrays.stream(array).max().orElse(1));

            g.setColor(Color.RED);
            sleep(2);
            g.setColor(Color.GREEN);

            g.fillRect(i * barWidth, panel.getHeight() - barHeight, barWidth, barHeight);
        }

        paintAllGreen(panel.getGraphics());
    }

    public void paintAllGreen(Graphics g) {
        g.setColor(panel.getBackground());
        g.fillRect(0, 0, panel.getWidth(), panel.getHeight());

        int barWidth = panel.getWidth() / array.length;

        for (int i = 0; i < array.length; i++) {
            int barHeight = array[i] * (panel.getHeight() / Arrays.stream(array).max().orElse(1));

            g.setColor(Color.GREEN);

            g.fillRect(i * barWidth, panel.getHeight() - barHeight, barWidth, barHeight);
        }
    }

    public int[] getArray() {
        return array;
    }

    public boolean isSorted() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public JPanel getPanel() {
        return panel;
    }

    private void showDialog(int index, int value) {
        javax.swing.JOptionPane.showMessageDialog(null, value + " found at index " + index);
    }

}