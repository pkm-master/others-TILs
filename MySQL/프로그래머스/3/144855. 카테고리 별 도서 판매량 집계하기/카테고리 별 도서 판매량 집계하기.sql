# -- 코드를 입력하세요
# SELECT CATEGORY, SUM(PRICE) AS TOTAL_SALES FROM (SELECT CATEGORY, PRICE*SALES AS PRICE FROM (BOOK INNER JOIN (SELECT BOOK_ID, SUM(SALES) AS SALES FROM BOOK_SALES WHERE SALES_DATE>'2021-12-31' AND SALES_DATE <'2022-02-01' GROUP BY BOOK_ID)B ON BOOK.BOOK_ID = B.BOOK_ID) GROUP BY CATEGORY ORDER BY CATEGORY ;

SELECT CATEGORY, SUM(SALES) AS TOTAL_SALES FROM (SELECT CATEGORY, SALES AS SALES FROM BOOK INNER JOIN (SELECT BOOK_ID, SUM(SALES) AS SALES FROM BOOK_SALES WHERE SALES_DATE>'2021-12-31' AND SALES_DATE <'2022-02-01' GROUP BY BOOK_ID)A ON BOOK.BOOK_ID = A.BOOK_ID)B GROUP BY CATEGORY ORDER BY CATEGORY;




;