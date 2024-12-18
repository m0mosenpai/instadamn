package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.api.schemas.SubmittedSubPostManageType;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.Map;

/* renamed from: X.Ifr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41837Ifr implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public DialogInterfaceOnClickListenerC41837Ifr(UserSession userSession, C38321qM c38321qM, IL2 il2, C55101ObE c55101ObE, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = c55101ObE;
            this.A02 = c38321qM;
            this.A03 = userSession;
            this.A04 = il2;
        } else {
            this.A04 = il2;
            this.A01 = c55101ObE;
            this.A02 = c38321qM;
            this.A03 = userSession;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(dialogInterface, 0);
                C41096IHn c41096IHn = (C41096IHn) this.A04;
                Context context = (Context) this.A01;
                AbstractC018607g abstractC018607g = (AbstractC018607g) this.A02;
                C41628IbJ c41628IbJ = (C41628IbJ) this.A03;
                C1ON A01 = AbstractC41336IRh.A01(c41096IHn.A03, c41628IbJ);
                C37484Gf2.A00(A01, c41628IbJ, c41096IHn, 0);
                C1GJ.A00(context, abstractC018607g, A01);
                break;
            case 1:
                IL2 il2 = (IL2) this.A04;
                Context context2 = il2.A00;
                String str5 = null;
                C6WQ A0i = AbstractC31174DnI.A0i(context2);
                A0i.A00(context2.getResources().getString(2131969145));
                C0fJ.A00(A0i);
                C55101ObE c55101ObE = (C55101ObE) this.A01;
                C38321qM c38321qM = (C38321qM) this.A02;
                if (c38321qM != null) {
                    str = c38321qM.A2u();
                } else {
                    str = null;
                }
                UserSession userSession = c55101ObE.A07;
                InterfaceC11380iw interfaceC11380iw = c55101ObE.A05;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_open_carousel_tap");
                if (A0f.isSampled()) {
                    AbstractC25225BEi.A1M(EnumC39652Hih.A0g, A0f);
                    AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
                    AbstractC25225BEi.A1N(A0f, c55101ObE.A08);
                    AbstractC37300Gc1.A0h(A0f, C55101ObE.A00(str));
                    A0f.Cht();
                }
                C41627IbI c41627IbI = new C41627IbI((UserSession) this.A03);
                if (c38321qM != null) {
                    str5 = c38321qM.A2u();
                }
                c41627IbI.A01(SubmittedSubPostManageType.A08, new C37484Gf2(4, A0i, il2), str5, null, null);
                return;
            case 2:
                C55101ObE c55101ObE2 = (C55101ObE) this.A01;
                C38321qM c38321qM2 = (C38321qM) this.A02;
                if (c38321qM2 != null) {
                    str2 = c38321qM2.A2u();
                } else {
                    str2 = null;
                }
                UserSession userSession2 = c55101ObE2.A07;
                InterfaceC11380iw interfaceC11380iw2 = c55101ObE2.A05;
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw2, userSession2), "instagram_open_carousel_tap");
                if (A0f2.isSampled()) {
                    AbstractC25225BEi.A1M(EnumC39652Hih.A0p, A0f2);
                    AbstractC25229BEm.A1A(A0f2, interfaceC11380iw2);
                    AbstractC25225BEi.A1N(A0f2, c55101ObE2.A08);
                    AbstractC37300Gc1.A0h(A0f2, C55101ObE.A00(str2));
                    A0f2.Cht();
                }
                C41627IbI.A00(((IL2) this.A04).A00, c38321qM2, new C41627IbI((UserSession) this.A03), false);
                return;
            case 3:
                C38321qM c38321qM3 = (C38321qM) this.A03;
                UserSession userSession3 = (UserSession) this.A04;
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A02;
                AbstractC172137li.A03(abstractC59962oe.requireActivity(), userSession3, c38321qM3, AbstractC166987dD.A10(userSession3), abstractC59962oe.getClass(), abstractC59962oe.getModuleName());
                ((DialogInterface.OnDismissListener) this.A01).onDismiss(dialogInterface);
                return;
            case 4:
                dialogInterface.dismiss();
                C41138IJd c41138IJd = (C41138IJd) this.A01;
                UserSession userSession4 = c41138IJd.A03;
                C38321qM c38321qM4 = (C38321qM) this.A03;
                String id = c38321qM4.getId();
                String moduleName = c41138IJd.A02.getModuleName();
                C14360o3.A0B(moduleName, 2);
                C25621Ms A0c = AbstractC167017dG.A0c(userSession4);
                A0c.A0L("commerce/media/%s/remove_all_tags_on_media/", id);
                AbstractC31173DnH.A1N(A0c);
                AbstractC37300Gc1.A0y(A0c, moduleName);
                C1ON A0U = AbstractC31172DnG.A0U(A0c, true);
                A0U.A00 = new HGT((C1P1) this.A04, c38321qM4, c41138IJd);
                C1GJ.A00((Context) this.A02, c41138IJd.A01, A0U);
                return;
            case 5:
                II4 ii4 = (II4) this.A04;
                C69141ViW c69141ViW = (C69141ViW) this.A03;
                C41181vS c41181vS = (C41181vS) this.A02;
                boolean z = !c69141ViW.A00;
                c69141ViW.A00 = z;
                UserSession userSession5 = ii4.A03;
                Reel reel = c69141ViW.A02;
                String id2 = reel.getId();
                String str6 = c41181vS.A0j;
                if (z) {
                    str3 = "media/%s/block_from_multi_author_story/";
                } else {
                    str3 = "media/%s/unblock_from_multi_author_story/";
                }
                String A06 = AbstractC13670mt.A06(str3, str6.split("_")[0]);
                C25621Ms A0M = AbstractC31173DnH.A0M(userSession5);
                A0M.A0B(A06);
                AbstractC31176DnK.A1P(A0M, "reel_id", id2);
                C1ON A0N = A0M.A0N();
                A0N.A00 = new C32545EUv(7, c69141ViW, ii4, z);
                C1GJ.A03(A0N);
                C1NB c1nb = reel.A0W;
                if (c1nb != null) {
                    str4 = c1nb.getName();
                } else {
                    str4 = null;
                }
                boolean A1o = c41181vS.A1o();
                boolean z2 = c69141ViW.A00;
                if (A1o) {
                    i2 = 2131976090;
                    if (z2) {
                        i2 = 2131963497;
                    }
                } else {
                    i2 = 2131976089;
                    if (z2) {
                        i2 = 2131963495;
                    }
                }
                Context context3 = ii4.A01;
                C14360o3.A0A(context3);
                C9GR.A09(context3, AbstractC31177DnL.A0b(context3, str4, i2));
                C0fA.A00(((ReelDashboardFragment) this.A01).mListAdapter, 1852789563);
                return;
            case 6:
                UserSession userSession6 = (UserSession) this.A04;
                C66277U6x.A01("com.instagram.social_impact.linked_fundraiser.creation_bottom_sheet", null).A05((Context) this.A02, AbstractC31171DnF.A0C(userSession6));
                AbstractC55215Oed.A08((InterfaceC11380iw) this.A03, userSession6, "share_fundraiser_as_ig_story_click_learn_more", AbstractC111324zv.A00(1080), null, (Map) this.A01);
                return;
            case 7:
                UserSession userSession7 = (UserSession) this.A04;
                User user = (User) this.A03;
                GrowthFrictionInterventionDetail growthFrictionInterventionDetail = (GrowthFrictionInterventionDetail) this.A01;
                Integer num = (Integer) this.A02;
                C14360o3.A0B(num, 3);
                C41682IdB.A00(growthFrictionInterventionDetail, userSession7, user, num, MSV.A00(601));
                return;
            case 8:
            case 9:
                C41699IdS c41699IdS = (C41699IdS) this.A04;
                C41699IdS.A00((C47H) this.A03, c41699IdS.A0C, c41699IdS);
                IG2 ig2 = c41699IdS.A01;
                if (ig2 == null) {
                    return;
                }
                String str7 = (String) ((C15370ps) this.A02).A00;
                Integer valueOf = Integer.valueOf(((C15100pQ) this.A01).A00);
                InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(ig2.A01, "follow_prompt_clicked");
                AbstractC31175DnJ.A14(A0f3, ig2.A00);
                AbstractC37303Gc4.A0o(A0f3, "dialog", str7);
                A0f3.A8p("num_facepiles", valueOf);
                A0f3.Cht();
                return;
            case 10:
                C14360o3.A0B(dialogInterface, 0);
                C41699IdS c41699IdS2 = (C41699IdS) this.A04;
                C129885ts A00 = AbstractC129875tr.A00(c41699IdS2.A0C);
                Context context4 = c41699IdS2.A0A;
                User CDj = ((C47H) this.A03).CDj();
                InterfaceC11380iw interfaceC11380iw3 = c41699IdS2.A0B;
                A00.A09(context4, null, null, null, null, null, null, null, CDj, false, null, C05F.A0j, null, "clips_follow_prompt", "clips_follow_prompt", interfaceC11380iw3.getModuleName(), interfaceC11380iw3.getModuleName(), null, null, null, null, null);
                IG2 ig22 = c41699IdS2.A01;
                if (ig22 != null) {
                    String str8 = (String) ((C15370ps) this.A02).A00;
                    int i3 = ((C15100pQ) this.A01).A00;
                    C14360o3.A0B(str8, 1);
                    InterfaceC02590Ai A0f4 = AbstractC166987dD.A0f(ig22.A01, "follow_prompt_accepted");
                    AbstractC31175DnJ.A14(A0f4, ig22.A00);
                    AbstractC37303Gc4.A0o(A0f4, "dialog", str8);
                    A0f4.A8p("num_facepiles", Integer.valueOf(i3));
                    A0f4.Cht();
                    break;
                }
                break;
            default:
                return;
        }
        dialogInterface.dismiss();
    }

    public DialogInterfaceOnClickListenerC41837Ifr(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj4;
    }
}
