package X;

import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WQY implements C3M6 {
    public final /* synthetic */ C68741VbK A00;
    public final /* synthetic */ C69348Vlu A01;

    public WQY(C68741VbK c68741VbK, C69348Vlu c69348Vlu) {
        this.A00 = c68741VbK;
        this.A01 = c69348Vlu;
    }

    @Override // X.C3M6
    public final void Cwa(AbstractC65716Tsp abstractC65716Tsp, float f, float f2, boolean z) {
        ArrayList arrayList = abstractC65716Tsp.A0A;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        C68741VbK c68741VbK = this.A00;
        C69348Vlu c69348Vlu = this.A01;
        C3OO c3oo = c69348Vlu.A04;
        boolean z2 = c69348Vlu.A05;
        U7P u7p = c68741VbK.A00;
        u7p.A00.remove(c3oo);
        if (z2) {
            u7p.A0O(c3oo);
        } else {
            u7p.A0Q(c3oo);
        }
        if (!u7p.A0L()) {
            u7p.A0A();
        }
    }
}
