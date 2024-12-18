package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3wZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88243wZ extends C0T6 implements InterfaceC88253wa {
    public final Boolean A00;
    public final String A01;

    @Override // X.InterfaceC88253wa
    public final C88243wZ EwJ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88243wZ) {
                C88243wZ c88243wZ = (C88243wZ) obj;
                if (!C14360o3.A0K(this.A01, c88243wZ.A01) || !C14360o3.A0K(this.A00, c88243wZ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A00;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // X.InterfaceC88253wa
    public final Boolean CW1() {
        return this.A00;
    }

    @Override // X.InterfaceC88253wa
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaIabAutofilllOptoutInfo", AbstractC58469Pvu.A00(this));
    }

    @Override // X.InterfaceC88253wa
    public final String getDomain() {
        return this.A01;
    }

    public C88243wZ(String str, Boolean bool) {
        this.A01 = str;
        this.A00 = bool;
    }
}
