package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.1qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38591qp extends C0T6 implements InterfaceC38601qq {
    public final C38708H2u A00;
    public final C38321qM A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // X.InterfaceC38601qq
    public final C38591qp EzQ(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38591qp) {
                C38591qp c38591qp = (C38591qp) obj;
                if (!C14360o3.A0K(this.A00, c38591qp.A00) || !C14360o3.A0K(this.A03, c38591qp.A03) || !C14360o3.A0K(this.A02, c38591qp.A02) || !C14360o3.A0K(this.A01, c38591qp.A01) || !C14360o3.A0K(this.A04, c38591qp.A04) || !C14360o3.A0K(this.A05, c38591qp.A05) || !C14360o3.A0K(this.A06, c38591qp.A06) || !C14360o3.A0K(this.A07, c38591qp.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C38708H2u c38708H2u = this.A00;
        int hashCode = (c38708H2u == null ? 0 : c38708H2u.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.A02;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        C38321qM c38321qM = this.A01;
        int hashCode4 = (hashCode3 + (c38321qM == null ? 0 : c38321qM.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A05;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A07;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // X.InterfaceC38601qq
    public final /* bridge */ /* synthetic */ InterfaceC43555JLp Api() {
        return this.A00;
    }

    @Override // X.InterfaceC38601qq
    public final Long BF7() {
        return this.A02;
    }

    @Override // X.InterfaceC38601qq
    public final C38321qM BQN() {
        return this.A01;
    }

    @Override // X.InterfaceC38601qq
    public final String BWb() {
        return this.A04;
    }

    @Override // X.InterfaceC38601qq
    public final String CAR() {
        return this.A07;
    }

    @Override // X.InterfaceC38601qq
    public final InterfaceC38601qq E9p(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC38601qq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShareCommentToStoryNetegoInStory", AbstractC40235Hsy.A00(this));
    }

    @Override // X.InterfaceC38601qq
    public final String getCtaText() {
        return this.A03;
    }

    @Override // X.InterfaceC38601qq
    public final String getSubtitle() {
        return this.A05;
    }

    @Override // X.InterfaceC38601qq
    public final String getTitle() {
        return this.A06;
    }

    public C38591qp(C38708H2u c38708H2u, C38321qM c38321qM, Long l, String str, String str2, String str3, String str4, String str5) {
        this.A00 = c38708H2u;
        this.A03 = str;
        this.A02 = l;
        this.A01 = c38321qM;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
    }
}
