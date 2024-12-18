package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class KKo extends C3PD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public KKo(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(C3P9 c3p9, Object obj, Object obj2, int i) {
        c3p9.A04 = new KKo(i, obj, obj2);
        c3p9.A00();
    }

    @Override // X.C3PD, X.C3PE
    public final void DQY(View view) {
        switch (this.A00) {
            case 1:
                C14360o3.A0B(view, 0);
                view.performHapticFeedback(0);
                if (!C18U.A06(C06090Tz.A05, ((KJR) this.A02).A01, 2342162695777820244L)) {
                    return;
                }
                C45207Jzn c45207Jzn = (C45207Jzn) this.A01;
                c45207Jzn.A01.Cu9(view, c45207Jzn.A02, c45207Jzn.A03);
                return;
            case 5:
                C14360o3.A0B(view, 0);
                C47339Kvo c47339Kvo = ((KIB) this.A02).A02;
                C148286ly c148286ly = ((C45194Jza) this.A01).A01;
                C14360o3.A0B(c148286ly, 1);
                C48733Lh1 c48733Lh1 = c47339Kvo.A00.A03;
                ArrayList A1E = AbstractC166987dD.A1E();
                String str = c148286ly.A0S;
                C14360o3.A07(str);
                A1E.add(new WjJ(new C48696LgQ(c48733Lh1), str));
                if (c48733Lh1.A0X) {
                    UserSession userSession = c48733Lh1.A0G;
                    if (C18U.A06(C06090Tz.A05, userSession, 36325102518022886L)) {
                        String str2 = c148286ly.A0S;
                        C14360o3.A07(str2);
                        A1E.add(new WjK(new C45105JxZ(new JWd(c148286ly, "", 8), 1), new C29266CvN(c48733Lh1, 0), LJL.A03(userSession, str2)));
                    }
                }
                AbstractC46756KmD.A00(view, c48733Lh1.A0G, A1E);
                return;
            case 7:
                C14360o3.A0B(view, 0);
                C47644L2d c47644L2d = (C47644L2d) this.A01;
                C45026JwH c45026JwH = (C45026JwH) this.A02;
                LIE lie = c47644L2d.A02;
                if (!AbstractC167007dF.A1Z(lie.A0F)) {
                    return;
                }
                AbstractC46756KmD.A00(view, lie.A06, AbstractC166987dD.A1J(new WjK(new C45105JxZ(new JWd(c45026JwH, ""), 2), new C48698LgS(1, c47644L2d.A01, lie), ((C44164JfT) lie.A0E.getValue()).A02(c45026JwH.A01.A05))));
                return;
            case Process.SIGTERM /* 15 */:
                AbstractC25228BEl.A1P(this.A01);
                return;
            default:
                super.DQY(view);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        Medium medium;
        long j;
        Number number;
        String str;
        String str2;
        InterfaceC16820sZ interfaceC16820sZ;
        C45510KCz c45510KCz;
        View view2;
        String str3;
        switch (this.A00) {
            case 0:
                K03 k03 = (K03) this.A01;
                k03.A03.invoke(k03.A01, k03.A00);
                return true;
            case 1:
                C22C A01 = AnonymousClass229.A01(((KJR) this.A02).A01);
                C45207Jzn c45207Jzn = (C45207Jzn) this.A01;
                C148286ly c148286ly = c45207Jzn.A02;
                String str4 = c148286ly.A0S;
                Long A0V = AbstractC31171DnF.A0V(c45207Jzn.A00);
                String str5 = c45207Jzn.A03;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_sticker_click");
                C22M c22m = ((C22F) A01).A04;
                String str6 = c22m.A0U;
                String str7 = c22m.A0L;
                if (A0f.isSampled() && str7 != null && str6 != null) {
                    AbstractC166987dD.A1S(A0f, str7);
                    A0f.A8R(EnumC114925Hg.STORY, "camera_destination");
                    AbstractC167017dG.A1A(c22m.A09, A0f);
                    AbstractC167017dG.A1B(A0f);
                    A0f.AAP("sticker_id", str4);
                    AbstractC166997dE.A1N(A0f, "sticker_source", 8);
                    A0f.AAP("sticker_tray_session_id", str6);
                    AbstractC43594JPz.A1B(A0f, c22m);
                    A0f.A8R(c22m.A0C, "surface");
                    A0f.A8R(VHl.A02, "sticker_type");
                    AbstractC166997dE.A1N(A0f, "camera_position", AbstractC167017dG.A0I(c22m));
                    AbstractC37302Gc3.A0t(A0f);
                    A0f.AAQ(AbstractC449424y.A07(((C22F) A01).A00, ((C22F) A01).A03), "system_info");
                    A0f.AAP("browse_session_id", str5);
                    A0f.A9K("position", A0V);
                    A0f.Cht();
                }
                C448724r c448724r = A01.A0F;
                C14360o3.A0B(str4, 0);
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c448724r.A01, "ig_camera_ui_tool_click");
                C22M c22m2 = c448724r.A04;
                String str8 = c22m2.A0U;
                if (A0f2.isSampled() && str8 != null) {
                    A0f2.A8R(C81X.A2V, "tool_type");
                    A0f2.AAP("legacy_falco_event_name", "IG_CAMERA_STICKER_CLICK");
                    String str9 = c22m2.A0L;
                    if (str9 == null) {
                        str9 = "";
                    }
                    AbstractC166987dD.A1S(A0f2, str9);
                    A0f2.A8R(EnumC114925Hg.STORY, "camera_destination");
                    AbstractC167017dG.A1A(c22m2.A09, A0f2);
                    AbstractC167017dG.A1B(A0f2);
                    A0f2.AAP("sticker_id", str4);
                    AbstractC166997dE.A1N(A0f2, "sticker_source", 8);
                    A0f2.AAP("sticker_tray_session_id", str8);
                    AbstractC43594JPz.A1B(A0f2, c22m2);
                    A0f2.A8R(c22m2.A0C, "surface");
                    A0f2.A8R(VHl.A02, "sticker_type");
                    AbstractC166997dE.A1N(A0f2, "camera_position", AbstractC167017dG.A0I(c22m2));
                    AbstractC37302Gc3.A0t(A0f2);
                    A0f2.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
                    A0f2.AAP("browse_session_id", str5);
                    A0f2.A9K("position", A0V);
                    A0f2.Cht();
                }
                c45207Jzn.A01.CwD(c148286ly, str5);
                return true;
            case 2:
                C44773Jru c44773Jru = (C44773Jru) this.A02;
                if ((c44773Jru.A04.getDrawable() instanceof C9Rz) && (medium = c44773Jru.A02) != null) {
                    ((MOO) this.A01).DNt(medium);
                    return true;
                }
                return true;
            case 3:
                ((C8DN) this.A01).A05();
                AbstractC135966Db.A01((UserSession) this.A02).A0C(EnumC46303KeZ.A09);
                return true;
            case 4:
                ((KIM) this.A02).A02.Cyk(((K01) this.A01).A00);
                return true;
            case 5:
                KIB kib = (KIB) this.A02;
                C47339Kvo c47339Kvo = kib.A02;
                C148286ly c148286ly2 = ((C45194Jza) this.A01).A01;
                C14360o3.A0B(c148286ly2, 0);
                C47933LFf c47933LFf = c47339Kvo.A00.A03.A0J.A00.A00;
                if (c47933LFf != null) {
                    C47326Kvb c47326Kvb = c47933LFf.A00.A07;
                    c47326Kvb.getClass();
                    MRR mrr = c47326Kvb.A00.A02;
                    if (mrr != null) {
                        mrr.D96(c148286ly2);
                    }
                }
                UserSession userSession = kib.A01;
                LBp.A01(userSession, new C49807LzE(null, c148286ly2, EnumC46173KcB.A04, null, null, System.currentTimeMillis()), AbstractC25225BEi.A07(AbstractC25225BEi.A0j(userSession, 1), userSession, 36609704232359889L));
                return true;
            case 6:
                ((InterfaceC159877Ez) this.A02).DNq(EnumC46186KcO.A0L, (C45026JwH) this.A01);
                return true;
            case 7:
                C47644L2d c47644L2d = (C47644L2d) this.A01;
                C45026JwH c45026JwH = (C45026JwH) this.A02;
                LIE lie = c47644L2d.A02;
                if (AbstractC167007dF.A1Z(lie.A0F)) {
                    DirectAnimatedMedia directAnimatedMedia = c45026JwH.A00;
                    L3N l3n = lie.A03;
                    if (l3n == null) {
                        str2 = "directGifCategoriesTabsManager";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    if (l3n.A02.getVisibility() == 0) {
                        number = (Number) ((C32073E6z) l3n.A03.get(l3n.A00)).A03;
                    } else {
                        number = C05F.A1F;
                    }
                    switch (number.intValue()) {
                        case 1:
                            str = "favorites";
                            break;
                        case 2:
                            str = AbstractC111324zv.A00(2883);
                            break;
                        case 3:
                            str = "laugh";
                            break;
                        case 4:
                            str = "love";
                            break;
                        case 5:
                            str = "sad";
                            break;
                        case 6:
                            str = AbstractC111324zv.A00(791);
                            break;
                        case 7:
                            str = "thumbs";
                            break;
                        case 8:
                            str = "search";
                            break;
                        default:
                            str = "recents";
                            break;
                    }
                    directAnimatedMedia.A00 = str;
                }
                InterfaceC159877Ez interfaceC159877Ez = lie.A09;
                if (interfaceC159877Ez != null) {
                    interfaceC159877Ez.DNq(lie.A0B, c45026JwH);
                }
                UserSession userSession2 = lie.A06;
                InterfaceC11380iw interfaceC11380iw = c47644L2d.A00;
                String str10 = lie.A0D;
                String str11 = c45026JwH.A00.A05;
                String str12 = lie.A04;
                boolean z = c45026JwH.A02;
                long currentTimeMillis = System.currentTimeMillis();
                boolean z2 = c47644L2d.A03;
                C14360o3.A0B(str11, 3);
                InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession2), "giphy_gif_send_attempt");
                if (A0f3.isSampled()) {
                    A0f3.AAP("gif_id", str11);
                    if (str10 == null) {
                        str10 = "";
                    }
                    A0f3.AAP(AbstractC31670Dva.A00(), str10);
                    A0f3.A8I("timestamp", Double.valueOf(currentTimeMillis));
                    if (z) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    A0f3.A9K("is_trending", Long.valueOf(j));
                    A0f3.AAP("response_id", str12);
                    AbstractC31175DnJ.A1A(A0f3, z2);
                    A0f3.Cht();
                    return true;
                }
                return true;
            case 8:
                return true;
            case 9:
                LLB llb = (LLB) this.A02;
                UserSession userSession3 = llb.A0Q;
                AbstractC135966Db.A01(userSession3).A0D(EnumC46303KeZ.A0S);
                C45842KQx c45842KQx = (C45842KQx) this.A01;
                long j2 = llb.A00;
                String str13 = c45842KQx.A0B;
                String str14 = c45842KQx.A08;
                String str15 = c45842KQx.A0G;
                ImageUrl imageUrl = c45842KQx.A04;
                String str16 = c45842KQx.A0E;
                AbstractC167017dG.A1R(str14, str15);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putLong("NOTE_ID", j2);
                A0b.putString("NOTE_TEXT", str13);
                A0b.putString(AbstractC111324zv.A00(1497), str14);
                A0b.putString("AUTHOR_USERNAME", str15);
                A0b.putString("AUDIO_CLUSTER_ID", str16);
                A0b.putParcelable("AUTHOR_PROFILE_PIC", imageUrl);
                A0b.putParcelable("camera_entry_bounds", null);
                BaseFragmentActivity baseFragmentActivity = llb.A0O;
                C6XJ.A02(baseFragmentActivity, A0b, userSession3, TransparentModalActivity.class, AbstractC111324zv.A00(4962)).A0A(baseFragmentActivity, 256);
                return true;
            case 10:
                if (AbstractC43594JPz.A1W(view)) {
                    view.performHapticFeedback(3);
                    View view3 = ((KCU) this.A02).A00;
                    if (view3 == null) {
                        str2 = "bannerView";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    view3.setVisibility(8);
                    interfaceC16820sZ = ((C47671L3e) this.A01).A03;
                    interfaceC16820sZ.invoke();
                    return true;
                }
                return false;
            case 11:
                if (AbstractC43594JPz.A1W(view)) {
                    view.performHapticFeedback(3);
                    c45510KCz = (C45510KCz) this.A02;
                    view2 = (View) this.A01;
                    C14360o3.A0A(view2);
                    str3 = "😍";
                    C45510KCz.A04(view2, c45510KCz, str3);
                    return true;
                }
                return false;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                if (AbstractC43594JPz.A1W(view)) {
                    view.performHapticFeedback(3);
                    c45510KCz = (C45510KCz) this.A02;
                    view2 = (View) this.A01;
                    C14360o3.A0A(view2);
                    str3 = "🔥";
                    C45510KCz.A04(view2, c45510KCz, str3);
                    return true;
                }
                return false;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                if (AbstractC43594JPz.A1W(view)) {
                    view.performHapticFeedback(3);
                    c45510KCz = (C45510KCz) this.A02;
                    view2 = (View) this.A01;
                    C14360o3.A0A(view2);
                    str3 = "😂";
                    C45510KCz.A04(view2, c45510KCz, str3);
                    return true;
                }
                return false;
            case 14:
                if (AbstractC43594JPz.A1W(view)) {
                    view.performHapticFeedback(3);
                    c45510KCz = (C45510KCz) this.A02;
                    view2 = (View) this.A01;
                    C14360o3.A0A(view2);
                    str3 = "❤️";
                    C45510KCz.A04(view2, c45510KCz, str3);
                    return true;
                }
                return false;
            case Process.SIGTERM /* 15 */:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A02;
                interfaceC16820sZ.invoke();
                return true;
            case 16:
                C26835Bsx c26835Bsx = (C26835Bsx) this.A02;
                CZH.A00(c26835Bsx.A04, C8i.STORE_LINK_CLICK, AbstractC166987dD.A0r(c26835Bsx.A0O), c26835Bsx.A0D, c26835Bsx.A0E);
                String string = c26835Bsx.requireArguments().getString("cta_url_override");
                if (string == null || string.equals("")) {
                    string = ((MUD) this.A01).A02;
                }
                android.net.Uri A03 = AbstractC08820cl.A03(string);
                if (AbstractC001900j.A0a(AbstractC166987dD.A19(A03), "instagram://profile_shop?", false)) {
                    Intent A04 = C14H.A03.A00().A04(c26835Bsx.requireContext(), A03);
                    A04.putExtra(AbstractC111324zv.A00(193), true);
                    C12260kU.A0C(c26835Bsx.requireContext(), A04);
                    return true;
                }
                C12260kU.A0G(c26835Bsx.requireContext(), A03);
                return true;
            default:
                return super.DsE(view);
        }
    }
}
