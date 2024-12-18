package X;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.forker.Process;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.login.twofac.model.TrustedDevice;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.nux.cal.activity.CalActivity;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.FXCalAgeInfo;
import com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import go.Seq;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Fp2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35667Fp2 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC35667Fp2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC35667Fp2(obj, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v46, types: [X.FOw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [X.FOw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.0Jk, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC12990ll abstractC12990ll;
        String str;
        String str2;
        String str3;
        int parseInt;
        int A05;
        int i;
        int A052;
        int i2;
        String str4;
        int A053;
        String str5;
        int i3;
        EnumC31713DwI enumC31713DwI;
        C140966Yy A0r;
        Fragment A00;
        FXCalAgeInfo fXCalAgeInfo;
        FXCalAgeInfo fXCalAgeInfo2;
        String str6;
        String str7;
        Bundle A0b;
        Fragment ekh;
        C229419w A02;
        String str8;
        String str9;
        String str10;
        C6PG A002;
        String str11;
        String str12;
        switch (this.A00) {
            case 0:
                A052 = C0f9.A05(-1496178281);
                EL1 el1 = (EL1) this.A01;
                C32267EJc A01 = AbstractC35179FfW.A00().A01(el1.requireArguments(), C05F.A01, C05F.A0C, "", false);
                Bundle bundle = el1.A00;
                if (bundle == null) {
                    str4 = "twoFacResponseBundle";
                    C14360o3.A0F(str4);
                    throw C00O.createAndThrow();
                }
                AbstractC31179DnN.A0y(A01, AbstractC31173DnH.A0J(bundle, A01, el1), el1.A04);
                i2 = 963970461;
                C0f9.A0C(i2, A052);
                return;
            case 1:
                int A054 = C0f9.A05(-1470596844);
                EJF ejf = (EJF) this.A01;
                AbstractC35075Fcm.A00(AbstractC166987dD.A0r(ejf.A03), C05F.A01);
                Object A0X = AbstractC31171DnF.A0X(ejf.requireContext());
                if (A0X != null) {
                    ClipboardManager clipboardManager = (ClipboardManager) A0X;
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    TextView textView = ejf.A00;
                    if (textView == null) {
                        str4 = "igKeyLineOne";
                    } else {
                        A1C.append((Object) textView.getText());
                        A1C.append(' ');
                        TextView textView2 = ejf.A01;
                        if (textView2 == null) {
                            str4 = "igKeyLineTwo";
                        } else {
                            AbstractC31173DnH.A0x(clipboardManager, "backup_codes", AbstractC166997dE.A0v(textView2.getText(), A1C));
                            AbstractC31173DnH.A13(ejf.requireContext(), ejf, 2131956830);
                        }
                    }
                    C14360o3.A0F(str4);
                    throw C00O.createAndThrow();
                }
                C0f9.A0C(-1181681990, A054);
                return;
            case 2:
                A052 = C0f9.A05(-54132538);
                EJF ejf2 = (EJF) this.A01;
                InterfaceC09390do interfaceC09390do = ejf2.A03;
                AbstractC35075Fcm.A00(AbstractC166987dD.A0r(interfaceC09390do), C05F.A0u);
                FRQ A003 = AbstractC35179FfW.A00();
                Bundle requireArguments = ejf2.requireArguments();
                Integer num = C05F.A01;
                AbstractC31179DnN.A0y(A003.A01(requireArguments, num, num, "", false), ejf2.requireActivity(), interfaceC09390do);
                i2 = -2096084169;
                C0f9.A0C(i2, A052);
                return;
            case 3:
                A052 = C0f9.A05(-711002543);
                AbstractC35179FfW.A03();
                C33212El0 c33212El0 = (C33212El0) this.A01;
                Bundle requireArguments2 = c33212El0.requireArguments();
                requireArguments2.putBoolean(AbstractC31180DnO.A0Z(), true);
                requireArguments2.putBoolean("ARG_IS_ENABLING_WHATSAPP", false);
                EK3 ek3 = new EK3();
                C140966Yy A0c = AbstractC25231BEo.A0c(AbstractC31173DnH.A0J(requireArguments2, ek3, c33212El0), c33212El0.A00);
                A0c.A0A = AbstractC111324zv.A00(88);
                A0c.A0D(ek3);
                A0c.A04();
                i2 = -1183330610;
                C0f9.A0C(i2, A052);
                return;
            case 4:
                A052 = C0f9.A05(-2053019988);
                EL9.A02((EL9) this.A01);
                i2 = -1806910555;
                C0f9.A0C(i2, A052);
                return;
            case 5:
                A052 = C0f9.A05(1487014182);
                EL9.A01((EL9) this.A01);
                i2 = 1351088854;
                C0f9.A0C(i2, A052);
                return;
            case 6:
                A053 = C0f9.A05(642030961);
                C32231EHp c32231EHp = (C32231EHp) this.A01;
                C33127EjW c33127EjW = new C33127EjW(c32231EHp.getParentFragmentManager(), c32231EHp, 10);
                TrustedDevice trustedDevice = c32231EHp.A00;
                str4 = "trustedDevice";
                if (trustedDevice != null) {
                    boolean A0K = C14360o3.A0K(trustedDevice.A06, "computer");
                    TrustedDevice trustedDevice2 = c32231EHp.A00;
                    if (A0K) {
                        if (trustedDevice2 != null) {
                            str5 = trustedDevice2.A08;
                            C14360o3.A0A(str5);
                            AbstractC12990ll A0M = AbstractC31178DnM.A0M(c32231EHp.A01);
                            C14360o3.A0B(str5, 2);
                            C25621Ms A0c2 = AbstractC167017dG.A0c(A0M);
                            AbstractC31172DnG.A1Q(A0c2, 103, 31, 98);
                            AbstractC31173DnH.A1N(A0c2);
                            A0c2.A9s(AbstractC31182DnR.A05(197, 11, 33), str5);
                            A0c2.A0I(AbstractC31182DnR.A05(341, 13, 2), A0K);
                            C1ON A0P = AbstractC31176DnK.A0P(A0c2);
                            A0P.A00 = c33127EjW;
                            c32231EHp.schedule(A0P);
                            i3 = -2050631321;
                        }
                    } else if (trustedDevice2 != null) {
                        str5 = trustedDevice2.A04;
                        C14360o3.A0A(str5);
                        AbstractC12990ll A0M2 = AbstractC31178DnM.A0M(c32231EHp.A01);
                        C14360o3.A0B(str5, 2);
                        C25621Ms A0c22 = AbstractC167017dG.A0c(A0M2);
                        AbstractC31172DnG.A1Q(A0c22, 103, 31, 98);
                        AbstractC31173DnH.A1N(A0c22);
                        A0c22.A9s(AbstractC31182DnR.A05(197, 11, 33), str5);
                        A0c22.A0I(AbstractC31182DnR.A05(341, 13, 2), A0K);
                        C1ON A0P2 = AbstractC31176DnK.A0P(A0c22);
                        A0P2.A00 = c33127EjW;
                        c32231EHp.schedule(A0P2);
                        i3 = -2050631321;
                    }
                    C0f9.A0C(i3, A053);
                    return;
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 7:
                A053 = C0f9.A05(163758805);
                EIW eiw = (EIW) this.A01;
                ArrayList A0C = eiw.A02.A0C();
                Context requireContext = eiw.requireContext();
                if (eiw.A05 != null) {
                    Iterator it = A0C.iterator();
                    while (it.hasNext()) {
                        String id = AbstractC25226BEj.A15(it).getId();
                        Map map = eiw.A0A;
                        map.put(id, EnumC33354Eon.A04);
                        User user = eiw.A05;
                        C38321qM c38321qM = eiw.A01;
                        ProgressButton progressButton = eiw.A04;
                        progressButton.getClass();
                        if (!C023409i.A0A.A0A(new Object(), new GG4(requireContext, eiw, id), new FO1(requireContext, c38321qM, eiw.A03, progressButton, user, eiw.A06, eiw.A08, eiw.A07), id)) {
                            map.put(id, EnumC33354Eon.A02);
                            AbstractC31173DnH.A1Z("Failed to add follow from other account configuration operation for user id: ", id, "follow_from_other_accounts_fragment");
                        }
                    }
                }
                i3 = 1269083982;
                C0f9.A0C(i3, A053);
                return;
            case 8:
                A052 = C0f9.A05(-1536358274);
                ((C57012jc) this.A01).A02();
                i2 = 1317252062;
                C0f9.A0C(i2, A052);
                return;
            case 9:
                A05 = C0f9.A05(361870380);
                ENW enw = (ENW) this.A01;
                EQD eqd = enw.A05;
                if (eqd != null) {
                    eqd.A00.A00 = true;
                    ArrayList arrayList = enw.A08;
                    if (arrayList != null) {
                        eqd.notifyItemRangeChanged(0, arrayList.size());
                        enw.A00 = 0;
                        ArrayList arrayList2 = enw.A08;
                        if (arrayList2 != null) {
                            Iterator A13 = AbstractC166997dE.A13(arrayList2);
                            while (A13.hasNext()) {
                                AbstractC31173DnH.A1Y(AbstractC166997dE.A0l(A13), enw.A09, true);
                                enw.A00++;
                            }
                            ENW.A01(enw);
                            i = -5211323;
                            C0f9.A0C(i, A05);
                            return;
                        }
                    }
                    str4 = "users";
                } else {
                    str4 = "selectableUserListAdapter";
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 10:
                A052 = C0f9.A05(1075318938);
                ENW enw2 = (ENW) this.A01;
                C193328hC A0O = AbstractC31175DnJ.A0O(enw2);
                A0O.A05 = AbstractC167017dG.A0k(AbstractC166997dE.A0N(enw2), enw2.A00, R.plurals.unfollow_x_following_confirmation_title);
                A0O.A0M(DialogInterfaceOnClickListenerC35454FkB.A00(enw2, 4), 2131976069);
                AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC35454FkB.A00(enw2, 5), A0O);
                enw2.A05().A01("unfollow", Integer.valueOf(enw2.A00));
                i2 = 60148338;
                C0f9.A0C(i2, A052);
                return;
            case 11:
                A052 = C0f9.A05(1582809123);
                ENW enw3 = (ENW) this.A01;
                C193328hC A0O2 = AbstractC31175DnJ.A0O(enw3);
                A0O2.A05 = AbstractC167017dG.A0k(AbstractC166997dE.A0N(enw3), enw3.A00, R.plurals.confirm_x_follow_requests_confirmation);
                A0O2.A0H(DialogInterfaceOnClickListenerC35454FkB.A00(enw3, 6), 2131956564);
                AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC35454FkB.A00(enw3, 7), A0O2);
                enw3.A05().A01("confirm", Integer.valueOf(enw3.A00));
                i2 = 216692447;
                C0f9.A0C(i2, A052);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(2133642334);
                ENW enw4 = (ENW) this.A01;
                C193328hC A0O3 = AbstractC31175DnJ.A0O(enw4);
                A0O3.A05 = AbstractC167017dG.A0k(AbstractC166997dE.A0N(enw4), enw4.A00, R.plurals.delete_x_follow_requests_confirmation);
                A0O3.A0M(DialogInterfaceOnClickListenerC35454FkB.A00(enw4, 8), 2131957640);
                DialogInterfaceOnClickListenerC35454FkB.A01(A0O3, enw4, 9);
                if (enw4.A0A) {
                    A0O3.A05 = AbstractC166997dE.A0N(enw4).getQuantityString(R.plurals.delete_x_follow_requests_confirmation_v2, enw4.A00);
                    A0O3.A0r(AbstractC166997dE.A0N(enw4).getQuantityString(R.plurals.delete_x_follow_requests_confirmation_body, enw4.A00));
                }
                AbstractC166987dD.A1W(A0O3);
                enw4.A05().A01("delete", Integer.valueOf(enw4.A00));
                i = -1516640308;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A052 = C0f9.A05(730986321);
                ENW enw5 = (ENW) this.A01;
                C193328hC A0O4 = AbstractC31175DnJ.A0O(enw5);
                A0O4.A05 = AbstractC167017dG.A0k(AbstractC166997dE.A0N(enw5), enw5.A00, R.plurals.follow_back_x_non_recip_followers_confirmation);
                A0O4.A0H(DialogInterfaceOnClickListenerC35454FkB.A00(enw5, 10), 2131962759);
                AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC35454FkB.A00(enw5, 11), A0O4);
                enw5.A05().A01("follow", Integer.valueOf(enw5.A00));
                i2 = -28600924;
                C0f9.A0C(i2, A052);
                return;
            case 14:
                A052 = C0f9.A05(-1032264790);
                ENW enw6 = (ENW) this.A01;
                C193328hC A0O5 = AbstractC31175DnJ.A0O(enw6);
                A0O5.A05 = AbstractC167017dG.A0k(AbstractC166997dE.A0N(enw6), enw6.A00, R.plurals.remove_x_non_recip_followers_confirmation);
                A0O5.A0M(DialogInterfaceOnClickListenerC35454FkB.A00(enw6, 12), 2131972171);
                AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC35454FkB.A00(enw6, 13), A0O5);
                enw6.A05().A01("remove", Integer.valueOf(enw6.A00));
                i2 = -1424957654;
                C0f9.A0C(i2, A052);
                return;
            case Process.SIGTERM /* 15 */:
                A052 = C0f9.A05(-919240347);
                C36315G0k c36315G0k = (C36315G0k) this.A01;
                c36315G0k.A06.A02(c36315G0k.A05, c36315G0k.A07);
                i2 = 1229599817;
                C0f9.A0C(i2, A052);
                return;
            case 16:
                A052 = C0f9.A05(1662252837);
                String str13 = ((FR0) this.A01).A01;
                Context context = view.getContext();
                C12260kU.A0G(context, AbstractC08820cl.A03(AbstractC63260SgI.A01(context, str13)));
                i2 = 1713834731;
                C0f9.A0C(i2, A052);
                return;
            case 17:
                A052 = C0f9.A05(830349741);
                EMI emi = (EMI) this.A01;
                InterfaceC09390do interfaceC09390do2 = emi.A03;
                FDC.A00(AbstractC166987dD.A0o(interfaceC09390do2), null, "aymh");
                AymhViewModel aymhViewModel = emi.A01;
                if (aymhViewModel != null) {
                    Bundle requireArguments3 = emi.requireArguments();
                    Object value = interfaceC09390do2.getValue();
                    C14360o3.A0B(value, 1);
                    AbstractC166987dD.A1Z(new C57165PZj(requireArguments3, aymhViewModel, value, null, 0), AbstractC141776au.A00(aymhViewModel));
                    i2 = -661825892;
                    C0f9.A0C(i2, A052);
                    return;
                }
                str4 = "aymhViewModel";
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 18:
                A052 = C0f9.A05(1603004090);
                EMI emi2 = (EMI) this.A01;
                InterfaceC09390do interfaceC09390do3 = emi2.A03;
                FDD.A00(AbstractC166987dD.A0o(interfaceC09390do3), "aymh");
                AymhViewModel aymhViewModel2 = emi2.A01;
                if (aymhViewModel2 != null) {
                    Bundle requireArguments4 = emi2.requireArguments();
                    Object value2 = interfaceC09390do3.getValue();
                    C14360o3.A0B(value2, 1);
                    AbstractC166987dD.A1Z(new C57165PZj(requireArguments4, aymhViewModel2, value2, null, 1), AbstractC141776au.A00(aymhViewModel2));
                    i2 = 781795031;
                    C0f9.A0C(i2, A052);
                    return;
                }
                str4 = "aymhViewModel";
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case Process.SIGSTOP /* 19 */:
                A053 = C0f9.A05(-1253857499);
                EL3 el3 = (EL3) this.A01;
                C34669FPe c34669FPe = el3.A04;
                if (c34669FPe == null) {
                    str4 = "forgotPasswordHelper";
                } else {
                    String str14 = el3.A07;
                    if (str14 == null) {
                        str4 = AbstractC31189DnY.A01();
                    } else {
                        c34669FPe.A00(null, str14);
                        i3 = 1247274239;
                        C0f9.A0C(i3, A053);
                        return;
                    }
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 20:
                A053 = C0f9.A05(-804688906);
                C35031Fc4 c35031Fc4 = C35031Fc4.A00;
                EI3 ei3 = (EI3) this.A01;
                AbstractC18680vv abstractC18680vv = ei3.A00;
                int ordinal = ei3.A01.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        enumC31713DwI = EnumC31713DwI.A0z;
                    } else {
                        enumC31713DwI = EnumC31713DwI.A0M;
                    }
                } else {
                    enumC31713DwI = EnumC31713DwI.A0P;
                }
                c35031Fc4.A02(abstractC18680vv, enumC31713DwI.A01);
                C140966Yy A0r2 = AbstractC25225BEi.A0r(ei3.requireActivity(), ei3.A00);
                A0r2.A0E(new Object().A00(ei3.A02.A00(), ei3.A00, ei3.A01, ei3.A06, ei3.A07, ei3.A08));
                A0r2.A04();
                i3 = -1582048141;
                C0f9.A0C(i3, A053);
                return;
            case 21:
                A053 = C0f9.A05(-32937400);
                EKV ekv = (EKV) this.A01;
                if (ekv.A04) {
                    AbstractC18680vv abstractC18680vv2 = ekv.A00;
                    String obj = EnumC33360Eot.A05.toString();
                    AbstractC167017dG.A1N(abstractC18680vv2, obj);
                    C35191Ffj.A00(abstractC18680vv2, "link_accounts_button_pressed", obj);
                }
                C35031Fc4.A00.A02(ekv.getSession(), ekv.A02().A01);
                FXCalAgeRestrictionScreenContent fXCalAgeRestrictionScreenContent = ekv.A02.A01;
                if (fXCalAgeRestrictionScreenContent != null && (fXCalAgeInfo = fXCalAgeRestrictionScreenContent.A01) != null && fXCalAgeRestrictionScreenContent.A04 != null && fXCalAgeRestrictionScreenContent.A02 != null && fXCalAgeRestrictionScreenContent.A03 != null && (fXCalAgeInfo2 = fXCalAgeRestrictionScreenContent.A00) != null && fXCalAgeInfo.A01 != null && fXCalAgeInfo.A02 != null && fXCalAgeInfo.A03 != null && fXCalAgeInfo.A04 != null && fXCalAgeInfo.A06 != null && fXCalAgeInfo.A05 != null && fXCalAgeInfo2.A01 != null && fXCalAgeInfo2.A02 != null && fXCalAgeInfo2.A03 != null && fXCalAgeInfo2.A04 != null && fXCalAgeInfo2.A06 != null && fXCalAgeInfo2.A05 != null) {
                    A0r = AbstractC25225BEi.A0r(ekv.requireActivity(), ekv.A00);
                    ConnectContent connectContent = ekv.A02;
                    AbstractC18680vv abstractC18680vv3 = ekv.A00;
                    Integer num2 = ekv.A03;
                    EnumC33360Eot enumC33360Eot = ekv.A01;
                    Bundle A0b2 = AbstractC166987dD.A0b();
                    AbstractC31175DnJ.A0r(A0b2, abstractC18680vv3);
                    A0b2.putParcelable("argument_content", connectContent);
                    A0b2.putString("argument_flow", FWK.A00(num2));
                    A0b2.putSerializable("argument_entry_point", enumC33360Eot);
                    A00 = new AbstractC59962oe();
                    A00.setArguments(A0b2);
                } else {
                    A0r = AbstractC25225BEi.A0r(ekv.requireActivity(), ekv.A00);
                    A00 = new Object().A00(ekv.A02.A00(), ekv.A00, ekv.A01, ekv.A03, null, null);
                }
                A0r.A0E(A00);
                A0r.A04();
                i3 = 94982598;
                C0f9.A0C(i3, A053);
                return;
            case 22:
                A053 = C0f9.A05(-234290430);
                EKV ekv2 = (EKV) this.A01;
                if (ekv2.A04) {
                    AbstractC18680vv abstractC18680vv4 = ekv2.A00;
                    String obj2 = EnumC33360Eot.A05.toString();
                    AbstractC167017dG.A1N(abstractC18680vv4, obj2);
                    C35191Ffj.A00(abstractC18680vv4, "link_accounts_screen_closed", obj2);
                }
                AbstractC18680vv session = ekv2.getSession();
                String str15 = ekv2.A02().A01;
                AbstractC167017dG.A1N(session, str15);
                C35111FeD.A00(session, null, str15);
                ((GY2) ekv2.requireActivity()).DVB();
                i3 = 1284595520;
                C0f9.A0C(i3, A053);
                return;
            case 23:
                A052 = C0f9.A05(783792164);
                EKV ekv3 = (EKV) this.A01;
                ConnectContent connectContent2 = ekv3.A02;
                AbstractC18680vv abstractC18680vv5 = ekv3.A00;
                Bundle A0b3 = AbstractC166987dD.A0b();
                AbstractC31175DnJ.A0r(A0b3, abstractC18680vv5);
                A0b3.putParcelable("argument_content", connectContent2);
                C38K c38k = new C38K();
                AbstractC31173DnH.A0w(AbstractC31173DnH.A0J(A0b3, c38k, ekv3), c38k, AbstractC25225BEi.A0y(ekv3.A00));
                i2 = -1677042998;
                C0f9.A0C(i2, A052);
                return;
            case 24:
                A052 = C0f9.A05(187353059);
                C32257EIr.A00((C32257EIr) this.A01);
                i2 = -1038316196;
                C0f9.A0C(i2, A052);
                return;
            case 25:
                A052 = C0f9.A05(-954972895);
                C32257EIr c32257EIr = (C32257EIr) this.A01;
                UserSession userSession = (UserSession) c32257EIr.A01;
                String str16 = c32257EIr.A03;
                AbstractC167017dG.A1N(userSession, str16);
                C35241Fga.A03(userSession, "cp_upsell_screen_cancel", str16, null);
                C32257EIr.A01(c32257EIr, 0);
                i2 = -1953703317;
                C0f9.A0C(i2, A052);
                return;
            case 26:
                EL2 el2 = (EL2) this.A01;
                AbstractC34680FPp abstractC34680FPp = el2.A03;
                boolean z = el2.A0C;
                if (abstractC34680FPp instanceof Egd) {
                    FH2 fh2 = abstractC34680FPp.A01;
                    abstractC12990ll = abstractC34680FPp.A00;
                    str = abstractC34680FPp.A02;
                    boolean A1a = AbstractC167017dG.A1a(abstractC12990ll, str);
                    C35191Ffj.A00(abstractC12990ll, "disclosures_v2_screen_pt1_closed", str);
                    if (0 == AbstractC31172DnG.A03(fh2.A00, A1a ? 1 : 0)) {
                        C14360o3.A0B(abstractC12990ll, 0);
                        C14360o3.A0B(str, A1a ? 1 : 0);
                        str2 = "disclosures_v2_screen_pt2_closed";
                    }
                    AbstractC18680vv session2 = el2.getSession();
                    String str17 = el2.A01().A01;
                    AbstractC167017dG.A1N(session2, str17);
                    C35111FeD.A00(session2, null, str17);
                    ((GY2) el2.requireActivity()).DVB();
                    return;
                }
                boolean z2 = abstractC34680FPp instanceof Egb;
                abstractC12990ll = abstractC34680FPp.A00;
                if (z2) {
                    str = abstractC34680FPp.A02;
                    AbstractC167017dG.A1N(abstractC12990ll, str);
                    str2 = "disclosures_v2_screen_closed";
                } else if (z) {
                    str = EnumC33360Eot.A05.toString();
                    AbstractC167017dG.A1N(abstractC12990ll, str);
                    str2 = "disclosures_screen_closed";
                } else {
                    str = abstractC34680FPp.A02;
                    AbstractC167017dG.A1N(abstractC12990ll, str);
                    str2 = "disclosures_v2_screen_closed";
                }
                C35191Ffj.A00(abstractC12990ll, str2, str);
                AbstractC18680vv session22 = el2.getSession();
                String str172 = el2.A01().A01;
                AbstractC167017dG.A1N(session22, str172);
                C35111FeD.A00(session22, null, str172);
                ((GY2) el2.requireActivity()).DVB();
                return;
            case 27:
                EL2 el22 = (EL2) this.A01;
                AbstractC34680FPp abstractC34680FPp2 = el22.A03;
                boolean z3 = el22.A0C;
                if (!(abstractC34680FPp2 instanceof Egd)) {
                    boolean z4 = abstractC34680FPp2 instanceof Egb;
                    AbstractC12990ll abstractC12990ll2 = abstractC34680FPp2.A00;
                    if (z4) {
                        str6 = abstractC34680FPp2.A02;
                        AbstractC167017dG.A1N(abstractC12990ll2, str6);
                        str7 = "disclosures_v2_screen_agreed";
                    } else {
                        if (z3) {
                            str6 = EnumC33360Eot.A05.toString();
                        } else {
                            str6 = abstractC34680FPp2.A02;
                        }
                        AbstractC167017dG.A1N(abstractC12990ll2, str6);
                        str7 = "disclosures_agreed_button_pressed";
                    }
                    C35191Ffj.A00(abstractC12990ll2, str7, str6);
                }
                C35031Fc4.A00.A02(el22.getSession(), el22.A01().A01);
                GY2 gy2 = (GY2) el22.requireActivity();
                String str18 = el22.A09;
                String str19 = el22.A0A;
                CalActivity calActivity = (CalActivity) gy2;
                calActivity.A04 = str18;
                calActivity.A05 = str19;
                CalActivity calActivity2 = (CalActivity) ((GY2) el22.requireActivity());
                AbstractC18680vv abstractC18680vv6 = calActivity2.A02;
                if (abstractC18680vv6 == null) {
                    str4 = "_session";
                } else {
                    Bundle bundle2 = calActivity2.A01;
                    str4 = "clientBundle";
                    if (bundle2 != null) {
                        String string = bundle2.getString("extra_cal_registration_source");
                        Bundle bundle3 = calActivity2.A01;
                        if (bundle3 != null) {
                            AbstractC35174FfR.A03(abstractC18680vv6, AbstractC31174DnI.A0n(bundle3, "extra_cal_force_signup_with_fb_after_cp_claiming"), "upsell_primary_click", string);
                            Intent A04 = AbstractC31171DnF.A04();
                            A04.putExtra("result_action_positive", true);
                            A04.putExtra("argument_requested_code", calActivity2.A00);
                            String str20 = calActivity2.A03;
                            if (str20 == null) {
                                str4 = "accessToken";
                            } else {
                                A04.putExtra("argument_access_token", str20);
                                Bundle bundle4 = calActivity2.A01;
                                if (bundle4 != null) {
                                    A04.putExtra("argument_client_extras_bundle", bundle4);
                                    A04.putExtra("argument_selected_age_account_id", calActivity2.A04);
                                    A04.putExtra("argument_selected_age_account_type", calActivity2.A05);
                                    AbstractC31180DnO.A0y(calActivity2, A04);
                                    calActivity2.overridePendingTransition(R.anim.signup_content_fade_in, R.anim.signup_content_slide_out);
                                    return;
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 28:
                A052 = C0f9.A05(604596425);
                ((C31780Dxq) this.A01).toggle();
                i2 = -828392645;
                C0f9.A0C(i2, A052);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A052 = C0f9.A05(368722991);
                C33001Ego.A00((C33001Ego) this.A01);
                i2 = -1042373882;
                C0f9.A0C(i2, A052);
                return;
            case 30:
                A053 = C0f9.A05(1901083840);
                C33001Ego c33001Ego = (C33001Ego) this.A01;
                if (AbstractC35175FfS.A00(c33001Ego.A02, c33001Ego.A01, c33001Ego.A00) > 4) {
                    c33001Ego.A02(c33001Ego.A0B, c33001Ego.A02, c33001Ego.A01 + 1, c33001Ego.A00);
                } else {
                    C19280xC A004 = C19280xC.A00(c33001Ego, "dob_invalid_age_submitted");
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(c33001Ego.A02, c33001Ego.A01, c33001Ego.A00);
                    A004.A0C(DatePickerDialogModule.ARG_DATE, new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(calendar.getTime()));
                    AbstractC31173DnH.A1S(A004, ((EHT) c33001Ego).A00);
                    C193328hC A0b4 = AbstractC31176DnK.A0b(c33001Ego);
                    A0b4.A0A(2131952280);
                    A0b4.A09(2131952281);
                    A0b4.A0s(false);
                    AbstractC31176DnK.A15(DialogInterfaceOnClickListenerC35454FkB.A00(c33001Ego, 24), A0b4);
                }
                i3 = 1876740380;
                C0f9.A0C(i3, A053);
                return;
            case 31:
                A052 = C0f9.A05(-481358823);
                C1Q9 c1q9 = C1Q9.A08;
                EHT eht = (EHT) this.A01;
                C35230FgN.A02(c1q9.A02(eht.A00), eht.A02, EnumC31713DwI.A0e);
                C140966Yy A0N = AbstractC31177DnL.A0N(eht.requireActivity(), eht.A00);
                EnumC33445EqI enumC33445EqI = eht.A02;
                Bundle A0b5 = AbstractC166987dD.A0b();
                A0b5.putString("RegistrationFlowExtra", enumC33445EqI.name());
                AbstractC31171DnF.A12(A0b5, "IgSessionManager.LOGGED_OUT_TOKEN");
                AbstractC31176DnK.A1A(A0b5, new AbstractC59962oe(), A0N);
                i2 = -332947528;
                C0f9.A0C(i2, A052);
                return;
            case 32:
                A052 = C0f9.A05(-626560635);
                ELT elt = ((C36572GAw) this.A01).A0I.A00;
                elt.A01.A02();
                elt.A04 = elt.A0D;
                i2 = 1176696083;
                C0f9.A0C(i2, A052);
                return;
            case 33:
                A052 = C0f9.A05(457817212);
                ((C36572GAw) this.A01).A0I.A00();
                i2 = -1760123898;
                C0f9.A0C(i2, A052);
                return;
            case 34:
                A052 = C0f9.A05(1317959651);
                ELT elt2 = ((C36572GAw) this.A01).A0I.A00;
                elt2.A02();
                elt2.A04 = elt2.A0C;
                i2 = 1813634279;
                C0f9.A0C(i2, A052);
                return;
            case 35:
                A052 = C0f9.A05(651343119);
                C36572GAw c36572GAw = (C36572GAw) this.A01;
                FRR frr = c36572GAw.A0I;
                IgdsSwitch igdsSwitch = c36572GAw.A0D;
                if (igdsSwitch == null) {
                    str4 = "shareSwitch";
                    C14360o3.A0F(str4);
                    throw C00O.createAndThrow();
                }
                frr.A02(igdsSwitch.isChecked());
                i2 = 1639360993;
                C0f9.A0C(i2, A052);
                return;
            case 36:
                A052 = C0f9.A05(-297756687);
                ((C36572GAw) this.A01).A0I.A01();
                i2 = 661257328;
                C0f9.A0C(i2, A052);
                return;
            case 37:
                A052 = C0f9.A05(49817760);
                ((C36572GAw) this.A01).A0I.A01();
                i2 = -2095094542;
                C0f9.A0C(i2, A052);
                return;
            case 38:
                A052 = C0f9.A05(-663570958);
                ((C36571GAv) this.A01).A0D.A00();
                i2 = -1334225471;
                C0f9.A0C(i2, A052);
                return;
            case 39:
                A052 = C0f9.A05(720429239);
                C36571GAv c36571GAv = (C36571GAv) this.A01;
                FRR frr2 = c36571GAv.A0D;
                IgdsSwitch igdsSwitch2 = c36571GAv.A0A;
                if (igdsSwitch2 == null) {
                    str4 = "sharePhotoToFeedSwitch";
                    C14360o3.A0F(str4);
                    throw C00O.createAndThrow();
                }
                frr2.A02(igdsSwitch2.isChecked());
                i2 = -2073880288;
                C0f9.A0C(i2, A052);
                return;
            case 40:
                A052 = C0f9.A05(1165595940);
                ((C36571GAv) this.A01).A0D.A01();
                i2 = 412139465;
                C0f9.A0C(i2, A052);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A052 = C0f9.A05(1153854794);
                ((C36571GAv) this.A01).A0D.A01();
                i2 = 507270559;
                C0f9.A0C(i2, A052);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                ENv eNv = (ENv) this.A01;
                UserSession session3 = eNv.getSession();
                AbstractC167017dG.A1N(session3, "additional_contact");
                C35111FeD.A00(session3, null, "additional_contact");
                ENv.A00(eNv, false);
                return;
            case 43:
                A053 = C0f9.A05(2085917459);
                EKJ ekj = (EKJ) this.A01;
                List list = ekj.A02.A0e;
                if ((list == null || list.isEmpty()) && AbstractC31180DnO.A0s(ekj.A02).isEmpty()) {
                    AbstractC31172DnG.A1A();
                    RegFlowExtras regFlowExtras = ekj.A02;
                    A0b = AbstractC166987dD.A0b();
                    A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                    AbstractC31173DnH.A1B(A0b);
                    ekh = new EKH();
                } else {
                    AbstractC31172DnG.A1A();
                    RegFlowExtras regFlowExtras2 = ekj.A02;
                    A0b = AbstractC166987dD.A0b();
                    A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
                    AbstractC31173DnH.A1B(A0b);
                    ekh = new EKD();
                }
                C140966Yy A0r3 = AbstractC25225BEi.A0r(AbstractC31173DnH.A0J(A0b, ekh, ekj), ekj.A00);
                A0r3.A0B(null, ekh);
                A0r3.A04();
                i3 = 239840269;
                C0f9.A0C(i3, A053);
                return;
            case 44:
                A052 = C0f9.A05(524908064);
                EJ8 ej8 = (EJ8) this.A01;
                AbstractC31525Dt9.A06(ej8.getActivity(), null, ej8, AbstractC166987dD.A0r(ej8.A02));
                i2 = -825150047;
                C0f9.A0C(i2, A052);
                return;
            case 45:
                A052 = C0f9.A05(187947202);
                AbstractC31172DnG.A1A();
                Bundle A0b6 = AbstractC166987dD.A0b();
                A0b6.putString("AUTO_CONF_SCREEN_TYPE", "CONFIRMATION");
                C32236EHu c32236EHu = new C32236EHu();
                c32236EHu.setArguments(A0b6);
                EJ8 ej82 = (EJ8) this.A01;
                C189448aO A0g = AbstractC25231BEo.A0g(ej82.A02);
                AbstractC31172DnG.A1L(ej82, A0g, 2131953345);
                A0g.A00().A02(AbstractC31172DnG.A04(ej82), c32236EHu);
                i2 = -1710943260;
                C0f9.A0C(i2, A052);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                int A055 = C0f9.A05(1473104343);
                EJC ejc = (EJC) this.A01;
                InterfaceC09390do interfaceC09390do4 = ejc.A08;
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do4);
                EnumC31713DwI enumC31713DwI2 = EnumC31713DwI.A0D;
                C47989LJs.A01(A0o, "auto_conf_consent", "client_reg_user_allow_consent", "registration_flow", "ar_code_sms");
                SPT spt = LIA.A07;
                LIA lia = new LIA(ejc.requireContext());
                Activity A042 = AbstractC31172DnG.A04(ejc);
                UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do4);
                ProgressButton progressButton2 = ejc.A02;
                if (progressButton2 == null) {
                    str4 = "saveButton";
                } else {
                    C32522ETy c32522ETy = new C32522ETy(A042, ejc, A0r4, progressButton2, enumC31713DwI2);
                    UserSession A0r5 = AbstractC166987dD.A0r(interfaceC09390do4);
                    Activity A043 = AbstractC31172DnG.A04(ejc);
                    String str21 = ejc.A04;
                    if (str21 == null) {
                        str4 = "registerStartMessage";
                    } else {
                        String str22 = ejc.A03;
                        if (str22 != null) {
                            String str23 = ejc.A05;
                            if (str23 == null) {
                                str4 = "smsFlowType";
                            } else {
                                C34385FEb c34385FEb = new C34385FEb();
                                c34385FEb.A00.putByteArray("requestMessage", LIA.A07.A03(str21));
                                c34385FEb.A00.putBoolean("useDebugKey", false);
                                C1GJ.A03(new KK7(A043, c34385FEb, ejc, A0r5, c32522ETy, lia, "auto_conf_consent", str23, str22));
                                C0f9.A0C(-1084618515, A055);
                                return;
                            }
                        }
                        str4 = "nonce";
                    }
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 47:
                A052 = C0f9.A05(-2111415474);
                EJC ejc2 = (EJC) this.A01;
                InterfaceC09390do interfaceC09390do5 = ejc2.A08;
                AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do5);
                String str24 = ejc2.A05;
                str4 = "smsFlowType";
                if (str24 != null) {
                    C47989LJs.A01(A0o2, "auto_conf_consent", "client_reg_user_deny_consent", "registration_flow", str24);
                    Context requireContext2 = ejc2.requireContext();
                    UserSession A0r6 = AbstractC166987dD.A0r(interfaceC09390do5);
                    String str25 = ejc2.A03;
                    if (str25 != null) {
                        String str26 = ejc2.A05;
                        if (str26 != null) {
                            C1GJ.A03(AbstractC35276FhB.A0A(requireContext2, A0r6, null, str25, str26, false));
                            AbstractC31525Dt9.A06(ejc2.getActivity(), null, ejc2, AbstractC166987dD.A0r(interfaceC09390do5));
                            i2 = -1491315101;
                            C0f9.A0C(i2, A052);
                            return;
                        }
                    }
                    str4 = "nonce";
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 48:
                A052 = C0f9.A05(1473484911);
                AbstractC31172DnG.A1A();
                Bundle A0b7 = AbstractC166987dD.A0b();
                A0b7.putString("AUTO_CONF_SCREEN_TYPE", "CONSENT");
                C32236EHu c32236EHu2 = new C32236EHu();
                c32236EHu2.setArguments(A0b7);
                EJC ejc3 = (EJC) this.A01;
                C189448aO A0g2 = AbstractC25231BEo.A0g(ejc3.A08);
                AbstractC31172DnG.A1L(ejc3, A0g2, 2131953345);
                A0g2.A00().A02(AbstractC31172DnG.A04(ejc3), c32236EHu2);
                i2 = -603601929;
                C0f9.A0C(i2, A052);
                return;
            case 49:
                A052 = C0f9.A05(-56486879);
                C1Q9 c1q92 = C1Q9.A0I;
                EJ5 ej5 = (EJ5) this.A01;
                C35230FgN.A02(c1q92.A02(ej5.A00), ej5.A01, EnumC31713DwI.A0I);
                Context requireContext3 = ej5.requireContext();
                AbstractC31176DnK.A11(requireContext3, ej5.A00, AbstractC31171DnF.A0R(MSV.A00(31)), requireContext3.getString(2131965052));
                i2 = 343204474;
                C0f9.A0C(i2, A052);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A052 = C0f9.A05(-321535286);
                EJ5 ej52 = (EJ5) this.A01;
                if (ej52.getActivity() != null) {
                    C35159Ff1.A00.A01(ej52.A00, ej52.A01, "birthday_additional_info");
                    ej52.getActivity().onBackPressed();
                }
                i2 = -110848432;
                C0f9.A0C(i2, A052);
                return;
            case 51:
                A053 = C0f9.A05(71012924);
                C32362ENj c32362ENj = (C32362ENj) this.A01;
                UserSession session4 = c32362ENj.getSession();
                C14360o3.A0B(session4, 0);
                double A012 = AbstractC31171DnF.A01();
                double A005 = AbstractC31171DnF.A00();
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(session4), "private_account_tapped");
                AbstractC31179DnN.A15(A0f);
                AbstractC31179DnN.A18(A0f, A012, A005);
                AbstractC31171DnF.A1A(A0f, "nux_account_privacy");
                AbstractC35274Fh9.A08(A0f, session4);
                UserSession session5 = c32362ENj.getSession();
                String str27 = c32362ENj.getSession().userId;
                C14360o3.A0B(session5, 0);
                C14360o3.A0B(str27, 1);
                AbstractC34357FCz.A00(session5, true, null, str27, "android_pbd_nux_select_option");
                RadioButton radioButton = c32362ENj.A00;
                if (radioButton != null) {
                    radioButton.setChecked(true);
                }
                RadioButton radioButton2 = c32362ENj.A01;
                if (radioButton2 != null) {
                    radioButton2.setChecked(false);
                }
                ProgressButton progressButton3 = c32362ENj.A02;
                if (progressButton3 != null) {
                    progressButton3.setEnabled(true);
                }
                i3 = -1171620536;
                C0f9.A0C(i3, A053);
                return;
            case 52:
                A053 = C0f9.A05(1990890210);
                C32362ENj c32362ENj2 = (C32362ENj) this.A01;
                UserSession session6 = c32362ENj2.getSession();
                C14360o3.A0B(session6, 0);
                double A013 = AbstractC31171DnF.A01();
                double A006 = AbstractC31171DnF.A00();
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(session6), "public_account_tapped");
                AbstractC31179DnN.A15(A0f2);
                AbstractC31179DnN.A18(A0f2, A013, A006);
                AbstractC31171DnF.A1A(A0f2, "nux_account_privacy");
                AbstractC35274Fh9.A08(A0f2, session6);
                UserSession session7 = c32362ENj2.getSession();
                String str28 = c32362ENj2.getSession().userId;
                C14360o3.A0B(session7, 0);
                C14360o3.A0B(str28, 1);
                AbstractC34357FCz.A00(session7, false, null, str28, "android_pbd_nux_select_option");
                RadioButton radioButton3 = c32362ENj2.A01;
                if (radioButton3 != null) {
                    radioButton3.setChecked(true);
                }
                RadioButton radioButton4 = c32362ENj2.A00;
                if (radioButton4 != null) {
                    radioButton4.setChecked(false);
                }
                ProgressButton progressButton4 = c32362ENj2.A02;
                if (progressButton4 != null) {
                    progressButton4.setEnabled(true);
                }
                i3 = -1935961187;
                C0f9.A0C(i3, A053);
                return;
            case 53:
                A052 = C0f9.A05(-126695187);
                C32275EJk.A01((C32275EJk) this.A01);
                i2 = -1789692460;
                C0f9.A0C(i2, A052);
                return;
            case 54:
                A053 = C0f9.A05(386945117);
                C32275EJk c32275EJk = (C32275EJk) this.A01;
                AbstractC12990ll A0o3 = AbstractC166987dD.A0o(c32275EJk.A0B);
                double A007 = AbstractC31177DnL.A00(A0o3);
                double A008 = AbstractC31171DnF.A00();
                InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0o3), "close_button_tapped");
                if (A0f3.isSampled()) {
                    AbstractC31177DnL.A1B(A0f3, A007, A008);
                    C14360o3.A0B(A0o3, 0);
                    String A0c3 = AbstractC31179DnN.A0c(A0o3);
                    if (A0c3 == null) {
                        A0c3 = "";
                    }
                    A0f3.AAP(CacheBehaviorLogger.SOURCE, A0c3);
                    AbstractC31178DnM.A19(A0f3, "find_friends_addressbook");
                    AbstractC31176DnK.A1K(A0f3, A007);
                    AbstractC31177DnL.A1G(A0f3, "module", "waterfall_log_in", A008);
                    AbstractC35274Fh9.A05(A0f3);
                    A0f3.Cht();
                }
                InterfaceC37264GbH interfaceC37264GbH = c32275EJk.A03;
                if (interfaceC37264GbH != null) {
                    interfaceC37264GbH.ATj();
                }
                i3 = -543279126;
                C0f9.A0C(i3, A053);
                return;
            case 55:
                A052 = C0f9.A05(-1409245100);
                C32275EJk.A01((C32275EJk) this.A01);
                i2 = 2135156657;
                C0f9.A0C(i2, A052);
                return;
            case 56:
                A053 = C0f9.A05(-1318024262);
                C32275EJk c32275EJk2 = (C32275EJk) this.A01;
                C31823Dyh c31823Dyh = c32275EJk2.A02;
                str4 = "suggestionsViewModel";
                ET2 et2 = null;
                if (c31823Dyh != null) {
                    boolean z5 = true;
                    if (!AbstractC31176DnK.A1b(c31823Dyh.A01) || (A02 = C18U.A02(AbstractC166987dD.A0o(c32275EJk2.A0B), 36323032343718771L)) == null || !A02.AhE(C06090Tz.A04, 36323032343718771L)) {
                        z5 = false;
                    }
                    FJT fjt = c32275EJk2.A04;
                    if (fjt != null) {
                        InterfaceC09390do interfaceC09390do6 = c32275EJk2.A0B;
                        UserSession A0r7 = AbstractC166987dD.A0r(interfaceC09390do6);
                        if (z5) {
                            C31823Dyh c31823Dyh2 = c32275EJk2.A02;
                            if (c31823Dyh2 != null) {
                                et2 = new ET2(AbstractC166987dD.A0r(interfaceC09390do6), c31823Dyh2);
                            }
                        }
                        C14360o3.A0B(A0r7, 2);
                        new C147036jf(c32275EJk2, A0r7).A02(false, null, fjt.A01.A00, null);
                        new C35233FgQ(c32275EJk2, c32275EJk2, A0r7, null, fjt).A04(et2, null, null, fjt.A00.toString(), null, false, false);
                        i3 = 104694891;
                    } else {
                        InterfaceC37264GbH interfaceC37264GbH2 = c32275EJk2.A03;
                        if (interfaceC37264GbH2 != null) {
                            InterfaceC09390do interfaceC09390do7 = c32275EJk2.A0B;
                            C147036jf c147036jf = new C147036jf(c32275EJk2, AbstractC166987dD.A0r(interfaceC09390do7));
                            String str29 = c32275EJk2.A06;
                            if (str29 == null) {
                                if (c32275EJk2.A08) {
                                    str29 = "no_skip";
                                } else {
                                    str29 = "legacy";
                                }
                            }
                            c147036jf.A02(false, null, str29, null);
                            C35233FgQ c35233FgQ = new C35233FgQ(c32275EJk2, c32275EJk2, AbstractC166987dD.A0r(interfaceC09390do7), interfaceC37264GbH2, null);
                            String obj3 = EnumC33444EqG.A06.toString();
                            String str30 = c32275EJk2.A07;
                            if (str30 == null) {
                                str4 = "registrationFlow";
                            } else {
                                if (z5) {
                                    C31823Dyh c31823Dyh3 = c32275EJk2.A02;
                                    if (c31823Dyh3 != null) {
                                        et2 = new ET2(AbstractC166987dD.A0r(interfaceC09390do7), c31823Dyh3);
                                    }
                                }
                                c35233FgQ.A04(et2, null, null, obj3, str30, false, false);
                            }
                        }
                        i3 = 104694891;
                    }
                    C0f9.A0C(i3, A053);
                    return;
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 57:
                A053 = C0f9.A05(-925138180);
                EMS ems = (EMS) this.A01;
                if (System.currentTimeMillis() - ems.A00 > StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                    UserSession A0r8 = AbstractC166987dD.A0r(ems.A08);
                    Bundle bundle5 = ems.mArguments;
                    if (bundle5 != null) {
                        str8 = bundle5.getString("nux_contact_point");
                    } else {
                        str8 = null;
                    }
                    F9U.A00(A0r8, new GAR(ems), str8, AbstractC31180DnO.A0c(ems), C16030qx.A02.A05(ems.requireContext()), null);
                    ems.A00 = System.currentTimeMillis();
                } else {
                    EMS.A00(ems, 2131976952);
                }
                i3 = 694695287;
                C0f9.A0C(i3, A053);
                return;
            case 58:
                A053 = C0f9.A05(1058639519);
                C36007Fv5 A009 = C36007Fv5.A00();
                EKF ekf = (EKF) this.A01;
                boolean A1X = AbstractC31171DnF.A1X(A009.A02(ekf.A05, "ig_android_growth_fx_access_fb_ig_sso", EKF.__redex_internal_original_name));
                C35037FcA A06 = C1Q9.A0a.A02(ekf.A05).A06(ekf.B75(), ekf.C0Q());
                A06.A05("has_facebook_session", A1X);
                C35037FcA.A01(A06, ekf.A0U);
                C34994FbR.A00.A00(ekf.A05, ekf.C0Q().A01);
                if (AbstractC31176DnK.A0k(ekf.A07.A02) != null && ((List) AbstractC31176DnK.A0k(ekf.A07.A02)).size() > 1) {
                    AbstractC31176DnK.A1A(ekf.requireArguments(), new EK1(), AbstractC31177DnL.A0N(ekf.requireActivity(), ekf.A05));
                } else if (A1X) {
                    ekf.A0B.A0A(C4JK.A00, AbstractC31174DnI.A0J("sign_up_with_cp_continue_button"), ekf.A05, C36007Fv5.A00().A01(ekf.A05, "ig_android_growth_fx_access_fb_ig_sso", EKF.__redex_internal_original_name), C36007Fv5.A00().A02(ekf.A05, "ig_android_growth_fx_access_fb_ig_sso", EKF.__redex_internal_original_name), ekf.A07.A02(), null);
                } else if (C36159FxZ.A03.A00(ekf.A05, EKF.__redex_internal_original_name)) {
                    if (AbstractC31181DnP.A11(ekf.A05, EKF.__redex_internal_original_name)) {
                        str9 = null;
                    } else {
                        str9 = C36159FxZ.A02;
                    }
                    if (!AbstractC31181DnP.A11(ekf.A05, EKF.__redex_internal_original_name) && (str10 = C36159FxZ.A00) != null && str9 != null) {
                        ekf.A0B.A0A(C4JK.A00, AbstractC31174DnI.A0J("sign_up_with_cp_continue_button"), ekf.A05, str10, str9, ekf.A07.A02(), null);
                    }
                } else {
                    ekf.A0B.A07();
                }
                i3 = -1757000934;
                C0f9.A0C(i3, A053);
                return;
            case 59:
                A052 = C0f9.A05(-888318612);
                C32260EIu c32260EIu = (C32260EIu) this.A01;
                C35031Fc4.A00.A00(AbstractC166987dD.A0o(c32260EIu.A09), null, "nux_discover_accounts");
                AbstractC31175DnJ.A1Q(AbstractC34275F9v.A00(c32260EIu));
                i2 = 526267305;
                C0f9.A0C(i2, A052);
                return;
            case 60:
                A053 = C0f9.A05(1424782620);
                ArrayList A1E = AbstractC166987dD.A1E();
                EOI eoi = (EOI) this.A01;
                LinkedHashSet linkedHashSet = eoi.A0Q;
                A1E.addAll(linkedHashSet);
                HashSet hashSet = eoi.A0O;
                A1E.addAll(hashSet);
                C35266Fh1 c35266Fh1 = C35266Fh1.A00;
                InterfaceC09390do interfaceC09390do8 = eoi.A0R;
                boolean A09 = c35266Fh1.A09(AbstractC166987dD.A0r(interfaceC09390do8), A1E);
                boolean z6 = !A09;
                ArrayList A0i = AbstractC167007dF.A0i(hashSet);
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    AbstractC167017dG.A1V(A0i, it2);
                }
                ArrayList A0i2 = AbstractC167007dF.A0i(linkedHashSet);
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    AbstractC167017dG.A1V(A0i2, it3);
                }
                ArrayList A0S = AbstractC001800i.A0S(A0i2, A0i);
                if (!A0S.isEmpty()) {
                    C40701ud A014 = AbstractC40691uc.A01(AbstractC166987dD.A0r(interfaceC09390do8));
                    C2JO c2jo = new C2JO();
                    c2jo.A08("request_from_nux", true);
                    c2jo.A05("user_ids", A0S);
                    String A14 = AbstractC25225BEi.A14();
                    if (A14 != null) {
                        c2jo.A09(A14, "nav_chain");
                    }
                    C2JM A0b8 = AbstractC25225BEi.A0b();
                    C2JM A0b9 = AbstractC25225BEi.A0b();
                    A0b8.A00(c2jo, "data");
                    A014.ATV(C35820Frw.A00, C35848FsO.A00, new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "FriendshipBulkFollowRequest", A0b8.getParamsCopy(), A0b9.getParamsCopy(), C60016Qsc.class, true, null, 0, null, "xdt_create_many", AbstractC166987dD.A1E()));
                    if (z6) {
                        AbstractC167007dF.A0J().postDelayed(new GOS(AbstractC25227BEk.A0v(eoi, 2131961153), AbstractC25227BEk.A0v(eoi, 2131961154)), 100L);
                    }
                    int size = AbstractC001800i.A0l(eoi.A0D, hashSet).size();
                    int size2 = hashSet.size() - size;
                    AbstractC12990ll A0o4 = AbstractC166987dD.A0o(interfaceC09390do8);
                    InterfaceC11380iw interfaceC11380iw = eoi.A04;
                    if (interfaceC11380iw != null) {
                        C18920wW A015 = AbstractC12220kQ.A01(interfaceC11380iw, A0o4);
                        C12180kM c12180kM = A015.A00;
                        InterfaceC02590Ai A0010 = A015.A00(c12180kM, "batch_follow_button_tapped");
                        A0010.AAP("module", "discover_people_nux_quick_friending");
                        A0010.A9K("num_requests", AbstractC31171DnF.A0V(A0S.size()));
                        A0010.Cht();
                        InterfaceC02590Ai A0011 = A015.A00(c12180kM, "batch_follow_button_tapped_search_selection_count");
                        A0011.AAP("module", "discover_people_nux_quick_friending");
                        A0011.A9K("num_requests", AbstractC31171DnF.A0V(linkedHashSet.size()));
                        A0011.Cht();
                        InterfaceC02590Ai A0012 = A015.A00(c12180kM, "batch_follow_button_tapped_preselected_count");
                        A0012.AAP("module", "discover_people_nux_quick_friending");
                        A0012.A9K("num_requests", AbstractC31171DnF.A0V(size));
                        A0012.Cht();
                        InterfaceC02590Ai A0013 = A015.A00(c12180kM, "batch_follow_button_tapped_nonpreselected_count");
                        A0013.AAP("module", "discover_people_nux_quick_friending");
                        A0013.A9K("num_requests", AbstractC31171DnF.A0V(size2));
                        A0013.Cht();
                    }
                    str4 = "analyticsModule";
                    C14360o3.A0F(str4);
                    throw C00O.createAndThrow();
                }
                ArrayList A0i3 = AbstractC167007dF.A0i(hashSet);
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    A0i3.add(AbstractC25226BEj.A15(it4).getUsername());
                }
                if (AbstractC166987dD.A1b(A0i3)) {
                    for (Object obj4 : A0i3) {
                        E8F e8f = (E8F) eoi.A0N.get(obj4);
                        Number A0W = AbstractC31171DnF.A0W(obj4, eoi.A0M);
                        if (e8f != null && A0W != null && (A002 = EOI.A00(e8f, A0W.intValue())) != null) {
                            C63702ur c63702ur = eoi.A0C;
                            if (c63702ur == null) {
                                str4 = "recommendedUserLogger";
                                C14360o3.A0F(str4);
                                throw C00O.createAndThrow();
                            }
                            c63702ur.A08(new C6PH(A002));
                        }
                    }
                }
                C35031Fc4.A00.A00(AbstractC166987dD.A0o(interfaceC09390do8), null, eoi.A0K);
                if (A09) {
                    C36484G7i c36484G7i = new C36484G7i(eoi);
                    UserSession A0r9 = AbstractC166987dD.A0r(interfaceC09390do8);
                    InterfaceC11380iw interfaceC11380iw2 = eoi.A04;
                    if (interfaceC11380iw2 != null) {
                        FragmentActivity requireActivity = eoi.requireActivity();
                        Context requireContext4 = eoi.requireContext();
                        C14360o3.A0B(A0r9, 0);
                        if (c35266Fh1.A09(A0r9, A1E)) {
                            C35266Fh1.A01(requireActivity, requireContext4, interfaceC11380iw2, A0r9, c36484G7i, A1E);
                        }
                        ProgressButton progressButton5 = eoi.A0A;
                        if (progressButton5 != null) {
                            progressButton5.setEnabled(false);
                        }
                    }
                    str4 = "analyticsModule";
                    C14360o3.A0F(str4);
                    throw C00O.createAndThrow();
                }
                InterfaceC37264GbH interfaceC37264GbH3 = eoi.A06;
                if (interfaceC37264GbH3 != null) {
                    interfaceC37264GbH3.CnE(1);
                }
                i3 = 1606619702;
                C0f9.A0C(i3, A053);
                return;
            case 61:
                A052 = C0f9.A05(-1998975397);
                EOI eoi2 = (EOI) this.A01;
                AbstractC31175DnJ.A1P(eoi2.A06);
                C35111FeD.A00(AbstractC166987dD.A0o(eoi2.A0R), null, eoi2.A0K);
                i2 = 432011286;
                C0f9.A0C(i2, A052);
                return;
            case 62:
                A052 = C0f9.A05(420708657);
                EMT emt = (EMT) this.A01;
                C35111FeD.A00(AbstractC166987dD.A0o(emt.A06), null, "cp_acquisition_email");
                AbstractC31175DnJ.A1P(emt.A01);
                i2 = -526305259;
                C0f9.A0C(i2, A052);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                EHT eht2 = (EHT) this.A01;
                C35230FgN.A02(C1Q9.A09.A02(eht2.A00), eht2.A02, EnumC31713DwI.A09);
                AbstractC10360h2 abstractC10360h2 = eht2.mFragmentManager;
                if (abstractC10360h2 == null || abstractC10360h2.A0L() <= 0) {
                    return;
                }
                abstractC10360h2.A12();
                return;
            case 64:
                C33000Egn c33000Egn = (C33000Egn) this.A01;
                EditText editText = c33000Egn.A00;
                if (editText != null) {
                    str3 = AbstractC167007dF.A0g(editText);
                } else {
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str3) && (parseInt = Integer.parseInt(str3)) > 4) {
                    Calendar calendar2 = Calendar.getInstance();
                    int i4 = calendar2.get(1) - parseInt;
                    int i5 = calendar2.get(2) + 1;
                    int A056 = AbstractC31173DnH.A05(calendar2);
                    c33000Egn.A02(new EUU(c33000Egn, i4, i5, A056), i4, i5, A056);
                    return;
                }
                TextView textView3 = c33000Egn.A01;
                textView3.getClass();
                textView3.setText(2131952533);
                TextView textView4 = c33000Egn.A01;
                Activity rootActivity = c33000Egn.getRootActivity();
                rootActivity.getClass();
                AbstractC166987dD.A1O(rootActivity, textView4, AbstractC53242c7.A03(c33000Egn.getRootActivity()));
                return;
            case 65:
                A053 = C0f9.A05(-1650011285);
                C32288EKb c32288EKb = (C32288EKb) this.A01;
                AbstractC34350FCs.A00(c32288EKb.A05, "landing");
                c32288EKb.A07.A01();
                i3 = -1826610032;
                C0f9.A0C(i3, A053);
                return;
            case 66:
                A053 = C0f9.A05(1059562785);
                C32288EKb c32288EKb2 = (C32288EKb) this.A01;
                C07270a1 c07270a1 = c32288EKb2.A05;
                C14360o3.A0B(c07270a1, 0);
                FDC.A00(c07270a1, null, "landing");
                AbstractC10360h2 abstractC10360h22 = c32288EKb2.mFragmentManager;
                AbstractC31172DnG.A1A();
                Bundle bundle6 = c32288EKb2.mArguments;
                C32316ELf c32316ELf = new C32316ELf();
                c32316ELf.setArguments(bundle6);
                AbstractC35259Fgt.A07(c32316ELf, abstractC10360h22, "android.nux.LoginLandingFragment");
                i3 = -915068854;
                C0f9.A0C(i3, A053);
                return;
            case 67:
                A053 = C0f9.A05(-237440549);
                C36007Fv5 A0014 = C36007Fv5.A00();
                C32288EKb c32288EKb3 = (C32288EKb) this.A01;
                boolean A1X2 = AbstractC31171DnF.A1X(A0014.A02(c32288EKb3.A05, "ig_android_growth_fx_access_fb_ig_sso", C32288EKb.__redex_internal_original_name));
                C35037FcA A062 = C1Q9.A0a.A02(c32288EKb3.A05).A06(EnumC33445EqI.A04, EnumC31713DwI.A0r);
                A062.A05("has_facebook_session", A1X2);
                C35037FcA.A01(A062, c32288EKb3.A09);
                C34994FbR.A00.A00(c32288EKb3.A05, "landing");
                if (AbstractC31176DnK.A0k(c32288EKb3.A06.A02) != null && ((List) AbstractC31176DnK.A0k(c32288EKb3.A06.A02)).size() > 1) {
                    AbstractC31176DnK.A1A(c32288EKb3.requireArguments(), new EK1(), AbstractC31177DnL.A0N(c32288EKb3.requireActivity(), c32288EKb3.A05));
                } else if (A1X2) {
                    c32288EKb3.A08.A0A(C4JK.A00, AbstractC31174DnI.A0J("sign_up_continue_button"), c32288EKb3.A05, C36007Fv5.A00().A01(c32288EKb3.A05, "ig_android_growth_fx_access_fb_ig_sso", C32288EKb.__redex_internal_original_name), C36007Fv5.A00().A02(c32288EKb3.A05, "ig_android_growth_fx_access_fb_ig_sso", C32288EKb.__redex_internal_original_name), c32288EKb3.A06.A02(), null);
                } else if (C36159FxZ.A03.A00(c32288EKb3.A05, C32288EKb.__redex_internal_original_name)) {
                    if (AbstractC31181DnP.A11(c32288EKb3.A05, C32288EKb.__redex_internal_original_name)) {
                        str11 = null;
                    } else {
                        str11 = C36159FxZ.A00;
                    }
                    if (AbstractC31181DnP.A11(c32288EKb3.A05, C32288EKb.__redex_internal_original_name)) {
                        str12 = null;
                    } else {
                        str12 = C36159FxZ.A02;
                    }
                    if (str11 != null && str12 != null) {
                        c32288EKb3.A08.A0A(C4JK.A00, AbstractC31174DnI.A0J("sign_up_continue_button"), c32288EKb3.A05, str11, str12, c32288EKb3.A06.A02(), null);
                    }
                } else {
                    c32288EKb3.A08.A07();
                }
                i3 = -1531340161;
                C0f9.A0C(i3, A053);
                return;
            case 68:
                A052 = C0f9.A05(1067577766);
                AbstractC31178DnM.A1T(this.A01);
                i2 = 1282933818;
                C0f9.A0C(i2, A052);
                return;
            case 69:
                A052 = C0f9.A05(1146051783);
                AbstractC31178DnM.A1T(this.A01);
                i2 = -1272177892;
                C0f9.A0C(i2, A052);
                return;
            default:
                A052 = C0f9.A05(2144181423);
                AbstractC31178DnM.A1T(this.A01);
                i2 = 367843970;
                C0f9.A0C(i2, A052);
                return;
        }
    }
}
