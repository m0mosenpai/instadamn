package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.reels.Reel;
import com.instagram.reels.common.ui.StoryTypeSelectorView;
import com.instagram.stickersearch.AvatarStickerInteractor;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.6ln, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148176ln implements InterfaceC145136gY, C53O, InterfaceC150196pR, InterfaceC148186lo {
    public C41181vS A00;
    public C41551w4 A01;
    public C141596ac A02;
    public KZ0 A03;
    public Integer A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final Context A0A;
    public final View A0B;
    public final LinearLayout A0C;
    public final AbstractC59962oe A0D;
    public final InterfaceC11380iw A0E;
    public final UserSession A0F;
    public final InterfaceC56392iX A0G;
    public final InterfaceC56392iX A0H;
    public final C148256lv A0I;
    public final C148246lu A0J;
    public final C145826hf A0K;
    public final C6dP A0L;
    public final C148196lp A0M;
    public final C148216lr A0N;
    public final C145356gu A0O;
    public final ArrayList A0P;
    public final ArrayList A0Q;
    public final ArrayList A0R;
    public final ArrayList A0S;
    public final ArrayList A0T;
    public final ArrayList A0U;
    public final ArrayList A0V;
    public final InterfaceC09390do A0W;
    public final InterfaceC09390do A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC09390do A0b;
    public final InterfaceC09390do A0c;
    public final InterfaceC09390do A0d;
    public final InterfaceC09390do A0e;
    public final InterfaceC09390do A0f;
    public final InterfaceC09390do A0g;
    public final InterfaceC09390do A0h;
    public final InterfaceC09390do A0i;
    public final InterfaceC09390do A0j;
    public final InterfaceC09390do A0k;
    public final InterfaceC16820sZ A0l;
    public final int A0m;
    public final InterfaceC1119153d A0n;

    public C148176ln(View view, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C145826hf c145826hf, C6dP c6dP, InterfaceC1119153d interfaceC1119153d, C145356gu c145356gu, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c145356gu, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(c145826hf, 6);
        C14360o3.A0B(c6dP, 7);
        C14360o3.A0B(interfaceC1119153d, 9);
        this.A0O = c145356gu;
        this.A0F = userSession;
        this.A0E = interfaceC11380iw;
        this.A0K = c145826hf;
        this.A0L = c6dP;
        this.A0D = abstractC59962oe;
        this.A0n = interfaceC1119153d;
        this.A0l = interfaceC16820sZ;
        View requireViewById = view.requireViewById(R.id.reel_reaction_toolbar_title);
        C14360o3.A07(requireViewById);
        this.A0B = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.reel_reaction_toolbar);
        C14360o3.A07(requireViewById2);
        LinearLayout linearLayout = (LinearLayout) requireViewById2;
        this.A0C = linearLayout;
        this.A0G = AbstractC56372iV.A01(view.requireViewById(R.id.reel_viewer_avatar_convergence_footer_text_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
        Context context = linearLayout.getContext();
        this.A0A = context;
        this.A0k = AbstractC09440dt.A01(new C9E9(this, 40));
        this.A0R = new ArrayList();
        this.A0Q = new ArrayList();
        this.A0T = new ArrayList();
        this.A0S = new ArrayList();
        this.A0b = AbstractC09440dt.A01(new C9E9(this, 31));
        this.A0j = AbstractC09440dt.A01(new C9E9(this, 39));
        this.A0e = AbstractC09440dt.A01(new C9E9(this, 34));
        this.A0d = AbstractC09440dt.A01(new C9E9(this, 33));
        this.A0h = AbstractC09440dt.A01(new C9E9(this, 37));
        this.A0i = AbstractC09440dt.A01(new C9E9(this, 38));
        this.A0f = AbstractC09440dt.A01(new C9E9(this, 35));
        this.A0g = AbstractC09440dt.A01(new C9E9(this, 36));
        this.A04 = C05F.A0C;
        this.A0M = new C148196lp(userSession);
        this.A0N = new C148216lr(context, userSession);
        this.A0Z = AbstractC09440dt.A01(new C9E9(this, 29));
        this.A0a = AbstractC09440dt.A01(new C9E9(this, 30));
        Object value = this.A0d.getValue();
        C14360o3.A07(value);
        int i = ((Boolean) value).booleanValue() ? 7 : 6;
        this.A0m = i;
        Object value2 = this.A0d.getValue();
        C14360o3.A07(value2);
        this.A09 = ((Boolean) value2).booleanValue() ? i + 1 : i;
        this.A0P = new ArrayList();
        AbstractC59962oe abstractC59962oe2 = this.A0D;
        C9E9 c9e9 = new C9E9(this, 32);
        C9E9 c9e92 = new C9E9(abstractC59962oe2, 41);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C9E9(c9e92, 42));
        this.A0c = new C60842q8(new C9E9(A00, 43), c9e9, new C9F7(17, null, A00), new C0YZ(C143266dR.class));
        AbstractC59962oe abstractC59962oe3 = this.A0D;
        C9E9 c9e93 = new C9E9(this, 26);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C9E9(new C9E9(abstractC59962oe3, 44), 45));
        this.A0W = new C60842q8(new C9E9(A002, 46), c9e93, new C9F7(18, null, A002), new C0YZ(C148236lt.class));
        this.A0H = AbstractC56372iV.A01(view.requireViewById(R.id.create_avatar_viewstub), false, false);
        this.A0X = AbstractC09440dt.A01(new C9E9(this, 27));
        this.A0Y = AbstractC09440dt.A01(new C9E9(this, 28));
        this.A0U = new ArrayList();
        this.A0V = new ArrayList();
        this.A0J = C18U.A06(C06090Tz.A05, userSession, 36326369533114197L) ? new C148246lu(C006802i.A0p, EnumC143276dS.A01.A00(A01(this), EnumC143286dT.A03, userSession, false), i) : null;
        this.A0I = new C148256lv(AbstractC12220kQ.A02(userSession), userSession);
        ((AvatarStore) this.A0b.getValue()).A04(new C206969Eb(this, 48));
    }

    public static final void A02(View view, C41551w4 c41551w4, C148176ln c148176ln) {
        Fragment fragment;
        FragmentActivity activity;
        if (c41551w4 != null) {
            C145356gu c145356gu = c148176ln.A0O;
            RectF A0G = AbstractC13880nE.A0G(view);
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) c145356gu.A0F;
            if (!reelViewerFragment.A2r && (fragment = (Fragment) c145356gu.A0H.get()) != null && (activity = fragment.getActivity()) != null) {
                InterfaceC1119353f interfaceC1119353f = c145356gu.A0E;
                DirectCameraViewModel A01 = C75653aW.A01(c41551w4, "story_selfie_reply");
                UserSession userSession = c145356gu.A01;
                if (userSession == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                A38.A00(activity, A0G, C22P.A53, userSession, interfaceC1119353f, A01, c41551w4, 60575, "story_selfie_reply", r2.BSi(), reelViewerFragment.A2Y);
            }
        }
    }

    private final void A03(EnumC143276dS enumC143276dS, boolean z) {
        C57312k6 A00 = C07Y.A00(this.A0D);
        C9DB c9db = new C9DB(this, enumC143276dS, null, 3, z);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9db, A00);
    }

    public static final void A05(C148176ln c148176ln) {
        InterfaceC148316m1 interfaceC148316m1;
        LFA lfa;
        UserSession userSession;
        InterfaceC11380iw interfaceC11380iw;
        ArrayList arrayList = c148176ln.A0R;
        if (!arrayList.isEmpty()) {
            if (C14360o3.A0K(((AvatarStore) c148176ln.A0b.getValue()).A01.A00, C125525ly.A00)) {
                if (c148176ln.A04.intValue() == 1) {
                    KZ0 kz0 = c148176ln.A03;
                    if (kz0 != null) {
                        EnumC46193KcV enumC46193KcV = EnumC46193KcV.A05;
                        c148176ln.Dvx(enumC46193KcV);
                        kz0.setSelectedQuickReactionsType(enumC46193KcV);
                        kz0.A01 = false;
                        c148176ln.A0H.setVisibility(8);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            ArrayList arrayList2 = c148176ln.A0P;
            boolean z = false;
            if (arrayList2.size() >= c148176ln.A0m) {
                z = true;
            }
            int i = c148176ln.A09;
            for (int i2 = 0; i2 < i; i2++) {
                Object tag = ((View) arrayList.get(i2)).getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.AssetGridRowItemViewBinder.Holder");
                LF3 lf3 = (LF3) tag;
                Object value = c148176ln.A0d.getValue();
                C14360o3.A07(value);
                if (((Boolean) value).booleanValue() && i2 == i - 1) {
                    lfa = AbstractC47148Ksh.A00;
                    userSession = c148176ln.A0F;
                    interfaceC11380iw = c148176ln.A0E;
                    interfaceC148316m1 = new C148306m0();
                } else {
                    if (z) {
                        interfaceC148316m1 = (InterfaceC148316m1) arrayList2.get(i2);
                    } else {
                        interfaceC148316m1 = AbstractC148266lw.A01;
                    }
                    C14360o3.A0A(interfaceC148316m1);
                    if (!C14360o3.A0K(interfaceC148316m1, lf3.A02)) {
                        lfa = AbstractC47148Ksh.A00;
                        userSession = c148176ln.A0F;
                        interfaceC11380iw = c148176ln.A0E;
                    }
                }
                lfa.A01(interfaceC11380iw, userSession, null, c148176ln, lf3, interfaceC148316m1);
            }
            KZ0 kz02 = c148176ln.A03;
            if (kz02 != null) {
                kz02.A01 = true;
            }
            if (!z) {
                return;
            }
            C6dP c6dP = c148176ln.A0L;
            c6dP.A01.flowEndSuccess(c6dP.A00);
        }
    }

    @Override // X.InterfaceC150206pS
    public final boolean Cb5(boolean z) {
        return false;
    }

    @Override // X.InterfaceC150196pR
    public final void CxL(View view, InterfaceC148316m1 interfaceC148316m1) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0288, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r0, 2342156760134519022L) != false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0265  */
    @Override // X.InterfaceC150196pR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CxM(android.graphics.drawable.Drawable r30, android.view.View r31, X.InterfaceC148316m1 r32) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148176ln.CxM(android.graphics.drawable.Drawable, android.view.View, X.6m1):void");
    }

    @Override // X.C53O
    public final void CyY() {
        InterfaceC09390do interfaceC09390do = this.A0c;
        if (((C143266dR) interfaceC09390do.getValue()).A02()) {
            AbstractC59962oe abstractC59962oe = this.A0D;
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
            C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
            AbstractC23641Du.A05(AnonymousClass191.A00, new C57165PZj(c07s, this, viewLifecycleOwner, null, 35), A00);
            ((C143266dR) interfaceC09390do.getValue()).A00();
            return;
        }
        A0D(this);
        this.A0B.postDelayed(new M2I(this), 500L);
    }

    @Override // X.C53O
    public final /* synthetic */ void Cyb() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r5.CdW() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r0 = r4.A0j.getValue();
        X.C14360o3.A07(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        r1 = X.C6XB.A00;
        r0 = r4.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r1.A00(r3, r0.A0H.A0D()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 2342156760134519022L) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        r0 = X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        r4.A04 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        r4.A08 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        r0 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        r0 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0021, code lost:
    
        if (r5.A13() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r0.A5n() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r4.A01 = r6;
        r4.A02 = r8;
        r4.A00 = r5;
        r3 = r4.A0F;
        r0 = r5.A0b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (X.C14360o3.A0K(r0.A0C.C4G(), true) == false) goto L27;
     */
    @Override // X.InterfaceC145136gY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D8t(X.C41181vS r5, X.C41551w4 r6, X.InterfaceC143576dw r7, X.C141596ac r8) {
        /*
            r4 = this;
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            r0 = 2
            X.C14360o3.A0B(r8, r0)
            r0 = 3
            X.C14360o3.A0B(r6, r0)
            boolean r0 = r5.CY4()
            if (r0 == 0) goto L1d
            X.1qM r0 = r5.A0b
            r0.getClass()
            boolean r0 = r0.A5n()
            if (r0 == 0) goto L23
        L1d:
            boolean r0 = r5.A13()
            if (r0 == 0) goto L7c
        L23:
            r4.A01 = r6
            r4.A02 = r8
            r4.A00 = r5
            com.instagram.common.session.UserSession r3 = r4.A0F
            java.lang.String r2 = "Required value was null."
            X.1qM r0 = r5.A0b
            if (r0 == 0) goto L83
            X.1rF r0 = r0.A0C
            java.lang.Boolean r1 = r0.C4G()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L83
            boolean r0 = r5.CdW()
            if (r0 != 0) goto L83
            X.0do r0 = r4.A0j
            java.lang.Object r0 = r0.getValue()
            X.C14360o3.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L80
            X.6XB r1 = X.C6XB.A00
            X.1w4 r0 = r4.A01
            if (r0 == 0) goto L86
            com.instagram.model.reels.Reel r0 = r0.A0H
            com.instagram.user.model.User r0 = r0.A0D()
            boolean r0 = r1.A00(r3, r0)
            if (r0 == 0) goto L78
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342156760134519022(0x2081032a001908ee, double:4.060287191191552E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L80
        L78:
            java.lang.Integer r0 = X.C05F.A01
        L7a:
            r4.A04 = r0
        L7c:
            r0 = 0
            r4.A08 = r0
            return
        L80:
            java.lang.Integer r0 = X.C05F.A00
            goto L7a
        L83:
            java.lang.Integer r0 = X.C05F.A0C
            goto L7a
        L86:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148176ln.D8t(X.1vS, X.1w4, X.6dw, X.6ac):void");
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DNK(Reel reel) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DOJ(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPQ() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPR() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DWn() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DXv(String str) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DhB() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djr(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djs(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dju(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djv() {
    }

    @Override // X.InterfaceC148186lo
    public final void Dvx(EnumC46193KcV enumC46193KcV) {
        String str;
        InterfaceC19610xo ARD = ((InterfaceC19630xq) this.A0k.getValue()).ARD();
        ARD.E7K("STORY_QUICK_REACTION_LAST_USED_TYPE", enumC46193KcV.A00);
        ARD.apply();
        A0G(this, enumC46193KcV, true, false);
        A0F(this, enumC46193KcV);
        C145826hf c145826hf = this.A0K;
        C41551w4 c41551w4 = this.A01;
        C141596ac c141596ac = this.A02;
        int ordinal = enumC46193KcV.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                str = "avatar";
            } else {
                throw new RuntimeException();
            }
        } else {
            str = "emoji";
        }
        c145826hf.A0L(c41551w4, c141596ac, "selector_click", str);
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dyy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz0() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz7() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroyView() {
    }

    public static final int A00(C148176ln c148176ln) {
        if (c148176ln.A04 != C05F.A00 && !((Boolean) c148176ln.A0g.getValue()).booleanValue()) {
            return 6;
        }
        return 8;
    }

    public static final EnumC143276dS A01(C148176ln c148176ln) {
        Object value = c148176ln.A0d.getValue();
        C14360o3.A07(value);
        if (((Boolean) value).booleanValue()) {
            return EnumC143276dS.A05;
        }
        Object value2 = c148176ln.A0e.getValue();
        C14360o3.A07(value2);
        if (((Boolean) value2).booleanValue()) {
            return EnumC143276dS.A07;
        }
        return EnumC143276dS.A08;
    }

    public static final void A04(AbstractC439921h abstractC439921h, C148176ln c148176ln) {
        if (C14360o3.A0K(abstractC439921h, C125535lz.A00)) {
            AbstractC148266lw.A03.set(true);
            c148176ln.A03(A01(c148176ln), true);
            if (A01(c148176ln) == EnumC143276dS.A05) {
                c148176ln.A03(EnumC143276dS.A06, false);
                return;
            }
            return;
        }
        InterfaceC19610xo ARD = ((InterfaceC19630xq) c148176ln.A0k.getValue()).ARD();
        ARD.E7K("STORY_QUICK_REACTION_LAST_USED_TYPE", null);
        ARD.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
    
        if (r9 != (r11 - 1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        if (r9 != (r11 - 1)) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02db A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.google.common.collect.ImmutableList] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.google.common.collect.ImmutableList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C148176ln r29) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148176ln.A06(X.6ln):void");
    }

    public static final void A07(C148176ln c148176ln) {
        ArrayList arrayList = c148176ln.A0T;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() != A00(c148176ln)) {
                ArrayList arrayList2 = c148176ln.A0S;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c148176ln.A0C.removeView((View) it.next());
                }
                arrayList2.clear();
                arrayList.clear();
            }
            A06(c148176ln);
        }
        c148176ln.A0M.A00 = true;
        Context context = c148176ln.A0A;
        LayoutInflater from = LayoutInflater.from(context);
        for (int i = 0; i < 2; i++) {
            ViewGroup linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setClipChildren(false);
            int A00 = A00(c148176ln) / 2;
            for (int i2 = 0; i2 < A00; i2++) {
                C14360o3.A06(context);
                FrameLayout frameLayout = new FrameLayout(context);
                View inflate = from.inflate(R.layout.reel_emoji_reaction, linearLayout, false);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.ConstrainedImageView");
                inflate.setId(R.id.story_reactions_emoji);
                frameLayout.addView(inflate);
                linearLayout.addView(frameLayout);
                if (c148176ln.A04 == C05F.A01) {
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width);
                    Resources resources = context.getResources();
                    boolean booleanValue = ((Boolean) c148176ln.A0g.getValue()).booleanValue();
                    int i3 = R.dimen.abc_button_padding_horizontal_material;
                    if (booleanValue) {
                        i3 = R.dimen.abc_action_bar_elevation_material;
                    }
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(i3);
                    int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                    ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
                    C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    ((ViewGroup.LayoutParams) marginLayoutParams).width = dimensionPixelSize;
                    ((ViewGroup.LayoutParams) marginLayoutParams).height = dimensionPixelSize;
                    marginLayoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
                }
                arrayList.add(inflate);
            }
            c148176ln.A0S.add(linearLayout);
            c148176ln.A0C.addView(linearLayout);
        }
        A06(c148176ln);
    }

    public static final void A08(C148176ln c148176ln) {
        c148176ln.A0B.setVisibility(8);
        c148176ln.A0C.setVisibility(8);
        c148176ln.A0H.setVisibility(8);
        if (!AbstractC25351Lp.A00(c148176ln.A0F).A01() || c148176ln.A0G.CWW()) {
            c148176ln.A0G.getView().setVisibility(8);
        }
    }

    public static final void A09(C148176ln c148176ln) {
        FragmentActivity activity;
        C145356gu c145356gu = c148176ln.A0O;
        Fragment fragment = (Fragment) c145356gu.A0H.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            c145356gu.A0F.Eh9(true);
            c145356gu.A0A = true;
            AbstractC13880nE.A0K(activity);
        }
        Activity rootActivity = c148176ln.A0D.getRootActivity();
        C14360o3.A0A(rootActivity);
        C45486KCa c45486KCa = new C45486KCa();
        C148196lp c148196lp = c148176ln.A0M;
        C14360o3.A0B(c148196lp, 0);
        c45486KCa.A02 = c148196lp;
        c45486KCa.A01 = new C48613Lep(c148176ln);
        C189448aO c189448aO = new C189448aO(c148176ln.A0F);
        c189448aO.A06 = c148176ln.A0A.getColor(R.color.black_70_transparent);
        c189448aO.A0T = c45486KCa;
        c189448aO.A0U = c148176ln.A0n;
        c189448aO.A03 = 0.6f;
        c189448aO.A0k = true;
        c189448aO.A0a = true;
        c189448aO.A00().A02(rootActivity, c45486KCa);
        C141596ac c141596ac = c148176ln.A02;
        if (c141596ac != null) {
            C145826hf c145826hf = c148176ln.A0K;
            C41551w4 c41551w4 = c148176ln.A01;
            if (c41551w4 != null) {
                c145826hf.A0Q(c41551w4, null, "emoji_qr_plus_button", c141596ac.A0B, c141596ac.A0A);
                InterfaceC19610xo ARD = ((InterfaceC19630xq) c148176ln.A0k.getValue()).ARD();
                ARD.E7D("emoji_more_options_button_animation_count", 3);
                ARD.apply();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A0A(C148176ln c148176ln) {
        C148216lr c148216lr = c148176ln.A0N;
        ArrayList arrayList = c148176ln.A0T;
        C23031Ai c23031Ai = c148216lr.A05;
        InterfaceC16530ry interfaceC16530ry = c23031Ai.A4g;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (!((Boolean) interfaceC16530ry.CES(c23031Ai, c0yrArr[303])).booleanValue()) {
            InterfaceC16530ry interfaceC16530ry2 = c23031Ai.A6m;
            if (interfaceC16530ry2.CES(c23031Ai, c0yrArr[304]) != null) {
                String str = (String) interfaceC16530ry2.CES(c23031Ai, c0yrArr[304]);
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    View view = (View) it.next();
                    C83863oV c83863oV = (C83863oV) view.getTag();
                    if (str != null && c83863oV != null && str.equals(c83863oV.A02)) {
                        C33I c33i = c148216lr.A01;
                        if (c33i == null) {
                            c33i = new C49504LuH(c148216lr);
                            c148216lr.A01 = c33i;
                        }
                        C5SU c5su = new C5SU((Activity) view.getRootView().requireViewById(android.R.id.content).getContext(), new C149686oL(c148216lr.A02.getResources().getString(2131971272)));
                        c5su.A01();
                        c5su.A07(C5SV.A07);
                        c5su.A08(C5SV.A06);
                        c5su.A0A = false;
                        c5su.A04 = c33i;
                        c5su.A0F = true;
                        c5su.A03(view);
                        c148216lr.A00 = c5su.A00();
                        Handler handler = c148216lr.A03;
                        Runnable runnable = c148216lr.A06;
                        handler.removeCallbacks(runnable);
                        handler.post(runnable);
                    }
                }
            }
        }
        if (c148176ln.A0K()) {
            UserSession userSession = c148176ln.A0F;
            boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36314987870555081L);
            C14360o3.A0A(Boolean.valueOf(A06));
            if (!A06) {
                InterfaceC11380iw interfaceC11380iw = c148176ln.A0E;
                Context context = c148176ln.A0A;
                C14360o3.A06(context);
                C148376m7 c148376m7 = new C148376m7(context, interfaceC11380iw, userSession);
                Activity activity = (Activity) context;
                DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                RectF rectF = AbstractC13880nE.A01;
                c148376m7.A02(activity, new C207559Gj((View) AbstractC001800i.A0K(arrayList), 0, (int) TypedValue.applyDimension(1, 30.0f, displayMetrics), true), "story_selfie_reply", false);
            }
        }
    }

    public static final void A0B(C148176ln c148176ln) {
        Iterator it = c148176ln.A0S.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
        Iterator it2 = c148176ln.A0Q.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(0);
        }
        Iterator it3 = c148176ln.A0R.iterator();
        while (it3.hasNext()) {
            View view = (View) it3.next();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    public static final void A0C(C148176ln c148176ln) {
        Iterator it = c148176ln.A0S.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
        Iterator it2 = c148176ln.A0T.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        Iterator it3 = c148176ln.A0Q.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).setVisibility(8);
        }
        c148176ln.A0H.setVisibility(8);
    }

    public static final void A0D(C148176ln c148176ln) {
        KZ0 kz0 = c148176ln.A03;
        if (kz0 != null) {
            c148176ln.A0C.removeView(kz0);
            c148176ln.A03 = null;
            A0I(c148176ln, C05F.A01);
        }
        AbstractC148266lw.A03.set(true);
        A0H(c148176ln, false, false);
        c148176ln.A0H.setVisibility(8);
        c148176ln.Dvx(EnumC46193KcV.A04);
    }

    public static final void A0E(C148176ln c148176ln, int i) {
        C148276lx C0S;
        C148286ly c148286ly;
        EnumC150226pU enumC150226pU;
        Integer num;
        long j;
        String str;
        Long A0k;
        InterfaceC148316m1 interfaceC148316m1 = (InterfaceC148316m1) AbstractC001800i.A0O(c148176ln.A0P, i);
        if (interfaceC148316m1 != null && (C0S = interfaceC148316m1.C0S()) != null && (c148286ly = (C148286ly) AbstractC001800i.A0O(C0S.A0O, 0)) != null) {
            C148256lv c148256lv = c148176ln.A0I;
            String str2 = c148286ly.A0a;
            String str3 = c148286ly.A0b;
            C148276lx C0S2 = interfaceC148316m1.C0S();
            if (C0S2 != null) {
                enumC150226pU = C0S2.A00();
            } else {
                enumC150226pU = null;
            }
            if (enumC150226pU == EnumC150226pU.A0A) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            HashSet hashSet = c148256lv.A04;
            if (!AbstractC001800i.A0u(hashSet, str2)) {
                C18920wW c18920wW = c148256lv.A03;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "avatar_stickers_measurement_avatar_sticker_tray_impression");
                if (A00.isSampled()) {
                    if (str2 != null) {
                        hashSet.add(str2);
                    }
                    C0Zx c0Zx = new C0Zx();
                    if (str2 != null && (A0k = AbstractC003100w.A0k(10, str2)) != null) {
                        j = A0k.longValue();
                    } else {
                        j = 0;
                    }
                    c0Zx.A05("sticker_template_id", Long.valueOf(j));
                    c0Zx.A05("page_number", 0L);
                    c0Zx.A05("total_pages", 1L);
                    if (num.intValue() != 0) {
                        str = "static";
                    } else {
                        str = "animated_sticker";
                    }
                    c0Zx.A06("sticker_type", str);
                    Long valueOf = Long.valueOf(i);
                    c0Zx.A05("sticker_rank", valueOf);
                    c0Zx.A05("sticker_page_index", valueOf);
                    c0Zx.A05(AbstractC43591JPw.A00(200), 6L);
                    c0Zx.A06("referrer_surface", "quick_reaction");
                    c0Zx.A03("is_social_sticker", false);
                    c0Zx.A06("sticker_template_name", str3);
                    A00.AAQ(c0Zx, "event_data");
                    A00.AAP("avatar_session_id", c148256lv.A01);
                    A00.Cht();
                }
            }
        }
    }

    public static final void A0F(C148176ln c148176ln, EnumC46193KcV enumC46193KcV) {
        if (enumC46193KcV == EnumC46193KcV.A04) {
            InterfaceC09390do interfaceC09390do = c148176ln.A0W;
            C149656oI c149656oI = ((C148236lt) interfaceC09390do.getValue()).A01;
            AvatarStore avatarStore = c149656oI.A01;
            if (C149656oI.A02(avatarStore) && AbstractC148716mg.A00(c149656oI.A02) && C149656oI.A01(avatarStore) && !c149656oI.A00.A00.A00.getBoolean("key_has_seen_any_avatar_convergence_auto_migration_upsell", false)) {
                InterfaceC56392iX interfaceC56392iX = c148176ln.A0G;
                TextView textView = (TextView) interfaceC56392iX.getView();
                Context context = c148176ln.A0A;
                C14360o3.A06(context);
                String string = C02G.A01(context).getString(2131956803);
                C14360o3.A07(string);
                B8P b8p = new B8P(c148176ln, 9);
                String string2 = C02G.A01(context).getString(2131956814);
                C14360o3.A07(string2);
                StringBuilder sb = new StringBuilder();
                sb.append((Object) string);
                sb.append(' ');
                sb.append(string2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                AnonymousClass773.A05(spannableStringBuilder, new BYZ(context, b8p), string2);
                textView.setText(spannableStringBuilder);
                ((TextView) interfaceC56392iX.getView()).setMovementMethod(LinkMovementMethod.getInstance());
                interfaceC56392iX.getView().setVisibility(0);
                C148236lt c148236lt = (C148236lt) interfaceC09390do.getValue();
                InterfaceC19610xo ARD = c148236lt.A00.A00.A00.ARD();
                ARD.E77("key_has_seen_any_avatar_convergence_auto_migration_upsell", true);
                ARD.apply();
                c148236lt.A01();
                return;
            }
        }
        if (AbstractC25351Lp.A00(c148176ln.A0F).A01() && !c148176ln.A0G.CWW()) {
            return;
        }
        c148176ln.A0G.getView().setVisibility(8);
    }

    public static final void A0H(C148176ln c148176ln, Boolean bool, boolean z) {
        AbstractC18560vj.A03(C07Y.A00(c148176ln.A0D), new C15340po(new C9D1(c148176ln, null, 3), ((AvatarStickerInteractor) c148176ln.A0Z.getValue()).A03(null, A01(c148176ln), EnumC143286dT.A03, null, null, null, bool.booleanValue(), z)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.KZ0, android.view.View, com.instagram.reels.common.ui.StoryTypeSelectorView] */
    public static final void A0I(C148176ln c148176ln, Integer num) {
        KZ0 kz0;
        IgImageView secondOptionImageView;
        if (c148176ln.A03 == null) {
            Context context = c148176ln.A0A;
            C14360o3.A06(context);
            UserSession userSession = c148176ln.A0F;
            Integer num2 = C05F.A00;
            boolean z = false;
            if (num == num2) {
                z = true;
            }
            String string = context.getString(2131961742);
            C14360o3.A07(string);
            String string2 = context.getString(2131953516);
            C14360o3.A07(string2);
            ?? storyTypeSelectorView = new StoryTypeSelectorView(context, null, 0, z, userSession, string, string2);
            storyTypeSelectorView.setOnClickListener(new LOv(userSession, storyTypeSelectorView));
            storyTypeSelectorView.A00 = c148176ln;
            c148176ln.A0C.addView((View) storyTypeSelectorView, 0);
            AbstractC13880nE.A0U(storyTypeSelectorView, (int) AbstractC13880nE.A04(context, 14));
            ViewGroup.LayoutParams layoutParams = storyTypeSelectorView.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            c148176ln.A03 = storyTypeSelectorView;
            if (num == num2) {
                storyTypeSelectorView.setBackgroundDrawable(R.drawable.reel_pill_switcher_background_visual_toggle);
                storyTypeSelectorView.setHighlightDrawable(R.drawable.reel_pill_switcher_highlight_background_visual_toggle);
                Spannable spannable = C6RB.A0d;
                Context context2 = storyTypeSelectorView.getContext();
                C14360o3.A07(context2);
                C6RB c6rb = new C6RB(context2, context2.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding));
                c6rb.A0M("😍");
                storyTypeSelectorView.setFirstOptionDrawable(c6rb);
                if (C14360o3.A0K(((AvatarStore) c148176ln.A0b.getValue()).A01.A00, C125525ly.A00)) {
                    InterfaceC09390do interfaceC09390do = c148176ln.A0f;
                    Object value = interfaceC09390do.getValue();
                    C14360o3.A07(value);
                    boolean booleanValue = ((Boolean) value).booleanValue();
                    int i = R.drawable.instagram_facebook_avatars_filled_44;
                    if (booleanValue) {
                        i = R.drawable.instagram_avatars_filled_44;
                    }
                    Drawable drawable = context.getDrawable(i);
                    Resources resources = context.getResources();
                    Object value2 = interfaceC09390do.getValue();
                    C14360o3.A07(value2);
                    boolean booleanValue2 = ((Boolean) value2).booleanValue();
                    int i2 = R.dimen.abc_action_bar_elevation_material;
                    if (booleanValue2) {
                        i2 = R.dimen.action_bar_item_spacing_left;
                    }
                    int dimensionPixelSize = resources.getDimensionPixelSize(i2);
                    Resources resources2 = context.getResources();
                    Object value3 = interfaceC09390do.getValue();
                    C14360o3.A07(value3);
                    boolean booleanValue3 = ((Boolean) value3).booleanValue();
                    int i3 = R.dimen.abc_action_bar_elevation_material;
                    if (booleanValue3) {
                        i3 = R.dimen.action_bar_item_spacing_left;
                    }
                    int dimensionPixelSize2 = resources2.getDimensionPixelSize(i3);
                    Resources resources3 = context.getResources();
                    Object value4 = interfaceC09390do.getValue();
                    C14360o3.A07(value4);
                    boolean booleanValue4 = ((Boolean) value4).booleanValue();
                    int i4 = R.dimen.action_bar_item_spacing_left;
                    if (booleanValue4) {
                        i4 = R.dimen.challenge_winner_v2_3_winner2_submission_margin_top;
                    }
                    int dimensionPixelSize3 = resources3.getDimensionPixelSize(i4);
                    if (drawable != null) {
                        drawable.setTint(context.getColor(R.color.design_dark_default_color_on_background));
                        KZ0 kz02 = c148176ln.A03;
                        if (kz02 != null && (secondOptionImageView = kz02.getSecondOptionImageView()) != null) {
                            secondOptionImageView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
                            secondOptionImageView.setImageDrawable(drawable);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (!C18U.A06(C06090Tz.A05, userSession, 36320691586343732L) || (kz0 = c148176ln.A03) == null) {
                return;
            }
            kz0.setBackgroundDrawable(R.drawable.reel_pill_switcher_background_modernized);
        }
    }

    private final void A0J(boolean z) {
        if (C18U.A06(C06090Tz.A05, this.A0F, 36320949284381711L)) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(new OvershootInterpolator());
            ofFloat.setDuration(500L);
            ofFloat.addUpdateListener(new C41782Iey(this));
            ofFloat.addListener(new AN8(this, z));
            ofFloat.start();
        }
    }

    private final boolean A0K() {
        C41551w4 c41551w4 = this.A01;
        if (c41551w4 != null) {
            Reel reel = c41551w4.A0H;
            if (reel.A1T) {
                return false;
            }
            User A0D = reel.A0D();
            if (A0D != null && C6XB.A00.A00(this.A0F, A0D)) {
                return false;
            }
        }
        if (((Boolean) this.A0g.getValue()).booleanValue()) {
            return false;
        }
        boolean A06 = C18U.A06(C06090Tz.A05, this.A0F, 36314987870620618L);
        C14360o3.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static final boolean A0L(C148176ln c148176ln) {
        Object value = c148176ln.A0i.getValue();
        C14360o3.A07(value);
        if (((Boolean) value).booleanValue() && C21B.A00(c148176ln.A0F).A00.getBoolean("key_is_eligible_for_aqr_override_default", true)) {
            return true;
        }
        return false;
    }

    public final void A0M(boolean z) {
        this.A06 = z;
        if (z) {
            int intValue = this.A04.intValue();
            if (intValue != 1) {
                if (intValue != 0) {
                    if (intValue != 2) {
                        throw new RuntimeException();
                    }
                } else {
                    this.A0C.setVisibility(0);
                    A0G(this, EnumC46193KcV.A05, false, false);
                    this.A0B.setVisibility(0);
                    KZ0 kz0 = this.A03;
                    if (kz0 != null) {
                        kz0.setVisibility(8);
                        return;
                    }
                    return;
                }
            } else {
                this.A0C.setVisibility(0);
                KZ0 kz02 = this.A03;
                if (kz02 != null) {
                    A0G(this, kz02.getSelectedQuickReactionsType(), false, false);
                }
                this.A0B.setVisibility(8);
                KZ0 kz03 = this.A03;
                if (kz03 != null) {
                    kz03.setVisibility(0);
                    return;
                }
                return;
            }
        }
        A08(this);
    }

    @Override // X.InterfaceC150206pS
    public final long Ayc() {
        return 0L;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean BWM() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final AbstractC59962oe Baj() {
        return this.A0D;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ int Bs6() {
        return 0;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Buz() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CXU() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CYO() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CZ3() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Cc5() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CdE() {
        return false;
    }

    @Override // X.C53O
    public final void Cya() {
        this.A0P.clear();
        KZ0 kz0 = this.A03;
        if (kz0 != null) {
            this.A0C.removeView(kz0);
            this.A03 = null;
            if (C14360o3.A0K(((AvatarStore) this.A0b.getValue()).A01.A00, C125525ly.A00)) {
                A0I(this, C05F.A00);
            }
        }
        A05(this);
    }

    @Override // X.C53O
    public final void Cym() {
        AbstractC148266lw.A03.set(true);
        A0H(this, false, false);
        this.A0H.setVisibility(8);
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DrR() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Dra() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DsD() {
        return false;
    }

    @Override // X.InterfaceC148186lo
    public final void EkN() {
        Drawable drawable;
        ImageView imageView = (ImageView) this.A0Y.getValue();
        Context context = this.A0A;
        C14360o3.A06(context);
        UserSession userSession = this.A0F;
        boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36314906265521059L);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36325278612272095L) && A06) {
            String A02 = AbstractC56412ia.A02(context.getResources(), R.drawable.ig_avatars_style_2_ig_3anim_style2);
            if (A02 == null) {
                A02 = "";
            }
            String valueOf = String.valueOf(R.drawable.ig_avatars_style_2_ig_3anim_style2);
            drawable = new C74P(context, userSession, new C74V(context.getResources().getDimensionPixelSize(R.dimen.music_pick_empty_aggregation_text_width), context.getResources().getDimensionPixelSize(R.dimen.music_pick_empty_aggregation_text_width), context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width)), C05F.A00, A02, valueOf, (String) null, 1.0f, context.getColor(R.color.fds_white_alpha60), context.getColor(R.color.cds_white_a20), false);
        } else if (C18U.A06(c06090Tz, userSession, 36325278612272095L)) {
            if (!A06) {
                drawable = context.getDrawable(R.drawable.ig_avatars_style_2_ig_3static_style2);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            drawable = C74N.A02(context, userSession, "https://static.xx.fbcdn.net/assets/?set=ig_avatar_assets&name=aqr-nux-group-animated-standard&density=2", context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width), context.getResources().getDimensionPixelSize(R.dimen.music_pick_empty_aggregation_text_width), AbstractC47041Kqy.A00(userSession));
        } else {
            if (!A06) {
                drawable = context.getDrawable(R.drawable.ig_avatar_assets_aqr_group_static_standard);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            drawable = C74N.A02(context, userSession, "https://static.xx.fbcdn.net/assets/?set=ig_avatar_assets&name=aqr-nux-group-animated-standard&density=2", context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width), context.getResources().getDimensionPixelSize(R.dimen.music_pick_empty_aggregation_text_width), AbstractC47041Kqy.A00(userSession));
        }
        imageView.setImageDrawable(drawable);
        this.A0H.setVisibility(0);
        C0fQ.A00(new LOP(this), (View) this.A0X.getValue());
        Iterator it = this.A0S.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0G(X.C148176ln r10, X.EnumC46193KcV r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148176ln.A0G(X.6ln, X.KcV, boolean, boolean):void");
    }
}
