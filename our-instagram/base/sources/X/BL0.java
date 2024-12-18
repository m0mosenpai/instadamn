package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class BL0 extends C0T6 implements InterfaceC30867Dhg {
    public final C120985dq A00;
    public final C38321qM A01;
    public final C75113Zb A02;
    public final SearchContext A03;
    public final User A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public BL0(C120985dq c120985dq, C38321qM c38321qM, C75113Zb c75113Zb, SearchContext searchContext, User user, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C14360o3.A0B(num, 7);
        C14360o3.A0B(searchContext, 8);
        this.A00 = c120985dq;
        this.A01 = c38321qM;
        this.A04 = user;
        this.A02 = c75113Zb;
        this.A07 = z;
        this.A0C = z2;
        this.A05 = num;
        this.A03 = searchContext;
        this.A06 = z3;
        this.A0B = z4;
        this.A08 = z5;
        this.A0A = z6;
        this.A09 = z7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BL0) {
                BL0 bl0 = (BL0) obj;
                if (!C14360o3.A0K(this.A00, bl0.A00) || !C14360o3.A0K(this.A01, bl0.A01) || !C14360o3.A0K(this.A04, bl0.A04) || !C14360o3.A0K(this.A02, bl0.A02) || this.A07 != bl0.A07 || this.A0C != bl0.A0C || this.A05 != bl0.A05 || !C14360o3.A0K(this.A03, bl0.A03) || this.A06 != bl0.A06 || this.A0B != bl0.A0B || this.A08 != bl0.A08 || this.A0A != bl0.A0A || this.A09 != bl0.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A07, (AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00))) + AbstractC167017dG.A0M(this.A02)) * 31));
        int intValue = this.A05.intValue();
        if (1 != intValue) {
            str = "BLUE";
        } else {
            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
        return AbstractC166987dD.A0K(this.A09, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A03, AbstractC25231BEo.A0H(str, intValue, A0D)))))));
    }
}
