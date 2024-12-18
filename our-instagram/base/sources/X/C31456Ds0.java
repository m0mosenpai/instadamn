package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.CreatorSegmentation;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.AccountTypeSelectionV2Fragment;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.business.fragment.ProfileDisplayOptionsFragment;
import com.instagram.business.fragment.SupportProfileDisplayOptionsFragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.profile.edit.fragment.CompleteYourProfileFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.User;
import go.Seq;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Ds0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31456Ds0 extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C31456Ds0(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(C1ON c1on, Object obj, Object obj2, int i) {
        c1on.A00 = new C31456Ds0(i, obj, obj2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        int A032;
        int i2;
        int A033;
        int i3;
        String str;
        Object obj;
        C40781ul c40781ul;
        String errorMessage;
        String A0p;
        String str2;
        C40781ul c40781ul2;
        String errorMessage2;
        String str3;
        String str4;
        List errorStrings;
        String message;
        String string;
        switch (this.A00) {
            case 0:
                A032 = C0f9.A03(1593894211);
                C53Z c53z = (C53Z) this.A01;
                c53z.getSession();
                Long.parseLong(AbstractC31171DnF.A0g(this.A02));
                if (c53z.getContext() != null) {
                    AbstractC34728FRr.A00(c53z.getContext(), null);
                }
                i2 = -104939136;
                C0f9.A0A(i2, A032);
                return;
            case 1:
                A033 = C0f9.A03(899152166);
                ELI eli = (ELI) this.A01;
                Context requireContext = eli.requireContext();
                Object A00 = abstractC115105If.A00();
                if (A00 != null) {
                    InterfaceC40821up interfaceC40821up = (InterfaceC40821up) A00;
                    if (interfaceC40821up.getErrorMessage() != null) {
                        String errorMessage3 = interfaceC40821up.getErrorMessage();
                        String errorTitle = interfaceC40821up.getErrorTitle();
                        C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
                        if (errorTitle != null) {
                            A0I.A05 = errorTitle;
                        }
                        A0I.A0r(errorMessage3);
                        A0I.A07();
                        AbstractC31178DnM.A1R(A0I, true);
                        eli.A00.A0C(((FID) this.A02).A01.getId(), !r3.A00);
                        C19280xC A002 = C19280xC.A00(eli, "ig_manage_main_account_failure");
                        ELI.A02(eli, A002);
                        ELI.A03(eli, A002);
                        AbstractC33643Ett.A00(A002, eli.A03);
                        i3 = -1255942072;
                        C0f9.A0A(i3, A033);
                        return;
                    }
                }
                AbstractC34728FRr.A00(requireContext, null);
                eli.A00.A0C(((FID) this.A02).A01.getId(), !r3.A00);
                C19280xC A0022 = C19280xC.A00(eli, "ig_manage_main_account_failure");
                ELI.A02(eli, A0022);
                ELI.A03(eli, A0022);
                AbstractC33643Ett.A00(A0022, eli.A03);
                i3 = -1255942072;
                C0f9.A0A(i3, A033);
                return;
            case 2:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 17:
            case 20:
            case 21:
            case 24:
            case 25:
            case 34:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            case 51:
            default:
                super.onFail(abstractC115105If);
                return;
            case 3:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 215613165);
                super.onFail(abstractC115105If);
                AbstractC166987dD.A1Y(this.A01);
                i2 = -741324661;
                C0f9.A0A(i2, A032);
                return;
            case 4:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -2042666660);
                super.onFail(abstractC115105If);
                i2 = 1672949321;
                C0f9.A0A(i2, A032);
                return;
            case 5:
                A033 = C0f9.A03(-471534680);
                super.onFail(abstractC115105If);
                String A0h = AbstractC31180DnO.A0h(abstractC115105If);
                SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment = (SupportProfileDisplayOptionsFragment) this.A01;
                InterfaceC111194zh interfaceC111194zh = supportProfileDisplayOptionsFragment.A02.A00;
                C18C.A07(interfaceC111194zh, "Selected Partner should not be null if save enabled");
                C35198Ffq c35198Ffq = supportProfileDisplayOptionsFragment.A03;
                String Amd = interfaceC111194zh.Amd();
                String AcH = interfaceC111194zh.AcH();
                String Bba = interfaceC111194zh.Bba();
                String url = interfaceC111194zh.getUrl();
                String Aj3 = interfaceC111194zh.Aj3();
                AbstractC25233BEq.A0v(1, AcH, Bba, url);
                InterfaceC02590Ai A003 = C35198Ffq.A00(c35198Ffq);
                AbstractC31171DnF.A1A(A003, "update_action_button");
                AbstractC31171DnF.A1C(A003, "error");
                C35198Ffq.A01(A003, c35198Ffq, Amd, AcH, true);
                AbstractC31176DnK.A1L(A003, Bba, url);
                A003.AAP("error_message", A0h);
                A003.AAP("button_label", Aj3);
                A003.Cht();
                C9GR.A05(supportProfileDisplayOptionsFragment.requireContext());
                i3 = 2102991504;
                C0f9.A0A(i3, A033);
                return;
            case 6:
                A033 = C0f9.A03(728471744);
                super.onFail(abstractC115105If);
                String A0h2 = AbstractC31180DnO.A0h(abstractC115105If);
                SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment2 = (SupportProfileDisplayOptionsFragment) this.A01;
                InterfaceC111194zh interfaceC111194zh2 = supportProfileDisplayOptionsFragment2.A01;
                C18C.A07(interfaceC111194zh2, "Initial Partner should not be null if remove button is shown");
                C35198Ffq c35198Ffq2 = supportProfileDisplayOptionsFragment2.A03;
                String Amd2 = interfaceC111194zh2.Amd();
                String AcH2 = interfaceC111194zh2.AcH();
                String Bba2 = interfaceC111194zh2.Bba();
                String url2 = interfaceC111194zh2.getUrl();
                String Aj32 = interfaceC111194zh2.Aj3();
                AbstractC167027dH.A13(AcH2, Bba2, url2);
                InterfaceC02590Ai A004 = C35198Ffq.A00(c35198Ffq2);
                AbstractC31171DnF.A1A(A004, "remove_action_button");
                AbstractC31171DnF.A1C(A004, "error");
                C35198Ffq.A01(A004, c35198Ffq2, Amd2, AcH2, true);
                AbstractC31176DnK.A1L(A004, Bba2, url2);
                A004.AAP("error_message", A0h2);
                A004.AAP("button_label", Aj32);
                A004.Cht();
                C9GR.A05(supportProfileDisplayOptionsFragment2.requireContext());
                i3 = 667628569;
                C0f9.A0A(i3, A033);
                return;
            case 7:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -62517488);
                String A034 = AbstractC151876sX.A03(abstractC115105If, ((Context) this.A01).getString(2131972429));
                C14360o3.A07(A034);
                C34934FaK c34934FaK = (C34934FaK) this.A02;
                LruCache lruCache = C34934FaK.A01;
                CategorySearchFragment categorySearchFragment = c34934FaK.A00;
                categorySearchFragment.A0E = true;
                View view = categorySearchFragment.A01;
                C14360o3.A0A(view);
                view.setVisibility(8);
                if (categorySearchFragment.A0f()) {
                    C9GR.A09(categorySearchFragment.getContext(), A034);
                }
                CategorySearchFragment.A07(categorySearchFragment);
                CategorySearchFragment.A0A(categorySearchFragment, "suggested_category", A034, null, null);
                i2 = -61297497;
                C0f9.A0A(i2, A032);
                return;
            case 8:
                A032 = C0f9.A03(22114152);
                C14360o3.A0B(abstractC115105If, 0);
                if ((abstractC115105If instanceof C115115Ig) && (obj = ((C115115Ig) abstractC115105If).A00) != null && (c40781ul = (C40781ul) obj) != null && (errorMessage = c40781ul.getErrorMessage()) != null && errorMessage.length() != 0) {
                    c40781ul.getErrorMessage();
                }
                FKD fkd = (FKD) this.A01;
                ProfileDisplayOptionsFragment profileDisplayOptionsFragment = fkd.A00;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = profileDisplayOptionsFragment.A02;
                if (businessFlowAnalyticsLogger == null) {
                    str = "logger";
                } else {
                    String str5 = profileDisplayOptionsFragment.A07;
                    if (str5 == null) {
                        str = "entryPoint";
                    } else {
                        businessFlowAnalyticsLogger.Clv(new Y7A("profile_display_options", str5, "save_info", null, null, fkd.A01, fkd.A02, null));
                        AbstractC31177DnL.A18(profileDisplayOptionsFragment, C56352iT.A0t, false);
                        C9GR.A01(profileDisplayOptionsFragment.getContext(), null, 2131961896, 0);
                        i2 = -635829112;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 9:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 662320593);
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = (BusinessFlowAnalyticsLogger) this.A02;
                if (businessFlowAnalyticsLogger2 != null) {
                    String str6 = null;
                    String str7 = null;
                    if (abstractC115105If instanceof C115115Ig) {
                        C40781ul c40781ul3 = (C40781ul) ((C115115Ig) abstractC115105If).A00;
                        if (c40781ul3 != null) {
                            str7 = c40781ul3.getErrorMessage();
                        }
                        if (c40781ul3 != null) {
                            str6 = c40781ul3.mErrorType;
                        }
                    }
                    businessFlowAnalyticsLogger2.CjK(new Y7A("opt_in_promotional_email", null, "user_email", str7, str6, null, null, null));
                }
                FIK fik = (FIK) this.A01;
                AccountTypeSelectionV2Fragment.A00(fik.A00, fik.A01);
                i2 = -2044009265;
                C0f9.A0A(i2, A032);
                return;
            case 10:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -1763852204);
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger3 = (BusinessFlowAnalyticsLogger) this.A02;
                if (businessFlowAnalyticsLogger3 != null) {
                    String str8 = null;
                    String str9 = null;
                    if (abstractC115105If instanceof C115115Ig) {
                        InterfaceC40821up interfaceC40821up2 = (InterfaceC40821up) ((C115115Ig) abstractC115105If).A00;
                        if (interfaceC40821up2 != null) {
                            str9 = interfaceC40821up2.getErrorMessage();
                        }
                        if (interfaceC40821up2 != null) {
                            str8 = interfaceC40821up2.getErrorType();
                        }
                    }
                    businessFlowAnalyticsLogger3.CjK(new Y7A("opt_in_promotional_email", null, "promotional_email_setting", str9, str8, null, null, null));
                }
                C34577FLm c34577FLm = (C34577FLm) this.A01;
                AccountTypeSelectionV2Fragment.A00(c34577FLm.A01, c34577FLm.A03);
                i2 = -573904649;
                C0f9.A0A(i2, A032);
                return;
            case 11:
                A033 = C0f9.A03(-704499195);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                if ((abstractC115105If instanceof C115115Ig) && (c40781ul2 = (C40781ul) ((C115115Ig) abstractC115105If).A00) != null && (errorMessage2 = c40781ul2.getErrorMessage()) != null && errorMessage2.length() != 0) {
                    A0p = c40781ul2.getErrorMessage();
                    if (A0p == null) {
                        A0p = "";
                    }
                } else {
                    A0p = AbstractC166997dE.A0p((Context) this.A01, 2131961897);
                }
                ELV elv = (ELV) this.A02;
                if (!TextUtils.isEmpty(elv.A03.getNationalNumber())) {
                    EVM evm = elv.A04;
                    if (evm != null) {
                        evm.A00();
                    }
                    if (elv.A01 != null) {
                        HashMap A1G = AbstractC166987dD.A1G();
                        PublicPhoneContact submitPublicPhoneContact = elv.A03.getSubmitPublicPhoneContact();
                        if (submitPublicPhoneContact != null && (str2 = submitPublicPhoneContact.A03) != null) {
                            A1G.put(AbstractC31190DnZ.A01(9, 12, 105), str2);
                        }
                        elv.A01.CjK(new Y7A("edit_contact_info", elv.A08, "phone_validation", A0p, null, null, A1G, null));
                    }
                    TextView textView = elv.A03.A04;
                    if (textView == null) {
                        str = "phoneInlineErrorMessage";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    textView.setVisibility(0);
                } else {
                    elv.A0E.post(new RunnableC36813GKm(elv));
                }
                i3 = -1488571852;
                C0f9.A0A(i3, A033);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A032 = C0f9.A03(-1306300952);
                EVR evr = (EVR) this.A01;
                evr.A04 = false;
                C0K8.A0C("FeedFavoritesListController", "Failed to load Feed Favorites suggestions.");
                EVR.A00(evr);
                EVR.A01(evr);
                i2 = 1625124460;
                C0f9.A0A(i2, A032);
                return;
            case 14:
                A032 = C0f9.A03(-1747636121);
                super.onFail(abstractC115105If);
                C35210Fg2 c35210Fg2 = (C35210Fg2) this.A01;
                c35210Fg2.A02.A04((List) this.A02);
                C35210Fg2.A00(c35210Fg2);
                AbstractC34042F0v.A00((Context) c35210Fg2.A05.get(), abstractC115105If, "remove_all_feed_favorites_request_failure");
                i2 = -1959561712;
                C0f9.A0A(i2, A032);
                return;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-2073110069);
                i = 1094855352;
                C0f9.A0A(i, A03);
                return;
            case 16:
                A032 = C0f9.A03(1563264297);
                C31826Dyk c31826Dyk = (C31826Dyk) this.A02;
                if (!c31826Dyk.A0A) {
                    c31826Dyk.A01 = null;
                    c31826Dyk.A08.Egh(AbstractC166987dD.A16(c31826Dyk.A02));
                    c31826Dyk.A00++;
                }
                i2 = 1960185172;
                C0f9.A0A(i2, A032);
                return;
            case 18:
                A032 = C0f9.A03(301483091);
                Dialog dialog = (Dialog) ((C15370ps) this.A02).A00;
                if (dialog != null) {
                    dialog.dismiss();
                }
                i2 = 72569217;
                C0f9.A0A(i2, A032);
                return;
            case Process.SIGSTOP /* 19 */:
                A032 = C0f9.A03(-1738603982);
                C35125FeS.A00((C35125FeS) this.A02, (GroupLinkPreviewResponse$Success) this.A01);
                i2 = 592339391;
                C0f9.A0A(i2, A032);
                return;
            case 22:
                A033 = AbstractC167017dG.A0N(abstractC115105If, -818584367);
                super.onFail(abstractC115105If);
                C35005Fbc c35005Fbc = ((C34508FIu) this.A02).A01;
                DirectThreadKey directThreadKey = (DirectThreadKey) this.A01;
                String A0h3 = AbstractC31180DnO.A0h(abstractC115105If);
                C146106i8 A0K = AbstractC31171DnF.A0K();
                AbstractC25226BEj.A1N(c35005Fbc.A02, A0K, 2131959699);
                A0K.A06();
                AbstractC25233BEq.A1F(A0K);
                UserSession userSession = c35005Fbc.A04;
                InterfaceC11380iw interfaceC11380iw = c35005Fbc.A03;
                HashMap A1G2 = AbstractC166987dD.A1G();
                if (A0h3 == null) {
                    A0h3 = "null";
                }
                A1G2.put("error_message", A0h3);
                AbstractC34778FUc.A01(interfaceC11380iw, userSession, directThreadKey, "remove_reminder_error_impression", A1G2);
                i3 = 2098450872;
                C0f9.A0A(i3, A033);
                return;
            case 23:
                A033 = C0f9.A03(-1214892642);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                C35005Fbc c35005Fbc2 = ((C34508FIu) this.A02).A01;
                C31230DoD c31230DoD = (C31230DoD) this.A01;
                String A0h4 = AbstractC31180DnO.A0h(abstractC115105If);
                C14360o3.A0B(c31230DoD, 0);
                C146106i8 A0K2 = AbstractC31171DnF.A0K();
                AbstractC25226BEj.A1N(c35005Fbc2.A02, A0K2, 2131959701);
                A0K2.A06();
                AbstractC25233BEq.A1F(A0K2);
                UserSession userSession2 = c35005Fbc2.A04;
                InterfaceC11380iw interfaceC11380iw2 = c35005Fbc2.A03;
                DirectThreadKey directThreadKey2 = (DirectThreadKey) c31230DoD.A03;
                HashMap A11 = AbstractC31174DnI.A11(directThreadKey2, 2);
                if (A0h4 == null) {
                    A0h4 = "null";
                }
                A11.put("error_message", A0h4);
                AbstractC34778FUc.A01(interfaceC11380iw2, userSession2, directThreadKey2, "set_reminder_error_impression", A11);
                i3 = -1283724125;
                C0f9.A0A(i3, A033);
                return;
            case 26:
                int A035 = C0f9.A03(363045292);
                C32356ENd c32356ENd = (C32356ENd) this.A02;
                EQM eqm = c32356ENd.A03;
                str = "userListAdapter";
                if (eqm != null) {
                    eqm.A0C = false;
                    eqm.A04 = new GHR(c32356ENd, (User) this.A01, null);
                    eqm.A0A = true;
                    eqm.A03();
                    C0f9.A0A(175955244, A035);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 27:
                A03 = C0f9.A03(1717407239);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                EQM eqm2 = ((C32356ENd) this.A02).A03;
                str = "userListAdapter";
                if (eqm2 != null) {
                    eqm2.A0C = false;
                    eqm2.A04 = null;
                    eqm2.A0A = false;
                    i = 1598996000;
                    C0f9.A0A(i, A03);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 28:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -187661973);
                ((C1P1) this.A01).onFail(abstractC115105If);
                i2 = 2090252826;
                C0f9.A0A(i2, A032);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 776565619);
                GZ7 gz7 = (GZ7) this.A01;
                C40781ul c40781ul4 = (C40781ul) abstractC115105If.A00();
                if (c40781ul4 != null) {
                    str3 = c40781ul4.getErrorMessage();
                } else {
                    str3 = null;
                }
                gz7.onFail(str3);
                i2 = 60884404;
                C0f9.A0A(i2, A032);
                return;
            case 30:
                A032 = C0f9.A03(-1713073020);
                super.onFail(abstractC115105If);
                i2 = -289690595;
                C0f9.A0A(i2, A032);
                return;
            case 31:
                A032 = C0f9.A03(-1128957177);
                C9GR.A0B(AbstractC31172DnG.A07(this.A02), "follow_user_failed");
                i2 = 1019364618;
                C0f9.A0A(i2, A032);
                return;
            case 32:
                A032 = C0f9.A03(-840192071);
                super.onFail(abstractC115105If);
                C1Q9 c1q9 = C1Q9.A12;
                C32318ELi c32318ELi = (C32318ELi) this.A01;
                AbstractC31173DnH.A1S(c1q9.A02(c32318ELi.A01).A05(null, EnumC31713DwI.A16), c32318ELi.A01);
                if (abstractC115105If instanceof C115115Ig) {
                    InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
                    if (A0L != null && (errorStrings = A0L.getErrorStrings()) != null) {
                        str4 = AbstractC13670mt.A05("\n", errorStrings);
                    } else {
                        str4 = null;
                    }
                    if (TextUtils.isEmpty(str4)) {
                        str4 = AbstractC31173DnH.A0m(c32318ELi);
                    }
                    AbstractC35259Fgt.A08(c32318ELi.A02, str4);
                }
                i2 = 240132229;
                C0f9.A0A(i2, A032);
                return;
            case 33:
                A032 = C0f9.A03(-174002931);
                super.onFail(abstractC115105If);
                AbstractC55152OdF.A04((C52084N2k) abstractC115105If.A00(), ((C5HW) this.A02).A04.A0b);
                i2 = -1968511098;
                C0f9.A0A(i2, A032);
                return;
            case 35:
                A032 = C0f9.A03(1847424193);
                C35206Ffy.A01((C35206Ffy) this.A01);
                i2 = 896822708;
                C0f9.A0A(i2, A032);
                return;
            case 36:
                A032 = C0f9.A03(-129314315);
                ((C1P1) this.A01).onFail(abstractC115105If);
                i2 = -259020103;
                C0f9.A0A(i2, A032);
                return;
            case 37:
                A032 = C0f9.A03(-1299644588);
                C9GR.A04(AbstractC31172DnG.A06(this.A02));
                i2 = -980720080;
                C0f9.A0A(i2, A032);
                return;
            case 38:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -316502390);
                super.onFail(abstractC115105If);
                ((C05A) ((C15370ps) this.A01).A00).Egh(C16930sl.A00);
                i2 = -1533616021;
                C0f9.A0A(i2, A032);
                return;
            case 39:
                A033 = C0f9.A03(1572685862);
                CompleteYourProfileFragment completeYourProfileFragment = (CompleteYourProfileFragment) this.A01;
                Context context = completeYourProfileFragment.getContext();
                if (context != null) {
                    C9GR.A0B(context, AbstractC111324zv.A00(2676));
                }
                Throwable A01 = abstractC115105If.A01();
                if (A01 == null) {
                    message = null;
                } else {
                    message = A01.getMessage();
                }
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger4 = completeYourProfileFragment.A01;
                if (businessFlowAnalyticsLogger4 != null) {
                    businessFlowAnalyticsLogger4.CjK(new Y7A("profile_completion", completeYourProfileFragment.A06, null, message, null, null, null, null));
                }
                i3 = 33686361;
                C0f9.A0A(i3, A033);
                return;
            case 40:
                A032 = C0f9.A03(-1691334035);
                Object A005 = abstractC115105If.A00();
                if (A005 != null) {
                    string = ((InterfaceC40821up) A005).getErrorMessage();
                } else {
                    string = AbstractC166997dE.A0N((Fragment) this.A01).getString(2131972429);
                }
                C9GR.A03(AbstractC31172DnG.A06(this.A01), string, "save_birthday_failed", 1);
                i2 = 990735686;
                C0f9.A0A(i2, A032);
                return;
            case 43:
                A032 = C0f9.A03(491563972);
                ((InterfaceC16660sJ) this.A01).invoke(null);
                i2 = 1591113492;
                C0f9.A0A(i2, A032);
                return;
            case 44:
                A032 = C0f9.A03(-1362706396);
                ((C1P1) this.A01).onFail(abstractC115105If);
                i2 = 606553305;
                C0f9.A0A(i2, A032);
                return;
            case 45:
                A032 = C0f9.A03(-1202702690);
                EO1 eo1 = (EO1) this.A02;
                C56352iT A006 = C56342iS.A00(eo1.getActivity());
                if (A006 != null) {
                    A006.setIsLoading(false);
                }
                AbstractC31180DnO.A18(eo1.A03);
                C9GR.A0C(eo1.getContext(), "create_collection_failed");
                i2 = 1692236619;
                C0f9.A0A(i2, A032);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A032 = C0f9.A03(1874397776);
                EO2 eo2 = (EO2) this.A01;
                FragmentActivity activity = eo2.getActivity();
                if (activity != null) {
                    AbstractC31175DnJ.A0j(activity, false);
                }
                eo2.A01.setEnabled(true);
                C9GR.A0C(eo2.getContext(), "create_collection_failed");
                i2 = -639665300;
                C0f9.A0A(i2, A032);
                return;
            case 47:
                A032 = C0f9.A03(-1689675144);
                ELY.A02((ELY) this.A02);
                i2 = 893416298;
                C0f9.A0A(i2, A032);
                return;
            case 48:
                A032 = C0f9.A03(-1446794767);
                ELY.A02((ELY) this.A02);
                i2 = -1314646021;
                C0f9.A0A(i2, A032);
                return;
            case 49:
                A032 = C0f9.A03(-1266163440);
                EM6 em6 = (EM6) this.A01;
                EM6.A01(em6);
                EmptyStateView emptyStateView = em6.A0I;
                if (emptyStateView != null) {
                    emptyStateView.A0L();
                    em6.A0I.setVisibility(8);
                }
                i2 = 1535757060;
                C0f9.A0A(i2, A032);
                return;
            case 52:
                A032 = C0f9.A03(-35083089);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                C32254EIo c32254EIo = (C32254EIo) this.A02;
                AbstractC167007dF.A0x(c32254EIo.A00);
                IgdsListCell igdsListCell = c32254EIo.A02;
                if (igdsListCell != null) {
                    igdsListCell.setVisibility(0);
                }
                IgdsListCell igdsListCell2 = c32254EIo.A03;
                if (igdsListCell2 != null) {
                    igdsListCell2.setVisibility(0);
                }
                i2 = 513293896;
                C0f9.A0A(i2, A032);
                return;
        }
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(1428177023);
                W90 w90 = (W90) this.A02;
                W90 w902 = W90.A04;
                ConcurrentMap concurrentMap = w90.A03;
                C69645Vsm c69645Vsm = (C69645Vsm) this.A01;
                concurrentMap.remove(c69645Vsm.A04);
                List list = c69645Vsm.A06;
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object obj = ((Reference) it.next()).get();
                    if (obj != null) {
                        A1E.add(obj);
                    }
                }
                Iterator it2 = A1E.iterator();
                while (it2.hasNext()) {
                    RunnableC36880GNb runnableC36880GNb = new RunnableC36880GNb((C67882V0n) it2.next(), c69645Vsm);
                    if (C14360o3.A0K(Looper.getMainLooper(), Looper.myLooper())) {
                        runnableC36880GNb.run();
                    } else {
                        w90.A00.post(runnableC36880GNb);
                    }
                }
                i = -1909661688;
                break;
            case 24:
                A03 = C0f9.A03(-1215562472);
                i = 1120274710;
                break;
            case 25:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1130009612);
                C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
                if (c40781ul == null || (str = c40781ul.getErrorMessage()) == null) {
                    str = "";
                }
                C006802i c006802i = (C006802i) this.A01;
                c006802i.markerAnnotate(574170495, "error_message", str);
                c006802i.markerEnd(574170495, (short) 3);
                C0w9.A03("HiddenWordsBadgeProvider", AnonymousClass001.A0R("Could not load pending threads: ", str));
                i = 399083639;
                break;
            case 28:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1667822635);
                ((C1P1) this.A01).onFailInBackground(abstractC115105If);
                i = -201617207;
                break;
            case 44:
                A03 = C0f9.A03(100146174);
                ((C1P1) this.A01).onFailInBackground(abstractC115105If);
                i = 1005496492;
                break;
            default:
                super.onFailInBackground(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(1105283699);
                ELI.A04((ELI) this.A01, false);
                i = 1651426000;
                break;
            case 5:
                A03 = C0f9.A03(117712200);
                AbstractC31171DnF.A1N(this.A02);
                i = -919935599;
                break;
            case 6:
                A03 = C0f9.A03(1908241678);
                AbstractC31171DnF.A1N(this.A02);
                i = 501963670;
                break;
            case 8:
                A03 = C0f9.A03(164106423);
                i = -1005608004;
                break;
            case 11:
                A03 = C0f9.A03(133033684);
                super.onFinish();
                i = -183389944;
                break;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-845146393);
                i = 622523551;
                break;
            case 17:
                A03 = C0f9.A03(-1399785235);
                ((FKX) this.A02).A01 = false;
                i = -2054405531;
                break;
            case 25:
                A03 = C0f9.A03(-1132543343);
                ((C006802i) this.A01).markerEnd(574174094, (short) 2);
                i = 1080924325;
                break;
            case 28:
                A03 = C0f9.A03(480889364);
                ((C1P1) this.A01).onFinish();
                i = -275118677;
                break;
            case 32:
                A03 = C0f9.A03(-1184075735);
                super.onFinish();
                ((C32318ELi) this.A01).A03.A00();
                i = 766049046;
                break;
            case 36:
                A03 = C0f9.A03(-1383872657);
                ((C1P1) this.A01).onFinish();
                i = 278165428;
                break;
            case 39:
                A03 = C0f9.A03(-1399173952);
                AbstractC31171DnF.A1N(this.A02);
                i = -1453414987;
                break;
            case 40:
                A03 = C0f9.A03(1116759005);
                ((InterfaceC56362iU) this.A02).ETp(true);
                AbstractC31179DnN.A0u((Fragment) this.A01);
                i = 913631927;
                break;
            case 44:
                A03 = C0f9.A03(1201614992);
                ((C1P1) this.A01).onFinish();
                i = 223230518;
                break;
            case 47:
                A03 = C0f9.A03(-441053288);
                ((ELY) this.A02).A06 = false;
                i = -2063148205;
                break;
            case 48:
                A03 = C0f9.A03(-2131417662);
                ((ELY) this.A02).A06 = false;
                i = 682350265;
                break;
            case 49:
                A03 = C0f9.A03(-298089666);
                ((EM6) this.A01).A0S = false;
                i = 1123446184;
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
            case 5:
                A03 = C0f9.A03(-1233137395);
                C0fJ.A00((Dialog) this.A02);
                i = -1168860435;
                break;
            case 6:
                A03 = C0f9.A03(1324329315);
                C0fJ.A00((Dialog) this.A02);
                i = -1476344982;
                break;
            case 8:
                A03 = C0f9.A03(118895285);
                FragmentActivity activity = ((FKD) this.A01).A00.getActivity();
                if (activity != null) {
                    AbstractC31176DnK.A0z(activity, C56352iT.A0t);
                }
                i = -1947437854;
                break;
            case 11:
                A03 = C0f9.A03(-502792791);
                super.onStart();
                EVM evm = ((ELV) this.A02).A04;
                if (evm != null) {
                    evm.A01();
                }
                i = 1539232073;
                break;
            case 25:
                A03 = C0f9.A03(1466265845);
                C006802i c006802i = (C006802i) this.A01;
                c006802i.markerStart(574174094);
                c006802i.markerStart(574170495);
                C08730cb c08730cb = C17060sy.A01;
                C43777JXq c43777JXq = (C43777JXq) this.A02;
                InterfaceC224116z Asx = AbstractC31171DnF.A0T(c43777JXq.A01, c08730cb).Asx();
                if (Asx != null) {
                    Boolean CRv = Asx.CRv();
                    if (CRv != null) {
                        boolean booleanValue = CRv.booleanValue();
                        c006802i.markerAnnotate(574174094, "is_creator", booleanValue);
                        c006802i.markerAnnotate(574170495, "is_creator", booleanValue);
                    }
                    CreatorSegmentation At2 = Asx.At2();
                    if (At2 != null) {
                        String obj = At2.toString();
                        c006802i.markerAnnotate(574174094, "creator_segmentation", obj);
                        c006802i.markerAnnotate(574170495, "creator_segmentation", obj);
                    }
                }
                MutedWordsFilterManager mutedWordsFilterManager = c43777JXq.A03;
                c006802i.markerAnnotate(574170495, "is_hidden_words_available", mutedWordsFilterManager.A07());
                c006802i.markerAnnotate(574170495, "is_hidden_words_ready", mutedWordsFilterManager.A09());
                i = 1915542177;
                break;
            case 26:
                int A032 = C0f9.A03(341093668);
                EQM eqm = ((C32356ENd) this.A02).A03;
                if (eqm == null) {
                    C14360o3.A0F("userListAdapter");
                    throw C00O.createAndThrow();
                }
                eqm.A0C = true;
                eqm.A03();
                C0f9.A0A(-1392189273, A032);
                return;
            case 28:
                A03 = C0f9.A03(-208855555);
                ((C1P1) this.A01).onStart();
                i = 1367484129;
                break;
            case 32:
                A03 = C0f9.A03(-343369802);
                super.onStart();
                ((C32318ELi) this.A01).A03.A01();
                i = -1213781165;
                break;
            case 36:
                A03 = C0f9.A03(-298189317);
                ((C1P1) this.A01).onStart();
                i = -821933443;
                break;
            case 39:
                A03 = C0f9.A03(1001602252);
                C0fJ.A00((Dialog) this.A02);
                i = 764052155;
                break;
            case 40:
                A03 = C0f9.A03(-144558941);
                ((InterfaceC56362iU) this.A02).ETp(false);
                AbstractC31179DnN.A0v((Fragment) this.A01);
                i = -423586167;
                break;
            case 44:
                A03 = C0f9.A03(-595269125);
                ((C1P1) this.A01).onStart();
                i = -1316480421;
                break;
            case 47:
                A03 = C0f9.A03(2009563659);
                ELY.A01((ELY) this.A02);
                i = 1657874798;
                break;
            case 48:
                A03 = C0f9.A03(710797841);
                ELY.A01((ELY) this.A02);
                i = -2070497049;
                break;
            case 49:
                A03 = C0f9.A03(912518593);
                EM6 em6 = (EM6) this.A01;
                em6.A0S = true;
                EmptyStateView emptyStateView = em6.A0I;
                if (emptyStateView != null) {
                    emptyStateView.setVisibility(0);
                    em6.A0I.A0L();
                }
                i = -876459812;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:239:0x091a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021e  */
    /* JADX WARN: Type inference failed for: r0v321, types: [X.1vw, java.lang.Object, X.FvX] */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Object, X.6ab] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 4610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31456Ds0.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        java.util.Set set;
        java.util.Set set2;
        boolean z;
        Object obj2;
        switch (this.A00) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(820464137);
                C66084TzL c66084TzL = (C66084TzL) obj;
                int A032 = C0f9.A03(-413836200);
                C14360o3.A0B(c66084TzL, 0);
                W90 w90 = (W90) this.A02;
                W90 w902 = W90.A04;
                ConcurrentMap concurrentMap = w90.A03;
                C69645Vsm c69645Vsm = (C69645Vsm) this.A01;
                String str = c69645Vsm.A04;
                concurrentMap.remove(str);
                if (c66084TzL.A01 != null && c66084TzL.A00 != null) {
                    w90.A01.put(str, c66084TzL);
                }
                W90.A00(w90, c69645Vsm);
                C0f9.A0A(140484111, A032);
                i = -2033634081;
                break;
            case 21:
                A03 = C0f9.A03(-326815373);
                C7BA c7ba = (C7BA) obj;
                int A0N = AbstractC167017dG.A0N(c7ba, 2085033616);
                c7ba.A00.size();
                List<C83403nh> list = c7ba.A00;
                C14360o3.A07(list);
                Map map = (Map) this.A01;
                for (C83403nh c83403nh : list) {
                    map.put(c83403nh.A0i(), c83403nh);
                }
                AbstractC166987dD.A1Y(this.A02);
                C0f9.A0A(-256286728, A0N);
                i = -424225558;
                break;
            case 24:
                A03 = C0f9.A03(917922772);
                C43707JUs c43707JUs = (C43707JUs) obj;
                int A0N2 = AbstractC167017dG.A0N(c43707JUs, -347420117);
                C81663kb FBa = C2JD.A00((UserSession) this.A02).FBa(c43707JUs, c43707JUs.A0q, c43707JUs, true);
                FJ1 fj1 = (FJ1) this.A01;
                OZM.A00(fj1.A00, fj1.A01, FBa);
                C0f9.A0A(1355455480, A0N2);
                i = -1011333128;
                break;
            case 25:
                A03 = C0f9.A03(-1029592476);
                C99Z c99z = (C99Z) obj;
                int A033 = C0f9.A03(-1975754471);
                C14360o3.A0B(c99z, 0);
                C006802i c006802i = (C006802i) this.A01;
                c006802i.markerEnd(574170495, (short) 2);
                List list2 = c99z.A05.A05;
                C14360o3.A07(list2);
                C43777JXq c43777JXq = (C43777JXq) this.A02;
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj3 : list2) {
                    C43707JUs c43707JUs2 = (C43707JUs) obj3;
                    C14360o3.A0A(c43707JUs2);
                    UserSession userSession = c43777JXq.A01;
                    C81663kb A00 = AbstractC81673kc.A00(userSession, c43707JUs2);
                    List list3 = c43707JUs2.A06;
                    C14360o3.A07(list3);
                    Iterator it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (!AbstractC162597Pw.A01((C83403nh) obj2, userSession.userId)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    A00.A0C((C83403nh) obj2);
                    if (A00.Cf8(userSession)) {
                        A1E.add(obj3);
                    }
                }
                String A0p = AbstractC25231BEo.A0p();
                c006802i.markerStart(574175148);
                C08730cb c08730cb = C17060sy.A01;
                UserSession userSession2 = c43777JXq.A01;
                InterfaceC224116z Asx = AbstractC31171DnF.A0T(userSession2, c08730cb).Asx();
                if (Asx != null) {
                    Boolean CRv = Asx.CRv();
                    if (CRv != null) {
                        c006802i.markerAnnotate(574175148, "is_creator", CRv.booleanValue());
                    }
                    CreatorSegmentation At2 = Asx.At2();
                    if (At2 != null) {
                        c006802i.markerAnnotate(574175148, "creator_segmentation", At2.toString());
                    }
                }
                MutedWordsFilterManager mutedWordsFilterManager = c43777JXq.A03;
                c006802i.markerAnnotate(574175148, "is_hidden_words_available", mutedWordsFilterManager.A07());
                boolean A09 = mutedWordsFilterManager.A09();
                c006802i.markerAnnotate(574175148, "is_hidden_words_ready", A09);
                if (A09) {
                    int i2 = 0;
                    LinkedHashMap A034 = MutedWordsFilterManager.A03(mutedWordsFilterManager, A1E);
                    c006802i.markerEnd(574175148, (short) 2);
                    synchronized (c43777JXq.A04) {
                        try {
                            set = c43777JXq.A05;
                            set.clear();
                            set2 = c43777JXq.A06;
                            set2.clear();
                            Iterator A14 = AbstractC166997dE.A14(A034);
                            while (A14.hasNext()) {
                                Map.Entry entry = (Map.Entry) A14.next();
                                C43707JUs c43707JUs3 = (C43707JUs) entry.getKey();
                                C206389Bv c206389Bv = (C206389Bv) entry.getValue();
                                String str2 = c43707JUs3.A1E;
                                C14360o3.A07(str2);
                                set.add(str2);
                                boolean z2 = c206389Bv.A00;
                                if (z2) {
                                    String str3 = c43707JUs3.A1E;
                                    C14360o3.A07(str3);
                                    set2.add(str3);
                                }
                                String str4 = c43707JUs3.A1E;
                                C14360o3.A07(str4);
                                String str5 = c206389Bv.A02;
                                Boolean bool = c43707JUs3.A0z;
                                if (bool != null) {
                                    z = bool.booleanValue();
                                } else {
                                    z = false;
                                }
                                C162337Ov.A0q(userSession2, str4, A0p, str5, z2, z);
                            }
                        } catch (Throwable th) {
                            C0f9.A0A(1491802303, A033);
                            throw th;
                        }
                    }
                    AtomicInteger atomicInteger = c43777JXq.A09;
                    int size = set.size();
                    Number number = (Number) c43777JXq.A00.A0W();
                    if (number != null) {
                        i2 = number.intValue();
                    }
                    atomicInteger.set(size + i2);
                    c43777JXq.A0A.set(set2.size());
                    c43777JXq.A08.set(true);
                }
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession2, 36311912674820918L) || C18U.A06(c06090Tz, userSession2, 36317139649106749L)) {
                    ((C2DU) C2JD.A00(userSession2)).A0C.A0O(C2057498z.A00, c99z, C2EB.A04, C4I3.A03, false);
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession2);
                    long currentTimeMillis = System.currentTimeMillis();
                    InterfaceC19610xo A0w = AbstractC166987dD.A0w(A002);
                    A0w.E7G("last_message_requests_prefetch_timestamp", currentTimeMillis);
                    A0w.apply();
                }
                AbstractC25651Mw.A00(userSession2).E4s(new C48022Ip(null, false, false, false));
                C0f9.A0A(-1258460195, A033);
                i = 1747782862;
                break;
            case 28:
                A03 = C0f9.A03(619043714);
                int A0N3 = AbstractC167017dG.A0N(obj, -1750065075);
                ((C1P1) this.A01).onSuccessInBackground(obj);
                C0f9.A0A(-347088487, A0N3);
                i = 1328137821;
                break;
            case 44:
                A03 = C0f9.A03(-1901151536);
                int A035 = C0f9.A03(-954053780);
                ((C1P1) this.A01).onSuccessInBackground(obj);
                C0f9.A0A(1353967834, A035);
                i = -489612414;
                break;
            default:
                super.onSuccessInBackground(obj);
                return;
        }
        C0f9.A0A(i, A03);
    }
}
