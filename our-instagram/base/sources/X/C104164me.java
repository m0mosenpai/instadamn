package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104164me extends C0T6 implements InterfaceC104174mf {
    public final Boolean A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC104174mf
    public final C104164me EsU() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104164me) {
                C104164me c104164me = (C104164me) obj;
                if (!C14360o3.A0K(this.A00, c104164me.A00) || !C14360o3.A0K(this.A01, c104164me.A01) || !C14360o3.A0K(this.A02, c104164me.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A02;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC104174mf
    public final String BWF() {
        return this.A01;
    }

    @Override // X.InterfaceC104174mf
    public final String Bu1() {
        return this.A02;
    }

    @Override // X.InterfaceC104174mf
    public final Boolean CRJ() {
        return this.A00;
    }

    @Override // X.InterfaceC104174mf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCommerceOnboardingConfig", AbstractC33677EuR.A00(this));
    }

    public C104164me(Boolean bool, String str, String str2) {
        this.A00 = bool;
        this.A01 = str;
        this.A02 = str2;
    }
}
