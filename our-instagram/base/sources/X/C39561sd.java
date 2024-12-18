package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.1sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39561sd extends C0T6 implements InterfaceC39571se {
    public final Boolean A00;
    public final Double A01;
    public final Double A02;
    public final Double A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    @Override // X.InterfaceC39571se
    public final C39561sd Eyq() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39561sd) {
                C39561sd c39561sd = (C39561sd) obj;
                if (!C14360o3.A0K(this.A00, c39561sd.A00) || !C14360o3.A0K(this.A01, c39561sd.A01) || !C14360o3.A0K(this.A04, c39561sd.A04) || !C14360o3.A0K(this.A05, c39561sd.A05) || !C14360o3.A0K(this.A02, c39561sd.A02) || !C14360o3.A0K(this.A06, c39561sd.A06) || !C14360o3.A0K(this.A03, c39561sd.A03) || !C14360o3.A0K(this.A07, c39561sd.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.A01;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.A04;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A05;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.A02;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.A06;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d3 = this.A03;
        int hashCode7 = (hashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        List list = this.A07;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    @Override // X.InterfaceC39571se
    public final /* bridge */ /* synthetic */ C103484lO AKW() {
        return new C103484lO(this);
    }

    @Override // X.InterfaceC39571se
    public final Boolean B1k() {
        return this.A00;
    }

    @Override // X.InterfaceC39571se
    public final Double BQC() {
        return this.A01;
    }

    @Override // X.InterfaceC39571se
    public final String Bew() {
        return this.A04;
    }

    @Override // X.InterfaceC39571se
    public final String Bex() {
        return this.A05;
    }

    @Override // X.InterfaceC39571se
    public final Double BfM() {
        return this.A02;
    }

    @Override // X.InterfaceC39571se
    public final String BjF() {
        return this.A06;
    }

    @Override // X.InterfaceC39571se
    public final Double C8M() {
        return this.A03;
    }

    @Override // X.InterfaceC39571se
    public final List CDr() {
        return this.A07;
    }

    @Override // X.InterfaceC39571se
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPushupClientGapRulesClientDict", AbstractC37395Gdb.A00(this));
    }

    public C39561sd(Boolean bool, Double d, Double d2, Double d3, String str, String str2, String str3, List list) {
        this.A00 = bool;
        this.A01 = d;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = d2;
        this.A06 = str3;
        this.A03 = d3;
        this.A07 = list;
    }
}
