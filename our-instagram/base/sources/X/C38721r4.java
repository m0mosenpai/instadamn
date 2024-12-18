package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.1r4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38721r4 extends C0T6 implements InterfaceC38731r5 {
    public final Boolean A00;
    public final Boolean A01;
    public final Long A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    @Override // X.InterfaceC38731r5
    public final C38721r4 Eym(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38721r4) {
                C38721r4 c38721r4 = (C38721r4) obj;
                if (!C14360o3.A0K(this.A04, c38721r4.A04) || !C14360o3.A0K(this.A05, c38721r4.A05) || !C14360o3.A0K(this.A02, c38721r4.A02) || !C14360o3.A0K(this.A00, c38721r4.A00) || !C14360o3.A0K(this.A01, c38721r4.A01) || !C14360o3.A0K(this.A06, c38721r4.A06) || !C14360o3.A0K(this.A07, c38721r4.A07) || !C14360o3.A0K(this.A08, c38721r4.A08) || !C14360o3.A0K(this.A09, c38721r4.A09) || !C14360o3.A0K(this.A03, c38721r4.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A05;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.A02;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A01;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.A06;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A07;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A08;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.A09;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.A03;
        return hashCode9 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // X.InterfaceC38731r5
    public final String AYe() {
        return this.A04;
    }

    @Override // X.InterfaceC38731r5
    public final String AvB() {
        return this.A05;
    }

    @Override // X.InterfaceC38731r5
    public final Long BF7() {
        return this.A02;
    }

    @Override // X.InterfaceC38731r5
    public final String BWb() {
        return this.A06;
    }

    @Override // X.InterfaceC38731r5
    public final String BWe() {
        return this.A07;
    }

    @Override // X.InterfaceC38731r5
    public final String CAR() {
        return this.A08;
    }

    @Override // X.InterfaceC38731r5
    public final List CAz() {
        return this.A09;
    }

    @Override // X.InterfaceC38731r5
    public final Long CBm() {
        return this.A03;
    }

    @Override // X.InterfaceC38731r5
    public final Boolean CdK() {
        return this.A00;
    }

    @Override // X.InterfaceC38731r5
    public final Boolean Cf0() {
        return this.A01;
    }

    @Override // X.InterfaceC38731r5
    public final InterfaceC38731r5 E9i(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC38731r5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPromptsNetegoInStory", AbstractC40195HsF.A00(this));
    }

    public C38721r4(Boolean bool, Boolean bool2, Long l, Long l2, String str, String str2, String str3, String str4, String str5, List list) {
        this.A04 = str;
        this.A05 = str2;
        this.A02 = l;
        this.A00 = bool;
        this.A01 = bool2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = list;
        this.A03 = l2;
    }
}
