package X;

import android.widget.FrameLayout;

/* renamed from: X.Lus, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49539Lus implements InterfaceC65982ya {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ JV2 A01;
    public final /* synthetic */ C129565tL A02;
    public final /* synthetic */ C47Z A03;

    public C49539Lus(InterfaceC11380iw interfaceC11380iw, JV2 jv2, C129565tL c129565tL, C47Z c47z) {
        this.A01 = jv2;
        this.A03 = c47z;
        this.A02 = c129565tL;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        JV2 jv2 = this.A01;
        FrameLayout frameLayout = jv2.A04;
        C47Z c47z2 = this.A03;
        frameLayout.post(new RunnableC50018M6h(this.A00, jv2, this.A02, c47z2, c47z));
    }
}
