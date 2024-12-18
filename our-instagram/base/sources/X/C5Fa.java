package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5Fa, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Fa extends C0T6 implements InterfaceC104764ng {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC104764ng
    public final C5Fa F5k() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5Fa) {
                C5Fa c5Fa = (C5Fa) obj;
                if (!C14360o3.A0K(this.A00, c5Fa.A00) || !C14360o3.A0K(this.A01, c5Fa.A01) || !C14360o3.A0K(this.A02, c5Fa.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.InterfaceC104764ng
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdDisclaimerInfoDict", I36.A00(this));
    }

    @Override // X.InterfaceC104764ng
    public final String getText() {
        return this.A00;
    }

    @Override // X.InterfaceC104764ng
    public final String getTitle() {
        return this.A01;
    }

    @Override // X.InterfaceC104764ng
    public final String getUrl() {
        return this.A02;
    }

    public C5Fa(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
