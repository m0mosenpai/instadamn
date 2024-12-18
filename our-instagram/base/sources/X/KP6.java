package X;

/* loaded from: classes8.dex */
public final class KP6 extends AbstractC46425Kgl {
    public final Exception A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KP6) {
                KP6 kp6 = (KP6) obj;
                if (!C14360o3.A0K(this.A00, kp6.A00) || !C14360o3.A0K(this.A01, kp6.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }

    public KP6(Exception exc, String str) {
        this.A00 = exc;
        this.A01 = str;
    }
}
