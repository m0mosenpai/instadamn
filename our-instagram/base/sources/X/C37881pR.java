package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.1pR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37881pR extends C0T6 implements InterfaceC37891pS {
    public final int A00;
    public final int A01;
    public final String A02;

    public C37881pR(String str, int i, int i2) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC37891pS
    public final C37881pR F5f() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37881pR) {
                C37881pR c37881pR = (C37881pR) obj;
                if (!C14360o3.A0K(this.A02, c37881pR.A02) || this.A00 != c37881pR.A00 || this.A01 != c37881pR.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00) * 31) + this.A01;
    }

    @Override // X.InterfaceC37891pS
    public final String AZM() {
        return this.A02;
    }

    @Override // X.InterfaceC37891pS
    public final int BHS() {
        return this.A00;
    }

    @Override // X.InterfaceC37891pS
    public final int BXa() {
        return this.A01;
    }

    @Override // X.InterfaceC37891pS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdPodRules", AbstractC37402Gdi.A00(this));
    }
}
