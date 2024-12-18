package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3vO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87563vO extends C0T6 implements InterfaceC87573vP {
    public final Float A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC87573vP
    public final C87563vO Erl() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87563vO) {
                C87563vO c87563vO = (C87563vO) obj;
                if (!C14360o3.A0K(this.A00, c87563vO.A00) || !C14360o3.A0K(this.A01, c87563vO.A01) || !C14360o3.A0K(this.A02, c87563vO.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A00;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A02;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC87573vP
    public final Float Ais() {
        return this.A00;
    }

    @Override // X.InterfaceC87573vP
    public final String Ait() {
        return this.A01;
    }

    @Override // X.InterfaceC87573vP
    public final String CHV() {
        return this.A02;
    }

    @Override // X.InterfaceC87573vP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClickToDirectAdsInfo", AbstractC37401Gdh.A00(this));
    }

    public C87563vO(Float f, String str, String str2) {
        this.A00 = f;
        this.A01 = str;
        this.A02 = str2;
    }
}
