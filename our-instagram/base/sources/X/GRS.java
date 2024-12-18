package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.inbox.DirectInviteContactViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GRS implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    public GRS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        String A00;
        switch (this.A00) {
            case 0:
                EVU evu = (EVU) this.A01;
                FragmentActivity requireActivity = evu.A0m.requireActivity();
                AbstractC31265Don.A00().A00(requireActivity, EnumC33519Ers.A05, evu.A0g);
                C31600DuS c31600DuS = evu.A0o;
                C31641Dv7 c31641Dv7 = c31600DuS.A03;
                if (c31641Dv7 != null) {
                    String str = c31641Dv7.A02;
                    if (str != null) {
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c31641Dv7.A05, "omnipicker_search_create");
                        if (A0f.isSampled()) {
                            boolean A06 = C18U.A06(C06090Tz.A05, c31641Dv7.A06, 36325081042924215L);
                            AbstractC31172DnG.A1P(A0f, str);
                            AbstractC166997dE.A1N(A0f, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, 6);
                            if (A06) {
                                A00 = "ai_studio_v1.5";
                            } else {
                                A00 = AbstractC111324zv.A00(1905);
                            }
                            A0f.AAP("ai_home_version", A00);
                            A0f.Cht();
                        }
                    }
                    C32872EdE c32872EdE = c31600DuS.A02;
                    if (c32872EdE != null) {
                        c32872EdE.A02();
                    }
                }
                requireActivity.finish();
                return null;
            case 1:
                C36010Fv8 c36010Fv8 = (C36010Fv8) this.A01;
                DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) obj;
                Context context = c36010Fv8.A07;
                UserSession userSession = c36010Fv8.A0D;
                boolean A01 = C54P.A01(context, userSession);
                EnumC33510Erj enumC33510Erj = EnumC33510Erj.DIRECT_MESSAGE_SEARCH;
                if (A01) {
                    EnumC33500ErZ enumC33500ErZ = EnumC33500ErZ.CONTACT_SMS;
                    AbstractC35249Fgi.A03(enumC33510Erj, enumC33500ErZ, userSession, A01);
                    if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36326438253049726L)) {
                        c36010Fv8.A0I.CkK(directInviteContactViewModel, 43, directInviteContactViewModel.A00, directInviteContactViewModel.A03, directInviteContactViewModel.A05, directInviteContactViewModel.A04);
                    }
                    FYI.A01(c36010Fv8.A0A, enumC33510Erj, enumC33500ErZ, userSession, C05F.A0u, directInviteContactViewModel.A06);
                    return null;
                }
                AbstractC35249Fgi.A06(enumC33510Erj, userSession, A01);
                AbstractC35249Fgi.A03(enumC33510Erj, EnumC33500ErZ.SYSTEM_SHARE_SHEET, userSession, A01);
                if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36326438253049726L)) {
                    c36010Fv8.A0I.CkK(directInviteContactViewModel, 6, directInviteContactViewModel.A00, directInviteContactViewModel.A03, directInviteContactViewModel.A05, directInviteContactViewModel.A04);
                }
                EnumC33425Epw enumC33425Epw = EnumC33425Epw.A0J;
                AbstractC59962oe abstractC59962oe = c36010Fv8.A0A;
                AbstractC31510Dsu.A0T(abstractC59962oe, enumC33510Erj, abstractC59962oe, userSession, enumC33425Epw, new Runnable() { // from class: X.GKS
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
                return null;
            case 2:
                WGI.A03(((C32897Ede) this.A01).A00.A0M, null, null, null);
                return null;
            case 3:
                C32897Ede c32897Ede = (C32897Ede) this.A01;
                C146106i8 A0Y = AbstractC31174DnI.A0Y();
                AbstractC25226BEj.A1N(c32897Ede.A00.A0M, A0Y, 2131966567);
                AbstractC25233BEq.A1F(A0Y);
                return null;
            case 4:
                ((C35151Fet) this.A01).A05.DdL((DirectShareTarget) obj);
                return C0eB.A00;
            case 5:
                ((User) this.A01).A16(true);
                return C0eB.A00;
            default:
                Boolean bool = (Boolean) obj;
                C31370Dqa c31370Dqa = ((C31721DwQ) this.A01).A0j;
                if (c31370Dqa != null) {
                    c31370Dqa.A02(null, bool);
                }
                return C0eB.A00;
        }
    }
}
