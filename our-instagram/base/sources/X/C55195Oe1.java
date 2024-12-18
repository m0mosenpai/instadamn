package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Oe1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55195Oe1 {
    public static final C55195Oe1 A01 = new Object();
    public static final C55890Ore A00 = new C55890Ore();

    public static final void A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55011OVw c55011OVw, int i) {
        C14360o3.A0B(userSession, 1);
        AbstractC43594JPz.A1P(interfaceC11380iw, c55011OVw);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        Intent putExtra = AbstractC31171DnF.A04().putExtra("ARG_MEDIA_ID", c55011OVw.A05);
        C14360o3.A07(putExtra);
        C55195Oe1 c55195Oe1 = A01;
        PZW.A01(userSession, AbstractC24771Iv.A02(1677891942, 3), 21, z);
        A01(fragmentActivity, interfaceC11380iw, userSession, z);
        c55195Oe1.A07(interfaceC11380iw, userSession, c55011OVw, z);
        fragmentActivity.setResult(i, putExtra);
        fragmentActivity.finish();
    }

    public static final void A01(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z) {
        C200108tF.A01.A0B(interfaceC11380iw, userSession, interfaceC11380iw.getModuleName(), C57525Pfz.A00(fragmentActivity, 34), z, true);
    }

    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55011OVw c55011OVw) {
        Long l;
        Long l2;
        AbstractC167007dF.A1K(userSession, interfaceC11380iw);
        C14360o3.A0B(c55011OVw, 2);
        boolean A012 = c55011OVw.A01();
        if (!A012) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_camera_clips_share_to_facebook_primer_impression");
            String A0t = AbstractC166997dE.A0t(userSession);
            if (A0t == null) {
                A0t = "";
            }
            boolean A1X = MSZ.A1X(C196068lw.A00(userSession), "RecommendOnFbUtils");
            Integer B7S = AbstractC166997dE.A0Y(userSession).A03.B7S();
            if (B7S != null) {
                l2 = AbstractC25229BEm.A0n(B7S);
            } else {
                l2 = null;
            }
            if (A0f.isSampled()) {
                AbstractC50522MSa.A16(C22P.A1R, A0f, 2);
                MSZ.A1A(EnumC50631MWs.A0I, A0f);
                MSZ.A1B(c55011OVw.A03, A0f, "media_source");
                AbstractC166987dD.A1S(A0f, A0t);
                AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
                A0f.A7v("is_crosspost", false);
                AbstractC37302Gc3.A0t(A0f);
                A0f.A7v("do_not_use_is_fb_connected", Boolean.valueOf(A1X));
                A0f.A9K("follower_count", l2);
                String str = c55011OVw.A04;
                if (str == null) {
                    str = EnumC53201Nfx.A04.A00;
                }
                AbstractC50523MSb.A0z(A0f, str);
            }
        }
        C448824s c448824s = AnonymousClass229.A01(userSession).A0G;
        MYO myo = c55011OVw.A03;
        String str2 = c55011OVw.A04;
        if (str2 == null) {
            str2 = EnumC53201Nfx.A04.A00;
        }
        if (!A012) {
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c448824s.A01, "ig_camera_ui_tool_impression");
            Integer B7S2 = AbstractC166997dE.A0Y(userSession).A03.B7S();
            if (B7S2 != null) {
                l = AbstractC25229BEm.A0n(B7S2);
            } else {
                l = null;
            }
            if (A0f2.isSampled()) {
                MSW.A1N(C81X.A2H, A0f2);
                AbstractC166987dD.A1S(A0f2, AbstractC50522MSa.A0i(A0f2, c448824s, "IG_CAMERA_CLIPS_SHARE_TO_FACEBOOK_PRIMER_IMPRESSION"));
                AbstractC50522MSa.A16(C22P.A1R, A0f2, 2);
                MSZ.A1A(EnumC50631MWs.A0I, A0f2);
                MSZ.A1B(myo, A0f2, "media_source");
                AbstractC31175DnJ.A14(A0f2, interfaceC11380iw);
                A0f2.A7v("is_crosspost", false);
                AbstractC37302Gc3.A0t(A0f2);
                A0f2.A9K("follower_count", l);
                AbstractC50523MSb.A0z(A0f2, str2);
            }
        }
        A02(EnumC201098ur.VIEW, userSession, c55011OVw);
    }

    public final void A06(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55011OVw c55011OVw, String str, int i, boolean z) {
        EnumC201098ur enumC201098ur;
        BQL bql;
        C14360o3.A0B(c55011OVw, 6);
        InterfaceC19610xo ARD = AbstractC46542Bs.A00(userSession).A04.ARD();
        ARD.E77(AbstractC111324zv.A00(1709), false);
        ARD.apply();
        PZW.A01(userSession, AbstractC24771Iv.A02(1677891942, 3), 20, z);
        A01(fragmentActivity, interfaceC11380iw, userSession, z);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_clips_share_to_facebook_primer_selection");
        if (A0f.isSampled()) {
            if (z) {
                bql = BQL.A15;
            } else {
                bql = BQL.A16;
            }
            AbstractC37300Gc1.A0e(bql, A0f);
            AbstractC25225BEi.A1M(EnumC120795dP.A0W, A0f);
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            A0f.AAP("media_compound_key", str);
            AbstractC25230BEn.A1C(A0f, i);
            AbstractC25225BEi.A1P(A0f, "");
            A0f.Cht();
        }
        if (z) {
            enumC201098ur = EnumC201098ur.ACCEPT;
        } else {
            enumC201098ur = EnumC201098ur.DECLINE;
        }
        A02(enumC201098ur, userSession, c55011OVw);
    }

    public final void A07(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55011OVw c55011OVw, boolean z) {
        EnumC201098ur enumC201098ur;
        boolean A012 = c55011OVw.A01();
        if (!A012) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_camera_clips_share_to_facebook_primer_selection");
            String A0t = AbstractC166997dE.A0t(userSession);
            if (A0t == null) {
                A0t = "";
            }
            if (A0f.isSampled()) {
                AbstractC167017dG.A1A(C22P.A1R, A0f);
                MSZ.A1A(EnumC50631MWs.A0I, A0f);
                MSZ.A1B(c55011OVw.A03, A0f, "media_source");
                AbstractC166987dD.A1S(A0f, A0t);
                AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
                A0f.A7v("is_crosspost", AbstractC31173DnH.A0d(A0f, Boolean.valueOf(z), "allow_selection", false));
                AbstractC37302Gc3.A0t(A0f);
                String str = c55011OVw.A04;
                if (str == null) {
                    str = EnumC53201Nfx.A04.A00;
                }
                AbstractC50523MSb.A0z(A0f, str);
            }
        }
        C448724r c448724r = AnonymousClass229.A01(userSession).A0F;
        MYO myo = c55011OVw.A03;
        String str2 = c55011OVw.A04;
        if (str2 == null) {
            str2 = EnumC53201Nfx.A04.A00;
        }
        if (!A012) {
            InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
            if (A0M.isSampled()) {
                MSW.A1N(C81X.A2H, A0M);
                AbstractC166987dD.A1S(A0M, AbstractC50522MSa.A0i(A0M, c448724r, "IG_CAMERA_CLIPS_SHARE_TO_FACEBOOK_PRIMER_SELECTION"));
                AbstractC50522MSa.A16(C22P.A1R, A0M, 2);
                MSZ.A1A(EnumC50631MWs.A0I, A0M);
                MSZ.A1B(myo, A0M, "media_source");
                AbstractC31175DnJ.A14(A0M, interfaceC11380iw);
                A0M.A7v("is_crosspost", AbstractC31173DnH.A0d(A0M, Boolean.valueOf(z), "allow_selection", false));
                AbstractC37302Gc3.A0t(A0M);
                AbstractC50523MSb.A0z(A0M, str2);
            }
        }
        if (z) {
            enumC201098ur = EnumC201098ur.ACCEPT;
        } else if (A012) {
            enumC201098ur = EnumC201098ur.OTHER;
        } else {
            enumC201098ur = EnumC201098ur.DECLINE;
        }
        A02(enumC201098ur, userSession, c55011OVw);
    }

    public static final void A02(EnumC201098ur enumC201098ur, UserSession userSession, C55011OVw c55011OVw) {
        C46552Bt A002 = AbstractC46542Bs.A00(userSession);
        C82H c82h = c55011OVw.A02;
        long j = 0;
        if (c82h.ordinal() == 46) {
            InterfaceC19630xq interfaceC19630xq = A002.A04;
            if (!interfaceC19630xq.getBoolean("PREFERENCE_REELS_SHOULD_SHOW_RECOMMEND_ON_FACEBOOK_CREATION_PRIMER", true)) {
                j = Math.max(interfaceC19630xq.getLong(AbstractC43591JPw.A00(679), 0L), 1L);
            }
        }
        boolean A1X = MSZ.A1X(C196068lw.A00(userSession), "RecommendOnFbUtils");
        C82G c82g = c55011OVw.A01;
        C82I A0H = MSW.A0H();
        A0H.A06("waterfall_id", c55011OVw.A07);
        MSX.A1I(A0H, A1X);
        AbstractC50523MSb.A18(A0H, j);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
    }

    public final void A04(Context context, EnumC53249Ngn enumC53249Ngn) {
        int i;
        C193328hC A0I;
        switch (enumC53249Ngn.ordinal()) {
            case 0:
                i = 2131955718;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 1:
                i = 2131955711;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 2:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 17:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 27:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            default:
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                i = 2131972037;
                break;
            case 3:
                i = 2131955712;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 4:
                i = 2131955713;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 5:
                i = 2131955714;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 7:
                i = 2131955723;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 2131955701;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = 2131955715;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 16:
                i = 2131955716;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 18:
                i = 2131955710;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 21:
                i = 2131955717;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 22:
                i = 2131955719;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 23:
                i = 2131955720;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 24:
            case 25:
                i = 2131955721;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 26:
                i = 2131955722;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 28:
                i = 2131955724;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
            case 30:
                i = 2131955726;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131955725);
                break;
        }
        A0I.A09(i);
        AbstractC31176DnK.A1W(A0I);
    }

    public final void A05(Fragment fragment, C54729OFg c54729OFg) {
        C55011OVw c55011OVw;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && (c55011OVw = c54729OFg.A09) != null) {
            UserSession userSession = c54729OFg.A05;
            C52125N4y A002 = C55905Oru.A00(ViewOnClickListenerC55459OkE.A00(fragment, c55011OVw, userSession, 15), ViewOnClickListenerC55459OkE.A00(fragment, c55011OVw, userSession, 16), c55011OVw, new ME5(32, fragment, userSession, c55011OVw));
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A16 = true;
            AbstractC25225BEi.A1Q(A0y, false);
            A0y.A0U = new C56758PHa(1, userSession, c54729OFg);
            AbstractC31173DnH.A0w(activity, A002, A0y);
        }
    }
}
