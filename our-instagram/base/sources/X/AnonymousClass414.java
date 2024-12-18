package X;

/* renamed from: X.414, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass414 extends C0T6 {
    public final int A00;
    public final int A01;
    public final C51755Mte A02;
    public final String A03;
    public final boolean A04 = true;

    public AnonymousClass414(C51755Mte c51755Mte, String str, int i, int i2) {
        this.A03 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c51755Mte;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass414) {
                AnonymousClass414 anonymousClass414 = (AnonymousClass414) obj;
                if (!C14360o3.A0K(this.A03, anonymousClass414.A03) || this.A01 != anonymousClass414.A01 || this.A00 != anonymousClass414.A00 || !C14360o3.A0K(this.A02, anonymousClass414.A02) || this.A04 != anonymousClass414.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A03;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((((((hashCode * 31) + this.A01) * 31) + this.A00) * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        return hashCode2 + i;
    }
}
