package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.1sD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39321sD extends C0T6 implements InterfaceC39331sE {
    public final String A00;
    public final String A01;

    public C39321sD(String str, String str2) {
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC39331sE
    public final C39321sD Eu7() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39321sD) {
                C39321sD c39321sD = (C39321sD) obj;
                if (!C14360o3.A0K(this.A00, c39321sD.A00) || !C14360o3.A0K(this.A01, c39321sD.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC39331sE
    public final String Bks() {
        return this.A00;
    }

    @Override // X.InterfaceC39331sE
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTHideReasonDict", AbstractC37388GdU.A00(this));
    }

    @Override // X.InterfaceC39331sE
    public final String getText() {
        return this.A01;
    }
}
