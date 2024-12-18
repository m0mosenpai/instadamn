package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.aistudio.editor.AiSettingsRepository;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.comments.commentactions.CommentActionsMultiSelect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent;
import com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ClF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28667ClF implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC28667ClF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C3LY A00(C3LO c3lo, Object obj, int i) {
        c3lo.A0G = new ViewOnClickListenerC28667ClF(obj, i);
        return new C3LY(c3lo);
    }

    public static void A01(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC28667ClF(obj, i), view);
    }

    public static void A02(C3LO c3lo, InterfaceC56362iU interfaceC56362iU, Object obj, int i) {
        c3lo.A0G = new ViewOnClickListenerC28667ClF(obj, i);
        interfaceC56362iU.AA9(new C3LY(c3lo));
    }

    public static void A03(InterfaceC56362iU interfaceC56362iU, Object obj, int i, int i2) {
        interfaceC56362iU.AAF(new ViewOnClickListenerC28667ClF(obj, i), i2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        int A052;
        Object obj;
        Object obj2;
        int i2;
        int A053;
        ArrayList A0U;
        Object obj3;
        int i3;
        InterfaceC30795DgW interfaceC30795DgW;
        ImageUrl imageUrl;
        C26083BgC A00;
        int A054;
        ArrayList A0U2;
        Object obj4;
        int i4;
        InterfaceC30795DgW interfaceC30795DgW2;
        ImageUrl imageUrl2;
        C26083BgC A002;
        Object value;
        C25814BbV c25814BbV;
        Integer num;
        String str2;
        C2Fb c2Fb;
        C00M onBackPressedDispatcher;
        switch (this.A00) {
            case 0:
                A052 = C0f9.A05(1266417907);
                C26796BsK c26796BsK = (C26796BsK) this.A01;
                InterfaceC09390do interfaceC09390do = c26796BsK.A03;
                AbstractC25226BEj.A0o(interfaceC09390do).A08();
                C25531Mh A02 = C28484Chc.A02(c26796BsK.A01);
                if (AbstractC25226BEj.A1Z(A02)) {
                    A02.A0k("ai_settings_advanced_settings_done_button_clicked");
                    A02.Cht();
                }
                C25878Bcd A0o = AbstractC25226BEj.A0o(interfaceC09390do);
                Object value2 = A0o.A08.getValue();
                if (value2 != null) {
                    C26072Bg1 c26072Bg1 = (C26072Bg1) value2;
                    AiSettingsRepository aiSettingsRepository = A0o.A00;
                    aiSettingsRepository.A0B(c26072Bg1.A01);
                    aiSettingsRepository.A0A(c26072Bg1.A00);
                    aiSettingsRepository.A0C(c26072Bg1.A03);
                    List list = c26072Bg1.A04;
                    C14360o3.A0B(list, 0);
                    C05A c05a = aiSettingsRepository.A08;
                    C26083BgC c26083BgC = (C26083BgC) c05a.getValue();
                    if (c26083BgC != null) {
                        obj = C26083BgC.A00(null, null, c26083BgC, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, 16775167, false, false);
                    } else {
                        obj = null;
                    }
                    c05a.Egh(obj);
                    AiSettingsRepository.A04(aiSettingsRepository);
                    List list2 = c26072Bg1.A02;
                    C14360o3.A0B(list2, 0);
                    C26083BgC c26083BgC2 = (C26083BgC) c05a.getValue();
                    if (c26083BgC2 != null) {
                        obj2 = C26083BgC.A00(null, null, c26083BgC2, null, null, null, null, null, null, null, null, null, null, null, null, list2, null, null, 16252927, false, false);
                    } else {
                        obj2 = null;
                    }
                    c05a.Egh(obj2);
                    AiSettingsRepository.A04(aiSettingsRepository);
                    AbstractC25226BEj.A1P(c26796BsK);
                    i2 = -192761431;
                    C0f9.A0C(i2, A052);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 1:
                A05 = C0f9.A05(2130253332);
                C26797BsL c26797BsL = (C26797BsL) this.A01;
                C28484Chc A0q = AbstractC25226BEj.A0q(c26797BsL.A01);
                InterfaceC09390do interfaceC09390do2 = c26797BsL.A03;
                String A022 = C25878Bcd.A02(interfaceC09390do2);
                boolean A0K = AbstractC25226BEj.A0o(interfaceC09390do2).A0K();
                boolean A0J = AbstractC25226BEj.A0o(interfaceC09390do2).A0J();
                C25531Mh A003 = C28484Chc.A00(A0q);
                if (AbstractC25226BEj.A1Z(A003)) {
                    A003.A0k("settings_conversation_done_clicked");
                    A003.A0w(AbstractC25233BEq.A0p("has_icebreaker_changed", String.valueOf(A0J), AbstractC166987dD.A1L("has_welcome_message_changed", String.valueOf(A0K))));
                    A003.A0i(AbstractC25233BEq.A0n(A022));
                    A003.Cht();
                }
                C25878Bcd A0o2 = AbstractC25226BEj.A0o(interfaceC09390do2);
                Object value3 = A0o2.A0D.getValue();
                if (value3 != null) {
                    JWd jWd = (JWd) value3;
                    AiSettingsRepository aiSettingsRepository2 = A0o2.A00;
                    aiSettingsRepository2.A0C((List) jWd.A00);
                    aiSettingsRepository2.A0A(jWd.A01);
                    AbstractC25226BEj.A1P(c26797BsL);
                    i = 834263569;
                    C0f9.A0C(i, A05);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 2:
                A053 = C0f9.A05(867264790);
                C26805BsT c26805BsT = (C26805BsT) this.A01;
                C28484Chc A0q2 = AbstractC25226BEj.A0q(c26805BsT.A02);
                String A15 = AbstractC25225BEi.A15(c26805BsT.A03);
                InterfaceC09390do interfaceC09390do3 = c26805BsT.A05;
                A0q2.A0S(A15, C25879Bce.A03(interfaceC09390do3), "advanced_settings_creation");
                C25879Bce A0n = AbstractC25226BEj.A0n(interfaceC09390do3);
                C05A c05a2 = A0n.A04;
                Object value4 = c05a2.getValue();
                if (value4 != null) {
                    C26072Bg1 c26072Bg12 = (C26072Bg1) value4;
                    Object value5 = A0n.A08.getValue();
                    if (value5 != null) {
                        C26008Bew c26008Bew = (C26008Bew) value5;
                        int i5 = c26008Bew.A00;
                        List list3 = c26072Bg12.A04;
                        if (i5 == -1) {
                            A0U = AbstractC001800i.A0T(c26008Bew.A01, list3);
                        } else {
                            A0U = AbstractC001800i.A0U(list3);
                            A0U.set(i5, c26008Bew.A01);
                        }
                        C26072Bg1 c26072Bg13 = (C26072Bg1) c05a2.getValue();
                        if (c26072Bg13 != null) {
                            obj3 = C26072Bg1.A01(c26072Bg13, A0U);
                        } else {
                            obj3 = null;
                        }
                        c05a2.Egh(obj3);
                        AbstractC25226BEj.A1P(c26805BsT);
                        i3 = -947832513;
                        C0f9.A0C(i3, A053);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 3:
                A053 = C0f9.A05(-399437716);
                C26798BsM c26798BsM = (C26798BsM) this.A01;
                InterfaceC09390do interfaceC09390do4 = c26798BsM.A02;
                AbstractC25226BEj.A0n(interfaceC09390do4).A06();
                C25531Mh A023 = C28484Chc.A02(c26798BsM.A01);
                if (AbstractC25226BEj.A1Z(A023)) {
                    A023.A0k("ai_creation_advanced_settings_done_button_clicked");
                    A023.Cht();
                }
                AbstractC25226BEj.A0n(interfaceC09390do4).A08();
                AbstractC25231BEo.A0c(c26798BsM.requireActivity(), c26798BsM.A03).A06();
                i3 = -594553303;
                C0f9.A0C(i3, A053);
                return;
            case 4:
                A053 = C0f9.A05(1620865486);
                C26825Bsn c26825Bsn = (C26825Bsn) this.A01;
                C28484Chc A0q3 = AbstractC25226BEj.A0q(c26825Bsn.A02);
                InterfaceC09390do interfaceC09390do5 = c26825Bsn.A04;
                String A03 = C25879Bce.A03(interfaceC09390do5);
                boolean A0L = AbstractC25226BEj.A0n(interfaceC09390do5).A0L();
                boolean A0N = AbstractC25226BEj.A0n(interfaceC09390do5).A0N();
                boolean A0M = AbstractC25226BEj.A0n(interfaceC09390do5).A0M();
                String A024 = C25879Bce.A02(interfaceC09390do5);
                C25531Mh A004 = C28484Chc.A00(A0q3);
                if (AbstractC25226BEj.A1Z(A004)) {
                    A004.A0i(AbstractC25233BEq.A0m(A004, "edit_ai_details_done_clicked", A03));
                    AbstractC25230BEn.A1F(A004, A024, AbstractC25232BEp.A1F("is_name_changed", String.valueOf(A0M), AbstractC166987dD.A1L("is_description_changed", String.valueOf(A0L)), AbstractC166987dD.A1L("is_tagline_changed", String.valueOf(A0N))));
                }
                C27271C1v c27271C1v = AbstractC25226BEj.A0n(interfaceC09390do5).A00;
                c27271C1v.A0W.Egh(c27271C1v.A0b.getValue());
                AbstractC25231BEo.A0c(c26825Bsn.requireActivity(), c26825Bsn.A03).A06();
                i3 = -171471509;
                C0f9.A0C(i3, A053);
                return;
            case 5:
                A053 = C0f9.A05(1934772710);
                C26825Bsn c26825Bsn2 = (C26825Bsn) this.A01;
                C28484Chc A0q4 = AbstractC25226BEj.A0q(c26825Bsn2.A02);
                InterfaceC09390do interfaceC09390do6 = c26825Bsn2.A04;
                String A032 = C25879Bce.A03(interfaceC09390do6);
                boolean A0L2 = AbstractC25226BEj.A0n(interfaceC09390do6).A0L();
                boolean A0N2 = AbstractC25226BEj.A0n(interfaceC09390do6).A0N();
                boolean A0M2 = AbstractC25226BEj.A0n(interfaceC09390do6).A0M();
                String A025 = C25879Bce.A02(interfaceC09390do6);
                C25531Mh A005 = C28484Chc.A00(A0q4);
                if (AbstractC25226BEj.A1Z(A005)) {
                    A005.A0i(AbstractC25233BEq.A0m(A005, "edit_ai_details_next_clicked", A032));
                    AbstractC25230BEn.A1F(A005, A025, AbstractC25232BEp.A1F("is_name_changed", String.valueOf(A0M2), AbstractC166987dD.A1L("is_description_changed", String.valueOf(A0L2)), AbstractC166987dD.A1L("is_tagline_changed", String.valueOf(A0N2))));
                }
                AbstractC25229BEm.A18(new C26781Bs4(), AbstractC25231BEo.A0c(c26825Bsn2.requireActivity(), c26825Bsn2.A03));
                i3 = -1659629927;
                C0f9.A0C(i3, A053);
                return;
            case 6:
                A05 = C0f9.A05(573539312);
                C26813Bsb c26813Bsb = (C26813Bsb) this.A01;
                C29909DGx A01 = C29909DGx.A01(c26813Bsb, 39);
                C26008Bew A006 = C25878Bcd.A00(c26813Bsb.A05);
                if (A006 != null) {
                    boolean z = A006.A05;
                    boolean z2 = A006.A06;
                    if (z && z2) {
                        InterfaceC09390do interfaceC09390do7 = c26813Bsb.A02;
                        C25531Mh A026 = C28484Chc.A02(interfaceC09390do7);
                        if (AbstractC25226BEj.A1Z(A026)) {
                            A026.A0k("thread_view_add_instruction_submit_for_review_dialog_shown");
                            A026.Cht();
                        }
                        CCf.A00(c26813Bsb.requireContext(), AbstractC25226BEj.A0q(interfaceC09390do7), "in_thread_instruction", C29909DGx.A01(A01, 42));
                        i = -1490510465;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                A01.invoke();
                i = -1490510465;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A053 = C0f9.A05(-27436148);
                C26799BsN c26799BsN = (C26799BsN) this.A01;
                C28484Chc A0q5 = AbstractC25226BEj.A0q(c26799BsN.A01);
                InterfaceC09390do interfaceC09390do8 = c26799BsN.A03;
                String A027 = C25878Bcd.A02(interfaceC09390do8);
                C25531Mh A007 = C28484Chc.A00(A0q5);
                if (AbstractC25226BEj.A1Z(A007)) {
                    A007.A0i(AbstractC25233BEq.A0m(A007, "settings_main_screen_edit_profile_picture_screen_done_clicked", A027));
                    A007.Cht();
                }
                AiSettingsRepository aiSettingsRepository3 = AbstractC25226BEj.A0o(interfaceC09390do8).A00;
                Object value6 = aiSettingsRepository3.A0W.getValue();
                if (value6 != null) {
                    C26083BgC c26083BgC3 = (C26083BgC) value6;
                    C26035BfO c26035BfO = (C26035BfO) aiSettingsRepository3.A0s.getValue();
                    if (c26035BfO != null && (interfaceC30795DgW = c26035BfO.A01) != null && (interfaceC30795DgW instanceof C26115Bgz)) {
                        String str3 = c26035BfO.A02;
                        if (str3 == null) {
                            str3 = c26083BgC3.A06;
                        }
                        ImageUrl imageUrl3 = ((C26115Bgz) interfaceC30795DgW).A00;
                        if (imageUrl3 != null) {
                            imageUrl = new SimpleImageUrl(imageUrl3);
                        } else {
                            imageUrl = c26083BgC3.A02;
                        }
                        String str4 = c26035BfO.A03;
                        if (str4 == null) {
                            str4 = c26083BgC3.A0B;
                        }
                        A00 = C26083BgC.A00(null, null, c26083BgC3, imageUrl, null, null, null, str3, str4, null, null, null, null, null, null, null, null, null, 16777103, false, false);
                        aiSettingsRepository3.A08.Egh(A00);
                        AiSettingsRepository.A04(aiSettingsRepository3);
                    }
                    AbstractC25226BEj.A1P(c26799BsN);
                    i3 = 1947207812;
                    C0f9.A0C(i3, A053);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 8:
                A053 = C0f9.A05(880668776);
                C26810BsY c26810BsY = (C26810BsY) this.A01;
                C28484Chc A0q6 = AbstractC25226BEj.A0q(c26810BsY.A00);
                InterfaceC09390do interfaceC09390do9 = c26810BsY.A03;
                String A033 = C25879Bce.A03(interfaceC09390do9);
                String A028 = C25879Bce.A02(interfaceC09390do9);
                C25531Mh A008 = C28484Chc.A00(A0q6);
                if (AbstractC25226BEj.A1Z(A008)) {
                    AbstractC25229BEm.A1C(A008, AbstractC25233BEq.A0m(A008, "creation_preparation_screen_dismiss_clicked", A033), A028);
                }
                AbstractC25226BEj.A0r(c26810BsY.A01).A09(AbstractC111324zv.A00(1906));
                AbstractC33649Etz.A00(c26810BsY.requireActivity(), "ugc_ai_creation");
                AbstractC25226BEj.A0n(interfaceC09390do9).A0A();
                AbstractC25231BEo.A16(c26810BsY);
                i3 = 1379034472;
                C0f9.A0C(i3, A053);
                return;
            case 9:
                A054 = C0f9.A05(1081591600);
                C26807BsV c26807BsV = (C26807BsV) this.A01;
                C28484Chc A0q7 = AbstractC25226BEj.A0q(c26807BsV.A02);
                String A152 = AbstractC25225BEi.A15(c26807BsV.A03);
                InterfaceC09390do interfaceC09390do10 = c26807BsV.A05;
                A0q7.A0S(A152, C25878Bcd.A02(interfaceC09390do10), "advanced_settings_editing");
                C25878Bcd A0o3 = AbstractC25226BEj.A0o(interfaceC09390do10);
                C05A c05a3 = A0o3.A02;
                Object value7 = c05a3.getValue();
                if (value7 != null) {
                    C26072Bg1 c26072Bg14 = (C26072Bg1) value7;
                    Object value8 = A0o3.A06.getValue();
                    if (value8 != null) {
                        C26008Bew c26008Bew2 = (C26008Bew) value8;
                        int i6 = c26008Bew2.A00;
                        List list4 = c26072Bg14.A04;
                        if (i6 == -1) {
                            A0U2 = AbstractC001800i.A0T(c26008Bew2.A01, list4);
                        } else {
                            A0U2 = AbstractC001800i.A0U(list4);
                            A0U2.set(i6, c26008Bew2.A01);
                        }
                        C26072Bg1 c26072Bg15 = (C26072Bg1) c05a3.getValue();
                        if (c26072Bg15 != null) {
                            obj4 = C26072Bg1.A01(c26072Bg15, A0U2);
                        } else {
                            obj4 = null;
                        }
                        c05a3.Egh(obj4);
                        AbstractC25226BEj.A1P(c26807BsV);
                        i4 = -1293506558;
                        C0f9.A0C(i4, A054);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 10:
                A054 = C0f9.A05(1611465962);
                C26826Bso c26826Bso = (C26826Bso) this.A01;
                C25531Mh A029 = C28484Chc.A02(c26826Bso.A01);
                if (AbstractC25226BEj.A1Z(A029)) {
                    A029.A0k("settings_main_screen_insights_clicked");
                    A029.Cht();
                }
                C66277U6x A012 = C66277U6x.A01("com.instagram.insights.account.ai_studio_breakout.container", AbstractC167017dG.A0r("target_id", AbstractC153636vY.A01(c26826Bso.requireArguments(), "persona_id")));
                InterfaceC09390do interfaceC09390do11 = c26826Bso.A02;
                C72743Nv A0210 = W6d.A02(new IgBloksScreenConfig(AbstractC166987dD.A0o(interfaceC09390do11)), A012);
                C140966Yy A0j = AbstractC25233BEq.A0j(c26826Bso, interfaceC09390do11);
                A0j.A0D(A0210);
                A0j.A04();
                i4 = 38822409;
                C0f9.A0C(i4, A054);
                return;
            case 11:
                A054 = C0f9.A05(1325281930);
                C26803BsR c26803BsR = (C26803BsR) this.A01;
                C28484Chc A0q8 = AbstractC25226BEj.A0q(c26803BsR.A01);
                InterfaceC09390do interfaceC09390do12 = c26803BsR.A04;
                String A034 = C25879Bce.A03(interfaceC09390do12);
                String A0211 = C25879Bce.A02(interfaceC09390do12);
                C25531Mh A009 = C28484Chc.A00(A0q8);
                if (AbstractC25226BEj.A1Z(A009)) {
                    AbstractC25229BEm.A1C(A009, AbstractC25233BEq.A0m(A009, "edit_ai_details_avatar_done_clicked", A034), A0211);
                }
                C27271C1v c27271C1v2 = AbstractC25226BEj.A0n(interfaceC09390do12).A00;
                Object value9 = c27271C1v2.A0b.getValue();
                if (value9 != null) {
                    C26083BgC c26083BgC4 = (C26083BgC) value9;
                    C26035BfO c26035BfO2 = (C26035BfO) c27271C1v2.A0x.getValue();
                    if (c26035BfO2 != null && (interfaceC30795DgW2 = c26035BfO2.A01) != null) {
                        if (interfaceC30795DgW2 instanceof C26115Bgz) {
                            String str5 = c26035BfO2.A02;
                            if (str5 == null) {
                                str5 = c26083BgC4.A06;
                            }
                            ImageUrl imageUrl4 = ((C26115Bgz) interfaceC30795DgW2).A00;
                            if (imageUrl4 != null) {
                                imageUrl2 = new SimpleImageUrl(imageUrl4);
                            } else {
                                imageUrl2 = c26083BgC4.A02;
                            }
                            String str6 = c26035BfO2.A03;
                            if (str6 == null) {
                                str6 = c26083BgC4.A0B;
                            }
                            A002 = C26083BgC.A00(null, null, c26083BgC4, imageUrl2, null, null, null, str5, str6, null, null, null, null, null, null, null, null, null, 16777103, false, false);
                            c27271C1v2.A0C.Egh(A002);
                        }
                        c27271C1v2.A0Y.Egh(null);
                    }
                    AbstractC25226BEj.A1P(c26803BsR);
                    i4 = -1405744310;
                    C0f9.A0C(i4, A054);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A052 = C0f9.A05(592827020);
                C26814Bsc c26814Bsc = (C26814Bsc) this.A01;
                C28484Chc A0q9 = AbstractC25226BEj.A0q(c26814Bsc.A02);
                InterfaceC09390do interfaceC09390do13 = c26814Bsc.A05;
                String A0212 = C25879Bce.A02(interfaceC09390do13);
                C25531Mh A0010 = C28484Chc.A00(A0q9);
                if (AbstractC25226BEj.A1Z(A0010)) {
                    AbstractC25230BEn.A1E(A0010, "ai_custom_creation_screen_next_clicked", A0212);
                }
                InterfaceC09390do interfaceC09390do14 = c26814Bsc.A03;
                boolean A06 = C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do14, 0), 36330101860221632L);
                C25879Bce A0n2 = AbstractC25226BEj.A0n(interfaceC09390do13);
                if (A06) {
                    C27271C1v c27271C1v3 = A0n2.A00;
                    C19L c19l = ((C4A7) c27271C1v3).A01;
                    UserSession userSession = c27271C1v3.A03;
                    CNO.A00.Egh(EnumC27375C6e.A04);
                    AbstractC166987dD.A1Z(new MCH(AbstractC40691uc.A01(userSession), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "AiStudioPersonalityQuizQuery", AbstractC25225BEi.A0b().getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), QpV.class, false, null, 0, null, AbstractC43591JPw.A00(497), AbstractC166987dD.A1E()), (InterfaceC23621Ds) null, 18), c19l);
                    C140966Yy A0j2 = AbstractC25233BEq.A0j(c26814Bsc, interfaceC09390do14);
                    A0j2.A0B(null, new C26697Bqe());
                    A0j2.A08();
                    A0j2.A04();
                } else {
                    String str7 = (String) A0n2.A0M.getValue();
                    C25879Bce A0n3 = AbstractC25226BEj.A0n(interfaceC09390do13);
                    C14360o3.A0B(str7, 0);
                    A0n3.A00.A07(null, str7, null, A0n3.A02, null, null, null, false);
                    AbstractC25226BEj.A0n(interfaceC09390do13).A00.A0B.Egh(str7);
                    if (AbstractC28459ChB.A04(AbstractC166987dD.A0r(interfaceC09390do14))) {
                        AbstractC25226BEj.A0n(interfaceC09390do13).A05.Egh(new C26061Bfo((InterfaceC30793DgU) null, (InterfaceC30794DgV) C29085CsC.A00, (InterfaceC30795DgW) C29087CsE.A00, (InterfaceC30796DgX) C29088CsF.A00, str7, (String) null, (String) null, (String) null, (List) null, 1008, false));
                        C140966Yy A0j3 = AbstractC25233BEq.A0j(c26814Bsc, interfaceC09390do14);
                        A0j3.A0B(null, new C26824Bsm());
                        A0j3.A08();
                        A0j3.A04();
                    } else {
                        C140966Yy A0j4 = AbstractC25233BEq.A0j(c26814Bsc, interfaceC09390do14);
                        A0j4.A0B(null, new C26825Bsn());
                        A0j4.A08();
                        A0j4.A04();
                    }
                }
                i2 = -2010375278;
                C0f9.A0C(i2, A052);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A054 = C0f9.A05(1826006854);
                C26779Bs0.A01((C26779Bs0) this.A01);
                i4 = -1306693463;
                C0f9.A0C(i4, A054);
                return;
            case 14:
                A054 = C0f9.A05(-290611571);
                C26818Bsg c26818Bsg = (C26818Bsg) this.A01;
                C28370CfW A0p = AbstractC25226BEj.A0p(c26818Bsg.A00);
                C25531Mh A0011 = C28370CfW.A00(A0p);
                if (AbstractC25226BEj.A1Z(A0011)) {
                    A0011.A0k("your_ais_create_header_button_clicked");
                    C28370CfW.A01(A0011, A0p);
                }
                C26818Bsg.A00(c26818Bsg, AbstractC166987dD.A0r(c26818Bsg.A03), "your_ais_top_right_create");
                i4 = 1424358577;
                C0f9.A0C(i4, A054);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(-1194387070);
                C05A c05a4 = ((C25877Bcc) ((C26822Bsk) this.A01).A06.getValue()).A0E;
                do {
                    value = c05a4.getValue();
                } while (!c05a4.AIi(value, C26057Bfk.A00(null, (C26057Bfk) value, null, null, 247, false, !r5.A07)));
                i = 109542831;
                C0f9.A0C(i, A05);
                return;
            case 16:
                A054 = C0f9.A05(-1773942020);
                C26822Bsk.A02((C26822Bsk) this.A01);
                i4 = -835639702;
                C0f9.A0C(i4, A054);
                return;
            case 17:
                A054 = C0f9.A05(1258375065);
                FragmentActivity activity = ((Fragment) this.A01).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                i4 = 758596201;
                C0f9.A0C(i4, A054);
                return;
            case 18:
                A054 = C0f9.A05(1269782436);
                AbstractC166987dD.A1Y(this.A01);
                i4 = -1031276218;
                C0f9.A0C(i4, A054);
                return;
            case Process.SIGSTOP /* 19 */:
                A054 = C0f9.A05(-2119031912);
                AbstractC166987dD.A1Y(this.A01);
                i4 = -1323843876;
                C0f9.A0C(i4, A054);
                return;
            case 20:
                A05 = C0f9.A05(-1575004370);
                Iterator it = ((CommentActionsMultiSelect) this.A01).A00.iterator();
                while (it.hasNext()) {
                    ((C25814BbV) it.next()).A0P(C29120Csl.A00);
                }
                i = -922442157;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(1919709700);
                Iterator it2 = ((CommentActionsMultiSelect) this.A01).A00.iterator();
                while (it2.hasNext()) {
                    ((C25814BbV) it2.next()).A0P(C29118Csj.A00);
                }
                i = -276431426;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A05 = C0f9.A05(195192282);
                Iterator it3 = ((CommentActionsMultiSelect) this.A01).A00.iterator();
                while (it3.hasNext()) {
                    ((C25814BbV) it3.next()).A0P(new C9B6(false, 0));
                }
                i = -1510133173;
                C0f9.A0C(i, A05);
                return;
            case 23:
                A054 = C0f9.A05(-928158086);
                ((Activity) this.A01).onBackPressed();
                i4 = 1034528815;
                C0f9.A0C(i4, A054);
                return;
            case 24:
                A054 = C0f9.A05(-1839959627);
                C25814BbV c25814BbV2 = (C25814BbV) this.A01;
                C28238Cci.A00.A00(c25814BbV2.A0E);
                c25814BbV2.A0A.A0D();
                AbstractC166997dE.A1Y(c25814BbV2.A0Q, false);
                i4 = -1759465305;
                C0f9.A0C(i4, A054);
                return;
            case 25:
                A054 = C0f9.A05(1496340067);
                C26613BpA c26613BpA = (C26613BpA) this.A01;
                UserSession userSession2 = c26613BpA.A04;
                if (C18U.A06(AbstractC166997dE.A0U(userSession2), userSession2, 36320322219352426L) && (c25814BbV = c26613BpA.A02) != null) {
                    c25814BbV.A0F();
                }
                i4 = -144552698;
                C0f9.A0C(i4, A054);
                return;
            case 26:
                A054 = C0f9.A05(-1539932584);
                C26614BpB c26614BpB = (C26614BpB) this.A01;
                C25814BbV c25814BbV3 = c26614BpB.A01;
                if (c25814BbV3 != null) {
                    c25814BbV3.A0j(String.valueOf(c26614BpB.A00), c26614BpB.A04, false, c26614BpB.A03);
                }
                i4 = -1221198641;
                C0f9.A0C(i4, A054);
                return;
            case 27:
                A054 = C0f9.A05(54222715);
                C26604Bp1 c26604Bp1 = (C26604Bp1) this.A01;
                UserSession userSession3 = c26604Bp1.A03;
                C26950Bur c26950Bur = c26604Bp1.A00;
                C8V c8v = C8V.FEED;
                InterfaceC11380iw interfaceC11380iw = c26604Bp1.A02;
                AbstractC167017dG.A1N(userSession3, c26950Bur);
                C14360o3.A0B(interfaceC11380iw, 4);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession3), "cross_app_feedback_tap");
                if (A0f.isSampled()) {
                    A0f.AAP("feedback_surface", "IG_PRODUCER_COMMENTS_ROW");
                    AbstractC25225BEi.A1N(A0f, AbstractC25234BEr.A0e(c8v, A0f, AbstractC167027dH.A03(c26950Bur.A02)));
                    A0f.A9K("th_comment_count", Long.valueOf(c26950Bur.A00));
                    A0f.Cht();
                }
                c26604Bp1.A01.A0N.Egh(new C167137dS(c26950Bur.A01, c26950Bur.A03));
                i4 = -1056042435;
                C0f9.A0C(i4, A054);
                return;
            case 28:
                A054 = C0f9.A05(-763519901);
                C26610Bp7 c26610Bp7 = (C26610Bp7) this.A01;
                C25814BbV c25814BbV4 = c26610Bp7.A02;
                if (c25814BbV4 != null) {
                    c25814BbV4.A0O(c26610Bp7.A01);
                }
                i4 = 1818971199;
                C0f9.A0C(i4, A054);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A054 = C0f9.A05(1299632687);
                C26750BrX.A02((C26750BrX) this.A01);
                i4 = -127741661;
                C0f9.A0C(i4, A054);
                return;
            case 30:
                A054 = C0f9.A05(805783463);
                C26863BtP c26863BtP = (C26863BtP) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c26863BtP.A09);
                InterfaceC09390do interfaceC09390do15 = c26863BtP.A03;
                String str8 = AbstractC25228BEl.A0v(interfaceC09390do15).A0F;
                String str9 = AbstractC25228BEl.A0v(interfaceC09390do15).A0E;
                String str10 = AbstractC25228BEl.A0v(interfaceC09390do15).A0C;
                LJe.A01(c26863BtP, A0r, new C45000Jvq(EnumC25577BSp.REPLACE, AbstractC25228BEl.A0v(interfaceC09390do15).A04, null, Integer.valueOf(AbstractC25228BEl.A0v(interfaceC09390do15).A01), ((ContentNotesImmersiveSelfNoteContent) interfaceC09390do15.getValue()).A00.A02, str8, str9, str10, AbstractC25228BEl.A0v(interfaceC09390do15).A0D, AbstractC25228BEl.A0v(interfaceC09390do15).A0I, ((ContentNotesImmersiveSelfNoteContent) interfaceC09390do15.getValue()).A00.A05, null, true));
                AbstractC25233BEq.A14(c26863BtP);
                i4 = -1343928328;
                C0f9.A0C(i4, A054);
                return;
            case 31:
                A054 = C0f9.A05(-1833400598);
                AbstractC25233BEq.A14((Fragment) this.A01);
                i4 = 1863574696;
                C0f9.A0C(i4, A054);
                return;
            case 32:
                A054 = C0f9.A05(2073089302);
                C26867BtT c26867BtT = (C26867BtT) this.A01;
                InterfaceC30992Djr interfaceC30992Djr = c26867BtT.A00;
                if (interfaceC30992Djr != null) {
                    interfaceC30992Djr.Dap();
                    AbstractC12990ll A0o4 = AbstractC166987dD.A0o(c26867BtT.A07);
                    String A153 = AbstractC25225BEi.A15(c26867BtT.A02);
                    EnumC25577BSp enumC25577BSp = (EnumC25577BSp) c26867BtT.A04.getValue();
                    String A154 = AbstractC25225BEi.A15(c26867BtT.A05);
                    AbstractC167017dG.A1N(A0o4, A153);
                    C14360o3.A0B(A154, 3);
                    InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0o4), "instagram_media_note_production_nux_try_it_click_client");
                    if (A0f2.isSampled()) {
                        AbstractC25231BEo.A17(A0f2, A154, A153);
                        A0f2.A8R(enumC25577BSp, "event_source");
                        A0f2.Cht();
                    }
                }
                i4 = -996389568;
                C0f9.A0C(i4, A054);
                return;
            case 33:
                A054 = C0f9.A05(-1766235252);
                InterfaceC30992Djr interfaceC30992Djr2 = ((C26867BtT) this.A01).A00;
                if (interfaceC30992Djr2 != null) {
                    interfaceC30992Djr2.DjX();
                }
                i4 = -510060710;
                C0f9.A0C(i4, A054);
                return;
            case 34:
                A054 = C0f9.A05(-1226890064);
                AbstractC25233BEq.A14((Fragment) this.A01);
                i4 = -637976850;
                C0f9.A0C(i4, A054);
                return;
            case 35:
                A054 = C0f9.A05(1192174033);
                Fragment fragment = (Fragment) this.A01;
                fragment.requireActivity().setResult(-1);
                AbstractC25233BEq.A14(fragment);
                i4 = 1617206582;
                C0f9.A0C(i4, A054);
                return;
            case 36:
                A054 = C0f9.A05(932667763);
                ((C25865BcK) ((C214729fA) this.A01).A0A.getValue()).A01(C29225CuU.A00);
                i4 = -2119116620;
                C0f9.A0C(i4, A054);
                return;
            case 37:
                A054 = C0f9.A05(348535465);
                ((C25865BcK) ((C214729fA) this.A01).A0A.getValue()).A01(C29225CuU.A00);
                i4 = 1889310536;
                C0f9.A0C(i4, A054);
                return;
            case 38:
                A054 = C0f9.A05(-1791303813);
                AbstractC41776Ies.A03(((Fragment) this.A01).requireContext(), "https://help.instagram.com/503708446705527/?helpref=uf_share");
                i4 = -848882299;
                C0f9.A0C(i4, A054);
                return;
            case 39:
                A054 = C0f9.A05(-1291575766);
                AbstractC166987dD.A1Y(this.A01);
                i4 = -1026002561;
                C0f9.A0C(i4, A054);
                return;
            case 40:
                A054 = C0f9.A05(-1219131724);
                AbstractC25226BEj.A0x(((C26820Bsi) this.A01).A03).A01();
                i4 = -815146342;
                C0f9.A0C(i4, A054);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A054 = C0f9.A05(30747406);
                AbstractC166987dD.A1Y(((C51760Mtj) ((C26189BiF) this.A01).A01).A01);
                i4 = 609362805;
                C0f9.A0C(i4, A054);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A054 = C0f9.A05(1169160151);
                F1A.A00().A00();
                C26756Brd c26756Brd = (C26756Brd) this.A01;
                Object value10 = c26756Brd.A02.getValue();
                C26753Bra c26753Bra = new C26753Bra();
                AbstractC25233BEq.A15(c26753Bra, "entrypoint", value10);
                C140966Yy A0c = AbstractC25231BEo.A0c(c26756Brd.requireActivity(), c26756Brd.A04);
                A0c.A08();
                A0c.A0D(c26753Bra);
                A0c.A04();
                i4 = -218973307;
                C0f9.A0C(i4, A054);
                return;
            case 43:
                A054 = C0f9.A05(1193993119);
                C26815Bsd c26815Bsd = (C26815Bsd) this.A01;
                C28171CbI c28171CbI = (C28171CbI) c26815Bsd.A04.getValue();
                String A155 = AbstractC25225BEi.A15(c26815Bsd.A02);
                String A156 = AbstractC25225BEi.A15(c26815Bsd.A01);
                boolean A1Z = AbstractC167007dF.A1Z(c26815Bsd.A03);
                AbstractC167017dG.A1N(A155, A156);
                C28171CbI.A00(c28171CbI, "cancel_fan_onboarding_nux", A155, A156, A1Z);
                ((C25848Bc3) c26815Bsd.A06.getValue()).A00();
                AbstractC25231BEo.A16(c26815Bsd);
                i4 = -471095349;
                C0f9.A0C(i4, A054);
                return;
            case 44:
                A05 = C0f9.A05(-58286751);
                C26815Bsd c26815Bsd2 = (C26815Bsd) this.A01;
                C28171CbI c28171CbI2 = (C28171CbI) c26815Bsd2.A04.getValue();
                String A157 = AbstractC25225BEi.A15(c26815Bsd2.A02);
                String A158 = AbstractC25225BEi.A15(c26815Bsd2.A01);
                boolean A1Z2 = AbstractC167007dF.A1Z(c26815Bsd2.A03);
                boolean A1a = AbstractC167017dG.A1a(A157, A158);
                C28171CbI.A00(c28171CbI2, "accept_fan_onboarding_nux", A157, A158, A1Z2);
                C25848Bc3 c25848Bc3 = (C25848Bc3) c26815Bsd2.A06.getValue();
                CreatorAIFanNuxRepository creatorAIFanNuxRepository = c25848Bc3.A00;
                String str11 = c25848Bc3.A01;
                if (creatorAIFanNuxRepository.A00 != A1a) {
                    creatorAIFanNuxRepository.A00 = A1a ? 1 : 0;
                    C2JM A0b = AbstractC25225BEi.A0b();
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, Boolean.valueOf(A1a), "did_accept");
                    C0CA.A00(A0T, "BETA_02_24", "terms_type");
                    C0CA.A00(A0T, str11, "creator_igid");
                    A0b.A00.A02().A0E(A0T, "data");
                    D53.A03(AbstractC28916CpQ.A00(A0b, A0b2), creatorAIFanNuxRepository, ((C4A7) creatorAIFanNuxRepository).A01, 11);
                }
                AbstractC25231BEo.A16(c26815Bsd2);
                i = -379054066;
                C0f9.A0C(i, A05);
                return;
            case 45:
                A054 = C0f9.A05(804377419);
                C26815Bsd c26815Bsd3 = (C26815Bsd) this.A01;
                AbstractC12990ll A0o5 = AbstractC166987dD.A0o(c26815Bsd3.A05);
                C14360o3.A0B(A0o5, 0);
                C189448aO A0y = AbstractC25225BEi.A0y(A0o5);
                A0y.A1C = false;
                A0y.A00().A02(c26815Bsd3.requireActivity(), new C26858BtK());
                i4 = 1124917825;
                C0f9.A0C(i4, A054);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A054 = C0f9.A05(-830988628);
                C26752BrZ c26752BrZ = (C26752BrZ) this.A01;
                new BP5(AbstractC166987dD.A0r(c26752BrZ.A00), null).A03(C8p.A0Z);
                c26752BrZ.requireActivity().getOnBackPressedDispatcher().A04();
                i4 = -154862053;
                C0f9.A0C(i4, A054);
                return;
            case 47:
                A054 = C0f9.A05(299900922);
                C26771Brs c26771Brs = (C26771Brs) this.A01;
                C25867BcM c25867BcM = (C25867BcM) c26771Brs.A08.getValue();
                c25867BcM.A05 = false;
                C25867BcM.A00(c25867BcM);
                AbstractC13880nE.A0K(c26771Brs.requireActivity());
                i4 = -1978218943;
                C0f9.A0C(i4, A054);
                return;
            case 48:
                A054 = C0f9.A05(55495716);
                C7VL.A00((C7VL) this.A01).onContainerExpanded(false);
                i4 = -1961069874;
                C0f9.A0C(i4, A054);
                return;
            case 49:
                A05 = C0f9.A05(1009863522);
                C7VL c7vl = (C7VL) this.A01;
                C7VL.A00(c7vl).onEditTapped();
                List list5 = (List) ((C38688GzT) C7VL.A00(c7vl).uiState.getValue()).A02;
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj5 : list5) {
                    AbstractC25228BEl.A1Q(obj5, A1E, AbstractC001900j.A0T((String) obj5) ? 1 : 0);
                }
                c7vl.A0F.invoke(AbstractC25226BEj.A1H(" ", A1E, null));
                c7vl.A0E.invoke();
                i = -1184872941;
                C0f9.A0C(i, A05);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A05 = C0f9.A05(-1279939130);
                C7VL c7vl2 = (C7VL) this.A01;
                Iterator A1J = AbstractC25226BEj.A1J(((C38688GzT) C7VL.A00(c7vl2).uiState.getValue()).A02);
                while (A1J.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(A1J);
                    if (AbstractC25225BEi.A1Y(A1B)) {
                        c7vl2.A0G.invoke(A1B);
                    }
                }
                C7VL.A00(c7vl2).onSendTapped();
                i = -577035334;
                C0f9.A0C(i, A05);
                return;
            case 51:
                A054 = C0f9.A05(-741069518);
                C7VL.A00((C7VL) this.A01).refreshResponses();
                i4 = -63750327;
                C0f9.A0C(i4, A054);
                return;
            case 52:
                A054 = C0f9.A05(770300334);
                C7VL.A00((C7VL) this.A01).cancel();
                i4 = 357523537;
                C0f9.A0C(i4, A054);
                return;
            case 53:
                A054 = C0f9.A05(-1414674747);
                C7VL c7vl3 = (C7VL) this.A01;
                C140966Yy A0r2 = AbstractC25225BEi.A0r(c7vl3.A0B.requireActivity(), ((C7VI) c7vl3).A00.A00);
                C45471KBg c45471KBg = new C45471KBg();
                c45471KBg.setArguments(AbstractC167017dG.A0T("logging_context", C7VL.A00(c7vl3).getLoggingContext(), AbstractC166987dD.A1L("entrypoint", "sr_header")));
                AbstractC25229BEm.A18(c45471KBg, A0r2);
                i4 = 582001201;
                C0f9.A0C(i4, A054);
                return;
            case 54:
                A054 = C0f9.A05(-1928134790);
                C26800BsO c26800BsO = (C26800BsO) this.A01;
                AbstractC34910FZw.A00(c26800BsO.requireActivity(), AbstractC166987dD.A0r(c26800BsO.A02), AbstractC111324zv.A00(2468));
                i4 = -1235232887;
                C0f9.A0C(i4, A054);
                return;
            case 55:
                A054 = C0f9.A05(-1090223260);
                AbstractC25225BEi.A1U(this.A01, view);
                i4 = -629711690;
                C0f9.A0C(i4, A054);
                return;
            case 56:
                A054 = C0f9.A05(1479320419);
                AbstractC25226BEj.A1Q((Fragment) this.A01);
                i4 = -1209328082;
                C0f9.A0C(i4, A054);
                return;
            case 57:
                A054 = C0f9.A05(-1482300047);
                C26819Bsh c26819Bsh = (C26819Bsh) this.A01;
                C35156Fey.A00(c26819Bsh.requireActivity(), C22P.A2A, c26819Bsh, AbstractC166987dD.A0r(c26819Bsh.A07));
                i4 = 244768093;
                C0f9.A0C(i4, A054);
                return;
            case 58:
                A05 = C0f9.A05(-1704231036);
                C26762Brj c26762Brj = (C26762Brj) this.A01;
                InterfaceC09390do interfaceC09390do16 = c26762Brj.A02;
                String A159 = AbstractC25225BEi.A15(interfaceC09390do16);
                C14360o3.A0B(A159, 0);
                String str12 = ValuePropsFlow.A06.A00;
                if (A159.equals(str12)) {
                    num = C05F.A00;
                } else if (A159.equals(ValuePropsFlow.A0B.A00)) {
                    num = C05F.A01;
                } else if (A159.equals(ValuePropsFlow.A05.A00)) {
                    num = C05F.A0C;
                } else if (A159.equals(ValuePropsFlow.A07.A00)) {
                    num = C05F.A0N;
                } else {
                    throw AbstractC166987dD.A12("Unsupported flow type for learn more link");
                }
                switch (num.intValue()) {
                    case 0:
                        str2 = "https://creators.instagram.com/earn-money/instagram-bonuses";
                        break;
                    case 1:
                        str2 = "https://help.instagram.com/478012211024479";
                        break;
                    case 2:
                        str2 = "https://creators.instagram.com/earn-money/badges";
                        break;
                    default:
                        str2 = "https://creators.instagram.com/earn-money/branded-content";
                        break;
                }
                String A1510 = AbstractC25225BEi.A15(interfaceC09390do16);
                C14360o3.A0B(A1510, 0);
                if (A1510.equals(str12)) {
                    c2Fb = C2Fb.A0W;
                } else if (A1510.equals(ValuePropsFlow.A0B.A00)) {
                    c2Fb = C2Fb.A1n;
                } else if (A1510.equals(ValuePropsFlow.A05.A00)) {
                    c2Fb = C2Fb.A0P;
                } else if (A1510.equals(ValuePropsFlow.A07.A00)) {
                    c2Fb = C2Fb.A1S;
                } else {
                    throw AbstractC166987dD.A12("Unsupported flow type for learn more link");
                }
                Context context = c26762Brj.getContext();
                if (context != null) {
                    new C63397SjR(context, AbstractC166987dD.A0r(c26762Brj.A03), c2Fb, str2, false).A0A();
                    i = -1666932255;
                    C0f9.A0C(i, A05);
                    return;
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0C(2119866891, A05);
                    throw A0g;
                }
            case 59:
                A05 = C0f9.A05(-157256126);
                C26762Brj c26762Brj2 = (C26762Brj) this.A01;
                UserSession A0r3 = AbstractC166987dD.A0r(c26762Brj2.A03);
                InterfaceC09390do interfaceC09390do17 = c26762Brj2.A02;
                ValuePropsFlow valuePropsFlow = (ValuePropsFlow) ValuePropsFlow.A01.get(interfaceC09390do17.getValue());
                if (valuePropsFlow == null) {
                    valuePropsFlow = ValuePropsFlow.A0C;
                }
                AbstractC28393Cfw.A03(A0r3, AbstractC28393Cfw.A00(valuePropsFlow), "conversion_cta");
                C25845Bc0 A0w = AbstractC25225BEi.A0w(c26762Brj2.A04);
                FragmentActivity activity2 = c26762Brj2.getActivity();
                String A1511 = AbstractC25225BEi.A15(interfaceC09390do17);
                C14360o3.A0B(A1511, 1);
                if (activity2 != null) {
                    AbstractC155756z4.A00().A01();
                    String A0012 = AbstractC111324zv.A00(4213);
                    Bundle A0b3 = AbstractC166987dD.A0b();
                    A0b3.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A0012);
                    A0b3.putString(A0012, A1511);
                    CategorySearchFragment categorySearchFragment = new CategorySearchFragment();
                    categorySearchFragment.setArguments(A0b3);
                    C140966Yy A0r4 = AbstractC25225BEi.A0r(activity2, A0w.A07);
                    A0r4.A0D(categorySearchFragment);
                    A0r4.A04();
                }
                i = 1494383072;
                C0f9.A0C(i, A05);
                return;
            case 60:
                A05 = C0f9.A05(-625501417);
                C26784Bs8 c26784Bs8 = (C26784Bs8) this.A01;
                C25860BcF c25860BcF = (C25860BcF) c26784Bs8.A04.getValue();
                Object value11 = c25860BcF.A03.getValue();
                if (value11 != null && c25860BcF.A01 != null) {
                    D53.A03(value11, c25860BcF, AbstractC141776au.A00(c25860BcF), 46);
                }
                AbstractC25233BEq.A14(c26784Bs8);
                i = 210792009;
                C0f9.A0C(i, A05);
                return;
            case 61:
                A054 = C0f9.A05(65652070);
                CT5 ct5 = (CT5) this.A01;
                ct5.A02.invoke(ct5.A00.A04);
                ct5.A01.setChecked(true);
                i4 = -781654834;
                C0f9.A0C(i4, A054);
                return;
            case 62:
                A054 = C0f9.A05(-976228318);
                C26170Bhv c26170Bhv = (C26170Bhv) this.A01;
                c26170Bhv.A01.invoke(c26170Bhv.A00);
                i4 = -1898395759;
                C0f9.A0C(i4, A054);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A05 = C0f9.A05(539009201);
                EJB ejb = (EJB) this.A01;
                C34924FaA c34924FaA = ejb.A01;
                if (c34924FaA == null) {
                    str = "logger";
                } else {
                    C6MK c6mk = ejb.A00;
                    if (c6mk != null) {
                        C34924FaA.A00(c34924FaA, "inbox_folders_add_chats_screen_save_click", AbstractC167007dF.A0n("count", String.valueOf(c6mk.size())));
                        InterfaceC16660sJ interfaceC16660sJ = ejb.A03;
                        if (interfaceC16660sJ == null) {
                            str = "onThreadsSelected";
                        } else {
                            C6MK c6mk2 = ejb.A00;
                            if (c6mk2 != null) {
                                interfaceC16660sJ.invoke(c6mk2);
                                ejb.requireActivity().getOnBackPressedDispatcher().A04();
                                i = 376659672;
                                C0f9.A0C(i, A05);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F("selectedThreads");
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 64:
                A054 = C0f9.A05(1555623859);
                C25937Bde c25937Bde = (C25937Bde) this.A01;
                int i7 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c25937Bde.A04.invoke();
                i4 = -2033547784;
                C0f9.A0C(i4, A054);
                return;
            case 65:
                A054 = C0f9.A05(990975263);
                C3DN c3dn = (C3DN) this.A01;
                if (c3dn != null) {
                    c3dn.A0B();
                }
                i4 = 75597690;
                C0f9.A0C(i4, A054);
                return;
            case 66:
                A054 = C0f9.A05(2044804116);
                C32314ELd c32314ELd = (C32314ELd) this.A01;
                C140966Yy A0r5 = AbstractC25225BEi.A0r(c32314ELd.requireActivity(), c32314ELd.A0N());
                A0r5.A0D(new C26770Brr());
                A0r5.A0A = AbstractC111324zv.A00(1818);
                A0r5.A08();
                A0r5.A04();
                i4 = -1853765114;
                C0f9.A0C(i4, A054);
                return;
            case 67:
                A054 = C0f9.A05(520374835);
                Bundle A0b4 = AbstractC166987dD.A0b();
                C32314ELd c32314ELd2 = (C32314ELd) this.A01;
                A0b4.putBoolean("memu_enable_tx_il_nux_content", C18U.A06(C06090Tz.A05, c32314ELd2.A0N(), 36325763942987086L));
                C8k c8k = C8k.SETTINGS;
                C26778Brz c26778Brz = new C26778Brz();
                Bundle A0b5 = AbstractC166987dD.A0b();
                A0b5.putString("arg_entry_point", c8k.toString());
                c26778Brz.setArguments(A0b5);
                c26778Brz.setArguments(A0b4);
                C140966Yy A0r6 = AbstractC25225BEi.A0r(c32314ELd2.requireActivity(), c32314ELd2.A0N());
                A0r6.A08();
                A0r6.A0D(c26778Brz);
                A0r6.A04();
                i4 = -621729305;
                C0f9.A0C(i4, A054);
                return;
            case 68:
                A054 = C0f9.A05(280224022);
                C26780Bs3 c26780Bs3 = (C26780Bs3) this.A01;
                AbstractC25228BEl.A0w(c26780Bs3).A02.markerPoint(834879336, "thread_list_done_click");
                FragmentActivity activity3 = c26780Bs3.getActivity();
                if (activity3 != null && (onBackPressedDispatcher = activity3.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.A04();
                }
                i4 = -1524355180;
                C0f9.A0C(i4, A054);
                return;
            case 69:
                A054 = C0f9.A05(1095912594);
                C26644Bpf c26644Bpf = (C26644Bpf) this.A01;
                c26644Bpf.A06.invoke(Integer.valueOf(c26644Bpf.A00), c26644Bpf.A03);
                i4 = -96732285;
                C0f9.A0C(i4, A054);
                return;
            case 70:
                A054 = C0f9.A05(-827554218);
                C26644Bpf c26644Bpf2 = (C26644Bpf) this.A01;
                c26644Bpf2.A07.invoke(Integer.valueOf(c26644Bpf2.A00), c26644Bpf2.A03);
                i4 = -1409093969;
                C0f9.A0C(i4, A054);
                return;
            default:
                return;
        }
    }
}
