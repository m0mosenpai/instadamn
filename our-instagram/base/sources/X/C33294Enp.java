package X;

/* renamed from: X.Enp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33294Enp extends AbstractC33573Esl {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C33294Enp) {
                C33294Enp c33294Enp = (C33294Enp) obj;
                if (!C14360o3.A0K(this.A00, c33294Enp.A00) || !C14360o3.A0K(this.A01, c33294Enp.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A01);
    }

    public C33294Enp(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
