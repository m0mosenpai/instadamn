package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.urlhandlers.aistudio.AiStudioUrlHandlerActivity;

/* loaded from: classes6.dex */
public final class Em0 extends AnonymousClass522 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i;
        android.net.Uri A03;
        Object obj;
        Context context;
        UserSession userSession;
        C2Fb c2Fb;
        String str;
        Context context2;
        AbstractC32317ELg abstractC32317ELg;
        AbstractC18680vv abstractC18680vv;
        String A02;
        int i2;
        C140966Yy A0O;
        switch (this.A00) {
            case 0:
                i = 980;
                A03 = AbstractC08820cl.A03(AbstractC111324zv.A00(i));
                obj = this.A02;
                C12260kU.A0G((Context) obj, A03);
                return;
            case 1:
                i = 2460;
                A03 = AbstractC08820cl.A03(AbstractC111324zv.A00(i));
                obj = this.A02;
                C12260kU.A0G((Context) obj, A03);
                return;
            case 2:
                Context context3 = (Context) this.A01;
                AbstractC12990ll A0o = AbstractC166987dD.A0o(((EJL) this.A02).A07);
                C14360o3.A0B(A0o, 1);
                AbstractC35237FgW.A04(context3, A0o, "https://www.facebook.com/help/instagram/1754230088373607?ref=learn_more", AbstractC166997dE.A0p(context3, 2131965052));
                return;
            case 3:
                C14360o3.A0B(view, 0);
                AbstractC34763FTi.A01((Context) this.A01, AbstractC166987dD.A0r(((EHU) this.A02).A00));
                return;
            case 4:
                context = (Context) this.A01;
                userSession = (UserSession) this.A02;
                c2Fb = C2Fb.A1V;
                str = "https://help.instagram.com/477434105621119";
                AbstractC31177DnL.A0u(context, userSession, c2Fb, str);
                return;
            case 5:
                C14360o3.A0B(view, 0);
                C35133Fea c35133Fea = SimpleWebViewActivity.A02;
                Context context4 = (Context) this.A01;
                c35133Fea.A02(context4, (AbstractC12990ll) this.A02, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, context4.getString(2131965052), AbstractC43591JPw.A00(1035)));
                return;
            case 6:
                context = (Context) this.A01;
                userSession = ((G3L) this.A02).A02;
                c2Fb = C2Fb.A1W;
                str = "https://help.instagram.com/1719149968895799";
                AbstractC31177DnL.A0u(context, userSession, c2Fb, str);
                return;
            case 7:
                C32230EHo c32230EHo = (C32230EHo) this.A02;
                Context requireContext = c32230EHo.requireContext();
                InterfaceC09390do interfaceC09390do = c32230EHo.A01;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData = (DirectWellBeingUpsellBottomSheetData) this.A01;
                AbstractC31177DnL.A0u(requireContext, A0r, directWellBeingUpsellBottomSheetData.A01, directWellBeingUpsellBottomSheetData.A07);
                FVE.A00(AbstractC166987dD.A0r(interfaceC09390do), C05F.A00, C05F.A01, null);
                return;
            case 8:
                context = (Context) this.A01;
                userSession = (UserSession) this.A02;
                c2Fb = C2Fb.A2C;
                str = "https://help.instagram.com/477434105621119";
                AbstractC31177DnL.A0u(context, userSession, c2Fb, str);
                return;
            case 9:
                ((InterfaceC71920XAe) this.A01).Cug((C38657Gyy) this.A02);
                return;
            case 10:
                context2 = (Context) this.A02;
                abstractC32317ELg = (AbstractC32317ELg) this.A01;
                abstractC18680vv = abstractC32317ELg.A00;
                A02 = AbstractC63260SgI.A02(context2, MSV.A00(97));
                C14360o3.A07(A02);
                i2 = 2131975273;
                AbstractC35175FfS.A02(context2, abstractC32317ELg, abstractC18680vv, abstractC32317ELg, A02, abstractC32317ELg.getString(i2));
                return;
            case 11:
                context2 = (Context) this.A02;
                abstractC32317ELg = (AbstractC32317ELg) this.A01;
                abstractC18680vv = abstractC32317ELg.A00;
                A02 = AbstractC63260SgI.A02(context2, MSV.A00(31));
                C14360o3.A07(A02);
                i2 = 2131957507;
                AbstractC35175FfS.A02(context2, abstractC32317ELg, abstractC18680vv, abstractC32317ELg, A02, abstractC32317ELg.getString(i2));
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                EDU edu = (EDU) this.A02;
                if (!edu.A08) {
                    return;
                }
                AbstractC35179FfW.A03();
                Bundle A00 = edu.A00();
                A00.putBoolean(AbstractC31180DnO.A0Z(), true);
                A00.putBoolean("ARG_IS_ENABLING_WHATSAPP", false);
                EK3 ek3 = new EK3();
                ek3.setArguments(A00);
                C32320ELo c32320ELo = (C32320ELo) ((C33127EjW) this.A01).A01;
                FragmentActivity requireActivity = c32320ELo.requireActivity();
                String str2 = C32320ELo.__redex_internal_original_name;
                A0O = AbstractC31174DnI.A0O(ek3, requireActivity, c32320ELo.A02);
                A0O.A04();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC18680vv session = ((IgFragmentActivity) this.A02).getSession();
                AbstractC31171DnF.A1Q(session);
                A03 = AbstractC08820cl.A03(C18U.A04(AbstractC166997dE.A0U(session), session, 36886961553474294L));
                obj = this.A01;
                C12260kU.A0G((Context) obj, A03);
                return;
            case 14:
                A0O = AbstractC25225BEi.A0r((FragmentActivity) this.A01, (AbstractC12990ll) this.A02);
                A0O.A0D(new N7U());
                A0O.A04();
                return;
            case Process.SIGTERM /* 15 */:
                UserSession userSession2 = (UserSession) this.A02;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                C1ON A01 = AbstractC35177FfU.A01(fragmentActivity, userSession2);
                A01.A00 = new C33111EjF(fragmentActivity.getSupportFragmentManager(), fragmentActivity, userSession2, 2);
                C1GJ.A03(A01);
                return;
            default:
                C33187EkZ c33187EkZ = (C33187EkZ) this.A02;
                InterfaceC09390do interfaceC09390do2 = c33187EkZ.A00;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do2);
                C19270xB A0D = AbstractC31171DnF.A0D("quiet_mode");
                AbstractC167017dG.A1N(A0r2, A0D);
                C65761Ttc.A02(new C65761Ttc(A0D, A0r2), ((C71603Jf) this.A01).A03(0L), "ig_quiet_mode_self_profile_bottom_sheet_link_tap", "self_profile");
                AbstractC25226BEj.A1Q(c33187EkZ);
                AbstractC35218FgB.A04(c33187EkZ.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do2), "self_profile");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em0(Integer num, Object obj, Object obj2, int i) {
        super(num);
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em0(C71603Jf c71603Jf, C33187EkZ c33187EkZ, int i) {
        super(Integer.valueOf(i));
        this.A00 = 16;
        this.A02 = c33187EkZ;
        this.A01 = c71603Jf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em0(C38657Gyy c38657Gyy, InterfaceC71920XAe interfaceC71920XAe, int i) {
        super(Integer.valueOf(i));
        this.A00 = 9;
        this.A01 = interfaceC71920XAe;
        this.A02 = c38657Gyy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em0(Context context, EJL ejl, int i) {
        super(Integer.valueOf(i));
        this.A00 = 2;
        this.A01 = context;
        this.A02 = ejl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em0(Context context, G3L g3l, int i) {
        super(Integer.valueOf(i));
        this.A00 = 6;
        this.A01 = context;
        this.A02 = g3l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em0(DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData, C32230EHo c32230EHo, int i) {
        super(Integer.valueOf(i));
        this.A00 = 7;
        this.A02 = c32230EHo;
        this.A01 = directWellBeingUpsellBottomSheetData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em0(Context context, UserSession userSession, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = context;
        this.A02 = userSession;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em0(FragmentActivity fragmentActivity, UserSession userSession, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        if (14 - i2 != 0) {
            this.A02 = userSession;
            this.A01 = fragmentActivity;
        } else {
            this.A01 = fragmentActivity;
            this.A02 = userSession;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em0(AiStudioUrlHandlerActivity aiStudioUrlHandlerActivity, AiStudioUrlHandlerActivity aiStudioUrlHandlerActivity2, int i) {
        super(Integer.valueOf(i));
        this.A00 = 13;
        this.A02 = aiStudioUrlHandlerActivity;
        this.A01 = aiStudioUrlHandlerActivity2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em0(Context context, EHU ehu, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A01 = context;
        this.A02 = ehu;
    }
}
