package X;

/* renamed from: X.Eby, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32794Eby extends AbstractC33537EsB {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32794Eby) {
                C32794Eby c32794Eby = (C32794Eby) obj;
                if (!C14360o3.A0K(this.A00, c32794Eby.A00) || this.A01 != c32794Eby.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C32794Eby(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
