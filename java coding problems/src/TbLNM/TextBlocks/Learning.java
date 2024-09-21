package TbLNM.TextBlocks;

import org.w3c.dom.ls.LSOutput;

public class Learning {
    public static void main(String[] args) {
        System.out.println("lets start");
        String sql =
                "UPDATE \"public\".\"office\"\n"
                        + "SET (\"address_first\", \"address_second\", \"phone\") =\n"
                        + " (SELECT \"public\".\"employee\".\"first_name\",\n"
                        + " \"public\".\"employee\".\"last_name\", ?\n"
                        + " FROM \"public\".\"employee\"\n"
                        + " WHERE \"public\".\"employee\".\"job_title\" = ?";
        System.out.println(sql);
    }
}
