package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class WES {
    public final UserSession A00;
    public final C38321qM A01;
    public final InterfaceC60442pS A02;
    public final C75113Zb A03;
    public final AbstractC33235ElU A04;
    public final EnumC39589Hdz A05;
    public final String A06;

    public static final void A00(WES wes) {
        Context context = wes.A04.getContext();
        if (context != null) {
            AbstractC31176DnK.A12(context, C3DN.A00);
        }
    }

    public static final void A01(WES wes) {
        UserSession userSession = wes.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 2342154921886876463L)) {
            AbstractC33235ElU abstractC33235ElU = wes.A04;
            C140966Yy c140966Yy = new C140966Yy((FragmentActivity) abstractC33235ElU.requireContextAs(FragmentActivity.class), userSession);
            c140966Yy.A0D(F78.A00().A00.A00(abstractC33235ElU.requireContext(), userSession, C05F.A0Y));
            c140966Yy.A04();
            return;
        }
        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(192), new HashMap());
        AbstractC33235ElU abstractC33235ElU2 = wes.A04;
        Context requireContext = abstractC33235ElU2.requireContext();
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0U = abstractC33235ElU2.getString(2131976333);
        igBloksScreenConfig.A0i = true;
        A01.A04(requireContext, igBloksScreenConfig);
    }

    public static final void A02(WES wes, String str) {
        new OLM(wes.A04, wes.A00).A02("upsell_bottom_sheet", wes.A06, wes.A05.A00, str);
    }

    public WES(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, AbstractC33235ElU abstractC33235ElU, EnumC39589Hdz enumC39589Hdz, String str) {
        AbstractC43594JPz.A1P(userSession, enumC39589Hdz);
        this.A04 = abstractC33235ElU;
        this.A00 = userSession;
        this.A06 = str;
        this.A05 = enumC39589Hdz;
        this.A01 = c38321qM;
        this.A03 = c75113Zb;
        this.A02 = interfaceC60442pS;
    }
}
