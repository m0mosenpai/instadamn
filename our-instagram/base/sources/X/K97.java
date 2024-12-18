package X;

/* loaded from: classes8.dex */
public final class K97 extends AbstractC46369Kfr {
    public final C45116Jxl A00;
    public final String A01;

    public K97(C45116Jxl c45116Jxl, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = c45116Jxl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K97) {
                K97 k97 = (K97) obj;
                if (!C14360o3.A0K(this.A01, k97.A01) || !C14360o3.A0K(this.A00, k97.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }
}
