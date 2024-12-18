package X;

/* renamed from: X.6HW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HW extends C0T6 implements InterfaceC132245y2 {
    public final C132175xv A00;
    public final boolean A01;
    public final boolean A02;
    public final C26036BfP A03;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6HW) {
                C6HW c6hw = (C6HW) obj;
                if (!C14360o3.A0K(this.A00, c6hw.A00) || !C14360o3.A0K(this.A03, c6hw.A03) || this.A02 != c6hw.A02 || this.A01 != c6hw.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "post_insights_row", this.A00.A03);
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode = ((this.A00.hashCode() * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public C6HW(C132175xv c132175xv, C26036BfP c26036BfP, boolean z, boolean z2) {
        this.A00 = c132175xv;
        this.A03 = c26036BfP;
        this.A02 = z;
        this.A01 = z2;
    }
}
