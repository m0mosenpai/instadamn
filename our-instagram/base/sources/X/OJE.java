package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class OJE {
    public final OLV A00;
    public final C54585O9m A01;
    public final C53759NqB A02;
    public final String A03;
    public final Collection A04;

    public OJE(OLV olv, C54585O9m c54585O9m, C53759NqB c53759NqB, String str, Collection collection) {
        C14360o3.A0B(str, 5);
        this.A01 = c54585O9m;
        this.A00 = olv;
        this.A04 = collection;
        this.A02 = c53759NqB;
        this.A03 = str;
    }

    public final void A00(String str) {
        try {
            C54585O9m c54585O9m = this.A01;
            OLV olv = this.A00;
            Iterator it = new C55097Ob8(olv, c54585O9m.A00, c54585O9m.A01, c54585O9m.A02).A01("", true).iterator();
            while (it.hasNext()) {
                olv.A00((C51673Ms4) it.next(), C05F.A02, null, str, null, null);
            }
        } catch (Throwable unused) {
        }
    }
}
