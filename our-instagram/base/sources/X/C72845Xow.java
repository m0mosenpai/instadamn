package X;

import android.util.SparseBooleanArray;

/* renamed from: X.Xow, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72845Xow {
    public boolean A00;
    public final SparseBooleanArray A01 = new SparseBooleanArray();

    public final C72861XpN A00() {
        WDn.A02(!this.A00);
        this.A00 = true;
        return new C72861XpN(this.A01);
    }

    public final void A01(int i) {
        WDn.A02(!this.A00);
        this.A01.append(i, true);
    }
}
