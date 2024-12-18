package X;

/* renamed from: X.KXt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46005KXt extends AbstractC46471KhV {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46005KXt) {
                C46005KXt c46005KXt = (C46005KXt) obj;
                if (!C14360o3.A0K(this.A01, c46005KXt.A01) || !C14360o3.A0K(this.A00, c46005KXt.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public C46005KXt(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
