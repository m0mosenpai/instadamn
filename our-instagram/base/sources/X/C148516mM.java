package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.forker.Process;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerDict;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObjectImpl;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import instagram.features.feed.fragment.ContextualFeedFragment;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6mM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148516mM implements InterfaceC148526mN {
    public final UserSession A00;
    public final C145826hf A01;
    public final InterfaceC1118853a A02;
    public final InterfaceC145646hN A03;
    public final InterfaceC145656hO A04;
    public final InterfaceC145666hP A05;
    public final InterfaceC145506h9 A06;
    public final InterfaceC145426h1 A07;
    public final InterfaceC146006hx A08;
    public final C145996hw A09;
    public final WeakReference A0A;
    public final InterfaceC60442pS A0B;
    public final AbstractC149546o6 A0C;
    public final InterfaceC144586fe A0D;
    public final InterfaceC114805Gn A0E;
    public final C145886hl A0F;
    public final C145906hn A0G;
    public final InterfaceC145546hD A0H;
    public final C145866hj A0I;
    public final C145986hv A0J;
    public final C146026hz A0K;
    public final String A0L;

    @Override // X.InterfaceC148526mN
    public final void DP9(View view, C84823qW c84823qW) {
        Fragment fragment = (Fragment) this.A0A.get();
        if (fragment != null && fragment.getActivity() != null) {
            InterfaceC1118853a interfaceC1118853a = this.A02;
            interfaceC1118853a.EJ8(false);
            C41551w4 Aun = interfaceC1118853a.Aun(c84823qW.A1e);
            Aun.getClass();
            C41181vS A08 = Aun.A08(this.A00);
            A00(view, fragment, A08, Aun, c84823qW, this.A0E.C00(A08));
        }
    }

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ void Ddo(C84823qW c84823qW, int i, int i2) {
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [X.0Ml, java.lang.Object] */
    private void A00(View view, Fragment fragment, C41181vS c41181vS, C41551w4 c41551w4, C84823qW c84823qW, C141596ac c141596ac) {
        StoryLinkInfoDict storyLinkInfoDict;
        Boolean bool;
        long j;
        String str;
        String id;
        Long A0k;
        C145826hf c145826hf = this.A01;
        Reel reel = c41551w4.A0H;
        C6RN A08 = c84823qW.A08();
        A08.getClass();
        String A00 = A08.A00();
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(A00, 2);
        C38321qM c38321qM = c41181vS.A0b;
        try {
            UserSession userSession = c145826hf.A06;
            C145836hg c145836hg = c145826hf.A0A;
            c145836hg.A00 = reel;
            C18920wW A01 = AbstractC12220kQ.A01(c145836hg, userSession);
            C25531Mh c25531Mh = new C25531Mh(A01.A00(A01.A00, "instagram_organic_story_link"), 307);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                C1NB c1nb = reel.A0W;
                long j2 = 0;
                if (c1nb != null && (id = c1nb.getId()) != null && (A0k = AbstractC003100w.A0k(10, id)) != null) {
                    j = A0k.longValue();
                } else {
                    j = 0;
                }
                c25531Mh.A0Q("author_id", Long.valueOf(j));
                if (c38321qM == null || (str = c38321qM.getId()) == null) {
                    str = "";
                }
                c25531Mh.A0R("media_id", str);
                if (c38321qM != null) {
                    j2 = c38321qM.BRp().A00;
                }
                c25531Mh.A0Q("media_type", Long.valueOf(j2));
                c25531Mh.A0R("reel_id", reel.getId());
                c25531Mh.A0R("tray_session_id", c145826hf.A0H);
                c25531Mh.A0R("viewer_session_id", c145826hf.A0E.getSessionId());
                c25531Mh.A0R("tapped_link_type", "link_web");
                ((AbstractC02600Aj) c25531Mh).A00.AAK(new Object().A03(AbstractC08820cl.A03(A00), null), "link_url");
                c25531Mh.Cht();
            }
        } catch (Exception e) {
            C0w9.A06("ReelViewerLogger#reportLinkStickerOpenLink", "Failed to log link sticker tooltip tap", e);
        }
        String str2 = null;
        if (reel.A1e) {
            C71313Hs.A00(this.A00).A07(view, EnumC71343Hv.A0H, new String[]{c41181vS.A0k}, 1);
            C145886hl c145886hl = this.A0F;
            C2Fb c2Fb = C2Fb.A3C;
            if (c38321qM != null) {
                str2 = c38321qM.getId();
            }
            c145886hl.A00(fragment, c41181vS, c41551w4, null, c141596ac, new C41064IGh(null, null, str2), c2Fb, null);
            return;
        }
        if (c84823qW.A08() != null && (storyLinkInfoDict = c84823qW.A08().A00) != null && (bool = storyLinkInfoDict.A01) != null && bool.booleanValue()) {
            AbstractC41776Ies.A03(fragment.requireActivity(), c84823qW.A08().A00());
            return;
        }
        FragmentActivity requireActivity = fragment.requireActivity();
        UserSession userSession2 = this.A00;
        String A002 = c84823qW.A08().A00();
        if (c38321qM != null) {
            str2 = c38321qM.getId();
        }
        C2Fb c2Fb2 = C2Fb.A3C;
        String moduleName = this.A0B.getModuleName();
        C14360o3.A0B(userSession2, 1);
        C14360o3.A0B(A002, 2);
        C14360o3.A0B(moduleName, 5);
        AbstractC41776Ies.A0A(requireActivity, userSession2, c2Fb2, A002, moduleName, str2, null);
    }

    @Override // X.InterfaceC148526mN
    public final View Aqk() {
        InterfaceC143576dw Av7 = this.A02.Av7();
        if (Av7 == null) {
            return null;
        }
        return Av7.BRC();
    }

    @Override // X.InterfaceC148526mN
    public final View Auc() {
        return this.A02.Auc();
    }

    @Override // X.InterfaceC148526mN
    public final void CJ7(User user, String str) {
        this.A0G.A03(user, str);
    }

    @Override // X.InterfaceC148526mN
    public final boolean CSA() {
        C38321qM c38321qM;
        InterfaceC1118853a interfaceC1118853a = this.A02;
        if (interfaceC1118853a.AuU() != null && (c38321qM = interfaceC1118853a.AuU().A0b) != null && C14360o3.A0K(c38321qM.A0C.CZ2(), true)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC148526mN
    public final void ClF(C84823qW c84823qW, int i, int i2) {
        this.A0I.A00(c84823qW, i, i2);
        C41551w4 Aun = this.A02.Aun(c84823qW.A1e);
        Aun.getClass();
        C141596ac C00 = this.A0E.C00(Aun.A08(this.A00));
        if (c84823qW.A12 == EnumC75383a5.A1G) {
            C00.A0L++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0263  */
    @Override // X.InterfaceC148526mN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Cnz(X.C84823qW r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148516mM.Cnz(X.3qW, int, int):boolean");
    }

    @Override // X.InterfaceC148526mN
    public final void CuP() {
        Fragment fragment = (Fragment) this.A0A.get();
        if (fragment != null && fragment.getActivity() != null) {
            this.A02.EJE("tapped");
            this.A0D.CuQ();
        }
    }

    @Override // X.InterfaceC148526mN
    public final void Cyj(C84823qW c84823qW) {
        this.A0D.Cyj(c84823qW);
    }

    @Override // X.InterfaceC148526mN
    public final void D5Q(C84823qW c84823qW) {
        Fragment fragment = (Fragment) this.A0A.get();
        if (fragment != null && fragment.getActivity() != null) {
            InterfaceC1118853a interfaceC1118853a = this.A02;
            interfaceC1118853a.EJ8(false);
            C41551w4 Aun = interfaceC1118853a.Aun(c84823qW.A1e);
            C145826hf c145826hf = this.A01;
            Aun.getClass();
            c145826hf.A0E(Aun, c84823qW);
            UserSession userSession = this.A00;
            FragmentActivity activity = fragment.getActivity();
            String moduleName = this.A0B.getModuleName();
            String str = c84823qW.A1a;
            if (str == null) {
                str = c84823qW.A1b;
            }
            AHT.A00(activity, EnumC120795dP.A0w, userSession, moduleName, str, ((ReelViewerFragment) interfaceC1118853a).mVideoPlayer.getCurrentPositionMs());
        }
    }

    @Override // X.InterfaceC148526mN
    public final void DGN(C84823qW c84823qW) {
        String str;
        String str2 = c84823qW.A1T;
        Fragment fragment = (Fragment) this.A0A.get();
        if (str2 != null && fragment != null && fragment.getContext() != null) {
            User user = c84823qW.A1C;
            if (user != null) {
                str = user.getId();
            } else {
                str = null;
            }
            String str3 = c84823qW.A1b;
            FragmentActivity requireActivity = fragment.requireActivity();
            UserSession userSession = this.A00;
            InterfaceC60442pS interfaceC60442pS = this.A0B;
            C14360o3.A0B(userSession, 1);
            if (C18U.A06(C06090Tz.A05, userSession, 36315486085975304L)) {
                C6WQ c6wq = new C6WQ(requireActivity, true);
                c6wq.A00(requireActivity.getString(2131965660));
                C0fJ.A00(c6wq);
                C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                c25621Ms.A06();
                c25621Ms.A0L("fundraiser/%s/linked_ig_fundraiser_info/", str2);
                c25621Ms.A9s("fb_fundraiser_id", str2);
                c25621Ms.A0R(ECF.class, FYR.class);
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = new ETX(requireActivity, userSession, interfaceC60442pS, c6wq, str, str3, str2);
                C1GJ.A03(A0N);
                return;
            }
            FDJ.A00(requireActivity, userSession, interfaceC60442pS, str2);
        }
    }

    @Override // X.InterfaceC148526mN
    public final void DGR() {
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A0A.get();
        if (abstractC59962oe != null) {
            UserSession userSession = this.A00;
            AbstractC35091Fd2.A02(userSession, "sticker", "two_factor_authentication_entered");
            CallerContext callerContext = C31238DoL.A00;
            if (C18U.A06(C06090Tz.A05, userSession, 36313858293631250L)) {
                C35256Fgp.A02(abstractC59962oe, userSession, "ig_two_factor_phase_1", "two_factor");
                return;
            }
            EJU A02 = AbstractC35179FfW.A01().A00().A02(C05F.A0C, false, false);
            C140966Yy c140966Yy = new C140966Yy(abstractC59962oe.requireActivity(), userSession);
            c140966Yy.A0A = AbstractC37316GcI.A00(10, 24, 71);
            c140966Yy.A0E(A02);
            c140966Yy.A0F = true;
            c140966Yy.A04();
        }
    }

    @Override // X.InterfaceC148526mN
    public final void DTJ() {
        this.A0D.DTI(this.A02.AuU(), false);
    }

    @Override // X.InterfaceC148526mN
    public final void DWE() {
        C41181vS AuU;
        C38321qM c38321qM;
        User CDj;
        Fragment fragment = (Fragment) this.A0A.get();
        if (fragment != null && fragment.getActivity() != null && fragment.getContext() != null && (AuU = this.A02.AuU()) != null && (c38321qM = AuU.A0b) != null && (CDj = c38321qM.A0C.CDj()) != null) {
            J0Z j0z = new J0Z(this);
            AbstractC40572Hys.A00(fragment.requireContext(), fragment.requireActivity(), this.A00, j0z, CDj, new InterfaceC16820sZ() { // from class: X.J6K
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    C148516mM.this.A02.EJJ();
                    return C0eB.A00;
                }
            });
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0040. Please report as an issue. */
    @Override // X.InterfaceC148526mN
    public final void DZg(final View view, C84823qW c84823qW) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        LinkedHashMap linkedHashMap;
        String str8;
        String str9;
        String str10;
        ViewGroup Bld;
        String str11;
        C145906hn c145906hn;
        User user;
        String A00;
        double doubleValue;
        C38321qM c38321qM;
        C42130Ile A0L;
        C38321qM c38321qM2;
        C38321qM c38321qM3;
        C140966Yy c140966Yy;
        Fragment A02;
        C38321qM c38321qM4;
        C38321qM c38321qM5;
        C38321qM c38321qM6;
        InterfaceC145436h2 interfaceC145436h2;
        long j;
        Long A0k;
        C38796H6l c38796H6l;
        String str12;
        WhatsAppChannelShareToIgStoryStickerDict whatsAppChannelShareToIgStoryStickerDict;
        List list;
        User user2;
        C41749IeN A0N;
        String str13;
        User A2E;
        String str14;
        WeakReference weakReference = this.A0A;
        Fragment fragment = (Fragment) weakReference.get();
        if (fragment != null && fragment.getActivity() != null) {
            InterfaceC1118853a interfaceC1118853a = this.A02;
            interfaceC1118853a.EJ8(false);
            C41551w4 Aun = interfaceC1118853a.Aun(c84823qW.A1e);
            Aun.getClass();
            UserSession userSession = this.A00;
            C41181vS A08 = Aun.A08(userSession);
            C141596ac C00 = this.A0E.C00(A08);
            EnumC75383a5 enumC75383a5 = c84823qW.A12;
            String str15 = "";
            String str16 = "";
            String str17 = null;
            C38321qM c38321qM7 = null;
            String str18 = null;
            switch (enumC75383a5.ordinal()) {
                case 4:
                    C41743IeH c41743IeH = c84823qW.A1G;
                    if (c41743IeH != null && !TextUtils.isEmpty(c41743IeH.A06)) {
                        ELF(c41743IeH.A06, c41743IeH.A0A);
                        if (c41743IeH.A09 != null) {
                            AbstractC23021Ah.A00(userSession).A10(c41743IeH.A09, c41743IeH.A00);
                            return;
                        }
                        return;
                    }
                    return;
                case 5:
                case 32:
                    this.A0D.D2k(interfaceC1118853a.AuU());
                    return;
                case 7:
                    C41181vS AuU = interfaceC1118853a.AuU();
                    if (AuU != null && (c38321qM5 = AuU.A0b) != null && fragment.getActivity() != null) {
                        EnumC71343Hv enumC71343Hv = EnumC71343Hv.A09;
                        String str19 = null;
                        int i = c84823qW.A05 + 1;
                        List Ap5 = c38321qM5.A0C.Ap5();
                        if (Ap5 != null && Ap5.size() > i && (c38321qM6 = (C38321qM) Ap5.get(i)) != null) {
                            str19 = c38321qM6.getId();
                        }
                        C71313Hs.A00(userSession).A09(view, new C71353Hw(null, enumC71343Hv, str19, null), new String[]{AuU.A0k}, 1);
                        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
                        this.A0H.DsI(fragment.getActivity(), c38321qM5, ((C146226iL) reelViewerFragment.A1C).A0C.C00(AuU).A0X, c84823qW.A05, ((C146226iL) reelViewerFragment.A1C).A0C.C00(AuU).A0o);
                        return;
                    }
                    return;
                case 10:
                    InterfaceC143576dw Av7 = interfaceC1118853a.Av7();
                    if (Av7 == null) {
                        Bld = null;
                    } else {
                        Bld = Av7.Bld();
                    }
                    AbstractC130925vf.A07(Bld, userSession, A08, Aun, c84823qW);
                    C71313Hs.A00(userSession).A07(view, EnumC71343Hv.A0H, new String[]{A08.A0k}, 1);
                    C2Fb c2Fb = C2Fb.A3r;
                    C38321qM c38321qM8 = A08.A0b;
                    if (c38321qM8 != null) {
                        if (c38321qM8.A6E()) {
                            c2Fb = C2Fb.A3u;
                        } else if (c38321qM8.A6D()) {
                            c2Fb = C2Fb.A3t;
                            IgShowreelComposition Bx8 = c38321qM8.A0C.Bx8();
                            if (Bx8 != null) {
                                str11 = Bx8.C5i();
                            } else {
                                str11 = null;
                            }
                            if (C14360o3.A0K(str11, "ig_stories_carousel_media_showcase")) {
                                c2Fb = C2Fb.A3x;
                            }
                        }
                    }
                    if (interfaceC1118853a.AuU() != null) {
                        C141596ac C002 = ((ReelViewerFragment) interfaceC1118853a).A1C.C00(interfaceC1118853a.AuU());
                        if (C002.A0o) {
                            if (c38321qM8 != null) {
                                if (c38321qM8.A5f()) {
                                    c2Fb = C2Fb.A3o;
                                } else if (c38321qM8.A6K()) {
                                    c2Fb = C2Fb.A42;
                                }
                            }
                            Integer num = C002.A0X;
                            if (num == C05F.A00) {
                                if (C002.A0p) {
                                    c2Fb = C2Fb.A3h;
                                } else {
                                    c2Fb = C2Fb.A3g;
                                }
                            } else if (num == C05F.A01) {
                                if (C002.A0p) {
                                    c2Fb = C2Fb.A3j;
                                } else {
                                    c2Fb = C2Fb.A3i;
                                }
                            }
                        } else if (c38321qM8 != null) {
                            if (c38321qM8.A5f()) {
                                c2Fb = C2Fb.A3p;
                            } else if (c38321qM8.A6K()) {
                                c2Fb = C2Fb.A43;
                            }
                        }
                    }
                    Integer num2 = null;
                    String str20 = c84823qW.A1b;
                    if (c38321qM8 != null && c38321qM8.A0C.Bx3() == null && c38321qM8.A6D()) {
                        num2 = Integer.valueOf(AbstractC130925vf.A02(userSession, A08, Aun, c84823qW));
                    }
                    InterfaceC144586fe interfaceC144586fe = this.A0D;
                    C41064IGh c41064IGh = new C41064IGh(null, num2, str20);
                    C41181vS AuU2 = interfaceC1118853a.AuU();
                    AuU2.getClass();
                    interfaceC144586fe.CJE(null, AuU2, c41064IGh, c2Fb);
                    AbstractC130925vf.A07(Bld, userSession, A08, Aun, null);
                    return;
                case 11:
                    C71313Hs.A00(userSession).A07(view, EnumC71343Hv.A0H, new String[]{A08.A0k}, 1);
                    if (AbstractC130925vf.A0o(Aun)) {
                        this.A01.A0C(A08, Aun, C05F.A00);
                    }
                    if (A08.A1A()) {
                        C145826hf c145826hf = this.A01;
                        C14360o3.A0B(userSession, 2);
                        C18920wW A01 = AbstractC12220kQ.A01(C145826hf.A01(Aun.A0H, c145826hf), userSession);
                        C38321qM c38321qM9 = A08.A0b;
                        C40971v4 c40971v4 = A08.A0g;
                        Long l = null;
                        if (c40971v4 != null) {
                            str17 = c40971v4.A0S;
                        }
                        IGCTMessagingAdsInfoDictIntf A002 = AbstractC41071vF.A00(userSession, c38321qM9);
                        if (A002 != null) {
                            l = Long.valueOf(VTE.A00(A002));
                        }
                        InterfaceC02590Ai A003 = A01.A00(A01.A00, "whatsapp_sticker_tooltip_click");
                        if (A003.isSampled()) {
                            long j2 = 0;
                            if (str17 != null && (A0k = AbstractC003100w.A0k(10, str17)) != null) {
                                j = A0k.longValue();
                            } else {
                                j = 0;
                            }
                            A003.A9K("ad_id", Long.valueOf(j));
                            if (l != null) {
                                j2 = l.longValue();
                            }
                            A003.A9K("page_id", Long.valueOf(j2));
                            String A06 = AbstractC41071vF.A06(userSession, c38321qM9);
                            if (A06 == null) {
                                if (c38321qM9 != null) {
                                    A06 = c38321qM9.A0C.getOrganicTrackingToken();
                                } else {
                                    A06 = null;
                                }
                            }
                            A003.AAP("client_token", A06);
                            A003.AAP(AbstractC37316GcI.A00(0, 10, 12), c145826hf.A0E.getSessionId());
                            A003.A8R(XNX.PAGE_INSTAGRAM_STORY, "on_feed_messaging_surface");
                            A003.AAP("message_destination", "WHATSAPP");
                            A003.Cht();
                        }
                    }
                    C2Fb c2Fb2 = C2Fb.A3r;
                    if (A08.A1J() || A08.A1N()) {
                        c2Fb2 = C2Fb.A3z;
                    }
                    String str21 = c84823qW.A1g;
                    if (str21.equals("sticker_generic_card_interactive_tooltip")) {
                        interfaceC145436h2 = this.A03;
                    } else if (str21.equals("sticker_lead_gen_card_interactive_tooltip")) {
                        interfaceC145436h2 = this.A05;
                    } else {
                        if (!str21.equals("story_iab_screenshot_card_header_tooltip_tap")) {
                            if (str21.equals("story_iab_screenshot_card_media_tooltip_tap")) {
                                c2Fb2 = C2Fb.A41;
                            } else {
                                if (!str21.equals("interactive_media_tooltip_from_tap") && !str21.equals("interactive_media_tooltip_from_tap_and_hold")) {
                                    InterfaceC145506h9 interfaceC145506h9 = this.A06;
                                    C41181vS AuU3 = interfaceC1118853a.AuU();
                                    AuU3.getClass();
                                    interfaceC145506h9.D8p(AuU3, c2Fb2, c84823qW.A03, c84823qW.A04);
                                    return;
                                }
                                InterfaceC145426h1 interfaceC145426h1 = this.A07;
                                C41181vS AuU4 = interfaceC1118853a.AuU();
                                AuU4.getClass();
                                interfaceC145426h1.DMZ(AuU4, c84823qW, c2Fb2);
                                return;
                            }
                        } else {
                            c2Fb2 = C2Fb.A40;
                        }
                        interfaceC145436h2 = this.A04;
                    }
                    C41181vS AuU5 = interfaceC1118853a.AuU();
                    AuU5.getClass();
                    interfaceC145436h2.DMa(AuU5, c2Fb2, c84823qW.A03, c84823qW.A04);
                    return;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    C00.A0F++;
                    FragmentActivity activity = fragment.getActivity();
                    H7X h7x = c84823qW.A0k;
                    h7x.getClass();
                    String str22 = h7x.A01;
                    str22.getClass();
                    AbstractC41776Ies.A09(activity, userSession, C2Fb.A1d, str22, this.A0B.getModuleName());
                    return;
                case Process.SIGTERM /* 15 */:
                    HashtagImpl hashtagImpl = c84823qW.A0l;
                    hashtagImpl.getClass();
                    String str23 = hashtagImpl.A0C;
                    if (str23 == null) {
                        str23 = hashtagImpl.A0D;
                        str23.getClass();
                    }
                    Map map = C00.A1F;
                    int i2 = 1;
                    if (map.containsKey(str23)) {
                        i2 = ((Number) map.get(str23)).intValue() + 1;
                    }
                    map.put(str23, Integer.valueOf(i2));
                    C145826hf c145826hf2 = this.A01;
                    String str24 = hashtagImpl.A0D;
                    str24.getClass();
                    c145826hf2.A0H(Aun, c84823qW, false, "hashtag", str24);
                    this.A0D.DK4(hashtagImpl);
                    return;
                case 18:
                    A00(view, fragment, A08, Aun, c84823qW, C00);
                    return;
                case Process.SIGSTOP /* 19 */:
                    Venue A09 = c84823qW.A09();
                    A09.getClass();
                    String A05 = A09.A05();
                    if (A05 == null) {
                        C0w9.A03("ReelInteractiveControllerDelegate", "reportLocationAction: locationId is null");
                        return;
                    }
                    Map map2 = C00.A1G;
                    int i3 = 1;
                    if (map2.containsKey(A05)) {
                        i3 = ((Number) map2.get(A05)).intValue() + 1;
                    }
                    map2.put(A05, Integer.valueOf(i3));
                    this.A01.A0N(Aun, false, "location", A05, c84823qW.A1g);
                    Venue A092 = c84823qW.A09();
                    A092.getClass();
                    FragmentActivity activity2 = fragment.getActivity();
                    new Venue().A06(A092.A05());
                    if (A092.A00.getName() != null) {
                        str15 = A092.A00.getName();
                    }
                    double[] dArr = new double[2];
                    double d = 0.0d;
                    if (A092.A00() == null) {
                        doubleValue = 0.0d;
                    } else {
                        doubleValue = A092.A00().doubleValue();
                    }
                    dArr[0] = doubleValue;
                    if (A092.A01() != null) {
                        d = A092.A01().doubleValue();
                    }
                    dArr[1] = d;
                    AbstractC68491VSw.A00(activity2, null, null, userSession, A092, null, str15, dArr, false);
                    return;
                case 21:
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    this.A01.A0E(Aun, c84823qW);
                    ProductType productType = c84823qW.A0n;
                    if (productType == ProductType.IGTV) {
                        C145986hv c145986hv = this.A0J;
                        InterfaceC60442pS interfaceC60442pS = this.A0B;
                        String str25 = c84823qW.A1b;
                        str25.getClass();
                        c145986hv.A01(str25, interfaceC60442pS);
                        return;
                    }
                    if (productType != ProductType.CLIPS) {
                        EnumC40111tc A0C = A08.A0C();
                        C14360o3.A0B(userSession, 0);
                        if (productType != ProductType.AD || A0C != EnumC40111tc.A0a || !C18U.A06(C06090Tz.A05, userSession, 36328452592254501L)) {
                            c140966Yy = new C140966Yy(fragment.getActivity(), userSession);
                            c140966Yy.A0F = true;
                            IgFragmentFactoryImpl.A00();
                            String str26 = c84823qW.A1b;
                            str26.getClass();
                            C35028Fc1 c35028Fc1 = new C35028Fc1();
                            c35028Fc1.A0B = str26;
                            c35028Fc1.A0E = "story_sticker";
                            c35028Fc1.A0O = false;
                            A02 = c35028Fc1.A02();
                            c140966Yy.A0E(A02);
                            c140966Yy.A04();
                            return;
                        }
                    }
                    FragmentActivity activity3 = fragment.getActivity();
                    String moduleName = this.A0B.getModuleName();
                    String str27 = c84823qW.A1a;
                    if (str27 == null) {
                        str27 = c84823qW.A1b;
                    }
                    AHT.A00(activity3, EnumC120795dP.A0p, userSession, moduleName, str27, ((ReelViewerFragment) interfaceC1118853a).mVideoPlayer.getCurrentPositionMs());
                    return;
                case 23:
                case 24:
                    User user3 = c84823qW.A1C;
                    user3.getClass();
                    C00.A06(user3.getId());
                    this.A01.A0G(Aun, c84823qW, false, "tag", -1, -1);
                    c145906hn = this.A0G;
                    user = c84823qW.A1C;
                    A00 = "reel_viewer_mention_popup";
                    c145906hn.A03(user, A00);
                    return;
                case 26:
                    this.A0D.DTI(interfaceC1118853a.AuU(), false);
                    return;
                case 27:
                case 28:
                    c145906hn = this.A0G;
                    MusicOverlayStickerModel musicOverlayStickerModel = c84823qW.A0v;
                    musicOverlayStickerModel.getClass();
                    user = musicOverlayStickerModel.A05;
                    user.getClass();
                    A00 = AbstractC43591JPw.A00(426);
                    c145906hn.A03(user, A00);
                    return;
                case 30:
                    Product A0H = c84823qW.A0H();
                    String str28 = A0H.A0H;
                    if (str28 != null && (c38321qM = A08.A0b) != null) {
                        Map map3 = C00.A1I;
                        int i4 = 1;
                        if (map3.containsKey(str28)) {
                            i4 = ((Number) map3.get(str28)).intValue() + 1;
                        }
                        map3.put(str28, Integer.valueOf(i4));
                        C145826hf c145826hf3 = this.A01;
                        UserSession userSession2 = c145826hf3.A06;
                        C41181vS A082 = Aun.A08(userSession2);
                        if (A082.CY4() && (c38321qM2 = A082.A0b) != null && c38321qM2.A63()) {
                            Product A0H2 = c84823qW.A0H();
                            C38683GzO A03 = C128205qp.A03(userSession2, A0H2);
                            long j3 = A03.A00;
                            C4SX c4sx = A03.A01;
                            Boolean bool = A03.A04;
                            Long l2 = A03.A07;
                            Long l3 = A03.A06;
                            Boolean bool2 = A03.A03;
                            C128215qq A04 = C128205qp.A04(c38321qM2);
                            List list2 = A04.A03;
                            Map map4 = A04.A08;
                            List list3 = A04.A02;
                            List list4 = A04.A04;
                            C26087BgG A022 = C128205qp.A02(c38321qM2, A0H2.A0H);
                            String str29 = A022.A03;
                            List list5 = (List) A022.A02;
                            List list6 = (List) A022.A01;
                            Map map5 = (Map) A022.A00;
                            C18920wW A012 = AbstractC12220kQ.A01(C145826hf.A01(Aun.A0H, c145826hf3), userSession2);
                            C25531Mh c25531Mh = new C25531Mh(A012.A00(A012.A00, "instagram_organic_tap_product_sticker_details"), 312);
                            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                                String id = c38321qM2.getId();
                                if (id != null) {
                                    c25531Mh.A0l(id);
                                    c25531Mh.A0Q("m_t", Long.valueOf(c38321qM2.BRp().A00));
                                    c25531Mh.A0Q("product_id", Long.valueOf(j3));
                                    C0Zx c0Zx = new C0Zx();
                                    c0Zx.A06("nav_chain", C1QM.A00.A02.A00);
                                    c25531Mh.A0N(c0Zx, "navigation_info");
                                    c25531Mh.A0d(c4sx);
                                    c25531Mh.A0Q("drops_launch_date", l3);
                                    c25531Mh.A0O("has_drops_launched", bool2);
                                    c25531Mh.A0O("is_checkout_enabled", bool);
                                    c25531Mh.A0Q("product_inventory", l2);
                                    c25531Mh.A0S("tagged_user_ids", list4);
                                    c25531Mh.A0S("drops_product_ids", list3);
                                    c25531Mh.A0S("product_ids", list2);
                                    c25531Mh.A0x(map4);
                                    c25531Mh.A0S("shared_product_ids", list6);
                                    c25531Mh.A0R("product_sticker_id", str29);
                                    ((AbstractC02600Aj) c25531Mh).A00.A9M("profile_shop_link", map5);
                                    c25531Mh.A0S("sticker_styles", list5);
                                    c25531Mh.Cht();
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        }
                        C14360o3.A0B(userSession, 0);
                        InterfaceC19610xo ARD = C41768Iek.A02(userSession, C41768Iek.A00).ARD();
                        ARD.E77("has_entered_pdp_via_product_sticker", true);
                        ARD.apply();
                        C1XJ c1xj = C1XJ.A00;
                        FragmentActivity activity4 = fragment.getActivity();
                        activity4.getClass();
                        A0L = c1xj.A0L(activity4, userSession, this.A0B, A0H, "product_sticker", this.A0L);
                        A0L.A02(c38321qM, null);
                        A0L.A02 = new DialogInterface.OnDismissListener() { // from class: X.Ifu
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                C148516mM.this.A02.EJJ();
                            }
                        };
                        A0L.A07 = this.A08;
                        A0L.A06 = c84823qW;
                        A0L.A0Z = true;
                        User A2E2 = c38321qM.A2E(userSession);
                        A2E2.getClass();
                        A0L.A0F = A2E2.getId();
                        C42911IyP c42911IyP = new C42911IyP(fragment, this);
                        A0L.A0b = true;
                        A0L.A08 = c42911IyP;
                        C42130Ile.A01(A0L);
                        return;
                    }
                    return;
                case 33:
                    this.A0D.DO7(interfaceC1118853a.AuU());
                    return;
                case 37:
                    C38820H7m c38820H7m = c84823qW.A0p;
                    c38820H7m.getClass();
                    String A004 = I45.A00(c38820H7m);
                    if (!A004.equals("seller_collection_reshare_sticker")) {
                        A004 = "product_collection_sticker";
                    }
                    ProductCollection productCollection = c38820H7m.A02;
                    productCollection.getClass();
                    ProductCollectionV2Type ApF = productCollection.ApF();
                    C18A A005 = AnonymousClass189.A00(userSession);
                    String str30 = c38820H7m.A05;
                    String str31 = str30;
                    if (str30 == null) {
                        str31 = "";
                    }
                    User A023 = A005.A02(str31);
                    INF A0J = C1XJ.A00.A0J(fragment.requireActivity(), userSession, EnumC39622HeW.A0I, this.A0L, this.A0B.getModuleName());
                    A0J.A0A = A004;
                    if (productCollection.Ap3() != null) {
                        str15 = productCollection.Ap3();
                    }
                    if (ApF != null) {
                        str18 = ApF.A00;
                    }
                    A0J.A01(AbstractC40733I3n.A00(str18), str15);
                    if (str30 == null) {
                        str30 = str16;
                    }
                    A0J.A08 = str30;
                    A0J.A0E = true;
                    if (A023 != null) {
                        str16 = A023.getUsername();
                    } else {
                        List CEC = productCollection.CEC();
                        if (CEC != null && (user2 = (User) AbstractC001800i.A0J(CEC)) != null) {
                            str16 = user2.getUsername();
                        }
                    }
                    A0J.A0D = str16;
                    A0J.A00();
                    return;
                case 38:
                    Product A0I = c84823qW.A0I();
                    A0I.getClass();
                    String str32 = A0I.A0H;
                    Map map6 = C00.A1I;
                    int i5 = 1;
                    if (map6.containsKey(str32)) {
                        i5 = ((Number) map6.get(str32)).intValue() + 1;
                    }
                    map6.put(str32, Integer.valueOf(i5));
                    C145826hf c145826hf4 = this.A01;
                    UserSession userSession3 = c145826hf4.A06;
                    C41181vS A083 = Aun.A08(userSession3);
                    if (A083.CY4() && (c38321qM3 = A083.A0b) != null) {
                        C38683GzO A032 = C128205qp.A03(userSession3, A0I);
                        long j4 = A032.A00;
                        C4SX c4sx2 = A032.A01;
                        Boolean bool3 = A032.A04;
                        Long l4 = A032.A06;
                        Boolean bool4 = A032.A03;
                        C128215qq A042 = C128205qp.A04(c38321qM3);
                        List list7 = A042.A03;
                        Map map7 = A042.A08;
                        List list8 = A042.A02;
                        List list9 = A042.A05;
                        List list10 = (List) C128205qp.A02(c38321qM3, str32).A01;
                        C18920wW A013 = AbstractC12220kQ.A01(C145826hf.A01(Aun.A0H, c145826hf4), userSession3);
                        C25531Mh c25531Mh2 = new C25531Mh(A013.A00(A013.A00, "instagram_organic_tap_product_share_sticker_details"), 310);
                        if (((AbstractC02600Aj) c25531Mh2).A00.isSampled()) {
                            c25531Mh2.A0Q("m_t", Long.valueOf(c38321qM3.BRp().A00));
                            c25531Mh2.A0Q("product_id", Long.valueOf(j4));
                            String id2 = c38321qM3.getId();
                            if (id2 != null) {
                                c25531Mh2.A0l(id2);
                                ((AbstractC02600Aj) c25531Mh2).A00.AAK(c4sx2, "merchant_id");
                                if (list7 != null) {
                                    c25531Mh2.A0S("product_ids", list7);
                                    c25531Mh2.A0x(map7);
                                    c25531Mh2.A0S("shared_product_ids", list10);
                                    c25531Mh2.A0S("tagged_user_ids", list9);
                                    c25531Mh2.A0Q("drops_launch_date", l4);
                                    c25531Mh2.A0O("has_drops_launched", bool4);
                                    c25531Mh2.A0S("drops_product_ids", list8);
                                    c25531Mh2.A0O("is_checkout_enabled", bool3);
                                    c25531Mh2.Cht();
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    C14360o3.A0B(userSession, 0);
                    InterfaceC19610xo ARD2 = C41768Iek.A02(userSession, C41768Iek.A00).ARD();
                    ARD2.E77("has_entered_pdp_via_product_sticker", true);
                    ARD2.apply();
                    A0L = C1XJ.A00.A0L(fragment.requireActivity(), userSession, this.A0B, A0I, "product_share_sticker", this.A0L);
                    C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a;
                    c41551w4.getClass();
                    A0L.A02(c41551w4.A08(userSession).A0b, null);
                    A0L.A02 = new DialogInterface.OnDismissListener() { // from class: X.Ifv
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C148516mM.this.A02.EJJ();
                        }
                    };
                    A0L.A07 = this.A08;
                    A0L.A06 = c84823qW;
                    C42130Ile.A01(A0L);
                    return;
                case 43:
                    MediaVCRTappableData mediaVCRTappableData = c84823qW.A0K;
                    if (mediaVCRTappableData != null) {
                        String str33 = mediaVCRTappableData.A07;
                        if (str33 == null) {
                            str33 = null;
                        }
                        String str34 = mediaVCRTappableData.A04;
                        if (str34 == null) {
                            str34 = null;
                        }
                        if (str33 != null && str34 != null) {
                            C29281Cvc c29281Cvc = new C29281Cvc(fragment, this, str34);
                            C14360o3.A0B(userSession, 1);
                            FVK.A01(userSession, C1GJ.A01(), c29281Cvc, str33);
                            return;
                        }
                        return;
                    }
                    return;
                case 44:
                    String str35 = c84823qW.A1d;
                    if (str35 != null) {
                        C1XJ c1xj2 = C1XJ.A00;
                        FragmentActivity requireActivity = fragment.requireActivity();
                        InterfaceC60442pS interfaceC60442pS2 = this.A0B;
                        A0N = c1xj2.A0N(requireActivity, SellerShoppableFeedType.A05, userSession, interfaceC60442pS2, null, interfaceC60442pS2.getModuleName(), "stories_reshare_view_shop_cta", str35, null);
                        A0N.A0G = "stories_reshare_view_shop_cta";
                        A0N.A0I = c84823qW.A1p;
                        A0N.A05();
                        return;
                    }
                    return;
                case 48:
                    C38822H7p c38822H7p = c84823qW.A0s;
                    c38822H7p.getClass();
                    String A006 = I4G.A00(c38822H7p);
                    if (!A006.equals("storefront_reshare_sticker")) {
                        A006 = "storefront_sticker";
                    }
                    User user4 = c38822H7p.A00;
                    user4.getClass();
                    C1XJ c1xj3 = C1XJ.A00;
                    FragmentActivity requireActivity2 = fragment.requireActivity();
                    InterfaceC60442pS interfaceC60442pS3 = this.A0B;
                    A0N = c1xj3.A0N(requireActivity2, user4.A0A(), userSession, interfaceC60442pS3, null, interfaceC60442pS3.getModuleName(), "storefront_sticker", user4.getId(), user4.getUsername());
                    if (interfaceC1118853a.AuU() != null) {
                        c38321qM7 = interfaceC1118853a.AuU().A0b;
                    }
                    A0N.A03 = c38321qM7;
                    A0N.A0G = A006;
                    IE8 ie8 = new IE8(this);
                    UserSession userSession4 = A0N.A0Q;
                    if (C14360o3.A0K(userSession4.userId, A0N.A0T)) {
                        C38321qM c38321qM10 = A0N.A03;
                        if (c38321qM10 != null && (A2E = c38321qM10.A2E(userSession4)) != null) {
                            str13 = A2E.getId();
                        } else {
                            str13 = null;
                        }
                        if (!C14360o3.A0K(str13, userSession4.userId)) {
                            FragmentActivity fragmentActivity = A0N.A0P;
                            C50674MYs c50674MYs = new C50674MYs(fragmentActivity, userSession4);
                            String str36 = A0N.A0U;
                            if (str36 != null) {
                                c50674MYs.A07(str36);
                                c50674MYs.A03(new ViewOnClickListenerC41897IhZ(A0N), 2131976887);
                                c50674MYs.A01(new ViewOnClickListenerC41916Ii9(A0N, ie8), 2131973967);
                                c50674MYs.A03 = new C42681Iuc(ie8);
                                new C31727DwY(c50674MYs).A05(fragmentActivity);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    A0N.A05();
                    return;
                case 52:
                    if (interfaceC1118853a.AuU() != null) {
                        c38321qM4 = interfaceC1118853a.AuU().A0b;
                    } else {
                        c38321qM4 = null;
                    }
                    C28321Yt A007 = F8K.A00();
                    FragmentActivity activity5 = fragment.getActivity();
                    VEB veb = VEB.A0G;
                    if (c38321qM4 != null) {
                        c38321qM4.A2u();
                    }
                    A007.A00(activity5, userSession, veb, null, null, null);
                    return;
                case 58:
                    H5X h5x = c84823qW.A0S;
                    if (h5x != null && !TextUtils.isEmpty(h5x.A04)) {
                        FragmentActivity activity6 = fragment.getActivity();
                        InterfaceC60442pS interfaceC60442pS4 = this.A0B;
                        H5X h5x2 = c84823qW.A0S;
                        if (h5x2 == null) {
                            str = null;
                        } else {
                            str = h5x2.A04;
                        }
                        if (h5x2 == null) {
                            str2 = null;
                        } else {
                            str2 = h5x2.A04;
                        }
                        AbstractC35190Ffi.A02(activity6, interfaceC60442pS4, userSession, "ig_story", str, str2, null, null, true);
                        return;
                    }
                    return;
                case 59:
                    C38760H5a c38760H5a = c84823qW.A0T;
                    if (c38760H5a != null && !TextUtils.isEmpty(c38760H5a.A02)) {
                        C38760H5a c38760H5a2 = c84823qW.A0T;
                        if (c38760H5a2 == null) {
                            str3 = null;
                        } else {
                            str3 = c38760H5a2.A03;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            C38760H5a c38760H5a3 = c84823qW.A0T;
                            if (c38760H5a3 == null) {
                                str4 = null;
                            } else {
                                str4 = c38760H5a3.A02;
                            }
                            String str37 = c84823qW.A1e;
                            C14360o3.A0B(userSession, 0);
                            String str38 = null;
                            AbstractC68360VNu.A00(userSession, "ig_story_tooltip_clicked", userSession.userId, str4, str37, null);
                            FragmentActivity requireActivity3 = fragment.requireActivity();
                            C38760H5a c38760H5a4 = c84823qW.A0T;
                            if (c38760H5a4 != null) {
                                str38 = c38760H5a4.A02;
                            }
                            if (c38760H5a4 == null) {
                                str5 = null;
                            } else {
                                str5 = c38760H5a4.A00;
                            }
                            if (c38760H5a4 == null) {
                                str6 = null;
                            } else {
                                str6 = c38760H5a4.A03;
                            }
                            String str39 = c84823qW.A1e;
                            if (str38 != null && !AbstractC001900j.A0T(str38) && str5 != null && !AbstractC001900j.A0T(str5) && str6 != null && !AbstractC001900j.A0T(str6)) {
                                if ("people".equals(str38) && C35134Feb.A00.A01(requireActivity3)) {
                                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(AnonymousClass001.A0R(S8X.A01, "profile/%s?ref=xav_fb_story_to_ig_mentions"), str5);
                                    C14360o3.A07(formatStrLocaleSafe);
                                    android.net.Uri A033 = AbstractC08820cl.A03(formatStrLocaleSafe);
                                    C14360o3.A07(A033);
                                    String str40 = "com.facebook.wakizashi";
                                    if (requireActivity3.getPackageManager().getLaunchIntentForPackage("com.facebook.wakizashi") == null) {
                                        str40 = "com.facebook.katana";
                                    }
                                    Intent intent = new Intent("android.intent.action.VIEW").setData(A033).setPackage(str40);
                                    C14360o3.A07(intent);
                                    C12260kU.A0B(requireActivity3, intent);
                                    linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("opened_in", "fb_app");
                                    str8 = userSession.userId;
                                    str9 = "profile_open_trigger";
                                    AbstractC68360VNu.A00(userSession, str9, str8, str38, str39, linkedHashMap);
                                    return;
                                }
                                try {
                                    FragmentActivity fragmentActivity2 = (FragmentActivity) AbstractC167197dY.A00(requireActivity3, FragmentActivity.class);
                                    if (fragmentActivity2 != null && C18U.A06(C06090Tz.A05, userSession, 36325347331027981L)) {
                                        Integer num3 = C05F.A01;
                                        String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe(AnonymousClass001.A0R(S8X.A01, "profile/%s?ref=xav_fb_story_to_ig_mentions"), str5);
                                        C14360o3.A07(formatStrLocaleSafe2);
                                        AbstractC34210F7i.A00(fragmentActivity2, num3, formatStrLocaleSafe2, new X3A(requireActivity3, userSession, str6, str38, str39, 0));
                                        return;
                                    }
                                    android.net.Uri A034 = AbstractC08820cl.A03(str6);
                                    C14360o3.A07(A034);
                                    C12260kU.A0G(requireActivity3, A034);
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put("opened_in", "external_browser");
                                    AbstractC68360VNu.A00(userSession, "profile_open_trigger", userSession.userId, str38, str39, linkedHashMap2);
                                    return;
                                } catch (NullPointerException unused) {
                                    str7 = "Error parsing fbentityUrl";
                                } catch (SecurityException unused2) {
                                    str7 = "Security Error parsing fbentityUrl";
                                }
                            } else {
                                str7 = "Null tagType, fbId or fbentityUrl";
                            }
                            linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("reason", str7);
                            if (str6 == null) {
                                str6 = "";
                            }
                            linkedHashMap.put("entityUrl", str6);
                            str8 = userSession.userId;
                            str9 = "profile_open_error";
                            AbstractC68360VNu.A00(userSession, str9, str8, str38, str39, linkedHashMap);
                            return;
                        }
                        return;
                    }
                    return;
                case StringTreeSet.PAYLOAD_MASK /* 63 */:
                    FragmentActivity activity7 = fragment.getActivity();
                    C38797H6m c38797H6m = c84823qW.A0f;
                    if (activity7 != null && !activity7.isDestroyed() && c38797H6m != null && (c38796H6l = c38797H6m.A02) != null && (str12 = c38796H6l.A02) != null) {
                        C145826hf c145826hf5 = this.A01;
                        UserSession userSession5 = c145826hf5.A06;
                        C41181vS A084 = Aun.A08(userSession5);
                        String str41 = null;
                        if (A084.CY4()) {
                            C38321qM c38321qM11 = A084.A0b;
                            c38321qM11.getClass();
                            C145836hg A014 = C145826hf.A01(Aun.A0H, c145826hf5);
                            User A2E3 = c38321qM11.A2E(userSession5);
                            if (A2E3 != null) {
                                str41 = A2E3.getId();
                            }
                            AbstractC151386rg.A02(A014, userSession5, c38321qM11, "story_sticker", str41, AbstractC14490oL.A0A(c145826hf5.A04));
                        }
                        C35265Fh0.A05(activity7, userSession, this.A0B.getModuleName(), str12, "story_sticker", false);
                        return;
                    }
                    return;
                case 66:
                    H3B h3b = c84823qW.A0G;
                    if (h3b != null && (list = h3b.A00) != null && !list.isEmpty()) {
                        User user5 = A08.A0i;
                        if (user5 != null) {
                            str15 = view.getResources().getString(2131962018, user5.getUsername());
                        }
                        User A015 = C17060sy.A01.A01(userSession);
                        C145826hf c145826hf6 = this.A01;
                        C18920wW A016 = AbstractC12220kQ.A01(C145826hf.A01(Aun.A0H, c145826hf6), c145826hf6.A06);
                        InterfaceC02590Ai A008 = A016.A00(A016.A00, "instagram_explore_shareable_grid_interact_detail");
                        if (A008.isSampled()) {
                            A008.AAP("containermodule", c145826hf6.A0A.getModuleName());
                            A008.Cht();
                        }
                        String str42 = (String) list.get(0);
                        ArrayList arrayList = new ArrayList(list);
                        C37330GcY c37330GcY = new C37330GcY();
                        Bundle bundle = new Bundle();
                        c37330GcY.A01(bundle);
                        ContextualFeedNetworkConfig contextualFeedNetworkConfig = new ContextualFeedNetworkConfig("0", A015.getId(), A015.getUsername(), null, null, 0);
                        String str43 = (String) list.get(0);
                        c140966Yy = new C140966Yy(fragment.requireActivity(), userSession);
                        ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
                        contextualFeedFragment.setArguments(C31569Dtv.A03(bundle, null, contextualFeedNetworkConfig, null, null, "Static", str15, str42, "feed_contextual_explore_shareable_grid", str43, null, arrayList, false, false));
                        c140966Yy.A0E(contextualFeedFragment);
                        c140966Yy.A0F = true;
                        c140966Yy.A04();
                        return;
                    }
                    return;
                case 70:
                    final Fragment fragment2 = (Fragment) weakReference.get();
                    if (fragment2 != null && fragment2.getActivity() != null && (str10 = c84823qW.A1b) != null) {
                        C2JM c2jm = new C2JM();
                        C2JM c2jm2 = new C2JM();
                        C0CA A024 = GraphQlCallInput.A02.A02();
                        C0CA.A00(A024, str10, "media_id");
                        c2jm.A00.A02().A0E(A024, "data");
                        C2JQ c2jq = PandoGraphQLRequest.Companion;
                        AbstractC40691uc.A01(userSession).ATV(new InterfaceC48212Jk() { // from class: X.AXR
                            @Override // X.InterfaceC48212Jk
                            public final void invoke(Throwable th) {
                            }
                        }, new InterfaceC48192Ji() { // from class: X.LT4
                            @Override // X.InterfaceC48192Ji
                            public final void invoke(AnonymousClass436 anonymousClass436) {
                                Fragment fragment3 = fragment2;
                                View view2 = view;
                                Object Bos = anonymousClass436.Bos();
                                if (Bos != null) {
                                    C2JS c2js = (C2JS) Bos;
                                    if (c2js.getOptionalTreeField(0, "xfb_whatsapp_sticker_deep_link_query(data:$data)", QoH.class, -164551825) != null) {
                                        String optionalStringField = c2js.getOptionalTreeField(0, "xfb_whatsapp_sticker_deep_link_query(data:$data)", QoH.class, -164551825).getOptionalStringField(0, "whatsapp_deep_link");
                                        if (optionalStringField != null && !optionalStringField.isEmpty()) {
                                            AbstractC41776Ies.A03(fragment3.requireActivity(), optionalStringField);
                                            return;
                                        }
                                        C146106i8 A0K = AbstractC31171DnF.A0K();
                                        Resources resources = view2.getResources();
                                        AbstractC31172DnG.A1H(resources, A0K, 2131977077);
                                        A0K.A0I = resources.getString(2131977076);
                                        AbstractC25233BEq.A1F(A0K);
                                    }
                                }
                            }
                        }, new PandoGraphQLRequest(AbstractC40511uK.A00(), "WhatsAppStickerDeepLink", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), QoI.class, false, null, 0, null, "xfb_whatsapp_sticker_deep_link_query", new ArrayList()));
                        return;
                    }
                    return;
                case 73:
                    C38750H4q c38750H4q = c84823qW.A0M;
                    if (c38750H4q != null && (str14 = c38750H4q.A00) != null) {
                        c140966Yy = new C140966Yy(fragment.requireActivity(), userSession);
                        FB6.A00();
                        String str44 = userSession.token;
                        String moduleName2 = this.A0B.getModuleName();
                        C14360o3.A0B(str44, 0);
                        C14360o3.A0B(moduleName2, 2);
                        A02 = FXL.A01(EnumC39551HdN.A06, EnumC33416Epn.A0A, str44, str14, moduleName2);
                        c140966Yy.A0E(A02);
                        c140966Yy.A04();
                        return;
                    }
                    return;
                case 82:
                    FragmentActivity activity8 = fragment.getActivity();
                    WhatsAppChannelShareToIgStoryStickerTappableObjectImpl whatsAppChannelShareToIgStoryStickerTappableObjectImpl = c84823qW.A0i;
                    if (activity8 != null && !activity8.isDestroyed() && whatsAppChannelShareToIgStoryStickerTappableObjectImpl != null && (whatsAppChannelShareToIgStoryStickerDict = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A02) != null && whatsAppChannelShareToIgStoryStickerDict.AdO() != null) {
                        AbstractC41776Ies.A03(fragment.requireActivity(), whatsAppChannelShareToIgStoryStickerDict.AdO());
                        return;
                    }
                    return;
                default:
                    throw new UnsupportedOperationException(AnonymousClass001.A0R("Unknown interactive type: ", enumC75383a5.toString()));
            }
        }
    }

    @Override // X.InterfaceC148526mN
    public final void Ddm() {
        ReelViewerFragment.A0I((ReelViewerFragment) this.A02, false);
    }

    @Override // X.InterfaceC148526mN
    public final void Ddn(C84823qW c84823qW) {
        InterfaceC1118853a interfaceC1118853a = this.A02;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
        ReelViewerFragment.A0I(reelViewerFragment, false);
        if (c84823qW.A12.equals(EnumC75383a5.A0N)) {
            C41181vS AuU = interfaceC1118853a.AuU();
            C41551w4 c41551w4 = reelViewerFragment.A0a;
            if (AuU != null && c41551w4 != null) {
                this.A01.A0K(c41551w4, ((C146226iL) reelViewerFragment.A1C).A0C.C00(AuU), null, "collection_thumbnail_tap_close", c84823qW.A03, c84823qW.A04);
            }
        }
    }

    @Override // X.InterfaceC148526mN
    public final void ELF(String str, Map map) {
        this.A0K.A00(null, str, map);
    }

    @Override // X.InterfaceC148526mN
    public final boolean EiX(C84823qW c84823qW) {
        boolean A06;
        Boolean bool;
        StoryLinkInfoDict storyLinkInfoDict = c84823qW.A0W;
        if (storyLinkInfoDict != null && (bool = storyLinkInfoDict.A03) != null && bool.booleanValue()) {
            Boolean bool2 = storyLinkInfoDict.A00;
            if (bool2 != null) {
                A06 = bool2.booleanValue();
            } else {
                A06 = false;
            }
        } else {
            A06 = C18U.A06(C06090Tz.A05, this.A00, 36322074565879793L);
        }
        if (!A06) {
            return false;
        }
        C41551w4 Aun = this.A02.Aun(c84823qW.A1e);
        Aun.getClass();
        C141596ac C00 = this.A0E.C00(Aun.A08(this.A00));
        if (C00.A0O <= 0.0d) {
            return false;
        }
        if (!C00.A0n && SystemClock.uptimeMillis() - C00.A0P < Long.valueOf(C18U.A01(C06090Tz.A06, r7, 36603549542716366L)).intValue()) {
            return false;
        }
        return true;
    }

    public C148516mM(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C145826hf c145826hf, AbstractC149546o6 abstractC149546o6, InterfaceC1118853a interfaceC1118853a, InterfaceC144586fe interfaceC144586fe, InterfaceC114805Gn interfaceC114805Gn, C145886hl c145886hl, C145906hn c145906hn, InterfaceC145646hN interfaceC145646hN, InterfaceC145656hO interfaceC145656hO, InterfaceC145666hP interfaceC145666hP, InterfaceC145546hD interfaceC145546hD, InterfaceC145506h9 interfaceC145506h9, InterfaceC145426h1 interfaceC145426h1, InterfaceC146006hx interfaceC146006hx, C145866hj c145866hj, C145986hv c145986hv, C146026hz c146026hz, C145996hw c145996hw, String str, WeakReference weakReference) {
        this.A00 = userSession;
        this.A0E = interfaceC114805Gn;
        this.A01 = c145826hf;
        this.A0I = c145866hj;
        this.A0G = c145906hn;
        this.A0K = c146026hz;
        this.A0J = c145986hv;
        this.A02 = interfaceC1118853a;
        this.A08 = interfaceC146006hx;
        this.A09 = c145996hw;
        this.A0A = weakReference;
        this.A0D = interfaceC144586fe;
        this.A0C = abstractC149546o6;
        this.A0B = interfaceC60442pS;
        this.A0L = str;
        this.A06 = interfaceC145506h9;
        this.A03 = interfaceC145646hN;
        this.A05 = interfaceC145666hP;
        this.A04 = interfaceC145656hO;
        this.A0H = interfaceC145546hD;
        this.A07 = interfaceC145426h1;
        this.A0F = c145886hl;
    }
}
