package X;

/* loaded from: classes8.dex */
public final class KN9 extends AbstractC46405KgR {
    public final EnumC53262Nh0 A00;
    public final String A01;

    public KN9(EnumC53262Nh0 enumC53262Nh0, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = enumC53262Nh0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KN9) {
                KN9 kn9 = (KN9) obj;
                if (!C14360o3.A0K(this.A01, kn9.A01) || this.A00 != kn9.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }
}
