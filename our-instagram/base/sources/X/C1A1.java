package X;

import com.facebook.mobileconfig.factory.MobileConfigValueSource;

/* renamed from: X.1A1, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1A1 implements C1A2 {
    public final C0U0 A00;
    public final InterfaceC228919r A01;

    public abstract double A01(double d, long j, boolean z);

    public abstract long A02(long j, long j2, boolean z);

    public abstract C0U5 A03(long j);

    public abstract String A04(String str, long j, boolean z);

    public abstract boolean A05(long j, boolean z, boolean z2);

    @Override // X.InterfaceC18540vh
    public final double AzB(C06090Tz c06090Tz, long j) {
        return AzA(c06090Tz, this.A01.Az5(j), j);
    }

    @Override // X.InterfaceC18540vh
    public final long BPF(C06090Tz c06090Tz, long j) {
        return BPE(c06090Tz, j, this.A01.BP7(j));
    }

    @Override // X.C1A2
    public String Bo0() {
        return null;
    }

    @Override // X.C1A2
    public String Bo8() {
        return null;
    }

    @Override // X.C1A2
    public long BoE() {
        return 0L;
    }

    @Override // X.C1A2
    public final int CAh() {
        return 0;
    }

    @Override // X.InterfaceC18540vh
    public final boolean AhA(long j) {
        return AhE(C06090Tz.A05, j);
    }

    @Override // X.InterfaceC18540vh
    public final boolean AhB(long j, boolean z) {
        return AhF(C06090Tz.A05, j, z);
    }

    @Override // X.InterfaceC18540vh
    public final boolean AhE(C06090Tz c06090Tz, long j) {
        return AhF(c06090Tz, j, this.A01.Ah7(j));
    }

    @Override // X.InterfaceC18540vh
    public final boolean AhF(C06090Tz c06090Tz, long j, boolean z) {
        C0U0 c0u0;
        if (C19z.A0B && (c0u0 = this.A00) != null && c0u0.hasBoolOverrideForParam(j)) {
            if (c06090Tz.A02) {
                c06090Tz.A00 = new C0U5(MobileConfigValueSource.OVERRIDE);
            }
            return c0u0.boolOverrideForParam(j, z);
        }
        if (c06090Tz.A02) {
            C0U5 A03 = A03(j);
            c06090Tz.A00 = A03;
            MobileConfigValueSource mobileConfigValueSource = A03.A00;
            if (mobileConfigValueSource != MobileConfigValueSource.SERVER && mobileConfigValueSource != MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL) {
                return z;
            }
        }
        return A05(j, z, c06090Tz.A03);
    }

    @Override // X.InterfaceC18540vh
    public final double Az2(long j) {
        return AzB(C06090Tz.A05, j);
    }

    @Override // X.InterfaceC18540vh
    public final double AzA(C06090Tz c06090Tz, double d, long j) {
        C0U0 c0u0;
        if (C19z.A0B && (c0u0 = this.A00) != null && c0u0.hasDoubleOverrideForParam(j)) {
            if (c06090Tz.A02) {
                c06090Tz.A00 = new C0U5(MobileConfigValueSource.OVERRIDE);
            }
            return c0u0.doubleOverrideForParam(j, d);
        }
        if (c06090Tz.A02) {
            C0U5 A03 = A03(j);
            c06090Tz.A00 = A03;
            MobileConfigValueSource mobileConfigValueSource = A03.A00;
            if (mobileConfigValueSource != MobileConfigValueSource.SERVER && mobileConfigValueSource != MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL) {
                return d;
            }
        }
        return A01(d, j, c06090Tz.A03);
    }

    @Override // X.InterfaceC18540vh
    public final long BP2(long j) {
        return BPF(C06090Tz.A05, j);
    }

    @Override // X.InterfaceC18540vh
    public final long BP3(long j, long j2) {
        return BPE(C06090Tz.A05, j, j2);
    }

    @Override // X.InterfaceC18540vh
    public final long BPE(C06090Tz c06090Tz, long j, long j2) {
        C0U0 c0u0;
        if (C19z.A0B && (c0u0 = this.A00) != null && c0u0.hasIntOverrideForParam(j)) {
            if (c06090Tz.A02) {
                c06090Tz.A00 = new C0U5(MobileConfigValueSource.OVERRIDE);
            }
            return c0u0.intOverrideForParam(j, j2);
        }
        if (c06090Tz.A02) {
            C0U5 A03 = A03(j);
            c06090Tz.A00 = A03;
            MobileConfigValueSource mobileConfigValueSource = A03.A00;
            if (mobileConfigValueSource != MobileConfigValueSource.SERVER && mobileConfigValueSource != MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL) {
                return j2;
            }
        }
        return A02(j, j2, c06090Tz.A03);
    }

    @Override // X.InterfaceC18540vh
    public final String C2k(long j) {
        return C2x(C06090Tz.A05, j);
    }

    @Override // X.InterfaceC18540vh
    public final String C2l(long j, String str) {
        return C2y(C06090Tz.A05, "__NVAL__", j);
    }

    @Override // X.InterfaceC18540vh
    public final String C2x(C06090Tz c06090Tz, long j) {
        return C2y(c06090Tz, this.A01.C2o(j), j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r1 != com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL) goto L22;
     */
    @Override // X.InterfaceC18540vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String C2y(X.C06090Tz r4, java.lang.String r5, long r6) {
        /*
            r3 = this;
            boolean r0 = X.C19z.A0B
            if (r0 == 0) goto L28
            X.0U0 r2 = r3.A00
            if (r2 == 0) goto L28
            boolean r0 = r2.hasStringOverrideForParam(r6)
            if (r0 == 0) goto L28
            boolean r0 = r4.A02
            if (r0 == 0) goto L1b
            com.facebook.mobileconfig.factory.MobileConfigValueSource r1 = com.facebook.mobileconfig.factory.MobileConfigValueSource.OVERRIDE
            X.0U5 r0 = new X.0U5
            r0.<init>(r1)
            r4.A00 = r0
        L1b:
            java.lang.String r1 = r2.stringOverrideForParam(r6, r5)
            java.lang.String r0 = "__fbt_null__"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            return r1
        L28:
            boolean r0 = r4.A02
            if (r0 == 0) goto L3c
            X.0U5 r0 = r3.A03(r6)
            r4.A00 = r0
            com.facebook.mobileconfig.factory.MobileConfigValueSource r1 = r0.A00
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.SERVER
            if (r1 == r0) goto L3c
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL
            if (r1 != r0) goto L43
        L3c:
            boolean r0 = r4.A03
            java.lang.String r0 = r3.A04(r5, r6, r0)
            return r0
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A1.C2y(X.0Tz, java.lang.String, long):java.lang.String");
    }

    public C1A1(C0U0 c0u0, InterfaceC228919r interfaceC228919r) {
        this.A00 = c0u0;
        this.A01 = interfaceC228919r;
    }

    @Override // X.InterfaceC18540vh
    public final double Az3(long j, double d) {
        return AzA(C06090Tz.A05, -123.5d, j);
    }
}
