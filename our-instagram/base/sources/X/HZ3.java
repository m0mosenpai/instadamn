package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;
import com.instagram.shopping.model.pdp.link.secondarytext.SecondaryTextContent;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HZ3 extends AbstractC40977ICy {
    public final C41702IdW A00;
    public final C41727Idy A01;
    public final C40978ICz A02;
    public final JI6 A03;
    public final C41729Ie0 A04;
    public final IIL A05;
    public final C42411IqE A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HZ3(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41702IdW c41702IdW, C41727Idy c41727Idy, C41729Ie0 c41729Ie0, JI6 ji6, C41622IbC c41622IbC) {
        super(c41622IbC);
        AbstractC167007dF.A1G(userSession, 1, c41727Idy);
        AbstractC167007dF.A1I(c41729Ie0, 7, c41622IbC);
        this.A03 = ji6;
        this.A01 = c41727Idy;
        this.A00 = c41702IdW;
        this.A04 = c41729Ie0;
        this.A05 = new IIL(c41702IdW, c41727Idy, c41729Ie0, ji6);
        this.A06 = new C42411IqE(activity, interfaceC11380iw, userSession, c41702IdW, c41727Idy, ji6);
        this.A02 = new C40978ICz(c41729Ie0);
    }

    public final void A00(C39344HZj c39344HZj) {
        String str;
        ImageUrl Bhu;
        String str2;
        C14360o3.A0B(c39344HZj, 0);
        IIR iir = c39344HZj.A01;
        if (iir != null) {
            SecondaryTextContent secondaryTextContent = iir.A00;
            int intValue = iir.A01.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    C42411IqE c42411IqE = this.A06;
                    Product A00 = C41726Idx.A00(c42411IqE.A05);
                    if (A00 != null) {
                        C41702IdW c41702IdW = c42411IqE.A03;
                        if (c41702IdW != null) {
                            C38683GzO A03 = C128205qp.A03(c41702IdW.A03, A00);
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41702IdW.A02, "instagram_ads_app_message_advertiser_cta_click");
                            if (A0f.isSampled()) {
                                C38642Gyj c38642Gyj = c41702IdW.A01;
                                if (c38642Gyj == null || (str2 = c38642Gyj.A05) == null) {
                                    str2 = "";
                                }
                                AbstractC37300Gc1.A0o(A0f, C41702IdW.A00(A0f, c41702IdW, str2));
                                C41702IdW.A01(A0f, c41702IdW, C38683GzO.A01(A0f, A03));
                                A0f.Cht();
                            }
                        }
                        Parcelable.Creator creator = User.CREATOR;
                        User user = A00.A0B;
                        String str3 = null;
                        if (user != null) {
                            str3 = AbstractC76433bn.A00(user);
                            str = AbstractC37300Gc1.A0U(user);
                        } else {
                            str = null;
                        }
                        User user2 = new User(str3, str);
                        if (user != null && (Bhu = user.A03.Bhu()) != null) {
                            user2.A0i(Bhu);
                            UserSession userSession = c42411IqE.A02;
                            Bundle A002 = AbstractC61636Rr0.A00(AbstractC25230BEn.A1b("IgSessionManager.SESSION_TOKEN_KEY", userSession.token));
                            String A003 = AbstractC111324zv.A00(146);
                            A002.putString(A003, "shopping_pdp");
                            String A004 = AbstractC111324zv.A00(304);
                            A002.putParcelable(A004, A00);
                            if (secondaryTextContent != null) {
                                A002.putParcelable(AbstractC111324zv.A00(305), secondaryTextContent);
                            }
                            EMY A005 = F3M.A00(A002, c42411IqE, user2);
                            C3DO c3do = C3DN.A00;
                            Activity activity = c42411IqE.A00;
                            C3DN A006 = c3do.A00(activity);
                            if (A006 != null) {
                                if (((C3DP) A006).A0h) {
                                    C09530e4 A1L = AbstractC166987dD.A1L(A003, "shopping_pdp");
                                    C09530e4 A1L2 = AbstractC166987dD.A1L(A004, A00);
                                    C09530e4 A1L3 = AbstractC166987dD.A1L(AbstractC111324zv.A00(612), secondaryTextContent);
                                    C09530e4 A1L4 = AbstractC166987dD.A1L(AbstractC111324zv.A00(1576), c42411IqE.A01.getModuleName());
                                    C41727Idy c41727Idy = c42411IqE.A04;
                                    C6XJ A0L = AbstractC31171DnF.A0L(activity, AbstractC61636Rr0.A00(A1L, A1L2, A1L3, A1L4, AbstractC166987dD.A1L(AbstractC111324zv.A00(1575), c41727Idy.A0C), AbstractC166987dD.A1L(AbstractC111324zv.A00(1577), new ShoppingNavigationInfo("message_cta", c41727Idy.A0F, c41727Idy.A0D, c41727Idy.A0H)), AbstractC166987dD.A1L(MSV.A00(4), "message_merchant")), userSession, TransparentBackgroundModalActivity.class, "bottom_sheet");
                                    A0L.A09(0);
                                    A0L.A0C(activity.getApplicationContext());
                                    return;
                                }
                                A006.A0K(A005);
                                return;
                            }
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                return;
            }
            IIL iil = this.A05;
            C14360o3.A07(((AbstractC42328Ioq) c39344HZj).A02);
            Product A007 = C41726Idx.A00(iil.A03);
            if (A007 != null) {
                iil.A02.A04(A007);
                C41702IdW c41702IdW2 = iil.A00;
                if (c41702IdW2 == null) {
                    return;
                }
                c41702IdW2.A03(A007, "view_external_link");
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
