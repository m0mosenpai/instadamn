package X;

/* renamed from: X.9Z6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Z6 extends C0T6 {
    public int A00;
    public int A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9Z6) {
                C9Z6 c9z6 = (C9Z6) obj;
                if (!C14360o3.A0K(this.A02, c9z6.A02) || this.A00 != c9z6.A00 || this.A01 != c9z6.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A02) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TransitionEffectForLogging(name=");
        A1C.append(this.A02);
        A1C.append(", durationMs=");
        A1C.append(this.A00);
        A1C.append(", startTimeMs=");
        A1C.append(this.A01);
        return AbstractC167017dG.A0p(A1C);
    }
}
