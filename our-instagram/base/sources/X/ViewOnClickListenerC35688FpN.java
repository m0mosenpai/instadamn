package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.FpN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35688FpN implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public ViewOnClickListenerC35688FpN(E06 e06, Object obj, int i, int i2) {
        this.A00 = i2;
        this.A03 = e06;
        if (18 - i2 != 0) {
            this.A01 = i;
            this.A02 = obj;
        } else {
            this.A02 = obj;
            this.A01 = i;
        }
    }

    public static void A00(View view, Object obj, Object obj2, int i, int i2) {
        C0fQ.A00(new ViewOnClickListenerC35688FpN(i, i2, obj, obj2), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57, types: [X.MUD, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v58 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        String str2;
        InterfaceC83733oI interfaceC83733oI;
        String str3;
        int A052;
        int i2;
        String str4;
        C5HW c5hw;
        InterfaceC58311Pt3 interfaceC58311Pt3;
        int i3;
        String str5;
        ?? r2;
        EnumC33370Ep3 enumC33370Ep3;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-788176539);
                ((InterfaceC37290Gbr) this.A02).Dgb(AbstractC13880nE.A0G(((E4B) this.A03).A06), this.A01);
                i = 254271978;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(137860705);
                C32678Ea5 c32678Ea5 = (C32678Ea5) this.A02;
                GradientSpinnerAvatarView gradientSpinnerAvatarView = ((E4C) this.A03).A0E;
                if (gradientSpinnerAvatarView == null) {
                    i = -554524180;
                } else {
                    c32678Ea5.A0B.Dgb(AbstractC31174DnI.A0A(gradientSpinnerAvatarView), this.A01);
                    i = 1191514865;
                }
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(935282602);
                ((C32678Ea5) this.A02).A0B.Dgb(AbstractC13880nE.A0G(((E4A) this.A03).A04), this.A01);
                i = -1989016112;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(-596548181);
                HashMap A1G = AbstractC166987dD.A1G();
                C32314ELd c32314ELd = (C32314ELd) this.A03;
                E70 e70 = c32314ELd.A0Z;
                String str6 = null;
                if (e70 != null) {
                    str = e70.A0P;
                } else {
                    str = null;
                }
                String str7 = "";
                if (str == null) {
                    str = "";
                }
                A1G.put("channel_name", str);
                E70 e702 = c32314ELd.A0Z;
                if (e702 != null && (str3 = e702.A0Q) != null) {
                    str7 = str3;
                }
                A1G.put("target_id", str7);
                A1G.put("period", "THIS_MONTH");
                C66277U6x A01 = C66277U6x.A01("com.bloks.www.ig.insights.account.channel.insights", A1G);
                FragmentActivity activity = c32314ELd.getActivity();
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(AbstractC166987dD.A0r(c32314ELd.A17));
                AbstractC31171DnF.A17(c32314ELd, A0C, 2131959070);
                A01.A04(activity, A0C);
                C142846ck c142846ck = (C142846ck) this.A02;
                E70 e703 = c32314ELd.A0Z;
                if (e703 != null && (interfaceC83733oI = e703.A0L) != null) {
                    str2 = AbstractC1345466e.A07(interfaceC83733oI);
                } else {
                    str2 = null;
                }
                E70 e704 = c32314ELd.A0Z;
                if (e704 != null) {
                    str6 = e704.A0Q;
                }
                int i4 = this.A01;
                C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
                if (AbstractC25226BEj.A1Z(A0I)) {
                    AbstractC31175DnJ.A1B(A0I, c142846ck);
                    AbstractC31174DnI.A1I(A0I, "render_channel_insights");
                    A0I.A0o("channel_insights_button");
                    AbstractC31177DnL.A1H(A0I, c142846ck, AbstractC31179DnN.A0a(A0I, "thread_details", str2, str6, i4));
                }
                i = -1835101406;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(-164876294);
                C3o9 c3o9 = (C3o9) this.A02;
                if (JRE.A0A(c3o9)) {
                    G35 g35 = (G35) this.A03;
                    Context context = g35.A00;
                    FragmentActivity fragmentActivity = g35.A01;
                    UserSession userSession = g35.A03;
                    if (!C35244Fgd.A03(fragmentActivity, context, g35.A02, userSession, null, C7KH.A00(g35.A04), true)) {
                        C35244Fgd c35244Fgd = C35244Fgd.A00;
                        C2DS A00 = AbstractC28761aE.A00(userSession);
                        DirectThreadKey A012 = JRE.A01(c3o9);
                        int i5 = this.A01;
                        c35244Fgd.A04(context, new C32071E6x(i5), userSession, A00, A012, new C57249PbX(i5, 26, g35), false);
                    }
                }
                i = 1401657114;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(-1604803794);
                FG1 fg1 = (FG1) this.A03;
                DirectSearchPrompt directSearchPrompt = (DirectSearchPrompt) this.A02;
                int i6 = this.A01;
                C36010Fv8 c36010Fv8 = fg1.A00;
                UserSession userSession2 = c36010Fv8.A0D;
                C06090Tz A0j = AbstractC25225BEi.A0j(userSession2, 0);
                if (C18U.A06(A0j, userSession2, 36327997325720604L) && C18U.A06(A0j, userSession2, 36327997326048289L)) {
                    AbstractC34148F4y.A00(userSession2, c36010Fv8.A0G, directSearchPrompt.A03, AbstractC111324zv.A00(1812));
                } else {
                    C36010Fv8.A00(c36010Fv8, directSearchPrompt, i6, false);
                }
                i = -868924137;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(-617252393);
                ((InterfaceC37215GaQ) this.A02).Dhg((User) this.A03, this.A01);
                i = -1584467591;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(-1402673657);
                ((InterfaceC37215GaQ) this.A02).DAu((FOC) this.A03, this.A01);
                i = 631448137;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(1900989958);
                ((InterfaceC37215GaQ) this.A02).Dhf((Hashtag) this.A03, this.A01);
                i = 740332511;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(1231576783);
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) this.A02;
                if (onClickListener != null) {
                    onClickListener.onClick(((C31584DuC) this.A03).A00, this.A01);
                }
                ((C31584DuC) this.A03).A00.dismiss();
                i = -271638294;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(-117243964);
                E00 e00 = (E00) this.A03;
                C36279FzW A002 = AbstractC34241F8n.A00(e00.A03);
                E8D e8d = (E8D) ((InterfaceC37253Gb6) this.A02);
                String str8 = e8d.A06;
                int i7 = this.A01;
                String str9 = e00.A00;
                boolean A1T = AbstractC167007dF.A1T(e8d.A02);
                AbstractC167017dG.A1O(str8, str9);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A002.A00, "igd_channels_client_actions");
                if (A0f.isSampled()) {
                    A0f.AAP("user_igid", A002.A01);
                    AbstractC31171DnF.A1B(A0f, "channel_suggestion_clicked");
                    AbstractC31171DnF.A1E(A0f, "feed_netego");
                    AbstractC25232BEp.A1K(A0f, "channel_suggestion_item");
                    AbstractC31178DnM.A1A(A0f, str8, i7);
                    A0f.AAP("ranking_request_id", str9);
                    AbstractC31174DnI.A1F(A0f, AbstractC167007dF.A0n("is_follower", AbstractC31172DnG.A0z(A1T ? 1 : 0)));
                }
                String str10 = e8d.A04;
                if (str10 != null) {
                    e00.A04.A00(str8, str10);
                }
                i = 2083712516;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = C0f9.A05(501330706);
                E00 e002 = (E00) this.A03;
                C36279FzW A003 = AbstractC34241F8n.A00(e002.A03);
                E8D e8d2 = (E8D) ((InterfaceC37253Gb6) this.A02);
                String str11 = e8d2.A06;
                int i8 = this.A01;
                String str12 = e002.A00;
                boolean A1T2 = AbstractC167007dF.A1T(e8d2.A02);
                AbstractC167017dG.A1O(str11, str12);
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(A003.A00, "igd_channels_client_actions");
                if (A0f2.isSampled()) {
                    A0f2.AAP("user_igid", A003.A01);
                    AbstractC31171DnF.A1B(A0f2, "dismiss_channel_suggestion");
                    AbstractC31171DnF.A1E(A0f2, "feed_netego");
                    AbstractC25232BEp.A1K(A0f2, "dismiss_suggestion_button");
                    AbstractC31178DnM.A1A(A0f2, str11, i8);
                    A0f2.AAP("ranking_request_id", str12);
                    AbstractC31174DnI.A1F(A0f2, AbstractC167007dF.A0n("is_follower", AbstractC31172DnG.A0z(A1T2 ? 1 : 0)));
                }
                ArrayList arrayList = e002.A01;
                if (arrayList != null) {
                    arrayList.remove(i8);
                }
                e002.notifyDataSetChanged();
                i = 1540644065;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                c5hw = (C5HW) this.A02;
                interfaceC58311Pt3 = (InterfaceC58311Pt3) this.A03;
                i3 = this.A01;
                if (!TextUtils.isEmpty(c5hw.A04.A0f)) {
                    str5 = c5hw.A04.A0f;
                    r2 = 0;
                    enumC33370Ep3 = EnumC33370Ep3.A02;
                    interfaceC58311Pt3.Dxj(new C51693MsO(r2, enumC33370Ep3, r2, i3), c5hw, str5, i3);
                    return;
                }
                return;
            case 14:
                c5hw = (C5HW) this.A02;
                interfaceC58311Pt3 = (InterfaceC58311Pt3) this.A03;
                i3 = this.A01;
                str5 = c5hw.A04.A0f;
                if (str5 == null) {
                    C0w9.A03(AbstractC111324zv.A00(658), "Profile ID should not be null.");
                    str5 = "";
                }
                r2 = 0;
                enumC33370Ep3 = EnumC33370Ep3.A0C;
                interfaceC58311Pt3.Dxj(new C51693MsO(r2, enumC33370Ep3, r2, i3), c5hw, str5, i3);
                return;
            case Process.SIGTERM /* 15 */:
                InterfaceC58311Pt3 interfaceC58311Pt32 = (InterfaceC58311Pt3) this.A02;
                C5HW c5hw2 = (C5HW) this.A03;
                int i9 = this.A01;
                interfaceC58311Pt32.Dhk(new C51693MsO(null, EnumC33370Ep3.A02, null, i9), c5hw2, i9);
                return;
            case 16:
                InterfaceC58311Pt3 interfaceC58311Pt33 = (InterfaceC58311Pt3) this.A02;
                C5HW c5hw3 = (C5HW) this.A03;
                int i10 = this.A01;
                String str13 = c5hw3.A04.A0f;
                Pattern pattern = AbstractC13670mt.A01;
                if (str13 == null) {
                    str13 = "";
                }
                interfaceC58311Pt33.Dxj(new C51693MsO(null, EnumC33370Ep3.A0C, null, i10), c5hw3, str13, i10);
                return;
            case 17:
                A052 = C0f9.A05(1484445974);
                C32260EIu c32260EIu = ((E06) this.A03).A0A;
                String id = AbstractC25225BEi.A0x((List) this.A02, this.A01).getId();
                if (id != null) {
                    C140966Yy A0c = AbstractC25231BEo.A0c(c32260EIu.requireActivity(), c32260EIu.A09);
                    C35028Fc1 A004 = C35028Fc1.A00(id);
                    A004.A0E = "ip_discover_accounts";
                    A004.A0O = true;
                    A0c.A0D(A004.A02());
                    A0c.A04();
                    i2 = -878612533;
                    C0f9.A0C(i2, A052);
                    return;
                }
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0C(530776228, A052);
                throw A0g;
            case 18:
                A05 = C0f9.A05(-1895423876);
                E06 e06 = (E06) this.A03;
                Object obj = this.A02;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.api.schemas.SuggestedUserItem");
                E8F e8f = (E8F) obj;
                int i11 = this.A01;
                ArrayList arrayList2 = e06.A0B;
                arrayList2.remove(i11);
                e06.notifyItemRemoved(i11);
                e06.notifyItemRangeChanged(i11, arrayList2.size());
                C32260EIu c32260EIu2 = e06.A0A;
                int A005 = E06.A00(e06, i11);
                User user = e8f.A00;
                String A013 = E06.A01(e06, AbstractC25231BEo.A0t(user));
                String str14 = e8f.A05;
                if (user != null) {
                    C1GJ.A03(FY5.A01(AbstractC166987dD.A0r(c32260EIu2.A09), user.getId(), str14, e8f.A02));
                    C63702ur c63702ur = c32260EIu2.A02;
                    if (c63702ur == null) {
                        C14360o3.A0F("recommendedUserLogger");
                        throw C00O.createAndThrow();
                    }
                    c63702ur.A07(new C6PH(C32260EIu.A00(e8f, user, str14, A013, A005)));
                }
                i = 454084084;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(-667047126);
                E06 e062 = (E06) this.A03;
                boolean z = e062.A05;
                int i12 = this.A01;
                Object obj2 = this.A02;
                if (z) {
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.api.schemas.SuggestedUserItem>");
                    AbstractList abstractList = (AbstractList) obj2;
                    int min = Math.min(abstractList.size(), e062.A00);
                    int i13 = 0;
                    while (i13 < min) {
                        E8F e8f2 = (E8F) AbstractC31173DnH.A0i(abstractList, 0);
                        if (e8f2.A00 != null) {
                            e062.A0B.add(i12 + i13, e8f2);
                            abstractList.remove(0);
                            i13++;
                        }
                    }
                    e062.notifyItemRangeInserted(i12 + 1, i13);
                    if (abstractList.isEmpty()) {
                        int i14 = i12 + i13;
                        e062.A0B.remove(i14);
                        e062.notifyItemRemoved(i14);
                    }
                } else {
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.api.schemas.NuxMediaResponse>");
                    ArrayList arrayList3 = e062.A0B;
                    arrayList3.remove(i12);
                    e062.notifyItemRemoved(i12);
                    Iterator A13 = AbstractC166997dE.A13((AbstractCollection) obj2);
                    int i15 = 0;
                    while (A13.hasNext()) {
                        C115875Md c115875Md = (C115875Md) AbstractC166997dE.A0l(A13);
                        List list = c115875Md.A01;
                        if (c115875Md.A00 != null && list != null && AbstractC166987dD.A1b(list)) {
                            arrayList3.add(i12 + i15, c115875Md);
                            i15++;
                        }
                    }
                    e062.notifyItemRangeInserted(i12, i15);
                }
                i = -2088907867;
                C0f9.A0C(i, A05);
                return;
            case 20:
                A05 = C0f9.A05(-1897134210);
                ENJ enj = (ENJ) this.A02;
                FQK fqk = (FQK) this.A03;
                int i16 = this.A01;
                List list2 = fqk.A05;
                int size = list2.size();
                int i17 = fqk.A00;
                int i18 = size - i17;
                int i19 = 10;
                if (fqk.A03) {
                    i19 = 50;
                }
                if (i18 < i19 && (str4 = fqk.A02) != null) {
                    ENJ.A03(enj, fqk.A04, str4, false);
                } else {
                    int i20 = i17 + i16;
                    fqk.A00 = i20;
                    int size2 = list2.size();
                    int i21 = fqk.A01;
                    if (i20 == size2) {
                        i16--;
                    }
                    fqk.A01 = i21 + i16;
                    C0fA.A00(enj.A06, -348973539);
                }
                i = -1944679452;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(269258863);
                DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) this.A02;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(((C34645FOc) this.A03).A05, this.A01);
                }
                ((C34645FOc) this.A03).A05.dismiss();
                i = -768882713;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A052 = C0f9.A05(-1193025301);
                ((EMP) this.A02).A00((User) this.A03);
                i2 = -1355145915;
                C0f9.A0C(i2, A052);
                return;
            case 23:
                A052 = C0f9.A05(234602078);
                ((EMP) this.A02).A00((User) this.A03);
                i2 = 940408595;
                C0f9.A0C(i2, A052);
                return;
            case 24:
                A05 = C0f9.A05(-1995551333);
                C214709f8 c214709f8 = ((C66415UGj) this.A03).A00;
                int i22 = this.A01;
                A5N a5n = c214709f8.A00;
                if (a5n != null) {
                    C218049kc c218049kc = a5n.A00;
                    c218049kc.A00 = i22;
                    C218049kc.A00(C5GJ.CREATE_MODE_VIEW_ALL_SELECTION, c218049kc, i22);
                    C3DN A014 = C3DN.A00.A01(c214709f8.getContext());
                    A014.getClass();
                    A014.A0B();
                }
                i = -2106007623;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A052 = C0f9.A05(-1889042598);
                ((InterfaceC37182GZt) this.A02).Dy8((User) this.A03, this.A01);
                i2 = 1170570540;
                C0f9.A0C(i2, A052);
                return;
            case 26:
                A052 = C0f9.A05(1015150197);
                ((InterfaceC37182GZt) this.A02).DT2((User) this.A03, this.A01);
                i2 = -2068942474;
                C0f9.A0C(i2, A052);
                return;
            case 27:
                A052 = C0f9.A05(-2031035338);
                ((InterfaceC37184GZv) this.A02).Dy8((User) this.A03, this.A01);
                i2 = 253556351;
                C0f9.A0C(i2, A052);
                return;
            case 28:
                A052 = C0f9.A05(-1682209033);
                ((InterfaceC37184GZv) this.A02).Dy8((User) this.A03, this.A01);
                i2 = -627338076;
                C0f9.A0C(i2, A052);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A052 = C0f9.A05(-1049400939);
                InterfaceC37229Gae interfaceC37229Gae = (InterfaceC37229Gae) this.A02;
                interfaceC37229Gae.D12();
                UserSession userSession3 = (UserSession) this.A03;
                int i23 = this.A01;
                boolean CRX = interfaceC37229Gae.CRX(userSession3, null);
                InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(null, userSession3), "ig_non_feed_activation_click");
                A0f3.A7v("completed", AbstractC31173DnH.A0e(A0f3, "card_type", interfaceC37229Gae.BfQ(), CRX));
                A0f3.A9K("pos", AbstractC31171DnF.A0V(i23));
                A0f3.Cht();
                i2 = 238517003;
                C0f9.A0C(i2, A052);
                return;
            case 30:
                A052 = C0f9.A05(-1860526290);
                ((GZX) this.A02).Dxd((User) this.A03, this.A01);
                i2 = 2143183785;
                C0f9.A0C(i2, A052);
                return;
        }
    }

    public ViewOnClickListenerC35688FpN(InterfaceC58311Pt3 interfaceC58311Pt3, C5HW c5hw, int i, int i2) {
        this.A00 = i2;
        switch (i2) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
                this.A02 = c5hw;
                this.A03 = interfaceC58311Pt3;
                break;
            default:
                this.A02 = interfaceC58311Pt3;
                this.A03 = c5hw;
                break;
        }
        this.A01 = i;
    }

    public ViewOnClickListenerC35688FpN(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }
}
