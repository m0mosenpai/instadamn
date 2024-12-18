package X;

/* renamed from: X.6HG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HG extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final int A01;
    public final C132175xv A02;
    public final C26036BfP A03;
    public final EnumC132255y4 A04;
    public final C25996Bek A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final String A09;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6HG) {
                C6HG c6hg = (C6HG) obj;
                if (!C14360o3.A0K(this.A02, c6hg.A02) || !C14360o3.A0K(this.A03, c6hg.A03) || !C14360o3.A0K(this.A07, c6hg.A07) || !C14360o3.A0K(this.A05, c6hg.A05) || this.A08 != c6hg.A08 || !C14360o3.A0K(this.A06, c6hg.A06) || this.A00 != c6hg.A00 || this.A04 != c6hg.A04 || this.A01 != c6hg.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A09;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A02;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A05.hashCode()) * 31;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        String str = this.A06;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((i2 + hashCode) * 31) + this.A00) * 31) + this.A04.hashCode()) * 31) + this.A01;
    }

    public C6HG(C132175xv c132175xv, C26036BfP c26036BfP, EnumC132255y4 enumC132255y4, C25996Bek c25996Bek, String str, String str2, int i, int i2, boolean z) {
        this.A02 = c132175xv;
        this.A03 = c26036BfP;
        this.A07 = str;
        this.A05 = c25996Bek;
        this.A08 = z;
        this.A06 = str2;
        this.A00 = i;
        this.A04 = enumC132255y4;
        this.A01 = i2;
        this.A09 = AbstractC132295y8.A01(this, "voice_post", c132175xv.A03);
    }
}
