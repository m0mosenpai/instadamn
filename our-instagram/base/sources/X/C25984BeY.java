package X;

/* renamed from: X.BeY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25984BeY extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25984BeY) {
                C25984BeY c25984BeY = (C25984BeY) obj;
                if (!C14360o3.A0K(this.A00, c25984BeY.A00) || !C14360o3.A0K(this.A02, c25984BeY.A02) || !C14360o3.A0K(this.A01, c25984BeY.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A00)) + AbstractC167017dG.A0O(this.A01);
    }

    public C25984BeY(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
