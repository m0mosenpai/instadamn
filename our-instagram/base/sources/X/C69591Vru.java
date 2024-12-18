package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vru, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69591Vru {
    public C69305VlD A00;
    public String A01;
    public final List A02;
    public final List A03;

    public C69591Vru() {
        C16910sj c16910sj = C16910sj.A00;
        C16930sl c16930sl = C16930sl.A00;
        this.A02 = new ArrayList(c16910sj);
        this.A03 = new ArrayList(c16930sl);
        this.A00 = null;
        this.A01 = null;
    }

    public final ArrayList A00(C69786VvR c69786VvR) {
        ArrayList A12 = AbstractC166997dE.A12(c69786VvR, 0);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            A12.add(c69786VvR.A00((String) it.next()));
        }
        Collections.sort(A12);
        return A12;
    }
}
