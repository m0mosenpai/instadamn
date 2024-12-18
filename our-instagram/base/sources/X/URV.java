package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class URV extends C0T6 implements XG7 {
    public final XG4 A00;
    public final XG9 A01;
    public final XGA A02;
    public final InterfaceC72036XFy A03;

    @Override // X.XG7
    public final URV F45() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URV) {
                URV urv = (URV) obj;
                if (!C14360o3.A0K(this.A00, urv.A00) || !C14360o3.A0K(this.A01, urv.A01) || !C14360o3.A0K(this.A02, urv.A02) || !C14360o3.A0K(this.A03, urv.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XG7
    public final XG4 Aet() {
        return this.A00;
    }

    @Override // X.XG7
    public final XG9 ApX() {
        return this.A01;
    }

    @Override // X.XG7
    public final XGA Bb2() {
        return this.A02;
    }

    @Override // X.XG7
    public final InterfaceC72036XFy C7x() {
        return this.A03;
    }

    @Override // X.XG7
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardCommentCardSingleCardPayload", VPP.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
        InterfaceC72036XFy interfaceC72036XFy = this.A03;
        if (interfaceC72036XFy != null) {
            i = interfaceC72036XFy.hashCode();
        }
        return A0M + i;
    }

    public URV(XG4 xg4, XG9 xg9, XGA xga, InterfaceC72036XFy interfaceC72036XFy) {
        this.A00 = xg4;
        this.A01 = xg9;
        this.A02 = xga;
        this.A03 = interfaceC72036XFy;
    }
}
