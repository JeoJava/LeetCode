package search;

import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/09/27 10:39
 * @Version 1.0
 * @Description:
 */
public abstract class BinSearch<T extends Comparable> {
     abstract int binSearch(T[]arr, T target);
}
