package X;

/* renamed from: X.4Bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92284Bi implements InterfaceC46412Bd {
    public long A00;
    public final int A01;
    public final /* synthetic */ C2BZ A02;

    @Override // X.InterfaceC46412Bd
    public final void DnS(C2QE c2qe, C49802Qq c49802Qq, C49802Qq c49802Qq2, Integer num) {
    }

    public C92284Bi(C2BZ c2bz, int i) {
        this.A02 = c2bz;
        this.A01 = i;
    }

    @Override // X.InterfaceC46412Bd
    public final void DnP(C2QE c2qe, C49802Qq c49802Qq) {
        long j = c49802Qq.A04;
        long j2 = this.A01;
        if (j < j2) {
            long j3 = this.A00;
            long j4 = c49802Qq.A03;
            if (j + j4 > j2) {
                j4 = j2 - j;
            }
            this.A00 = j3 + j4;
        }
    }

    @Override // X.InterfaceC46412Bd
    public final void DnQ(C2QE c2qe, C49802Qq c49802Qq) {
        if (c49802Qq.A04 == 0 && this.A02.A07 != null && AbstractC49822Qs.A00(c49802Qq.A06) != null) {
            AbstractC459729h.A01("ServiceEventCallbackImpl", "skipping log because listener is null for event type: ", new Object[0]);
        }
        C2BZ c2bz = this.A02;
        if (c2bz.A03() != null) {
            c2bz.A03().EFe(this, c49802Qq.A06);
        }
    }

    @Override // X.InterfaceC46412Bd
    public final void DnR(C2QE c2qe, C49802Qq c49802Qq, C49802Qq c49802Qq2) {
    }
}
