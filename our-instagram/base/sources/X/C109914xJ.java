package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.4xJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109914xJ extends C0T6 implements InterfaceC109924xK {
    public final C66643URh A00;
    public final User A01;
    public final Integer A02;
    public final Integer A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    @Override // X.InterfaceC109924xK
    public final InterfaceC109924xK E96(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC109924xK
    public final C109914xJ Eti(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109914xJ) {
                C109914xJ c109914xJ = (C109914xJ) obj;
                if (!C14360o3.A0K(this.A01, c109914xJ.A01) || !C14360o3.A0K(this.A00, c109914xJ.A00) || !C14360o3.A0K(this.A02, c109914xJ.A02) || !C14360o3.A0K(this.A03, c109914xJ.A03) || !C14360o3.A0K(this.A06, c109914xJ.A06) || !C14360o3.A0K(this.A07, c109914xJ.A07) || !C14360o3.A0K(this.A08, c109914xJ.A08) || !C14360o3.A0K(this.A09, c109914xJ.A09) || !C14360o3.A0K(this.A0A, c109914xJ.A0A) || !C14360o3.A0K(this.A0B, c109914xJ.A0B) || !C14360o3.A0K(this.A0C, c109914xJ.A0C) || !C14360o3.A0K(this.A0D, c109914xJ.A0D) || !C14360o3.A0K(this.A04, c109914xJ.A04) || !C14360o3.A0K(this.A05, c109914xJ.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        User user = this.A01;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        C66643URh c66643URh = this.A00;
        int hashCode2 = (hashCode + (c66643URh == null ? 0 : c66643URh.hashCode())) * 31;
        Integer num = this.A02;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A03;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.A06;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A09;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0A;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0B;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A0C;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0D;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l = this.A04;
        int hashCode13 = (hashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.A05;
        return hashCode13 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // X.InterfaceC109924xK
    public final User AnG() {
        return this.A01;
    }

    @Override // X.InterfaceC109924xK
    public final /* bridge */ /* synthetic */ XGE Aqa() {
        return this.A00;
    }

    @Override // X.InterfaceC109924xK
    public final Integer Ayx() {
        return this.A02;
    }

    @Override // X.InterfaceC109924xK
    public final Integer Ayy() {
        return this.A03;
    }

    @Override // X.InterfaceC109924xK
    public final String B87() {
        return this.A07;
    }

    @Override // X.InterfaceC109924xK
    public final String B88() {
        return this.A08;
    }

    @Override // X.InterfaceC109924xK
    public final String B89() {
        return this.A09;
    }

    @Override // X.InterfaceC109924xK
    public final String B8B() {
        return this.A0A;
    }

    @Override // X.InterfaceC109924xK
    public final String B8C() {
        return this.A0B;
    }

    @Override // X.InterfaceC109924xK
    public final Long BNw() {
        return this.A04;
    }

    @Override // X.InterfaceC109924xK
    public final Long BzW() {
        return this.A05;
    }

    @Override // X.InterfaceC109924xK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFundRaiser", VOK.A00(this));
    }

    @Override // X.InterfaceC109924xK
    public final String getFormattedAmountRaised() {
        return this.A06;
    }

    @Override // X.InterfaceC109924xK
    public final String getFormattedGoalAmount() {
        return this.A0C;
    }

    @Override // X.InterfaceC109924xK
    public final String getFundraiserTitle() {
        return this.A0D;
    }

    public C109914xJ(C66643URh c66643URh, User user, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A01 = user;
        this.A00 = c66643URh;
        this.A02 = num;
        this.A03 = num2;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A0B = str6;
        this.A0C = str7;
        this.A0D = str8;
        this.A04 = l;
        this.A05 = l2;
    }
}
