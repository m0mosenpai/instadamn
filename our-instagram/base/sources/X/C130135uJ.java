package X;

/* renamed from: X.5uJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130135uJ extends C0T6 {
    public boolean A00;
    public final EnumC130125uI A01;
    public final EnumC130115uH A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C130135uJ) {
                C130135uJ c130135uJ = (C130135uJ) obj;
                if (!C14360o3.A0K(this.A04, c130135uJ.A04) || !C14360o3.A0K(this.A03, c130135uJ.A03) || this.A00 != c130135uJ.A00 || this.A02 != c130135uJ.A02 || this.A05 != c130135uJ.A05 || this.A01 != c130135uJ.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.A02.hashCode()) * 31;
        int i2 = 1237;
        if (this.A05) {
            i2 = 1231;
        }
        return ((hashCode2 + i2) * 31) + this.A01.hashCode();
    }

    public C130135uJ(EnumC130125uI enumC130125uI, EnumC130115uH enumC130115uH, String str, String str2, boolean z, boolean z2) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = z;
        this.A02 = enumC130115uH;
        this.A05 = z2;
        this.A01 = enumC130125uI;
    }
}
