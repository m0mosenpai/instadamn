package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H2c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38691H2c extends C0T6 implements InterfaceC104824nn {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC104824nn
    public final C38691H2c Ern() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38691H2c) {
                C38691H2c c38691H2c = (C38691H2c) obj;
                if (!C14360o3.A0K(this.A01, c38691H2c.A01) || !C14360o3.A0K(this.A02, c38691H2c.A02) || !C14360o3.A0K(this.A03, c38691H2c.A03) || !C14360o3.A0K(this.A00, c38691H2c.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC104824nn
    public final String AYb() {
        return this.A01;
    }

    @Override // X.InterfaceC104824nn
    public final String AYc() {
        return this.A02;
    }

    @Override // X.InterfaceC104824nn
    public final String B4G() {
        return this.A03;
    }

    @Override // X.InterfaceC104824nn
    public final Integer B4K() {
        return this.A00;
    }

    @Override // X.InterfaceC104824nn
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTClickToWhatsAppFallbackWrapper", AbstractC39805HlF.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38691H2c(Integer num, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = num;
    }
}
