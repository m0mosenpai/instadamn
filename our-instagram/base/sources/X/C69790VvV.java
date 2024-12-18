package X;

/* renamed from: X.VvV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69790VvV {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C98324bB A04;
    public C66001Txw A05;
    public boolean A06;
    public final InterfaceC98054ak A07;
    public final C98434bM A08 = new C98434bM();
    public final C97974ac A09 = new C97974ac();
    public final C97974ac A0B = new C97974ac(1);
    public final C97974ac A0A = new C97974ac();

    public final C98344bD A01() {
        if (this.A06) {
            C98434bM c98434bM = this.A08;
            int i = c98434bM.A05.A02;
            C98344bD c98344bD = c98434bM.A06;
            if ((c98344bD != null || (c98344bD = this.A05.A03.A0A[i]) != null) && c98344bD.A03) {
                return c98344bD;
            }
        }
        return null;
    }

    public final void A02() {
        C98434bM c98434bM = this.A08;
        c98434bM.A01 = 0;
        c98434bM.A04 = 0L;
        c98434bM.A08 = false;
        c98434bM.A07 = false;
        c98434bM.A09 = false;
        c98434bM.A06 = null;
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A06 = false;
    }

    public final boolean A03() {
        this.A01++;
        if (this.A06) {
            int i = this.A00 + 1;
            this.A00 = i;
            int[] iArr = this.A08.A0B;
            int i2 = this.A02;
            if (i != iArr[i2]) {
                return true;
            }
            this.A02 = i2 + 1;
            this.A00 = 0;
        }
        return false;
    }

    public C69790VvV(InterfaceC98054ak interfaceC98054ak, C98324bB c98324bB, C66001Txw c66001Txw) {
        this.A07 = interfaceC98054ak;
        this.A05 = c66001Txw;
        this.A04 = c98324bB;
        this.A05 = c66001Txw;
        this.A04 = c98324bB;
        interfaceC98054ak.AWa(c66001Txw.A03.A07);
        A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r11.A0E[r2] == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if (r15 != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00(int r14, int r15) {
        /*
            r13 = this;
            X.4bD r0 = r13.A01()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r8 = r0.A00
            if (r8 == 0) goto L44
            X.4bM r0 = r13.A08
            X.4ac r5 = r0.A0G
        L10:
            X.4bM r11 = r13.A08
            int r2 = r13.A01
            boolean r0 = r11.A07
            if (r0 == 0) goto L1f
            boolean[] r0 = r11.A0E
            boolean r0 = r0[r2]
            r12 = 1
            if (r0 != 0) goto L20
        L1f:
            r12 = 0
        L20:
            r9 = 1
            if (r12 != 0) goto L26
            r4 = 0
            if (r15 == 0) goto L27
        L26:
            r4 = 1
        L27:
            X.4ac r3 = r13.A0B
            byte[] r2 = r3.A02
            r0 = 0
            if (r4 == 0) goto L30
            r0 = 128(0x80, float:1.8E-43)
        L30:
            r0 = r0 | r8
            byte r0 = (byte) r0
            r2[r1] = r0
            r3.A0G(r1)
            X.4ak r7 = r13.A07
            r7.ELO(r3, r9, r9)
            r7.ELO(r5, r8, r9)
            if (r4 != 0) goto L4d
            int r0 = r8 + 1
            return r0
        L44:
            byte[] r0 = r0.A04
            X.4ac r5 = r13.A0A
            int r8 = r0.length
            r5.A0I(r0, r8)
            goto L10
        L4d:
            r4 = 6
            r6 = 3
            r5 = 2
            r10 = 8
            if (r12 != 0) goto L87
            X.4ac r3 = r13.A09
            r3.A0E(r10)
            byte[] r2 = r3.A02
            r2[r1] = r1
            r2[r9] = r9
            X.AbstractC65702TsY.A0s(r15, r2, r5, r6)
            r1 = 4
            int r0 = r14 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2[r1] = r0
            r1 = 5
            int r0 = r14 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2[r1] = r0
            int r0 = r14 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2[r4] = r0
            r1 = 7
            r0 = r14 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2[r1] = r0
            r7.ELO(r3, r10, r9)
            int r0 = r8 + 1
            int r0 = r0 + 8
            return r0
        L87:
            X.4ac r11 = r11.A0G
            int r2 = r11.A05()
            r0 = -2
            r11.A0H(r0)
            int r0 = r2 * 6
            int r4 = r0 + 2
            if (r15 == 0) goto Lb0
            X.4ac r3 = r13.A09
            r3.A0E(r4)
            byte[] r2 = r3.A02
            r11.A0J(r2, r1, r4)
            r0 = r2[r5]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r10
            r0 = r2[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            int r1 = r1 + r15
            X.AbstractC65702TsY.A0s(r1, r2, r5, r6)
            r11 = r3
        Lb0:
            r7.ELO(r11, r4, r9)
            int r0 = r8 + 1
            int r0 = r0 + r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69790VvV.A00(int, int):int");
    }
}
