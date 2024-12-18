package X;

/* renamed from: X.Utx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67642Utx extends VIQ {
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C67642Utx) {
                C67642Utx c67642Utx = (C67642Utx) obj;
                if (!C14360o3.A0K(this.A01, c67642Utx.A01) || !C14360o3.A0K(this.A00, c67642Utx.A00) || !C14360o3.A0K(this.A02, c67642Utx.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0M + i;
    }

    public C67642Utx(Integer num, Integer num2, String str) {
        this.A01 = num;
        this.A00 = num2;
        this.A02 = str;
    }

    public C67642Utx() {
        this(null, null, null);
    }
}
