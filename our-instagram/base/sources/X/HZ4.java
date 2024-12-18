package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HZ4 extends AbstractC40977ICy {
    public final Context A00;
    public final C41729Ie0 A01;
    public final IND A02;
    public final C38A A03;
    public final JI6 A04;
    public final UserSession A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HZ4(Context context, UserSession userSession, C41729Ie0 c41729Ie0, IND ind, C38A c38a, JI6 ji6, C41622IbC c41622IbC) {
        super(c41622IbC);
        AbstractC25234BEr.A0j(2, userSession, c41622IbC, ind, c41729Ie0);
        this.A00 = context;
        this.A05 = userSession;
        this.A02 = ind;
        this.A01 = c41729Ie0;
        this.A04 = ji6;
        this.A03 = c38a;
    }

    public static final void A00(C38321qM c38321qM, HZ4 hz4) {
        JI6 ji6 = hz4.A04;
        C41753IeT A00 = C41753IeT.A00(ji6);
        IIQ iiq = ji6.C02().A03;
        C14360o3.A07(iiq);
        A00.A03 = new IIQ(FeaturedProductPermissionStatus.A09, null, EnumC39591He1.A05, iiq.A03);
        C41617Ib7 c41617Ib7 = new C41617Ib7(ji6.C02().A04);
        UserSession userSession = hz4.A05;
        Product A002 = C41726Idx.A00(ji6);
        List A01 = ji6.C02().A04.A01(userSession, C41726Idx.A00(ji6));
        ArrayList A10 = AbstractC31174DnI.A10(A01);
        for (Object obj : A01) {
            IN1 in1 = (IN1) obj;
            if (!(in1 instanceof C39350HZp) || !C14360o3.A0K(((C39350HZp) in1).A01.getId(), c38321qM.getId())) {
                A10.add(obj);
            }
        }
        c41617Ib7.A00(userSession, A002, A10);
        A00.A04 = new C41723Idu(c41617Ib7);
        IH4 ih4 = ji6.C02().A05;
        C14360o3.A07(ih4);
        Map map = ih4.A00;
        C14360o3.A0C(map, AbstractC43591JPw.A00(437));
        Map A04 = C15500q5.A04(map);
        Map map2 = ih4.A02;
        Map map3 = ih4.A01;
        Iterator A15 = AbstractC166997dE.A15(A04);
        while (A15.hasNext()) {
            AbstractC65332xV abstractC65332xV = (AbstractC65332xV) AbstractC31176DnK.A0j(A15);
            abstractC65332xV.A0D(c38321qM);
            abstractC65332xV.A06();
        }
        A00.A05 = new IH4(A04, map2, map3);
        C41726Idx.A02(ji6, A00);
    }

    public static final void A01(C38819H7k c38819H7k, HZ4 hz4, String str, int i, boolean z) {
        JI6 ji6 = hz4.A04;
        C41753IeT A00 = C41753IeT.A00(ji6);
        IIQ iiq = ji6.C02().A03;
        C14360o3.A07(iiq);
        A00.A03 = new IIQ(iiq.A01, FeaturedProductPermissionStatus.A04, EnumC39591He1.A06, iiq.A03);
        C41726Idx.A02(ji6, A00);
        IND ind = hz4.A02;
        MIG mig = new MIG(hz4, c38819H7k, str, 10, z);
        C57264Pbm c57264Pbm = new C57264Pbm(hz4, c38819H7k, str, 2, z);
        AbstractC59962oe abstractC59962oe = ind.A00;
        UserSession userSession = ind.A01;
        String valueOf = String.valueOf(c38819H7k.A02);
        C14360o3.A0B(valueOf, 2);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("commerce/community/featured_products/permission_update_age_decision/");
        A0c.A9s("permission_id", valueOf);
        A0c.A0D("age_minimum", i);
        A0c.A0I("overage_decision", z);
        C1ON A0e = AbstractC25227BEk.A0e(A0c, HAE.class, ISQ.class);
        A0e.A00 = new C39028HGe(c57264Pbm, userSession, mig, valueOf, 2);
        abstractC59962oe.schedule(A0e);
    }

    public static final void A02(HZ4 hz4) {
        JI6 ji6 = hz4.A04;
        C41753IeT A00 = C41753IeT.A00(ji6);
        IIQ iiq = ji6.C02().A03;
        C14360o3.A07(iiq);
        A00.A03 = new IIQ(FeaturedProductPermissionStatus.A04, null, EnumC39591He1.A05, iiq.A03);
        C41726Idx.A02(ji6, A00);
    }

    public static final void A03(HZ4 hz4) {
        JI6 ji6 = hz4.A04;
        C41753IeT A00 = C41753IeT.A00(ji6);
        IIQ iiq = ji6.C02().A03;
        C14360o3.A07(iiq);
        A00.A03 = new IIQ(iiq.A01, null, EnumC39591He1.A04, iiq.A03);
        C41726Idx.A02(ji6, A00);
    }
}
