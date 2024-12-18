package X;

import android.app.Activity;
import android.location.Location;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: X.8TT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TT implements C2d5, InterfaceC1810781j {
    public C194648jP A00;
    public InterfaceC193848i5 A01;
    public final Activity A02;
    public final View A03;
    public final ViewGroup A04;
    public final ViewGroup A05;
    public final ViewGroup A06;
    public final AnonymousClass857 A07;
    public final C1815283f A08;
    public final UserSession A09;
    public final C1GL A0A;
    public final C1810981l A0B;
    public final C89F A0C;
    public final C8TU A0D;
    public final C8RZ A0E;
    public final C187198Rm A0F;
    public final C8LZ A0G;
    public final C8TN A0H;
    public final C183688Ct A0I;
    public final C185948Mo A0J;
    public final TargetViewSizeProvider A0K;
    public final C8HI A0L;
    public final AnonymousClass840 A0M;
    public final C88D A0N;
    public final C1828889j A0O;
    public final C184518Gr A0P;
    public final C1820485o A0Q;
    public final C8FE A0R;
    public final C8GE A0S;
    public final C184918Ig A0T;
    public final C8LC A0U;
    public final C8HD A0V;
    public final C184898Ie A0W;
    public final C184878Ic A0X;
    public final C8GF A0Y;
    public final InterfaceC1810081c A0Z;
    public final C8JU A0a;
    public final ClipsCreationViewModel A0b;
    public final C89E A0c;
    public final C8FB A0d;
    public final C150286pc A0e;
    public final ViewOnTouchListenerC1829389o A0f;
    public final C8CS A0g;
    public final InterfaceC127465pP A0h;
    public final C8HB A0i;
    public final InteractiveDrawableContainer A0j;
    public final java.util.Set A0k;
    public final boolean A0l;
    public final int A0m;
    public final AnonymousClass874 A0n;
    public final C184858Ia A0o;
    public final C87H A0p;
    public final InterfaceC09390do A0q;

    private final void A04(EnumC198268pb enumC198268pb, boolean z) {
        Integer num;
        String str;
        if (z) {
            num = C05F.A00;
        } else {
            C1810981l c1810981l = this.A0B;
            if (c1810981l.A0S()) {
                num = C05F.A01;
            } else {
                num = null;
            }
            if (c1810981l.A0W(C81W.A0B)) {
                num = C05F.A0C;
            }
            if (c1810981l.A0W(C81W.A0M)) {
                num = C05F.A0N;
            }
            if (c1810981l.A0W(C81W.A0C)) {
                num = C05F.A0j;
            } else if (num == null) {
                num = C05F.A0u;
            }
        }
        UserSession userSession = this.A09;
        boolean z2 = this.A0O != null;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        switch (num.intValue()) {
            case 1:
                str = "normal";
                break;
            case 2:
                str = "boomerang";
                break;
            case 3:
                str = "hands-free";
                break;
            case 4:
                str = "igtv";
                break;
            case 5:
                str = "text";
                break;
            case 6:
                str = "unknown";
                break;
            default:
                str = "library-import";
                break;
        }
        String str2 = enumC198268pb.A01;
        InterfaceC19610xo ARD = A00.A01.ARD();
        ARD.E7K("pending_capture_intent_capture_mode", str);
        ARD.E7K("pending_capture_intent_media_type", str2);
        ARD.E77("pending_capture_intent_is_reply", z2);
        ARD.apply();
    }

    public final void A06(C198308pf c198308pf) {
        String str;
        ArrayList A1M = AbstractC16960so.A1M(c198308pf);
        C1816783z c1816783z = this.A0M.A02;
        c1816783z.A09(A1M);
        int ordinal = c1816783z.A01().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                str = "Unknown media type";
            } else {
                C185948Mo c185948Mo = this.A0J;
                C195868lW A04 = c1816783z.A01.A04();
                if (A04 != null) {
                    c185948Mo.A0R(A04, 0, true);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            str = "Photo post capture update not supported";
        }
        AbstractC12120kG.A07("CaptureStateCoordinator", str, null);
    }

    private final void A00() {
        InterfaceC11380iw interfaceC11380iw;
        UserSession userSession;
        C1816783z c1816783z = this.A0M.A02;
        Integer num = c1816783z.A01.A0B;
        C14360o3.A07(num);
        if (num == C05F.A0C) {
            userSession = this.A09;
            C55782hJ A00 = C55772hI.A00(userSession);
            C187198Rm c187198Rm = this.A0F;
            A00.A0C(c187198Rm, "back", this.A0m + 2);
            C55772hI.A00(userSession).A07(this.A02, c187198Rm);
        } else {
            if (c1816783z.A01() == EnumC198268pb.A04) {
                interfaceC11380iw = this.A0G;
            } else {
                interfaceC11380iw = this.A0J;
            }
            userSession = this.A09;
            C55772hI.A00(userSession).A0C(interfaceC11380iw, "back", this.A0m + 2);
            C55772hI.A00(userSession).A07(this.A02, interfaceC11380iw);
        }
        C55772hI.A00(userSession).A0D("unknown", this.A0L);
    }

    public static final void A01(C8TT c8tt, C195868lW c195868lW) {
        if (c195868lW != null && C9O6.A00(c8tt.A09, (C55U) c8tt.A0B.A08.A00)) {
            C1126256q c1126256q = new C1126256q();
            C1125856m c1125856m = new C1125856m(EnumC1125356h.VIDEO);
            c1125856m.A02(new C1125656k(new File(c195868lW.A0k)).A00());
            c1126256q.A04(new C1125956n(c1125856m));
            c195868lW.A0O = new MediaComposition(c1126256q);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a1, code lost:
    
        if (r9.A0I.A19.A32 != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C8TT r9, java.util.List r10, java.util.List r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8TT.A02(X.8TT, java.util.List, java.util.List, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C8TT r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8TT.A03(X.8TT, boolean):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:202|(1:297)(1:206)|207|(2:210|(5:212|(1:214)|215|(1:217)(1:219)|218))|220|(4:226|(1:228)|229|(9:233|234|235|236|237|(1:239)|240|(1:242)(2:244|(1:246)(2:247|(2:249|(3:251|(1:256)|255)(2:257|(3:285|(1:292)(1:289)|290)(2:263|(2:265|(2:283|284)(1:(2:277|(1:279)(1:280))(1:272))))))))|243))|296|234|235|236|237|(0)|240|(0)(0)|243) */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0b5f, code lost:
    
        if (r9 == false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0a06, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0a07, code lost:
    
        X.AbstractC12120kG.A07("ClipsPostCaptureController", "major issue showing reels post capture controls", null);
        X.C0K8.A0F("ClipsPostCaptureController", "failed to show reels post capture", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x036e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r11, 36316783166100113L) == false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A05(X.C8KC r35, java.util.List r36, java.util.List r37) {
        /*
            Method dump skipped, instructions count: 2983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8TT.A05(X.8KC, java.util.List, java.util.List):void");
    }

    @Override // X.C2d5
    public final C3O0 By1() {
        return (C3O0) this.A0q.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x09af, code lost:
    
        if (r9 == X.EnumC1810381f.A04) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0a58, code lost:
    
        if (r12.CLU() != false) goto L370;
     */
    /* JADX WARN: Type inference failed for: r0v267, types: [java.lang.Object, X.2pF] */
    @Override // X.InterfaceC1810781j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DoV(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 2981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8TT.DoV(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [X.8TU] */
    public C8TT(Activity activity, View view, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, AbstractC59962oe abstractC59962oe, AnonymousClass857 anonymousClass857, C1815283f c1815283f, UserSession userSession, C1GL c1gl, C1810981l c1810981l, C89F c89f, C8RZ c8rz, C187198Rm c187198Rm, C8LZ c8lz, C8TN c8tn, C183688Ct c183688Ct, C185948Mo c185948Mo, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass874 anonymousClass874, C8HI c8hi, AnonymousClass840 anonymousClass840, C88D c88d, C1828889j c1828889j, C184518Gr c184518Gr, C1820485o c1820485o, C8FE c8fe, C8GE c8ge, C184918Ig c184918Ig, C8LC c8lc, C8HD c8hd, C184858Ia c184858Ia, C184898Ie c184898Ie, C184878Ic c184878Ic, C8GF c8gf, InterfaceC1810081c interfaceC1810081c, C8JU c8ju, C89E c89e, C8FB c8fb, C150286pc c150286pc, ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o, C8CS c8cs, C8HB c8hb, InteractiveDrawableContainer interactiveDrawableContainer, int i, boolean z) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(c1810981l, 2);
        C14360o3.A0B(userSession, 5);
        C14360o3.A0B(activity, 7);
        C14360o3.A0B(viewGroup, 25);
        C14360o3.A0B(interactiveDrawableContainer, 26);
        C14360o3.A0B(viewGroup2, 27);
        C14360o3.A0B(viewGroup3, 28);
        C14360o3.A0B(c8cs, 43);
        C14360o3.A0B(targetViewSizeProvider, 44);
        this.A0B = c1810981l;
        this.A0M = anonymousClass840;
        this.A0Z = interfaceC1810081c;
        this.A09 = userSession;
        this.A03 = view;
        this.A02 = activity;
        this.A0I = c183688Ct;
        this.A0E = c8rz;
        this.A0F = c187198Rm;
        this.A0G = c8lz;
        this.A0J = c185948Mo;
        this.A0c = c89e;
        this.A0S = c8ge;
        this.A0Y = c8gf;
        this.A0a = c8ju;
        this.A0e = c150286pc;
        this.A0L = c8hi;
        this.A0R = c8fe;
        this.A07 = anonymousClass857;
        this.A0f = viewOnTouchListenerC1829389o;
        this.A0O = c1828889j;
        this.A0l = z;
        this.A0d = c8fb;
        this.A06 = viewGroup;
        this.A0j = interactiveDrawableContainer;
        this.A05 = viewGroup2;
        this.A04 = viewGroup3;
        this.A0m = i;
        this.A0Q = c1820485o;
        this.A0H = c8tn;
        this.A0N = c88d;
        this.A0A = c1gl;
        this.A08 = c1815283f;
        this.A0P = c184518Gr;
        this.A0o = c184858Ia;
        this.A0C = c89f;
        this.A0n = anonymousClass874;
        this.A0X = c184878Ic;
        this.A0W = c184898Ie;
        this.A0V = c8hd;
        this.A0U = c8lc;
        this.A0g = c8cs;
        this.A0K = targetViewSizeProvider;
        this.A0T = c184918Ig;
        this.A0i = c8hb;
        this.A0D = new InterfaceC1810781j() { // from class: X.8TU
            /* JADX WARN: Removed duplicated region for block: B:62:0x01c0  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01d1  */
            @Override // X.InterfaceC1810781j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void DoV(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 480
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8TU.DoV(java.lang.Object, java.lang.Object, java.lang.Object):void");
            }
        };
        this.A0k = new LinkedHashSet();
        C87H A00 = ((C87G) new C52942bb(abstractC59962oe.requireActivity()).A00(C87G.class)).A00("post_capture");
        this.A0p = A00;
        this.A0b = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, abstractC59962oe.requireActivity()), abstractC59962oe.requireActivity()).A00(ClipsCreationViewModel.class);
        this.A0h = new InterfaceC127465pP() { // from class: X.8TV
            @Override // X.InterfaceC127465pP
            public final void DEF(Exception exc) {
            }

            @Override // X.InterfaceC127465pP
            public final void onLocationChanged(Location location) {
                C1VW c1vw = C1VW.A00;
                if (c1vw != null) {
                    c1vw.removeLocationUpdates(C8TT.this.A09, this);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        };
        A00.A0A.A06(abstractC59962oe, new C8TW(new C9EB(this, 21)));
        this.A0q = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E0(this, 36));
    }
}
