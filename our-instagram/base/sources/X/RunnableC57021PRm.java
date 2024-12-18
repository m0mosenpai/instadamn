package X;

/* renamed from: X.PRm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57021PRm implements Runnable {
    public final /* synthetic */ N3J A00;
    public final /* synthetic */ C53021Nct A01;

    public RunnableC57021PRm(N3J n3j, C53021Nct c53021Nct) {
        this.A01 = c53021Nct;
        this.A00 = n3j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        EnumC53324Ni1 enumC53324Ni1;
        PJC pjc = this.A01.A0E;
        if (pjc != null) {
            N3J n3j = this.A00;
            C14360o3.A0B(n3j, 0);
            if (pjc.A05 == EnumC53324Ni1.A05) {
                pjc.A02 = n3j.A0B * 1000;
                OLC A02 = pjc.A0W.A02();
                int i2 = n3j.A03;
                C05A c05a = A02.A0I;
                boolean z = false;
                if (A02.A0t) {
                    i = ((java.util.Set) A02.A0A.getValue()).size();
                } else {
                    i = 0;
                }
                if (i + ((java.util.Set) A02.A05.getValue()).size() >= i2 - 1) {
                    z = true;
                }
                AbstractC166997dE.A1Y(c05a, z);
                A02.A00 = i2;
                if (C18U.A06(C06090Tz.A05, pjc.A0R, 36320889154839524L)) {
                    enumC53324Ni1 = EnumC53324Ni1.A04;
                } else {
                    enumC53324Ni1 = EnumC53324Ni1.A03;
                }
                pjc.A01(enumC53324Ni1);
                ((C006802i) AbstractC166987dD.A17(((O93) pjc.A0V.A01.getValue()).A01)).markerStart(29241390);
            }
        }
    }
}
