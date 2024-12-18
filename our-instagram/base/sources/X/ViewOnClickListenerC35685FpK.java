package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.CategorySelectionScreenArgs;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;

/* renamed from: X.FpK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35685FpK implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC35685FpK(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = 69;
        C14360o3.A0B(interfaceC16660sJ, 1);
        this.A01 = interfaceC16660sJ;
    }

    public static ViewOnClickListenerC35685FpK A00(Object obj, int i) {
        return new ViewOnClickListenerC35685FpK(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC35685FpK(obj, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        int A052;
        int i2;
        BottomSheetFragment bottomSheetFragment;
        C189478aR c189478aR;
        BottomSheetFragment bottomSheetFragment2;
        C189478aR c189478aR2;
        int A053;
        int i3;
        String str;
        C38321qM A1e;
        EnumC155676yw enumC155676yw;
        String str2;
        BottomSheetFragment bottomSheetFragment3;
        String str3;
        C57312k6 A00;
        InterfaceC16620sF mcg;
        switch (this.A00) {
            case 0:
                A053 = C0f9.A05(-1933133236);
                C33186EkX c33186EkX = (C33186EkX) this.A01;
                String str4 = c33186EkX.A03;
                if (str4 == null) {
                    str = "prompts";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                AbstractC61765RtK.A00(c33186EkX.getContext(), str4);
                i3 = -2108973194;
                C0f9.A0C(i3, A053);
                return;
            case 1:
                A053 = C0f9.A05(44101265);
                EL5 el5 = (EL5) this.A01;
                AbstractC25229BEm.A18(FVI.A00().A00("content_preview_placeholder"), AbstractC25231BEo.A0c(el5.requireActivity(), el5.A0O));
                i3 = 490834677;
                C0f9.A0C(i3, A053);
                return;
            case 2:
                A053 = C0f9.A05(-539750160);
                ((C31792DyB) ((EOL) this.A01).A03.getValue()).A0F();
                i3 = 812116675;
                C0f9.A0C(i3, A053);
                return;
            case 3:
                A053 = C0f9.A05(135522292);
                EO9 eo9 = (EO9) this.A01;
                InterfaceC09390do interfaceC09390do = eo9.A01;
                C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do);
                AbstractC31172DnG.A1L(eo9, A0g, 2131976502);
                C189478aR A002 = A0g.A00();
                FragmentActivity requireActivity = eo9.requireActivity();
                FVI.A01().A00();
                interfaceC09390do.getValue();
                A002.A02(requireActivity, new EHV());
                i3 = -86939446;
                C0f9.A0C(i3, A053);
                return;
            case 4:
                A053 = C0f9.A05(-1302024322);
                ((C32295EKi) this.A01).onBackPressed();
                i3 = 699779236;
                C0f9.A0C(i3, A053);
                return;
            case 5:
                A053 = C0f9.A05(163227839);
                ((C32085E8j) this.A01).A02.invoke();
                i3 = -369345737;
                C0f9.A0C(i3, A053);
                return;
            case 6:
                A053 = C0f9.A05(-347966440);
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((C32296EKj) this.A01).A09);
                AbstractC166987dD.A1Z(new MBp(A0Z, null, 9), AbstractC141776au.A00(A0Z));
                i3 = -1252624045;
                C0f9.A0C(i3, A053);
                return;
            case 7:
                A053 = C0f9.A05(2020528355);
                EOH eoh = ((EYQ) this.A01).A00;
                EO8 eo8 = new EO8();
                C189448aO A0g2 = AbstractC25231BEo.A0g(eoh.A01);
                AbstractC31172DnG.A1G(AbstractC166997dE.A0N(eoh), A0g2, 2131953626);
                AbstractC31177DnL.A14(eoh, eo8, A0g2);
                i3 = 1305359925;
                C0f9.A0C(i3, A053);
                return;
            case 8:
                A053 = C0f9.A05(2088296417);
                View.OnClickListener onClickListener = ((E91) this.A01).A00;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                i3 = 1698853321;
                C0f9.A0C(i3, A053);
                return;
            case 9:
                A05 = C0f9.A05(-146472408);
                EOG eog = (EOG) this.A01;
                C32941EeM c32941EeM = (C32941EeM) eog.A0B.getValue();
                FragmentActivity requireActivity2 = eog.requireActivity();
                FanClubCategoryType fanClubCategoryType = eog.A00;
                if (fanClubCategoryType == null) {
                    str = "categoryType";
                } else {
                    String str5 = eog.A04;
                    if (str5 == null) {
                        str = "categoryName";
                    } else {
                        eog.A09.getValue();
                        AbstractC35055FcS.A01(c32941EeM.A00, new ChannelCreationFlowExtraArgs(new CategorySelectionScreenArgs(fanClubCategoryType, str5), null, null), ChannelCreationSource.A0D, EnumC33330EoP.A03, false).Cgf(requireActivity2);
                        i = 863198387;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 10:
                A053 = C0f9.A05(33705929);
                C193328hC A0I = AbstractC31171DnF.A0I(((View) this.A01).getContext());
                A0I.A0A(2131974817);
                A0I.A09(2131974816);
                AbstractC31176DnK.A1W(A0I);
                i3 = -1887307174;
                C0f9.A0C(i3, A053);
                return;
            case 11:
                A053 = C0f9.A05(1377009641);
                EOH eoh2 = (EOH) this.A01;
                AbstractC35055FcS.A01(((FanClubMemberListViewModel) eoh2.A02.getValue()).A00, new ChannelCreationFlowExtraArgs(null, null, null), ChannelCreationSource.A0D, EnumC33330EoP.A03, false).Cgf(eoh2.requireActivity());
                i3 = 1306101753;
                C0f9.A0C(i3, A053);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A053 = C0f9.A05(-203855106);
                ELE.A04((ELE) this.A01);
                i3 = 1304779304;
                C0f9.A0C(i3, A053);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A053 = C0f9.A05(-1859097476);
                ELE.A04((ELE) this.A01);
                i3 = 1195577010;
                C0f9.A0C(i3, A053);
                return;
            case 14:
                A053 = C0f9.A05(782762050);
                C31834Dyt.A00((C31834Dyt) this.A01, "eligible");
                i3 = 1031794798;
                C0f9.A0C(i3, A053);
                return;
            case Process.SIGTERM /* 15 */:
                A053 = C0f9.A05(-1953253667);
                C31834Dyt.A00((C31834Dyt) this.A01, AbstractC43591JPw.A00(69));
                i3 = -1114937430;
                C0f9.A0C(i3, A053);
                return;
            case 16:
                A053 = C0f9.A05(-1407661414);
                C31834Dyt.A00((C31834Dyt) this.A01, "not_eligible");
                i3 = 269319470;
                C0f9.A0C(i3, A053);
                return;
            case 17:
                A053 = C0f9.A05(-1748221943);
                C31834Dyt c31834Dyt = (C31834Dyt) this.A01;
                C99694dm c99694dm = c31834Dyt.A01;
                String str6 = c31834Dyt.A00.userId;
                C14360o3.A0B(str6, 1);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c99694dm.A00, "ig_fan_club_creator_settings_subscribe_cta_row_tap");
                AbstractC31178DnM.A17(A0f, str6);
                AbstractC31171DnF.A1I(A0f, "creator_management_settings");
                A0f.Cht();
                AbstractC166987dD.A1Z(new MC2(c31834Dyt, null, 30), AbstractC141776au.A00(c31834Dyt));
                i3 = 1540440048;
                C0f9.A0C(i3, A053);
                return;
            case 18:
                A053 = C0f9.A05(757376353);
                C31834Dyt c31834Dyt2 = (C31834Dyt) this.A01;
                C99694dm c99694dm2 = c31834Dyt2.A01;
                String str7 = c31834Dyt2.A00.userId;
                C14360o3.A0B(str7, 1);
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c99694dm2.A00, "subscription_guided_activation_recommendation_see_all_cta");
                AbstractC31171DnF.A1I(A0f2, "creator_management_settings");
                AbstractC31178DnM.A17(A0f2, str7);
                AbstractC31180DnO.A1I(A0f2, "SETTINGS");
                AbstractC166987dD.A1Z(new MC2(c31834Dyt2, null, 27), AbstractC141776au.A00(c31834Dyt2));
                i3 = 846043276;
                C0f9.A0C(i3, A053);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(-529499549);
                C32248EIh c32248EIh = (C32248EIh) this.A01;
                AbstractC31177DnL.A11(c32248EIh);
                AbstractC25233BEq.A14(c32248EIh);
                InterfaceC37176GZn interfaceC37176GZn = ((AbstractC36266FzJ) C35131FeY.A00(AbstractC166987dD.A0r(c32248EIh.A03))).A00;
                if (interfaceC37176GZn != null) {
                    interfaceC37176GZn.Das();
                }
                i = 324964612;
                C0f9.A0C(i, A05);
                return;
            case 20:
                A05 = C0f9.A05(1793475584);
                C32248EIh c32248EIh2 = (C32248EIh) this.A01;
                AbstractC31177DnL.A11(c32248EIh2);
                AbstractC25233BEq.A14(c32248EIh2);
                InterfaceC37176GZn interfaceC37176GZn2 = ((AbstractC36266FzJ) C35131FeY.A00(AbstractC166987dD.A0r(c32248EIh2.A03))).A00;
                if (interfaceC37176GZn2 != null) {
                    interfaceC37176GZn2.Djb();
                }
                i = -1954208155;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A053 = C0f9.A05(1669908709);
                AbstractC41776Ies.A03(AbstractC31172DnG.A07(this.A01), "https://help.instagram.com/488619974671134");
                i3 = -1203850001;
                C0f9.A0C(i3, A053);
                return;
            case 22:
                A053 = C0f9.A05(-851215400);
                C37840Gku c37840Gku = (C37840Gku) this.A01;
                int i4 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                C38321qM c38321qM = c37840Gku.A00;
                DirectShareTarget directShareTarget = c37840Gku.A02;
                String str8 = null;
                if (directShareTarget == null) {
                    C2EC c2ec = c37840Gku.A0A;
                    if (c2ec != null) {
                        ArrayList A01 = C4GO.A01(c2ec.BSH());
                        directShareTarget = new DirectShareTarget(null, null, null, null, c2ec.C4i(), AbstractC31232DoF.A00(c2ec.C7I(), A01), null, null, null, null, null, null, c2ec.C7l(), null, null, null, null, A01, c2ec.CRD(), false);
                    } else {
                        directShareTarget = null;
                    }
                    c37840Gku.A02 = directShareTarget;
                }
                if (directShareTarget != null && c38321qM != null) {
                    boolean A012 = C35143Fek.A00.A01(c37840Gku.A09, directShareTarget);
                    if (c38321qM.A5P()) {
                        c37840Gku.A0B.A01(directShareTarget).END(null, null, c38321qM, directShareTarget, null, c37840Gku.A08.getModuleName(), "floating_send_button", null, null, A012);
                    } else {
                        InterfaceC65282xQ interfaceC65282xQ = c37840Gku.A0C;
                        if (interfaceC65282xQ != null && (A1e = c38321qM.A1e(interfaceC65282xQ.BRZ(c38321qM).A03)) != null) {
                            str8 = A1e.getId();
                        }
                        c37840Gku.A0B.A01(directShareTarget).ENj(null, null, new C32068E6u(c37840Gku.A08.getModuleName(), "", A012, false), c38321qM, directShareTarget, null, null, str8, null);
                    }
                }
                i3 = 814462463;
                C0f9.A0C(i3, A053);
                return;
            case 23:
                A05 = C0f9.A05(2007620605);
                E3O e3o = (E3O) this.A01;
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                AbstractC31433Drd abstractC31433Drd = e3o.A00.A00.A03;
                if (abstractC31433Drd != null) {
                    abstractC31433Drd.A0G(true, "see_all_card");
                }
                i = -643123882;
                C0f9.A0C(i, A05);
                return;
            case 24:
                A05 = C0f9.A05(-1987998987);
                E3O e3o2 = (E3O) this.A01;
                int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                AbstractC31433Drd abstractC31433Drd2 = e3o2.A00.A00.A03;
                if (abstractC31433Drd2 != null) {
                    abstractC31433Drd2.A0G(true, "see_all_card");
                }
                i = -609178080;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A053 = C0f9.A05(-1912673118);
                FRD frd = (FRD) this.A01;
                int ordinal = frd.A00.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 1) {
                        frd.A00();
                        V1R.A03(frd.A04.A00);
                        i3 = -1905651658;
                        C0f9.A0C(i3, A053);
                        return;
                    }
                    enumC155676yw = EnumC155676yw.A02;
                } else {
                    enumC155676yw = EnumC155676yw.A03;
                }
                frd.A00 = enumC155676yw;
                V1R.A03(frd.A04.A00);
                i3 = -1905651658;
                C0f9.A0C(i3, A053);
                return;
            case 26:
                A053 = C0f9.A05(59669061);
                ((AbstractC31433Drd) this.A01).A03();
                i3 = 1508530893;
                C0f9.A0C(i3, A053);
                return;
            case 27:
                A053 = C0f9.A05(-1094130254);
                Fragment fragment = (Fragment) this.A01;
                AbstractC35175FfS.A01(fragment.requireContext(), DialogInterfaceOnClickListenerC35453FkA.A00(fragment, 31), new DialogInterfaceOnClickListenerC35450Fk7(17, fragment, fragment, fragment));
                i3 = 2115552228;
                C0f9.A0C(i3, A053);
                return;
            case 28:
                A053 = C0f9.A05(-1427342632);
                AbstractC32317ELg abstractC32317ELg = (AbstractC32317ELg) this.A01;
                Context requireContext = abstractC32317ELg.requireContext();
                AbstractC18680vv abstractC18680vv = abstractC32317ELg.A00;
                String A02 = AbstractC63260SgI.A02(abstractC32317ELg.requireContext(), MSV.A00(31));
                C14360o3.A07(A02);
                AbstractC35175FfS.A02(requireContext, abstractC32317ELg, abstractC18680vv, abstractC32317ELg, A02, abstractC32317ELg.getString(2131957505));
                i3 = -1952786037;
                C0f9.A0C(i3, A053);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A053 = C0f9.A05(1062043471);
                C3DN A013 = C3DN.A00.A01(AbstractC31172DnG.A06(this.A01));
                A013.getClass();
                A013.A0J(new EfB());
                i3 = 1944474643;
                C0f9.A0C(i3, A053);
                return;
            case 30:
                A053 = C0f9.A05(2102579022);
                Context A07 = AbstractC31172DnG.A07(this.A01);
                AbstractC31171DnF.A1O(A07);
                ((Activity) A07).onBackPressed();
                i3 = 770369264;
                C0f9.A0C(i3, A053);
                return;
            case 31:
                A053 = C0f9.A05(2027581355);
                EfB efB = (EfB) this.A01;
                LinearLayout linearLayout = efB.A03;
                if (linearLayout == null) {
                    str = "introLayout";
                } else {
                    linearLayout.setVisibility(8);
                    View view2 = efB.A00;
                    str2 = "followUpScreen";
                    if (view2 != null) {
                        view2.setVisibility(0);
                        View view3 = efB.A00;
                        if (view3 != null) {
                            efB.A06 = AbstractC166987dD.A0e(view3, R.id.allowed_switch_text);
                            View view4 = efB.A00;
                            if (view4 != null) {
                                efB.A05 = AbstractC166997dE.A0T(view4, R.id.allowed_switch_detail);
                                View view5 = efB.A00;
                                if (view5 != null) {
                                    IgdsSwitch igdsSwitch = (IgdsSwitch) view5.findViewById(R.id.manage_data_switch_button);
                                    efB.A08 = igdsSwitch;
                                    str = "switchButton";
                                    if (igdsSwitch != null) {
                                        igdsSwitch.setChecked(efB.A09);
                                        FRA fra = efB.A07;
                                        if (fra != null) {
                                            View view6 = efB.A00;
                                            if (view6 != null) {
                                                AbstractC25230BEn.A0Q(view6, R.id.manage_data_settings_followup_title).setText(fra.A01(0));
                                                View view7 = efB.A00;
                                                if (view7 != null) {
                                                    AbstractC25230BEn.A0Q(view7, R.id.manage_data_settings_followup_body).setText(fra.A01(1));
                                                    TextView textView = efB.A04;
                                                    if (textView == null) {
                                                        str2 = "detailTextView";
                                                    } else {
                                                        textView.setText(fra.A01(2));
                                                        IgdsSwitch igdsSwitch2 = efB.A08;
                                                        if (igdsSwitch2 != null) {
                                                            igdsSwitch2.setOnCheckedChangeListener(efB.A0H);
                                                            Button button = efB.A01;
                                                            if (button == null) {
                                                                str = "saveButton";
                                                            } else {
                                                                C0fQ.A00(efB.A0G, button);
                                                                EfB.A00(efB);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i3 = -245941256;
                                        C0f9.A0C(i3, A053);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 32:
                A053 = C0f9.A05(-1359276881);
                C41451vu c41451vu = C41451vu.A01;
                EfB efB2 = (EfB) this.A01;
                c41451vu.E4s(new C36040Fvc(efB2.A09));
                Context requireContext2 = efB2.requireContext();
                AbstractC31171DnF.A1O(requireContext2);
                ((Activity) requireContext2).onBackPressed();
                i3 = -1826129476;
                C0f9.A0C(i3, A053);
                return;
            case 33:
                A053 = C0f9.A05(46524699);
                AbstractC31176DnK.A1Y(this.A01);
                i3 = 1691540683;
                C0f9.A0C(i3, A053);
                return;
            case 34:
                A053 = C0f9.A05(-861599557);
                EfC efC = (EfC) this.A01;
                AbstractC25226BEj.A1Q(efC);
                Context context = efC.getContext();
                C14360o3.A0A(context);
                AbstractC35175FfS.A02(context, efC, efC.getSession(), efC, "https://help.instagram.com/176296189679904?ref=tos", efC.getString(2131963475));
                i3 = -121207265;
                C0f9.A0C(i3, A053);
                return;
            case 35:
                A053 = C0f9.A05(-689397453);
                ((EVF) this.A01).A02.A01();
                i3 = -648928411;
                C0f9.A0C(i3, A053);
                return;
            case 36:
                A053 = C0f9.A05(-1150134871);
                AbstractC25227BEk.A1B((C33150Ejt) this.A01);
                i3 = -1975029973;
                C0f9.A0C(i3, A053);
                return;
            case 37:
                A05 = C0f9.A05(-1408301310);
                C33150Ejt c33150Ejt = (C33150Ejt) this.A01;
                IgdsButton igdsButton = c33150Ejt.A00;
                if (igdsButton != null) {
                    igdsButton.setLoading(true);
                }
                AbstractC31177DnL.A1Q(c33150Ejt, C07Y.A00(c33150Ejt), 3);
                i = 603478246;
                C0f9.A0C(i, A05);
                return;
            case 38:
                A05 = C0f9.A05(2135024359);
                C33150Ejt c33150Ejt2 = (C33150Ejt) this.A01;
                IgdsButton igdsButton2 = c33150Ejt2.A00;
                if (igdsButton2 != null) {
                    igdsButton2.setLoading(true);
                }
                AbstractC31177DnL.A1Q(c33150Ejt2, C07Y.A00(c33150Ejt2), 4);
                i = 1265451750;
                C0f9.A0C(i, A05);
                return;
            case 39:
                A053 = C0f9.A05(-895723104);
                C33150Ejt.A03((C33150Ejt) this.A01);
                i3 = -273446040;
                C0f9.A0C(i3, A053);
                return;
            case 40:
                A05 = C0f9.A05(-924148997);
                C32334EMg c32334EMg = (C32334EMg) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c32334EMg.A01);
                FragmentActivity requireActivity3 = c32334EMg.requireActivity();
                String str9 = c32334EMg.A00;
                AbstractC167017dG.A1O(A0r, str9);
                EIS A003 = AbstractC35258Fgs.A00(A0r, str9);
                C189478aR A0x = AbstractC25228BEl.A0x(requireActivity3, C3DN.A00);
                if (A0x != null) {
                    C189448aO A0y = AbstractC25225BEi.A0y(A0r);
                    AbstractC25226BEj.A1M(requireActivity3, A0y, 2131954734);
                    A0x.A0F(A003, A0y);
                }
                i = -1260543178;
                C0f9.A0C(i, A05);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A053 = C0f9.A05(-256534245);
                AbstractC25227BEk.A1B((EOM) this.A01);
                i3 = -242989156;
                C0f9.A0C(i3, A053);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A053 = C0f9.A05(253119736);
                EOM.A00((EOM) this.A01);
                i3 = 802915578;
                C0f9.A0C(i3, A053);
                return;
            case 43:
                A053 = C0f9.A05(302886978);
                EOM eom = (EOM) this.A01;
                C50674MYs c50674MYs = new C50674MYs(eom.requireContext(), AbstractC166987dD.A0r(eom.A05));
                c50674MYs.A01(A00(eom, 42), 2131954737);
                C31727DwY.A02(eom, c50674MYs);
                i3 = 1582503324;
                C0f9.A0C(i3, A053);
                return;
            case 44:
                int A054 = C0f9.A05(1353817574);
                EOM eom2 = (EOM) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(eom2.A05);
                FragmentActivity requireActivity4 = eom2.requireActivity();
                Integer num = C05F.A01;
                String str10 = eom2.A01;
                if (str10 != null) {
                    String str11 = eom2.A02;
                    if (str11 != null) {
                        AbstractC35258Fgs.A04(requireActivity4, A0r2, num, str10, str11);
                        eom2.A03 = true;
                        C0f9.A0C(-1003892964, A054);
                        return;
                    }
                    str = "hallPassName";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "hallPassId";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 45:
                A053 = C0f9.A05(1092338618);
                EOM.A00((EOM) this.A01);
                i3 = -32354514;
                C0f9.A0C(i3, A053);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A053 = C0f9.A05(-654421951);
                AbstractC25227BEk.A1B((C33148Ejr) this.A01);
                i3 = -1968271910;
                C0f9.A0C(i3, A053);
                return;
            case 47:
                A052 = C0f9.A05(760288712);
                C33148Ejr c33148Ejr = (C33148Ejr) this.A01;
                IgdsBottomButtonLayout igdsBottomButtonLayout = c33148Ejr.A00;
                if (igdsBottomButtonLayout == null) {
                    C14360o3.A0F("doneButton");
                    throw C00O.createAndThrow();
                }
                igdsBottomButtonLayout.setPrimaryActionIsLoading(true);
                int intValue = c33148Ejr.A01.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        A00 = C07Y.A00(c33148Ejr);
                        mcg = new PYZ(c33148Ejr, null, 8);
                    } else {
                        B4Z A004 = B4Z.A00();
                        C0f9.A0C(-2112895546, A052);
                        throw A004;
                    }
                } else {
                    A00 = C07Y.A00(c33148Ejr);
                    mcg = new MCG(c33148Ejr, null);
                }
                AbstractC166987dD.A1Z(mcg, A00);
                i2 = -1102245387;
                C0f9.A0C(i2, A052);
                return;
            case 48:
                A053 = C0f9.A05(-1758646856);
                C33148Ejr.A03((C33148Ejr) this.A01);
                i3 = 2131589607;
                C0f9.A0C(i3, A053);
                return;
            case 49:
                A052 = C0f9.A05(-1457852792);
                Fragment fragment2 = ((Fragment) this.A01).mParentFragment;
                if ((fragment2 instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment2) != null && (c189478aR = bottomSheetFragment.A02) != null) {
                    if (c189478aR.A03.A0D.size() > 1) {
                        c189478aR.A0T();
                    } else {
                        c189478aR.A0L(null);
                    }
                }
                i2 = 572545845;
                C0f9.A0C(i2, A052);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A053 = C0f9.A05(-1909533461);
                EOS eos = (EOS) this.A01;
                AnonymousClass229.A01(AbstractC166987dD.A0r(eos.A0F)).A1j(null, "SHARED_LISTS_CREATE_BUTTON", null);
                AbstractC31179DnN.A0x(eos);
                InterfaceC37173GZk interfaceC37173GZk = eos.A04;
                if (interfaceC37173GZk != null) {
                    interfaceC37173GZk.D89();
                }
                i3 = -462047664;
                C0f9.A0C(i3, A053);
                return;
            case 51:
                A052 = C0f9.A05(-500762612);
                Fragment fragment3 = ((Fragment) this.A01).mParentFragment;
                if ((fragment3 instanceof BottomSheetFragment) && (bottomSheetFragment2 = (BottomSheetFragment) fragment3) != null && (c189478aR2 = bottomSheetFragment2.A02) != null) {
                    c189478aR2.A0T();
                }
                i2 = 1921612229;
                C0f9.A0C(i2, A052);
                return;
            case 52:
                A053 = C0f9.A05(-1718248781);
                EOS eos2 = (EOS) this.A01;
                AnonymousClass229.A01(AbstractC166987dD.A0r(eos2.A0F)).A1j(null, "SHARED_LISTS_CREATE_BUTTON", null);
                AbstractC31179DnN.A0x(eos2);
                InterfaceC37173GZk interfaceC37173GZk2 = eos2.A04;
                if (interfaceC37173GZk2 != null) {
                    interfaceC37173GZk2.D89();
                }
                i3 = -1135353769;
                C0f9.A0C(i3, A053);
                return;
            case 53:
                A053 = C0f9.A05(-1031553405);
                EOS eos3 = (EOS) this.A01;
                InterfaceC09390do interfaceC09390do2 = eos3.A0F;
                InterfaceC19630xq interfaceC19630xq = AbstractC25230BEn.A0l(interfaceC09390do2).A01;
                String A005 = AbstractC111324zv.A00(2442);
                String str12 = null;
                if (!interfaceC19630xq.getBoolean(A005, false) && C3DL.A00(AbstractC166987dD.A0r(interfaceC09390do2))) {
                    AbstractC31177DnL.A1N(AbstractC25230BEn.A0l(interfaceC09390do2).A01, A005, true);
                    C69623Aw c69623Aw = eos3.A05;
                    if (c69623Aw == null) {
                        str = "hallPassLogger";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    c69623Aw.A01(EnumC33481ErG.STORY_VIEWER, AbstractC25225BEi.A14());
                    Fragment fragment4 = eos3.mParentFragment;
                    if ((fragment4 instanceof BottomSheetFragment) && (bottomSheetFragment3 = (BottomSheetFragment) fragment4) != null) {
                        UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do2);
                        String str13 = eos3.A07;
                        Context context2 = eos3.getContext();
                        if (context2 != null) {
                            str12 = context2.getString(2131963440);
                        }
                        AbstractC35258Fgs.A08(A0r3, eos3, bottomSheetFragment3, str13, str12);
                    }
                } else {
                    String str14 = eos3.A07;
                    if (str14 != null) {
                        EOS.A00(eos3, str14, false);
                    }
                }
                i3 = -1773986046;
                C0f9.A0C(i3, A053);
                return;
            case 54:
                A053 = C0f9.A05(-1435518835);
                AbstractC25227BEk.A1B((EON) this.A01);
                i3 = -2017228827;
                C0f9.A0C(i3, A053);
                return;
            case 55:
                A053 = C0f9.A05(1189547037);
                EON.A00((EON) this.A01);
                i3 = -284261824;
                C0f9.A0C(i3, A053);
                return;
            case 56:
                A053 = C0f9.A05(-384694152);
                EON eon = (EON) this.A01;
                C50674MYs c50674MYs2 = new C50674MYs(eon.requireContext(), AbstractC166987dD.A0r(eon.A0A));
                c50674MYs2.A01(A00(eon, 55), 2131963426);
                C31727DwY.A02(eon, c50674MYs2);
                i3 = 1216904744;
                C0f9.A0C(i3, A053);
                return;
            case 57:
                int A055 = C0f9.A05(746613787);
                EON eon2 = (EON) this.A01;
                UserSession A0r4 = AbstractC166987dD.A0r(eon2.A0A);
                FragmentActivity requireActivity5 = eon2.requireActivity();
                String str15 = eon2.A02;
                if (str15 != null) {
                    String str16 = eon2.A03;
                    if (str16 != null) {
                        AbstractC35258Fgs.A01(requireActivity5, C22P.A47, A0r4, str15, str16, false, false);
                        C0f9.A0C(-402892671, A055);
                        return;
                    }
                    str = "hallPassName";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "hallPassId";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 58:
                A053 = C0f9.A05(-14979176);
                EON.A00((EON) this.A01);
                i3 = 1705887998;
                C0f9.A0C(i3, A053);
                return;
            case 59:
                A053 = C0f9.A05(-1797796186);
                EON eon3 = (EON) this.A01;
                eon3.A04 = true;
                Bundle A0b = AbstractC166987dD.A0b();
                String str17 = eon3.A02;
                str = "hallPassId";
                if (str17 != null) {
                    A0b.putString("hall_pass_id", str17);
                    A0b.putString("hall_pass_audience_picker_mode", "ADD_PEOPLE");
                    InterfaceC09390do interfaceC09390do3 = eon3.A0A;
                    UserSession A0r5 = AbstractC166987dD.A0r(interfaceC09390do3);
                    FragmentActivity requireActivity6 = eon3.requireActivity();
                    C14360o3.A0B(A0r5, 0);
                    AbstractC31177DnL.A0n(requireActivity6, A0b, A0r5, ModalActivity.class, AbstractC111324zv.A00(967));
                    C22C A014 = AnonymousClass229.A01(AbstractC166987dD.A0r(interfaceC09390do3));
                    String str18 = eon3.A02;
                    if (str18 != null) {
                        Long A0j = AbstractC166997dE.A0j(str18);
                        String str19 = eon3.A03;
                        if (str19 != null) {
                            A014.A1j(A0j, "SHARED_LISTS_ADD_PEOPLE_BUTTON", str19);
                            i3 = -1007330455;
                            C0f9.A0C(i3, A053);
                            return;
                        }
                        str = "hallPassName";
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 60:
                A053 = C0f9.A05(637457137);
                C32343EMp c32343EMp = (C32343EMp) this.A01;
                C69623Aw c69623Aw2 = c32343EMp.A02;
                if (c69623Aw2 != null) {
                    Integer num2 = C05F.A00;
                    String str20 = c32343EMp.A06;
                    String str21 = c32343EMp.A07;
                    String str22 = c32343EMp.A04;
                    str = "hallPassId";
                    if (str22 != null) {
                        String str23 = c32343EMp.A05;
                        str2 = "hallPassName";
                        if (str23 != null) {
                            c69623Aw2.A00(null, num2, c32343EMp.A03, str21, str20, AbstractC25225BEi.A15(c32343EMp.A0F), c32343EMp.A08, str22, str23, "shared_lists_consumption_sheet");
                            UserSession A0r6 = AbstractC166987dD.A0r(c32343EMp.A0G);
                            FragmentActivity requireActivity7 = c32343EMp.requireActivity();
                            String str24 = c32343EMp.A04;
                            if (str24 != null) {
                                String str25 = c32343EMp.A05;
                                if (str25 != null) {
                                    AbstractC35258Fgs.A01(requireActivity7, C22P.A47, A0r6, str24, str25, false, false);
                                    i3 = 991053506;
                                    C0f9.A0C(i3, A053);
                                    return;
                                }
                            }
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str2 = "logger";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 61:
                A053 = C0f9.A05(-351623432);
                C32343EMp c32343EMp2 = (C32343EMp) this.A01;
                C69623Aw c69623Aw3 = c32343EMp2.A02;
                if (c69623Aw3 != null) {
                    Integer num3 = C05F.A0N;
                    String str26 = c32343EMp2.A06;
                    String str27 = c32343EMp2.A07;
                    String str28 = c32343EMp2.A04;
                    str = "hallPassId";
                    if (str28 != null) {
                        String str29 = c32343EMp2.A05;
                        str2 = "hallPassName";
                        if (str29 != null) {
                            c69623Aw3.A00(null, num3, c32343EMp2.A03, str27, str26, AbstractC25225BEi.A15(c32343EMp2.A0F), c32343EMp2.A08, str28, str29, "shared_lists_consumption_sheet");
                            UserSession A0r7 = AbstractC166987dD.A0r(c32343EMp2.A0G);
                            FragmentActivity requireActivity8 = c32343EMp2.requireActivity();
                            String str30 = c32343EMp2.A04;
                            if (str30 != null) {
                                String str31 = c32343EMp2.A05;
                                if (str31 != null) {
                                    AbstractC35258Fgs.A06(requireActivity8, A0r7, str30, str31, true);
                                    i3 = 750791754;
                                    C0f9.A0C(i3, A053);
                                    return;
                                }
                            }
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str2 = "logger";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 62:
                A053 = C0f9.A05(783902955);
                Fragment fragment5 = (Fragment) this.A01;
                C193328hC A0O = AbstractC31175DnJ.A0O(fragment5);
                A0O.A0A(2131963429);
                A0O.A09(2131963427);
                A0O.A0R(DialogInterfaceOnClickListenerC35453FkA.A00(fragment5, 37), EnumC193348hE.A05, 2131963426);
                A0O.A03();
                AbstractC166987dD.A1W(A0O);
                i3 = -523193933;
                C0f9.A0C(i3, A053);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A053 = C0f9.A05(-47632113);
                EOS eos4 = (EOS) this.A01;
                InterfaceC09390do interfaceC09390do4 = eos4.A0F;
                AnonymousClass229.A01(AbstractC166987dD.A0r(interfaceC09390do4)).A1j(null, "GROUP_STORY_CREATION_BUTTON", null);
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do4);
                C14360o3.A0B(A0o, 0);
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putString("hall_pass_audience_picker_mode", "CREATION");
                A0b2.putString("hall_pass_id", null);
                A0b2.putString("hall_pass_name", null);
                A0b2.putBoolean("campfire_has_story_to_share", true);
                AbstractC31173DnH.A0Z(eos4.getRootActivity(), A0b2, A0o, ModalActivity.class, "campfire_audience_picker").A0D(eos4, 73437);
                i3 = 422214145;
                C0f9.A0C(i3, A053);
                return;
            case 64:
                A053 = C0f9.A05(1773186361);
                FOB fob = (FOB) this.A01;
                Context context3 = fob.A02;
                C14360o3.A0A(context3);
                UserSession userSession = fob.A05;
                C50674MYs c50674MYs3 = new C50674MYs(context3, userSession);
                c50674MYs3.A07(AnonymousClass001.A0D(fob.A00.getName(), '#'));
                c50674MYs3.A01(A00(fob, 66), 2131973267);
                c50674MYs3.A03(A00(fob, 67), 2131956837);
                if (AbstractC54241NyM.A00(userSession)) {
                    c50674MYs3.A03(A00(fob, 65), 2131971200);
                }
                fob.A00.getId();
                C31727DwY c31727DwY = new C31727DwY(c50674MYs3);
                Activity activity = fob.A01;
                C14360o3.A0A(activity);
                c31727DwY.A05(activity);
                i3 = 1761231248;
                C0f9.A0C(i3, A053);
                return;
            case 65:
                A053 = C0f9.A05(630819772);
                FOB fob2 = (FOB) this.A01;
                Fragment fragment6 = fob2.A03;
                FragmentActivity requireActivity9 = fragment6.requireActivity();
                AbstractC10360h2 parentFragmentManager = fragment6.getParentFragmentManager();
                Hashtag hashtag = fob2.A00;
                InterfaceC11380iw interfaceC11380iw = fob2.A04;
                C08790ch A006 = AbstractC018607g.A00(fragment6);
                UserSession userSession2 = fob2.A05;
                boolean booleanValue = AbstractC166997dE.A0c(C06090Tz.A05, userSession2, 36314837549779812L).booleanValue();
                AbstractC31510Dsu.A09(requireActivity9, parentFragmentManager, A006, new C35873Fsn(0, requireActivity9, interfaceC11380iw, userSession2, hashtag, booleanValue), interfaceC11380iw, userSession2, hashtag, AbstractC31172DnG.A0s(booleanValue), C05F.A0A, "qr_code");
                i3 = -1528921023;
                C0f9.A0C(i3, A053);
                return;
            case 66:
                A053 = C0f9.A05(1891540034);
                FOB fob3 = (FOB) this.A01;
                InterfaceC11380iw interfaceC11380iw2 = fob3.A04;
                Activity activity2 = fob3.A01;
                if (activity2 == null) {
                    str3 = "Null activity when reporting hashtag";
                } else if (fob3.A00.getId() == null) {
                    str3 = "Null hashtag ID when reporting hashtag";
                } else {
                    String id = fob3.A00.getId();
                    C14360o3.A0A(id);
                    C14360o3.A0B(id, 1);
                    WEz A015 = AbstractC69993VzD.A01(activity2, interfaceC11380iw2, fob3.A05, EnumC65855TvH.A0e, VG2.A0R, fob3.A00.getId());
                    Context context4 = fob3.A02;
                    C14360o3.A0A(context4);
                    A015.A07 = AbstractC166997dE.A0q(context4.getResources(), 2131963257);
                    A015.A08(new C33312Eo7(fob3, 6));
                    WEz.A00(null, A015);
                    i3 = 926288233;
                    C0f9.A0C(i3, A053);
                    return;
                }
                C0w9.A03("HASHTAG_REPORTING", str3);
                i3 = 926288233;
                C0f9.A0C(i3, A053);
                return;
            case 67:
                A053 = C0f9.A05(-1733432618);
                FOB fob4 = (FOB) this.A01;
                Fragment fragment7 = fob4.A03;
                FragmentActivity requireActivity10 = fragment7.requireActivity();
                AbstractC10360h2 parentFragmentManager2 = fragment7.getParentFragmentManager();
                Hashtag hashtag2 = fob4.A00;
                AbstractC31510Dsu.A09(requireActivity10, parentFragmentManager2, AbstractC018607g.A00(fragment7), new C44289Jhf(requireActivity10, 12), fob4.A04, fob4.A05, hashtag2, AbstractC166997dE.A0b(), C05F.A00, "copy_link");
                i3 = -401571197;
                C0f9.A0C(i3, A053);
                return;
            case 68:
                A053 = C0f9.A05(2026214383);
                AbstractC166987dD.A1Y(((C51752Mtb) this.A01).A02);
                i3 = -17985664;
                C0f9.A0C(i3, A053);
                return;
            case 69:
                A053 = C0f9.A05(1770303491);
                AbstractC25225BEi.A1U(this.A01, view);
                i3 = -2055927252;
                C0f9.A0C(i3, A053);
                return;
            default:
                A053 = C0f9.A05(1520758033);
                GZA gza = ((IgdsBanner) this.A01).A00;
                if (gza != null) {
                    gza.onActionClicked();
                }
                i3 = 727940686;
                C0f9.A0C(i3, A053);
                return;
        }
    }

    public ViewOnClickListenerC35685FpK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
