package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.46o, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C46o extends C0T6 implements C46p {
    public final Boolean A00;
    public final Boolean A01;

    @Override // X.C46p
    public final C46o Et2() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46o) {
                C46o c46o = (C46o) obj;
                if (!C14360o3.A0K(this.A00, c46o.A00) || !C14360o3.A0K(this.A01, c46o.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A01;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // X.C46p
    public final Boolean BvY() {
        return this.A00;
    }

    @Override // X.C46p
    public final Boolean BvZ() {
        return this.A01;
    }

    @Override // X.C46p
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCtmAdsInfoDict", AbstractC39891Hme.A00(this));
    }

    public C46o(Boolean bool, Boolean bool2) {
        this.A00 = bool;
        this.A01 = bool2;
    }
}
