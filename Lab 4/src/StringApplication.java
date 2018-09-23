import java.util.Arrays;
import java.util.StringTokenizer;

class StringApplication {

	String[] Split(String str) {
		StringTokenizer st = new StringTokenizer(str,"#");
		int linecount = st.countTokens();
		String[][] lines = new String[linecount][];
		int wordcount = 0;
		for(int i=0; i<linecount; i++) {
			lines[i] = st.nextToken().split(" ");
			wordcount += lines[i].length;
		}
		String[] words = new String[wordcount];
		int j=0;
		for(int i=0; i<linecount ; i++) {
			for(int k=0; k<lines[i].length; k++) {
				if(lines[i][k].length()!=0) {
					words[j] = lines[i][k];
					j++;
				}
			}
		}
		return Arrays.copyOfRange(words, 0 , j);
	}
	
	String[] UniqueLabels(String words[]) {
		int labelcount = 0;
		boolean islabel[] = new boolean[words.length];
		for(int i=0;i<words.length;i++) {
			boolean flag = true;
			for(int k=0;k<i;k++) {
				if(words[i].toLowerCase().equals(words[k].toLowerCase())) flag = false;
			}
			if(flag) {
				labelcount++;
				islabel[i] = true;
			}
		}
		String[] labels = new String[labelcount];
		for(int i=0,j=0;i<islabel.length;i++) {
			if(islabel[i]) {
				labels[j]=words[i];
				j++;
			}
		}
		return labels;
	}
	
	int[] Count(String words[], String labels[]) {
		int count[] = new int[labels.length];
		for(int i=0; i<labels.length; i++) {
			for(int j=0;j<words.length;j++) {
				if(labels[i].toLowerCase().equals(words[j].toLowerCase())) count[i]++;
			}
		}
		return count;
	}
	
	void Display(int n, String labels[], int count[]) {
		for(int i=0;i<n;i++) {
			for(int j=labels.length-1;j>i;j--) {
				if(count[j]>count[j-1]) {
					int tempc = count[j-1];
					count[j-1] = count[j];
					count[j] = tempc;
					String templ = labels[j-1];
					labels[j-1] = labels[j];
					labels[j] = templ;
				}
			}
			System.out.println(labels[i]+"\t"+count[i]);
		}
	}
	
	public static void main(String[] args) {
		StringApplication app = new StringApplication();
		
		String str = "abc def# def ghi#abc def#ABC def#";
		
		String words[] = app.Split(str);
		for(int i=0; i<words.length;i++) {
			System.out.println(words[i]);
		}
		
		String labels[] = app.UniqueLabels(words);
		for(int i=0; i<labels.length;i++) {
			System.out.println(labels[i]);
		}
		
		int count[] = app.Count(words, labels);
		for(int i=0; i<count.length;i++) {
			System.out.println(labels[i]+'\t'+count[i]);
		}
		
		app.Display(2,labels,count);
	}

}
