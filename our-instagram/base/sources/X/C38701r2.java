package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.1r2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38701r2 extends C0T6 implements InterfaceC38711r3 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    @Override // X.InterfaceC38711r3
    public final C38701r2 F3M(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38701r2) {
                C38701r2 c38701r2 = (C38701r2) obj;
                if (!C14360o3.A0K(this.A00, c38701r2.A00) || !C14360o3.A0K(this.A01, c38701r2.A01) || !C14360o3.A0K(this.A02, c38701r2.A02) || !C14360o3.A0K(this.A07, c38701r2.A07) || !C14360o3.A0K(this.A03, c38701r2.A03) || !C14360o3.A0K(this.A04, c38701r2.A04) || !C14360o3.A0K(this.A05, c38701r2.A05) || !C14360o3.A0K(this.A06, c38701r2.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.A07;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.A03;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A04;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A05;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A06;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @Override // X.InterfaceC38711r3
    public final String Atb() {
        return this.A00;
    }

    @Override // X.InterfaceC38711r3
    public final List BQh() {
        return this.A07;
    }

    @Override // X.InterfaceC38711r3
    public final String BWb() {
        return this.A03;
    }

    @Override // X.InterfaceC38711r3
    public final String Bjj() {
        return this.A04;
    }

    @Override // X.InterfaceC38711r3
    public final String C96() {
        return this.A05;
    }

    @Override // X.InterfaceC38711r3
    public final String CAR() {
        return this.A06;
    }

    @Override // X.InterfaceC38711r3
    public final InterfaceC38711r3 EB7(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC38711r3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTThreadsInStoriesUnitAcquisitionNetegoInStory", AbstractC40420HwB.A00(this));
    }

    @Override // X.InterfaceC38711r3
    public final String getCtaText() {
        return this.A01;
    }

    @Override // X.InterfaceC38711r3
    public final String getId() {
        return this.A02;
    }

    public C38701r2(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A07 = list;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
    }
}
