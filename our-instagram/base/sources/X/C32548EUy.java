package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.banyan.BanyanCoordinator;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.AccountTypeSelectionV2Fragment;
import com.instagram.business.fragment.InviteFollowersV2Fragment;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.business.fragment.ProfileDisplayOptionsFragment;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.business.fragment.SupportProfileDisplayOptionsFragment;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.business.fragment.SupportServicePartnerSelectionFragment;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.EUy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32548EUy extends C1P1 {
    public final int A00;
    public final Object A01;

    public C32548EUy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Context context, AbstractC018607g abstractC018607g, C1ON c1on, Object obj, int i) {
        c1on.A00 = new C32548EUy(obj, i);
        C1GJ.A00(context, abstractC018607g, c1on);
    }

    public static void A01(C1ON c1on, Object obj, int i) {
        c1on.A00 = new C32548EUy(obj, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r4.length() != 0) goto L15;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v115, types: [X.EBH, X.1um] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.EBH, X.1um] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r18) {
        /*
            Method dump skipped, instructions count: 2214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32548EUy.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A0N;
        String str;
        int i;
        switch (this.A00) {
            case 18:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -1363868617);
                ELZ elz = (ELZ) this.A01;
                InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
                String str2 = null;
                String str3 = null;
                String str4 = elz.A01;
                if (elz.A03) {
                    str = "on";
                } else {
                    str = "off";
                }
                HashMap A0r = AbstractC167017dG.A0r("opt_in_promotional_email_setting", str);
                if (A0L != null) {
                    str3 = A0L.getErrorMessage();
                    str2 = A0L.getErrorType();
                }
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = elz.A00;
                if (businessFlowAnalyticsLogger == null) {
                    AbstractC31171DnF.A0s();
                    throw C00O.createAndThrow();
                }
                businessFlowAnalyticsLogger.Clv(new Y7A("opt_in_promotional_email", str4, "opt_in_promotional_email_setting", str3, str2, null, A0r, null));
                AbstractC167007dF.A0J().post(new GNV(elz, this));
                i = -1187073120;
                break;
            case 21:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 773600179);
                Handler A0J = AbstractC167007dF.A0J();
                EK9 ek9 = (EK9) this.A01;
                A0J.post(new GNW(ek9, this));
                EK9.A00(AbstractC31172DnG.A0L(abstractC115105If), ek9, "hide_more_comments_setting");
                i = 1752980585;
                break;
            case 22:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1478279044);
                Handler A0J2 = AbstractC167007dF.A0J();
                EK9 ek92 = (EK9) this.A01;
                A0J2.post(new GNX(ek92, this));
                EK9.A00(AbstractC31172DnG.A0L(abstractC115105If), ek92, "hide_message_requests_setting");
                i = 227024432;
                break;
            case 44:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 73807814);
                super.onFailInBackground(abstractC115105If);
                C1346766r c1346766r = (C1346766r) this.A01;
                if (((AtomicReference) c1346766r.A00).get() != C6KP.A01) {
                    c1346766r.A02(C46h.A00(abstractC115105If.A00()));
                    c1346766r.A00();
                }
                i = -1017971248;
                break;
            default:
                super.onFailInBackground(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(656693617);
                ProgressButton progressButton = ((AbstractC32319ELj) this.A01).A02;
                if (progressButton != null) {
                    progressButton.setShowProgressBar(false);
                }
                i = -1211832815;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(749671810);
                ELV elv = (ELV) this.A01;
                EVM evm = elv.A04;
                evm.getClass();
                evm.A00();
                elv.A09 = true;
                i = -1275170180;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(2130195805);
                EVM evm2 = ((RunnableC36813GKm) this.A01).A00.A04;
                if (evm2 != null) {
                    evm2.A00();
                }
                i = -1939082132;
                break;
            case 14:
                A03 = C0f9.A03(41863173);
                ((InviteFollowersV2Fragment) this.A01).mLoadingIndicator.setVisibility(8);
                i = 1789478108;
                break;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-950377233);
                C56352iT c56352iT = ((InviteFollowersV2Fragment) this.A01).A00;
                if (c56352iT != null) {
                    c56352iT.setIsLoading(false);
                }
                i = -2118338799;
                break;
            case 16:
                A03 = C0f9.A03(-1286261565);
                ((EL8) this.A01).A01.setIsLoading(false);
                i = -21332171;
                break;
            case 23:
                A03 = C0f9.A03(-1443413586);
                super.onFinish();
                i = -130475833;
                break;
            case 24:
                A03 = C0f9.A03(1877662180);
                C56352iT c56352iT2 = ((SuggestBusinessFragment) this.A01).mActionBarService;
                if (c56352iT2 != null) {
                    c56352iT2.setIsLoading(false);
                }
                i = -1698924631;
                break;
            case 25:
                A03 = C0f9.A03(553070340);
                SupportLinksFragment supportLinksFragment = (SupportLinksFragment) this.A01;
                supportLinksFragment.mLoadingIndicator.setVisibility(8);
                supportLinksFragment.mPartnerTypeRowsContainer.setVisibility(0);
                i = -756355587;
                break;
            case 26:
                A03 = C0f9.A03(-417586283);
                ((SupportProfileDisplayOptionsFragment) this.A01).mLoadingIndicator.setVisibility(8);
                i = -609692414;
                break;
            case 28:
                A03 = C0f9.A03(1905322300);
                ((SupportServiceEditUrlFragment) this.A01).A04.dismiss();
                i = 410125530;
                break;
            case 30:
                A03 = C0f9.A03(-773205334);
                super.onFinish();
                C56342iS c56342iS = C56352iT.A0t;
                Fragment fragment = (Fragment) this.A01;
                c56342iS.A03(fragment.getActivity()).EkH(null, false);
                AbstractC31177DnL.A18(fragment, c56342iS, false);
                i = -408753661;
                break;
            case 31:
                A03 = C0f9.A03(-865146852);
                OnboardingCheckListFragment onboardingCheckListFragment = ((C34716FRb) this.A01).A05;
                ProgressBar progressBar = onboardingCheckListFragment.mProgressBar;
                if (progressBar != null && onboardingCheckListFragment.mLayoutContent != null) {
                    progressBar.setVisibility(8);
                    onboardingCheckListFragment.mLayoutContent.setVisibility(0);
                }
                i = -1689372273;
                break;
            case 32:
                A03 = C0f9.A03(-1413167523);
                ((GZZ) this.A01).DGk();
                i = -1185160361;
                break;
            default:
                super.onFinish();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(2017952855);
                super.onStart();
                EL7 el7 = (EL7) this.A01;
                el7.A07 = true;
                EL7.A01(el7);
                i = -1951182927;
                break;
            case 1:
                A03 = C0f9.A03(1114992225);
                ProgressButton progressButton = ((AbstractC32319ELj) this.A01).A02;
                if (progressButton != null) {
                    progressButton.setShowProgressBar(true);
                }
                i = 1956553337;
                break;
            case 6:
                A03 = C0f9.A03(-337316715);
                ((AccountTypeSelectionV2Fragment) this.A01).A01.A01();
                i = -1871069792;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(-1869600207);
                EVM evm = ((ELV) this.A01).A04;
                evm.getClass();
                evm.A01();
                i = 1688530715;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(-2124985037);
                EVM evm2 = ((RunnableC36813GKm) this.A01).A00.A04;
                if (evm2 != null) {
                    evm2.A01();
                }
                i = -592057902;
                break;
            case 14:
                A03 = C0f9.A03(499054868);
                ((InviteFollowersV2Fragment) this.A01).mLoadingIndicator.setVisibility(0);
                i = -717777183;
                break;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-686341773);
                ((InviteFollowersV2Fragment) this.A01).A00.setIsLoading(true);
                i = -2108205505;
                break;
            case 16:
                A03 = C0f9.A03(1943129115);
                ((EL8) this.A01).A01.setIsLoading(true);
                i = -512637634;
                break;
            case 23:
                A03 = C0f9.A03(-1677098475);
                super.onStart();
                i = -1623264170;
                break;
            case 24:
                A03 = C0f9.A03(1386446675);
                ((SuggestBusinessFragment) this.A01).mActionBarService.setIsLoading(true);
                i = -604878986;
                break;
            case 25:
                A03 = C0f9.A03(2091804319);
                SupportLinksFragment supportLinksFragment = (SupportLinksFragment) this.A01;
                supportLinksFragment.mPartnerTypeRowsContainer.setVisibility(8);
                supportLinksFragment.mLoadingIndicator.setVisibility(0);
                i = -773764952;
                break;
            case 26:
                A03 = C0f9.A03(-1177372014);
                ((SupportProfileDisplayOptionsFragment) this.A01).mLoadingIndicator.setVisibility(0);
                i = 1820422460;
                break;
            case 27:
                A03 = C0f9.A03(879838075);
                C0fJ.A00(((SupportServiceEditUrlFragment) this.A01).A04);
                i = -202002914;
                break;
            case 30:
                A03 = C0f9.A03(246103306);
                super.onStart();
                C56342iS c56342iS = C56352iT.A0t;
                Fragment fragment = (Fragment) this.A01;
                c56342iS.A03(fragment.getActivity()).EkH(null, true);
                AbstractC31177DnL.A18(fragment, c56342iS, true);
                i = 527408629;
                break;
            case 31:
                A03 = C0f9.A03(1535959536);
                OnboardingCheckListFragment onboardingCheckListFragment = ((C34716FRb) this.A01).A05;
                ProgressBar progressBar = onboardingCheckListFragment.mProgressBar;
                if (progressBar != null && onboardingCheckListFragment.mLayoutContent != null) {
                    progressBar.setVisibility(0);
                    onboardingCheckListFragment.mLayoutContent.setVisibility(8);
                }
                i = 728830997;
                break;
            case 45:
                A03 = C0f9.A03(1841795331);
                super.onStart();
                AbstractC167007dF.A0w(((EOO) this.A01).A08);
                i = 1726565181;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v66, types: [X.EtB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.instagram.model.business.PublicPhoneContact, java.lang.Object] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        ?? r4;
        int i;
        String str;
        int i2;
        String str2;
        int A032;
        int i3;
        boolean z;
        Integer num;
        int i4;
        int i5;
        EnumC33401EpY enumC33401EpY;
        GHY ghy;
        int i6;
        int A033;
        int i7;
        String str3;
        EnumC33415Epm enumC33415Epm;
        GZZ gzz;
        FOW fow;
        int A034;
        int i8;
        View view;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-662699184);
                int A035 = C0f9.A03(-1087031784);
                super.onSuccess(obj);
                EL7 el7 = (EL7) this.A01;
                boolean z2 = el7.A02;
                UserSession userSession = el7.A00;
                if (z2) {
                    String obj2 = EnumC72430Xda.A02.toString();
                    r4 = 0;
                    boolean A1R = AbstractC167007dF.A1R(0, userSession, obj2);
                    C35191Ffj.A00(userSession, "create_password_success", obj2);
                    AbstractC25226BEj.A1P(el7);
                    AbstractC25226BEj.A1P(el7);
                    i = A1R;
                } else {
                    String obj3 = EnumC72430Xda.A03.toString();
                    r4 = 0;
                    boolean A1R2 = AbstractC167007dF.A1R(0, userSession, obj3);
                    C35191Ffj.A00(userSession, "create_password_success", obj3);
                    i = A1R2;
                }
                el7.A07 = r4;
                EL7.A01(el7);
                C9GR.A08(el7.getContext(), 2131969373, i);
                boolean z3 = el7.A03;
                AbstractC10360h2 parentFragmentManager = el7.getParentFragmentManager();
                if (z3) {
                    str = "AccountLinkingMainGroupManagementFragment.BACK_STACK_STATE_NAME";
                } else {
                    str = "AccountLinkingChildGroupManagementFragment.BACK_STACK_STATE_NAME";
                }
                parentFragmentManager.A0x(str, r4);
                C0f9.A0A(-303459960, A035);
                i2 = -1035725643;
                C0f9.A0A(i2, A03);
                return;
            case 1:
                A03 = C0f9.A03(621180139);
                int A036 = C0f9.A03(1233808154);
                C32117E9q c32117E9q = (C32117E9q) this.A01;
                AbstractC31171DnF.A16(c32117E9q);
                if (c32117E9q.A04) {
                    UserSession userSession2 = c32117E9q.A00;
                    str2 = "currentUserSession";
                    if (userSession2 != null) {
                        C83743oJ A01 = C83743oJ.A01(userSession2);
                        String str4 = c32117E9q.A03;
                        if (str4 != null) {
                            Integer num2 = C05F.A03;
                            UserSession userSession3 = c32117E9q.A00;
                            if (userSession3 != null) {
                                A01.A09(c32117E9q.getContext(), c32117E9q, userSession3, num2, str4, true);
                            }
                        }
                        str2 = "targetUserId";
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                InterfaceC08430c6 targetFragment = c32117E9q.getTargetFragment();
                if (targetFragment instanceof GXA) {
                    GXA gxa = (GXA) targetFragment;
                    String str5 = c32117E9q.A03;
                    if (str5 != null) {
                        String str6 = c32117E9q.A02;
                        if (str6 == null) {
                            str2 = "mainUserId";
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        gxa.DXn(str5, str6);
                    }
                    str2 = "targetUserId";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                AbstractC10360h2 abstractC10360h2 = c32117E9q.mFragmentManager;
                if (abstractC10360h2 != null) {
                    abstractC10360h2.A0b();
                }
                C0f9.A0A(-2053079842, A036);
                i2 = -773069475;
                C0f9.A0A(i2, A03);
                return;
            case 2:
            case 18:
            case 21:
            case 22:
            case 44:
            default:
                super.onSuccess(obj);
                return;
            case 3:
                A03 = C0f9.A03(1648311360);
                C3DC c3dc = (C3DC) obj;
                int A0N = AbstractC167017dG.A0N(c3dc, 1079055429);
                BanyanCoordinator banyanCoordinator = (BanyanCoordinator) this.A01;
                Object F7f = c3dc.F7f();
                C14360o3.A07(F7f);
                BanyanCoordinator.A03((XFO) F7f, banyanCoordinator);
                C0f9.A0A(26395993, A0N);
                i2 = -1922385603;
                C0f9.A0A(i2, A03);
                return;
            case 4:
                A03 = C0f9.A03(-1758659420);
                C31505Dsp c31505Dsp = (C31505Dsp) obj;
                int A0N2 = AbstractC167017dG.A0N(c31505Dsp, 24948962);
                AbstractC31176DnK.A0K(this.A01).A00 = c31505Dsp;
                C0f9.A0A(-303295641, A0N2);
                i2 = 180964301;
                C0f9.A0A(i2, A03);
                return;
            case 5:
                A03 = C0f9.A03(-991572914);
                C74293Vk c74293Vk = (C74293Vk) obj;
                int A0N3 = AbstractC167017dG.A0N(c74293Vk, 516405025);
                List list = c74293Vk.A06;
                C14360o3.A07(list);
                C38321qM c38321qM = (C38321qM) AbstractC001800i.A0J(list);
                if (c38321qM != null) {
                    AbstractC25651Mw.A00((AbstractC12990ll) this.A01).E4s(new C36095FwV(c38321qM));
                }
                C0f9.A0A(-666690332, A0N3);
                i2 = 1428669125;
                C0f9.A0A(i2, A03);
                return;
            case 6:
                A03 = C0f9.A03(1990166975);
                EBH ebh = (EBH) obj;
                int A037 = C0f9.A03(-290082505);
                AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment = (AccountTypeSelectionV2Fragment) this.A01;
                if (accountTypeSelectionV2Fragment.A00 != null) {
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("should_show_edit_contact_info_step", String.valueOf(ebh.A00));
                    accountTypeSelectionV2Fragment.A00.CjJ(new Y7A("account_type_selection", accountTypeSelectionV2Fragment.A05, "professional_conversion_nux_config", null, null, null, null, A1G));
                }
                InterfaceC37222GaX interfaceC37222GaX = accountTypeSelectionV2Fragment.mController;
                interfaceC37222GaX.getClass();
                AbstractC31176DnK.A0K(interfaceC37222GaX).A01 = ebh;
                accountTypeSelectionV2Fragment.A08.post(new RunnableC36807GKg(accountTypeSelectionV2Fragment));
                C0f9.A0A(229164098, A037);
                i2 = -1066559884;
                C0f9.A0A(i2, A03);
                return;
            case 7:
                A03 = C0f9.A03(1850384920);
                int A038 = C0f9.A03(137362577);
                C32307EKu c32307EKu = (C32307EKu) this.A01;
                List list2 = c32307EKu.A06;
                if (list2 == null) {
                    str2 = "selectedObjectiveIds";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                java.util.Set set = c32307EKu.A09;
                if (c32307EKu.A02 != null) {
                    HashMap A1G2 = AbstractC166987dD.A1G();
                    A1G2.put("objectives", AbstractC001800i.A0P(", ", "", "", list2, null));
                    A1G2.put("connection_methods", AbstractC001800i.A0P(", ", "", "", set, null));
                    BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = c32307EKu.A02;
                    if (businessFlowAnalyticsLogger != null) {
                        businessFlowAnalyticsLogger.Clu(new Y7A("business_objectives", c32307EKu.A05, null, null, null, null, A1G2, null));
                    }
                }
                AbstractC31174DnI.A1O(AbstractC31176DnK.A0Q(c32307EKu.A0B), C05F.A02);
                c32307EKu.getParentFragmentManager().A0x("BusinessObjectives", 1);
                C9GR.A07(c32307EKu.requireContext(), 2131952330);
                C0f9.A0A(1090659135, A038);
                i2 = -49118971;
                C0f9.A0A(i2, A03);
                return;
            case 8:
                A032 = C0f9.A03(-1403498453);
                ECK eck = (ECK) obj;
                int A0N4 = AbstractC167017dG.A0N(eck, 2063518167);
                C32308EKv c32308EKv = (C32308EKv) this.A01;
                c32308EKv.A06 = eck.A01;
                ((C31808DyS) c32308EKv.A0B.getValue()).A00.A0B(eck.A00);
                List<C32188ECj> list3 = c32308EKv.A06;
                if (list3 == null) {
                    str2 = "objectives";
                } else {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    java.util.Set set2 = c32308EKv.A0A;
                    if (set2.isEmpty()) {
                        for (C32188ECj c32188ECj : list3) {
                            if (AbstractC166997dE.A1Z(c32188ECj.A00, true) && (num = c32188ECj.A01) != null) {
                                set2.add(num);
                            }
                        }
                    }
                    for (C32188ECj c32188ECj2 : list3) {
                        if (set2.size() >= 2) {
                            z = false;
                            if (!AbstractC001800i.A0u(set2, c32188ECj2.A01)) {
                                c32188ECj2.A00 = Boolean.valueOf(AbstractC001800i.A0u(set2, c32188ECj2.A01));
                                ?? obj4 = new Object();
                                obj4.A00 = c32188ECj2;
                                obj4.A01 = z;
                                A1E.add(obj4);
                            }
                        }
                        z = true;
                        c32188ECj2.A00 = Boolean.valueOf(AbstractC001800i.A0u(set2, c32188ECj2.A01));
                        ?? obj42 = new Object();
                        obj42.A00 = c32188ECj2;
                        obj42.A01 = z;
                        A1E.add(obj42);
                    }
                    c32308EKv.A07 = A1E;
                    C31867DzZ c31867DzZ = c32308EKv.A01;
                    if (c31867DzZ == null) {
                        str2 = "adapter";
                    } else {
                        AbstractC31175DnJ.A0x(c31867DzZ, AbstractC001800i.A0a(A1E), c31867DzZ.A01);
                        IgdsBottomButtonLayout igdsBottomButtonLayout = c32308EKv.A04;
                        if (igdsBottomButtonLayout != null) {
                            igdsBottomButtonLayout.setPrimaryButtonEnabled(AbstractC167007dF.A1P(set2.size(), 2));
                        }
                        C0f9.A0A(-993788536, A0N4);
                        i3 = -1867839036;
                        C0f9.A0A(i3, A032);
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 9:
                A03 = C0f9.A03(-1447341511);
                EBD ebd = (EBD) obj;
                int A0N5 = AbstractC167017dG.A0N(ebd, 1464469441);
                C31886Dzs c31886Dzs = ((C32242EIa) this.A01).A00;
                if (c31886Dzs != null) {
                    c31886Dzs.A00 = ebd.A00;
                    c31886Dzs.notifyDataSetChanged();
                    C0f9.A0A(-277410719, A0N5);
                    i2 = 337408911;
                    C0f9.A0A(i2, A03);
                    return;
                }
                str2 = "boostGuidanceAdapter";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 10:
                A03 = C0f9.A03(944163693);
                EBD ebd2 = (EBD) obj;
                int A0N6 = AbstractC167017dG.A0N(ebd2, -1725516086);
                C31886Dzs c31886Dzs2 = ((C32305EKs) this.A01).A00;
                if (c31886Dzs2 != null) {
                    c31886Dzs2.A00 = ebd2.A00;
                    c31886Dzs2.notifyDataSetChanged();
                    C0f9.A0A(904689621, A0N6);
                    i2 = -979214027;
                    C0f9.A0A(i2, A03);
                    return;
                }
                str2 = "boostGuidanceAdapter";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 11:
                A03 = C0f9.A03(-884296229);
                EBH ebh2 = (EBH) obj;
                int A039 = C0f9.A03(-1082639337);
                EO0 eo0 = (EO0) this.A01;
                View view2 = eo0.A01;
                if (view2 != null && eo0.A00 != null) {
                    view2.setVisibility(8);
                    eo0.A00.setVisibility(0);
                }
                boolean z4 = !ebh2.A00;
                eo0.A0C = z4;
                if (z4) {
                    eo0.A04.A01();
                }
                C0f9.A0A(-292476649, A039);
                i2 = -1585027883;
                C0f9.A0A(i2, A03);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(41948937);
                int A0310 = C0f9.A03(565742616);
                C34649FOh c34649FOh = ((ECB) obj).A00;
                if (c34649FOh == null) {
                    i4 = -832803693;
                } else {
                    PublicPhoneContact publicPhoneContact = null;
                    if (!TextUtils.isEmpty(c34649FOh.A0M)) {
                        String str7 = c34649FOh.A0B;
                        String str8 = c34649FOh.A0H;
                        String str9 = c34649FOh.A0M;
                        ?? obj5 = new Object();
                        obj5.A01 = str7;
                        obj5.A02 = str8;
                        obj5.A03 = str9;
                        obj5.A00 = "CALL";
                        publicPhoneContact = obj5;
                    }
                    ELV elv = (ELV) this.A01;
                    C35130FeX c35130FeX = new C35130FeX(elv.A06);
                    c35130FeX.A0B = c34649FOh.A0D;
                    c35130FeX.A01 = publicPhoneContact;
                    elv.A06 = new BusinessInfo(c35130FeX);
                    ELV.A00(elv, true);
                    String str10 = c34649FOh.A0D;
                    String str11 = c34649FOh.A0M;
                    if (elv.A01 != null) {
                        HashMap A1G3 = AbstractC166987dD.A1G();
                        A1G3.put("email", str10);
                        A1G3.put("phone", str11);
                        elv.A01.CjJ(new Y7A("edit_contact_info", elv.A08, "personal_contact_info", null, null, null, null, A1G3));
                    }
                    i4 = 24244892;
                }
                C0f9.A0A(i4, A0310);
                i2 = 650400;
                C0f9.A0A(i2, A03);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(-287291036);
                ELV elv2 = ((RunnableC36813GKm) this.A01).A00;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = elv2.A01;
                if (businessFlowAnalyticsLogger2 != null) {
                    businessFlowAnalyticsLogger2.Clu(new Y7A("edit_contact_info", elv2.A08, "save_info", null, null, null, F0F.A00(elv2.A06), null));
                }
                ((BusinessConversionActivity) elv2.A02).CnD(null);
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger3 = elv2.A01;
                if (businessFlowAnalyticsLogger3 != null) {
                    businessFlowAnalyticsLogger3.CjL(new Y7A("edit_contact_info", elv2.A08, null, null, null, null, null, null));
                }
                i2 = 2001110379;
                C0f9.A0A(i2, A03);
                return;
            case 14:
                A03 = C0f9.A03(602749269);
                EBF ebf = (EBF) obj;
                int A0311 = C0f9.A03(-61270556);
                InviteFollowersV2Fragment inviteFollowersV2Fragment = (InviteFollowersV2Fragment) this.A01;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger4 = inviteFollowersV2Fragment.A02;
                if (businessFlowAnalyticsLogger4 != null) {
                    businessFlowAnalyticsLogger4.CjJ(new Y7A("invite_followers", inviteFollowersV2Fragment.A05, "invite_followers", null, null, null, null, null));
                }
                List<FRF> list4 = ebf.A00;
                if (list4 != null && !list4.isEmpty()) {
                    C35042FcF c35042FcF = new C35042FcF(inviteFollowersV2Fragment, inviteFollowersV2Fragment, inviteFollowersV2Fragment.A04, inviteFollowersV2Fragment);
                    c35042FcF.A00 = inviteFollowersV2Fragment;
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    for (FRF frf : list4) {
                        String str12 = frf.A05;
                        EnumC33401EpY[] values = EnumC33401EpY.values();
                        int length = values.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                enumC33401EpY = values[i9];
                                if (!C14360o3.A0K(enumC33401EpY.A00, str12)) {
                                    i9++;
                                }
                            } else {
                                enumC33401EpY = null;
                            }
                        }
                        enumC33401EpY.getClass();
                        switch (enumC33401EpY.ordinal()) {
                            case 0:
                                c35042FcF.A02(A1E2, frf.A02);
                                continue;
                            case 1:
                                String str13 = frf.A02;
                                C14360o3.A0B(str13, 1);
                                ghy = new GHY(c35042FcF.A02.requireContext(), new ViewOnClickListenerC35686FpL(c35042FcF, 67), str13);
                                i6 = R.drawable.instagram_direct_pano_outline_24;
                                break;
                            case 2:
                                c35042FcF.A01(A1E2, frf.A02);
                                continue;
                            case 4:
                                c35042FcF.A04(A1E2, frf.A02);
                                continue;
                            case 5:
                                String str14 = frf.A02;
                                C14360o3.A0B(str14, 1);
                                ghy = new GHY(c35042FcF.A02.requireContext(), new ViewOnClickListenerC35686FpL(c35042FcF, 68), str14);
                                i6 = R.drawable.instagram_users_pano_outline_24;
                                break;
                            case 6:
                                c35042FcF.A03(A1E2, frf.A02);
                                continue;
                            case 7:
                                c35042FcF.A05(A1E2, frf.A02);
                                continue;
                            case 8:
                                String str15 = frf.A02;
                                C14360o3.A0B(str15, 1);
                                ghy = new GHY(c35042FcF.A02.requireContext(), new ViewOnClickListenerC35687FpM(45, frf, c35042FcF), str15);
                                i6 = R.drawable.instagram_story_pano_outline_24;
                                break;
                        }
                        ghy.A03 = i6;
                        A1E2.add(ghy);
                    }
                    inviteFollowersV2Fragment.setItems(A1E2);
                    i5 = 1610493240;
                } else {
                    C9GR.A05(inviteFollowersV2Fragment.requireContext());
                    i5 = 2096059913;
                }
                C0f9.A0A(i5, A0311);
                i2 = -1419884306;
                C0f9.A0A(i2, A03);
                return;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-382974915);
                int A0312 = C0f9.A03(2137346099);
                InviteFollowersV2Fragment inviteFollowersV2Fragment2 = (InviteFollowersV2Fragment) this.A01;
                inviteFollowersV2Fragment2.A08 = false;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger5 = inviteFollowersV2Fragment2.A02;
                if (businessFlowAnalyticsLogger5 != null) {
                    businessFlowAnalyticsLogger5.Clu(new Y7A("invite_followers", inviteFollowersV2Fragment2.A05, null, null, null, null, null, null));
                }
                if (!inviteFollowersV2Fragment2.A07) {
                    AbstractC31174DnI.A1O(AbstractC25651Mw.A00(inviteFollowersV2Fragment2.A04), C05F.A0Y);
                }
                AbstractC31177DnL.A12(inviteFollowersV2Fragment2);
                C0f9.A0A(1374797914, A0312);
                i2 = 926833506;
                C0f9.A0A(i2, A03);
                return;
            case 16:
                A03 = C0f9.A03(-999312748);
                int A0313 = C0f9.A03(-359161606);
                EL8 el8 = (EL8) this.A01;
                el8.A08 = false;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger6 = el8.A03;
                if (businessFlowAnalyticsLogger6 != null) {
                    businessFlowAnalyticsLogger6.Clu(new Y7A("learn_professional_tools", el8.A06, null, null, null, null, null, null));
                }
                if (!el8.A07) {
                    AbstractC31174DnI.A1O(AbstractC25651Mw.A00(el8.A05), C05F.A15);
                }
                AbstractC25226BEj.A1Q(el8);
                C0f9.A0A(-1684641726, A0313);
                i2 = 295200577;
                C0f9.A0A(i2, A03);
                return;
            case 17:
                A032 = C0f9.A03(-1339758947);
                int A0314 = C0f9.A03(-1821688239);
                AbstractC31174DnI.A1O(AbstractC25651Mw.A00(((OnboardingCheckListFragment) ((C36028FvQ) this.A01).A01).A07), C05F.A04);
                C0f9.A0A(-525771292, A0314);
                i3 = 94013556;
                C0f9.A0A(i3, A032);
                return;
            case Process.SIGSTOP /* 19 */:
                A03 = C0f9.A03(169363319);
                EBH ebh3 = (EBH) obj;
                int A0315 = C0f9.A03(-987602219);
                C14360o3.A0B(ebh3, 0);
                if (!ebh3.A00) {
                    View view3 = ((ProfileDisplayOptionsFragment) this.A01).rootView;
                    C14360o3.A0A(view3);
                    View A0S = AbstractC166997dE.A0S(view3, R.id.row_contacts);
                    AbstractC31172DnG.A1J(A0S, R.id.banner_container, 0);
                    TextView A0N7 = AbstractC167007dF.A0N(A0S, R.id.banner_text_1);
                    TextView A0N8 = AbstractC167007dF.A0N(A0S, R.id.banner_text_2);
                    TextView A0N9 = AbstractC167007dF.A0N(A0S, R.id.banner_text_3);
                    A0N7.setText(2131971144);
                    A0N8.setText(2131971145);
                    A0N9.setText(2131971146);
                }
                ProfileDisplayOptionsFragment profileDisplayOptionsFragment = (ProfileDisplayOptionsFragment) this.A01;
                View view4 = profileDisplayOptionsFragment.A01;
                if (view4 != null && profileDisplayOptionsFragment.A00 != null) {
                    view4.setVisibility(8);
                    View view5 = profileDisplayOptionsFragment.A00;
                    C14360o3.A0A(view5);
                    view5.setVisibility(0);
                }
                C0f9.A0A(951146675, A0315);
                i2 = -391490633;
                C0f9.A0A(i2, A03);
                return;
            case 20:
                A033 = C0f9.A03(-1449082542);
                EBH ebh4 = (EBH) obj;
                int A0N10 = AbstractC167017dG.A0N(ebh4, 2001559732);
                ELW elw = (ELW) this.A01;
                HashMap A1G4 = AbstractC166987dD.A1G();
                A1G4.put("should_show_edit_contact_info_step", String.valueOf(ebh4.A00));
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger7 = elw.A00;
                if (businessFlowAnalyticsLogger7 == null) {
                    str2 = "logger";
                } else {
                    businessFlowAnalyticsLogger7.CjJ(new Y7A("renew", elw.A03, "professional_conversion_nux_config", null, null, null, null, A1G4));
                    InterfaceC37222GaX interfaceC37222GaX2 = elw.A01;
                    if (interfaceC37222GaX2 == null) {
                        str2 = "controller";
                    } else {
                        AbstractC31176DnK.A0K(interfaceC37222GaX2).A01 = ebh4;
                        elw.A0D.post(new RunnableC36815GKo(elw));
                        C0f9.A0A(-307939070, A0N10);
                        i7 = 168101108;
                        C0f9.A0A(i7, A033);
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 23:
                A033 = C0f9.A03(-1696531143);
                int A0316 = C0f9.A03(128725220);
                super.onSuccess(obj);
                SuggestBusinessFragment.A00((SuggestBusinessFragment) this.A01).A00();
                C0f9.A0A(-1472719543, A0316);
                i7 = 1899905701;
                C0f9.A0A(i7, A033);
                return;
            case 24:
                A03 = C0f9.A03(769122044);
                int A0317 = C0f9.A03(1635683229);
                SuggestBusinessFragment suggestBusinessFragment = (SuggestBusinessFragment) this.A01;
                suggestBusinessFragment.A09 = false;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger8 = suggestBusinessFragment.A01;
                if (businessFlowAnalyticsLogger8 != null) {
                    businessFlowAnalyticsLogger8.Clu(new Y7A("pro_account_suggestions", suggestBusinessFragment.A05, null, null, null, null, null, null));
                }
                if (!suggestBusinessFragment.A08) {
                    AbstractC31174DnI.A1O(AbstractC25651Mw.A00(suggestBusinessFragment.A04), C05F.A01);
                }
                AbstractC31177DnL.A12(suggestBusinessFragment);
                C0f9.A0A(1177708206, A0317);
                i2 = 918654383;
                C0f9.A0A(i2, A03);
                return;
            case 25:
                A03 = C0f9.A03(911215868);
                ECL ecl = (ECL) obj;
                int A0318 = C0f9.A03(2105067287);
                SupportLinksFragment supportLinksFragment = (SupportLinksFragment) this.A01;
                supportLinksFragment.mPartnerTypeRowsContainer.removeAllViews();
                supportLinksFragment.A05 = false;
                C1LC it = ImmutableList.copyOf((Collection) ecl.A01).iterator();
                SMBPartnerType sMBPartnerType = null;
                C111184zg c111184zg = null;
                while (it.hasNext()) {
                    C32189ECk c32189ECk = (C32189ECk) it.next();
                    String str16 = c32189ECk.A02;
                    C111184zg c111184zg2 = c32189ECk.A00;
                    if (c111184zg2 == null) {
                        str3 = null;
                    } else {
                        str3 = c111184zg2.A06;
                    }
                    String str17 = c32189ECk.A01;
                    View inflate = supportLinksFragment.A00.inflate(R.layout.setup_action_button_row, supportLinksFragment.mPartnerTypeRowsContainer, false);
                    View A0D = AbstractC31173DnH.A0D(inflate, R.id.row_multiple_title);
                    TextView A09 = AbstractC31175DnJ.A09(A0D, R.id.row_title);
                    TextView A092 = AbstractC31175DnJ.A09(A0D, R.id.row_subtitle);
                    TextView A093 = AbstractC31175DnJ.A09(inflate, R.id.row_single_title);
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    if (SupportLinksFragment.A01(c111184zg2, str17) && (c111184zg2 == null || (str16 = c111184zg2.AyS()) == null)) {
                        str16 = supportLinksFragment.getString(2131964877);
                    }
                    if (!isEmpty) {
                        A09.setText(str16);
                        A092.setText(str3);
                        A0D.setVisibility(0);
                        A093.setVisibility(8);
                    } else {
                        A093.setText(str16);
                        A0D.setVisibility(8);
                        A093.setVisibility(0);
                    }
                    AbstractC56952jT.A01(inflate);
                    supportLinksFragment.mPartnerTypeRowsContainer.addView(inflate);
                    C0fQ.A00(new ViewOnClickListenerC35585Fnc(supportLinksFragment, c32189ECk.A00, c32189ECk.A01, 0), inflate);
                    ImageView imageView = (ImageView) AbstractC31173DnH.A0D(inflate, R.id.action_glyph);
                    String str18 = c32189ECk.A01;
                    Map map = EnumC33415Epm.A02;
                    if (map.containsKey(str18)) {
                        enumC33415Epm = (EnumC33415Epm) map.get(str18);
                    } else {
                        enumC33415Epm = EnumC33415Epm.A05;
                    }
                    imageView.setImageResource(enumC33415Epm.A00);
                    C111184zg c111184zg3 = c32189ECk.A00;
                    if (c111184zg3 != null) {
                        supportLinksFragment.A05 = true;
                        String str19 = c111184zg3.A04;
                        str19.getClass();
                        if (str19.equals(ecl.A00)) {
                            c111184zg = c111184zg3;
                        }
                    }
                }
                User A10 = AbstractC166987dD.A10(supportLinksFragment.A02);
                A10.A03.ETM(c111184zg);
                if (c111184zg != null) {
                    A10.A03.EQj(false);
                    sMBPartnerType = AbstractC81793ku.A00(c111184zg.A04);
                }
                A10.A03.ETN(sMBPartnerType);
                AbstractC31172DnG.A1R(supportLinksFragment.A02, A10);
                SupportLinksFragment.A00(supportLinksFragment);
                C35198Ffq c35198Ffq = supportLinksFragment.A01;
                boolean z5 = supportLinksFragment.A05;
                InterfaceC02590Ai A00 = C35198Ffq.A00(c35198Ffq);
                AbstractC31171DnF.A1A(A00, "home_page");
                C35198Ffq.A02(A00, c35198Ffq, "view", z5);
                A00.Cht();
                C0f9.A0A(1422217074, A0318);
                i2 = -927035984;
                C0f9.A0A(i2, A03);
                return;
            case 26:
                A03 = C0f9.A03(-829254534);
                int A0319 = C0f9.A03(616253035);
                SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment = (SupportProfileDisplayOptionsFragment) this.A01;
                EQ7 eq7 = supportProfileDisplayOptionsFragment.A02;
                ImmutableList copyOf = ImmutableList.copyOf((Collection) ((ECL) obj).A01);
                InterfaceC111194zh interfaceC111194zh = supportProfileDisplayOptionsFragment.A01;
                if (copyOf != null) {
                    eq7.A01 = copyOf;
                }
                eq7.A00 = null;
                if (interfaceC111194zh != null) {
                    for (C32189ECk c32189ECk2 : eq7.A01) {
                        if (C14360o3.A0K(c32189ECk2.A01, interfaceC111194zh.Amd())) {
                            eq7.A00 = c32189ECk2.A00;
                        }
                    }
                }
                EQ7.A00(eq7);
                C0f9.A0A(1221791353, A0319);
                i2 = -1166416025;
                C0f9.A0A(i2, A03);
                return;
            case 27:
                A03 = C0f9.A03(789719433);
                int A0320 = C0f9.A03(306316548);
                super.onSuccess(obj);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A01;
                SMBPartnerType sMBPartnerType2 = null;
                SupportServiceEditUrlFragment.A00(null, supportServiceEditUrlFragment);
                if (supportServiceEditUrlFragment.A0D) {
                    try {
                        sMBPartnerType2 = AbstractC81793ku.A00(supportServiceEditUrlFragment.A08);
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    sMBPartnerType2 = AbstractC81793ku.A00(supportServiceEditUrlFragment.A08);
                }
                if (supportServiceEditUrlFragment.A01.equals(sMBPartnerType2)) {
                    UserSession userSession4 = supportServiceEditUrlFragment.A03;
                    C32548EUy c32548EUy = new C32548EUy(supportServiceEditUrlFragment, 28);
                    C25621Ms A0C = AbstractC31179DnN.A0C(userSession4);
                    A0C.A0B("accounts/remove_profile_action_button/");
                    C1ON A0J = AbstractC31178DnM.A0J(A0C, EDJ.class, FTM.class);
                    A0J.A00 = c32548EUy;
                    supportServiceEditUrlFragment.schedule(A0J);
                } else {
                    supportServiceEditUrlFragment.A04.dismiss();
                    supportServiceEditUrlFragment.A0G.post(new RunnableC36818GKr(this));
                }
                C35198Ffq c35198Ffq2 = supportServiceEditUrlFragment.A02;
                String str20 = supportServiceEditUrlFragment.A07;
                String str21 = supportServiceEditUrlFragment.A05;
                String str22 = supportServiceEditUrlFragment.A0B;
                String str23 = supportServiceEditUrlFragment.A06;
                str23.getClass();
                C14360o3.A0B(str20, 0);
                AbstractC167017dG.A1P(str21, str22);
                InterfaceC02590Ai A002 = C35198Ffq.A00(c35198Ffq2);
                AbstractC31171DnF.A1A(A002, "remove_link");
                AbstractC31171DnF.A1C(A002, "success");
                C35198Ffq.A01(A002, c35198Ffq2, str20, str21, false);
                AbstractC31176DnK.A1L(A002, str22, str23);
                A002.Cht();
                C0f9.A0A(-348365956, A0320);
                i2 = 1149597689;
                C0f9.A0A(i2, A03);
                return;
            case 28:
                A033 = C0f9.A03(-376933576);
                int A0321 = C0f9.A03(1545245869);
                super.onSuccess(obj);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment2 = (SupportServiceEditUrlFragment) this.A01;
                User A102 = AbstractC166987dD.A10(supportServiceEditUrlFragment2.A03);
                A102.A03.ETN(null);
                A102.A03.ETM(null);
                AbstractC31172DnG.A1R(supportServiceEditUrlFragment2.A03, A102);
                supportServiceEditUrlFragment2.A0G.post(new RunnableC36819GKs(this));
                C35198Ffq c35198Ffq3 = supportServiceEditUrlFragment2.A02;
                String str24 = supportServiceEditUrlFragment2.A07;
                String str25 = supportServiceEditUrlFragment2.A05;
                String str26 = supportServiceEditUrlFragment2.A0B;
                String str27 = supportServiceEditUrlFragment2.A06;
                str27.getClass();
                AbstractC167027dH.A13(str25, str26, str27);
                InterfaceC02590Ai A003 = C35198Ffq.A00(c35198Ffq3);
                AbstractC31171DnF.A1A(A003, "remove_action_button");
                AbstractC31171DnF.A1C(A003, "success");
                C35198Ffq.A01(A003, c35198Ffq3, str24, str25, false);
                AbstractC31176DnK.A1L(A003, str26, str27);
                A003.AAP("button_label", null);
                A003.Cht();
                C0f9.A0A(-1289067143, A0321);
                i7 = 943689919;
                C0f9.A0A(i7, A033);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A03 = C0f9.A03(-128272203);
                EBI ebi = (EBI) obj;
                int A0322 = C0f9.A03(717348190);
                super.onSuccess(ebi);
                SupportServicePartnerSelectionFragment supportServicePartnerSelectionFragment = (SupportServicePartnerSelectionFragment) this.A01;
                List list5 = ebi.A00;
                supportServicePartnerSelectionFragment.A07 = list5;
                EQ3 eq3 = supportServicePartnerSelectionFragment.A02;
                eq3.A00 = list5;
                eq3.clear();
                List list6 = eq3.A00;
                if (list6 != null) {
                    Iterator it2 = list6.iterator();
                    while (it2.hasNext()) {
                        eq3.addModel(it2.next(), eq3.A01);
                    }
                }
                eq3.notifyDataSetChanged();
                AbstractC167007dF.A0x(supportServicePartnerSelectionFragment.mLoadingSpinner);
                C35198Ffq c35198Ffq4 = supportServicePartnerSelectionFragment.A03;
                String obj6 = supportServicePartnerSelectionFragment.A01.toString();
                boolean z6 = supportServicePartnerSelectionFragment.A08;
                InterfaceC02590Ai A004 = C35198Ffq.A00(c35198Ffq4);
                AbstractC31171DnF.A1A(A004, "fetch_partners");
                C35198Ffq.A02(A004, c35198Ffq4, "success", z6);
                A004.AAP("service_type", obj6);
                A004.Cht();
                C0f9.A0A(-765781998, A0322);
                i2 = -1255433838;
                C0f9.A0A(i2, A03);
                return;
            case 30:
                A033 = C0f9.A03(1687748899);
                int A0323 = C0f9.A03(332656804);
                AbstractC167007dF.A0J().post(new RunnableC36823GKw((ENl) this.A01));
                C0f9.A0A(1432286561, A0323);
                i7 = 561151584;
                C0f9.A0A(i7, A033);
                return;
            case 31:
                A03 = C0f9.A03(-789272814);
                C31505Dsp c31505Dsp2 = (C31505Dsp) obj;
                int A0N11 = AbstractC167017dG.A0N(c31505Dsp2, 283395573);
                C34716FRb c34716FRb = (C34716FRb) this.A01;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger9 = c34716FRb.A04;
                if (businessFlowAnalyticsLogger9 != null) {
                    businessFlowAnalyticsLogger9.CjJ(new Y7A("onboarding_checklist", c34716FRb.A08, null, null, null, null, null, null));
                }
                List list7 = c31505Dsp2.A03;
                if (!C17060sy.A01.A01(c34716FRb.A07).A2I() || !c31505Dsp2.A04 || (list7 != null && list7.isEmpty())) {
                    c34716FRb.A05.A00();
                }
                c34716FRb.A00 = c31505Dsp2.A00;
                String str28 = c31505Dsp2.A02;
                if (str28 != null) {
                    c34716FRb.A02 = str28;
                }
                String str29 = c31505Dsp2.A01;
                if (str29 != null) {
                    c34716FRb.A01 = str29;
                }
                List list8 = c31505Dsp2.A03;
                if (list8 != null) {
                    c34716FRb.A02(list8);
                }
                if (!C34716FRb.A09 && c34716FRb.A00 == EnumC31507Dsr.A06) {
                    C31500Dsk c31500Dsk = c34716FRb.A06;
                    C25621Ms A0c = AbstractC167017dG.A0c(c31500Dsk.A00);
                    A0c.A0B("business/account/set_onboarding_checklist_has_opened_status/");
                    c31500Dsk.A01.schedule(AbstractC31177DnL.A0Q(A0c));
                    C34716FRb.A09 = true;
                }
                if (c31505Dsp2.A05) {
                    C31500Dsk c31500Dsk2 = c34716FRb.A06;
                    C1GL c1gl = c31500Dsk2.A01;
                    C25621Ms A0c2 = AbstractC167017dG.A0c(c31500Dsk2.A00);
                    A0c2.A0B("business/account/set_onboarding_checklist_should_show_reminder/");
                    c1gl.schedule(AbstractC31178DnM.A0K(A0c2, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "0"));
                }
                C0f9.A0A(-2050429035, A0N11);
                i2 = 1095128627;
                C0f9.A0A(i2, A03);
                return;
            case 32:
                A03 = C0f9.A03(1753891813);
                C32174EBv c32174EBv = (C32174EBv) obj;
                int A0324 = C0f9.A03(-1485254454);
                C14360o3.A0B(c32174EBv, 0);
                ImmutableList A0L = AbstractC31173DnH.A0L(c32174EBv.A00);
                if (!A0L.isEmpty() && ((FOW) A0L.get(0)).A0D) {
                    gzz = (GZZ) this.A01;
                    fow = (FOW) A0L.get(0);
                } else {
                    gzz = (GZZ) this.A01;
                    fow = null;
                }
                gzz.DGl(fow);
                C0f9.A0A(1951820982, A0324);
                i2 = -1997820506;
                C0f9.A0A(i2, A03);
                return;
            case 33:
                A033 = C0f9.A03(698909704);
                ECM ecm = (ECM) obj;
                int A0N12 = AbstractC167017dG.A0N(ecm, -1167495006);
                ((InterfaceC37146GYh) this.A01).Dqc(ecm);
                C0f9.A0A(761709881, A0N12);
                i7 = -23864606;
                C0f9.A0A(i7, A033);
                return;
            case 34:
                A03 = C0f9.A03(154072992);
                EfR efR = (EfR) obj;
                int A0325 = C0f9.A03(1634916767);
                ChallengeActivity challengeActivity = (ChallengeActivity) this.A01;
                G06 A005 = FTX.A00(challengeActivity.A02);
                Integer num3 = efR.A00;
                if (num3 == C05F.A01) {
                    Context applicationContext = challengeActivity.getApplicationContext();
                    String str30 = efR.A07;
                    Map map2 = efR.A09;
                    if (map2 == null) {
                        map2 = Collections.emptyMap();
                    }
                    A005.A04(applicationContext, str30, null, map2);
                } else if (num3 == C05F.A0N) {
                    A005.A01();
                    A005.A03(challengeActivity.getApplicationContext(), null, efR.A03, efR.A08, efR.A06, efR.A04, efR.A05, false);
                } else {
                    challengeActivity.finish();
                }
                C0f9.A0A(1537892058, A0325);
                i2 = -216569663;
                C0f9.A0A(i2, A03);
                return;
            case 35:
                A033 = C0f9.A03(2140797339);
                int A0326 = C0f9.A03(-907617020);
                super.onSuccess(obj);
                C0f9.A0A(-971971446, A0326);
                i7 = 1837610332;
                C0f9.A0A(i7, A033);
                return;
            case 36:
                int A0327 = C0f9.A03(-2023478060);
                C32204ECz c32204ECz = (C32204ECz) obj;
                int A0328 = C0f9.A03(1994444024);
                C14360o3.A0B(c32204ECz, 0);
                List list9 = c32204ECz.A03;
                C33151Eju c33151Eju = (C33151Eju) this.A01;
                C31543DtT c31543DtT = c33151Eju.A01;
                str2 = "suggestedUsersPaginationHelper";
                if (c31543DtT != null) {
                    c31543DtT.A02 = false;
                    c31543DtT.A01 = false;
                    c31543DtT.A00 = c32204ECz.A01;
                    C33151Eju.A07(c33151Eju, list9);
                    C0f9.A0A(-801983340, A0328);
                    C0f9.A0A(-1875525185, A0327);
                    return;
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 37:
                A034 = C0f9.A03(-1335280755);
                C32204ECz c32204ECz2 = (C32204ECz) obj;
                int A0329 = C0f9.A03(-1572686335);
                C14360o3.A0B(c32204ECz2, 0);
                C16930sl c16930sl = C16930sl.A00;
                List list10 = c32204ECz2.A03;
                C33151Eju c33151Eju2 = (C33151Eju) this.A01;
                C31543DtT c31543DtT2 = c33151Eju2.A01;
                str2 = "suggestedUsersPaginationHelper";
                if (c31543DtT2 != null) {
                    c31543DtT2.A02 = false;
                    c31543DtT2.A01 = false;
                    c31543DtT2.A00 = c32204ECz2.A01;
                    C33151Eju.A08(c33151Eju2, c16930sl, list10);
                    C0f9.A0A(960562586, A0329);
                    i8 = 1886867072;
                    C0f9.A0A(i8, A034);
                    return;
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 38:
                A034 = C0f9.A03(1074964618);
                C168027ex c168027ex = (C168027ex) obj;
                int A0330 = C0f9.A03(-685876536);
                EVR evr = (EVR) this.A01;
                boolean isEmpty2 = c168027ex.getItems().isEmpty();
                evr.A05 = isEmpty2;
                ELS els = evr.A08.A00;
                els.A05 = isEmpty2;
                EVX evx = els.A02;
                if (evx == null) {
                    str2 = "searchController";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                evx.A00 = isEmpty2;
                if (isEmpty2 && (view = els.mView) != null) {
                    IgdsButton igdsButton = (IgdsButton) view.findViewById(R.id.done_button);
                    els.A03 = igdsButton;
                    if (igdsButton != null) {
                        igdsButton.setText(AbstractC166997dE.A0N(els).getString(2131956568));
                    }
                    AbstractC13880nE.A0Y(AbstractC166987dD.A0c(els.requireView(), R.id.refreshable_container), AbstractC53242c7.A0G(els.requireContext(), R.attr.actionBarHeight));
                    IgdsButton igdsButton2 = els.A03;
                    if (igdsButton2 != null) {
                        ViewOnClickListenerC35679FpE.A01(igdsButton2, 16, els);
                    }
                }
                ELS.A00(els);
                evr.A04 = false;
                Context context = (Context) evr.A0B.get();
                if (context != null) {
                    evr.A04 = true;
                    AbstractC018607g abstractC018607g = evr.A06;
                    UserSession userSession5 = evr.A0A;
                    boolean z7 = evr.A05;
                    C14360o3.A0B(userSession5, 0);
                    C25621Ms A0M = AbstractC31177DnL.A0M(userSession5);
                    A0M.A0B("friendships/feed_favorites_suggestions/");
                    A0M.A0A = "feed_favorites_suggestions";
                    A0M.A04();
                    A0M.A0I("should_pre_select", z7);
                    C1ON A0e = AbstractC25227BEk.A0e(A0M, EPL.class, FTc.class);
                    C31456Ds0.A00(A0e, evr, c168027ex, 13);
                    C1GJ.A00(context, abstractC018607g, A0e);
                }
                C0f9.A0A(1713608732, A0330);
                i8 = 1633604517;
                C0f9.A0A(i8, A034);
                return;
            case 39:
                A033 = C0f9.A03(-1725433082);
                int A0331 = C0f9.A03(-542164658);
                super.onSuccess(obj);
                C35210Fg2.A01((C35210Fg2) this.A01);
                C0f9.A0A(1198186512, A0331);
                i7 = 1704762035;
                C0f9.A0A(i7, A033);
                return;
            case 40:
                A03 = C0f9.A03(1922830347);
                C32204ECz c32204ECz3 = (C32204ECz) obj;
                int A0332 = C0f9.A03(1282573898);
                C14360o3.A0B(c32204ECz3, 0);
                C33149Ejs c33149Ejs = (C33149Ejs) this.A01;
                C31543DtT c31543DtT3 = c33149Ejs.A02;
                str2 = "suggestedUsersPaginationHelper";
                if (c31543DtT3 != null) {
                    c31543DtT3.A02 = false;
                    c31543DtT3.A01 = false;
                    c31543DtT3.A00 = c32204ECz3.A01;
                    C35167FfI c35167FfI = ((ELn) c33149Ejs).A03;
                    c35167FfI.A06(c32204ECz3.A03);
                    C35167FfI.A00(c33149Ejs, c35167FfI);
                    if (c33149Ejs.A01 != null) {
                        AbstractC31173DnH.A0L(c35167FfI.A00).size();
                        C0f9.A0A(-1771921311, A0332);
                        i2 = -1562107477;
                        C0f9.A0A(i2, A03);
                        return;
                    }
                    str2 = "waterfall";
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case Seq.NULL_REFNUM /* 41 */:
                A033 = C0f9.A03(939403563);
                C32204ECz c32204ECz4 = (C32204ECz) obj;
                int A0333 = C0f9.A03(-1705339837);
                C14360o3.A0B(c32204ECz4, 0);
                C33149Ejs c33149Ejs2 = (C33149Ejs) this.A01;
                C31543DtT c31543DtT4 = c33149Ejs2.A02;
                str2 = "suggestedUsersPaginationHelper";
                if (c31543DtT4 != null) {
                    c31543DtT4.A02 = false;
                    c31543DtT4.A01 = false;
                    c31543DtT4.A00 = c32204ECz4.A01;
                    C35167FfI c35167FfI2 = ((ELn) c33149Ejs2).A03;
                    c35167FfI2.A07(c32204ECz4.A02);
                    c33149Ejs2.A0A();
                    C14360o3.A0B(c33149Ejs2.A03, 0);
                    if (!C14360o3.A0K(c33149Ejs2.A03, "not_eligible")) {
                        OQA.A00(AbstractC166987dD.A0r(c33149Ejs2.A06), "fetch_fb_close_friend_xposting_number_success");
                        c33149Ejs2.A0A();
                    }
                    c35167FfI2.A08(c32204ECz4.A03);
                    C35167FfI.A00(c33149Ejs2, c35167FfI2);
                    java.util.Set set3 = c35167FfI2.A03;
                    c33149Ejs2.A0A().A02(set3.size());
                    if (c33149Ejs2.A01 != null) {
                        set3.size();
                        AbstractC31173DnH.A0L(c35167FfI2.A00).size();
                        C0f9.A0A(417805792, A0333);
                        i7 = -72930678;
                        C0f9.A0A(i7, A033);
                        return;
                    }
                    str2 = "waterfall";
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A03 = C0f9.A03(-1442200646);
                C32204ECz c32204ECz5 = (C32204ECz) obj;
                int A0N13 = AbstractC167017dG.A0N(c32204ECz5, -1340559608);
                ELn eLn = (ELn) this.A01;
                C35167FfI c35167FfI3 = eLn.A03;
                c35167FfI3.A07(c32204ECz5.A02);
                eLn.A0A().A04(AbstractC31173DnH.A0L(c35167FfI3.A03), C16930sl.A00);
                eLn.A0A().A01();
                C35167FfI.A01(eLn, c35167FfI3);
                C0f9.A0A(504583342, A0N13);
                i2 = -869215050;
                C0f9.A0A(i2, A03);
                return;
            case 43:
                A03 = C0f9.A03(-1260529437);
                C74293Vk c74293Vk2 = (C74293Vk) obj;
                int A0334 = C0f9.A03(1727178247);
                C14360o3.A0B(c74293Vk2, 0);
                if (!c74293Vk2.A06.isEmpty()) {
                    EMb eMb = (EMb) this.A01;
                    eMb.A00 = AbstractC25225BEi.A0x(c74293Vk2.A06, 0);
                    EMb.A00(eMb);
                }
                C0f9.A0A(1724213199, A0334);
                i2 = 368868654;
                C0f9.A0A(i2, A03);
                return;
            case 45:
                A034 = C0f9.A03(598558179);
                int A0335 = C0f9.A03(-1134169417);
                C14360o3.A0B(obj, 0);
                super.onSuccess(obj);
                EOO eoo = (EOO) this.A01;
                C31823Dyh c31823Dyh = eoo.A03;
                if (c31823Dyh == null) {
                    str2 = "suggestionsViewModel";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                InterfaceC09390do interfaceC09390do = eoo.A0E;
                c31823Dyh.A00(AbstractC166987dD.A0r(interfaceC09390do), "partial_ci");
                InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(AbstractC31175DnJ.A0K(interfaceC09390do, 0)).A01;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E77("has_partially_imported_contacts", true);
                ARD.apply();
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7G(AbstractC111324zv.A00(4814), currentTimeMillis);
                ARD2.apply();
                InterfaceC37264GbH interfaceC37264GbH = eoo.A04;
                if (interfaceC37264GbH != null) {
                    interfaceC37264GbH.CnE(1);
                }
                C0f9.A0A(-924275427, A0335);
                i8 = -589900816;
                C0f9.A0A(i8, A034);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A03 = C0f9.A03(-1807413557);
                int A0336 = C0f9.A03(-322086578);
                C14360o3.A0B(obj, 0);
                super.onSuccess(obj);
                C35233FgQ c35233FgQ = (C35233FgQ) this.A01;
                C35233FgQ.A02(c35233FgQ, false);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c35233FgQ.A03.A02, "disconnect_contacts_import");
                AbstractC31171DnF.A1G(A0f, "contacts_import_settings");
                A0f.A7v("is_user_initiated", AbstractC166997dE.A0b());
                A0f.Cht();
                C36114Fwo.A00(c35233FgQ.A02);
                C0f9.A0A(1989574086, A0336);
                i2 = -1594029616;
                C0f9.A0A(i2, A03);
                return;
            case 47:
                A034 = C0f9.A03(-1120168589);
                int A0337 = C0f9.A03(-1147279062);
                C146106i8 A0Y = AbstractC31174DnI.A0Y();
                C214749fC c214749fC = (C214749fC) this.A01;
                AbstractC31172DnG.A1H(AbstractC166997dE.A0N(c214749fC), A0Y, 2131964136);
                A0Y.A06();
                AbstractC31178DnM.A1S(A0Y);
                C99694dm c99694dm = c214749fC.A0B;
                if (c99694dm == null) {
                    str2 = "fanClubLogger";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                long A04 = AbstractC31178DnM.A04(c214749fC.A0H);
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c99694dm.A00, "ig_fan_club_live_audience_onboarding_reminder_click");
                AbstractC31178DnM.A1C(A0f2, "live_audience_selector", A04);
                A0f2.Cht();
                C0f9.A0A(-716652124, A0337);
                i8 = 1560985254;
                C0f9.A0A(i8, A034);
                return;
            case 48:
                A03 = C0f9.A03(412025656);
                int A0338 = C0f9.A03(639634750);
                C7DS c7ds = (C7DS) this.A01;
                C7DS.A03(c7ds, C05F.A00);
                AbstractC34065F1s.A00(c7ds.A01.A00, C7DS.A01(c7ds), C7DS.A02(c7ds), "join_chat_moderator_success", "view", "join_moderator", "thread_view", null, C7DS.A00(c7ds));
                UserSession userSession6 = c7ds.A00;
                String A012 = C7DS.A01(c7ds);
                if (A012 != null) {
                    AnonymousClass777 A0G = DirectThreadApi.A0G(userSession6, null, null, null, null, A012, null, null, AbstractC167017dG.A0j());
                    A0G.A00(null);
                    C1GJ.A03(A0G);
                }
                C0f9.A0A(-2090402958, A0338);
                i2 = 1615873317;
                C0f9.A0A(i2, A03);
                return;
            case 49:
                A03 = C0f9.A03(-1096049032);
                int A0339 = C0f9.A03(-1273571168);
                C7DS c7ds2 = (C7DS) this.A01;
                C7DS.A03(c7ds2, C05F.A00);
                AbstractC34065F1s.A00(c7ds2.A01.A00, C7DS.A01(c7ds2), C7DS.A02(c7ds2), "decline_chat_moderator_success", "view", "decline_moderator", "thread_view", null, C7DS.A00(c7ds2));
                C0f9.A0A(-1444634670, A0339);
                i2 = 499968703;
                C0f9.A0A(i2, A03);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A03 = C0f9.A03(-2038678154);
                int A0340 = C0f9.A03(409750150);
                ((G1U) this.A01).A03(EnumC33328EoN.A02);
                C0f9.A0A(708303029, A0340);
                i2 = 126656304;
                C0f9.A0A(i2, A03);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        String str;
        int i;
        switch (this.A00) {
            case 18:
                A03 = C0f9.A03(-268689504);
                int A032 = C0f9.A03(968621732);
                ELZ elz = (ELZ) this.A01;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = elz.A00;
                if (businessFlowAnalyticsLogger != null) {
                    String str2 = elz.A01;
                    if (elz.A03) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    businessFlowAnalyticsLogger.Clu(new Y7A("opt_in_promotional_email", str2, "opt_in_promotional_email_setting", null, null, null, AbstractC167017dG.A0r("opt_in_promotional_email_setting", str), null));
                    elz.A02 = elz.A03;
                    C0f9.A0A(319393298, A032);
                    i = 176181156;
                    C0f9.A0A(i, A03);
                    return;
                }
                AbstractC31171DnF.A0s();
                throw C00O.createAndThrow();
            case 21:
                A03 = C0f9.A03(-503397201);
                int A033 = C0f9.A03(1350307188);
                EK9 ek9 = (EK9) this.A01;
                InterfaceC09390do interfaceC09390do = ek9.A0E;
                User A0U = AbstractC31178DnM.A0U(interfaceC09390do);
                A0U.A03.EVl(Boolean.valueOf(ek9.A05));
                A0U.A0c(AbstractC166987dD.A0o(interfaceC09390do));
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = ek9.A00;
                if (businessFlowAnalyticsLogger2 != null) {
                    businessFlowAnalyticsLogger2.Clu(new Y7A("safety", ek9.A03, "hide_more_comments_setting", null, null, null, null, null));
                    C0f9.A0A(-1143746542, A033);
                    i = -968983563;
                    C0f9.A0A(i, A03);
                    return;
                }
                AbstractC31171DnF.A0s();
                throw C00O.createAndThrow();
            case 22:
                A03 = C0f9.A03(-1842130334);
                int A034 = C0f9.A03(1699675456);
                EK9 ek92 = (EK9) this.A01;
                InterfaceC09390do interfaceC09390do2 = ek92.A0E;
                User A0U2 = AbstractC31178DnM.A0U(interfaceC09390do2);
                A0U2.A03.EZS(Boolean.valueOf(ek92.A04));
                A0U2.A0c(AbstractC166987dD.A0o(interfaceC09390do2));
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger3 = ek92.A00;
                if (businessFlowAnalyticsLogger3 != null) {
                    businessFlowAnalyticsLogger3.Clu(new Y7A("safety", ek92.A03, "hide_message_requests_setting", null, null, null, null, null));
                    C0f9.A0A(-158284599, A034);
                    i = 1108714663;
                    C0f9.A0A(i, A03);
                    return;
                }
                AbstractC31171DnF.A0s();
                throw C00O.createAndThrow();
            case 44:
                A03 = C0f9.A03(-472199681);
                int A0N = AbstractC167017dG.A0N(obj, 1218456638);
                super.onSuccessInBackground(obj);
                C1346766r c1346766r = (C1346766r) this.A01;
                if (((AtomicReference) c1346766r.A00).get() != C6KP.A01) {
                    c1346766r.A02(new C4JL(obj));
                    c1346766r.A00();
                }
                C0f9.A0A(1263847456, A0N);
                i = 1215145176;
                C0f9.A0A(i, A03);
                return;
            default:
                super.onSuccessInBackground(obj);
                return;
        }
    }
}
