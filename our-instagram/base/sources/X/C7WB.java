package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7WB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7WB implements C7WC {
    public C1577676k A00;
    public final List A01 = new ArrayList();

    @Override // X.C7WC
    public final void Dw6() {
        this.A00 = null;
    }

    @Override // X.C7WC
    public final void CzP(C1577676k c1577676k) {
        this.A00 = c1577676k;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C159437De.A02(((C7UF) it.next()).A00);
        }
    }
}
