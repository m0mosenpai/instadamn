package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.44J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44J extends C0T6 implements C44K {
    public final C44I A00;
    public final Boolean A01;
    public final Boolean A02;
    public final String A03;

    public C44J(C44I c44i, Boolean bool, Boolean bool2, String str) {
        C14360o3.A0B(str, 4);
        this.A00 = c44i;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = str;
    }

    @Override // X.C44K
    public final C44J F56() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44J) {
                C44J c44j = (C44J) obj;
                if (!C14360o3.A0K(this.A00, c44j.A00) || !C14360o3.A0K(this.A01, c44j.A01) || !C14360o3.A0K(this.A02, c44j.A02) || !C14360o3.A0K(this.A03, c44j.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C44I c44i = this.A00;
        int hashCode = (c44i == null ? 0 : c44i.hashCode()) * 31;
        Boolean bool = this.A01;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A02;
        return ((hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.A03.hashCode();
    }

    @Override // X.C44K
    public final C44I AqZ() {
        return this.A00;
    }

    @Override // X.C44K
    public final Boolean BB2() {
        return this.A01;
    }

    @Override // X.C44K
    public final Boolean CUE() {
        return this.A02;
    }

    @Override // X.C44K
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProfileFundraiserDict", AbstractC65929Twa.A00(this));
    }

    @Override // X.C44K
    public final String getPk() {
        return this.A03;
    }
}
