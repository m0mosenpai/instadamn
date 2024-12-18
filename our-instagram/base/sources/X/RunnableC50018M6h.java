package X;

/* renamed from: X.M6h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50018M6h implements Runnable {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ JV2 A01;
    public final /* synthetic */ C129565tL A02;
    public final /* synthetic */ C47Z A03;
    public final /* synthetic */ C47Z A04;

    public RunnableC50018M6h(InterfaceC11380iw interfaceC11380iw, JV2 jv2, C129565tL c129565tL, C47Z c47z, C47Z c47z2) {
        this.A04 = c47z;
        this.A03 = c47z2;
        this.A01 = jv2;
        this.A02 = c129565tL;
        this.A00 = interfaceC11380iw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47Z c47z = this.A04;
        C47Z c47z2 = this.A03;
        if (C14360o3.A0K(c47z, c47z2)) {
            C7TA c7ta = C7T9.A07;
            JV2 jv2 = this.A01;
            C129565tL c129565tL = this.A02;
            c7ta.A03(AbstractC46827KnM.A00(c129565tL.CVC(), c129565tL.A09), this.A00, jv2, null, c47z2.A33, c47z2.A03(), true);
        }
    }
}
