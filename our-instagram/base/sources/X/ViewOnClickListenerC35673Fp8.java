package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;
import java.util.Currency;
import java.util.HashMap;

/* renamed from: X.Fp8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35673Fp8 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public ViewOnClickListenerC35673Fp8(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = str;
        this.A03 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(190128060);
                C35793FrV.A03((AbstractC12990ll) this.A03, this.A04, "claim_page", "not_now");
                InterfaceC08430c6 interfaceC08430c6 = (Fragment) this.A02;
                if (interfaceC08430c6 instanceof DialogInterface.OnCancelListener) {
                    ((DialogInterface.OnCancelListener) interfaceC08430c6).onCancel((Dialog) this.A01);
                }
                AbstractC31171DnF.A1N(this.A01);
                i = -1537018704;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(1737246984);
                EN6 en6 = (EN6) this.A03;
                C006802i c006802i = ((C47910LEe) en6.A04.getValue()).A00;
                c006802i.markerStart(31786177);
                c006802i.markerPoint(31786177, "Follow_Creator_Start");
                C142846ck c142846ck = en6.A00;
                if (c142846ck == null) {
                    C14360o3.A0F("broadcastLogger");
                    throw C00O.createAndThrow();
                }
                c142846ck.A0F(EnumC33373Ep6.A0L, this.A04, 0);
                IgdsButton igdsButton = (IgdsButton) this.A01;
                igdsButton.setLoading(true);
                FragmentActivity requireActivity = en6.requireActivity();
                UserSession A0r = AbstractC166987dD.A0r(en6.A05);
                User user = (User) this.A02;
                AbstractC35271Fh6.A00(requireActivity, null, new C32540EUq(5, igdsButton, user, en6), A0r, null, null, user);
                i = 229845070;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-1593624112);
                AbstractC31265Don.A00();
                C32314ELd c32314ELd = (C32314ELd) this.A03;
                UserSession A0r2 = AbstractC166987dD.A0r(c32314ELd.A17);
                FragmentActivity requireActivity2 = c32314ELd.requireActivity();
                String str2 = this.A04;
                C14360o3.A0B(A0r2, 0);
                AbstractC35257Fgr.A00(requireActivity2, null, A0r2, str2, null);
                C28484Chc c28484Chc = (C28484Chc) this.A02;
                User user2 = (User) this.A01;
                if (user2 != null) {
                    str = user2.A03.Aae();
                } else {
                    str = null;
                }
                C25531Mh A00 = C28484Chc.A00(c28484Chc);
                if (AbstractC25226BEj.A1Z(A00)) {
                    A00.A0i(AbstractC25233BEq.A0m(A00, "thread_details_ai_studio_button_clicked", str));
                    A00.Cht();
                }
                i = 978614028;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(788720172);
                C28484Chc c28484Chc2 = (C28484Chc) this.A02;
                String Aae = ((User) this.A01).A03.Aae();
                C25531Mh A002 = C28484Chc.A00(c28484Chc2);
                if (AbstractC25226BEj.A1Z(A002)) {
                    A002.A0i(AbstractC25233BEq.A0m(A002, "thread_view_creator_button_thread_details_clicked", Aae));
                    A002.Cht();
                }
                C32314ELd c32314ELd2 = (C32314ELd) this.A03;
                InterfaceC09390do interfaceC09390do = c32314ELd2.A17;
                UserDetailLaunchConfig A03 = AbstractC31402Dr6.A03(AbstractC166987dD.A0r(interfaceC09390do), this.A04, "direct_thread_ugc_ai", C32314ELd.__redex_internal_original_name);
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                AbstractC31172DnG.A1M(c32314ELd2, AbstractC31171DnF.A0L(c32314ELd2.requireActivity(), AbstractC31364DqT.A02().A01(AbstractC166987dD.A0r(interfaceC09390do), A03), A0r3, ModalActivity.class, "profile"));
                i = 401591366;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(-1543039641);
                Bundle A0b = AbstractC166987dD.A0b();
                C36423G4y c36423G4y = (C36423G4y) this.A03;
                C7TT A0V = AbstractC31174DnI.A0V(c36423G4y.A03);
                A0b.putString("bottom_sheet_content_fragment", AbstractC111324zv.A00(723));
                A0b.putString("content_id", AbstractC25231BEo.A0t((User) AbstractC001800i.A0J(A0V.A0b)));
                A0b.putString("prior_module", c36423G4y.A01.getModuleName());
                UserSession userSession = c36423G4y.A02;
                FragmentActivity fragmentActivity = c36423G4y.A00;
                C6XJ A0L = AbstractC31171DnF.A0L(fragmentActivity, A0b, userSession, TransparentModalActivity.class, "bottom_sheet");
                C28484Chc c28484Chc3 = (C28484Chc) this.A02;
                String str3 = this.A04;
                if (!C14360o3.A0K(str3, "867051314767696") && !C14360o3.A0K(str3, "64528677628")) {
                    C25531Mh A003 = C28484Chc.A00(c28484Chc3);
                    if (AbstractC25226BEj.A1Z(A003)) {
                        A003.A0i(AbstractC25233BEq.A0m(A003, "thread_view_share_button_clicked", str3));
                        A003.Cht();
                    }
                }
                C7W9 c7w9 = (C7W9) this.A01;
                C7W9.A00(c7w9, new C50157MDk(c7w9, 19));
                A0L.A0C(fragmentActivity);
                i = -1063852675;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(-1605414658);
                final String str4 = this.A04;
                if (str4 != null) {
                    UserSession userSession2 = ((FNU) this.A01).A02;
                    C34541FKb c34541FKb = new C34541FKb(userSession2, "direct_create_order_fragment");
                    String str5 = userSession2.userId;
                    C14360o3.A0B(str5, 0);
                    AbstractC31181DnP.A0v(c34541FKb.A01, "biig_order_management_create_order_form_send_button_click", str5, str4);
                }
                final Context context = (Context) this.A02;
                final C54527O7e c54527O7e = (C54527O7e) this.A03;
                FNU fnu = (FNU) this.A01;
                final UserSession userSession3 = fnu.A02;
                EMX emx = fnu.A03;
                final String str6 = emx.A03;
                final String str7 = emx.A02;
                final String str8 = fnu.A00;
                String A0o = AbstractC166997dE.A0o();
                C04060Jx c04060Jx = GraphQlCallInput.A02;
                final Currency A032 = WFD.A03(userSession3);
                final Boolean A0c = AbstractC166997dE.A0c(C06090Tz.A05, userSession3, 36315864043228825L);
                C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, userSession3.userId, "actor_id");
                C0CA.A00(A0T, A0o, "client_mutation_id");
                C0CA.A00(A0T, userSession3.userId, "instagram_business_id");
                String str9 = "";
                String str10 = "";
                if (str4 != null) {
                    str10 = str4;
                }
                C0CA.A00(A0T, str10, AbstractC111324zv.A00(1024));
                if (A032 != null) {
                    str9 = A032.toString();
                }
                C0CA.A00(A0T, str9, "currency");
                C0CA.A00(A0T, str6, "total_amount");
                C0CA.A00(A0T, str7, "note");
                C2JM A0b2 = AbstractC25225BEi.A0b();
                AbstractC25231BEo.A18(A0T, A0b2);
                C907442n c907442n = new C907442n(A0b2, E5S.class, "IGP2MOrderManagementCreateOrderMutation", true);
                C195928le.A00(userSession3).ATV(new C55661Onm(c54527O7e, 5), new InterfaceC48192Ji() { // from class: X.Ont
                    @Override // X.InterfaceC48192Ji
                    public final void invoke(AnonymousClass436 anonymousClass436) {
                        String str11;
                        String string;
                        String str12 = str8;
                        UserSession userSession4 = userSession3;
                        Context context2 = context;
                        String str13 = str6;
                        String str14 = str4;
                        Currency currency = A032;
                        Boolean bool = A0c;
                        String str15 = str7;
                        C54527O7e c54527O7e2 = c54527O7e;
                        AbstractC907342m abstractC907342m = (AbstractC907342m) anonymousClass436.Bos();
                        if (abstractC907342m != null && str12 != null) {
                            DirectThreadKey directThreadKey = new DirectThreadKey(str12, null);
                            AbstractC907342m A004 = abstractC907342m.A00(C51550Mpa.class, "xfb_ig_p2m_create_order");
                            if (A004 != null) {
                                C7TG A005 = AbstractC165967bO.A00(userSession4);
                                String string2 = context2.getString(2131969303);
                                String A052 = A004.A05("order_id");
                                String str16 = userSession4.userId;
                                if (currency != null) {
                                    str11 = currency.toString();
                                } else {
                                    str11 = "";
                                }
                                if (bool.booleanValue()) {
                                    string = "Order placed";
                                } else {
                                    string = context2.getString(2131969303);
                                }
                                A005.A0I(directThreadKey, string2, str13, A052, str16, str14, str13, str11, string, str15);
                                C23031Ai c23031Ai = c54527O7e2.A01;
                                InterfaceC16530ry interfaceC16530ry = c23031Ai.A1k;
                                C0YR[] c0yrArr = C23031Ai.A8c;
                                if (!AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 291)) {
                                    AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, 291, true);
                                }
                                c54527O7e2.A00.A04.A0L(null);
                                return;
                            }
                            C146106i8 A0j = AbstractC25229BEm.A0j();
                            A0j.A0H = "create_order_send_failure";
                            AbstractC25226BEj.A1N(c54527O7e2.A00.A01, A0j, 2131956969);
                            A0j.A06();
                            AbstractC25233BEq.A1F(A0j);
                        }
                    }
                }, c907442n);
                AbstractC13880nE.A0O(view);
                i = 507426209;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(-1809375788);
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("page_id", this.A04);
                A1G.put("referrer", "map_profile_action");
                C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(4131), A1G);
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(abstractC12990ll);
                A0C.A0i = true;
                AbstractC25228BEl.A1G((Activity) this.A02, W6d.A00(A0C, A01), abstractC12990ll, ModalActivity.class, "bloks");
                i = 453159215;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(2072997786);
                Context context2 = (Context) this.A01;
                C193328hC A0I = AbstractC31171DnF.A0I(context2);
                A0I.A0A(2131976526);
                A0I.A0r(AbstractC166997dE.A0r(context2.getResources(), this.A04, 2131976524));
                A0I.A0P(new DialogInterfaceOnClickListenerC35450Fk7(12, context2, this.A03, this.A02), EnumC193348hE.A05, 2131972171);
                A0I.A0E(null);
                AbstractC166987dD.A1W(A0I);
                i = 1799503440;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(-1404262987);
                C69651Vss c69651Vss = (C69651Vss) this.A03;
                Fragment fragment = (Fragment) this.A02;
                String str11 = this.A04;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                if (fragment.isAdded()) {
                    HashMap A0r4 = AbstractC167017dG.A0r("url", str11);
                    String str12 = c69651Vss.A06;
                    if (str12 != null) {
                        A0r4.put("media_id", str12);
                    }
                    AbstractC31510Dsu.A0Q(fragment.requireActivity(), AbstractC31180DnO.A03(str11), interfaceC11380iw, c69651Vss.A03, "share_to_system_sheet", A0r4);
                }
                i = -936570709;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(-1412156646);
                boolean z = ((EII) this.A02).A00;
                if (!z) {
                    C83743oJ c83743oJ = (C83743oJ) this.A03;
                    String str13 = this.A04;
                    C83803oP A02 = C83743oJ.A02(c83743oJ, str13);
                    A02.A0A = true;
                    c83743oJ.A00.put(str13, A02);
                    c83743oJ.A0B(null, null, null, false);
                }
                C35272Fh7 c35272Fh7 = (C35272Fh7) this.A01;
                UserSession userSession4 = c35272Fh7.A04;
                C83743oJ A012 = C83743oJ.A01(userSession4);
                String str14 = this.A04;
                A012.A09(c35272Fh7.A01.getApplicationContext(), c35272Fh7.A03, userSession4, C05F.A0u, str14, z);
                c35272Fh7.A0D(EnumC33353Eom.A05, z);
                i = -640269436;
                C0f9.A0C(i, A05);
                return;
        }
    }

    public ViewOnClickListenerC35673Fp8(C28484Chc c28484Chc, C32314ELd c32314ELd, User user, String str, int i) {
        this.A00 = i;
        if (2 - i != 0) {
            this.A02 = c28484Chc;
            this.A01 = user;
            this.A03 = c32314ELd;
            this.A04 = str;
        } else {
            this.A03 = c32314ELd;
            this.A04 = str;
            this.A02 = c28484Chc;
            this.A01 = user;
        }
    }
}
