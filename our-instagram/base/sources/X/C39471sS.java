package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.1sS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39471sS extends C0T6 implements InterfaceC39481sT {
    public final Long A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC39481sT
    public final C39471sS F6b() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39471sS) {
                C39471sS c39471sS = (C39471sS) obj;
                if (!C14360o3.A0K(this.A01, c39471sS.A01) || !C14360o3.A0K(this.A02, c39471sS.A02) || !C14360o3.A0K(this.A00, c39471sS.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.A00;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    @Override // X.InterfaceC39481sT
    public final String Apw() {
        return this.A01;
    }

    @Override // X.InterfaceC39481sT
    public final String BN4() {
        return this.A02;
    }

    @Override // X.InterfaceC39481sT
    public final Long BpI() {
        return this.A00;
    }

    @Override // X.InterfaceC39481sT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClientInvalidationInstructionConditionDict", AbstractC37392GdY.A00(this));
    }

    public C39471sS(Long l, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = l;
    }
}
