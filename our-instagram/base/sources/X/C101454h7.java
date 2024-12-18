package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4h7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101454h7 extends C0T6 implements InterfaceC101464h8 {
    public final InterfaceC101444h6 A00;
    public final InterfaceC101444h6 A01;
    public final boolean A02;

    public C101454h7(InterfaceC101444h6 interfaceC101444h6, InterfaceC101444h6 interfaceC101444h62, boolean z) {
        C14360o3.A0B(interfaceC101444h6, 1);
        C14360o3.A0B(interfaceC101444h62, 2);
        this.A00 = interfaceC101444h6;
        this.A01 = interfaceC101444h62;
        this.A02 = z;
    }

    @Override // X.InterfaceC101464h8
    public final C101454h7 EyE() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C101454h7) {
                C101454h7 c101454h7 = (C101454h7) obj;
                if (!C14360o3.A0K(this.A00, c101454h7.A00) || !C14360o3.A0K(this.A01, c101454h7.A01) || this.A02 != c101454h7.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC101464h8
    public final InterfaceC101444h6 Caa() {
        return this.A00;
    }

    @Override // X.InterfaceC101464h8
    public final InterfaceC101444h6 Cab() {
        return this.A01;
    }

    @Override // X.InterfaceC101464h8
    public final boolean Cad() {
        return this.A02;
    }

    @Override // X.InterfaceC101464h8
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProactiveWarningsEventInfo", CDR.A00(this));
    }

    public final int hashCode() {
        int hashCode = ((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return hashCode + i;
    }
}
