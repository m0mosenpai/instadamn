package X;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.business.fragment.SupportServicePartnerSelectionFragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.wellbeing.supportinbox.model.SupportInboxDetailBottomSheetModel;
import go.Seq;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class Em1 extends AnonymousClass522 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C1ON A0I;
        C1P1 c1p1;
        android.net.Uri A03;
        Context A0C;
        String str;
        C63397SjR c63397SjR;
        String str2;
        Context requireContext;
        UserSession session;
        C2Fb c2Fb;
        String A00;
        UserSession A0r;
        int i;
        UserSession A0r2;
        InterfaceC09390do interfaceC09390do;
        C32290EKd c32290EKd;
        int i2;
        EJA eja;
        EJA eja2;
        C32290EKd c32290EKd2;
        C32290EKd c32290EKd3;
        C35133Fea c35133Fea;
        Context context;
        AbstractC12990ll session2;
        C53Z c53z;
        BottomSheetFragment bottomSheetFragment;
        C1GL c1gl;
        String str3;
        InterfaceC09390do interfaceC09390do2;
        C62862tP c62862tP;
        Integer num;
        InterfaceC911544r A002;
        BottomSheetFragment bottomSheetFragment2;
        switch (this.A00) {
            case 0:
                A03 = AbstractC08820cl.A03(AbstractC111324zv.A00(980));
                A0C = AbstractC31172DnG.A0C(this.A01);
                C12260kU.A0G(A0C, A03);
                return;
            case 1:
                str = "https://m.facebook.com/help/247395082112892?ref=ads_pref";
                A03 = AbstractC08820cl.A03(str);
                A0C = AbstractC31172DnG.A07(this.A01);
                C12260kU.A0G(A0C, A03);
                return;
            case 2:
                str = "https://m.facebook.com/help/pay?ref=learn_more";
                A03 = AbstractC08820cl.A03(str);
                A0C = AbstractC31172DnG.A07(this.A01);
                C12260kU.A0G(A0C, A03);
                return;
            case 3:
                C31720DwP c31720DwP = (C31720DwP) this.A01;
                Integer num2 = C05F.A0N;
                InterfaceC09390do interfaceC09390do3 = c31720DwP.A07;
                FWZ.A00(AbstractC166987dD.A0r(interfaceC09390do3), num2);
                C35133Fea.A01(c31720DwP.requireContext(), AbstractC166987dD.A0o(interfaceC09390do3), SimpleWebViewActivity.A02, AbstractC31171DnF.A0R("https://help.instagram.com/347751748650214?ref=igapp"), c31720DwP.requireContext().getString(2131965052));
                return;
            case 4:
                SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A01;
                c63397SjR = new C63397SjR(supportServiceEditUrlFragment.requireActivity(), supportServiceEditUrlFragment.A03, C2Fb.A3R, AbstractC1566171j.A02(supportServiceEditUrlFragment.A01));
                str2 = "service_partner_edit_url";
                c63397SjR.A0S = str2;
                c63397SjR.A0A();
                return;
            case 5:
                SupportServicePartnerSelectionFragment supportServicePartnerSelectionFragment = (SupportServicePartnerSelectionFragment) this.A01;
                c63397SjR = new C63397SjR(supportServicePartnerSelectionFragment.requireActivity(), supportServicePartnerSelectionFragment.A04, C2Fb.A3U, AbstractC1566171j.A02(supportServicePartnerSelectionFragment.A01));
                str2 = "service_partner_selection";
                c63397SjR.A0S = str2;
                c63397SjR.A0A();
                return;
            case 6:
                C53Z c53z2 = (C53Z) this.A01;
                Context requireContext2 = c53z2.requireContext();
                AbstractC31176DnK.A11(requireContext2, c53z2.getSession(), AbstractC31171DnF.A0R(MSV.A00(1240)), requireContext2.getString(2131956545));
                return;
            case 7:
                C32294EKh c32294EKh = (C32294EKh) this.A01;
                C35208Fg0 A003 = C35208Fg0.A00();
                UserSession userSession = c32294EKh.A00;
                Integer num3 = C05F.A0C;
                Integer num4 = C05F.A06;
                String str4 = c32294EKh.A02;
                AbstractC167007dF.A1G(userSession, 0, str4);
                A003.A02(c32294EKh, userSession, num3, num4, str4);
                SimpleWebViewActivity.A00(c32294EKh.requireContext(), c32294EKh.A00, new SimpleWebViewConfig((String) null, (String) null, false, false, true, false, false, true, false, false, true, false, false, false, c32294EKh.getString(2131963154), c32294EKh.A02));
                return;
            case 8:
                C14360o3.A0B(view, 0);
                C214749fC c214749fC = (C214749fC) this.A01;
                C189478aR c189478aR = c214749fC.A0D;
                if (c189478aR == null) {
                    return;
                }
                c214749fC.requireContext();
                InterfaceC09390do interfaceC09390do4 = c214749fC.A0H;
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do4);
                C14360o3.A0B(A0r3, 1);
                EIS A01 = FWN.A01(A0r3, "close_friends_how_it_works", AbstractC16960so.A1M(new HowItWorksNuxFragment$Row(2131956255, 2131956258, Integer.valueOf(R.drawable.instagram_users_pano_outline_24), null), AbstractC31175DnJ.A0Q(2131956270, 2131956259, R.drawable.instagram_circle_star_pano_outline_24), AbstractC31175DnJ.A0Q(2131956256, 2131956260, R.drawable.instagram_eye_pano_outline_24)));
                C14360o3.A07(A01);
                C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do4);
                UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do4);
                C14360o3.A0B(A0r4, 0);
                int i3 = 2131964031;
                if (C18U.A06(C06090Tz.A05, A0r4, 36318196210538505L)) {
                    i3 = 2131965654;
                }
                AbstractC31172DnG.A1L(c214749fC, A0g, i3);
                AbstractC25225BEi.A1Q(A0g, false);
                c189478aR.A0F(A01, A0g);
                return;
            case 9:
                C214749fC c214749fC2 = (C214749fC) this.A01;
                InterfaceC09390do interfaceC09390do5 = c214749fC2.A0H;
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do5);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("origin", "LIVE_SCHEDULE_AUDIENCE");
                AbstractC25230BEn.A1A(c214749fC2, AbstractC31171DnF.A0L(c214749fC2.getActivity(), A0b, A0o, ModalActivity.class, "fan_club_creator_settings"));
                if (c214749fC2.A0B == null) {
                    str3 = "fanClubLogger";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                Long.parseLong(AbstractC31173DnH.A0t(interfaceC09390do5));
                return;
            case 10:
                AbstractC32348EMv abstractC32348EMv = (AbstractC32348EMv) this.A01;
                requireContext = abstractC32348EMv.requireContext();
                session = abstractC32348EMv.getSession();
                c2Fb = C2Fb.A1y;
                A00 = AbstractC43591JPw.A00(380);
                AbstractC31177DnL.A0u(requireContext, session, c2Fb, A00);
                return;
            case 11:
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                new C63397SjR(directShareSheetFragment.requireContext(), directShareSheetFragment.A0H, C2Fb.A1W, "https://help.instagram.com/2599848706833869").A0A();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                EKL ekl = (EKL) this.A01;
                requireContext = ekl.requireContext();
                session = AbstractC166987dD.A0r(ekl.A06);
                c2Fb = C2Fb.A1V;
                A00 = "https://www.facebook.com/help/495982749203769";
                AbstractC31177DnL.A0u(requireContext, session, c2Fb, A00);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                G36 g36 = (G36) this.A01;
                requireContext = g36.A00;
                session = g36.A01;
                c2Fb = C2Fb.A1W;
                A00 = "https://help.instagram.com/5980581705291018";
                AbstractC31177DnL.A0u(requireContext, session, c2Fb, A00);
                return;
            case 14:
                ((C31788Dy7) ((C32228EHm) this.A01).A01.getValue()).A00.A0B(EnumC33347Eog.A04);
                return;
            case Process.SIGTERM /* 15 */:
                Bundle A0b2 = AbstractC166987dD.A0b();
                EkY ekY = (EkY) this.A01;
                InterfaceC09390do interfaceC09390do6 = ekY.A00;
                AbstractC31173DnH.A1C(A0b2, AbstractC166987dD.A0r(interfaceC09390do6));
                AbstractC25230BEn.A1A(ekY, C6XJ.A03(ekY.getActivity(), A0b2, AbstractC166987dD.A0o(interfaceC09390do6), ModalActivity.class, AbstractC43591JPw.A00(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS)));
                return;
            case 16:
                EIU eiu = (EIU) this.A01;
                requireContext = eiu.requireActivity();
                session = AbstractC166987dD.A0r(eiu.A07);
                c2Fb = C2Fb.A1n;
                A00 = "https://www.facebook.com/help/instagram/243491874278176?ref=learn_more";
                AbstractC31177DnL.A0u(requireContext, session, c2Fb, A00);
                return;
            case 17:
                C33150Ejt c33150Ejt = (C33150Ejt) this.A01;
                UserSession A0r5 = AbstractC166987dD.A0r(c33150Ejt.A05);
                FragmentActivity requireActivity = c33150Ejt.requireActivity();
                C14360o3.A0B(A0r5, 0);
                EIS A004 = AbstractC35258Fgs.A00(A0r5, "campfire_audience_picker");
                C189448aO A0y = AbstractC25225BEi.A0y(A0r5);
                AbstractC25226BEj.A1M(requireActivity, A0y, 2131954734);
                AbstractC31173DnH.A0w(requireActivity, A004, A0y);
                return;
            case 18:
                EOS eos = (EOS) this.A01;
                Fragment fragment = eos.mParentFragment;
                if (!(fragment instanceof BottomSheetFragment) || (bottomSheetFragment = (BottomSheetFragment) fragment) == null) {
                    return;
                }
                AbstractC35258Fgs.A08(AbstractC166987dD.A0r(eos.A0F), null, bottomSheetFragment, null, null);
                return;
            case Process.SIGSTOP /* 19 */:
                EMQ emq = (EMQ) this.A01;
                if (SystemClock.elapsedRealtime() - emq.A00 > StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                    if (emq instanceof C32985Efr) {
                        C32985Efr c32985Efr = (C32985Efr) emq;
                        UserSession userSession2 = (UserSession) c32985Efr.A02;
                        Integer A005 = FCK.A00(c32985Efr.A00);
                        A005.getClass();
                        C31702Dw7.A00(c32985Efr, AbstractC152476ta.A03(c32985Efr.requireContext(), userSession2, A005, c32985Efr.A06, AbstractC31172DnG.A0P(c32985Efr.A02).A02(C19T.A2J), c32985Efr.A01), 4);
                    } else if (emq instanceof C32984Efq) {
                        EV0.A01(emq, AbstractC35079Fcq.A01(emq.getContext(), emq.A02, emq.A06, null, null, null), 39);
                    } else {
                        C32983Efp c32983Efp = (C32983Efp) emq;
                        EV0.A01(c32983Efp, AbstractC35276FhB.A03(c32983Efp.getContext(), (C07270a1) ((EMQ) c32983Efp).A02, c32983Efp.A00), 37);
                    }
                    emq.A00 = SystemClock.elapsedRealtime();
                    return;
                }
                emq.A02(2131976952);
                return;
            case 20:
                C32320ELo c32320ELo = (C32320ELo) ((C33127EjW) this.A01).A01;
                FragmentActivity requireActivity2 = c32320ELo.requireActivity();
                String str5 = C32320ELo.__redex_internal_original_name;
                c63397SjR = new C63397SjR(requireActivity2, c32320ELo.A02, C2Fb.A1W, "https://help.instagram.com/1982960765199109");
                str2 = "phone_number_entry";
                c63397SjR.A0S = str2;
                c63397SjR.A0A();
                return;
            case 21:
                EL6 el6 = (EL6) this.A01;
                InterfaceC09390do interfaceC09390do7 = el6.A08;
                AbstractC35075Fcm.A00(AbstractC166987dD.A0r(interfaceC09390do7), C05F.A0Y);
                C25621Ms A0M = AbstractC31173DnH.A0M(AbstractC166987dD.A0o(interfaceC09390do7));
                A0M.A0B("accounts/regen_backup_codes/");
                A0I = AbstractC31178DnM.A0I(A0M, EDU.class, C34799FVb.class);
                c1p1 = el6.A07;
                c1gl = el6;
                A0I.A00 = c1p1;
                c1gl.schedule(A0I);
                return;
            case 22:
                EL6.A01((EL6) this.A01);
                return;
            case 23:
                EJA eja3 = (EJA) this.A01;
                InterfaceC09390do interfaceC09390do8 = eja3.A05;
                A0r = AbstractC166987dD.A0r(interfaceC09390do8);
                interfaceC09390do8.getValue();
                i = 2131975917;
                eja = eja3;
                AbstractC35235FgT.A01(eja.requireContext(), A0r, AbstractC31182DnR.A05(269, 42, 24), AbstractC25227BEk.A0v(eja, i));
                return;
            case 24:
                C32290EKd c32290EKd4 = (C32290EKd) this.A01;
                InterfaceC09390do interfaceC09390do9 = c32290EKd4.A03;
                A0r2 = AbstractC166987dD.A0r(interfaceC09390do9);
                interfaceC09390do9.getValue();
                c32290EKd = c32290EKd4;
                i2 = 2131975917;
                c32290EKd2 = c32290EKd;
                AbstractC35235FgT.A04(c32290EKd2, A0r2, i2);
                return;
            case 25:
                C32290EKd c32290EKd5 = (C32290EKd) this.A01;
                InterfaceC09390do interfaceC09390do10 = c32290EKd5.A03;
                A0r = AbstractC166987dD.A0r(interfaceC09390do10);
                interfaceC09390do10.getValue();
                eja2 = c32290EKd5;
                i = 2131975901;
                eja = eja2;
                AbstractC35235FgT.A01(eja.requireContext(), A0r, AbstractC31182DnR.A05(269, 42, 24), AbstractC25227BEk.A0v(eja, i));
                return;
            case 26:
                C33230ElN c33230ElN = (C33230ElN) this.A01;
                interfaceC09390do = c33230ElN.A05;
                A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                c32290EKd3 = c33230ElN;
                interfaceC09390do.getValue();
                i2 = 2131975918;
                c32290EKd2 = c32290EKd3;
                AbstractC35235FgT.A04(c32290EKd2, A0r2, i2);
                return;
            case 27:
                C32267EJc c32267EJc = (C32267EJc) this.A01;
                InterfaceC09390do interfaceC09390do11 = c32267EJc.A0A;
                AbstractC35075Fcm.A00(AbstractC166987dD.A0r(interfaceC09390do11), C05F.A00);
                AbstractC35179FfW.A03();
                Bundle requireArguments = c32267EJc.requireArguments();
                Integer num5 = c32267EJc.A04;
                if (num5 == null) {
                    str3 = "twoFacMethod";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                requireArguments.putBoolean("ARG_IS_ENABLING_WHATSAPP", AbstractC167007dF.A1X(num5, C05F.A0C));
                EK3 ek3 = new EK3();
                AbstractC31179DnN.A0y(ek3, AbstractC31173DnH.A0J(requireArguments, ek3, c32267EJc), interfaceC09390do11);
                return;
            case 28:
                C32267EJc c32267EJc2 = (C32267EJc) this.A01;
                InterfaceC09390do interfaceC09390do12 = c32267EJc2.A0A;
                UserSession A0r6 = AbstractC166987dD.A0r(interfaceC09390do12);
                Integer num6 = C05F.A15;
                AbstractC35075Fcm.A00(A0r6, num6);
                FJE fje = c32267EJc2.A00;
                str3 = "twoFacPhoneVerificationHelper";
                if (fje != null) {
                    if (SystemClock.elapsedRealtime() - fje.A01 < fje.A00 * 1000) {
                        AbstractC35075Fcm.A01(AbstractC166987dD.A0r(interfaceC09390do12), "client rate limit");
                        FJE fje2 = c32267EJc2.A00;
                        if (fje2 != null) {
                            AbstractC34238F8k.A00(c32267EJc2.requireContext(), fje2.A00);
                            return;
                        }
                    } else {
                        Integer num7 = c32267EJc2.A03;
                        if (num7 == null) {
                            str3 = "twoFacConfirmCodeSource";
                        } else {
                            int intValue = num7.intValue();
                            str3 = "phoneNumberOrEmail";
                            if (intValue != 0) {
                                if (intValue != 3) {
                                    if (intValue != 4) {
                                        return;
                                    }
                                    AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do12);
                                    String str6 = c32267EJc2.A05;
                                    if (str6 != null) {
                                        A0I = AbstractC35192Ffk.A00(A0o2, str6, AbstractC31180DnO.A0c(c32267EJc2));
                                        interfaceC09390do2 = c32267EJc2.A0H;
                                        c1p1 = (C1P1) interfaceC09390do2.getValue();
                                        c1gl = c32267EJc2;
                                    }
                                } else {
                                    UserSession A0r7 = AbstractC166987dD.A0r(interfaceC09390do12);
                                    String str7 = c32267EJc2.A05;
                                    if (str7 != null) {
                                        A0I = AbstractC152476ta.A03(c32267EJc2.requireContext(), A0r7, num6, str7, null, null);
                                        interfaceC09390do2 = c32267EJc2.A08;
                                        c1p1 = (C1P1) interfaceC09390do2.getValue();
                                        c1gl = c32267EJc2;
                                    }
                                }
                            } else {
                                Context requireContext3 = c32267EJc2.requireContext();
                                UserSession A0r8 = AbstractC166987dD.A0r(interfaceC09390do12);
                                String str8 = c32267EJc2.A05;
                                if (str8 != null) {
                                    A0I = AbstractC35177FfU.A02(requireContext3, A0r8, str8);
                                    interfaceC09390do2 = c32267EJc2.A0B;
                                    c1p1 = (C1P1) interfaceC09390do2.getValue();
                                    c1gl = c32267EJc2;
                                }
                            }
                            A0I.A00 = c1p1;
                            c1gl.schedule(A0I);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                EK3 ek32 = (EK3) this.A01;
                InterfaceC09390do interfaceC09390do13 = ek32.A08;
                A0r2 = AbstractC166987dD.A0r(interfaceC09390do13);
                interfaceC09390do13.getValue();
                c32290EKd = ek32;
                i2 = 2131975917;
                c32290EKd2 = c32290EKd;
                AbstractC35235FgT.A04(c32290EKd2, A0r2, i2);
                return;
            case 30:
                EK3 ek33 = (EK3) this.A01;
                InterfaceC09390do interfaceC09390do14 = ek33.A08;
                A0r = AbstractC166987dD.A0r(interfaceC09390do14);
                interfaceC09390do14.getValue();
                eja2 = ek33;
                i = 2131975901;
                eja = eja2;
                AbstractC35235FgT.A01(eja.requireContext(), A0r, AbstractC31182DnR.A05(269, 42, 24), AbstractC25227BEk.A0v(eja, i));
                return;
            case 31:
                C32311EKz c32311EKz = (C32311EKz) this.A01;
                interfaceC09390do = c32311EKz.A09;
                A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                c32290EKd3 = c32311EKz;
                interfaceC09390do.getValue();
                i2 = 2131975918;
                c32290EKd2 = c32290EKd3;
                AbstractC35235FgT.A04(c32290EKd2, A0r2, i2);
                return;
            case 32:
                C32262EIw.A03((C32262EIw) this.A01, false);
                return;
            case 33:
                EL1.A00((EL1) this.A01);
                return;
            case 34:
                FJX fjx = ((C31721DwQ) this.A01).A0m;
                UserSession userSession3 = fjx.A01;
                FWZ.A01(userSession3, C05F.A0Y, C05F.A01, null);
                C189448aO A0y2 = AbstractC25225BEi.A0y(userSession3);
                A0y2.A1C = false;
                Context context2 = fjx.A00;
                AbstractC25226BEj.A1M(context2, A0y2, 2131970117);
                A0y2.A00().A03(context2, new EHi());
                return;
            case 35:
                EHi eHi = (EHi) this.A01;
                Integer num8 = C05F.A0Y;
                InterfaceC09390do interfaceC09390do15 = eHi.A00;
                FWZ.A00(AbstractC166987dD.A0r(interfaceC09390do15), num8);
                C35133Fea.A01(eHi.requireContext(), AbstractC166987dD.A0o(interfaceC09390do15), SimpleWebViewActivity.A02, AbstractC31171DnF.A0R("https://help.instagram.com/347751748650214?ref=igapp"), eHi.requireContext().getString(2131965052));
                return;
            case 36:
                C53Z c53z3 = (C53Z) this.A01;
                FWZ.A00(c53z3.getSession(), C05F.A00);
                c35133Fea = SimpleWebViewActivity.A02;
                context = c53z3.getContext();
                if (context != null) {
                    session2 = c53z3.getSession();
                    c53z = c53z3;
                    C35133Fea.A01(context, session2, c35133Fea, AbstractC31171DnF.A0R("https://help.instagram.com/347751748650214?ref=igapp"), c53z.getString(2131965052));
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 37:
                C32281EJs c32281EJs = (C32281EJs) this.A01;
                Integer num9 = C05F.A0C;
                InterfaceC09390do interfaceC09390do16 = c32281EJs.A0G;
                FWZ.A00(AbstractC166987dD.A0r(interfaceC09390do16), num9);
                c35133Fea = SimpleWebViewActivity.A02;
                context = c32281EJs.getContext();
                if (context != null) {
                    session2 = AbstractC166987dD.A0o(interfaceC09390do16);
                    c53z = c32281EJs;
                    C35133Fea.A01(context, session2, c35133Fea, AbstractC31171DnF.A0R("https://help.instagram.com/347751748650214?ref=igapp"), c53z.getString(2131965052));
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 38:
                C32287EJz c32287EJz = (C32287EJz) this.A01;
                Integer num10 = C05F.A01;
                InterfaceC09390do interfaceC09390do17 = c32287EJz.A0B;
                FWZ.A00(AbstractC166987dD.A0r(interfaceC09390do17), num10);
                c35133Fea = SimpleWebViewActivity.A02;
                context = c32287EJz.getContext();
                if (context != null) {
                    session2 = AbstractC166987dD.A0r(interfaceC09390do17);
                    c53z = c32287EJz;
                    C35133Fea.A01(context, session2, c35133Fea, AbstractC31171DnF.A0R("https://help.instagram.com/347751748650214?ref=igapp"), c53z.getString(2131965052));
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 39:
                C33193Ekf c33193Ekf = (C33193Ekf) this.A01;
                c63397SjR = AbstractC25228BEl.A0y(c33193Ekf.requireActivity(), AbstractC166987dD.A0r(c33193Ekf.A00), C2Fb.A0O, "https://help.instagram.com/260759676551934?ref=ipl");
                str2 = "automatic_previews_toggle";
                c63397SjR.A0S = str2;
                c63397SjR.A0A();
                return;
            case 40:
                C1XJ c1xj = C1XJ.A00;
                C53Z c53z4 = (C53Z) this.A01;
                c1xj.A0q(c53z4.requireActivity(), c53z4.getSession());
                return;
            case Seq.NULL_REFNUM /* 41 */:
                FQO fqo = (FQO) this.A01;
                AbstractC86593tX.A0b(fqo.A03, fqo.A04, C05F.A1F);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                EJW ejw = ((C35155Fex) this.A01).A0A.A00;
                InterfaceC09390do interfaceC09390do18 = ejw.A08;
                AbstractC12990ll A0o3 = AbstractC166987dD.A0o(interfaceC09390do18);
                if (A0o3 != null) {
                    FVN.A01(A0o3, true);
                }
                AbstractC12990ll A0o4 = AbstractC166987dD.A0o(interfaceC09390do18);
                if (A0o4 != null) {
                    c62862tP = AbstractC31172DnG.A0O(ejw.requireActivity(), ejw, A0o4);
                } else {
                    c62862tP = null;
                }
                AbstractC12990ll A0o5 = AbstractC166987dD.A0o(interfaceC09390do18);
                if (A0o5 == null) {
                    return;
                }
                C913045j c913045j = C913045j.A00;
                C54s c54s = new C54s(c913045j);
                c54s.A0F("deeplink_destination", "com.bloks.www.fxcal.settings.async");
                c54s.A0F("entrypoint", AbstractC31172DnG.A16(Locale.ROOT, "SUGGESTED_BLOCK"));
                AbstractC12990ll A0o6 = AbstractC166987dD.A0o(interfaceC09390do18);
                if (A0o6 != null) {
                    num = Integer.valueOf(FVN.A00(A0o6));
                } else {
                    num = null;
                }
                if (num == null) {
                    A002 = C60603RBu.A00;
                } else {
                    A002 = C1122554x.A00(num.intValue());
                }
                c54s.A00.put("cds_client_value", A002);
                AbstractC192798gL A05 = C192108fB.A05(A0o5, "com.bloks.www.fxcal.settings.async", new C25020B4x(AbstractC31177DnL.A0K(c54s, c913045j), 6));
                C32392EOt.A00(A05, c62862tP, 22);
                ejw.schedule(A05);
                return;
            case 43:
                C32340EMm c32340EMm = (C32340EMm) this.A01;
                SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel = c32340EMm.A02;
                C14360o3.A0A(supportInboxDetailBottomSheetModel);
                if (supportInboxDetailBottomSheetModel.A02 == null) {
                    return;
                }
                FragmentActivity requireActivity3 = c32340EMm.requireActivity();
                UserSession userSession4 = c32340EMm.A00;
                if (userSession4 != null) {
                    SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel2 = c32340EMm.A02;
                    C14360o3.A0A(supportInboxDetailBottomSheetModel2);
                    String str9 = supportInboxDetailBottomSheetModel2.A02;
                    if (str9 != null) {
                        AbstractC35261Fgv.A07(requireActivity3, userSession4, str9, null);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            default:
                KDA kda = (KDA) this.A01;
                Fragment fragment2 = kda.mParentFragment;
                if ((fragment2 instanceof BottomSheetFragment) && (bottomSheetFragment2 = (BottomSheetFragment) fragment2) != null) {
                    UserSession A0r9 = AbstractC166987dD.A0r(kda.A06);
                    C14360o3.A0B(A0r9, 0);
                    EIS A006 = FWN.A00(A0r9, null, null, Integer.valueOf(R.drawable.ig_illustrations_illo_friends_story_refresh), kda.getModuleName(), null, bottomSheetFragment2.getString(2131969628), AbstractC16960so.A1M(new HowItWorksNuxFragment$Row(null, 2131969625, Integer.valueOf(R.drawable.instagram_camera_pano_outline_24), null), new HowItWorksNuxFragment$Row(null, 2131969626, Integer.valueOf(R.drawable.instagram_new_story_pano_outline_24), null), new HowItWorksNuxFragment$Row(null, 2131969627, Integer.valueOf(R.drawable.instagram_circle_check_pano_outline_24), null)));
                    C189478aR c189478aR2 = bottomSheetFragment2.A02;
                    if (c189478aR2 != null) {
                        C189448aO A0y3 = AbstractC25225BEi.A0y(A0r9);
                        AbstractC31172DnG.A1L(bottomSheetFragment2, A0y3, 2131969629);
                        AbstractC25225BEi.A1Q(A0y3, false);
                        c189478aR2.A0F(A006, A0y3);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(Integer num, Object obj, int i) {
        super(num);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(EHi eHi, int i) {
        super(Integer.valueOf(i));
        this.A00 = 35;
        this.A01 = eHi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C32228EHm c32228EHm, int i) {
        super(Integer.valueOf(i));
        this.A00 = 14;
        this.A01 = c32228EHm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(EIU eiu, int i) {
        super(Integer.valueOf(i));
        this.A00 = 16;
        this.A01 = eiu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C32262EIw c32262EIw, int i) {
        super(Integer.valueOf(i));
        this.A00 = 32;
        this.A01 = c32262EIw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(EJA eja, int i) {
        super(Integer.valueOf(i));
        this.A00 = 23;
        this.A01 = eja;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C32281EJs c32281EJs, int i) {
        super(Integer.valueOf(i));
        this.A00 = 37;
        this.A01 = c32281EJs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C32287EJz c32287EJz, int i) {
        super(Integer.valueOf(i));
        this.A00 = 38;
        this.A01 = c32287EJz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C32311EKz c32311EKz, int i) {
        super(Integer.valueOf(i));
        this.A00 = 31;
        this.A01 = c32311EKz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(EL1 el1, int i) {
        super(Integer.valueOf(i));
        this.A00 = 33;
        this.A01 = el1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C32340EMm c32340EMm, int i) {
        super(Integer.valueOf(i));
        this.A00 = 43;
        this.A01 = c32340EMm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C32366ENp c32366ENp, int i) {
        super(Integer.valueOf(i));
        this.A00 = 36;
        this.A01 = c32366ENp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(EOS eos, int i) {
        super(Integer.valueOf(i));
        this.A00 = 18;
        this.A01 = eos;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C33230ElN c33230ElN, int i) {
        super(Integer.valueOf(i));
        this.A00 = 26;
        this.A01 = c33230ElN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(G36 g36, int i) {
        super(Integer.valueOf(i));
        this.A00 = 13;
        this.A01 = g36;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(KDA kda, int i) {
        super(Integer.valueOf(i));
        this.A00 = 44;
        this.A01 = kda;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C214749fC c214749fC, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = c214749fC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C32267EJc c32267EJc, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = c32267EJc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(EK3 ek3, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = ek3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C32290EKd c32290EKd, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = c32290EKd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(EL6 el6, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = el6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C60886Rau c60886Rau, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = c60886Rau;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(Rb5 rb5, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = rb5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C31720DwP c31720DwP, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A01 = c31720DwP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C32734Eb0 c32734Eb0, int i) {
        super(Integer.valueOf(i));
        this.A00 = 10;
        this.A01 = c32734Eb0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C32786Ebq c32786Ebq, int i) {
        super(Integer.valueOf(i));
        this.A00 = 12;
        this.A01 = c32786Ebq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C33150Ejt c33150Ejt, int i) {
        super(Integer.valueOf(i));
        this.A00 = 17;
        this.A01 = c33150Ejt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(EkY ekY, int i) {
        super(Integer.valueOf(i));
        this.A00 = 15;
        this.A01 = ekY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(C33193Ekf c33193Ekf, int i) {
        super(Integer.valueOf(i));
        this.A00 = 39;
        this.A01 = c33193Ekf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em1(FQO fqo, int i) {
        super(Integer.valueOf(i));
        this.A00 = 41;
        this.A01 = fqo;
    }
}
