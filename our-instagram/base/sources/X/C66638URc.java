package X;

/* renamed from: X.URc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66638URc extends C0T6 implements InterfaceC66482zP {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66638URc) {
                C66638URc c66638URc = (C66638URc) obj;
                if (!C14360o3.A0K(this.A03, c66638URc.A03) || !C14360o3.A0K(this.A02, c66638URc.A02) || !C14360o3.A0K(this.A01, c66638URc.A01) || !C14360o3.A0K(this.A00, c66638URc.A00) || this.A04 != c66638URc.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (A0O + i) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public C66638URc(String str, String str2, String str3, String str4, boolean z) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A04 = z;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return toString();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
