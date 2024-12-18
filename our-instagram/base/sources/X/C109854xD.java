package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4xD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109854xD extends C0T6 implements InterfaceC109864xE {
    public final C109874xF A00;
    public final InterfaceC31126Dm9 A01;
    public final InterfaceC31126Dm9 A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    @Override // X.InterfaceC109864xE
    public final C109854xD ErT() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109854xD) {
                C109854xD c109854xD = (C109854xD) obj;
                if (!C14360o3.A0K(this.A05, c109854xD.A05) || !C14360o3.A0K(this.A07, c109854xD.A07) || !C14360o3.A0K(this.A06, c109854xD.A06) || !C14360o3.A0K(this.A03, c109854xD.A03) || !C14360o3.A0K(this.A08, c109854xD.A08) || !C14360o3.A0K(this.A00, c109854xD.A00) || !C14360o3.A0K(this.A04, c109854xD.A04) || !C14360o3.A0K(this.A09, c109854xD.A09) || !C14360o3.A0K(this.A01, c109854xD.A01) || !C14360o3.A0K(this.A0A, c109854xD.A0A) || !C14360o3.A0K(this.A02, c109854xD.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A05;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.A07;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A06;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.A03;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C109874xF c109874xF = this.A00;
        int hashCode6 = (hashCode5 + (c109874xF == null ? 0 : c109874xF.hashCode())) * 31;
        Boolean bool2 = this.A04;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InterfaceC31126Dm9 interfaceC31126Dm9 = this.A01;
        int hashCode9 = (hashCode8 + (interfaceC31126Dm9 == null ? 0 : interfaceC31126Dm9.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        InterfaceC31126Dm9 interfaceC31126Dm92 = this.A02;
        return hashCode10 + (interfaceC31126Dm92 != null ? interfaceC31126Dm92.hashCode() : 0);
    }

    @Override // X.InterfaceC109864xE
    public final Integer AYQ() {
        return this.A05;
    }

    @Override // X.InterfaceC109864xE
    public final Integer AjC() {
        return this.A06;
    }

    @Override // X.InterfaceC109864xE
    public final Boolean BBL() {
        return this.A03;
    }

    @Override // X.InterfaceC109864xE
    public final String BDO() {
        return this.A08;
    }

    @Override // X.InterfaceC109864xE
    public final /* bridge */ /* synthetic */ InterfaceC109884xG BEg() {
        return this.A00;
    }

    @Override // X.InterfaceC109864xE
    public final InterfaceC31126Dm9 Brd() {
        return this.A01;
    }

    @Override // X.InterfaceC109864xE
    public final InterfaceC31126Dm9 C6A() {
        return this.A02;
    }

    @Override // X.InterfaceC109864xE
    public final Boolean CeI() {
        return this.A04;
    }

    @Override // X.InterfaceC109864xE
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTButtonSpec", CDA.A00(this));
    }

    @Override // X.InterfaceC109864xE
    public final String getActionUrl() {
        return this.A07;
    }

    @Override // X.InterfaceC109864xE
    public final String getSecondaryText() {
        return this.A09;
    }

    @Override // X.InterfaceC109864xE
    public final String getText() {
        return this.A0A;
    }

    public C109854xD(C109874xF c109874xF, InterfaceC31126Dm9 interfaceC31126Dm9, InterfaceC31126Dm9 interfaceC31126Dm92, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.A05 = num;
        this.A07 = str;
        this.A06 = num2;
        this.A03 = bool;
        this.A08 = str2;
        this.A00 = c109874xF;
        this.A04 = bool2;
        this.A09 = str3;
        this.A01 = interfaceC31126Dm9;
        this.A0A = str4;
        this.A02 = interfaceC31126Dm92;
    }
}
