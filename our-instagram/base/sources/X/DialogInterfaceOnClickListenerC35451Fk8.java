package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.Collections;

/* renamed from: X.Fk8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35451Fk8 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public DialogInterfaceOnClickListenerC35451Fk8(FM7 fm7, EVQ evq, String str, int i) {
        this.A00 = i;
        this.A01 = evq;
        this.A03 = str;
        this.A02 = fm7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C25531Mh A00;
        String str;
        switch (this.A00) {
            case 0:
                String str2 = this.A03;
                if (C14360o3.A0K(str2, AbstractC111324zv.A00(4656))) {
                    A00 = C28484Chc.A00((C28484Chc) this.A01);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        str = "thread_view_add_example_dialogue_submit_for_review_dialog_submit_clicked";
                        A00.A0k(str);
                        A00.Cht();
                    }
                    AbstractC166987dD.A1Y(this.A02);
                    return;
                }
                if (C14360o3.A0K(str2, AbstractC111324zv.A00(4657))) {
                    A00 = C28484Chc.A00((C28484Chc) this.A01);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        str = "thread_view_add_instruction_submit_for_review_dialog_submit_clicked";
                        A00.A0k(str);
                        A00.Cht();
                    }
                }
                AbstractC166987dD.A1Y(this.A02);
                return;
            case 1:
                C66359UCf c66359UCf = (C66359UCf) this.A01;
                c66359UCf.setEnabled(false);
                if (c66359UCf.isChecked()) {
                    C69655Vsw c69655Vsw = (C69655Vsw) this.A02;
                    c69655Vsw.A08.A02(-1);
                    c69655Vsw.A06.A09(c69655Vsw.A05, null);
                }
                C69655Vsw c69655Vsw2 = (C69655Vsw) this.A02;
                String str3 = this.A03;
                C34594FMd c34594FMd = c69655Vsw2.A04;
                V25 v25 = new V25(c69655Vsw2.A03, c66359UCf, c69655Vsw2, AnonymousClass001.A0R("/api/v1/", AbstractC25227BEk.A0w("ads/promote/delete_audience/", 0, "ads/promote/delete_audience/".length() - 1)), 2);
                UserSession userSession = c34594FMd.A02;
                String str4 = c34594FMd.A03;
                String str5 = c34594FMd.A04;
                C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
                A0M.A0B("ads/promote/delete_audience/");
                A0M.A9s("fb_auth_token", str4);
                A0M.A9s("audience_id", str3);
                A0M.A9s("fb_actor_id", str5);
                C1ON A0S = AbstractC31172DnG.A0S(A0M, EB1.class, FTS.class);
                A0S.A00 = v25;
                C1GJ.A00(c34594FMd.A00, c34594FMd.A01, A0S);
                return;
            case 2:
                C69655Vsw c69655Vsw3 = (C69655Vsw) this.A02;
                FragmentActivity fragmentActivity = c69655Vsw3.A02;
                C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
                A0H.A04();
                A0H.A0A(2131970364);
                A0H.A0r(fragmentActivity.getResources().getString(2131970363));
                A0H.A0G(new DialogInterfaceOnClickListenerC35451Fk8(c69655Vsw3, (C66359UCf) this.A01, this.A03, 1));
                A0H.A03();
                AbstractC166987dD.A1W(A0H);
                return;
            case 3:
                FRV frv = (FRV) this.A02;
                frv.A01.FD8(AbstractC31180DnO.A0K(frv.A00, (Fragment) this.A01), this.A03);
                return;
            case 4:
                EOR eor = (EOR) this.A02;
                ((AbstractC31827Dyl) eor.A0L.getValue()).A02();
                C36296Fzq.A01(EnumC33514Ern.A0D, EnumC33512Erl.NEW_SUBSCRIBER_CHAT, AbstractC31172DnG.A0b(eor.A0I), "discard_changes_yes");
                EOR.A00((FanClubCategoryType) this.A01, eor, this.A03);
                return;
            case 5:
                C35010Fbh c35010Fbh = (C35010Fbh) this.A02;
                UserSession userSession2 = c35010Fbh.A05;
                String str6 = this.A03;
                User user = (User) this.A01;
                AbstractC31278Dp0.A0H(userSession2, str6, user.getId());
                C35003Fba c35003Fba = c35010Fbh.A01;
                if (c35003Fba != null) {
                    c35003Fba.A00(user);
                }
                c35010Fbh.A07.remove(user);
                C35010Fbh.A00(c35010Fbh);
                c35010Fbh.A01();
                c35010Fbh.A06.A02();
                C14360o3.A07(Collections.singletonList(user.getId()));
                return;
            case 6:
                EL5 el5 = (EL5) this.A02;
                FanClubConsiderationViewModel A002 = EL5.A00(el5);
                Context requireContext = el5.requireContext();
                EnumC33348Eoh enumC33348Eoh = (EnumC33348Eoh) ((C51749MtY) this.A01).A01;
                String str7 = this.A03;
                AbstractC167017dG.A1P(enumC33348Eoh, str7);
                int ordinal = enumC33348Eoh.ordinal();
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        AbstractC23641Du.A05(((C12M) A002.A02).A04, new PYc(A002, str7, null, 41), AbstractC141776au.A00(A002));
                        return;
                    }
                    throw AbstractC166987dD.A12("Unsupported auxiliary button");
                }
                AbstractC31177DnL.A0u(requireContext, A002.A03, C2Fb.A1n, "https://help.instagram.com/467290348140020");
                return;
            case 7:
                Context context = (Context) this.A01;
                AbstractC31176DnK.A11(context, (AbstractC12990ll) this.A02, AbstractC31171DnF.A0R(this.A03), context.getString(2131965052));
                return;
            case 8:
                dialogInterface.dismiss();
                EVQ.A04((EVQ) this.A01, (User) this.A02, this.A03);
                return;
            case 9:
                EVQ evq = (EVQ) this.A01;
                EVQ.A05(evq, C1Q9.A0e, this.A03);
                dialogInterface.dismiss();
                String str8 = ((FM7) this.A02).A03;
                C07270a1 c07270a1 = evq.A08;
                String str9 = evq.A09.A01;
                AbstractC167007dF.A1K(c07270a1, str9);
                double A01 = AbstractC31171DnF.A01();
                double A003 = AbstractC31171DnF.A00();
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "fb_clash_log_in_tapped");
                AbstractC31179DnN.A18(A0f, A01, A003);
                AbstractC31171DnF.A1A(A0f, str9);
                AbstractC31179DnN.A15(A0f);
                AbstractC35274Fh9.A04(A0f);
                AbstractC35274Fh9.A09(A0f, c07270a1);
                A0f.A7v("is_internal_build", false);
                A0f.Cht();
                C140966Yy A0N = AbstractC31177DnL.A0N(evq.A06.getActivity(), c07270a1);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING", str8);
                AbstractC31176DnK.A1A(A0b, new C32316ELf(), A0N);
                return;
            case 10:
                dialogInterface.dismiss();
                EVQ evq2 = (EVQ) this.A01;
                C07270a1 c07270a12 = evq2.A08;
                String str10 = this.A03;
                C4JL A0J = AbstractC31174DnI.A0J(((FM7) this.A02).A03);
                C4JK c4jk = C4JK.A00;
                EVQ.A02(A0J, c4jk, c4jk, c07270a12, evq2, null, null, str10, null, null, true);
                return;
            case 11:
                C18920wW c18920wW = (C18920wW) this.A02;
                String str11 = this.A03;
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c18920wW, "instagram_shopping_seller_featured_product_nux_tap");
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("submodule", "learn_more");
                c0Zx.A06("prior_module", str11);
                A0f2.AAQ(c0Zx, "navigation_info");
                A0f2.Cht();
                C12260kU.A0G((Context) this.A01, AbstractC08820cl.A03("https://www.facebook.com/help/instagram/3514581701914650"));
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                InterfaceC11380iw interfaceC11380iw = AbstractC34914Fa0.A00;
                C14360o3.A0B(interfaceC11380iw, 1);
                C65761Ttc.A00(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), (C69436VnL) this.A01, "ig_quiet_mode_upsell_unified_dialog_ok_tap", this.A03);
                dialogInterface.dismiss();
                return;
            default:
                return;
        }
    }

    public DialogInterfaceOnClickListenerC35451Fk8(C69655Vsw c69655Vsw, C66359UCf c66359UCf, String str, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A02 = c69655Vsw;
            this.A01 = c66359UCf;
        } else {
            this.A01 = c66359UCf;
            this.A02 = c69655Vsw;
        }
        this.A03 = str;
    }

    public DialogInterfaceOnClickListenerC35451Fk8(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }
}
