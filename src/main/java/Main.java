import builder.DataBaseQuery;

public class Main {

    public static void main(String[] args) {

        DataBaseQuery query = new DataBaseQuery.DataBaseQueryBuilder().
                where("employee")
                .limit("surname", "Морская")
                .and()
                .limit("name", "Мария")
                .and()
                .limit("patronic", "Васильевна")
                .build();
        System.out.println(query);

        DataBaseQuery dataBaseQuery = new DataBaseQuery.DataBaseQueryBuilder().
                where("employee")
                .like("surname","ов")
                .or()
                .limit("sex","женщина")
                .build();
        System.out.println(dataBaseQuery);
    }
}
