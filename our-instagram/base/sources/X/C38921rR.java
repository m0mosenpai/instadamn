package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.1rR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38921rR extends C0T6 implements InterfaceC38941rT {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C38921rR(Integer num, String str, String str2, boolean z) {
        C14360o3.A0B(str, 3);
        this.A00 = num;
        this.A03 = z;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.InterfaceC38941rT
    public final C38921rR EsR() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38921rR) {
                C38921rR c38921rR = (C38921rR) obj;
                if (!C14360o3.A0K(this.A00, c38921rR.A00) || this.A03 != c38921rR.A03 || !C14360o3.A0K(this.A01, c38921rR.A01) || !C14360o3.A0K(this.A02, c38921rR.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC38941rT
    public final Integer AYj() {
        return this.A00;
    }

    @Override // X.InterfaceC38941rT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCommentInformTreatment", AbstractC37354Gcw.A00(this));
    }

    @Override // X.InterfaceC38941rT
    public final boolean getShouldHaveInformTreatment() {
        return this.A03;
    }

    @Override // X.InterfaceC38941rT
    public final String getText() {
        return this.A01;
    }

    @Override // X.InterfaceC38941rT
    public final String getUrl() {
        return this.A02;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.A00;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int hashCode2 = (((i2 + i3) * 31) + this.A01.hashCode()) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }
}
