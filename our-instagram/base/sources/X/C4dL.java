package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4dL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4dL extends C0T6 implements InterfaceC99474dM {
    public final InterfaceC99464dK A00;
    public final InterfaceC99464dK A01;

    @Override // X.InterfaceC99474dM
    public final C4dL F2n() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4dL) {
                C4dL c4dL = (C4dL) obj;
                if (!C14360o3.A0K(this.A00, c4dL.A00) || !C14360o3.A0K(this.A01, c4dL.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        InterfaceC99464dK interfaceC99464dK = this.A00;
        int hashCode = (interfaceC99464dK == null ? 0 : interfaceC99464dK.hashCode()) * 31;
        InterfaceC99464dK interfaceC99464dK2 = this.A01;
        return hashCode + (interfaceC99464dK2 != null ? interfaceC99464dK2.hashCode() : 0);
    }

    @Override // X.InterfaceC99474dM
    public final InterfaceC99464dK BIU() {
        return this.A00;
    }

    @Override // X.InterfaceC99474dM
    public final InterfaceC99464dK CCc() {
        return this.A01;
    }

    @Override // X.InterfaceC99474dM
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTIFUDestination", CDZ.A00(this));
    }

    public C4dL(InterfaceC99464dK interfaceC99464dK, InterfaceC99464dK interfaceC99464dK2) {
        this.A00 = interfaceC99464dK;
        this.A01 = interfaceC99464dK2;
    }
}
