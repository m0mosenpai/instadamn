package X;

/* renamed from: X.Mqj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51591Mqj extends C0T6 {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51591Mqj) {
                C51591Mqj c51591Mqj = (C51591Mqj) obj;
                if (!C14360o3.A0K(this.A00, c51591Mqj.A00) || this.A01 != c51591Mqj.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167017dG.A0O(this.A00) * 31);
    }

    public C51591Mqj(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
