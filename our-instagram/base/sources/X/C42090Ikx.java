package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.user.model.User;

/* renamed from: X.Ikx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42090Ikx implements CallerContextable {
    public static final String __redex_internal_original_name = "MediaOptionsOverflowHelper";
    public InterfaceC41501vz A00;
    public final int A01;
    public final int A02;
    public final DialogInterface.OnDismissListener A03;
    public final Fragment A04;
    public final FragmentActivity A05;
    public final AbstractC10360h2 A06;
    public final AbstractC018607g A07;
    public final CallerContext A08 = CallerContext.A01(__redex_internal_original_name);
    public final InterfaceC60142ow A09;
    public final UserSession A0A;
    public final C41582IaV A0B;
    public final C41773Iep A0C;
    public final InterfaceC690238o A0D;
    public final C38321qM A0E;
    public final InterfaceC60442pS A0F;
    public final C75113Zb A0G;
    public final AnonymousClass341 A0H;
    public final InterfaceC114755Gg A0I;
    public final C6WQ A0J;
    public final InterfaceC43428JGs A0K;
    public final C1M1 A0L;
    public final EnumC114765Gh A0M;
    public final C684436h A0N;
    public final C18920wW A0O;
    public final C684636j A0P;
    public final InterfaceC114705Ga A0Q;
    public final InterfaceC692739n A0R;
    public final AnonymousClass388 A0S;
    public final InterfaceC37202GaD A0T;
    public final AnonymousClass389 A0U;
    public final WEz A0V;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x048b, code lost:
    
        if (X.AbstractC75373a4.A0D(r5) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ec, code lost:
    
        if (X.C18U.A06(r7, r6, 36325287201747944L) == false) goto L22;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x103b  */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.1qM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(X.EnumC39627Hel r40) {
        /*
            Method dump skipped, instructions count: 4870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42090Ikx.A0B(X.Hel):void");
    }

    public static final void A01(C82G c82g, C42090Ikx c42090Ikx, C211849aB c211849aB, Integer num) {
        Integer num2 = c211849aB.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2 && c82g == C82G.A0V) {
                        c42090Ikx.A09(num, new J7C(c42090Ikx, 2), false, false);
                        return;
                    }
                    return;
                }
                if (c82g == C82G.A0V) {
                    c42090Ikx.A09(num, new J7C(c42090Ikx, 1), true, false);
                    return;
                } else {
                    if (c82g != C82G.A0G) {
                        return;
                    }
                    A07(c42090Ikx, false);
                    return;
                }
            }
            if (c82g == C82G.A0V) {
                c42090Ikx.A09(num, new J7C(c42090Ikx, 0), true, true);
            } else {
                if (c82g != C82G.A0G) {
                    return;
                }
                UserSession userSession = c42090Ikx.A0A;
                OQ9.A00(userSession).A01(userSession, "upsell", true);
                A07(c42090Ikx, true);
            }
        }
    }

    public static final void A02(C42090Ikx c42090Ikx) {
        C38321qM c38321qM = c42090Ikx.A0E;
        boolean A5P = c38321qM.A5P();
        UserSession userSession = c42090Ikx.A0A;
        if (A5P) {
            AbstractC1571873x.A07(c42090Ikx.A05, userSession, c38321qM);
        } else {
            AbstractC1571873x.A06(c42090Ikx.A05, null, userSession, c38321qM, C3YU.A04, c42090Ikx.A0M);
        }
    }

    public static final void A03(C42090Ikx c42090Ikx) {
        C38321qM c38321qM = c42090Ikx.A0E;
        c42090Ikx.A08(c38321qM);
        FragmentActivity fragmentActivity = c42090Ikx.A05;
        AbstractC10360h2 abstractC10360h2 = c42090Ikx.A06;
        C75113Zb c75113Zb = c42090Ikx.A0G;
        InterfaceC60442pS interfaceC60442pS = c42090Ikx.A0F;
        AbstractC31510Dsu.A0C(fragmentActivity, abstractC10360h2, c42090Ikx.A07, new C35871Fsl(fragmentActivity, null, 1, false), c42090Ikx.A0A, c38321qM, interfaceC60442pS, c75113Zb, true, C05F.A00, null, "feed_action_sheet", "copy_link", false);
    }

    public static final void A04(C42090Ikx c42090Ikx) {
        UserSession userSession = c42090Ikx.A0A;
        InterfaceC60442pS interfaceC60442pS = c42090Ikx.A0F;
        C8EV.A01(new C8EV(interfaceC60442pS, userSession), "overflow_menu_create_sticker_tapped");
        FragmentActivity fragmentActivity = c42090Ikx.A05;
        Fragment fragment = c42090Ikx.A04;
        Context requireContext = fragment.requireContext();
        C38321qM c38321qM = c42090Ikx.A0E;
        IQ5.A01(requireContext, fragmentActivity, c42090Ikx.A06, fragment, c42090Ikx.A07, interfaceC60442pS, userSession, c38321qM, C05F.A02);
    }

    public static final void A05(C42090Ikx c42090Ikx) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c42090Ikx.A0O, "profile_grid_edit_post_clicked");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A15(A0f, c42090Ikx.A0F);
            A0f.Cht();
        }
        C140966Yy A0r = AbstractC25225BEi.A0r(c42090Ikx.A04.requireActivity(), c42090Ikx.A0A);
        OMV A01 = AbstractC69933Cc.A01();
        C38321qM c38321qM = c42090Ikx.A0E;
        String id = c38321qM.getId();
        if (id != null) {
            A0r.A0D(A01.A02(id, c38321qM.BRp().A00, c42090Ikx.A01, c42090Ikx.A02, c42090Ikx.A0G.A2U));
            A0r.A04();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A06(C42090Ikx c42090Ikx) {
        Fragment fragment = c42090Ikx.A04;
        UserSession userSession = c42090Ikx.A0A;
        C38321qM c38321qM = c42090Ikx.A0E;
        User BAR = c38321qM.A0C.BAR();
        if (BAR != null) {
            String id = BAR.getId();
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                A0c.A0L("groups/%s/pin_media/%s/", id, A2u);
                C1ON A0Q = AbstractC31177DnL.A0Q(A0c);
                A0Q.A00 = C41602Iaq.A00(fragment, new C57259Pbh(id, userSession, 11), C43201J7y.A00, 2131969667, R.drawable.instagram_pin_pano_outline_24, 2131969644, 2131969647);
                C1GJ.A03(A0Q);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A07(C42090Ikx c42090Ikx, boolean z) {
        C38321qM c38321qM = c42090Ikx.A0E;
        String A19 = AbstractC166987dD.A19(C0HM.A00());
        C52227N9q c52227N9q = new C52227N9q(c42090Ikx, A19, 1, z);
        ShareLaterMedia shareLaterMedia = new ShareLaterMedia(c38321qM);
        shareLaterMedia.A07 = true;
        c38321qM.A4H(EnumC76753cN.A06);
        C1GL c1gl = (C1GL) c42090Ikx.A04;
        C1ON A00 = AbstractC54145Nwh.A00(c42090Ikx.A0A, shareLaterMedia, A19, "likes_sheet");
        A00.A00 = c52227N9q;
        c1gl.schedule(A00);
    }

    private final void A09(Integer num, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2) {
        String str;
        C196058lv A00 = C196068lw.A00(this.A0A);
        CallerContext callerContext = this.A08;
        switch (num.intValue()) {
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = "feed_share_later";
                break;
            case 14:
                str = "feed_upsell_after_feed_posted";
                break;
            case Process.SIGTERM /* 15 */:
                str = "ig_tv";
                break;
            case 16:
                str = "legacy_backfill";
                break;
            case 17:
                str = "likes_sheet";
                break;
            case 18:
                str = AbstractC43591JPw.A00(427);
                break;
            case Process.SIGSTOP /* 19 */:
                str = "reels";
                break;
            case 20:
                str = "reels_in_feed_overflow_menu";
                break;
            case 21:
                str = "reels_overflow_menu";
                break;
            case 22:
                str = MSV.A00(255);
                break;
            default:
                str = AbstractC111324zv.A00(514);
                break;
        }
        A00.A01(callerContext, new C42406Iq7(interfaceC16620sF, 0, z, z2), str);
    }

    private final void A0A(boolean z) {
        User A14 = AbstractC25226BEj.A14(this.A0E);
        if (A14 != null) {
            C684436h c684436h = this.A0N;
            C61972ry c61972ry = new C61972ry(this.A05, this.A07, null);
            InterfaceC60442pS interfaceC60442pS = this.A0F;
            c684436h.A01(interfaceC60442pS, c61972ry, null, A14, z);
            C127085om A00 = AbstractC127075ol.A00(this.A0A);
            String moduleName = interfaceC60442pS.getModuleName();
            if (z) {
                A00.A00(A14, moduleName, null, null, "feed_overflow_menu");
            } else {
                A00.A01(A14, moduleName, null, null, "feed_overflow_menu");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C42090Ikx(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, InterfaceC60142ow interfaceC60142ow, C684436h c684436h, C18920wW c18920wW, UserSession userSession, C684636j c684636j, InterfaceC114705Ga interfaceC114705Ga, C41582IaV c41582IaV, C41773Iep c41773Iep, InterfaceC690238o interfaceC690238o, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC692739n interfaceC692739n, C75113Zb c75113Zb, AnonymousClass341 anonymousClass341, InterfaceC114755Gg interfaceC114755Gg, AnonymousClass388 anonymousClass388, InterfaceC37202GaD interfaceC37202GaD, AnonymousClass389 anonymousClass389, C6WQ c6wq, InterfaceC43428JGs interfaceC43428JGs, C1M1 c1m1, EnumC114765Gh enumC114765Gh, WEz wEz, int i, int i2) {
        this.A04 = fragment;
        this.A05 = fragmentActivity;
        this.A06 = abstractC10360h2;
        this.A0Q = interfaceC114705Ga;
        this.A07 = abstractC018607g;
        this.A0F = interfaceC60442pS;
        this.A0E = c38321qM;
        this.A0G = c75113Zb;
        this.A0H = anonymousClass341;
        this.A02 = i;
        this.A01 = i2;
        this.A0L = c1m1;
        this.A0C = c41773Iep;
        this.A0A = userSession;
        this.A0P = c684636j;
        this.A0D = interfaceC690238o;
        this.A0R = interfaceC692739n;
        this.A0S = anonymousClass388;
        this.A0T = interfaceC37202GaD;
        this.A0I = interfaceC114755Gg;
        this.A0U = anonymousClass389;
        this.A0B = c41582IaV;
        this.A0V = wEz;
        this.A0J = c6wq;
        this.A0O = c18920wW;
        this.A0N = c684436h;
        this.A0K = interfaceC43428JGs;
        this.A03 = onDismissListener;
        this.A0M = enumC114765Gh;
        this.A09 = interfaceC60142ow;
        ((InterfaceC59992oh) fragment).registerLifecycleListener(new C37766Gjh(this, 2));
    }

    private final DialogInterfaceOnClickListenerC41807IfN A00(C38321qM c38321qM) {
        String A34 = c38321qM.A34();
        if (A34 == null) {
            return null;
        }
        UserSession userSession = this.A0A;
        String A0a = AbstractC37302Gc3.A0a(userSession, c38321qM);
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            AbstractC55224Oeq.A04(this.A04.requireActivity(), userSession, A34, null, A0a, A2u);
            return new DialogInterfaceOnClickListenerC41807IfN(this, A34, A0a, A2u);
        }
        throw AbstractC166997dE.A0g();
    }

    private final void A08(C38321qM c38321qM) {
        if (C3YV.A08(c38321qM)) {
            UserSession userSession = this.A0A;
            if (C18U.A06(C06090Tz.A05, userSession, 36317745238775302L)) {
                C55782hJ A00 = C55772hI.A00(userSession);
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    synchronized (A00.A0K) {
                        A00._lastClickedExternalSharedFeedIds.add(A2u);
                    }
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }
}
