package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.32j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C674432j implements InterfaceC62612t0 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public final UserSession A05;
    public final C65192xH A06;
    public final C61922rt A07;
    public final C1M1 A08;
    public final C673732c A09;
    public final InterfaceC674632l A0A;

    public C674432j(UserSession userSession, C65192xH c65192xH, C61922rt c61922rt, C1M1 c1m1, C673732c c673732c) {
        C14360o3.A0B(c61922rt, 5);
        this.A05 = userSession;
        this.A08 = c1m1;
        this.A06 = c65192xH;
        this.A09 = c673732c;
        this.A07 = c61922rt;
        int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36609532437010334L);
        this.A01 = A01 < 0 ? 1000 : A01;
        this.A0A = new InterfaceC674632l() { // from class: X.32k
            /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
            
                if (r4.A06 != X.C1XV.A0Y) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
            
                if (r5 >= ((int) X.C18U.A01(r8, r9, 36609893209348073L))) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x003a A[SYNTHETIC] */
            @Override // X.InterfaceC674632l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List Ctr(java.util.List r34) {
                /*
                    Method dump skipped, instructions count: 421
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C674532k.Ctr(java.util.List):java.util.List");
            }

            @Override // X.InterfaceC674632l
            public final void DHK(boolean z) {
                if (z) {
                    C674432j.this.A02 = System.currentTimeMillis();
                }
                C674432j.this.A03 = 0L;
            }
        };
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C42112IlM c42112IlM;
        if (System.currentTimeMillis() - this.A02 >= this.A01 && this.A03 <= 0 && this.A04) {
            C65192xH c65192xH = this.A06;
            if (C3ZD.A00 == null) {
                if (C3XH.A04(c65192xH.A07())) {
                    c42112IlM = new C42112IlM(C1XV.A0H);
                } else {
                    c42112IlM = null;
                }
                this.A03 = System.currentTimeMillis();
                this.A07.A06(c42112IlM, this.A0A, new C4QH((int) C18U.A01(C06090Tz.A05, this.A05, 36592571606434420L), 0), c65192xH.A06(), 1, false);
            }
        }
    }
}
