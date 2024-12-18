package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9OP, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9OP {
    public static final List A00(Iterable iterable, List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            A0q.add(new C09530e4(obj, Integer.valueOf(i)));
            i = i2;
        }
        return AbstractC001800i.A0g(iterable, new C50585MUv(AbstractC06930Yk.A08(A0q), 6));
    }
}
