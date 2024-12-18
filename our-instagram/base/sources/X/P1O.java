package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.model.sharelater.ShareLaterMedia;

/* loaded from: classes9.dex */
public final class P1O implements InterfaceC196338mP {
    public final int A00;
    public final Object A01;

    public P1O(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC196338mP
    public final /* synthetic */ void DeN() {
    }

    @Override // X.InterfaceC196338mP
    public final void DeO() {
        C50808McV c50808McV;
        FragmentActivity requireActivity;
        C82G c82g;
        Context requireContext;
        switch (this.A00) {
            case 0:
                ShareLaterFragment shareLaterFragment = (ShareLaterFragment) this.A01;
                EnumC53382NjX enumC53382NjX = EnumC53382NjX.A05;
                ShareLaterMedia shareLaterMedia = shareLaterFragment.A04;
                C14360o3.A0A(shareLaterMedia);
                enumC53382NjX.A08(shareLaterMedia, true);
                C131975xX c131975xX = C131965xW.A05;
                UserSession userSession = shareLaterFragment.A00;
                if (userSession != null) {
                    if (C131975xX.A01(userSession)) {
                        UserSession userSession2 = shareLaterFragment.A00;
                        if (userSession2 != null) {
                            C131975xX.A00(userSession2).A09(null, "share_later_relink");
                        }
                    }
                    C50808McV c50808McV2 = shareLaterFragment.appShareTable;
                    if (c50808McV2 != null) {
                        c50808McV2.A06(shareLaterFragment.A04);
                    }
                    ShareLaterFragment.A00(shareLaterFragment);
                    FragmentActivity requireActivity2 = shareLaterFragment.requireActivity();
                    UserSession userSession3 = shareLaterFragment.A00;
                    if (userSession3 != null) {
                        AbstractC54211Nxp.A00(requireActivity2, shareLaterFragment.getContext(), shareLaterFragment, C82G.A0I, userSession3, new PG7(shareLaterFragment, 0));
                        return;
                    }
                }
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            case 1:
                P0G p0g = (P0G) this.A01;
                UserSession userSession4 = p0g.A06;
                if (AbstractC55222Oeo.A0A(userSession4)) {
                    AbstractC25651Mw.A00(userSession4).E4s(new C56000OtX(true));
                }
                EnumC53382NjX enumC53382NjX2 = EnumC53382NjX.A05;
                NJK njk = p0g.A07;
                enumC53382NjX2.A08(OX2.A02(njk), true);
                C47Z A02 = OX2.A02(njk);
                C14360o3.A0B(userSession4, 0);
                if ((AbstractC166997dE.A0Y(userSession4).A03.Baz() != null || A02.Cq2()) && C18U.A06(C06090Tz.A05, userSession4, 36312505378669717L)) {
                    C23031Ai A00 = AbstractC23021Ah.A00(userSession4);
                    AbstractC31171DnF.A1S(A00, "on", A00.A7l, C23031Ai.A8c, 241);
                }
                C131975xX c131975xX2 = C131965xW.A05;
                if (C131975xX.A01(userSession4)) {
                    C131965xW A002 = C131975xX.A00(userSession4);
                    A002.A09(new P1W(p0g, A002), "share_sheet_relink");
                } else if (!AbstractC55222Oeo.A0A(userSession4) && (c50808McV = p0g.A03) != null) {
                    c50808McV.A06(OX2.A02(njk));
                }
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession4, 36326541332395985L)) {
                    return;
                }
                PG7 pg7 = new PG7(p0g, 2);
                boolean A06 = C18U.A06(c06090Tz, userSession4, 36325695223248146L);
                AbstractC59962oe abstractC59962oe = p0g.A05;
                if (A06) {
                    requireContext = abstractC59962oe.getContext();
                    requireActivity = abstractC59962oe.getActivity();
                    if (requireContext == null || requireActivity == null) {
                        return;
                    } else {
                        c82g = C82G.A0C;
                    }
                } else {
                    requireActivity = abstractC59962oe.requireActivity();
                    c82g = C82G.A0C;
                    requireContext = abstractC59962oe.requireContext();
                }
                AbstractC54211Nxp.A00(requireActivity, requireContext, abstractC59962oe, c82g, userSession4, pg7);
                return;
            default:
                C52527NLw c52527NLw = (C52527NLw) this.A01;
                C196218mC c196218mC = C196208mB.A03;
                UserSession userSession5 = c52527NLw.A06;
                if (!C196218mC.A00(userSession5)) {
                    c196218mC.A01(userSession5, null, "upsell", true, true);
                    C196208mB c196208mB = c52527NLw.A01;
                    if (c196208mB == null) {
                        c196208mB = OQ9.A00(userSession5);
                        c52527NLw.A01 = c196208mB;
                    }
                    c196208mB.A01(userSession5, "upsell", true);
                }
                C54764OHw c54764OHw = c52527NLw.A00;
                if (c54764OHw != null) {
                    c54764OHw.A00(true);
                }
                AbstractC25651Mw.A00(userSession5).A02(c52527NLw.A05, C55990OtN.class);
                return;
        }
    }
}
