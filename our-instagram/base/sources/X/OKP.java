package X;

/* loaded from: classes9.dex */
public final class OKP {
    public final C2047294g A00;
    public final C4QF A01;

    public final C3SN A00(C3RU c3ru) {
        String str;
        String A01 = A01(c3ru);
        if (A01.length() == 0) {
            return MSW.A0L(null, AnonymousClass001.A0R("Model file is not found for ", c3ru.CDW()), false);
        }
        c3ru.CDW();
        C1RQ A00 = C1RQ.A00();
        EnumC27091Ti enumC27091Ti = EnumC27091Ti.A1D;
        if (!A00.A05(enumC27091Ti)) {
            str = "Pytorch is not downloaded on device";
        } else if (!C1RQ.A00().A06(enumC27091Ti) && !C1RQ.A00().A07(enumC27091Ti)) {
            str = "Pytorch is not loaded on device";
        } else {
            try {
                return MSW.A0L(AbstractC193188gy.A00(A01), null, true);
            } catch (Throwable th) {
                return MSW.A0L(null, th.getMessage(), false);
            }
        }
        return MSW.A0L(null, str, false);
    }

    public final String A01(C3RU c3ru) {
        return this.A01.A01(c3ru.CDW());
    }

    public OKP(C2047294g c2047294g, C4QF c4qf) {
        AbstractC167017dG.A1P(c2047294g, c4qf);
        this.A00 = c2047294g;
        this.A01 = c4qf;
    }
}
