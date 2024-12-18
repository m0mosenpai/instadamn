package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8Y8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Y8 {
    public final Activity A00;
    public final ViewGroup A01;
    public final AbstractC59962oe A02;
    public final AnonymousClass857 A03;
    public final C684436h A04;
    public final UserSession A05;
    public final TouchInterceptorFrameLayout A06;
    public final C8RZ A07;
    public final C187198Rm A08;
    public final C8LZ A09;
    public final C183688Ct A0A;
    public final C8MV A0B;
    public final C185948Mo A0C;
    public final C8NU A0D;
    public final AnonymousClass840 A0E;
    public final C81J A0F;
    public final C1812682c A0G;
    public final C82F A0H;
    public final InterfaceC1810081c A0I;
    public final AnonymousClass856 A0J;
    public final InterfaceC08830cm A0K;
    public final InterfaceC09390do A0L;
    public final C8Y5 A0M;
    public final C57012jc A0N;
    public final C8XA A0O;
    public final AnonymousClass853 A0P;
    public final C8LC A0Q;
    public final C82J A0R;
    public final C8YE A0S;
    public final C8YA A0T;

    public static void A05(C8Y8 c8y8, C188538Ws c188538Ws, UserStoryTarget userStoryTarget, String str, String str2, boolean z) {
        ShareType shareType;
        AnonymousClass229.A01(c8y8.A05).A04.A09();
        if (userStoryTarget == UserStoryTarget.A07) {
            shareType = ShareType.A0I;
        } else {
            shareType = ShareType.A0V;
        }
        ACA aca = new ACA(null, userStoryTarget, shareType);
        int ordinal = A00(c8y8).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c8y8.A0C.A0P(aca, null, new A96("auto_xpost", null, z, false), c188538Ws, null, C05F.A00, str, str2, null, null, null, null, 1, false);
                return;
            }
            throw new UnsupportedOperationException("Unknown media type");
        }
        c8y8.A09.A0J(null, aca, null, new A96("auto_xpost", null, z, false), c188538Ws, C05F.A00, str, str2, null, false, c8y8.A0A.A1E.A03.A0G);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if ((!X.C183688Ct.A0M(r1)) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(X.C8Y8 r7, X.C188538Ws r8, java.lang.String r9, java.lang.String r10) {
        /*
            r2 = r7
            X.8RZ r1 = r7.A07
            r0 = 0
            r1.A0D(r0)
            X.8Ct r1 = r7.A0A
            X.8ld r0 = r1.A1r
            boolean r0 = r0.A06()
            if (r0 == 0) goto L1a
            boolean r0 = X.C183688Ct.A0M(r1)
            r0 = r0 ^ 1
            r7 = 1
            if (r0 != 0) goto L1b
        L1a:
            r7 = 0
        L1b:
            r1.A0c()
            r1.A0Z()
            com.instagram.pendingmedia.model.UserStoryTarget r4 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            r3 = r8
            r5 = r9
            r6 = r10
            A05(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8Y8.A06(X.8Y8, X.8Ws, java.lang.String, java.lang.String):void");
    }

    public static void A09(C8Y8 c8y8, String str, boolean z) {
        c8y8.A07.A0D(false);
        int ordinal = A00(c8y8).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c8y8.A0C.A0P(new ACA(null, UserStoryTarget.A06, ShareType.A0V), null, null, null, Boolean.valueOf(z), C05F.A00, null, null, str, null, null, null, 1, false);
                return;
            }
            throw new UnsupportedOperationException("Unknown media type");
        }
        C8LZ.A0A(c8y8.A09, new ACA(null, UserStoryTarget.A06, ShareType.A0V), null, null, Boolean.valueOf(z), null, str);
    }

    public static EnumC198268pb A00(C8Y8 c8y8) {
        if (c8y8.A09.A0K()) {
            return EnumC198268pb.A04;
        }
        return c8y8.A0E.A02.A02();
    }

    private C47Z A01() {
        C8Y5 c8y5 = this.A0M;
        C1816783z c1816783z = this.A0E.A02;
        CameraAREffect A00 = this.A0Q.A00();
        C183688Ct c183688Ct = this.A0A;
        return c8y5.A03(A00, c1816783z, c183688Ct.A1E.A03.A00(), c183688Ct.A0X(), c183688Ct.A0W());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.82I, X.0Zx] */
    public static void A02(EnumC201098ur enumC201098ur, C8Y8 c8y8, String str, boolean z) {
        String str2;
        UserSession userSession = c8y8.A05;
        C82G c82g = C82G.A0n;
        C82H c82h = C82H.A08;
        ?? c0Zx = new C0Zx();
        if (z) {
            str2 = "is_sharing";
        } else {
            str2 = "not_sharing";
        }
        c0Zx.A06(AbstractC111324zv.A00(1317), str2);
        c0Zx.A09(true);
        c0Zx.A06("waterfall_id", str);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, c0Zx, userSession);
    }

    public static void A03(final C8Y8 c8y8) {
        String A06;
        int i;
        int i2;
        int i3;
        boolean z;
        Activity activity = c8y8.A00;
        C3DN A00 = C3DN.A00.A00(activity);
        if (A00 != null) {
            C2UY.A01.A03();
            A00.A0R(new AbstractC86353t7() { // from class: X.9pt
                @Override // X.AbstractC86353t7, X.InterfaceC86363t8
                public final void DB6() {
                    C8Y8 c8y82 = C8Y8.this;
                    View view = c8y82.A02.mView;
                    if (view != null) {
                        AbstractC13880nE.A0O(view);
                    }
                    C188528Wr A002 = AbstractC188518Wq.A00(c8y82.A05);
                    C188538Ws c188538Ws = A002.A00;
                    A002.A00 = null;
                    if (c188538Ws != null) {
                        C8Y8.A07(c8y82, c188538Ws, null, null);
                    }
                }
            });
            String str = c8y8.A05.token;
            C1816783z c1816783z = c8y8.A0E.A02;
            int ordinal = c1816783z.A01().ordinal();
            boolean z2 = false;
            if (ordinal != 0) {
                z2 = true;
                if (ordinal == 1) {
                    C195868lW A04 = c1816783z.A01.A04();
                    A04.getClass();
                    A06 = A04.A0k;
                    i = A04.A0K;
                    i2 = A04.A08;
                    i3 = A04.A09;
                    z = A04.A1D;
                } else {
                    throw new UnsupportedOperationException("Unknown media type");
                }
            } else {
                C183978Ee A03 = c1816783z.A01.A03();
                A03.getClass();
                A06 = A03.A06();
                i = A03.A09;
                i2 = A03.A06;
                i3 = A03.A07;
                z = A03.A14;
            }
            InlineAddHighlightFragment A02 = AbstractC55178Odj.A02(new ArchivePendingUpload(A06, i, i2, i3, z2, z), null, str);
            C14360o3.A0B(activity, 1);
            A00.A0I(activity, A02, C05F.A00, true);
        }
    }

    public static void A04(C8Y8 c8y8) {
        C8NU c8nu = c8y8.A0D;
        if (c8nu.A01().A09 != null) {
            for (Object obj : c8nu.A01().A09.keySet()) {
                if (obj instanceof BEc) {
                    break;
                }
            }
        }
        if (c8nu.A01().A0K != null) {
            for (Object obj2 : c8nu.A01().A0K.keySet()) {
                if (obj2 instanceof BEc) {
                    C447024a c447024a = AnonymousClass229.A01(c8y8.A05).A02;
                    MusicOverlayStickerModel BVf = ((BEc) obj2).BVf();
                    c447024a.A03(BVf.A0S, BVf.A0T, BVf.A0m);
                    return;
                }
            }
        }
        AnonymousClass229.A01(c8y8.A05).A02.A03(null, null, null);
    }

    public static void A07(final C8Y8 c8y8, final C188538Ws c188538Ws, final String str, final String str2) {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.AOV
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C8Y8.A06(C8Y8.this, c188538Ws, str, str2);
            }
        };
        c8y8.A0A.A0b();
        if (!A0C(onClickListener, c8y8)) {
            if (!(!C183688Ct.A0M(r1))) {
                A06(c8y8, c188538Ws, str, str2);
                return;
            }
            InterfaceC57990Pna interfaceC57990Pna = new InterfaceC57990Pna() { // from class: X.Alo
                @Override // X.InterfaceC57990Pna
                public final void afterSelection(boolean z) {
                    C8Y8 c8y82 = C8Y8.this;
                    C188538Ws c188538Ws2 = c188538Ws;
                    String str3 = str;
                    String str4 = str2;
                    if (z) {
                        c8y82.A0A.A1r.A05(true, "upsell");
                    }
                    C8Y8.A06(c8y82, c188538Ws2, str3, str4);
                }
            };
            UserSession userSession = c8y8.A05;
            C200018t5 c200018t5 = new C200018t5(userSession);
            C54804OJy A00 = AbstractC54221Nxz.A00(c8y8.A00, C82G.A0n, userSession);
            A00.A05 = interfaceC57990Pna;
            A00.A0A = str;
            AbstractC59962oe abstractC59962oe = c8y8.A02;
            C14360o3.A0B(abstractC59962oe, 0);
            A00.A01 = abstractC59962oe;
            c200018t5.A01(null, A00, new InterfaceC57992Pnc() { // from class: X.Alr
                @Override // X.InterfaceC57992Pnc
                public final void Dgl(Integer num) {
                    C8Y8 c8y82 = C8Y8.this;
                    C188538Ws c188538Ws2 = c188538Ws;
                    String str3 = str;
                    String str4 = str2;
                    if (num == C05F.A00) {
                        C8Y8.A06(c8y82, c188538Ws2, str3, str4);
                    }
                }
            });
        }
    }

    public static void A08(C8Y8 c8y8, String str, String str2) {
        AGy aGy = AGy.A00;
        aGy.A01("sink", "story");
        aGy.A00();
        A07(c8y8, null, str, str2);
    }

    public static void A0A(C8Y8 c8y8, List list, int i) {
        c8y8.A07.A0D(false);
        int ordinal = A00(c8y8).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c8y8.A0C.A0P(new ACA(null, UserStoryTarget.A09, ShareType.A0V), null, null, null, null, C05F.A00, null, null, null, null, list, null, i, false);
                return;
            }
            throw new UnsupportedOperationException("Unknown media type");
        }
        C8LZ c8lz = c8y8.A09;
        UserStoryTarget userStoryTarget = UserStoryTarget.A09;
        C8LZ.A08(c8lz, null, new ACA(null, userStoryTarget, ShareType.A0V), null, null, null, null, null, null, C05F.A00, null, null, null, null, list, null, i, false, false);
    }

    private boolean A0B() {
        C183918Ds c183918Ds = this.A0A.A1E;
        ReelMoreOptionsModel reelMoreOptionsModel = c183918Ds.A03;
        if (!reelMoreOptionsModel.A0E && (reelMoreOptionsModel.A00() == null || !((BrandedContentTag) c183918Ds.A03.A00().get(0)).A04)) {
            return false;
        }
        return true;
    }

    public static boolean A0C(DialogInterface.OnClickListener onClickListener, final C8Y8 c8y8) {
        C183688Ct c183688Ct = c8y8.A0A;
        C183918Ds c183918Ds = c183688Ct.A1E;
        if (!c183918Ds.A03.A0H) {
            AnonymousClass857 anonymousClass857 = c8y8.A03;
            if (!anonymousClass857.A00) {
                UserSession userSession = c8y8.A05;
                if (C4A4.A00(userSession)) {
                    List A00 = c183918Ds.A03.A00();
                    ArrayList A0X = c183688Ct.A0X();
                    String A002 = c183688Ct.A0S().A00();
                    if (A00 == null) {
                        A00 = Collections.emptyList();
                    }
                    List A02 = anonymousClass857.A02(userSession, A002, A0X, A00);
                    if (!A02.isEmpty()) {
                        anonymousClass857.A03(c8y8.A02.requireContext(), new DialogInterface.OnClickListener() { // from class: X.ANm
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C183918Ds c183918Ds2 = C8Y8.this.A0A.A1E;
                                if (c183918Ds2.A00 != null) {
                                    c183918Ds2.A08 = true;
                                    c183918Ds2.A09 = true;
                                    c183918Ds2.A01();
                                }
                            }
                        }, onClickListener, userSession, C05F.A00, "story", A02);
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void A0D() {
        UserSession userSession = this.A05;
        C82F c82f = this.A0H;
        OQA.A01(userSession, "primary_click_cf", "cf_story_button", c82f.A01);
        A04(this);
        C183688Ct c183688Ct = this.A0A;
        C8DP c8dp = c183688Ct.A1q;
        AGy aGy = AGy.A00;
        aGy.A01("sink", "close_friend");
        aGy.A00();
        c183688Ct.A0b();
        C684436h c684436h = this.A04;
        UserSession userSession2 = c684436h.A01;
        int A00 = AbstractC34041F0u.A00(userSession2);
        boolean z = !C183688Ct.A0M(c183688Ct);
        if (A00 > 0) {
            if (z && !AbstractC46542Bs.A00(c8dp.A00).A04.getBoolean("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS_EDUCATION_HAS_SHOWN", false)) {
                CallerContext callerContext = C180377zR.A00;
            }
            OQA.A01(userSession, MSV.A00(546), "cf_story_button", c82f.A01);
            this.A07.A0D(false);
            c183688Ct.A0c();
            c183688Ct.A0Z();
            A05(this, null, UserStoryTarget.A02, null, null, true);
            return;
        }
        if (z) {
            CallerContext callerContext2 = C180377zR.A00;
        }
        AbstractC35049FcM.A01(c684436h.A00, EnumC33409Epg.STORY_SHARE_SHORTCUT, userSession2, false, false);
    }

    public final void A0E() {
        if (AbstractC101614hW.A0E(this.A0A.A0X())) {
            AbstractC35234FgS.A04(this.A05, this.A02.requireContext());
            return;
        }
        this.A07.A0D(false);
        int ordinal = A00(this).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.A0C.A0Q(new ACA(null, UserStoryTarget.A03, ShareType.A0V), null, C05F.A00, null, null, false);
                return;
            }
            throw new UnsupportedOperationException("Unknown media type");
        }
        C8LZ c8lz = this.A09;
        BBu bBu = this.A0F.A0h;
        UserStoryTarget userStoryTarget = UserStoryTarget.A03;
        c8lz.A0J(bBu, new ACA(null, userStoryTarget, ShareType.A0V), null, null, null, C05F.A00, null, null, null, false, false);
    }

    public final void A0F(String str) {
        UserSession userSession = this.A05;
        AnonymousClass229.A01(userSession).A1j(null, "SHARED_LISTS_SHARE_CUT_BUTTON", null);
        AbstractC35258Fgs.A02(this.A00, userSession, new AjT(this), str, null);
    }

    public final void A0G(String str, String str2) {
        C82F c82f = this.A0H;
        c82f.A01 = str;
        c82f.A00 = str2;
        A04(this);
        if (A0B()) {
            this.A0M.A04(A01(), new InterfaceC16820sZ() { // from class: X.B2v
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    C8Y8 c8y8 = C8Y8.this;
                    C82F c82f2 = c8y8.A0H;
                    C8Y8.A08(c8y8, c82f2.A01, c82f2.A00);
                    return C0eB.A00;
                }
            });
            return;
        }
        if (!A0B() && this.A0A.A1E.A03.A0G) {
            this.A0M.A05(A01(), new InterfaceC16820sZ() { // from class: X.B2w
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    C8Y8 c8y8 = C8Y8.this;
                    C82F c82f2 = c8y8.A0H;
                    C8Y8.A08(c8y8, c82f2.A01, c82f2.A00);
                    return C0eB.A00;
                }
            });
            return;
        }
        C8YE c8ye = this.A0S;
        c8ye.A07(this.A0T.getContent());
        c8ye.A04();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.8YD, java.lang.Object] */
    public C8Y8(ViewGroup viewGroup, C8Y5 c8y5, AnonymousClass857 anonymousClass857, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C57012jc c57012jc, C8RZ c8rz, C187198Rm c187198Rm, C8LZ c8lz, C183688Ct c183688Ct, C8MV c8mv, C185948Mo c185948Mo, C8NU c8nu, AnonymousClass840 anonymousClass840, C81J c81j, C1812682c c1812682c, C8XA c8xa, C82F c82f, AnonymousClass853 anonymousClass853, C8LC c8lc, InterfaceC1810081c interfaceC1810081c, AnonymousClass856 anonymousClass856, C82J c82j, InterfaceC08830cm interfaceC08830cm, InterfaceC09390do interfaceC09390do) {
        this.A0F = c81j;
        UserSession userSession = c81j.A0S;
        this.A05 = userSession;
        Activity activity = c81j.A05;
        this.A00 = activity;
        c81j.A0M.getClass();
        AbstractC59962oe abstractC59962oe = c81j.A0M;
        this.A02 = abstractC59962oe;
        this.A0E = anonymousClass840;
        this.A0G = c1812682c;
        this.A0I = interfaceC1810081c;
        this.A0A = c183688Ct;
        this.A03 = anonymousClass857;
        this.A0P = anonymousClass853;
        this.A0O = c8xa;
        this.A07 = c8rz;
        this.A09 = c8lz;
        this.A0C = c185948Mo;
        this.A0M = c8y5;
        this.A0Q = c8lc;
        this.A0N = c57012jc;
        this.A0H = c82f;
        this.A0D = c8nu;
        this.A06 = touchInterceptorFrameLayout;
        this.A04 = new C684436h(activity, userSession);
        this.A0R = c82j;
        this.A08 = c187198Rm;
        this.A0B = c8mv;
        this.A0J = anonymousClass856;
        this.A01 = viewGroup;
        this.A0K = interfaceC08830cm;
        this.A0L = interfaceC09390do;
        C8YA c8ya = new C8YA() { // from class: X.8Y9
            @Override // X.C8YA
            public final String AbY() {
                return MSV.A00(1014);
            }

            @Override // X.C8YA
            public final /* synthetic */ void CzK() {
            }

            @Override // X.C8YA
            public final /* synthetic */ void DOg() {
            }

            @Override // X.C8YA
            public final /* synthetic */ void Dw9() {
            }

            @Override // X.C8YA
            public final /* synthetic */ void E1m() {
            }

            @Override // X.C8YA
            public final /* synthetic */ void E1n() {
            }

            @Override // X.C8YA
            public final void E4v() {
                C8Y8 c8y8 = C8Y8.this;
                C82F c82f2 = c8y8.A0H;
                C8Y8.A08(c8y8, c82f2.A01, c82f2.A00);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            @Override // X.C8YA
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List getContent() {
                /*
                    r4 = this;
                    X.8Y8 r2 = X.C8Y8.this
                    X.840 r0 = r2.A0E
                    X.83z r0 = r0.A02
                    X.8pb r0 = r0.A01()
                    int r1 = r0.ordinal()
                    r3 = 0
                    if (r1 == r3) goto L34
                    r0 = 1
                    if (r1 == r0) goto L41
                    r0 = 0
                L15:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    if (r0 == 0) goto L4a
                    java.util.Iterator r1 = r0.iterator()
                L20:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L4a
                    java.lang.Object r0 = r1.next()
                    X.55m r0 = (X.C55m) r0
                    java.lang.String r0 = r0.A09
                    if (r0 == 0) goto L20
                    r2.add(r0)
                    goto L20
                L34:
                    X.8LZ r0 = r2.A09
                    X.8Ct r2 = r0.A0G
                    X.89E r1 = r0.A0T
                    X.8MD r0 = r0.A0Z
                    X.8Qv r0 = X.C8NV.A00(r2, r0, r1, r3)
                    goto L47
                L41:
                    X.8NU r0 = r2.A0D
                    X.8Qv r0 = r0.A01()
                L47:
                    java.util.List r0 = r0.A0G
                    goto L15
                L4a:
                    boolean r0 = r2.isEmpty()
                    if (r0 == 0) goto L55
                    java.lang.String r0 = ""
                    r2.add(r0)
                L55:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8Y9.getContent():java.util.List");
            }
        };
        this.A0T = c8ya;
        C1YB A00 = C8YB.A00();
        C8YB.A00();
        this.A0S = A00.A00((ViewStub) touchInterceptorFrameLayout.requireViewById(R.id.warning_nudge), abstractC59962oe, userSession, new Object(), c8ya);
    }
}
