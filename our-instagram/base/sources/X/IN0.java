package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IN0 {
    public EnumC39539HdB A00;
    public final Context A01;
    public final AbstractC018607g A02;
    public final UserSession A03;
    public final String A04;

    public IN0(Context context, AbstractC018607g abstractC018607g, UserSession userSession, String str) {
        AbstractC167007dF.A1F(userSession, 2, str);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = abstractC018607g;
        this.A04 = str;
        this.A00 = EnumC39539HdB.A03;
    }

    public final void A00(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        AbstractC167017dG.A1N(interfaceC16660sJ, interfaceC16660sJ2);
        Context context = this.A01;
        AbstractC018607g abstractC018607g = this.A02;
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A03);
        A0M.A0B("commerce/community/featured_products/merchant_management/");
        A0M.A9s("merchant_id", this.A04);
        C1ON A0e = AbstractC25227BEk.A0e(A0M, C38891HAn.class, IST.class);
        C37460Gee.A00(A0e, interfaceC16660sJ2, this, interfaceC16660sJ, 7);
        C1GJ.A00(context, abstractC018607g, A0e);
    }

    public final void A01(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        AbstractC167017dG.A1N(interfaceC16660sJ, interfaceC16660sJ2);
        Context context = this.A01;
        AbstractC018607g abstractC018607g = this.A02;
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A03);
        A0M.A0B("commerce/community/featured_products/merchant_management/");
        A0M.A9s("merchant_id", this.A04);
        C1ON A0e = AbstractC25227BEk.A0e(A0M, C38890HAm.class, ISS.class);
        C37460Gee.A00(A0e, interfaceC16660sJ2, this, interfaceC16660sJ, 8);
        C1GJ.A00(context, abstractC018607g, A0e);
    }
}
