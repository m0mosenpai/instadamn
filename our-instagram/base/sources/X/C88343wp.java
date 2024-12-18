package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88343wp extends C0T6 implements InterfaceC88353wq {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    @Override // X.InterfaceC88353wq
    public final C88343wp EtF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88343wp) {
                C88343wp c88343wp = (C88343wp) obj;
                if (!C14360o3.A0K(this.A01, c88343wp.A01) || !C14360o3.A0K(this.A02, c88343wp.A02) || !C14360o3.A0K(this.A03, c88343wp.A03) || !C14360o3.A0K(this.A04, c88343wp.A04) || !C14360o3.A0K(this.A05, c88343wp.A05) || !C14360o3.A0K(this.A00, c88343wp.A00) || !C14360o3.A0K(this.A06, c88343wp.A06) || !C14360o3.A0K(this.A07, c88343wp.A07) || !C14360o3.A0K(this.A08, c88343wp.A08) || !C14360o3.A0K(this.A09, c88343wp.A09)) {
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
        String str3 = this.A03;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A04;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A05;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.A06;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A07;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A08;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.A09;
        return hashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    @Override // X.InterfaceC88353wq
    public final String AYx() {
        return this.A01;
    }

    @Override // X.InterfaceC88353wq
    public final String B3H() {
        return this.A02;
    }

    @Override // X.InterfaceC88353wq
    public final String B3M() {
        return this.A03;
    }

    @Override // X.InterfaceC88353wq
    public final String BIx() {
        return this.A04;
    }

    @Override // X.InterfaceC88353wq
    public final String BIy() {
        return this.A05;
    }

    @Override // X.InterfaceC88353wq
    public final String Byt() {
        return this.A06;
    }

    @Override // X.InterfaceC88353wq
    public final String C8y() {
        return this.A08;
    }

    @Override // X.InterfaceC88353wq
    public final String C9b() {
        return this.A09;
    }

    @Override // X.InterfaceC88353wq
    public final Boolean CU3() {
        return this.A00;
    }

    @Override // X.InterfaceC88353wq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTExploreDict", AbstractC37381GdN.A00(this));
    }

    @Override // X.InterfaceC88353wq
    public final String getTitle() {
        return this.A07;
    }

    public C88343wp(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A00 = bool;
        this.A06 = str6;
        this.A07 = str7;
        this.A08 = str8;
        this.A09 = str9;
    }
}
