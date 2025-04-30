package com.jbk;

import java.util.Scanner;

public class ArtistMain {
	public static void main(String[] args) {
		ArtistDao artistdao=new ArtistDao();
		Scanner sc=new Scanner (System.in);
		System.out.println("enter choice: ");
		int choice =sc.nextInt();
		
		switch(choice) {
		
		case 1:System.out.println("enter artist id,age and name: ");
		    Artist artist=new Artist(sc.nextInt(),sc.nextInt(),sc.next());
		    artistdao.insertArtist(artist);
		    break;
		}
	}

}
