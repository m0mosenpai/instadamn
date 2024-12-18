package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3l0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81823l0 extends C0T6 implements InterfaceC81833l1 {
    public final InterfaceC110324y3 A00;
    public final C43H A01;

    @Override // X.InterfaceC81833l1
    public final C81823l0 EtK() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C81823l0) {
                C81823l0 c81823l0 = (C81823l0) obj;
                if (!C14360o3.A0K(this.A00, c81823l0.A00) || !C14360o3.A0K(this.A01, c81823l0.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        InterfaceC110324y3 interfaceC110324y3 = this.A00;
        int hashCode = (interfaceC110324y3 == null ? 0 : interfaceC110324y3.hashCode()) * 31;
        C43H c43h = this.A01;
        return hashCode + (c43h != null ? c43h.hashCode() : 0);
    }

    @Override // X.InterfaceC81833l1
    public final InterfaceC110324y3 BNb() {
        return this.A00;
    }

    @Override // X.InterfaceC81833l1
    public final C43H BNc() {
        return this.A01;
    }

    @Override // X.InterfaceC81833l1
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFBHardLinkInfo", AbstractC31519Dt3.A00(this));
    }

    public C81823l0(InterfaceC110324y3 interfaceC110324y3, C43H c43h) {
        this.A00 = interfaceC110324y3;
        this.A01 = c43h;
    }
}
