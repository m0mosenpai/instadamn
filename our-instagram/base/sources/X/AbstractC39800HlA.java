package X;

import java.io.StringWriter;

/* renamed from: X.HlA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39800HlA {
    public static String A00(C32071E6x c32071E6x) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0S = AbstractC167007dF.A0S(A0O);
        A0S.A0Q("carousel_child_index", c32071E6x.A00);
        String str = c32071E6x.A01;
        if (str != null) {
            A0S.A0S("mentioned_child_id", str);
        }
        return AbstractC167017dG.A0l(A0S, A0O);
    }
}
