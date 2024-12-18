package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4dN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99484dN extends C0T6 implements InterfaceC99494dO {
    public final InterfaceC99474dM A00;
    public final InterfaceC99474dM A01;
    public final InterfaceC99474dM A02;
    public final InterfaceC99474dM A03;
    public final InterfaceC99474dM A04;

    @Override // X.InterfaceC99494dO
    public final C99484dN F2o() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C99484dN) {
                C99484dN c99484dN = (C99484dN) obj;
                if (!C14360o3.A0K(this.A00, c99484dN.A00) || !C14360o3.A0K(this.A01, c99484dN.A01) || !C14360o3.A0K(this.A02, c99484dN.A02) || !C14360o3.A0K(this.A03, c99484dN.A03) || !C14360o3.A0K(this.A04, c99484dN.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        InterfaceC99474dM interfaceC99474dM = this.A00;
        int hashCode = (interfaceC99474dM == null ? 0 : interfaceC99474dM.hashCode()) * 31;
        InterfaceC99474dM interfaceC99474dM2 = this.A01;
        int hashCode2 = (hashCode + (interfaceC99474dM2 == null ? 0 : interfaceC99474dM2.hashCode())) * 31;
        InterfaceC99474dM interfaceC99474dM3 = this.A02;
        int hashCode3 = (hashCode2 + (interfaceC99474dM3 == null ? 0 : interfaceC99474dM3.hashCode())) * 31;
        InterfaceC99474dM interfaceC99474dM4 = this.A03;
        int hashCode4 = (hashCode3 + (interfaceC99474dM4 == null ? 0 : interfaceC99474dM4.hashCode())) * 31;
        InterfaceC99474dM interfaceC99474dM5 = this.A04;
        return hashCode4 + (interfaceC99474dM5 != null ? interfaceC99474dM5.hashCode() : 0);
    }

    @Override // X.InterfaceC99494dO
    public final InterfaceC99474dM BQg() {
        return this.A00;
    }

    @Override // X.InterfaceC99494dO
    public final InterfaceC99474dM CCA() {
        return this.A01;
    }

    @Override // X.InterfaceC99494dO
    public final InterfaceC99474dM CCB() {
        return this.A02;
    }

    @Override // X.InterfaceC99494dO
    public final InterfaceC99474dM CCC() {
        return this.A03;
    }

    @Override // X.InterfaceC99494dO
    public final InterfaceC99474dM CCD() {
        return this.A04;
    }

    @Override // X.InterfaceC99494dO
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTIFUMediaNavigationInfo", AbstractC46595KjY.A00(this));
    }

    public C99484dN(InterfaceC99474dM interfaceC99474dM, InterfaceC99474dM interfaceC99474dM2, InterfaceC99474dM interfaceC99474dM3, InterfaceC99474dM interfaceC99474dM4, InterfaceC99474dM interfaceC99474dM5) {
        this.A00 = interfaceC99474dM;
        this.A01 = interfaceC99474dM2;
        this.A02 = interfaceC99474dM3;
        this.A03 = interfaceC99474dM4;
        this.A04 = interfaceC99474dM5;
    }
}
