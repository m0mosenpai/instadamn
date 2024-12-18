package X;

import android.view.View;

/* renamed from: X.GsP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38280GsP extends AnonymousClass346 {
    public final C38321qM A00;

    public C38280GsP(C38321qM c38321qM) {
        this.A00 = c38321qM;
    }

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void DeT(View view, int i, Object obj, Object obj2) {
        AbstractC167017dG.A1R(obj, obj2);
        if ((obj instanceof C38321qM) && (obj2 instanceof C75113Zb) && ((C38321qM) obj).CdW()) {
            C38321qM c38321qM = this.A00;
            boolean z = true;
            if (c38321qM == null || !c38321qM.CdW() || c38321qM != obj) {
                z = false;
            }
            ((C75113Zb) obj2).A2s = z;
        }
    }
}
