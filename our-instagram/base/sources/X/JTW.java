package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class JTW implements InterfaceC163207Sf {
    public final /* synthetic */ C1585479p A00;

    public JTW(C1585479p c1585479p) {
        this.A00 = c1585479p;
    }

    @Override // X.InterfaceC163207Sf
    public final void E29(float f, float f2) {
        C1585479p c1585479p = this.A00;
        View BKF = ((AbstractC1585579q) c1585479p).A01.BKF();
        if (BKF != null) {
            BKF.setTranslationX(f2);
        }
        C7SB c7sb = c1585479p.A05;
        if (c7sb != null) {
            c7sb.A01(f2);
        }
    }
}
