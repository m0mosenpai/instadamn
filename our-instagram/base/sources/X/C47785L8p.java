package X;

import android.view.View;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.L8p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47785L8p {
    public final C57112jm A00;
    public final C48569Le6 A01;
    public final HashSet A02 = AbstractC166987dD.A1H();

    public final void A00() {
        HashSet hashSet = this.A02;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.A00.A04(AbstractC43592JPx.A09(it));
        }
        hashSet.clear();
    }

    public final void A01(View view, OKu oKu) {
        C59072n8 A00 = C59062n7.A00(oKu, null, oKu.A02);
        if (oKu.A03) {
            this.A02.add(view);
            A00.A00(this.A01);
            AbstractC25227BEk.A10(view, A00, this.A00);
        }
    }

    public C47785L8p(C57112jm c57112jm, C55123Obk c55123Obk) {
        this.A00 = c57112jm;
        this.A01 = new C48569Le6(c55123Obk);
    }
}
