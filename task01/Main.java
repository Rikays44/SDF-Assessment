package src.sdf.task01;
import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static int COL_APP = 0;
    public static int COL_CATEGORY = 1;
    public static int COL_RATING = 2;


    public static void main(String[] args) throws Exception {
        try (FileReader fr = new FileReader(args[0])) {
            BufferedReader br = new BufferedReader(fr);
            Map<Integer, List<Playstore>> cat = br.lines()
               .skip(1)
               .map(line -> line.trim())
               .map(columns -> new Playstore(columns[COL_APP]
                  , columns[COL_CATEGORY]
                  , columns[COL_RATING])
        ).collect(Collectors.groupingBy( ->{               
                  }));                  
                  }
                  }
                  }

