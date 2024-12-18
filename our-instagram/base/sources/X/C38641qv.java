package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.1qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38641qv extends C0T6 implements InterfaceC38651qw {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    @Override // X.InterfaceC38651qw
    public final C38641qv Ezb(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38641qv) {
                C38641qv c38641qv = (C38641qv) obj;
                if (!C14360o3.A0K(this.A00, c38641qv.A00) || !C14360o3.A0K(this.A04, c38641qv.A04) || !C14360o3.A0K(this.A05, c38641qv.A05) || !C14360o3.A0K(this.A06, c38641qv.A06) || !C14360o3.A0K(this.A07, c38641qv.A07) || !C14360o3.A0K(this.A08, c38641qv.A08) || !C14360o3.A0K(this.A01, c38641qv.A01) || !C14360o3.A0K(this.A02, c38641qv.A02) || !C14360o3.A0K(this.A03, c38641qv.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.A04;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.A05;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A07;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.A08;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.A01;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A02;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A03;
        return hashCode8 + (num4 != null ? num4.hashCode() : 0);
    }

    @Override // X.InterfaceC38651qw
    public final Integer BXo() {
        return this.A00;
    }

    @Override // X.InterfaceC38651qw
    public final Long By8() {
        return this.A04;
    }

    @Override // X.InterfaceC38651qw
    public final String By9() {
        return this.A05;
    }

    @Override // X.InterfaceC38651qw
    public final String ByA() {
        return this.A06;
    }

    @Override // X.InterfaceC38651qw
    public final String ByB() {
        return this.A07;
    }

    @Override // X.InterfaceC38651qw
    public final List C0w() {
        return this.A08;
    }

    @Override // X.InterfaceC38651qw
    public final Integer C9i() {
        return this.A01;
    }

    @Override // X.InterfaceC38651qw
    public final Integer C9s() {
        return this.A02;
    }

    @Override // X.InterfaceC38651qw
    public final Integer C9t() {
        return this.A03;
    }

    @Override // X.InterfaceC38651qw
    public final InterfaceC38651qw E9s(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC38651qw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSnapshotData", AbstractC40251HtH.A00(this));
    }

    public C38641qv(Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, List list) {
        this.A00 = num;
        this.A04 = l;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = list;
        this.A01 = num2;
        this.A02 = num3;
        this.A03 = num4;
    }
}
