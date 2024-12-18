package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.FpR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35691FpR implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC35691FpR(C32324ELs c32324ELs, int i) {
        this.A00 = i;
        switch (i) {
            case 7:
            case 8:
            case 9:
                this.A01 = c32324ELs;
                return;
            default:
                this.A01 = c32324ELs;
                return;
        }
    }

    public static ViewOnClickListenerC35691FpR A00(Object obj, int i) {
        return new ViewOnClickListenerC35691FpR(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC35691FpR(obj, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v191, types: [X.1i3, X.1OW] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        int A052;
        int i2;
        int i3;
        View view2;
        C56352iT c56352iT;
        Integer num;
        Integer num2;
        View view3;
        C32324ELs c32324ELs;
        boolean z;
        IgdsButton igdsButton;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1212589446);
                AbstractC32348EMv.A00((AbstractC32348EMv) this.A01);
                i = -2094753805;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-1077061552);
                AbstractC31176DnK.A1Y(this.A01);
                i = -292245631;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-221999207);
                EKR ekr = (EKR) this.A01;
                GXS gxs = ekr.A00;
                if (gxs == null) {
                    str = "delegate";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                gxs.DWJ();
                AbstractC167017dG.A0y(ekr.getActivity(), C3DN.A00);
                i = -1929826296;
                C0f9.A0C(i, A05);
                return;
            case 3:
            case 4:
            case 5:
                C32326ELu c32326ELu = (C32326ELu) this.A01;
                String A0g = AbstractC167007dF.A0g(c32326ELu.A01);
                if (!AbstractC34195F6t.A00(c32326ELu.A00, A0g, true, true)) {
                    return;
                }
                if (c32326ELu.A0C) {
                    view3 = c32326ELu.A03;
                } else {
                    C56352iT A00 = C56342iS.A00(c32326ELu.getActivity());
                    if (A00 != null) {
                        A00.ARS(false);
                    }
                    view3 = c32326ELu.A08;
                }
                if (view3 != null) {
                    view3.setEnabled(false);
                }
                if (c32326ELu.A0B.size() < 2) {
                    return;
                }
                AbstractC31557Dth.A01(c32326ELu, true);
                UserSession userSession = c32326ELu.A04;
                String A002 = AbstractC68470VSb.A00();
                String trim = A0g.trim();
                ArrayList A02 = AbstractC35052FcP.A02(c32326ELu.A0B);
                C14360o3.A0B(userSession, 0);
                EE9.A00(DirectThreadApi.A0C(userSession, A002, trim, A02), c32326ELu.A04, c32326ELu, 5);
                return;
            case 6:
                AbstractC25226BEj.A1P((Fragment) this.A01);
                return;
            case 7:
                c32324ELs = (C32324ELs) this.A01;
                C36299Fzu c36299Fzu = c32324ELs.A09;
                if (c36299Fzu != null) {
                    c36299Fzu.A07(C32324ELs.A00(c32324ELs));
                }
                z = false;
                if (c32324ELs.A0J != null || c32324ELs.A0K == null) {
                    return;
                }
                IgdsButton igdsButton2 = c32324ELs.A0E;
                if (igdsButton2 != null && c32324ELs.A0D != null) {
                    igdsButton2.setEnabled(false);
                    c32324ELs.A0D.setEnabled(false);
                }
                c32324ELs.A09.getClass();
                AbstractC31171DnF.A1L(c32324ELs);
                c32324ELs.A09.A07(C32324ELs.A00(c32324ELs));
                C1ON A09 = DirectThreadApi.A09(c32324ELs.A04, c32324ELs.A0K, null, c32324ELs.A0J.intValue(), c32324ELs.A0H.booleanValue(), false);
                if (z) {
                    igdsButton = c32324ELs.A0E;
                } else {
                    igdsButton = c32324ELs.A0D;
                }
                if (igdsButton != null) {
                    igdsButton.setLoading(true);
                }
                UserSession userSession2 = c32324ELs.A04;
                C14360o3.A0B(userSession2, 0);
                FPW fpw = (FPW) userSession2.A01(FPW.class, new C37055GUl(userSession2, 42));
                A09.A00 = new C67856Uzb(fpw.A00, new GRX(c32324ELs, 2, z), new GRX(c32324ELs, 1, z), 0);
                fpw.A01.schedule(A09, A09.getRunnableId(), 3, true, false);
                return;
            case 8:
                c32324ELs = (C32324ELs) this.A01;
                C36299Fzu c36299Fzu2 = c32324ELs.A09;
                if (c36299Fzu2 != null) {
                    C34628FNl A003 = C32324ELs.A00(c32324ELs);
                    C25531Mh A004 = C36299Fzu.A00(c36299Fzu2);
                    if (AbstractC25226BEj.A1Z(A004)) {
                        C36299Fzu.A04(A004, c36299Fzu2);
                        AbstractC31174DnI.A1I(A004, "thread_create_attempt");
                        A004.A0o("direct_invite_skip_button");
                        C36299Fzu.A05(A004, c36299Fzu2, "invite_people");
                        A004.A0v(C36299Fzu.A03(A003, c36299Fzu2));
                        A004.Cht();
                    }
                }
                z = true;
                if (c32324ELs.A0J != null) {
                    return;
                } else {
                    return;
                }
            case 9:
                C32324ELs c32324ELs2 = (C32324ELs) this.A01;
                AbstractC31171DnF.A1L(c32324ELs2);
                AbstractC31175DnJ.A1N(AbstractC31172DnG.A0Q(c32324ELs2, c32324ELs2.A04, 0), "direct_add_users_tap_plus");
                UserSession userSession3 = c32324ELs2.A04;
                ImmutableMap copyOf = ImmutableMap.copyOf(c32324ELs2.A0A.A0r);
                boolean A1R = AbstractC167007dF.A1R(0, userSession3, copyOf);
                Bundle A0D = AbstractC31174DnI.A0D(userSession3);
                C32344EMq c32344EMq = new C32344EMq();
                c32344EMq.setArguments(A0D);
                c32344EMq.A00 = c32324ELs2;
                c32344EMq.A01 = copyOf;
                C189448aO A0X = AbstractC31177DnL.A0X(c32324ELs2.A04, A1R);
                A0X.A0B = R.color.fds_transparent;
                A0X.A17 = A1R;
                A0X.A03 = 1.0f;
                AbstractC31177DnL.A14(c32324ELs2, c32344EMq, A0X);
                return;
            case 10:
                AbstractC31178DnM.A1T(((Ft8) this.A01).A01);
                return;
            case 11:
                C32324ELs c32324ELs3 = (C32324ELs) ((Ft8) this.A01).A01;
                IgEditText igEditText = c32324ELs3.A05;
                if (igEditText == null || c32324ELs3.A07 == null) {
                    return;
                }
                AbstractC31171DnF.A14(igEditText);
                c32324ELs3.A05.setHint(2131960265);
                c32324ELs3.A07.setVisibility(8);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(1925408961);
                AbstractC31178DnM.A1T(((Ft8) this.A01).A01);
                i = 286424891;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(2021074312);
                AbstractC31178DnM.A1T(this.A01);
                i = -1689063621;
                C0f9.A0C(i, A05);
                return;
            case 14:
                EVU evu = (EVU) this.A01;
                UserSession userSession4 = evu.A0g;
                InterfaceC37289Gbq interfaceC37289Gbq = evu.A0m;
                boolean A1a = AbstractC167017dG.A1a(userSession4, interfaceC37289Gbq);
                AbstractC31175DnJ.A1N(AbstractC12220kQ.A01(interfaceC37289Gbq, userSession4), "direct_group_creation_group_chat_row_tap");
                C35022Fbv c35022Fbv = new C35022Fbv(userSession4, interfaceC37289Gbq.requireContext());
                if (c35022Fbv.A01()) {
                    c35022Fbv.A00();
                    return;
                }
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putBoolean("direct_is_creating_group_chat", A1a);
                A0b.putSerializable("direct_group_creation_entrypoint", EnumC33498ErX.OMNIPICKET_CREATE_GROUP_CHAT_ROW);
                C32324ELs c32324ELs4 = new C32324ELs();
                c32324ELs4.setArguments(A0b);
                C140966Yy A0r = AbstractC25225BEi.A0r(interfaceC37289Gbq.requireActivity(), userSession4);
                A0r.A0A = interfaceC37289Gbq.getModuleName();
                A0r.A0E(c32324ELs4);
                A0r.A04();
                return;
            case Process.SIGTERM /* 15 */:
                ((EVU) this.A01).A0m.E2T();
                return;
            case 16:
                ((EVU) this.A01).A0m.E2Q();
                return;
            case 17:
                ((EVU) this.A01).A0m.E2Y();
                return;
            case 18:
                A05 = C0f9.A05(93630710);
                EVU evu2 = (EVU) this.A01;
                UserSession userSession5 = evu2.A0g;
                ChannelCreationSource channelCreationSource = ChannelCreationSource.A08;
                EnumC33330EoP enumC33330EoP = EnumC33330EoP.A03;
                C14360o3.A0B(userSession5, 0);
                AbstractC35055FcS.A01(userSession5, new ChannelCreationFlowExtraArgs(null, null, null), channelCreationSource, enumC33330EoP, false).Cgf(evu2.A0m.requireActivity());
                i = 1001271010;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController = (DirectPrivateStoryRecipientController) this.A01;
                AbstractC61765RtK.A00(directPrivateStoryRecipientController.A0w.requireContext(), directPrivateStoryRecipientController.A0T);
                final IgTextView igTextView = (IgTextView) view;
                igTextView.setText(2131956830);
                igTextView.postDelayed(new Runnable() { // from class: X.GLC
                    @Override // java.lang.Runnable
                    public final void run() {
                        IgTextView.this.setText(2131956832);
                    }
                }, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                return;
            case 20:
                A05 = C0f9.A05(-301057068);
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController2 = (DirectPrivateStoryRecipientController) this.A01;
                AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController2.A0w;
                C50674MYs c50674MYs = new C50674MYs(abstractC59962oe.requireContext(), directPrivateStoryRecipientController2.A0B);
                c50674MYs.A03(new ViewOnClickListenerC35691FpR(directPrivateStoryRecipientController2, 21), 2131961589);
                new C31727DwY(c50674MYs).A07(abstractC59962oe.getContext());
                i = 1575118326;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(1532550445);
                C684436h c684436h = ((DirectPrivateStoryRecipientController) this.A01).A09;
                c684436h.getClass();
                c684436h.Cgk(EnumC33409Epg.STORY_SHARE_SHEET, false, false);
                i = 364724482;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A052 = C0f9.A05(-1647941562);
                C32331EMd c32331EMd = (C32331EMd) this.A01;
                InterfaceC09390do interfaceC09390do = c32331EMd.A0V;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                Context requireContext = c32331EMd.requireContext();
                C2EC c2ec = c32331EMd.A01;
                str = "thread";
                if (c2ec != null) {
                    DirectCameraViewModel A022 = LKW.A02(requireContext, A0r2, c2ec, c2ec.C7I());
                    Bundle A0b2 = AbstractC166987dD.A0b();
                    A0b2.putParcelable(AbstractC43591JPw.A00(7), A022);
                    C6XJ.A02(c32331EMd.requireActivity(), A0b2, AbstractC166987dD.A0o(interfaceC09390do), TransparentModalActivity.class, AbstractC111324zv.A00(206)).A0D(c32331EMd, 13369);
                    c32331EMd.requireActivity().overridePendingTransition(0, 0);
                    i2 = 935402137;
                    C0f9.A0C(i2, A052);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 23:
                A052 = C0f9.A05(-1127381667);
                C35209Fg1.A00((C35209Fg1) this.A01);
                i2 = 1923548564;
                C0f9.A0C(i2, A052);
                return;
            case 24:
                A052 = C0f9.A05(-1569250362);
                EK5 ek5 = (EK5) this.A01;
                ((C36294Fzo) AbstractC166987dD.A17(ek5.A09)).A02("message_list");
                ek5.A00();
                i2 = 1037302142;
                C0f9.A0C(i2, A052);
                return;
            case 25:
                A052 = C0f9.A05(-66837594);
                EK5 ek52 = (EK5) this.A01;
                ((C36294Fzo) AbstractC166987dD.A17(ek52.A09)).A02("message_list");
                ek52.A00();
                i2 = -1195164323;
                C0f9.A0C(i2, A052);
                return;
            case 26:
                A052 = C0f9.A05(-168841454);
                ((C31295DpH) this.A01).A00.A01();
                i2 = 743099639;
                C0f9.A0C(i2, A052);
                return;
            case 27:
                DirectShareSheetFragment.A0C((DirectShareSheetFragment) this.A01);
                return;
            case 28:
            case 30:
            case 32:
            case 36:
            case 38:
            case 39:
                DirectShareSheetFragment.A0J((DirectShareSheetFragment) this.A01, "ig_content_deep_dive:prompt_send");
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 33:
            case 35:
            case 40:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 45:
            default:
                ((DirectShareSheetFragment) this.A01).DVX();
                return;
            case 31:
            case 34:
            case 37:
            case Seq.NULL_REFNUM /* 41 */:
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel = directShareSheetFragment.A0Q;
                GSS.A02(directShareSheetFragment.requireContext(), directShareSheetFragmentViewModel, AbstractC141776au.A00(directShareSheetFragmentViewModel), 19);
                return;
            case 43:
            case 44:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                AbstractC31177DnL.A12((DirectShareSheetFragment) this.A01);
                return;
            case 47:
                A052 = C0f9.A05(1586686566);
                ((ELb) this.A01).onBackPressed();
                i2 = -1539081660;
                C0f9.A0C(i2, A052);
                return;
            case 48:
                A052 = C0f9.A05(1874163566);
                AbstractC25227BEk.A1B((ELO) this.A01);
                i2 = 816838077;
                C0f9.A0C(i2, A052);
                return;
            case 49:
                A05 = C0f9.A05(-278191899);
                ELO elo = (ELO) this.A01;
                boolean z2 = elo.A06;
                ArrayList A1E = AbstractC166987dD.A1E();
                ArrayList A1E2 = AbstractC166987dD.A1E();
                C57312k6 A005 = C07Y.A00(elo);
                if (z2) {
                    i3 = 6;
                } else {
                    i3 = 5;
                }
                AbstractC166987dD.A1Z(new MCI(A1E, elo, A1E2, null, i3), A005);
                i = 1291325844;
                C0f9.A0C(i, A05);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A052 = C0f9.A05(310308261);
                ELO elo2 = (ELO) this.A01;
                InterfaceC09390do interfaceC09390do2 = elo2.A08;
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do2);
                AbstractC31171DnF.A1Q(A0r3);
                KDS A006 = AbstractC46899Kog.A00(A0r3, null, null, AbstractC166987dD.A1E(), -2, 0, 0, 0, true, false);
                C189448aO A0g2 = AbstractC25231BEo.A0g(interfaceC09390do2);
                AbstractC25225BEi.A1Q(A0g2, true);
                C189478aR A007 = A0g2.A00();
                A006.A01 = new C36435G5k(0, elo2, A007);
                AbstractC13880nE.A0K(elo2.requireActivity());
                AbstractC31173DnH.A1G(elo2, A006, A007);
                i2 = 502094053;
                C0f9.A0C(i2, A052);
                return;
            case 51:
                C32282EJt c32282EJt = (C32282EJt) this.A01;
                java.util.Set set = c32282EJt.A0C;
                if (set.isEmpty()) {
                    return;
                }
                LinkedList linkedList = new LinkedList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    AbstractC167017dG.A1V(linkedList, it);
                }
                AbstractC35173FfQ.A03(c32282EJt.A00, new C36450G5z(c32282EJt, 0), c32282EJt.A04, linkedList);
                c32282EJt.A05 = true;
                C32282EJt.A00(c32282EJt);
                String str2 = c32282EJt.A03;
                if (str2 == null) {
                    return;
                }
                C36283Fza A008 = AbstractC40677I1j.A00(c32282EJt.A00);
                String str3 = c32282EJt.A04;
                C14360o3.A0B(str3, 0);
                C25531Mh A0F = C25531Mh.A0F(A008.A00);
                if (!AbstractC25226BEj.A1Z(A0F)) {
                    return;
                }
                AbstractC31178DnM.A1F(A0F, A008.A01);
                AbstractC31174DnI.A1I(A0F, "jcs_invite_recipient");
                AbstractC31179DnN.A1E(A0F, "jcs_recipient_selection", str3, str2);
                return;
            case 52:
                C32282EJt c32282EJt2 = (C32282EJt) this.A01;
                c32282EJt2.A02.getClass();
                List unmodifiableList = Collections.unmodifiableList(c32282EJt2.A02.A04);
                int size = unmodifiableList.size();
                java.util.Set set2 = c32282EJt2.A0C;
                if (set2.size() == size) {
                    set2.clear();
                } else {
                    String str4 = c32282EJt2.A03;
                    if (str4 != null) {
                        C36283Fza A009 = AbstractC40677I1j.A00(c32282EJt2.A00);
                        String str5 = c32282EJt2.A04;
                        C14360o3.A0B(str5, 0);
                        C25531Mh A0F2 = C25531Mh.A0F(A009.A00);
                        if (AbstractC25226BEj.A1Z(A0F2)) {
                            AbstractC31178DnM.A1F(A0F2, A009.A01);
                            AbstractC31174DnI.A1I(A0F2, "jcs_select_all_recipients");
                            AbstractC31179DnN.A1E(A0F2, "jcs_recipient_selection", str5, str4);
                        }
                    }
                    int i4 = c32282EJt2.A02.A01;
                    if (i4 + size <= 250) {
                        set2.addAll(unmodifiableList);
                    } else {
                        int size2 = (C8S8.DEFAULT_SWIPE_ANIMATION_DURATION - i4) - set2.size();
                        for (int i5 = 0; i5 < size && size2 != 0; i5++) {
                            Object obj = unmodifiableList.get(i5);
                            if (!set2.contains(obj)) {
                                set2.add(obj);
                                size2--;
                            }
                        }
                        int size3 = set2.size();
                        C193328hC A0O = AbstractC31175DnJ.A0O(c32282EJt2);
                        int i6 = 2131960419;
                        if (c32282EJt2.A07) {
                            i6 = 2131960420;
                        }
                        Integer valueOf = Integer.valueOf(size3);
                        A0O.A05 = AbstractC31174DnI.A0w(c32282EJt2, valueOf, i6);
                        AbstractC31177DnL.A1A(c32282EJt2, A0O, valueOf, 2131960418);
                        A0O.A0t(true);
                        AbstractC31176DnK.A15(new DialogInterfaceOnClickListenerC35301Fha(4), A0O);
                    }
                }
                C32282EJt.A00(c32282EJt2);
                c32282EJt2.A01.notifyDataSetChanged();
                FragmentActivity activity = c32282EJt2.getActivity();
                if (activity == null) {
                    return;
                }
                AbstractC31175DnJ.A0i(activity);
                return;
            case 53:
                A052 = C0f9.A05(530103141);
                ((C7J6) this.A01).Dso("info_button");
                i2 = -601663483;
                C0f9.A0C(i2, A052);
                return;
            case 54:
                A052 = C0f9.A05(-1969140711);
                G2W.A00(AbstractC166987dD.A0b(), new KDN(), (G2W) ((C7J6) this.A01));
                i2 = -857541123;
                C0f9.A0C(i2, A052);
                return;
            case 55:
                A05 = C0f9.A05(1883049760);
                C31290DpC c31290DpC = ((FKU) this.A01).A02;
                AbstractC14480oK.A00(c31290DpC.A00.getApplicationContext());
                AbstractC167007dF.A17(c31290DpC.A02.A00.ARD(), "has_seen_broadcast_channel_pushability_upsell");
                InterfaceC50429MOj interfaceC50429MOj = ((AbstractC46524KiP) c31290DpC).A00;
                if (interfaceC50429MOj != null) {
                    interfaceC50429MOj.onDismiss();
                }
                i = -1263830552;
                C0f9.A0C(i, A05);
                return;
            case 56:
                A05 = C0f9.A05(-1498115761);
                C31290DpC c31290DpC2 = ((FKU) this.A01).A02;
                AbstractC167007dF.A17(c31290DpC2.A02.A00.ARD(), "has_seen_broadcast_channel_pushability_upsell");
                InterfaceC50429MOj interfaceC50429MOj2 = ((AbstractC46524KiP) c31290DpC2).A00;
                if (interfaceC50429MOj2 != null) {
                    interfaceC50429MOj2.onDismiss();
                }
                i = 1137137240;
                C0f9.A0C(i, A05);
                return;
            case 57:
                A052 = C0f9.A05(-208754175);
                AbstractC31176DnK.A1Y(this.A01);
                i2 = 995953298;
                C0f9.A0C(i2, A052);
                return;
            case 58:
                A052 = C0f9.A05(1937651866);
                C32284EJv.A03((C32284EJv) this.A01);
                i2 = 1910193673;
                C0f9.A0C(i2, A052);
                return;
            case 59:
                A052 = C0f9.A05(2023743745);
                C32284EJv.A03((C32284EJv) this.A01);
                i2 = -1895249462;
                C0f9.A0C(i2, A052);
                return;
            case 60:
                A052 = C0f9.A05(1683812631);
                C32284EJv.A04((C32284EJv) this.A01);
                i2 = -1200572461;
                C0f9.A0C(i2, A052);
                return;
            case 61:
                A052 = C0f9.A05(1734688953);
                C32284EJv.A04((C32284EJv) this.A01);
                i2 = -1118467276;
                C0f9.A0C(i2, A052);
                return;
            case 62:
                A052 = C0f9.A05(1611181039);
                C32284EJv.A05((C32284EJv) this.A01);
                i2 = 1638782442;
                C0f9.A0C(i2, A052);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A052 = C0f9.A05(-515061980);
                C32284EJv.A05((C32284EJv) this.A01);
                i2 = 1375267009;
                C0f9.A0C(i2, A052);
                return;
            case 64:
                A052 = C0f9.A05(-1505844875);
                C32284EJv.A06((C32284EJv) this.A01);
                i2 = -164335896;
                C0f9.A0C(i2, A052);
                return;
            case 65:
                A052 = C0f9.A05(-1637978224);
                C32284EJv.A06((C32284EJv) this.A01);
                i2 = 1581449192;
                C0f9.A0C(i2, A052);
                return;
            case 66:
                A05 = C0f9.A05(1478461318);
                C32284EJv c32284EJv = (C32284EJv) this.A01;
                InterfaceC83733oI A0010 = C32284EJv.A00(c32284EJv);
                if (AbstractC1345466e.A02(A0010) != null) {
                    UserSession A0r4 = AbstractC166987dD.A0r(c32284EJv.A0G);
                    DirectThreadKey directThreadKey = new DirectThreadKey(AbstractC31171DnF.A0c(A0010), null);
                    C14360o3.A0B(A0r4, 0);
                    JTa A08 = AbstractC31277Doz.A08(A0r4, C33411i3.class);
                    C14360o3.A0B(A08, 1);
                    ?? c1ow = new C1OW(A08);
                    c1ow.A00 = directThreadKey;
                    AbstractC31173DnH.A1U(A0r4, c1ow);
                    c32284EJv.A0F.set(true);
                }
                i = 9460123;
                C0f9.A0C(i, A05);
                return;
            case 67:
                A052 = C0f9.A05(-2110308356);
                AbstractC25225BEi.A1U(this.A01, view);
                i2 = -1885752709;
                C0f9.A0C(i2, A052);
                return;
            case 68:
                A05 = C0f9.A05(-845319307);
                C32285EJx c32285EJx = (C32285EJx) this.A01;
                C006802i c006802i = c32285EJx.A0N;
                c006802i.markerPoint(894512288, "keyboard_tap");
                c006802i.markerEnd(894512288, (short) 4);
                C32285EJx.A0E(c32285EJx, C05F.A0N);
                FragmentActivity activity2 = c32285EJx.getActivity();
                if (activity2 != null) {
                    if (C32285EJx.A0I(c32285EJx)) {
                        C189478aR c189478aR = c32285EJx.A08;
                        if (c189478aR != null) {
                            c189478aR.A03.A0N();
                        }
                        C32285EJx.A06(c32285EJx);
                        C189478aR c189478aR2 = c32285EJx.A08;
                        if (c189478aR2 != null) {
                            c189478aR2.A03.onBottomSheetPositionChanged(0, 0);
                        }
                        C189478aR c189478aR3 = c32285EJx.A08;
                        if (c189478aR3 != null) {
                            c189478aR3.A03.A0T(4);
                        }
                        C189478aR c189478aR4 = c32285EJx.A08;
                        if (c189478aR4 != null && (c56352iT = c189478aR4.A03._actionBarService) != null) {
                            c56352iT.EkF(false);
                        }
                        new AiAgentThreadLauncher(AbstractC166987dD.A0r(c32285EJx.A0T)).A0B(activity2, null, c32285EJx, null, C32285EJx.A02(c32285EJx), null, "meta_ai_voice", null, false, false, false, true, false);
                        C189478aR c189478aR5 = c32285EJx.A08;
                        if (c189478aR5 != null && (view2 = c189478aR5.A03.mView) != null) {
                            view2.post(new GLJ(c32285EJx));
                        }
                    } else {
                        AbstractC25231BEo.A0c(activity2, c32285EJx.A0T).A06();
                    }
                }
                i = -75022623;
                C0f9.A0C(i, A05);
                return;
            case 69:
                A05 = C0f9.A05(-1173934512);
                C32285EJx c32285EJx2 = (C32285EJx) this.A01;
                if (C32285EJx.A0J(c32285EJx2)) {
                    num = C05F.A0j;
                } else {
                    num = C05F.A0Y;
                }
                C32285EJx.A0E(c32285EJx2, num);
                C32285EJx.A07(c32285EJx2);
                i = -1648659209;
                C0f9.A0C(i, A05);
                return;
            case 70:
                A05 = C0f9.A05(-555870795);
                C32285EJx c32285EJx3 = (C32285EJx) this.A01;
                if (C32285EJx.A0H(c32285EJx3)) {
                    num2 = C05F.A15;
                } else {
                    num2 = C05F.A0u;
                }
                C32285EJx.A0E(c32285EJx3, num2);
                C32285EJx.A08(c32285EJx3);
                i = 1051464021;
                C0f9.A0C(i, A05);
                return;
        }
    }

    public ViewOnClickListenerC35691FpR(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, int i) {
        this.A00 = i;
        if (19 - i != 0) {
            this.A01 = directPrivateStoryRecipientController;
        } else {
            this.A01 = directPrivateStoryRecipientController;
        }
    }

    public ViewOnClickListenerC35691FpR(Ft8 ft8, int i) {
        this.A00 = i;
        switch (i) {
            case 10:
            case 11:
                this.A01 = ft8;
                return;
            default:
                this.A01 = ft8;
                return;
        }
    }

    public ViewOnClickListenerC35691FpR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public ViewOnClickListenerC35691FpR(EVU evu, int i) {
        this.A00 = i;
        switch (i) {
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
                this.A01 = evu;
                return;
            default:
                this.A01 = evu;
                return;
        }
    }
}
