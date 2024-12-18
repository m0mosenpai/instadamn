package X;

import android.view.View;

/* renamed from: X.G8x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36525G8x implements InterfaceC58152PqH {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    public C36525G8x(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A05 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A01 = i;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        if (this.A00 != 0) {
            C31338Dq3 c31338Dq3 = (C31338Dq3) this.A02;
            C5HW c5hw = (C5HW) this.A05;
            int i = this.A01;
            C31338Dq3.A04(c31338Dq3, c5hw, "delete_notification_undo_clicked", i);
            GKQ gkq = (GKQ) this.A04;
            if (!gkq.A01) {
                C31338Dq3.A0B.removeCallbacks(gkq);
            }
            C31338Dq3.A0B.removeCallbacks((Runnable) this.A03);
            c31338Dq3.A06.COe(c5hw, i);
            return;
        }
        C42657IuE c42657IuE = (C42657IuE) this.A05;
        c42657IuE.C9D().Dm3((C38321qM) this.A02, (C75113Zb) this.A03, null, true, false);
        c42657IuE.A01.A8q(this.A04, this.A01);
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
