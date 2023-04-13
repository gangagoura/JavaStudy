import java.io.*;
import java.util.*;

// practice with rainboy
public class JavaSort {
	static class S implements Comparable<S> {
		int id;
		String name;
		double gpa;
		S(int id, String name, double gpa) {
			this.id = id; this.name = name; this.gpa = gpa;
		}
		@Override public int compareTo(S s) {
			if (gpa != s.gpa)
				return gpa > s.gpa ? -1 : 1;
			if (!name.equals(s.name))
				return name.compareTo(s.name);
			return id - s.id;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine());
		S[] ss = new S[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int id = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			double gpa = Double.parseDouble(st.nextToken());
			ss[i] = new S(id, name, gpa);
		}
		Arrays.sort(ss);
		for (S s : ss)
			pw.println(s.name);
		pw.close();
	}
}
