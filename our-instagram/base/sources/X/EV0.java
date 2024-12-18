package X;

import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import go.Seq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EV0 extends C1P1 {
    public final int A00;
    public final Object A01;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        C2EB c2eb;
        if (19 - this.A00 != 0) {
            super.onSuccessInBackground(obj);
            return;
        }
        int A03 = C0f9.A03(-223248260);
        C99Z c99z = (C99Z) obj;
        int A032 = C0f9.A03(-2141581401);
        C14360o3.A0B(c99z, 0);
        UserSession userSession = ((LFv) this.A01).A00;
        C46922Dg c46922Dg = ((C2DU) C2JD.A00(userSession)).A0C;
        C2057498z c2057498z = C2057498z.A00;
        C4I3 c4i3 = C4I3.A03;
        if (AbstractC1337462f.A0A(userSession, false)) {
            c2eb = C2EB.A05;
        } else {
            c2eb = C2EB.A04;
        }
        c46922Dg.A0O(c2057498z, c99z, c2eb, c4i3, false);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
        A0w.E7G("last_message_requests_prefetch_timestamp", currentTimeMillis);
        A0w.apply();
        AbstractC25651Mw.A00(userSession).E4s(new C48022Ip(null, false, false, false));
        C0f9.A0A(-252522956, A032);
        C0f9.A0A(-801607175, A03);
    }

    public EV0(C36292Fzm c36292Fzm, int i) {
        this.A00 = i;
        this.A01 = c36292Fzm;
    }

    public static EV0 A00(Object obj, int i) {
        return new EV0(obj, i);
    }

    public static void A01(AbstractC59962oe abstractC59962oe, C1ON c1on, int i) {
        c1on.A00 = new EV0(abstractC59962oe, i);
        abstractC59962oe.schedule(c1on);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        int A032;
        int i2;
        Integer num;
        String str;
        String str2;
        String str3;
        Integer num2;
        String str4;
        String str5;
        String str6;
        String str7;
        Object A00;
        String str8;
        switch (this.A00) {
            case 0:
                A032 = C0f9.A03(691533624);
                G1U g1u = (G1U) this.A01;
                g1u.A04(new KOV(AbstractC166997dE.A0p(g1u.A00, 2131960763)));
                i2 = -656761236;
                C0f9.A0A(i2, A032);
                return;
            case 1:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGSTOP /* 19 */:
            default:
                super.onFail(abstractC115105If);
                return;
            case 2:
                A032 = C0f9.A03(-950074334);
                super.onFail(abstractC115105If);
                ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment = (ImportMsgrIceBreakersFragment) this.A01;
                ImportMsgrIceBreakersFragment.A01(importMsgrIceBreakersFragment, EnumC153216up.A04);
                C34923Fa9 c34923Fa9 = importMsgrIceBreakersFragment.A03;
                HashMap A1G = AbstractC166987dD.A1G();
                AbstractC31171DnF.A1U("FETCH_MSGR_QUESTIONS_REQUEST_FAILURE", A1G);
                C34923Fa9.A00(c34923Fa9, "icebreaker_settings_error_screen_impression", "There was a HTTP request failure to load msgr icebreaker questions from server", A1G);
                i2 = -1745418895;
                C0f9.A0A(i2, A032);
                return;
            case 3:
                A032 = C0f9.A03(2006909934);
                super.onFail(abstractC115105If);
                ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment2 = (ImportMsgrIceBreakersFragment) this.A01;
                C146106i8 A0K = AbstractC31171DnF.A0K();
                A0K.A06();
                A0K.A05();
                A0K.A0H = "direct_faq_import_unable_to_import";
                AbstractC25226BEj.A1N(importMsgrIceBreakersFragment2.A00, A0K, 2131959385);
                A0K.A0D(importMsgrIceBreakersFragment2.A00.getString(2131972568));
                G97.A00(A0K, importMsgrIceBreakersFragment2, 2);
                A0K.A0L = true;
                AbstractC25233BEq.A1F(A0K);
                C34923Fa9 c34923Fa92 = importMsgrIceBreakersFragment2.A03;
                HashMap A1G2 = AbstractC166987dD.A1G();
                AbstractC31171DnF.A1U("IMPORT_MSGR_QUESTIONS_REQUEST_FAILURE", A1G2);
                C34923Fa9.A00(c34923Fa92, "icebreaker_settings_error_screen_impression", "There was a HTTP request failure to import selected msgr icebreakers to IG", A1G2);
                i2 = 1327942698;
                C0f9.A0A(i2, A032);
                return;
            case 4:
                A032 = C0f9.A03(-67838003);
                C0w9.A03("IceBreakerSettingManager", "Failed to fetch icebreakers from server");
                C14120nc.A00().ATO(new EZV(this));
                i2 = 1932817721;
                C0f9.A0A(i2, A032);
                return;
            case 5:
                A032 = C0f9.A03(1781673378);
                super.onFail(abstractC115105If);
                C36292Fzm c36292Fzm = (C36292Fzm) this.A01;
                InterfaceC37166GZd interfaceC37166GZd = c36292Fzm.A04;
                if (interfaceC37166GZd != null) {
                    c36292Fzm.A08 = !c36292Fzm.A08;
                    interfaceC37166GZd.Cue();
                }
                i2 = -2069080539;
                C0f9.A0A(i2, A032);
                return;
            case 6:
                A032 = C0f9.A03(141178977);
                super.onFail(abstractC115105If);
                C36292Fzm c36292Fzm2 = (C36292Fzm) this.A01;
                InterfaceC37166GZd interfaceC37166GZd2 = c36292Fzm2.A03;
                if (interfaceC37166GZd2 != null) {
                    c36292Fzm2.A09 = !c36292Fzm2.A09;
                    interfaceC37166GZd2.Cue();
                }
                i2 = 233894915;
                C0f9.A0A(i2, A032);
                return;
            case 7:
                A032 = C0f9.A03(857553201);
                super.onFail(abstractC115105If);
                InterfaceC37166GZd interfaceC37166GZd3 = ((C36292Fzm) this.A01).A02;
                if (interfaceC37166GZd3 != null) {
                    interfaceC37166GZd3.Cue();
                }
                i2 = 909843948;
                C0f9.A0A(i2, A032);
                return;
            case 8:
                A032 = C0f9.A03(1501884003);
                ((G2R) this.A01).A02 = C05F.A0C;
                i2 = -1172818666;
                C0f9.A0A(i2, A032);
                return;
            case 9:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -1494045370);
                super.onFail(abstractC115105If);
                C9GR.A0B(AbstractC31172DnG.A06(this.A01), "network_error");
                i2 = -1976098810;
                C0f9.A0A(i2, A032);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(343131928);
                i = -258378681;
                C0f9.A0A(i, A03);
                return;
            case 14:
                A032 = C0f9.A03(1293366735);
                FQQ fqq = (FQQ) this.A01;
                fqq.A00 = C05F.A0C;
                fqq.A02.A00.A00();
                i2 = -266195346;
                C0f9.A0A(i2, A032);
                return;
            case Process.SIGTERM /* 15 */:
                A032 = C0f9.A03(-81358935);
                FQR fqr = (FQR) this.A01;
                fqr.A00 = C05F.A0C;
                EMC.A02(fqr.A02.A00);
                i2 = 61622996;
                C0f9.A0A(i2, A032);
                return;
            case 16:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -920769859);
                InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
                C1346766r c1346766r = (C1346766r) this.A01;
                if (A0L != null) {
                    num = Integer.valueOf(A0L.getStatusCode());
                } else {
                    num = null;
                }
                String valueOf = String.valueOf(num);
                if (A0L != null) {
                    str = A0L.getErrorMessage();
                    str2 = A0L.getErrorType();
                    str3 = A0L.getErrorTitle();
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                c1346766r.A02(new C48496Lcn(new C32025E5d(valueOf, str, str2, str3, null, abstractC115105If instanceof C115115Ig)));
                c1346766r.A00();
                i2 = 1677316109;
                C0f9.A0A(i2, A032);
                return;
            case 17:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 1961215182);
                InterfaceC40821up A0L2 = AbstractC31172DnG.A0L(abstractC115105If);
                C1346766r c1346766r2 = (C1346766r) this.A01;
                if (A0L2 != null) {
                    num2 = Integer.valueOf(A0L2.getStatusCode());
                } else {
                    num2 = null;
                }
                String valueOf2 = String.valueOf(num2);
                if (A0L2 != null) {
                    str4 = A0L2.getErrorMessage();
                    str5 = A0L2.getErrorType();
                    str6 = A0L2.getErrorTitle();
                } else {
                    str4 = null;
                    str5 = null;
                    str6 = null;
                }
                c1346766r2.A02(new C48496Lcn(new C32025E5d(valueOf2, str4, str5, str6, null, abstractC115105If instanceof C115115Ig)));
                c1346766r2.A00();
                i2 = 86270001;
                C0f9.A0A(i2, A032);
                return;
            case 18:
                A032 = C0f9.A03(1300289480);
                C34641FNy c34641FNy = ((C34431FFv) this.A01).A00;
                c34641FNy.A04 = false;
                c34641FNy.A02 = true;
                c34641FNy.A06.APy();
                i2 = -327924925;
                C0f9.A0A(i2, A032);
                return;
            case 20:
                int A033 = C0f9.A03(-1380455493);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                EQM eqm = ((C32356ENd) this.A01).A03;
                str7 = "userListAdapter";
                if (eqm != null) {
                    eqm.A0C = false;
                    eqm.A04 = null;
                    eqm.A0A = false;
                    C0f9.A0A(237303583, A033);
                    return;
                }
                C14360o3.A0F(str7);
                throw C00O.createAndThrow();
            case 21:
                A03 = C0f9.A03(-1483467731);
                C32353ENa c32353ENa = (C32353ENa) this.A01;
                AbstractC31179DnN.A1U(c32353ENa, 16909819);
                C1570473j c1570473j = c32353ENa.A02;
                str7 = "latencyPerfLogger";
                if (c1570473j != null) {
                    c1570473j.A0E("fetch_request_fail");
                    C1570473j c1570473j2 = c32353ENa.A02;
                    if (c1570473j2 != null) {
                        ((MTJ) c1570473j2).A00.A01();
                        c32353ENa.A09 = false;
                        C9GR.A01(c32353ENa.getContext(), "tabbed_explore_people_fail", 2131975131, 0);
                        i = 868462388;
                        C0f9.A0A(i, A03);
                        return;
                    }
                }
                C14360o3.A0F(str7);
                throw C00O.createAndThrow();
            case 22:
                A032 = C0f9.A03(1378233807);
                FRD frd = (FRD) this.A01;
                frd.A00 = EnumC155676yw.A02;
                V1R.A03(frd.A04.A00);
                i2 = -1968455723;
                C0f9.A0A(i2, A032);
                return;
            case 23:
                A032 = C0f9.A03(-516134995);
                ((C36265FzI) this.A01).A01.remove("FACEBOOK");
                i2 = 983261738;
                C0f9.A0A(i2, A032);
                return;
            case 24:
                A03 = C0f9.A03(-665689441);
                i = -1948398099;
                C0f9.A0A(i, A03);
                return;
            case 25:
                A032 = C0f9.A03(206863719);
                C33228ElK c33228ElK = (C33228ElK) this.A01;
                c33228ElK.A08.post(new RunnableC36829GLc(this));
                AbstractC35254Fgn.A02(c33228ElK.getContext(), abstractC115105If);
                i2 = -670625149;
                C0f9.A0A(i2, A032);
                return;
            case 26:
                A032 = C0f9.A03(-625270873);
                C33228ElK c33228ElK2 = (C33228ElK) this.A01;
                AbstractC35254Fgn.A01(c33228ElK2.getContext());
                c33228ElK2.A08.post(new RunnableC36830GLd(this));
                i2 = -910436995;
                C0f9.A0A(i2, A032);
                return;
            case 27:
                A032 = C0f9.A03(-178889129);
                Fragment fragment = (Fragment) this.A01;
                AbstractC31179DnN.A0u(fragment);
                AbstractC35254Fgn.A02(fragment.getContext(), abstractC115105If);
                i2 = -723616397;
                C0f9.A0A(i2, A032);
                return;
            case 28:
                A032 = C0f9.A03(-1278132615);
                C32369ENt c32369ENt = (C32369ENt) this.A01;
                C35016Fbp.A00(c32369ENt.A04);
                String string = c32369ENt.getString(2131961880);
                String string2 = c32369ENt.getString(2131976159);
                if ((abstractC115105If instanceof C115115Ig) && (A00 = abstractC115105If.A00()) != null) {
                    InterfaceC40821up interfaceC40821up = (InterfaceC40821up) A00;
                    List errorStrings = interfaceC40821up.getErrorStrings();
                    if (errorStrings != null) {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        Iterator it = errorStrings.iterator();
                        while (it.hasNext()) {
                            A1C.append(AbstractC166987dD.A1B(it));
                            A1C.append('\n');
                        }
                        string2 = A1C.toString().trim();
                    }
                    if (interfaceC40821up.getErrorTitle() != null) {
                        string = interfaceC40821up.getErrorTitle();
                    }
                }
                C32369ENt.A02(c32369ENt, string2);
                c32369ENt.A06 = true;
                c32369ENt.A08 = true;
                C32369ENt.A01(c32369ENt);
                AbstractC35254Fgn.A06(c32369ENt.requireContext(), string2, string);
                AbstractC31175DnJ.A0j(c32369ENt.getActivity(), false);
                c32369ENt.A00.setEnabled(true);
                c32369ENt.A02.setEnabled(true);
                c32369ENt.A01.setEnabled(true);
                i2 = -260203888;
                C0f9.A0A(i2, A032);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A032 = C0f9.A03(-907718505);
                super.onFail(abstractC115105If);
                EK8 ek8 = (EK8) this.A01;
                ek8.A08 = false;
                EK8.A00(ek8);
                C193328hC A0c = AbstractC31176DnK.A0c(ek8);
                A0c.A09(2131968430);
                AbstractC31176DnK.A1W(A0c);
                i2 = 298772566;
                C0f9.A0A(i2, A032);
                return;
            case 30:
                A032 = C0f9.A03(2060798858);
                super.onFail(abstractC115105If);
                C33229ElM.A01((C33229ElM) this.A01);
                i2 = 1156256005;
                C0f9.A0A(i2, A032);
                return;
            case 31:
                A032 = C0f9.A03(-801231075);
                Fragment fragment2 = (Fragment) ((DialogInterfaceOnClickListenerC35453FkA) this.A01).A01;
                if (fragment2.getContext() != null) {
                    AbstractC35254Fgn.A01(fragment2.getContext());
                }
                i2 = -1508656053;
                C0f9.A0A(i2, A032);
                return;
            case 32:
                A032 = C0f9.A03(1865749219);
                C9GR.A08(AbstractC31172DnG.A06(this.A01), 2131968556, 0);
                super.onFail(abstractC115105If);
                i2 = -135001595;
                C0f9.A0A(i2, A032);
                return;
            case 33:
                A032 = C0f9.A03(1422967318);
                AbstractC35254Fgn.A02(AbstractC31172DnG.A06(this.A01), abstractC115105If);
                i2 = 1453678932;
                C0f9.A0A(i2, A032);
                return;
            case 34:
                A032 = C0f9.A03(-2139114427);
                C32320ELo c32320ELo = (C32320ELo) this.A01;
                String str9 = C32320ELo.__redex_internal_original_name;
                C35016Fbp.A00(c32320ELo.A06);
                AbstractC35254Fgn.A02(c32320ELo.getContext(), abstractC115105If);
                i2 = 550907895;
                C0f9.A0A(i2, A032);
                return;
            case 35:
                A032 = C0f9.A03(242645278);
                C32271EJg c32271EJg = (C32271EJg) this.A01;
                C0J8.A03(c32271EJg.A07, "The API creation line before this callback is used additionally includes checkNotNulls in IgApi.Builder to assert that the user session is not null");
                AbstractC35254Fgn.A07(c32271EJg, abstractC115105If);
                i2 = 549890153;
                C0f9.A0A(i2, A032);
                return;
            case 36:
                A032 = C0f9.A03(-1901621849);
                AbstractC35254Fgn.A07((Fragment) this.A01, abstractC115105If);
                i2 = -1033453005;
                C0f9.A0A(i2, A032);
                return;
            case 37:
                A032 = C0f9.A03(-420621532);
                super.onFail(abstractC115105If);
                ((EMQ) this.A01).A02(2131975767);
                i2 = 611555241;
                C0f9.A0A(i2, A032);
                return;
            case 38:
                A032 = C0f9.A03(795644126);
                super.onFail(abstractC115105If);
                Object A002 = abstractC115105If.A00();
                if (A002 != null) {
                    InterfaceC40821up interfaceC40821up2 = (InterfaceC40821up) A002;
                    if (interfaceC40821up2.getErrorMessage() != null) {
                        Fragment fragment3 = (Fragment) this.A01;
                        String errorMessage = interfaceC40821up2.getErrorMessage();
                        C193328hC A0c2 = AbstractC31176DnK.A0c(fragment3);
                        A0c2.A05 = errorMessage;
                        AbstractC31176DnK.A1W(A0c2);
                        i2 = -1789418544;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                ((EMQ) this.A01).A02(2131975766);
                i2 = -1789418544;
                C0f9.A0A(i2, A032);
                return;
            case 39:
                A032 = C0f9.A03(776432749);
                super.onFail(abstractC115105If);
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null && A01.getMessage() != null) {
                    Fragment fragment4 = (Fragment) this.A01;
                    String message = A01.getMessage();
                    C193328hC A0c3 = AbstractC31176DnK.A0c(fragment4);
                    A0c3.A05 = message;
                    AbstractC31176DnK.A1W(A0c3);
                } else {
                    ((EMQ) this.A01).A02(2131975767);
                }
                i2 = 27164641;
                C0f9.A0A(i2, A032);
                return;
            case 40:
                A032 = C0f9.A03(564733206);
                AbstractC35254Fgn.A02(AbstractC31172DnG.A06(this.A01), abstractC115105If);
                i2 = -1971432233;
                C0f9.A0A(i2, A032);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -2078319613);
                AbstractC35254Fgn.A07((Fragment) this.A01, abstractC115105If);
                i2 = -1338016158;
                C0f9.A0A(i2, A032);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -736792965);
                Fragment fragment5 = (Fragment) this.A01;
                if (fragment5.isResumed()) {
                    AbstractC35254Fgn.A02(fragment5.requireActivity(), abstractC115105If);
                }
                i2 = -206645853;
                C0f9.A0A(i2, A032);
                return;
            case 43:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 940665978);
                super.onFail(abstractC115105If);
                AbstractC35254Fgn.A07((Fragment) this.A01, abstractC115105If);
                i2 = -185129015;
                C0f9.A0A(i2, A032);
                return;
            case 44:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -109802883);
                Fragment fragment6 = (Fragment) this.A01;
                if (fragment6.isResumed()) {
                    AbstractC35254Fgn.A07(fragment6, abstractC115105If);
                }
                i2 = -1032755836;
                C0f9.A0A(i2, A032);
                return;
            case 45:
                A032 = C0f9.A03(791743772);
                AbstractC35254Fgn.A01(AbstractC31172DnG.A07(this.A01));
                i2 = 2109012396;
                C0f9.A0A(i2, A032);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -1461028843);
                Fragment fragment7 = (Fragment) this.A01;
                if (fragment7.isResumed()) {
                    AbstractC35254Fgn.A07(fragment7, abstractC115105If);
                }
                i2 = -940468202;
                C0f9.A0A(i2, A032);
                return;
            case 47:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 2066639668);
                C32267EJc c32267EJc = (C32267EJc) this.A01;
                AbstractC35075Fcm.A01(AbstractC166987dD.A0r(c32267EJc.A0A), "unknown");
                if (c32267EJc.isResumed()) {
                    AbstractC35254Fgn.A07(c32267EJc, abstractC115105If);
                }
                i2 = -578154681;
                C0f9.A0A(i2, A032);
                return;
            case 48:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 598021989);
                AbstractC35254Fgn.A07((Fragment) this.A01, abstractC115105If);
                i2 = -2105690603;
                C0f9.A0A(i2, A032);
                return;
            case 49:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -432205616);
                C32267EJc c32267EJc2 = (C32267EJc) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c32267EJc2.A0A);
                InterfaceC40821up A0L3 = AbstractC31172DnG.A0L(abstractC115105If);
                if (A0L3 == null || (str8 = A0L3.getErrorMessage()) == null) {
                    str8 = "unknown";
                }
                AbstractC35075Fcm.A01(A0r, str8);
                AbstractC35254Fgn.A07(c32267EJc2, abstractC115105If);
                i2 = -977984321;
                C0f9.A0A(i2, A032);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 2093353436);
                Fragment fragment8 = (Fragment) this.A01;
                if (fragment8.isResumed()) {
                    AbstractC35254Fgn.A07(fragment8, abstractC115105If);
                }
                i2 = 513351151;
                C0f9.A0A(i2, A032);
                return;
        }
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        String str;
        if (19 - this.A00 != 0) {
            super.onFailInBackground(abstractC115105If);
            return;
        }
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 887706813);
        C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
        if (c40781ul == null || (str = c40781ul.getErrorMessage()) == null) {
            str = "";
        }
        AbstractC166987dD.A1T(C18950wb.A01, AnonymousClass001.A0R("Could not load pending threads: ", str), 20134884);
        C0f9.A0A(-1677328336, A0N);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(-1654465176);
                ((Runnable) this.A01).run();
                i = 766810213;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(1679063863);
                super.onFinish();
                i = -2137817201;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = C0f9.A03(-2145548729);
                super.onFinish();
                ImportMsgrIceBreakersFragment.A01((ImportMsgrIceBreakersFragment) this.A01, EnumC153216up.A05);
                i = -11418643;
                C0f9.A0A(i, A03);
                return;
            case 4:
            case 7:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 22:
            case 23:
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            case 31:
            case Seq.NULL_REFNUM /* 41 */:
            case 43:
            case 45:
            case 48:
            default:
                super.onFinish();
                return;
            case 5:
                A03 = C0f9.A03(-70717658);
                super.onFinish();
                ((C36292Fzm) this.A01).A01 = null;
                i = -444431482;
                C0f9.A0A(i, A03);
                return;
            case 6:
                A03 = C0f9.A03(2089163929);
                super.onFinish();
                i = 1051414131;
                C0f9.A0A(i, A03);
                return;
            case 8:
                A03 = C0f9.A03(-1238915196);
                i = -755386286;
                C0f9.A0A(i, A03);
                return;
            case 9:
                A03 = C0f9.A03(-152919575);
                C6WQ c6wq = ((C45481KBt) this.A01).A0J;
                if (c6wq == null) {
                    str = "progressDialog";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c6wq.hide();
                i = -1401110636;
                C0f9.A0A(i, A03);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(-1427796954);
                i = 1508289425;
                C0f9.A0A(i, A03);
                return;
            case 21:
                A03 = C0f9.A03(1208631055);
                C32353ENa c32353ENa = (C32353ENa) this.A01;
                c32353ENa.A0A = false;
                InterfaceC70513Em interfaceC70513Em = c32353ENa.A03;
                if (interfaceC70513Em == null) {
                    str = "pullToRefresh";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                interfaceC70513Em.setIsLoading(false);
                AbstractC31557Dth.A01(c32353ENa, false);
                i = -1246427146;
                C0f9.A0A(i, A03);
                return;
            case 25:
                A03 = C0f9.A03(717496188);
                C33228ElK c33228ElK = (C33228ElK) this.A01;
                c33228ElK.A06 = false;
                AbstractC31178DnM.A0v(c33228ElK);
                i = 1073168562;
                C0f9.A0A(i, A03);
                return;
            case 26:
                A03 = C0f9.A03(-1803797495);
                C33228ElK c33228ElK2 = (C33228ElK) this.A01;
                c33228ElK2.A06 = false;
                AbstractC31178DnM.A0v(c33228ElK2);
                i = -1113438013;
                C0f9.A0A(i, A03);
                return;
            case 27:
                A03 = C0f9.A03(-1890931160);
                C33231ElP c33231ElP = (C33231ElP) this.A01;
                c33231ElP.A04 = false;
                AbstractC31178DnM.A0v(c33231ElP);
                i = 987978861;
                C0f9.A0A(i, A03);
                return;
            case 28:
                A03 = C0f9.A03(1097442347);
                ((C32369ENt) this.A01).A07 = false;
                i = 151682645;
                C0f9.A0A(i, A03);
                return;
            case 32:
                A03 = C0f9.A03(1660926987);
                super.onFinish();
                ELC elc = (ELC) this.A01;
                elc.A0B = false;
                if (elc.isResumed()) {
                    AbstractC31175DnJ.A0j(elc.getActivity(), false);
                }
                i = 213993978;
                C0f9.A0A(i, A03);
                return;
            case 33:
                A03 = C0f9.A03(-594767191);
                AbstractC31179DnN.A0u((Fragment) this.A01);
                i = 283981988;
                C0f9.A0A(i, A03);
                return;
            case 34:
                A03 = C0f9.A03(310887759);
                AbstractC31179DnN.A0u((Fragment) this.A01);
                i = 1775249827;
                C0f9.A0A(i, A03);
                return;
            case 35:
                A03 = C0f9.A03(-605141759);
                AbstractC31179DnN.A0u((Fragment) this.A01);
                i = -929851974;
                C0f9.A0A(i, A03);
                return;
            case 36:
                A03 = C0f9.A03(-1915830656);
                AbstractC31179DnN.A0u((Fragment) this.A01);
                i = 565064929;
                C0f9.A0A(i, A03);
                return;
            case 37:
                A03 = C0f9.A03(1333184573);
                super.onFinish();
                ((EMQ) this.A01).A03.A00();
                i = -206880194;
                C0f9.A0A(i, A03);
                return;
            case 38:
                A03 = C0f9.A03(514922389);
                super.onFinish();
                ((EMQ) this.A01).A03.A00();
                i = 1849484053;
                C0f9.A0A(i, A03);
                return;
            case 39:
                A03 = C0f9.A03(1388364077);
                super.onFinish();
                ((EMQ) this.A01).A03.A00();
                i = -159141954;
                C0f9.A0A(i, A03);
                return;
            case 40:
                A03 = C0f9.A03(-367287734);
                C32253EIm c32253EIm = (C32253EIm) this.A01;
                c32253EIm.A05.setEnabled(true);
                c32253EIm.A05.setShowProgressBar(false);
                i = 1583321339;
                C0f9.A0A(i, A03);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A03 = C0f9.A03(-21496360);
                ProgressButton progressButton = ((EJA) this.A01).A01;
                if (progressButton != null) {
                    progressButton.setShowProgressBar(false);
                    i = 609528100;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "nextButton";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 44:
                A03 = C0f9.A03(166289966);
                C32290EKd c32290EKd = (C32290EKd) this.A01;
                ProgressButton progressButton2 = c32290EKd.A00;
                str = "nextButton";
                if (progressButton2 != null) {
                    progressButton2.setEnabled(true);
                    ProgressButton progressButton3 = c32290EKd.A00;
                    if (progressButton3 != null) {
                        progressButton3.setShowProgressBar(false);
                        i = 2143045774;
                        C0f9.A0A(i, A03);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A03 = C0f9.A03(399682624);
                C32267EJc c32267EJc = (C32267EJc) this.A01;
                ProgressButton progressButton4 = c32267EJc.A02;
                str = "nextButton";
                if (progressButton4 != null) {
                    progressButton4.setEnabled(true);
                    ProgressButton progressButton5 = c32267EJc.A02;
                    if (progressButton5 != null) {
                        progressButton5.setShowProgressBar(false);
                        i = 813620376;
                        C0f9.A0A(i, A03);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 47:
                A03 = C0f9.A03(434969723);
                ProgressButton progressButton6 = ((C32267EJc) this.A01).A02;
                if (progressButton6 != null) {
                    progressButton6.setShowProgressBar(false);
                    i = 595098044;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "nextButton";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 49:
                A03 = C0f9.A03(-1141598479);
                ProgressButton progressButton7 = ((C32267EJc) this.A01).A02;
                if (progressButton7 != null) {
                    progressButton7.setShowProgressBar(false);
                    i = -1206060770;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "nextButton";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A03 = C0f9.A03(-1434505844);
                C32267EJc c32267EJc2 = (C32267EJc) this.A01;
                ProgressButton progressButton8 = c32267EJc2.A02;
                str = "nextButton";
                if (progressButton8 != null) {
                    progressButton8.setEnabled(true);
                    ProgressButton progressButton9 = c32267EJc2.A02;
                    if (progressButton9 != null) {
                        progressButton9.setShowProgressBar(false);
                        i = -211862949;
                        C0f9.A0A(i, A03);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        int A032;
        int i2;
        String str;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(298494106);
                super.onStart();
                ImportMsgrIceBreakersFragment.A01((ImportMsgrIceBreakersFragment) this.A01, EnumC153216up.A06);
                i = 1739732791;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = C0f9.A03(2120953649);
                super.onStart();
                ImportMsgrIceBreakersFragment.A01((ImportMsgrIceBreakersFragment) this.A01, EnumC153216up.A06);
                i = 570882297;
                C0f9.A0A(i, A03);
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 22:
            case 23:
            case 24:
            case 30:
            case 31:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
            case 45:
            case 48:
            default:
                super.onStart();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A032 = C0f9.A03(-1062905444);
                i2 = 149091450;
                C0f9.A0A(i2, A032);
                return;
            case 20:
                A03 = C0f9.A03(1469308850);
                super.onStart();
                EQM eqm = ((C32356ENd) this.A01).A03;
                str = "userListAdapter";
                if (eqm != null) {
                    eqm.A0C = true;
                    eqm.A03();
                    i = -1233998;
                    C0f9.A0A(i, A03);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 21:
                A03 = C0f9.A03(370633400);
                C32353ENa c32353ENa = (C32353ENa) this.A01;
                c32353ENa.A0A = true;
                InterfaceC70513Em interfaceC70513Em = c32353ENa.A03;
                if (interfaceC70513Em == null) {
                    str = "pullToRefresh";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                interfaceC70513Em.setIsLoading(true);
                i = -1629250063;
                C0f9.A0A(i, A03);
                return;
            case 25:
                A03 = C0f9.A03(416699116);
                C33228ElK c33228ElK = (C33228ElK) this.A01;
                c33228ElK.A06 = true;
                AbstractC31178DnM.A0v(c33228ElK);
                i = 1033956442;
                C0f9.A0A(i, A03);
                return;
            case 26:
                A03 = C0f9.A03(834225562);
                ((C33228ElK) this.A01).A06 = true;
                i = 204810320;
                C0f9.A0A(i, A03);
                return;
            case 27:
                A03 = C0f9.A03(-560596602);
                C33231ElP c33231ElP = (C33231ElP) this.A01;
                c33231ElP.A04 = true;
                AbstractC31178DnM.A0v(c33231ElP);
                i = 786043148;
                C0f9.A0A(i, A03);
                return;
            case 28:
                A03 = C0f9.A03(-1020841364);
                C32369ENt c32369ENt = (C32369ENt) this.A01;
                c32369ENt.A07 = true;
                AbstractC31175DnJ.A0j(c32369ENt.getActivity(), true);
                c32369ENt.A00.setEnabled(false);
                c32369ENt.A02.setEnabled(false);
                c32369ENt.A01.setEnabled(false);
                i = 1668178743;
                C0f9.A0A(i, A03);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A03 = C0f9.A03(-1270476891);
                super.onStart();
                EK8 ek8 = (EK8) this.A01;
                ek8.A08 = true;
                EK8.A00(ek8);
                i = -850019867;
                C0f9.A0A(i, A03);
                return;
            case 32:
                A03 = C0f9.A03(-978084490);
                super.onStart();
                ELC elc = (ELC) this.A01;
                elc.A0B = true;
                AbstractC31175DnJ.A0j(elc.getActivity(), true);
                i = 511891444;
                C0f9.A0A(i, A03);
                return;
            case 33:
                A03 = C0f9.A03(-1993388809);
                AbstractC31179DnN.A0v((Fragment) this.A01);
                i = 1880175042;
                C0f9.A0A(i, A03);
                return;
            case 34:
                A03 = C0f9.A03(1026193612);
                AbstractC31179DnN.A0v((Fragment) this.A01);
                i = -429117080;
                C0f9.A0A(i, A03);
                return;
            case 35:
                A03 = C0f9.A03(571123635);
                AbstractC31179DnN.A0v((Fragment) this.A01);
                i = -1728003245;
                C0f9.A0A(i, A03);
                return;
            case 36:
                A03 = C0f9.A03(519214763);
                AbstractC31179DnN.A0v((Fragment) this.A01);
                i = -942599450;
                C0f9.A0A(i, A03);
                return;
            case 37:
                A03 = C0f9.A03(-2113577799);
                super.onStart();
                ((EMQ) this.A01).A03.A01();
                i = -1386396440;
                C0f9.A0A(i, A03);
                return;
            case 38:
                A03 = C0f9.A03(-420941889);
                super.onStart();
                ((EMQ) this.A01).A03.A01();
                i = -1304889356;
                C0f9.A0A(i, A03);
                return;
            case 39:
                A03 = C0f9.A03(1918989541);
                super.onStart();
                ((EMQ) this.A01).A03.A01();
                i = 1871344476;
                C0f9.A0A(i, A03);
                return;
            case 40:
                A03 = C0f9.A03(-500195404);
                C32253EIm c32253EIm = (C32253EIm) this.A01;
                c32253EIm.A05.setEnabled(false);
                c32253EIm.A05.setShowProgressBar(true);
                i = 708989549;
                C0f9.A0A(i, A03);
                return;
            case 44:
                A032 = C0f9.A03(1777888279);
                C32290EKd c32290EKd = (C32290EKd) this.A01;
                ProgressButton progressButton = c32290EKd.A00;
                str = "nextButton";
                if (progressButton != null) {
                    progressButton.setEnabled(false);
                    ProgressButton progressButton2 = c32290EKd.A00;
                    if (progressButton2 != null) {
                        progressButton2.setShowProgressBar(true);
                        i2 = 1112352472;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A032 = C0f9.A03(761434490);
                C32267EJc c32267EJc = (C32267EJc) this.A01;
                ProgressButton progressButton3 = c32267EJc.A02;
                str = "nextButton";
                if (progressButton3 != null) {
                    progressButton3.setEnabled(false);
                    ProgressButton progressButton4 = c32267EJc.A02;
                    if (progressButton4 != null) {
                        progressButton4.setShowProgressBar(true);
                        i2 = 1520821382;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 47:
                A032 = C0f9.A03(1196194311);
                C32267EJc c32267EJc2 = (C32267EJc) this.A01;
                ProgressButton progressButton5 = c32267EJc2.A02;
                str = "nextButton";
                if (progressButton5 != null) {
                    progressButton5.setEnabled(false);
                    ProgressButton progressButton6 = c32267EJc2.A02;
                    if (progressButton6 != null) {
                        progressButton6.setShowProgressBar(true);
                        i2 = -225963630;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 49:
                A032 = C0f9.A03(-1166012448);
                C32267EJc c32267EJc3 = (C32267EJc) this.A01;
                ProgressButton progressButton7 = c32267EJc3.A02;
                str = "nextButton";
                if (progressButton7 != null) {
                    progressButton7.setEnabled(false);
                    ProgressButton progressButton8 = c32267EJc3.A02;
                    if (progressButton8 != null) {
                        progressButton8.setShowProgressBar(true);
                        i2 = -1296807108;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A032 = C0f9.A03(1318989224);
                C32267EJc c32267EJc4 = (C32267EJc) this.A01;
                ProgressButton progressButton9 = c32267EJc4.A02;
                str = "nextButton";
                if (progressButton9 != null) {
                    progressButton9.setEnabled(false);
                    ProgressButton progressButton10 = c32267EJc4.A02;
                    if (progressButton10 != null) {
                        progressButton10.setShowProgressBar(true);
                        i2 = -1194918479;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x06bd, code lost:
    
        if (r3 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0705, code lost:
    
        if (r3 != X.Ni8.A02) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0749, code lost:
    
        if (r3 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0fa6, code lost:
    
        if (r2 == false) goto L427;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:272:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0a08  */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.Etd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, X.Ete] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 4404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EV0.onSuccess(java.lang.Object):void");
    }

    public EV0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
