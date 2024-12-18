package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.1qi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38541qi extends C0T6 implements InterfaceC38551qj {
    public final H7Y A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    @Override // X.InterfaceC38551qj
    public final C38541qi F5I() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38541qi) {
                C38541qi c38541qi = (C38541qi) obj;
                if (!C14360o3.A0K(this.A04, c38541qi.A04) || !C14360o3.A0K(this.A01, c38541qi.A01) || !C14360o3.A0K(this.A00, c38541qi.A00) || !C14360o3.A0K(this.A05, c38541qi.A05) || !C14360o3.A0K(this.A09, c38541qi.A09) || !C14360o3.A0K(this.A02, c38541qi.A02) || !C14360o3.A0K(this.A03, c38541qi.A03) || !C14360o3.A0K(this.A06, c38541qi.A06) || !C14360o3.A0K(this.A07, c38541qi.A07) || !C14360o3.A0K(this.A08, c38541qi.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A01;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        H7Y h7y = this.A00;
        int hashCode3 = (hashCode2 + (h7y == null ? 0 : h7y.hashCode())) * 31;
        String str2 = this.A05;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.A09;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.A02;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A03;
        int hashCode7 = (((((hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + this.A06.hashCode()) * 31) + this.A07.hashCode()) * 31;
        String str3 = this.A08;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public C38541qi(H7Y h7y, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, List list) {
        C14360o3.A0B(str3, 8);
        C14360o3.A0B(str4, 9);
        this.A04 = str;
        this.A01 = bool;
        this.A00 = h7y;
        this.A05 = str2;
        this.A09 = list;
        this.A02 = bool2;
        this.A03 = bool3;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
    }

    @Override // X.InterfaceC38551qj
    public final String AZE() {
        return this.A04;
    }

    @Override // X.InterfaceC38551qj
    public final /* bridge */ /* synthetic */ JLF BMt() {
        return this.A00;
    }

    @Override // X.InterfaceC38551qj
    public final String BgS() {
        return this.A05;
    }

    @Override // X.InterfaceC38551qj
    public final List Bjh() {
        return this.A09;
    }

    @Override // X.InterfaceC38551qj
    public final Boolean Bwi() {
        return this.A02;
    }

    @Override // X.InterfaceC38551qj
    public final Boolean Bwo() {
        return this.A03;
    }

    @Override // X.InterfaceC38551qj
    public final String C4U() {
        return this.A06;
    }

    @Override // X.InterfaceC38551qj
    public final String C4V() {
        return this.A07;
    }

    @Override // X.InterfaceC38551qj
    public final String CAR() {
        return this.A08;
    }

    @Override // X.InterfaceC38551qj
    public final Boolean CSW() {
        return this.A01;
    }

    @Override // X.InterfaceC38551qj
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTResearchSurvey", I2V.A00(this));
    }
}
