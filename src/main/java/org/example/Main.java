package org.example;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Article> articleList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int id = 1;
        System.out.println("==기사==");

        while (true) {
            System.out.println("명령");
            String article = sc.nextLine();
            if (article.equals("종료")) {
                break;
            } else if (article.equals("등록")) {
                System.out.println("내용: ");
                String content = sc.nextLine();
                System.out.println("제목: ");
                String title = sc.nextLine();
                Article article1 = new Article(id, content, title);
                articleList.add(article1);
                id++;
            } else if (article.equals("목록")) {
                System.out.println("목록을 입력해 주세요.");
                System.out.println("---------------");
                for (Article article2 : articleList)
                    System.out.println(article2.getId() + article2.getContent() + article2.getTitle());
            } else if (article.equals("삭제")) {
                System.out.println("삭제할 값을 입력해 주세요: ");
                int deleteId = Integer.parseInt(sc.nextLine());
                for (int j = 0; j < articleList.size(); j++) {
                    if (articleList.get(j).getId() == deleteId) {
                        Article article3 = articleList.get(j);
                        articleList.remove(deleteId);
                    }
                }
                System.out.println(deleteId + "의 값을 삭제합니다.");
            } else if (article.equals("수정")) {
                System.out.println("수정할 값을 입력해주세요: ");
                int modifyId = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < articleList.size(); i++) {
                    if (articleList.get(i).getId() == modifyId) {
                        Article article4 = articleList.get(i);
                        System.out.printf("기존내용: %s \n", article4.getContent());
                        String content = sc.nextLine();
                        article4.setContent(content);

                        Article article5 = articleList.get(i);
                        System.out.printf("기존제목: %s \n", article4.getTitle());
                        String title = sc.nextLine();
                        article4.setTitle(title);

                    }
                    System.out.println(modifyId + "번 값을 출력합니다.");
                }
            }
        }

        sc.close();
    }
}