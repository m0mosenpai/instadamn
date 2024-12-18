package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* loaded from: classes9.dex */
public final class PK1 implements GZY {
    public final int A00;
    public final Object A01;

    public PK1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GZY
    public final void onAuthorizeFail() {
        if (3 - this.A00 == 0) {
            C56255Oy2 c56255Oy2 = (C56255Oy2) this.A01;
            C36731GHa c36731GHa = c56255Oy2.A05;
            c36731GHa.getClass();
            c36731GHa.A0D = false;
            c56255Oy2.A03.A05(false, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
        }
    }

    @Override // X.GZY
    public final void onAuthorizeSuccess(String str, String str2) {
        switch (this.A00) {
            case 0:
                C52136N5l c52136N5l = (C52136N5l) this.A01;
                C52136N5l.A01(c52136N5l, true);
                C131975xX c131975xX = C131965xW.A05;
                InterfaceC09390do interfaceC09390do = c52136N5l.A0C;
                if (C131975xX.A01(AbstractC31180DnO.A0M(interfaceC09390do))) {
                    MSZ.A0a(interfaceC09390do).A09(null, "advanced_setting_relink");
                }
                PG7 pg7 = new PG7(c52136N5l, 1);
                FragmentActivity requireActivity = c52136N5l.requireActivity();
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                AbstractC54211Nxp.A00(requireActivity, c52136N5l.getContext(), c52136N5l, C82G.A09, A0r, pg7);
                return;
            case 1:
                P1D p1d = (P1D) this.A01;
                P1D.A02(p1d, true);
                C131975xX c131975xX2 = C131965xW.A05;
                UserSession userSession = p1d.A05;
                if (C131975xX.A01(userSession)) {
                    C131975xX.A00(userSession).A09(null, "advanced_setting_relink");
                }
                PG7 pg72 = new PG7(p1d, 4);
                AbstractC59962oe abstractC59962oe = p1d.A04;
                AbstractC54211Nxp.A00(abstractC59962oe.requireActivity(), abstractC59962oe.requireContext(), abstractC59962oe, C82G.A09, userSession, pg72);
                return;
            case 2:
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController = (DirectPrivateStoryRecipientController) this.A01;
                AbstractC59962oe abstractC59962oe2 = directPrivateStoryRecipientController.A0w;
                final FragmentActivity activity = abstractC59962oe2.getActivity();
                if (activity == null) {
                    return;
                }
                if (AbstractC31178DnM.A1X(C06090Tz.A05, directPrivateStoryRecipientController.A0B, 36326541332133837L)) {
                    return;
                }
                InterfaceC57990Pna interfaceC57990Pna = new InterfaceC57990Pna() { // from class: X.PG8
                    @Override // X.InterfaceC57990Pna
                    public final void afterSelection(boolean z) {
                        PK1 pk1 = this;
                        FragmentActivity fragmentActivity = activity;
                        if (z) {
                            DirectPrivateStoryRecipientController directPrivateStoryRecipientController2 = (DirectPrivateStoryRecipientController) pk1.A01;
                            DirectPrivateStoryRecipientController.A04(directPrivateStoryRecipientController2);
                            Integer num = C05F.A0N;
                            AbstractC59962oe abstractC59962oe3 = directPrivateStoryRecipientController2.A0w;
                            int A00 = C3HB.A00(abstractC59962oe3.requireContext());
                            Context requireContext = abstractC59962oe3.requireContext();
                            CallerContext callerContext = NVk.A02;
                            C55088Oal.A01(requireContext, num, A00);
                            return;
                        }
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putString("bottom_sheet_content_fragment", "crossposting_upsell_action_sheet");
                        AbstractC50524MSc.A0C(fragmentActivity, A0b, ((DirectPrivateStoryRecipientController) pk1.A01).A0B);
                    }
                };
                UserSession userSession2 = directPrivateStoryRecipientController.A0B;
                C82G c82g = C82G.A0k;
                Context context = abstractC59962oe2.getContext();
                C14360o3.A0B(userSession2, 2);
                AbstractC54211Nxp.A00(activity, context, abstractC59962oe2, c82g, userSession2, interfaceC57990Pna);
                return;
            default:
                C56255Oy2 c56255Oy2 = (C56255Oy2) this.A01;
                C36731GHa c36731GHa = c56255Oy2.A05;
                c36731GHa.getClass();
                c36731GHa.A0D = true;
                c56255Oy2.A03.A05(true, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
                FragmentActivity fragmentActivity = c56255Oy2.A0B;
                PG7 pg73 = new PG7(this, 7);
                AbstractC33235ElU abstractC33235ElU = c56255Oy2.A0E;
                UserSession userSession3 = c56255Oy2.A0C;
                C82G c82g2 = C82G.A0r;
                Context context2 = c56255Oy2.A09;
                C14360o3.A0B(userSession3, 2);
                AbstractC54211Nxp.A00(fragmentActivity, context2, abstractC33235ElU, c82g2, userSession3, pg73);
                return;
        }
    }
}
