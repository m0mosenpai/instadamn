package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kqx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47040Kqx {
    public static final Pair A00(List list) {
        C47712L4t c47712L4t;
        String str;
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AA7 aa7 = (AA7) it.next();
            AA8 aa8 = aa7.A00;
            if (aa8 != null && (c47712L4t = aa8.A02) != null && !AbstractC81033jX.A03(c47712L4t.A05)) {
                C47712L4t c47712L4t2 = aa8.A00;
                C14360o3.A07(c47712L4t2);
                C47712L4t c47712L4t3 = aa8.A01;
                C14360o3.A07(c47712L4t3);
                C47712L4t c47712L4t4 = aa8.A02;
                C14360o3.A07(c47712L4t4);
                String A0R = AnonymousClass001.A0R("gif_", aa7.A05);
                String str2 = aa7.A06;
                A7Q a7q = aa7.A02;
                if (c47712L4t2.A01 > 0.0f && c47712L4t2.A00 > 0.0f) {
                    float f = c47712L4t3.A01;
                    if (f > 0.0f) {
                        float f2 = c47712L4t3.A00;
                        if (f2 > 0.0f && c47712L4t4.A01 > 0.0f && c47712L4t4.A00 > 0.0f) {
                            C148286ly A00 = C148286ly.A00(c47712L4t3.A05, A0R, A0R, f, f2, 0.4f);
                            A00.A0g = str2;
                            C148286ly A002 = C148286ly.A00(c47712L4t2.A05, A0R, A0R, c47712L4t2.A01, c47712L4t2.A00, 0.4f);
                            A002.A0g = str2;
                            C148286ly A003 = C148286ly.A00(c47712L4t4.A05, A0R, A0R, c47712L4t4.A01, c47712L4t4.A00, 0.4f);
                            A003.A0g = str2;
                            A002.A0I = A003;
                            C148276lx c148276lx = C148276lx.A1d;
                            C148276lx A05 = AbstractC148296lz.A05(A002, A0R);
                            C148276lx A052 = AbstractC148296lz.A05(A00, A0R);
                            if (a7q != null) {
                                str = a7q.A00;
                            } else {
                                str = null;
                            }
                            A12.add(new KNF(A05, str));
                            A1E.add(A052);
                        }
                    }
                }
            }
        }
        return new Pair(A12, A1E);
    }
}
