package X;

import android.view.View;

/* renamed from: X.GeG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37436GeG extends AnonymousClass346 {
    public final HY4 A00;

    public C37436GeG(HY4 hy4) {
        this.A00 = hy4;
    }

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void DeT(View view, int i, Object obj, Object obj2) {
        C3XG A01;
        C38321qM A0E;
        C3XG A012;
        C38321qM A0E2;
        AbstractC167017dG.A1R(obj, obj2);
        if ((obj instanceof C38321qM) && (obj2 instanceof C75113Zb) && ((C38321qM) obj).CdW()) {
            C75113Zb c75113Zb = (C75113Zb) obj2;
            int position = c75113Zb.getPosition();
            int i2 = position - 1;
            String str = null;
            if (i2 >= 0) {
                HY4 hy4 = this.A00;
                if (i2 < hy4.getItemCount() && (A012 = hy4.A01(i2)) != null && (A0E2 = AbstractC37300Gc1.A0E(A012)) != null) {
                    str = A0E2.getId();
                }
            }
            int i3 = position + 1;
            String str2 = null;
            if (i3 >= 0) {
                HY4 hy42 = this.A00;
                if (i3 < hy42.getItemCount() && (A01 = hy42.A01(i3)) != null && (A0E = AbstractC37300Gc1.A0E(A01)) != null) {
                    str2 = A0E.getId();
                }
            }
            c75113Zb.A1R = str;
            c75113Zb.A1N = str2;
        }
    }
}
