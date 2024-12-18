package X;

import android.view.View;

/* renamed from: X.G8z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36527G8z implements InterfaceC58152PqH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C9CK A01;
    public final /* synthetic */ GKQ A02;
    public final /* synthetic */ C31338Dq3 A03;
    public final /* synthetic */ C5HW A04;
    public final /* synthetic */ boolean A05;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36527G8z(C9CK c9ck, GKQ gkq, C31338Dq3 c31338Dq3, C5HW c5hw, int i, boolean z) {
        this.A03 = c31338Dq3;
        this.A04 = c5hw;
        this.A01 = c9ck;
        this.A02 = gkq;
        this.A05 = z;
        this.A00 = i;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C31338Dq3 c31338Dq3 = this.A03;
        int i = C31338Dq3.A0A;
        C31345DqA c31345DqA = c31338Dq3.A07;
        C5HW c5hw = this.A04;
        int i2 = c5hw.A00;
        C9CK c9ck = this.A01;
        String str = c9ck.A02;
        C14360o3.A0B(str, 1);
        c31345DqA.A00.remove(AnonymousClass001.A0H(str, ':', i2));
        GKQ gkq = this.A02;
        if (!gkq.A01) {
            C31338Dq3.A0B.removeCallbacks(gkq);
        }
        if (this.A05) {
            c31338Dq3.A06.COe(c5hw, this.A00);
        }
        C31338Dq3.A04(c31338Dq3, c5hw, AnonymousClass001.A0R(c9ck.A02, "_undo"), this.A00);
    }
}
