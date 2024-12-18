package X;

/* renamed from: X.9ZC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZC extends C0T6 {
    public final float A00;
    public final String A01;
    public final String A02;

    public C9ZC(String str, String str2, float f) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = f;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZC) {
                C9ZC c9zc = (C9ZC) obj;
                if (!C14360o3.A0K(this.A01, c9zc.A01) || Float.compare(this.A00, c9zc.A00) != 0 || !C14360o3.A0K(this.A02, c9zc.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC166987dD.A0J(this.A01), this.A00) + this.A02.hashCode();
    }
}
