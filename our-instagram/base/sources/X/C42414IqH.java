package X;

import java.util.Iterator;

/* renamed from: X.IqH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42414IqH implements C7KY {
    public final /* synthetic */ C38P A00;

    public C42414IqH(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.C7KY
    public final void FAX(C120985dq c120985dq) {
        Object obj;
        C127935qM c127935qM;
        C38P c38p = this.A00;
        Iterator it = ((C38086GpF) c38p.A0q.getValue()).A01.A02.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            } else {
                obj = it.next();
            }
        } while (!(obj instanceof C127935qM));
        if ((obj instanceof C127935qM) && (c127935qM = (C127935qM) obj) != null) {
            C130535uy c130535uy = c127935qM.A01;
            C120985dq c120985dq2 = c130535uy.A04;
            if (c120985dq2 != null) {
                C15500q5.A00(c130535uy.A02()).remove(AbstractC128065qa.A00(c120985dq2));
            }
            c130535uy.A04 = c120985dq;
            C111034zF A00 = AbstractC128065qa.A00(c120985dq);
            if (A00 != null) {
                c130535uy.A02().add(c130535uy.A00, A00);
            }
            C65823Tug c65823Tug = c38p.A06;
            if (c65823Tug == null) {
                AbstractC37300Gc1.A0a();
                throw C00O.createAndThrow();
            }
            c65823Tug.A08(c130535uy.A0A);
        }
    }
}
