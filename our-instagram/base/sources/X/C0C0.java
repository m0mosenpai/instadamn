package X;

/* renamed from: X.0C0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0C0 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ long A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0C0(long j) {
        super(0);
        this.A00 = j;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final long j = this.A00;
        return new AbstractC211911v(j) { // from class: X.121
            public final long A00;

            @Override // X.AbstractC211911v
            public final void A04(C226418s c226418s) {
                C14360o3.A0B(c226418s, 0);
                long j2 = this.A01;
                long j3 = super.A00;
                c226418s.A0Q(c226418s.A02, "STARTUP_DETECTOR_INIT_START", j2);
                c226418s.A0Q(c226418s.A02, "STARTUP_DETECTOR_INIT_END", j3);
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "StartupTypeDetectorInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                C221315o c221315o = AbstractC221215n.sStartupTypeDetector;
                long j2 = this.A00;
                C221515q c221515q = c221315o.A01;
                c221515q.A04 = C218914p.A08();
                c221515q.A01 = j2;
                C221315o.A01(c221315o);
                C218914p.A03(EnumC220415e.A02, c221315o.A03);
            }

            {
                this.A00 = j;
            }
        };
    }
}
