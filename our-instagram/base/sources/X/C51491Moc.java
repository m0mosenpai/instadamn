package X;

/* renamed from: X.Moc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51491Moc extends AbstractC53425NkE {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51491Moc) {
                C51491Moc c51491Moc = (C51491Moc) obj;
                if (!C14360o3.A0K(this.A00, c51491Moc.A00) || this.A01 != c51491Moc.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C51491Moc(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
