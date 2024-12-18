package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.1sA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1sA extends C0T6 implements InterfaceC39301sB {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC39301sB
    public final C1sA Erm() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1sA) {
                C1sA c1sA = (C1sA) obj;
                if (!C14360o3.A0K(this.A02, c1sA.A02) || !C14360o3.A0K(this.A03, c1sA.A03) || !C14360o3.A0K(this.A04, c1sA.A04) || !C14360o3.A0K(this.A01, c1sA.A01) || !C14360o3.A0K(this.A00, c1sA.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A03;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A04;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.A01;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A00;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // X.InterfaceC39301sB
    public final String An3() {
        return this.A02;
    }

    @Override // X.InterfaceC39301sB
    public final String BFW() {
        return this.A03;
    }

    @Override // X.InterfaceC39301sB
    public final String BJP() {
        return this.A04;
    }

    @Override // X.InterfaceC39301sB
    public final Integer BYF() {
        return this.A01;
    }

    @Override // X.InterfaceC39301sB
    public final Boolean Bvo() {
        return this.A00;
    }

    @Override // X.InterfaceC39301sB
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClickToJoinAdsInfo", AbstractC37387GdT.A00(this));
    }

    public C1sA(Boolean bool, Integer num, String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = num;
        this.A00 = bool;
    }
}
