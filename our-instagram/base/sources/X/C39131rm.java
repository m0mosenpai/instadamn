package X;

/* renamed from: X.1rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39131rm extends C39141rn {
    public static C39091ri A01;
    public static C39131rm A02;
    public C0CA A00;

    @Override // X.C39141rn
    public final C39141rn A02() {
        return this;
    }

    @Override // X.C39141rn
    public final C39141rn A04(Boolean bool, String str) {
        return this;
    }

    @Override // X.C39141rn
    public final C39141rn A05(Number number, String str) {
        return this;
    }

    @Override // X.C39141rn
    public final C39141rn A06(String str, String str2) {
        return this;
    }

    @Override // X.C39141rn
    public final boolean A0A() {
        return false;
    }

    @Override // X.C39141rn
    public final C39141rn A03(long j) {
        return this;
    }

    @Override // X.C39141rn
    public final C39141rn A07(boolean z) {
        return this;
    }

    @Override // X.C39141rn
    public final C0CA A08() {
        C0CA c0ca = this.A00;
        if (c0ca == null) {
            C0CA A022 = A01.A09.A02();
            this.A00 = A022;
            return A022;
        }
        return c0ca;
    }

    @Override // X.C39141rn
    public final void A09() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("SampledOutEvent is logged: ");
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        C0K8.A0E("SampledOutEventBuilder", sb.toString());
        this.A00 = null;
    }
}
