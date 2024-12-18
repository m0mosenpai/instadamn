package X;

/* renamed from: X.31j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C671831j extends C40861ut {
    public static final C671831j A0D = new C671831j(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
    public int A00;
    public InterfaceC39571se A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C9C2 A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Multi-variable type inference failed */
    public C671831j() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C671831j(X.InterfaceC39571se r17, X.C38011pl r18, java.lang.String r19, int r20, int r21, int r22, int r23, int r24, int r25, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            r16 = this;
            r13 = r19
            r14 = r18
            r11 = r21
            r12 = r20
            r9 = r23
            r10 = r22
            r8 = r24
            r6 = r27
            r7 = r26
            r4 = r29
            r5 = r28
            r3 = 0
            r15 = r25
            r0 = r25 & 1
            r2 = 0
            if (r0 == 0) goto L1f
            r14 = r3
        L1f:
            r0 = r25 & 2
            r1 = 0
            if (r0 == 0) goto L25
            r12 = 0
        L25:
            r0 = r25 & 4
            if (r0 == 0) goto L2a
            r11 = 0
        L2a:
            r0 = r25 & 8
            if (r0 == 0) goto L2f
            r7 = 0
        L2f:
            r0 = r25 & 16
            if (r0 == 0) goto L34
            r6 = 0
        L34:
            r0 = r25 & 32
            if (r0 == 0) goto L39
            r5 = 0
        L39:
            r0 = r25 & 64
            if (r0 == 0) goto L3e
            r10 = 0
        L3e:
            r0 = r15 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L43
            r9 = 0
        L43:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L49
            r2 = r17
        L49:
            r0 = r15 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L4e
            r8 = 0
        L4e:
            r0 = r15 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L54
            java.lang.String r13 = ""
        L54:
            r0 = r15 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L59
            r4 = 0
        L59:
            r0 = r15 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L62
            X.9C2 r3 = new X.9C2
            r3.<init>()
        L62:
            r0 = 11
            X.C14360o3.A0B(r13, r0)
            r0 = 13
            X.C14360o3.A0B(r3, r0)
            r15 = r16
            r15.<init>(r14)
            r15.A05 = r12
            r15.A04 = r11
            r15.A0A = r7
            r15.A0C = r6
            r15.A0B = r5
            r15.A00 = r10
            r15.A06 = r9
            r15.A01 = r2
            r15.A03 = r8
            r15.A08 = r13
            r15.A09 = r4
            r15.A07 = r3
            r15.A02 = r1
            if (r2 != 0) goto L95
            if (r14 == 0) goto L95
            X.1se r0 = r14.A00
            if (r0 == 0) goto L95
            r15.A01 = r0
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C671831j.<init>(X.1se, X.1pl, java.lang.String, int, int, int, int, int, int, boolean, boolean, boolean, boolean):void");
    }

    public final boolean A0D(Integer num, Integer num2, int i) {
        int i2;
        if (AbstractC114975Hn.A02(num) && AbstractC114975Hn.A02(num2)) {
            if (num != num2) {
                i2 = this.A04;
            } else {
                Integer num3 = C05F.A0C;
                if (num == num3 && num2 == num3) {
                    i2 = A05();
                } else {
                    i2 = this.A05;
                }
            }
            if (i >= i2) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Gaps can be only evaluated for ADs and NETEGOs");
    }
}
