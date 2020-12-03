import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Panel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class complexity extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					complexity frame = new complexity();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public complexity() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1025, 718);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel tc = new JLabel("Time Complexity:");
		tc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tc.setBounds(49, 177, 146, 34);
		contentPane.add(tc);
		
		JLabel space = new JLabel("Space Complexity:");
		space.setFont(new Font("Tahoma", Font.PLAIN, 18));
		space.setBounds(49, 428, 155, 34);
		contentPane.add(space);
		
		JLabel lblBestCase = new JLabel("Best Case:");
		lblBestCase.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBestCase.setBounds(20, 239, 146, 34);
		contentPane.add(lblBestCase);
		
		JLabel tc_1_1 = new JLabel("Average Case:");
		tc_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tc_1_1.setBounds(20, 295, 146, 34);
		contentPane.add(tc_1_1);
		
		JLabel tc_1_2 = new JLabel("Worst Case");
		tc_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tc_1_2.setBounds(20, 351, 146, 34);
		contentPane.add(tc_1_2);
		
		JLabel tbc = new JLabel("");
		tbc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tbc.setBounds(187, 239, 146, 34);
		contentPane.add(tbc);
		
		JLabel tac = new JLabel("");
		tac.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tac.setBounds(187, 295, 146, 34);
		contentPane.add(tac);
		
		Panel panel = new Panel();
		panel.setBounds(479, 120, 522, 551);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 522, 551);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		JLabel twc = new JLabel("");
		twc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		twc.setBounds(187, 351, 146, 34);
		contentPane.add(twc);
		
		JLabel sc = new JLabel("");
		sc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sc.setBounds(214, 428, 146, 34);
		contentPane.add(sc);

		JComboBox comboBox=new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedItem().equals("Selection Sort")) {
					tbc.setText("O(n^2)");
					tac.setText("O(n^2)");
					twc.setText("O(n^2)");
					sc.setText("O(1)");
					textArea.setText("void sort(int arr[]) \r\n" + 
							"    { \r\n" + 
							"        int n = arr.length; \r\n" + 
							"  \r\n" + 
							"        // One by one move boundary of unsorted subarray \r\n" + 
							"        for (int i = 0; i < n-1; i++) \r\n" + 
							"        { \r\n" + 
							"            // Find the minimum element in unsorted array \r\n" + 
							"            int min_idx = i; \r\n" + 
							"            for (int j = i+1; j < n; j++) \r\n" + 
							"                if (arr[j] < arr[min_idx]) \r\n" + 
							"                    min_idx = j; \r\n" + 
							"  \r\n" + 
							"            // Swap the found minimum element with the first \r\n" + 
							"            // element \r\n" + 
							"            int temp = arr[min_idx]; \r\n" + 
							"            arr[min_idx] = arr[i]; \r\n" + 
							"            arr[i] = temp; \r\n" + 
							"        } \r\n" + 
							"    } ");
				}
				if(comboBox.getSelectedItem().equals("Bubble Sort")) {
					tbc.setText("O(n)");
					tac.setText("O(n^2)");
					twc.setText("O(n^2)");
					sc.setText("O(1)");
					textArea.setText("void bubbleSort(int arr[]) \r\n" + 
							"    { \r\n" + 
							"        int n = arr.length; \r\n" + 
							"        for (int i = 0; i < n-1; i++) \r\n" + 
							"            for (int j = 0; j < n-i-1; j++) \r\n" + 
							"                if (arr[j] > arr[j+1]) \r\n" + 
							"                { \r\n" + 
							"                    // swap arr[j+1] and arr[j] \r\n" + 
							"                    int temp = arr[j]; \r\n" + 
							"                    arr[j] = arr[j+1]; \r\n" + 
							"                    arr[j+1] = temp; \r\n" + 
							"                } \r\n" + 
							"    } ");
				}
				if(comboBox.getSelectedItem().equals("Insertion Sort")) {
					tbc.setText("O(n)");
					tac.setText("O(n^2)");
					twc.setText("O(n^2)");
					sc.setText("O(1)");
					textArea.setText("void sort(int arr[]) \r\n" + 
							"    { \r\n" + 
							"        int n = arr.length; \r\n" + 
							"        for (int i = 1; i < n; ++i) { \r\n" + 
							"            int key = arr[i]; \r\n" + 
							"            int j = i - 1; \r\n" + 
							"  \r\n" + 
							"            /* Move elements of arr[0..i-1], that are \r\n" + 
							"               greater than key, to one position ahead \r\n" + 
							"               of their current position */\r\n" + 
							"            while (j >= 0 && arr[j] > key) { \r\n" + 
							"                arr[j + 1] = arr[j]; \r\n" + 
							"                j = j - 1; \r\n" + 
							"            } \r\n" + 
							"            arr[j + 1] = key; \r\n" + 
							"        } \r\n" + 
							"    }");
				}
				if(comboBox.getSelectedItem().equals("Merge Sort")) {
					tbc.setText("O(nlogn)");
					tac.setText("O(nlogn)");
					twc.setText("O(nlogn)");
					sc.setText("O(n)");
					textArea.setText("void merge(int arr[], int l, int m, int r)\r\n" + 
							"    {\r\n" + 
							"        // Find sizes of two subarrays to be merged\r\n" + 
							"        int n1 = m - l + 1;\r\n" + 
							"        int n2 = r - m;\r\n" + 
							" \r\n" + 
							"        /* Create temp arrays */\r\n" + 
							"        int L[] = new int[n1];\r\n" + 
							"        int R[] = new int[n2];\r\n" + 
							" \r\n" + 
							"        /*Copy data to temp arrays*/\r\n" + 
							"        for (int i = 0; i < n1; ++i)\r\n" + 
							"            L[i] = arr[l + i];\r\n" + 
							"        for (int j = 0; j < n2; ++j)\r\n" + 
							"            R[j] = arr[m + 1 + j];\r\n" + 
							" \r\n" + 
							"        /* Merge the temp arrays */\r\n" + 
							" \r\n" + 
							"        // Initial indexes of first and second subarrays\r\n" + 
							"        int i = 0, j = 0;\r\n" + 
							" \r\n" + 
							"        // Initial index of merged subarry array\r\n" + 
							"        int k = l;\r\n" + 
							"        while (i < n1 && j < n2) {\r\n" + 
							"            if (L[i] <= R[j]) {\r\n" + 
							"                arr[k] = L[i];\r\n" + 
							"                i++;\r\n" + 
							"            }\r\n" + 
							"            else {\r\n" + 
							"                arr[k] = R[j];\r\n" + 
							"                j++;\r\n" + 
							"            }\r\n" + 
							"            k++;\r\n" + 
							"        }\r\n" + 
							" \r\n" + 
							"        /* Copy remaining elements of L[] if any */\r\n" + 
							"        while (i < n1) {\r\n" + 
							"            arr[k] = L[i];\r\n" + 
							"            i++;\r\n" + 
							"            k++;\r\n" + 
							"        }\r\n" + 
							" \r\n" + 
							"        /* Copy remaining elements of R[] if any */\r\n" + 
							"        while (j < n2) {\r\n" + 
							"            arr[k] = R[j];\r\n" + 
							"            j++;\r\n" + 
							"            k++;\r\n" + 
							"        }\r\n" + 
							"    }");
				}
				if(comboBox.getSelectedItem().equals("Quick Sort")) {
					tbc.setText("O(nlogn)");
					tac.setText("O(nlogn)");
					twc.setText("O(n^2)");
					sc.setText("O(n)");
					textArea.setText("int partition(int arr[], int low, int high) \r\n" + 
							"    { \r\n" + 
							"        int pivot = arr[high];  \r\n" + 
							"        int i = (low-1); // index of smaller element \r\n" + 
							"        for (int j=low; j<high; j++) \r\n" + 
							"        { \r\n" + 
							"            // If current element is smaller than the pivot \r\n" + 
							"            if (arr[j] < pivot) \r\n" + 
							"            { \r\n" + 
							"                i++; \r\n" + 
							"  \r\n" + 
							"                // swap arr[i] and arr[j] \r\n" + 
							"                int temp = arr[i]; \r\n" + 
							"                arr[i] = arr[j]; \r\n" + 
							"                arr[j] = temp; \r\n" + 
							"            } \r\n" + 
							"        } \r\n" + 
							"  \r\n" + 
							"        // swap arr[i+1] and arr[high] (or pivot) \r\n" + 
							"        int temp = arr[i+1]; \r\n" + 
							"        arr[i+1] = arr[high]; \r\n" + 
							"        arr[high] = temp; \r\n" + 
							"  \r\n" + 
							"        return i+1; \r\n" + 
							"    } \r\n" + 
							"  \r\n" + 
							"  \r\n" + 
							"    /* The main function that implements QuickSort() \r\n" + 
							"      arr[] --> Array to be sorted, \r\n" + 
							"      low  --> Starting index, \r\n" + 
							"      high  --> Ending index */\r\n" + 
							"    void sort(int arr[], int low, int high) \r\n" + 
							"    { \r\n" + 
							"        if (low < high) \r\n" + 
							"        { \r\n" + 
							"            /* pi is partitioning index, arr[pi] is  \r\n" + 
							"              now at right place */\r\n" + 
							"            int pi = partition(arr, low, high); \r\n" + 
							"  \r\n" + 
							"            // Recursively sort elements before \r\n" + 
							"            // partition and after partition \r\n" + 
							"            sort(arr, low, pi-1); \r\n" + 
							"            sort(arr, pi+1, high); \r\n" + 
							"        } \r\n" + 
							"    } ");
				}
				if(comboBox.getSelectedItem().equals("Heap Sort")) {
					tbc.setText("O(nlogn)");
					tac.setText("O(nlogn)");
					twc.setText("O(nlogn)");
					sc.setText("O(1)");
					textArea.setText("public void sort(int arr[])\r\n" + 
							"    {\r\n" + 
							"        int n = arr.length;\r\n" + 
							" \r\n" + 
							"        // Build heap (rearrange array)\r\n" + 
							"        for (int i = n / 2 - 1; i >= 0; i--)\r\n" + 
							"            heapify(arr, n, i);\r\n" + 
							" \r\n" + 
							"        // One by one extract an element from heap\r\n" + 
							"        for (int i = n - 1; i > 0; i--) {\r\n" + 
							"            // Move current root to end\r\n" + 
							"            int temp = arr[0];\r\n" + 
							"            arr[0] = arr[i];\r\n" + 
							"            arr[i] = temp;\r\n" + 
							" \r\n" + 
							"            // call max heapify on the reduced heap\r\n" + 
							"            heapify(arr, i, 0);\r\n" + 
							"        }\r\n" + 
							"    }\r\n" + 
							" \r\n" + 
							"    // To heapify a subtree rooted with node i which is\r\n" + 
							"    // an index in arr[]. n is size of heap\r\n" + 
							"    void heapify(int arr[], int n, int i)\r\n" + 
							"    {\r\n" + 
							"        int largest = i; // Initialize largest as root\r\n" + 
							"        int l = 2 * i + 1; // left = 2*i + 1\r\n" + 
							"        int r = 2 * i + 2; // right = 2*i + 2\r\n" + 
							" \r\n" + 
							"        // If left child is larger than root\r\n" + 
							"        if (l < n && arr[l] > arr[largest])\r\n" + 
							"            largest = l;\r\n" + 
							" \r\n" + 
							"        // If right child is larger than largest so far\r\n" + 
							"        if (r < n && arr[r] > arr[largest])\r\n" + 
							"            largest = r;\r\n" + 
							" \r\n" + 
							"        // If largest is not root\r\n" + 
							"        if (largest != i) {\r\n" + 
							"            int swap = arr[i];\r\n" + 
							"            arr[i] = arr[largest];\r\n" + 
							"            arr[largest] = swap;\r\n" + 
							" \r\n" + 
							"            // Recursively heapify the affected sub-tree\r\n" + 
							"            heapify(arr, n, largest);\r\n" + 
							"        }\r\n" + 
							"    }");
				}
				if(comboBox.getSelectedItem().equals("Counting Sort")) {
					tbc.setText("O(n+k)");
					tac.setText("O(n+k)");
					twc.setText("O(n+k)");
					sc.setText("O(k)");
					textArea.setText(" void sort(char arr[]) \r\n" + 
							"    { \r\n" + 
							"        int n = arr.length; \r\n" + 
							"  \r\n" + 
							"        // The output character array that will have sorted arr \r\n" + 
							"        char output[] = new char[n]; \r\n" + 
							"  \r\n" + 
							"        // Create a count array to store count of inidividul \r\n" + 
							"        // characters and initialize count array as 0 \r\n" + 
							"        int count[] = new int[256]; \r\n" + 
							"        for (int i = 0; i < 256; ++i) \r\n" + 
							"            count[i] = 0; \r\n" + 
							"  \r\n" + 
							"        // store count of each character \r\n" + 
							"        for (int i = 0; i < n; ++i) \r\n" + 
							"            ++count[arr[i]]; \r\n" + 
							"  \r\n" + 
							"        // Change count[i] so that count[i] now contains actual \r\n" + 
							"        // position of this character in output array \r\n" + 
							"        for (int i = 1; i <= 255; ++i) \r\n" + 
							"            count[i] += count[i - 1]; \r\n" + 
							"  \r\n" + 
							"        // Build the output character array \r\n" + 
							"        // To make it stable we are operating in reverse order. \r\n" + 
							"        for (int i = n - 1; i >= 0; i--) { \r\n" + 
							"            output[count[arr[i]] - 1] = arr[i]; \r\n" + 
							"            --count[arr[i]]; \r\n" + 
							"        } \r\n" + 
							"  \r\n" + 
							"        // Copy the output array to arr, so that arr now \r\n" + 
							"        // contains sorted characters \r\n" + 
							"        for (int i = 0; i < n; ++i) \r\n" + 
							"            arr[i] = output[i]; \r\n" + 
							"    }");
				}
				if(comboBox.getSelectedItem().equals("Bucket Sort")) {
					tbc.setText("O(n+k)");
					tac.setText("O(n+k)");
					twc.setText("O(n^2)");
					sc.setText("O(nk)");
					textArea.setText(" static void bucketSort(float arr[], int n) \r\n" + 
							"    { \r\n" + 
							"        if (n <= 0) \r\n" + 
							"            return; \r\n" + 
							"  \r\n" + 
							"        // 1) Create n empty buckets \r\n" + 
							"        @SuppressWarnings(\"unchecked\") \r\n" + 
							"        Vector<Float>[] buckets = new Vector[n]; \r\n" + 
							"  \r\n" + 
							"        for (int i = 0; i < n; i++) { \r\n" + 
							"            buckets[i] = new Vector<Float>(); \r\n" + 
							"        } \r\n" + 
							"  \r\n" + 
							"        // 2) Put array elements in different buckets \r\n" + 
							"        for (int i = 0; i < n; i++) { \r\n" + 
							"            float idx = arr[i] * n; \r\n" + 
							"            buckets[(int)idx].add(arr[i]); \r\n" + 
							"        } \r\n" + 
							"  \r\n" + 
							"        // 3) Sort individual buckets \r\n" + 
							"        for (int i = 0; i < n; i++) { \r\n" + 
							"            Collections.sort(buckets[i]); \r\n" + 
							"        } \r\n" + 
							"  \r\n" + 
							"        // 4) Concatenate all buckets into arr[] \r\n" + 
							"        int index = 0; \r\n" + 
							"        for (int i = 0; i < n; i++) { \r\n" + 
							"            for (int j = 0; j < buckets[i].size(); j++) { \r\n" + 
							"                arr[index++] = buckets[i].get(j); \r\n" + 
							"            } \r\n" + 
							"        } \r\n" + 
							"    } ");
				}
				if(comboBox.getSelectedItem().equals("Linear Search")) {
					tbc.setText("O(1)");
					tac.setText("O(n/2)");
					twc.setText("O(n)");
					sc.setText("O(1)");
					textArea.setText(" public static int search(int arr[], int x)\r\n" + 
							"    {\r\n" + 
							"        int n = arr.length;\r\n" + 
							"        for (int i = 0; i < n; i++) \r\n" + 
							"        {\r\n" + 
							"            if (arr[i] == x)\r\n" + 
							"                return i;\r\n" + 
							"        }\r\n" + 
							"        return -1;\r\n" + 
							"    }");
				}
				if(comboBox.getSelectedItem().equals("Binary Search")) {
					tbc.setText("O(1)");
					tac.setText("O(logn)");
					twc.setText("O(logn)");
					sc.setText("O(1)");
					textArea.setText("int binarySearch(int arr[], int l, int r, int x) \r\n" + 
							"    { \r\n" + 
							"        if (r >= l) { \r\n" + 
							"            int mid = l + (r - l) / 2; \r\n" + 
							"  \r\n" + 
							"            // If the element is present at the \r\n" + 
							"            // middle itself \r\n" + 
							"            if (arr[mid] == x) \r\n" + 
							"                return mid; \r\n" + 
							"  \r\n" + 
							"            // If element is smaller than mid, then \r\n" + 
							"            // it can only be present in left subarray \r\n" + 
							"            if (arr[mid] > x) \r\n" + 
							"                return binarySearch(arr, l, mid - 1, x); \r\n" + 
							"  \r\n" + 
							"            // Else the element can only be present \r\n" + 
							"            // in right subarray \r\n" + 
							"            return binarySearch(arr, mid + 1, r, x); \r\n" + 
							"        } \r\n" + 
							"  \r\n" + 
							"        // We reach here when element is not present \r\n" + 
							"        // in array \r\n" + 
							"        return -1; \r\n" + 
							"    }");
				}
				if(comboBox.getSelectedItem().equals("Jump Search")) {
					tbc.setText("O(1)");
					tac.setText("O(n^(1/2))");
					twc.setText("O(n^(1/2))");
					sc.setText("O(1)");
					textArea.setText("  public static int jumpSearch(int[] arr, int x) \r\n" + 
							"    { \r\n" + 
							"        int n = arr.length; \r\n" + 
							"  \r\n" + 
							"        // Finding block size to be jumped \r\n" + 
							"        int step = (int)Math.floor(Math.sqrt(n)); \r\n" + 
							"  \r\n" + 
							"        // Finding the block where element is \r\n" + 
							"        // present (if it is present) \r\n" + 
							"        int prev = 0; \r\n" + 
							"        while (arr[Math.min(step, n)-1] < x) \r\n" + 
							"        { \r\n" + 
							"            prev = step; \r\n" + 
							"            step += (int)Math.floor(Math.sqrt(n)); \r\n" + 
							"            if (prev >= n) \r\n" + 
							"                return -1; \r\n" + 
							"        } \r\n" + 
							"  \r\n" + 
							"        // Doing a linear search for x in block \r\n" + 
							"        // beginning with prev. \r\n" + 
							"        while (arr[prev] < x) \r\n" + 
							"        { \r\n" + 
							"            prev++; \r\n" + 
							"  \r\n" + 
							"            // If we reached next block or end of \r\n" + 
							"            // array, element is not present. \r\n" + 
							"            if (prev == Math.min(step, n)) \r\n" + 
							"                return -1; \r\n" + 
							"        } \r\n" + 
							"  \r\n" + 
							"        // If element is found \r\n" + 
							"        if (arr[prev] == x) \r\n" + 
							"            return prev; \r\n" + 
							"  \r\n" + 
							"        return -1; \r\n" + 
							"    }");
				}
				if(comboBox.getSelectedItem().equals("Interpolation Search")) {
					tbc.setText("O(1)");
					tac.setText("O(log(log(n))");
					twc.setText("O(n)");
					sc.setText("O(1)");
					textArea.setText(" public static int interpolationSearch(int arr[], int lo,\r\n" + 
							"                                          int hi, int x)\r\n" + 
							"    {\r\n" + 
							"        int pos;\r\n" + 
							" \r\n" + 
							"        // Since array is sorted, an element\r\n" + 
							"        // present in array must be in range\r\n" + 
							"        // defined by corner\r\n" + 
							"        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {\r\n" + 
							" \r\n" + 
							"            // Probing the position with keeping\r\n" + 
							"            // uniform distribution in mind.\r\n" + 
							"            pos = lo\r\n" + 
							"                  + (((hi - lo) / (arr[hi] - arr[lo]))\r\n" + 
							"                     * (x - arr[lo]));\r\n" + 
							" \r\n" + 
							"            // Condition of target found\r\n" + 
							"            if (arr[pos] == x)\r\n" + 
							"                return pos;\r\n" + 
							" \r\n" + 
							"            // If x is larger, x is in right sub array\r\n" + 
							"            if (arr[pos] < x)\r\n" + 
							"                return interpolationSearch(arr, pos + 1, hi,\r\n" + 
							"                                           x);\r\n" + 
							" \r\n" + 
							"            // If x is smaller, x is in left sub array\r\n" + 
							"            if (arr[pos] > x)\r\n" + 
							"                return interpolationSearch(arr, lo, pos - 1,\r\n" + 
							"                                           x);\r\n" + 
							"        }\r\n" + 
							"        return -1;\r\n" + 
							"    }");
				}
				if(comboBox.getSelectedItem().equals("Exponential Search")) {
					tbc.setText("O(n^2)");
					tac.setText("O(log(n))");
					twc.setText("O(log(n))");
					sc.setText("O(1)");
					textArea.setText("static int exponentialSearch(int arr[],\r\n" + 
							"                                 int n, int x)\r\n" + 
							"    {\r\n" + 
							"        // If x is present at firt location itself\r\n" + 
							"        if (arr[0] == x)\r\n" + 
							"            return 0;\r\n" + 
							"     \r\n" + 
							"        // Find range for binary search by\r\n" + 
							"        // repeated doubling\r\n" + 
							"        int i = 1;\r\n" + 
							"        while (i < n && arr[i] <= x)\r\n" + 
							"            i = i*2;\r\n" + 
							"     \r\n" + 
							"        // Call binary search for the found range.\r\n" + 
							"        return Arrays.binarySearch(arr, i/2, \r\n" + 
							"                              Math.min(i, n-1), x);\r\n" + 
							"    }");
				}
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"","Selection Sort", "Bubble Sort", "Insertion Sort", "Merge Sort", "Quick Sort", "Heap Sort", "Counting Sort", "Bucket Sort", "Linear Search", "Binary Search", "Jump Search", "Interpolation Search", "Exponential Search"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setBounds(202, 102, 172, 34);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Sorting and Searching");
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(372, 10, 270, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblAlgorithm = new JLabel("Algorithm:");
		lblAlgorithm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAlgorithm.setBounds(479, 77, 146, 34);
		contentPane.add(lblAlgorithm);
		
		JLabel lblSelectSortsearchAlgo = new JLabel("Select sort/search Algo:");
		lblSelectSortsearchAlgo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelectSortsearchAlgo.setBounds(10, 102, 192, 34);
		contentPane.add(lblSelectSortsearchAlgo);
		
				
	}
}
