package X;

import android.app.Activity;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Ijw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42027Ijw implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC42027Ijw(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        Integer num;
        Integer num2;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-329289799);
                ((C37607Gh2) this.A02).A0H.A0D((EnumC39627Hel) this.A01);
                i = 535477782;
                break;
            case 1:
                A05 = C0f9.A05(1440921431);
                ((C37607Gh2) this.A02).A0H.A0D((EnumC39627Hel) this.A01);
                i = -1032847137;
                break;
            case 2:
                A05 = A00(this, 1525722809);
                i = 1391452372;
                break;
            case 3:
                A05 = A00(this, 1255909876);
                i = -1140452973;
                break;
            case 4:
                A05 = A00(this, 1000959234);
                i = 1466779105;
                break;
            case 5:
                A05 = A00(this, 1959153005);
                i = 419780849;
                break;
            case 6:
                A05 = C0f9.A05(874908576);
                IJP ijp = (IJP) this.A02;
                ijp.A04.A0L(ijp.A01, (Integer) this.A01, null, null, "three_dot_menu");
                i = 1075313945;
                break;
            case 7:
                A05 = C0f9.A05(-49461173);
                C39485HcD c39485HcD = (C39485HcD) this.A02;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c39485HcD.A0E.invoke(this.A01);
                i = 493958057;
                break;
            case 8:
                A05 = C0f9.A05(-1685049884);
                C39485HcD c39485HcD2 = (C39485HcD) this.A02;
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c39485HcD2.A0E.invoke(this.A01);
                i = -1868601520;
                break;
            case 9:
                A05 = C0f9.A05(591160852);
                C39485HcD c39485HcD3 = (C39485HcD) this.A02;
                HE0 he0 = (HE0) this.A01;
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c39485HcD3.A08.setEnabled(false);
                InterfaceC1118152j interfaceC1118152j = he0.A00;
                if (interfaceC1118152j != null && AbstractC166997dE.A1Z(interfaceC1118152j.CcM(), true)) {
                    Activity activity = c39485HcD3.A02;
                    UserSession userSession = c39485HcD3.A07;
                    C38321qM c38321qM = c39485HcD3.A0C;
                    D8I d8i = new D8I(27, he0, c39485HcD3);
                    C14360o3.A0B(activity, 0);
                    C14360o3.A0B(userSession, 1);
                    C14360o3.A0B(c38321qM, 3);
                    C2JM A0b = AbstractC25225BEi.A0b();
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    String str = he0.A04;
                    A0b.A04(AbstractC43591JPw.A00(74), str);
                    C18C.A0E(AbstractC167007dF.A1W(str));
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "UnsaveCutoutStickerMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59211Qaj.class, true, null, 0, null, "xdt_unsave_cutout_sticker", AbstractC166987dD.A1E());
                    AbstractC40691uc.A01(userSession).ATV(new C48147LSw(3, activity, userSession, d8i), new C42100IlA(he0, userSession, c38321qM, d8i, 1), pandoGraphQLRequest);
                    C8EV c8ev = (C8EV) c39485HcD3.A0D.getValue();
                    if (c39485HcD3.A0F) {
                        num2 = C05F.A0C;
                    } else {
                        num2 = C05F.A0N;
                    }
                    C14360o3.A0B(num2, 0);
                    C8EV.A00(c8ev, num2, null, null, null, "cutout_unsave_button_clicked");
                } else {
                    AbstractC23121AKf.A01(c39485HcD3.A02, he0, c39485HcD3.A07, c39485HcD3.A0C, new D8I(28, he0, c39485HcD3));
                    C8EV c8ev2 = (C8EV) c39485HcD3.A0D.getValue();
                    if (c39485HcD3.A0F) {
                        num = C05F.A0C;
                    } else {
                        num = C05F.A0N;
                    }
                    Integer num3 = C05F.A01;
                    C14360o3.A0B(num, 0);
                    C8EV.A00(c8ev2, num, null, num3, null, AbstractC43591JPw.A00(897));
                }
                i = 2144643774;
                break;
            case 10:
                A05 = C0f9.A05(43603943);
                User user = (User) this.A01;
                if (user != null) {
                    C14360o3.A0C(view, "null cannot be cast to non-null type com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton");
                    FadeInFollowButton fadeInFollowButton = (FadeInFollowButton) view;
                    C37434GeE c37434GeE = (C37434GeE) this.A02;
                    UserSession userSession2 = c37434GeE.A05;
                    C33276EnX c33276EnX = new C33276EnX(2);
                    C42766Iw4 c42766Iw4 = new C42766Iw4(c37434GeE);
                    C38321qM c38321qM2 = c37434GeE.A00;
                    String str2 = c37434GeE.A09;
                    boolean A06 = C18U.A06(C06090Tz.A05, userSession2, 36312475314095235L);
                    Boolean valueOf = Boolean.valueOf(A06);
                    fadeInFollowButton.A08 = user;
                    fadeInFollowButton.A03 = userSession2;
                    fadeInFollowButton.A07 = c33276EnX;
                    fadeInFollowButton.A06 = c42766Iw4;
                    fadeInFollowButton.A04 = c38321qM2;
                    fadeInFollowButton.A09 = str2;
                    fadeInFollowButton.A0A = null;
                    fadeInFollowButton.A05 = null;
                    fadeInFollowButton.A0B = true;
                    FadeInFollowButton.A03(fadeInFollowButton);
                    if (A06) {
                        FadeInFollowButton.A02(fadeInFollowButton);
                    }
                    fadeInFollowButton.postDelayed(new RunnableC43122J4l(fadeInFollowButton, valueOf), 1500L);
                }
                i = -1367814990;
                break;
            case 11:
                A05 = C0f9.A05(-442917738);
                IE7 ie7 = ((HF4) this.A02).A00;
                C38321qM c38321qM3 = (C38321qM) this.A01;
                C37986GnW c37986GnW = ie7.A00;
                CallerContext callerContext = C37986GnW.A11;
                c37986GnW.A0U.A0J(c38321qM3);
                i = 1645100525;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(958820102);
                ReelDashboardFragment reelDashboardFragment = ((HIV) this.A01).A02;
                C42331Iot c42331Iot = (C42331Iot) this.A02;
                C41181vS c41181vS = c42331Iot.A03;
                String str3 = c42331Iot.A04;
                if (!c41181vS.A1D()) {
                    ReelDashboardFragment.A06(c41181vS, reelDashboardFragment, str3);
                }
                i = -753163366;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C38262Gs5 c38262Gs5 = (C38262Gs5) this.A01;
                c38262Gs5.A0B.A0K((C41181vS) this.A02);
                return;
            case 14:
                C38262Gs5 c38262Gs52 = (C38262Gs5) this.A01;
                c38262Gs52.A0B.A0J((C38321qM) this.A02);
                return;
            default:
                ((ReelDashboardFragment) this.A01).A0K((C41181vS) this.A02);
                return;
        }
        C0f9.A0C(i, A05);
    }

    public static int A00(ViewOnClickListenerC42027Ijw viewOnClickListenerC42027Ijw, int i) {
        int A05 = C0f9.A05(i);
        ((C37608Gh3) viewOnClickListenerC42027Ijw.A02).A0D((EnumC39627Hel) viewOnClickListenerC42027Ijw.A01);
        return A05;
    }
}
