package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OOf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54870OOf {
    public static final List A01(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        ArrayList A0q = AbstractC167017dG.A0q(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C115475Kh A00 = A00(((C115475Kh) it.next()).A0E());
            A00.A0R = true;
            A0q.add(A00);
        }
        return A0q;
    }

    public static final C115475Kh A00(String str) {
        try {
            return AbstractC115465Kg.parseFromJson(C16V.A00(str));
        } catch (IOException unused) {
            throw new RuntimeException();
        }
    }
}
