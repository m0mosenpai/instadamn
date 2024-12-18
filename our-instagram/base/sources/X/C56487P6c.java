package X;

/* renamed from: X.P6c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56487P6c implements InterfaceC53852dP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56487P6c(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC53852dP
    public final void DHI(C47Z c47z) {
        C006802i c006802i;
        int i;
        short s;
        if (this.A00 != 0) {
            C14360o3.A0B(c47z, 0);
            OKg oKg = (OKg) this.A02;
            if (AbstractC50102Ry.A00(c47z.A3t, ((C47Z) this.A01).A3t)) {
                EnumC915447k enumC915447k = c47z.A1f;
                EnumC915447k enumC915447k2 = c47z.A6J;
                C2GS c2gs = oKg.A01;
                if (enumC915447k == enumC915447k2) {
                    c2gs.A0B(EnumC53151Nf6.A05);
                    C54521O6y A00 = oKg.A00();
                    c006802i = A00.A01;
                    i = A00.A00;
                    c006802i.markerPoint(i, "end");
                    s = 2;
                } else {
                    c2gs.A0B(EnumC53151Nf6.A02);
                    C54521O6y A002 = oKg.A00();
                    c006802i = A002.A01;
                    i = A002.A00;
                    c006802i.markerPoint(i, "end");
                    s = 3;
                }
                c006802i.markerEnd(i, s);
                return;
            }
            return;
        }
        if (!AbstractC50102Ry.A00(c47z.A3t, ((C47Z) this.A02).A3t)) {
            return;
        }
        PTV ptv = (PTV) this.A01;
        ptv.A02.A06 = AbstractC167007dF.A1X(c47z.A1f, c47z.A6J);
        ptv.A04.countDown();
    }

    @Override // X.InterfaceC53852dP
    public final /* synthetic */ void DSR(C47Z c47z) {
    }
}
