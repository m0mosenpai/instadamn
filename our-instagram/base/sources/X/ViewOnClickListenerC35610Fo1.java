package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fo1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35610Fo1 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public ViewOnClickListenerC35610Fo1(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        int A052;
        int i2;
        String str;
        int A053;
        int i3;
        int length;
        String A0r;
        InterfaceC83713oG c122145g6;
        String C7I;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1133138824);
                E44 e44 = (E44) this.A04;
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                e44.A00.Cs2(AbstractC31172DnG.A0C(this.A01), (UserSession) this.A03, (User) this.A02, "branded_content_people_cell");
                i = -405276580;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(1720064328);
                E44 e442 = (E44) this.A04;
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                e442.A00.Cs2(AbstractC31172DnG.A0C(this.A01), (UserSession) this.A03, (User) this.A02, "branded_content_people_cell");
                i = 661810839;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A052 = C0f9.A05(-1803543175);
                UserSession userSession = (UserSession) this.A04;
                C26055Bfi c26055Bfi = (C26055Bfi) this.A01;
                GWZ gwz = (GWZ) this.A03;
                if (C26055Bfi.A00(c26055Bfi, 0)) {
                    HashMap A02 = C23031Ai.A02(AbstractC23021Ah.A00(userSession), "contacts_in_sharesheet_access_map");
                    String A0u = AbstractC166997dE.A0u(c26055Bfi);
                    Object obj = A02.get(A0u);
                    if (obj == null) {
                        obj = Double.valueOf(0.0d);
                        A02.put(A0u, obj);
                    }
                    AbstractC166997dE.A1T(A0u, A02, ((Number) obj).doubleValue() + 1.0d);
                    C23031Ai.A05(AbstractC23021Ah.A00(userSession), "contacts_in_sharesheet_access_map", A02);
                    ((G2U) gwz).A00.A0B.DYM(c26055Bfi);
                }
                i2 = -1715970202;
                C0f9.A0C(i2, A052);
                return;
            case 3:
                A052 = C0f9.A05(-1560405343);
                C3DO c3do = C3DN.A00;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                AbstractC167017dG.A0y(fragmentActivity, c3do);
                AbstractC35056FcT.A02(fragmentActivity, (InterfaceC11380iw) this.A02, (UserSession) this.A04, (C2EE) this.A03);
                i2 = 179461347;
                C0f9.A0C(i2, A052);
                return;
            case 4:
                A052 = C0f9.A05(1512058808);
                C32314ELd c32314ELd = (C32314ELd) this.A04;
                InterfaceC09390do interfaceC09390do = c32314ELd.A17;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                E70 e70 = (E70) this.A03;
                C14360o3.A0B(A0r2, 0);
                if ((!AbstractC166987dD.A0x(A0r2).getBoolean("bc_custom_themes_has_seen_new_icon_in_thread_details", false)) && e70.A09 == 29 && e70.A0E(A0r2.userId)) {
                    AbstractC167007dF.A17(AbstractC31176DnK.A0e(AbstractC166987dD.A0r(interfaceC09390do)), "bc_custom_themes_has_seen_new_icon_in_thread_details");
                }
                C32314ELd.A05(EnumC33502Erb.THEME, c32314ELd);
                AbstractC160827Iq.A02((Context) this.A01, c32314ELd, AbstractC166987dD.A0r(interfaceC09390do), (C32056E6i) this.A02);
                i2 = -1047897034;
                C0f9.A0C(i2, A052);
                return;
            case 5:
                A052 = C0f9.A05(-345069742);
                Context context = (Context) this.A02;
                UserSession userSession2 = (UserSession) this.A04;
                View view2 = ((FKV) this.A03).A00;
                List<C32788Ebs> list = ((C32787Ebr) this.A01).A02;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                for (C32788Ebs c32788Ebs : list) {
                    A0q.add(new C199928sw(null, context.getDrawable(c32788Ebs.A00), null, new G85(c32788Ebs, 6), c32788Ebs.A04, AbstractC166997dE.A0p(context, c32788Ebs.A01), 0, 0, 0, false, false, false, true, false, false, false));
                }
                AbstractC31174DnI.A0X(context, userSession2, A0q, false).showAsDropDown(view2, (-view2.getMeasuredWidth()) / 2, 0);
                i2 = -731697924;
                C0f9.A0C(i2, A052);
                return;
            case 6:
                A05 = C0f9.A05(1019443189);
                InterfaceC132405yL interfaceC132405yL = ((C31637Dv3) this.A04).A03;
                int i6 = ((C32083E8h) this.A02).A00;
                interfaceC132405yL.Dld((C31446Drq) this.A01, (DirectShareTarget) this.A03, "inbox_channel_invitation", i6, i6, 0, 0, 39);
                i = 145641522;
                C0f9.A0C(i, A05);
                return;
            case 7:
                UserSession userSession3 = (UserSession) this.A01;
                C26055Bfi c26055Bfi2 = (C26055Bfi) this.A03;
                InterfaceC37209GaK interfaceC37209GaK = (InterfaceC37209GaK) this.A04;
                if (!C26055Bfi.A00(c26055Bfi2, 0)) {
                    return;
                }
                HashMap A022 = C23031Ai.A02(AbstractC23021Ah.A00(userSession3), "contacts_in_sharesheet_access_map");
                String A0u2 = AbstractC166997dE.A0u(c26055Bfi2);
                double d = 0.0d;
                Number number = (Number) A022.getOrDefault(A0u2, Double.valueOf(0.0d));
                if (number != null) {
                    d = number.doubleValue();
                }
                AbstractC166997dE.A1T(A0u2, A022, Double.valueOf(d).doubleValue() + 1.0d);
                C23031Ai.A05(AbstractC23021Ah.A00(userSession3), "contacts_in_sharesheet_access_map", A022);
                ((C36460G6k) interfaceC37209GaK).A00.A0B.DYM(c26055Bfi2);
                return;
            case 8:
                A052 = C0f9.A05(999934486);
                LocationDetailFragment locationDetailFragment = (LocationDetailFragment) this.A02;
                User user = (User) this.A04;
                InterfaceC111194zh interfaceC111194zh = (InterfaceC111194zh) this.A03;
                AbstractC31173DnH.A1W(locationDetailFragment.A02, AbstractC31173DnH.A0V(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_order");
                String url = interfaceC111194zh.getUrl();
                if (!TextUtils.isEmpty(url) && !AbstractC1566171j.A04(locationDetailFragment.requireActivity(), null, user.A03.Ayk(), url)) {
                    C63397SjR c63397SjR = new C63397SjR(locationDetailFragment.requireActivity(), locationDetailFragment.getSession(), C2Fb.A3V, url);
                    c63397SjR.A0E(locationDetailFragment.getSession().userId);
                    c63397SjR.A0S = AbstractC111324zv.A00(111);
                    c63397SjR.A0A();
                }
                i2 = 539550609;
                C0f9.A0C(i2, A052);
                return;
            case 9:
                A05 = C0f9.A05(1705663512);
                C31943E1x c31943E1x = (C31943E1x) this.A04;
                int i7 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                FPN fpn = c31943E1x.A00;
                User user2 = (User) this.A02;
                UserSession userSession4 = (UserSession) this.A03;
                ((Fragment) this.A01).requireActivity();
                fpn.A00(userSession4, user2);
                i = 735196167;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(-1760174731);
                ((CU7) this.A04).A01.BRS().Di5((C38321qM) this.A01, (C75113Zb) this.A02, ((AnonymousClass414) this.A03).A01);
                i = 1055149157;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A053 = C0f9.A05(-1621271693);
                Context context2 = (Context) this.A01;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
                if (abstractC12990ll != null) {
                    String A023 = AbstractC63260SgI.A02(context2, MSV.A00(97));
                    C14360o3.A07(A023);
                    AbstractC35175FfS.A02(context2, (InterfaceC11380iw) this.A03, abstractC12990ll, (InterfaceC37125GXm) this.A02, A023, context2.getString(2131975274));
                    i3 = -1353994865;
                    C0f9.A0C(i3, A053);
                    return;
                }
                IllegalStateException A14 = AbstractC166987dD.A14("Required value was null.");
                C0f9.A0C(-546787226, A053);
                throw A14;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A052 = C0f9.A05(2071192054);
                IgdsPeopleCell igdsPeopleCell = (IgdsPeopleCell) this.A04;
                String str2 = igdsPeopleCell.A01;
                C38E c38e = igdsPeopleCell.A00;
                if (c38e != null && str2 != null) {
                    c38e.A0C = str2;
                    Context context3 = igdsPeopleCell.getContext();
                    AbstractC31171DnF.A1O(context3);
                    GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) this.A01;
                    c38e.A05 = new C31559Dtj((Activity) context3, gradientSpinnerAvatarView.getAvatarBounds(), new GF2(2));
                    Reel reel = (Reel) this.A02;
                    List list2 = (List) this.A03;
                    c38e.A0A(reel, C3G2.A23, gradientSpinnerAvatarView, list2, list2, list2);
                }
                i2 = -1313173505;
                C0f9.A0C(i2, A052);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((InterfaceC58311Pt3) this.A01).D4J((Reel) this.A02, new GF5((CircularImageView) this.A03, (GradientSpinner) this.A04));
                return;
            case 14:
                A052 = C0f9.A05(-242913283);
                switch (((EnumC151426rk) this.A01).ordinal()) {
                    case 0:
                        ((InterfaceC151446rm) this.A03).D0l((User) this.A04, "cta");
                        break;
                    case 1:
                        ((InterfaceC151446rm) this.A03).D0m((User) this.A04, "cta");
                        break;
                    case 2:
                        ((InterfaceC151446rm) this.A03).D0j((User) this.A04, "cta");
                        break;
                    case 4:
                        ((InterfaceC151446rm) this.A03).D0i((Context) this.A02, (User) this.A04, "cta");
                        break;
                    case 5:
                        ((InterfaceC151446rm) this.A03).D0f((User) this.A04, "cta");
                        break;
                    case 6:
                        ((InterfaceC151446rm) this.A03).D0y((User) this.A04, "cta");
                        break;
                    case 7:
                        ((InterfaceC151446rm) this.A03).D0s((User) this.A04, "cta");
                        break;
                }
                i2 = -1839883783;
                C0f9.A0C(i2, A052);
                return;
            case Process.SIGTERM /* 15 */:
                A052 = C0f9.A05(-1129629509);
                IgFormField igFormField = (IgFormField) this.A01;
                Editable text = igFormField.getMEditText().getText();
                C14360o3.A07(text);
                if (text.length() == 0) {
                    EditText mEditText = igFormField.getMEditText();
                    MUD mud = ((C35008Fbf) this.A04).A00;
                    String str3 = mud.A01;
                    if (str3 == null) {
                        str3 = mud.A02;
                    }
                    mEditText.setText(str3);
                    C32024E5c c32024E5c = (C32024E5c) this.A02;
                    c32024E5c.A03 = true;
                    c32024E5c.A04 = true;
                }
                C14510oO c14510oO = (C14510oO) this.A03;
                if (!c14510oO.A00) {
                    EditText mEditText2 = igFormField.getMEditText();
                    MUD mud2 = ((C35008Fbf) this.A04).A00;
                    Number number2 = (Number) mud2.A00;
                    if (number2 != null) {
                        length = number2.intValue();
                    } else {
                        String str4 = mud2.A01;
                        if (str4 == null) {
                            str4 = mud2.A02;
                        }
                        length = str4.length();
                    }
                    mEditText2.setSelection(length);
                    c14510oO.A00 = true;
                }
                i2 = -584357714;
                C0f9.A0C(i2, A052);
                return;
            case 16:
                A05 = C0f9.A05(-39811594);
                User user3 = (User) this.A04;
                user3.getId();
                EMP emp = (EMP) this.A02;
                EN7 en7 = new EN7();
                GroupMentionQuickReplySheetContent groupMentionQuickReplySheetContent = new GroupMentionQuickReplySheetContent(user3.Bhu(), user3.getUsername(), user3.getId());
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putParcelable("content", groupMentionQuickReplySheetContent);
                String str5 = emp.A06;
                if (str5 == null) {
                    str = "baseReelId";
                } else {
                    A0b.putString("group_mention_base_reel_id", str5);
                    String str6 = emp.A07;
                    if (str6 == null) {
                        str = "baseReelItemId";
                    } else {
                        A0b.putString("group_mention_base_reel_item_id", str6);
                        User user4 = emp.A05;
                        if (user4 == null) {
                            str = "baseReelOwner";
                        } else {
                            A0b.putParcelable("group_mention_base_reel_owner", user4);
                            en7.setArguments(A0b);
                            C189478aR A00 = F86.A00(AbstractC25230BEn.A0m(emp));
                            C189448aO A0g = AbstractC25231BEo.A0g(emp.A0D);
                            if (A00 != null) {
                                A00.A0F(en7, A0g);
                            }
                            i = -599898492;
                            C0f9.A0C(i, A05);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 17:
                A052 = C0f9.A05(1458523780);
                Context context4 = (Context) this.A01;
                C14360o3.A0A(context4);
                FBUserTag fBUserTag = (FBUserTag) this.A03;
                InterfaceC37183GZu interfaceC37183GZu = (InterfaceC37183GZu) this.A02;
                AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A04;
                FragmentActivity B8O = interfaceC37183GZu.B8O();
                if (!C35134Feb.A00.A01(context4) && B8O != null && C18U.A06(C06090Tz.A05, abstractC12990ll2, 36325347331027981L)) {
                    AbstractC34210F7i.A00(B8O, C05F.A01, fBUserTag.A02.A02, new C43208J8f(42, context4, fBUserTag));
                } else {
                    FBUserTag.FBUserInfo fBUserInfo = fBUserTag.A02;
                    C35134Feb.A00(context4, fBUserInfo.A02, fBUserInfo.A04);
                }
                interfaceC37183GZu.DFQ(fBUserTag);
                i2 = 805656759;
                C0f9.A0C(i2, A052);
                return;
            case 18:
                A053 = C0f9.A05(-1463775179);
                EVJ evj = (EVJ) this.A01;
                AbstractC31175DnJ.A1N(new C147036jf(evj.A03, evj.A04).A02, AbstractC111324zv.A00(2539));
                UserSession userSession5 = (UserSession) this.A04;
                FO6 fo6 = (FO6) this.A02;
                C35785FrN.A00(userSession5, fo6.A03, fo6, (C34686FPx) this.A03);
                i3 = -1916988357;
                C0f9.A0C(i3, A053);
                return;
            case Process.SIGSTOP /* 19 */:
                A053 = C0f9.A05(1677726852);
                Activity activity = (Activity) this.A01;
                UserSession userSession6 = (UserSession) this.A04;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
                C36881nl A01 = C36881nl.A01(activity, interfaceC11380iw, userSession6, "message_button");
                User user5 = (User) this.A03;
                AbstractC31179DnN.A1Q(A01, user5);
                A01.A06();
                FYD.A00(interfaceC11380iw, userSession6, user5);
                i3 = -1500795479;
                C0f9.A0C(i3, A053);
                return;
            case 20:
                A053 = C0f9.A05(-920628430);
                UserSession userSession7 = (UserSession) this.A04;
                AbstractC31178DnM.A1O(userSession7, (EnumC33408Epf) this.A03, C05F.A0R, AbstractC31174DnI.A07(userSession7));
                ((C189448aO) this.A01).A00().A03((Context) this.A02, new C33192Eke());
                i3 = -1614510697;
                C0f9.A0C(i3, A053);
                return;
            case 21:
                A052 = C0f9.A05(399795402);
                Context context5 = (Context) this.A02;
                TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment = (TimeSpentReminderFullyBlockingFragment) this.A01;
                C50674MYs c50674MYs = new C50674MYs(context5, timeSpentReminderFullyBlockingFragment.A01);
                UserSession userSession8 = timeSpentReminderFullyBlockingFragment.A01;
                for (String str7 : C18U.A04(AbstractC166997dE.A0U(userSession8), userSession8, 36888623701885752L).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)) {
                    long longValue = Long.valueOf(str7).longValue();
                    Resources A0N = AbstractC166997dE.A0N(timeSpentReminderFullyBlockingFragment);
                    if (longValue == SandboxRepository.CACHE_TTL) {
                        A0r = A0N.getString(2131963400);
                    } else {
                        A0r = AbstractC166997dE.A0r(A0N, Long.toString(longValue / 60), 2131963401);
                    }
                    c50674MYs.A0B(A0r, new ViewOnClickListenerC35566FnI(this, longValue, 1));
                }
                C31727DwY.A01(context5, c50674MYs);
                i2 = 1409324413;
                C0f9.A0C(i2, A052);
                return;
            case 22:
                A052 = C0f9.A05(-2092361869);
                C34959Faj c34959Faj = new C34959Faj((Activity) this.A01, (Fragment) this.A02, (UserSession) this.A04);
                C217859kI c217859kI = (C217859kI) this.A03;
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = c217859kI.A05.iterator();
                while (it.hasNext()) {
                    AbstractC31178DnM.A1V(A1E, it);
                }
                C2DS c2ds = c34959Faj.A04;
                if (c2ds.B3W(AbstractC35052FcP.A01(A1E)) == null) {
                    UserSession userSession9 = c34959Faj.A02;
                    String A002 = AbstractC68470VSb.A00();
                    String str8 = c217859kI.A00.A03;
                    if (str8 == null) {
                        str8 = "";
                    }
                    EE9.A00(DirectThreadApi.A0C(userSession9, A002, C34959Faj.A00(str8, A1E), AbstractC35052FcP.A02(A1E)), userSession9, c34959Faj, 10);
                }
                C31600DuS c31600DuS = c34959Faj.A03;
                c31600DuS.A09 = A1E;
                c31600DuS.A08 = null;
                C81663kb B3W = c2ds.B3W(AbstractC35052FcP.A01(A1E));
                if (B3W != null && (C7I = B3W.C7I()) != null) {
                    c122145g6 = AbstractC31171DnF.A0N(C7I);
                } else {
                    c122145g6 = new C122145g6(AbstractC35052FcP.A01(A1E));
                }
                String A003 = C34959Faj.A00("", A1E);
                Activity activity2 = c34959Faj.A00;
                UserSession userSession10 = c34959Faj.A02;
                Fragment fragment = c34959Faj.A01;
                C14360o3.A0C(fragment, MSV.A00(9));
                C36881nl A012 = C36881nl.A01(activity2, (InterfaceC11380iw) fragment, userSession10, "inbox_new_message");
                A012.A0B = c122145g6;
                A012.A0n = true;
                A012.A01 = fragment;
                A012.A0s = true;
                A012.A0h = A003;
                C36395G3w.A00(A012, c34959Faj, 17);
                i2 = -1250151441;
                C0f9.A0C(i2, A052);
                return;
            default:
                return;
        }
    }
}
