package test01;

class Movie{
	
	private String title,director,actors;
	private int year;
	private double score;
	
	public Movie(String title,String director,int year,String actors,double score) {
		this.title=title;
		this.director=director;
		this.year=year;
		this.actors=actors;
		this.score=score;
	}
	
	@Override
	public String toString() {
		return "제목: "+title+'\n'+
				"감독: "+director+'\n'+
				"연도: "+year+'\n'+
				"주연배우: "+actors+'\n'+
				"평점: "+score;
	}
	
}

public class T14{
	public static void main(String[] args) {
		Movie m = new Movie("티파니에서 아침을","블레이크 에드워즈",1962,"오드리 헵번",8.43);
		System.out.println(m.toString());
	}
	
}

