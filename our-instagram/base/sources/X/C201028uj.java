package X;

/* renamed from: X.8uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201028uj extends C0T6 {
    public final C201018ui A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C201028uj(C201018ui c201018ui, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(c201018ui, 2);
        C14360o3.A0B(str3, 5);
        this.A01 = str;
        this.A00 = c201018ui;
        this.A02 = str2;
        this.A04 = z;
        this.A03 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C201028uj) {
                C201028uj c201028uj = (C201028uj) obj;
                if (!C14360o3.A0K(this.A01, c201028uj.A01) || !C14360o3.A0K(this.A00, c201028uj.A00) || !C14360o3.A0K(this.A02, c201028uj.A02) || this.A04 != c201028uj.A04 || !C14360o3.A0K(this.A03, c201028uj.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.A00.hashCode()) * 31;
        String str2 = this.A02;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        return ((i2 + i3) * 31) + this.A03.hashCode();
    }
}
