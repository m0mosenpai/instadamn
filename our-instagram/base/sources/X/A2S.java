package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class A2S {
    public static final List A00(String str) {
        if (str != null && str.length() != 0) {
            List A0m = AbstractC167007dF.A0m(str, " ", 0);
            ArrayList A0q = AbstractC167017dG.A0q(A0m);
            Iterator it = A0m.iterator();
            while (it.hasNext()) {
                A0q.add(Float.valueOf(Float.parseFloat(AbstractC166987dD.A1B(it))));
            }
            return AbstractC001800i.A0a(A0q);
        }
        return C16930sl.A00;
    }
}
