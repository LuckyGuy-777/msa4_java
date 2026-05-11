package com.msa4java.edu.generics;

import java.util.ArrayList;
import java.util.List;

// 제네릭스도, 여러개를 줄 수 있다.
// 약어 한글자를 쓴다.(이름은 크게 신경안써도됨)
public class Box3<T, S> {

    // 제네릭 타입 T를 쓰는 List
    public List<T> item = new ArrayList<>(10); // 문법상으로, 이쪽 <> 를 비워둬도 됨

    // 원하는 곳에, 제네릭타입을 가져와서 사용하면 됨
    public S test(S s) {
        return s;
    }
}
