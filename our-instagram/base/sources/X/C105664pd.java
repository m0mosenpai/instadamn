package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105664pd extends C0T6 implements InterfaceC105674pe {
    public final String A00;
    public final String A01;

    public C105664pd(String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC105674pe
    public final C105664pd F3l() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C105664pd) {
                C105664pd c105664pd = (C105664pd) obj;
                if (!C14360o3.A0K(this.A00, c105664pd.A00) || !C14360o3.A0K(this.A01, c105664pd.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC105674pe
    public final String BL7() {
        return this.A00;
    }

    @Override // X.InterfaceC105674pe
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTVideoSubtitleInfo", AbstractC40447Hwc.A00(this));
    }

    @Override // X.InterfaceC105674pe
    public final String getUri() {
        return this.A01;
    }
}
