public class StringOperations{
	public static void main(String[] args){
		String name = "Amarin";
		System.out.println(name);
		name = name.replace('A', 'A');
		name = name.replace('n', 'Z');
		System.out.println(name);
		String url = "www.gmail.com";
		System.out.println(url);
		String substring = new String(url.substring(2, 3));
		substring = substring.concat("1331");
		System.out.print(substring);
	}
}