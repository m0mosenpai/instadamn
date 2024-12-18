package X;

/* renamed from: X.6Oi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138276Oi {
    public C86013sY A00;
    public InterfaceC74623Ww A01;
    public final L56 A02;
    public final C6FG A03;
    public final C102884kP A04;

    public final String A00() {
        C102884kP A08 = this.A04.A08(61);
        C18C.A07(A08, "Expected valid player identifier but got null");
        String A0L = A08.A0L(35);
        A0L.getClass();
        return A0L;
    }

    public final void A01(String str) {
        C102884kP c102884kP = this.A04;
        InterfaceC103384lE A0B = c102884kP.A0B(55);
        if (A0B != null) {
            C6FX c6fx = new C6FX();
            c6fx.A03(str, 0);
            C6FG c6fg = this.A03;
            c6fx.A03(c6fg, 1);
            C6FP.A03(c6fg, c102884kP, new C6FW(c6fx.A00), A0B);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C138276Oi(X.C6FG r14, X.C102884kP r15) {
        /*
            r13 = this;
            r13.<init>()
            r13.A04 = r15
            r13.A03 = r14
            r0 = 70
            X.4lE r2 = r15.A0B(r0)
            if (r2 == 0) goto L35
            X.6FW r1 = X.C6FW.A01
            java.util.List r0 = r15.A0A
            X.6FQ r0 = X.C6FQ.A01(r14, r2, r0)
            java.lang.Object r2 = X.C131845xK.A00(r0, r1, r2)
            r7 = r2
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.ClassCastException -> L1f
            goto L36
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Expected IG_LOGGING_EXTRA_FIELDS to be a map, but got "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "BKVideoBinderUtils"
            X.AbstractC25241Le.A02(r0, r1)
        L35:
            r7 = 0
        L36:
            java.lang.String r3 = ""
            r2 = 38
            r5 = r3
            java.lang.String r0 = r15.A0L(r2)
            if (r0 == 0) goto L42
            r5 = r0
        L42:
            java.lang.Integer r1 = X.C05F.A00
            java.lang.String r0 = r15.A0L(r2)
            if (r0 == 0) goto L4b
            r3 = r0
        L4b:
            X.4hZ r2 = new X.4hZ
            r2.<init>(r1, r3)
            r0 = 35
            java.lang.String r0 = r15.A0L(r0)
            r2.A08 = r0
            r1 = 36
            r0 = 0
            boolean r0 = r15.A0S(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A07 = r0
            r0 = 40
            java.lang.String r0 = r15.A0L(r0)
            r2.A09 = r0
            r0 = 44
            java.util.List r0 = r15.A0N(r0)
            java.util.ArrayList r0 = X.AbstractC68399VPh.A00(r0)
            r2.A0C = r0
            r0 = 41
            java.lang.String r0 = r15.A0L(r0)
            r2.A0A = r0
            X.3a3 r4 = r2.A00()
            X.0iw r0 = X.C6BQ.A07(r14)
            java.lang.String r6 = r0.getModuleName()
            r0 = 46
            java.lang.String r0 = r15.A0L(r0)
            if (r0 == 0) goto L96
            r6 = r0
        L96:
            r0 = 52
            r1 = 1
            boolean r10 = r15.A0S(r0, r1)
            r0 = 56
            boolean r11 = r15.A0S(r0, r1)
            r0 = 59
            boolean r12 = r15.A0S(r0, r1)
            java.lang.String r1 = "cover"
            r0 = 62
            java.lang.String r0 = r15.A0L(r0)
            if (r0 == 0) goto Lb4
            r1 = r0
        Lb4:
            java.lang.String r0 = "contain"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lce
            X.4Qe r3 = X.EnumC95184Qe.A04
        Lbe:
            r2 = 42
            r0 = 0
            long r8 = r15.A04(r2, r0)
            X.L56 r2 = new X.L56
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11, r12)
            r13.A02 = r2
            return
        Lce:
            X.4Qe r3 = X.EnumC95184Qe.A03
            goto Lbe
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138276Oi.<init>(X.6FG, X.4kP):void");
    }
}
