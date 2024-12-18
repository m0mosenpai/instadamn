package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.systrace.Systrace;
import com.instagram.api.schemas.HallpassDetailsDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.swipenavigation.PositionConfig;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69453Af implements InterfaceC11380iw, InterfaceC60602pj, InterfaceC61312qt, InterfaceC63982vJ, InterfaceC69463Ag {
    public static final Handler A0f = new Handler(Looper.getMainLooper());
    public static final String __redex_internal_original_name = "MainFeedReelTrayController";
    public View A00;
    public Reel A01;
    public ReelViewerConfig A02;
    public C64012vM A03;
    public AbstractC149546o6 A04;
    public AbstractC140596Xn A05;
    public C140626Xq A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public InterfaceC58124Ppn A0A;
    public boolean A0B;
    public final Context A0C;
    public final AbstractC60672pq A0D;
    public final InterfaceC11380iw A0E;
    public final UserSession A0F;
    public final C1GL A0G;
    public final InterfaceC61352qx A0H;
    public final C65192xH A0I;
    public final C3B7 A0J;
    public final C61602rN A0K;
    public final C61442r7 A0L;
    public final C61552rI A0M;
    public final C1I7 A0N;
    public final C61252qn A0O;
    public final C69473Ah A0P;
    public final AbstractC69533An A0Q;
    public final InterfaceC53892dT A0R;
    public final User A0S;
    public final boolean A0T;
    public final C25671My A0U;
    public final InterfaceC41501vz A0V;
    public final InterfaceC41501vz A0W;
    public final InterfaceC41501vz A0X;
    public final InterfaceC15680qO A0Y;
    public final C69623Aw A0Z;
    public final C3B1 A0a;
    public final C23031Ai A0b;
    public final C69633Ax A0c;
    public final AbstractC69423Ac A0d;
    public final C3AZ A0e;

    public C69453Af(Activity activity, Context context, AbstractC60672pq abstractC60672pq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C69433Ad c69433Ad, InterfaceC61352qx interfaceC61352qx, C65192xH c65192xH, C61602rN c61602rN, C61442r7 c61442r7, C61552rI c61552rI, C3AZ c3az, InterfaceC53892dT interfaceC53892dT) {
        C14360o3.A0B(interfaceC61352qx, 4);
        this.A0C = context;
        this.A0D = abstractC60672pq;
        this.A0H = interfaceC61352qx;
        this.A0I = c65192xH;
        this.A0F = userSession;
        this.A0R = interfaceC53892dT;
        this.A0L = c61442r7;
        this.A0e = c3az;
        this.A0K = c61602rN;
        this.A0M = c61552rI;
        this.A0E = interfaceC11380iw;
        this.A0U = AbstractC25651Mw.A00(userSession);
        C69473Ah c69473Ah = new C69473Ah(activity, context, this, userSession, c69433Ad, this);
        this.A0P = c69473Ah;
        C69523Am c69523Am = c69473Ah.A0C;
        this.A0Q = c69523Am;
        this.A03 = new C64012vM(this, userSession, null, null, null);
        this.A0Z = new C69623Aw(interfaceC11380iw, userSession);
        C61252qn A00 = AbstractC61242qm.A00(userSession);
        C14360o3.A07(A00);
        this.A0O = A00;
        this.A0c = new C69633Ax(c57112jm, c61602rN, this.A03, A00);
        this.A0B = true;
        this.A08 = true;
        this.A0a = new C3B1(activity, context, interfaceC11380iw, userSession, this);
        this.A02 = ReelViewerConfig.A00();
        this.A0S = C17060sy.A01.A01(userSession);
        this.A0b = AbstractC23021Ah.A00(userSession);
        this.A0W = new InterfaceC41501vz() { // from class: X.3B2
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
            
                if (r8.A04 != X.C05F.A0u) goto L6;
             */
            @Override // X.InterfaceC41501vz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r11) {
                /*
                    r10 = this;
                    r0 = 232403591(0xdda3287, float:1.3447451E-30)
                    int r4 = X.C0f9.A03(r0)
                    X.3DH r11 = (X.C3DH) r11
                    r0 = -1392197625(0xffffffffad04c007, float:-7.54597E-12)
                    int r3 = X.C0f9.A03(r0)
                    r7 = 0
                    X.C14360o3.A0B(r11, r7)
                    X.3Af r5 = X.C69453Af.this
                    X.1OP r8 = r11.A03
                    r6 = 1
                    r9 = 0
                    if (r8 == 0) goto L23
                    java.lang.Integer r2 = r8.A04
                    java.lang.Integer r1 = X.C05F.A0u
                    r0 = 1
                    if (r2 == r1) goto L24
                L23:
                    r0 = 0
                L24:
                    r5.A09(r6, r0)
                    if (r8 == 0) goto L33
                    android.os.Handler r1 = X.C69453Af.A0f
                    X.3Ql r0 = new X.3Ql
                    r0.<init>()
                    r1.post(r0)
                L33:
                    java.util.List r8 = r11.A04
                    int r0 = r8.size()
                    if (r0 != r6) goto L8a
                    java.lang.Object r0 = r8.get(r7)
                    com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
                    boolean r0 = r0.A1a
                    if (r0 == 0) goto L8a
                    java.lang.Object r0 = r8.get(r7)
                    com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
                    com.instagram.common.session.UserSession r1 = r5.A0F
                    boolean r0 = r0.A10(r1)
                    if (r0 == 0) goto L8a
                    X.1Lr r0 = X.AbstractC25351Lp.A00(r1)
                    com.instagram.common.session.UserSession r6 = r0.A00
                    X.0Tz r2 = X.C06090Tz.A05
                    r0 = 36320279270662396(0x81091a001220fc, double:3.032429088568123E-306)
                    boolean r0 = X.C18U.A06(r2, r6, r0)
                    if (r0 == 0) goto L8a
                    java.lang.Object r0 = r8.get(r7)
                    com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
                    java.util.List r0 = r0.A0N()
                    boolean r0 = r0.isEmpty()
                    r6 = 0
                    if (r0 == 0) goto L97
                    X.2xH r1 = r5.A0I
                    X.307 r0 = X.AnonymousClass307.A04
                    r1.A03 = r0
                    r0 = -1
                    r1.A0A(r0)
                    X.2qn r2 = r5.A0O
                    X.1GL r1 = r5.A0G
                    java.lang.Integer r0 = X.C05F.A04
                    r2.A0J(r1, r6, r0)
                L8a:
                    r0 = -614514458(0xffffffffdb5f40e6, float:-6.2840276E16)
                    X.C0f9.A0A(r0, r3)
                    r0 = -614064852(0xffffffffdb661d2c, float:-6.477132E16)
                    X.C0f9.A0A(r0, r4)
                    return
                L97:
                    java.lang.Object r0 = r8.get(r7)
                    com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
                    java.util.List r0 = r0.A0N()
                    X.C14360o3.A07(r0)
                    java.util.Iterator r2 = r0.iterator()
                La8:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto Lbe
                    java.lang.Object r1 = r2.next()
                    r0 = r1
                    X.4ps r0 = (X.C105814ps) r0
                    X.47Z r0 = r0.A00
                    boolean r0 = r0.A56
                    if (r0 == 0) goto La8
                    if (r1 == 0) goto Lbe
                    r9 = 1
                Lbe:
                    X.2xH r2 = r5.A0I
                    X.307 r1 = r2.A03
                    X.307 r0 = X.AnonymousClass307.A04
                    if (r1 != r0) goto L8a
                    if (r9 == 0) goto Ld1
                    X.307 r0 = X.AnonymousClass307.A03
                Lca:
                    r2.A03 = r0
                    r0 = -1
                    r2.A0A(r0)
                    goto L8a
                Ld1:
                    X.307 r0 = X.AnonymousClass307.A02
                    goto Lca
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3B2.onEvent(java.lang.Object):void");
            }
        };
        this.A0X = new InterfaceC42271xH() { // from class: X.3B3
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C2AS c2as = (C2AS) obj;
                C14360o3.A0B(c2as, 0);
                if (!C17060sy.A01.A01(C69453Af.this.A0F).equals(c2as.A00)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(348874218);
                int A032 = C0f9.A03(1660599092);
                C69453Af.this.A0Q.notifyItemChanged(0);
                C0f9.A0A(1000166402, A032);
                C0f9.A0A(-389673647, A03);
            }
        };
        this.A0d = new C3B4(this);
        this.A0N = new C1I7() { // from class: X.3B5
            @Override // X.C1I2
            public final void onScrollStateChanged(C3FQ c3fq, int i) {
                int A03 = C0f9.A03(-2080850190);
                if (i == 1) {
                    C1OR.A00(C69453Af.this.A0F).A0D(C05F.A01);
                }
                C0f9.A0A(-646099559, A03);
            }
        };
        this.A0V = new InterfaceC41501vz() { // from class: X.3B6
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1026322952);
                int A032 = C0f9.A03(1859780236);
                C69453Af c69453Af = C69453Af.this;
                ReelStore A04 = C1OU.A04(c69453Af.A0F);
                C1N6 c1n6 = A04.A03;
                c1n6.A00.clear();
                UserSession userSession2 = A04.A09;
                c1n6.A02(C1Ns.A00(userSession2).A00(new Reel((C1NB) new C1N9(C08730cb.A00(userSession2).A00()), userSession2.userId, true)));
                A04.A06 = false;
                A04.A07 = false;
                c69453Af.A0O.A0J(c69453Af.A0D, null, C05F.A06);
                C0f9.A0A(-1186043846, A032);
                C0f9.A0A(-1051271549, A03);
            }
        };
        c3az.A00 = c69473Ah;
        c61602rN.A02 = c69523Am;
        c61602rN.A01 = c69473Ah;
        c69523Am.A02 = A00;
        FragmentActivity requireActivity = this.A0D.requireActivity();
        Activity parent = requireActivity.getParent();
        this.A0J = new C3B7(parent == null ? requireActivity : parent, userSession, this, c69473Ah, this.A0E.getModuleName());
        this.A0G = abstractC60672pq;
        this.A0Y = new InterfaceC15680qO() { // from class: X.3B8
            @Override // X.InterfaceC15680qO
            public final void onConnectionChanged(NetworkInfo networkInfo) {
                if (networkInfo != null && networkInfo.isConnected()) {
                    C69453Af c69453Af = C69453Af.this;
                    c69453Af.A0O.A0J(c69453Af.A0G, null, C05F.A03);
                }
            }
        };
        this.A0T = C18U.A06(C06090Tz.A05, userSession, 36310538288431277L);
    }

    public static final void A03(C69453Af c69453Af, String str, String str2) {
        c69453Af.A0B = false;
        FragmentActivity requireActivity = c69453Af.A0D.requireActivity();
        UserSession userSession = c69453Af.A0F;
        C140966Yy c140966Yy = new C140966Yy(requireActivity, userSession);
        c140966Yy.A08();
        c140966Yy.A09 = new C29136Ct3(str2);
        c140966Yy.A0B(null, AbstractC31364DqT.A03().A01.A02(userSession, AbstractC31402Dr6.A01(userSession, str, "reel_tray_user_options", str2).A03()));
        c140966Yy.A04();
    }

    public final boolean A0C(C61442r7 c61442r7, Integer num) {
        Integer B7S;
        UserSession userSession = this.A0F;
        if (C1OU.A04(userSession).A0d()) {
            AbstractC115975Mo.A00(userSession, this.A0E.getModuleName(), "reel_tray_empty_on_refresh");
        }
        boolean A0J = this.A0O.A0J(this.A0G, c61442r7, num);
        if (num == C05F.A0N && !this.A08) {
            User user = this.A0S;
            Integer B7X = user.A03.B7X();
            if (((B7X != null && B7X.intValue() != 0) || ((B7S = user.A03.B7S()) != null && B7S.intValue() != 0)) && C18U.A06(C06090Tz.A05, userSession, 36330462637081467L)) {
                View view = this.A00;
                if (view != null) {
                    view.setVisibility(0);
                }
                this.A08 = true;
                InterfaceC19610xo ARD = this.A0b.A01.ARD();
                ARD.E77("has_seen_stories_tray", true);
                ARD.apply();
                return A0J;
            }
        }
        return A0J;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC64002vL
    public final void CMu(String str) {
        C14360o3.A0B(str, 0);
        C1OU.A04(this.A0F).A0c(str);
        A0D(false);
    }

    @Override // X.InterfaceC64002vL
    public final void D1e(Reel reel) {
        String str;
        EnumC33481ErG enumC33481ErG;
        C22P c22p;
        C14360o3.A0B(reel, 0);
        HallpassDetailsDict hallpassDetailsDict = reel.A08;
        String str2 = null;
        if (hallpassDetailsDict != null) {
            str = hallpassDetailsDict.BAt();
            str2 = hallpassDetailsDict.getName();
        } else {
            str = null;
        }
        C69623Aw c69623Aw = this.A0Z;
        Integer num = C05F.A0C;
        String str3 = this.A03.A04;
        if (C1OU.A04(this.A0O.A07).A05) {
            enumC33481ErG = EnumC33481ErG.GROUP_STORY_TRAY;
        } else {
            enumC33481ErG = EnumC33481ErG.STORY_TRAY;
        }
        c69623Aw.A00(enumC33481ErG, num, null, null, null, str3, null, str, str2, AbstractC111324zv.A00(2496));
        if (str != null && str2 != null) {
            UserSession userSession = this.A0F;
            AbstractC60672pq abstractC60672pq = this.A0D;
            if (reel.A0O(userSession).isEmpty()) {
                c22p = C22P.A33;
            } else {
                c22p = C22P.A32;
            }
            AbstractC35258Fgs.A07(c22p, abstractC60672pq, userSession, str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: all -> 0x0139, TRY_ENTER, TryCatch #0 {all -> 0x0139, blocks: (B:5:0x0014, B:7:0x0029, B:9:0x0033, B:11:0x0039, B:13:0x0041, B:15:0x0047, B:17:0x0056, B:19:0x005b, B:20:0x0060, B:21:0x0062, B:24:0x0076, B:26:0x0087, B:30:0x00ce, B:31:0x00d1, B:33:0x00f6, B:36:0x0105, B:38:0x0115, B:45:0x00ba, B:47:0x00be, B:49:0x00c4, B:50:0x0133, B:51:0x0138, B:52:0x012d, B:54:0x0065), top: B:4:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d A[Catch: all -> 0x0139, TRY_ENTER, TryCatch #0 {all -> 0x0139, blocks: (B:5:0x0014, B:7:0x0029, B:9:0x0033, B:11:0x0039, B:13:0x0041, B:15:0x0047, B:17:0x0056, B:19:0x005b, B:20:0x0060, B:21:0x0062, B:24:0x0076, B:26:0x0087, B:30:0x00ce, B:31:0x00d1, B:33:0x00f6, B:36:0x0105, B:38:0x0115, B:45:0x00ba, B:47:0x00be, B:49:0x00c4, B:50:0x0133, B:51:0x0138, B:52:0x012d, B:54:0x0065), top: B:4:0x0014 }] */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D8S(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69453Af.D8S(android.view.View):void");
    }

    @Override // X.InterfaceC63982vJ
    public final void DHC(Reel reel, C6X4 c6x4) {
        String str;
        C1VN c1vn;
        C14360o3.A0B(c6x4, 1);
        if (c6x4.A00) {
            str = AbstractC111324zv.A00(3472);
        } else {
            str = null;
        }
        AbstractC60672pq abstractC60672pq = this.A0D;
        if (abstractC60672pq.isAdded() && str != null && (c1vn = C1VN.A00) != null) {
            c1vn.A02(this.A0F, abstractC60672pq.getActivity(), str);
        }
    }

    @Override // X.InterfaceC64002vL
    public final void DJt() {
        A08(true);
        this.A0Z.A03(this.A03.A04, AbstractC111324zv.A00(994));
    }

    @Override // X.InterfaceC64002vL
    public final void DXO() {
        A04(this, false);
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC64002vL
    public final void De5(EnumC53202Nfy enumC53202Nfy, String str) {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De6(Reel reel, C70873Fz c70873Fz, int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void De7(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, List list, int i, boolean z) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A0F;
        C1OS A00 = C1OR.A00(userSession);
        Integer num2 = C05F.A0C;
        A00.A0D(num2);
        this.A0M.A00("REEL_ITEM_CLICKED");
        if (!C2U7.A00 || this.A0D.isVisible()) {
            Reel A01 = this.A0P.A01(str);
            if (A01 == null) {
                C140626Xq c140626Xq = this.A06;
                if (c140626Xq != null) {
                    c140626Xq.A05(num2);
                }
                C9GR.A01(this.A0C, null, 2131965606, 0);
                return;
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36329569283752346L) && (A01.A0a() || ((A01.A15(userSession) || A01.A0k()) && A01.A1a))) {
                Context context = this.A0C;
                CharSequence[] charSequenceArr = {context.getString(2131952428), context.getString(2131952429)};
                C193328hC c193328hC = new C193328hC(context);
                c193328hC.A0m(this.A0D, userSession);
                c193328hC.A0f(new DialogInterfaceOnClickListenerC35341FiI(this, A01, charSequenceArr), charSequenceArr);
                c193328hC.A0t(true);
                C0fJ.A00(c193328hC.A02());
                return;
            }
            boolean A0a = A01.A0a();
            if (A0a || ((A01.A15(userSession) || A01.A0k()) && A01.A1a)) {
                A04(this, A0a);
            } else {
                A05(A01, C3G2.A1L, i);
            }
        }
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De8(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeA(Reel reel, C70873Fz c70873Fz, Integer num, int i) {
        C14360o3.A0B(reel, 0);
        C14360o3.A0B(c70873Fz, 2);
        this.A03.A02(reel, c70873Fz, null, null, null, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0148  */
    @Override // X.InterfaceC64002vL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DeC(java.util.List r24, int r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69453Af.DeC(java.util.List, int, java.lang.String):void");
    }

    @Override // X.InterfaceC61312qt
    public final void DeD(Integer num, int i, long j, boolean z) {
        C14360o3.A0B(num, 3);
        View view = this.A00;
        if (view != null) {
            view.postDelayed(new RunnableC120655dB(this), 250L);
        }
        C64012vM c64012vM = this.A03;
        UserSession userSession = this.A0F;
        c64012vM.A04(new C70873Fz(userSession, C1OU.A04(userSession).A0U(false)), this.A0O, num, i, j, z);
        this.A0M.A00("REEL_TRAY_REQUEST_FAILED");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC25351Lp.A00(r14).A00, 36317212663157696L) != false) goto L10;
     */
    @Override // X.InterfaceC61312qt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DeE(X.C1OP r19, java.lang.String r20, int r21, long r22, boolean r24, boolean r25) {
        /*
            r18 = this;
            r4 = 0
            r3 = r19
            X.C14360o3.A0B(r3, r4)
            r1 = 1
            r6 = r20
            X.C14360o3.A0B(r6, r1)
            r0 = -1
            r13 = r18
            r2 = r21
            if (r2 == r0) goto Lc6
            if (r2 == r1) goto Lc6
        L15:
            if (r2 == r0) goto L2f
            com.instagram.common.session.UserSession r14 = r13.A0F
            r0 = 2
            if (r2 == r0) goto L2f
            X.1Lr r0 = X.AbstractC25351Lp.A00(r14)
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317212663157696(0x810650000513c0, double:3.030489753633913E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L8b
        L2f:
            com.instagram.common.session.UserSession r14 = r13.A0F
            r15 = 0
            java.lang.String r0 = r3.A07
            X.2vM r12 = new X.2vM
            r16 = r6
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            r13.A03 = r12
            X.3Ax r1 = r13.A0c
            X.3Ay r0 = r1.A06
            r0.A00 = r12
            X.3Az r0 = r1.A05
            r0.A00 = r12
            X.3B0 r0 = r1.A04
            r0.A00 = r12
            X.3Ov r2 = A00(r13)
            android.view.View r1 = r13.A00
            if (r2 == 0) goto Lb1
            if (r1 == 0) goto Lb1
            X.2vM r5 = r13.A03
            com.instagram.reels.store.ReelStore r0 = X.C1OU.A04(r14)
            java.util.List r0 = r0.A0U(r4)
            X.3Fz r6 = new X.3Fz
            r6.<init>(r14, r0)
            X.2qn r7 = r13.A0O
            java.lang.Integer r9 = r3.A04
            int r0 = r1.getWidth()
            double r0 = (double) r0
            android.view.View r2 = r2.AeT()
            int r2 = r2.getWidth()
            double r2 = (double) r2
            double r0 = r0 / r2
            java.lang.Double r8 = java.lang.Double.valueOf(r0)
        L7d:
            r10 = r22
            r12 = r24
            r5.A03(r6, r7, r8, r9, r10, r12)
            X.2rI r1 = r13.A0M
            java.lang.String r0 = "REEL_TRAY_REQUEST_FINISHED"
            r1.A00(r0)
        L8b:
            X.3Ah r0 = r13.A0P
            X.2qn r4 = r13.A0O
            r0.A08(r4)
            X.1Lr r0 = X.AbstractC25351Lp.A00(r14)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319085268769709(0x81080400031bad, double:3.031673996963328E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lb0
            boolean r0 = r4.A0C
            if (r0 == 0) goto Lb0
            X.2Me r0 = X.AbstractC48842Mc.A00(r14)
            r0.A01()
        Lb0:
            return
        Lb1:
            X.2vM r5 = r13.A03
            com.instagram.reels.store.ReelStore r0 = X.C1OU.A04(r14)
            java.util.List r0 = r0.A0U(r4)
            X.3Fz r6 = new X.3Fz
            r6.<init>(r14, r0)
            X.2qn r7 = r13.A0O
            java.lang.Integer r9 = r3.A04
            r8 = 0
            goto L7d
        Lc6:
            r13.A07()
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69453Af.DeE(X.1OP, java.lang.String, int, long, boolean, boolean):void");
    }

    @Override // X.InterfaceC64002vL
    public final void DeF(String str) {
        C14360o3.A0B(str, 0);
        A03(this, str, AbstractC111324zv.A00(5434));
    }

    @Override // X.InterfaceC61312qt
    public final void DeG() {
        A09(true, true);
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }

    @Override // X.InterfaceC64002vL
    public final void E1q(C3OO c3oo, Reel reel, Integer num, String str, String str2, List list) {
    }

    @Override // X.InterfaceC69463Ag
    public final void EDJ(View view, int i, boolean z) {
        C14360o3.A0B(view, 0);
        C69633Ax c69633Ax = this.A0c;
        C72736Xm8 c72736Xm8 = new C72736Xm8(i, z);
        Object obj = new Object();
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(obj, c72736Xm8, "campfire_group_story_peek");
        c59072n8.A00(c69633Ax.A04);
        c69633Ax.A01.A05(view, c59072n8.A01());
    }

    @Override // X.InterfaceC69463Ag
    public final void EDx(View view, Reel reel, C70873Fz c70873Fz, int i) {
        C14360o3.A0B(view, 0);
        this.A0c.A00(view, reel, c70873Fz, Boolean.valueOf(reel.A0g()), i);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean, int] */
    public static final InterfaceC72953Ov A00(C69453Af c69453Af) {
        C3OO A0W;
        Object A0W2;
        InterfaceC72953Ov interfaceC72953Ov;
        User user;
        AbstractC69533An abstractC69533An = c69453Af.A0Q;
        C69523Am c69523Am = (C69523Am) abstractC69533An;
        ?? A04 = c69523Am.A04();
        int i = A04;
        if (abstractC69533An instanceof C69523Am) {
            i = A04;
            if (c69523Am.A04()) {
                i = A04 - 1;
            }
        }
        C69473Ah c69473Ah = c69453Af.A0P;
        RecyclerView recyclerView = c69473Ah.A03;
        if (recyclerView == 0) {
            A0W = null;
        } else {
            A0W = recyclerView.A0W(A04, false);
        }
        if (A0W instanceof InterfaceC72953Ov) {
            RecyclerView recyclerView2 = c69473Ah.A03;
            if (recyclerView2 == 0) {
                A0W2 = null;
            } else {
                A0W2 = recyclerView2.A0W(A04, false);
            }
            if (A0W2 instanceof InterfaceC72953Ov) {
                interfaceC72953Ov = (InterfaceC72953Ov) A0W2;
            } else {
                interfaceC72953Ov = null;
            }
            List list = abstractC69533An.A04;
            if (!list.isEmpty()) {
                User A01 = C17060sy.A01.A01(c69453Af.A0F);
                C1NB c1nb = ((C3G4) list.get(i)).A03.A0W;
                if (c1nb != null) {
                    user = c1nb.CDj();
                } else {
                    user = null;
                }
                if (C14360o3.A0K(A01, user) && interfaceC72953Ov != null) {
                    return interfaceC72953Ov;
                }
            }
        }
        return null;
    }

    public static final ArrayList A01(C69453Af c69453Af) {
        Reel reel = c69453Af.A01;
        if (reel != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(reel);
            arrayList.addAll(c69453Af.A0Q.A02());
            return arrayList;
        }
        return c69453Af.A0Q.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (r1 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0111, code lost:
    
        if (r14 != null) goto L59;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0pQ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C69453Af r12, X.C3FQ r13, X.C3M4 r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69453Af.A02(X.3Af, X.3FQ, X.3M4):void");
    }

    public static final void A04(C69453Af c69453Af, boolean z) {
        String str;
        if (Systrace.A0E(1L)) {
            C0fO.A01("MainFeedReelTrayController.launchReelCamera", 862749426);
        }
        try {
            C2ZI.A00.A0D(AbstractC111324zv.A00(5409), "reelTrayLaunchCamera", false);
            C140626Xq c140626Xq = c69453Af.A06;
            if (c140626Xq != null) {
                c140626Xq.A05(C05F.A0C);
            }
            if (z) {
                str = AbstractC111324zv.A00(2021);
            } else {
                str = "your_story_placeholder";
            }
            InterfaceC53892dT interfaceC53892dT = c69453Af.A0R;
            if (interfaceC53892dT != null) {
                AbstractC208269Jl.A00(c69453Af.A0F).A07(AbstractC189418aK.A00(str), true);
                interfaceC53892dT.FBp(new PositionConfig(null, C82R.A00(C208509Kk.A00, new C81W[0]), null, str, null, null, null, null, null, null, null, null, null, -1.0f, 0, true));
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(1814147865);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1004162266);
            }
            throw th;
        }
    }

    private final void A05(final Reel reel, final C3G2 c3g2, final int i) {
        int i2;
        int A03;
        String str;
        C3M4 A05;
        if (Systrace.A0E(1L)) {
            C0fO.A01("MainFeedReelTrayController.maybePreloadAndLaunchViewer", -709997374);
        }
        try {
            boolean z = true;
            C2ZI.A00.A0D("stories_viewer", "reelTrayLaunchViewer", true);
            FragmentActivity activity = this.A0D.getActivity();
            if (C1OU.A09(reel, this.A06) && (activity == null || (A05 = C3M4.A05(activity)) == null || !A05.A0b())) {
                C140626Xq c140626Xq = this.A06;
                if (c140626Xq != null) {
                    c140626Xq.A05(C05F.A0C);
                }
                C69473Ah c69473Ah = this.A0P;
                RecyclerView recyclerView = c69473Ah.A03;
                if (recyclerView != null) {
                    recyclerView.A0n(c69473Ah.A0C.CNP(reel));
                }
                int i3 = 0;
                if (c69473Ah.A00(reel) == null) {
                    z = false;
                }
                if (!reel.A1a && !reel.A0d() && !reel.A0c()) {
                    AbstractC69573Ar.A00(this.A0F).A03(reel, c3g2, i);
                }
                C140706Xy A00 = AbstractC140696Xx.A00(this.A0F);
                UserSession userSession = A00.A01;
                if (reel.A0O(userSession).isEmpty()) {
                    A03 = -1;
                } else {
                    A03 = reel.A03(userSession);
                }
                C41181vS A0B = reel.A0B(userSession, A03);
                String id = reel.getId();
                C14360o3.A07(id);
                if (A0B == null) {
                    str = null;
                } else {
                    str = C140706Xy.A02(A0B);
                }
                long A002 = C140706Xy.A00(A00, id, str);
                C1QT c1qt = A00.A00;
                c1qt.flowStart(A002, new UserFlowConfig("initial_load", true));
                c1qt.flowAnnotate(A002, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "feed_timeline");
                if (A0B != null) {
                    C140706Xy.A04(reel, A0B, A00);
                }
                C140706Xy.A03(reel, A0B, A00);
                View view = this.A00;
                C14360o3.A0A(view);
                Runnable runnable = new Runnable() { // from class: X.6Wb
                    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x015f, TryCatch #0 {all -> 0x015f, blocks: (B:5:0x001a, B:7:0x0022, B:10:0x0028, B:11:0x002d, B:13:0x0031, B:15:0x0042, B:17:0x0046, B:19:0x004a, B:20:0x0066, B:22:0x006a, B:25:0x0072, B:27:0x007e, B:30:0x0086, B:32:0x0092, B:34:0x00a2, B:36:0x00ab, B:38:0x00af, B:39:0x00b4, B:40:0x00bd, B:41:0x00ce, B:42:0x00c6, B:45:0x00b6, B:50:0x010c, B:52:0x0115, B:53:0x0148, B:55:0x00d6), top: B:4:0x001a }] */
                    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 365
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC140236Wb.run():void");
                    }
                };
                if (!z) {
                    i3 = 100;
                }
                view.postDelayed(runnable, i3);
                if (Systrace.A0E(1L)) {
                    i2 = -1371098754;
                    C0fO.A00(i2);
                }
                return;
            }
            if (Systrace.A0E(1L)) {
                i2 = -709011859;
                C0fO.A00(i2);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-650417640);
            }
            throw th;
        }
    }

    public static final boolean A06(Fragment fragment, C69453Af c69453Af) {
        Object parent;
        if (fragment.mParentFragment instanceof InterfaceC53742dD) {
            parent = c69453Af.A0D.requireParentFragment();
        } else {
            FragmentActivity requireActivity = c69453Af.A0D.requireActivity();
            parent = requireActivity.getParent();
            if (parent == null) {
                parent = requireActivity;
            }
        }
        C14360o3.A0C(parent, "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgNavigator");
        C54762fZ c54762fZ = ((InstagramMainActivity) ((InterfaceC53742dD) parent)).A09;
        c54762fZ.getClass();
        C54802fd c54802fd = c54762fZ.A02;
        C1QO c1qo = C1QO.A0C;
        if (c54802fd.A0F.getPosition() == 0.0f && c54802fd.A0Q.A0B(c1qo)) {
            return true;
        }
        return false;
    }

    public final void A07() {
        UserSession userSession = this.A0F;
        UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession2, 36325794008085882L);
        int i = 1;
        if (!A06 || !this.A0O.A0S.get() || this.A0Q.getItemCount() <= 1) {
            i = 0;
        }
        if (C25371Lr.A00(AbstractC25351Lp.A00(userSession)) && !C18U.A06(c06090Tz, userSession, 2342164997881210816L)) {
            this.A0P.A07(i);
            return;
        }
        RecyclerView recyclerView = this.A0P.A03;
        if (recyclerView == null) {
            return;
        }
        recyclerView.A0n(i);
    }

    public final void A08(boolean z) {
        Integer num;
        ViewGroup viewGroup;
        View findViewById;
        if (z) {
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(this.A0F).A01.ARD();
            ARD.E7G("group_stories_cold_fetch_last_time", 0L);
            ARD.apply();
        }
        C3B1 c3b1 = this.A0a;
        if (c3b1.A02) {
            c3b1.A02 = false;
            View view = c3b1.A01;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof IgFrameLayout) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (!c3b1.A09 && viewGroup != null && (findViewById = viewGroup.findViewById(c3b1.A00)) != null) {
                    findViewById.setOnClickListener(null);
                    viewGroup.removeView(findViewById);
                }
                view.setTranslationX(0.0f);
            }
        }
        C69473Ah c69473Ah = this.A0P;
        if (z) {
            num = C05F.A0j;
        } else {
            num = C05F.A00;
        }
        c69473Ah.A0C.A08 = num;
        A07();
        C61252qn c61252qn = this.A0O;
        UserSession userSession = c61252qn.A07;
        ReelStore A04 = C1OU.A04(userSession);
        A04.A05 = z;
        AbstractC25651Mw.A00(A04.A09).A05(new C3DH(null, A04.A0U(false), -1, false));
        if (z) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36320279272759567L)) {
                c61252qn.A0E();
            } else {
                c61252qn.A0D();
            }
            UserSession userSession2 = c3b1.A06;
            if (C3DL.A00(userSession2) && C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession2).A00, 36320279270662396L) && !AbstractC23021Ah.A00(userSession2).A01.getBoolean("has_seen_group_stories_nux", false)) {
                c3b1.A07.A01(EnumC33481ErG.GROUP_STORY_TRAY, C1QM.A00.A02.A00);
                AbstractC35258Fgs.A03(c3b1.A03, userSession2, new C36726GGv(c3b1, z));
                InterfaceC19610xo ARD2 = AbstractC23021Ah.A00(userSession2).A01.ARD();
                ARD2.E77("has_seen_group_stories_nux", true);
                ARD2.apply();
                return;
            }
        }
        C3B1.A00(c3b1, z);
    }

    public final void A09(final boolean z, final boolean z2) {
        if (this.A00 != null) {
            AbstractC69533An abstractC69533An = this.A0Q;
            if (abstractC69533An.getItemCount() > 0) {
                if (!C18U.A06(C06090Tz.A05, this.A0F, 36321988666795960L)) {
                    abstractC69533An.notifyDataSetChanged();
                }
            }
            A0f.post(new Runnable(this) { // from class: X.3MV
                public final /* synthetic */ C69453Af A00;

                {
                    this.A00 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    if (z) {
                        C69453Af c69453Af = this.A00;
                        boolean z3 = z2;
                        if (c69453Af.A00 != null) {
                            UserSession userSession = c69453Af.A0F;
                            List A0U = C1OU.A04(userSession).A0U(false);
                            AbstractC70833Fv.A00(userSession);
                            C69473Ah c69473Ah = c69453Af.A0P;
                            c69473Ah.A0C.EcN(A0U, z3, c69473Ah.A0B);
                            ArrayList A0O = C1OU.A04(userSession).A0O();
                            User A01 = C17060sy.A01.A01(userSession);
                            Iterator it = A0O.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                ArrayList A0I = ((Reel) it.next()).A0I(userSession);
                                ArrayList arrayList = new ArrayList();
                                Iterator it2 = A0I.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    User user = ((C41181vS) next).A0i;
                                    if (user != null) {
                                        str = user.getId();
                                    } else {
                                        str = null;
                                    }
                                    if (!C14360o3.A0K(str, A01.getId())) {
                                        arrayList.add(next);
                                    }
                                }
                                i += arrayList.size();
                            }
                            ((C69523Am) c69453Af.A0Q).A00 = i;
                            C3D6 A00 = C3D5.A00(userSession);
                            List A02 = c69473Ah.A02();
                            synchronized (A00) {
                                C1QT A002 = C1QS.A00(A00.A03);
                                C3D7 A003 = C3D6.A00(A002, A00);
                                if (A003 != null) {
                                    long j = A003.A05;
                                    A002.flowMarkPoint(j, "POG_IMAGE_LOAD_START");
                                    A002.flowAnnotate(j, "VISIBLE_POG_COUNT", A02.size());
                                    HashSet hashSet = A003.A08;
                                    hashSet.clear();
                                    A003.A00 = 0;
                                    HashSet hashSet2 = A003.A07;
                                    hashSet2.add(C3D9.A04);
                                    Iterator it3 = A02.iterator();
                                    while (it3.hasNext()) {
                                        hashSet.add(((Reel) it3.next()).getId());
                                    }
                                    String str2 = A003.A06;
                                    if (str2 != null) {
                                        hashSet2.add(C3D9.A05);
                                        hashSet.add(str2);
                                    }
                                }
                            }
                            C3G6.A00(userSession).A06(C3G5.A0E, A0U);
                        }
                    }
                }
            });
        }
    }

    public final boolean A0A() {
        return C1OU.A04(this.A0O.A07).A05;
    }

    public final boolean A0B() {
        int i;
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView = this.A0P.A03;
        if (recyclerView != null && (linearLayoutManager = (LinearLayoutManager) recyclerView.A0D) != null) {
            i = linearLayoutManager.A1a();
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null && valueOf.intValue() <= 0) {
            return true;
        }
        return false;
    }

    public final boolean A0D(boolean z) {
        if (this.A00 == null) {
            return false;
        }
        return this.A0O.A0K(false, false, z);
    }

    @Override // X.InterfaceC64002vL
    public final int C9u() {
        return this.A0Q.getItemCount();
    }

    @Override // X.InterfaceC61312qt
    public final void DKn(boolean z) {
        C61252qn c61252qn = this.A0O;
        ArrayList arrayList = c61252qn.A0B;
        if (arrayList == null || arrayList.isEmpty()) {
            this.A0P.A09(c61252qn, true);
        }
    }

    @Override // X.InterfaceC64002vL
    public final void DSa() {
        Iterator it = this.A0Q.A02().iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((Reel) it.next()).A1a) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        Reel A00 = AbstractC73123Pn.A00(this.A0F, InterfaceC73103Pl.A00, false);
        if (A00 != null) {
            A05(A00, C3G2.A1L, i);
        }
    }

    @Override // X.InterfaceC64002vL
    public final void DVW() {
        C3B1 c3b1 = this.A0a;
        c3b1.A07.A03(c3b1.A08.A03.A04, AbstractC111324zv.A00(2493));
        AbstractC35258Fgs.A04(c3b1.A03, c3b1.A06, C05F.A00, null, null);
    }

    @Override // X.InterfaceC63992vK
    public final void Ddr(int i) {
        this.A03.A01(i);
    }

    @Override // X.InterfaceC61312qt
    public final void De4(boolean z, boolean z2) {
        if (this.A00 != null) {
            UserSession userSession = this.A0F;
            List A0U = C1OU.A04(userSession).A0U(false);
            AbstractC70833Fv.A00(userSession);
            C69473Ah c69473Ah = this.A0P;
            c69473Ah.A0C.EcN(A0U, false, c69473Ah.A0B);
            C3G6.A00(userSession).A06(C3G5.A0D, A0U);
            if (C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(userSession).A00, 36317491837015265L)) {
                if (z) {
                    A07();
                }
            } else {
                if (!z) {
                    return;
                }
                c69473Ah.A06();
            }
        }
    }

    @Override // X.InterfaceC64002vL
    public final void Dvg(int i) {
        if (this.A07 && i == ((C69523Am) this.A0Q).A04()) {
            View view = this.A00;
            if (view != null) {
                view.post(new RunnableC36846GLt(this));
            }
            this.A07 = false;
        }
    }

    @Override // X.InterfaceC69463Ag
    public final void EDl(View view, int i) {
        Integer num;
        C69633Ax c69633Ax = this.A0c;
        C61252qn c61252qn = this.A0O;
        if (c61252qn.A0H) {
            num = C05F.A0C;
        } else if (c61252qn.A0E) {
            num = C05F.A0Y;
        } else if (c61252qn.A0G) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        UserSession userSession = this.A0F;
        C14360o3.A0B(num, 2);
        C3TR c3tr = new C3TR(i, num);
        Object obj = new Object();
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(obj, c3tr, "spinner");
        c59072n8.A00(c69633Ax.A05);
        C59062n7 A01 = c59072n8.A01();
        if (C18U.A06(C06090Tz.A05, userSession, 36317491837146339L)) {
            java.util.Set set = c69633Ax.A07;
            if (!set.contains(view)) {
                c69633Ax.A01.A05(view, A01);
                set.add(view);
                return;
            }
            return;
        }
        c69633Ax.A01.A05(view, A01);
    }

    @Override // X.InterfaceC63992vK
    public final void EI4(long j, int i) {
        C64012vM c64012vM = this.A03;
        UserSession userSession = this.A0F;
        c64012vM.A04(new C70873Fz(userSession, C1OU.A04(userSession).A0U(false)), this.A0O, C05F.A0u, i, j, false);
    }

    @Override // X.InterfaceC63992vK
    public final void EI5(long j) {
        C64012vM c64012vM = this.A03;
        UserSession userSession = this.A0F;
        c64012vM.A03(new C70873Fz(userSession, C1OU.A04(userSession).A0U(false)), this.A0O, null, C05F.A0u, j, false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0E.getModuleName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (X.C61252qn.A02(r4, r3, r6, r5) != X.C05F.A01) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7 A[Catch: all -> 0x012f, TryCatch #1 {all -> 0x012f, blocks: (B:5:0x0010, B:7:0x0028, B:24:0x00a1, B:26:0x00a7, B:27:0x00ad, B:29:0x00ba, B:31:0x00dd, B:33:0x00e8, B:34:0x0107, B:35:0x00eb, B:37:0x010d, B:49:0x0122, B:51:0x0128, B:52:0x012e, B:10:0x0031, B:12:0x0048, B:14:0x0059, B:16:0x0064, B:18:0x0076, B:22:0x008f, B:44:0x009b, B:45:0x0097, B:46:0x009e), top: B:4:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8 A[Catch: all -> 0x012f, TryCatch #1 {all -> 0x012f, blocks: (B:5:0x0010, B:7:0x0028, B:24:0x00a1, B:26:0x00a7, B:27:0x00ad, B:29:0x00ba, B:31:0x00dd, B:33:0x00e8, B:34:0x0107, B:35:0x00eb, B:37:0x010d, B:49:0x0122, B:51:0x0128, B:52:0x012e, B:10:0x0031, B:12:0x0048, B:14:0x0059, B:16:0x0064, B:18:0x0076, B:22:0x008f, B:44:0x009b, B:45:0x0097, B:46:0x009e), top: B:4:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107 A[Catch: all -> 0x012f, TryCatch #1 {all -> 0x012f, blocks: (B:5:0x0010, B:7:0x0028, B:24:0x00a1, B:26:0x00a7, B:27:0x00ad, B:29:0x00ba, B:31:0x00dd, B:33:0x00e8, B:34:0x0107, B:35:0x00eb, B:37:0x010d, B:49:0x0122, B:51:0x0128, B:52:0x012e, B:10:0x0031, B:12:0x0048, B:14:0x0059, B:16:0x0064, B:18:0x0076, B:22:0x008f, B:44:0x009b, B:45:0x0097, B:46:0x009e), top: B:4:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d A[Catch: all -> 0x012f, TRY_LEAVE, TryCatch #1 {all -> 0x012f, blocks: (B:5:0x0010, B:7:0x0028, B:24:0x00a1, B:26:0x00a7, B:27:0x00ad, B:29:0x00ba, B:31:0x00dd, B:33:0x00e8, B:34:0x0107, B:35:0x00eb, B:37:0x010d, B:49:0x0122, B:51:0x0128, B:52:0x012e, B:10:0x0031, B:12:0x0048, B:14:0x0059, B:16:0x0064, B:18:0x0076, B:22:0x008f, B:44:0x009b, B:45:0x0097, B:46:0x009e), top: B:4:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69453Af.onCreate():void");
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        if (Systrace.A0E(1L)) {
            C0fO.A01("MainFeedReelTrayController.onDestroy", -1219163236);
        }
        try {
            this.A0O.A0H(this);
            C15670qN.A00(this.A0Y);
            C25671My c25671My = this.A0U;
            c25671My.A02(this.A0W, C3DH.class);
            c25671My.A02(this.A0V, C3D2.class);
            if (C18U.A06(C06090Tz.A06, this.A0F, 36329569283752346L)) {
                c25671My.A02(this.A0X, C2AS.class);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(1602094519);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1980196483);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        if (Systrace.A0E(1L)) {
            C0fO.A01("MainFeedReelTrayController.onDestroyView", -889244018);
        }
        try {
            this.A0P.A04();
            C140626Xq c140626Xq = this.A06;
            if (c140626Xq != null) {
                this.A0H.F9f(c140626Xq);
            }
            this.A05 = null;
            this.A04 = null;
            C3B7 c3b7 = this.A0J;
            Runnable runnable = c3b7.A00;
            if (runnable != null) {
                c3b7.A02.removeCallbacks(runnable);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1609109205);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-760422122);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        if (Systrace.A0E(1L)) {
            C0fO.A01("MainFeedReelTrayController.onPause", 851211330);
        }
        try {
            FragmentActivity activity = this.A0D.getActivity();
            if (activity != null) {
                C1OU c1ou = C1OU.$redex_init_class;
                C3M4 A05 = C3M4.A05(activity);
                if (A05 != null) {
                    A05.A0T();
                    InterfaceC58124Ppn interfaceC58124Ppn = this.A0A;
                    if (interfaceC58124Ppn != null && A05.A0H == interfaceC58124Ppn) {
                        A05.A0H = null;
                        A05.A0I = null;
                    }
                }
            }
            C61252qn c61252qn = this.A0O;
            c61252qn.A02 = System.currentTimeMillis();
            C69473Ah c69473Ah = this.A0P;
            AbstractC69423Ac abstractC69423Ac = this.A0d;
            C14360o3.A0B(abstractC69423Ac, 0);
            RecyclerView recyclerView = c69473Ah.A03;
            if (recyclerView != null) {
                recyclerView.A15(abstractC69423Ac);
            }
            c69473Ah.A05();
            C140626Xq c140626Xq = this.A06;
            if (c140626Xq != null) {
                c140626Xq.A05(C05F.A0N);
            }
            C15670qN.A00(this.A0Y);
            c61252qn.A0H(this);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-302327136);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-2100797324);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C3M4 c3m4;
        if (Systrace.A0E(1L)) {
            C0fO.A01("MainFeedReelTrayController.onResume", 579388549);
        }
        try {
            AbstractC60672pq abstractC60672pq = this.A0D;
            FragmentActivity activity = abstractC60672pq.getActivity();
            this.A0Q.notifyDataSetChanged();
            if (activity == null) {
                c3m4 = null;
            } else {
                C1OU c1ou = C1OU.$redex_init_class;
                c3m4 = C3M4.A05(activity);
            }
            UserSession userSession = this.A0F;
            UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession2, 36317491837015265L)) {
                this.A0O.A0G(this);
            }
            boolean z = true;
            if (c3m4 == null || !c3m4.A0a() || c3m4.A0G == C3G2.A0t) {
                z = false;
            }
            if (!z) {
                if (this.A09 || !this.A0B || !this.A0O.A0K(true, true, true)) {
                    A09(false, false);
                }
            } else {
                C3FQ scrollingViewProxy = abstractC60672pq.getScrollingViewProxy();
                ViewGroup CFj = scrollingViewProxy.CFj();
                C14360o3.A07(CFj);
                if (CFj.isLaidOut()) {
                    A02(this, scrollingViewProxy, c3m4);
                } else {
                    AbstractC13880nE.A0q(CFj, new RunnableC36934GPd(this, scrollingViewProxy, c3m4));
                }
            }
            if (!C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36317491837015265L)) {
                this.A0O.A0G(this);
            }
            C69473Ah c69473Ah = this.A0P;
            AbstractC69423Ac abstractC69423Ac = this.A0d;
            C14360o3.A0B(abstractC69423Ac, 0);
            RecyclerView recyclerView = c69473Ah.A03;
            if (recyclerView != null) {
                recyclerView.A14(abstractC69423Ac);
            }
            C18150uz.A0B.A03(this.A0Y);
            this.A09 = false;
            this.A0B = true;
            if (Systrace.A0E(1L)) {
                C0fO.A00(956108995);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-375682853);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
        C69473Ah c69473Ah = this.A0P;
        if (bundle != null && bundle.containsKey("stories_tray_instance_state")) {
            c69473Ah.A00 = bundle.getParcelable("stories_tray_instance_state");
        }
        Parcelable parcelable = c69473Ah.A00;
        RecyclerView recyclerView = c69473Ah.A03;
        if (recyclerView != null && parcelable != null) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if (abstractC70663Fe != null) {
                abstractC70663Fe.A1P(parcelable);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC61322qu
    public final void DXf(long j, int i) {
        EI4(j, i);
        this.A0P.A09(this.A0O, false);
        this.A0Q.notifyDataSetChanged();
        C9GR.A01(this.A0C, AbstractC111324zv.A00(5413), 2131974546, 0);
    }

    @Override // X.InterfaceC61322qu
    public final void DXg(long j) {
        EI5(j);
        C61252qn c61252qn = this.A0O;
        if (!(!c61252qn.A0R.isEmpty())) {
            if (C18U.A06(C06090Tz.A05, this.A0F, 36329869931463221L)) {
                c61252qn.Co4();
            } else {
                this.A0P.A09(c61252qn, true);
            }
        }
    }
}
