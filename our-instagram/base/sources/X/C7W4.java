package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.User;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7W4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7W4 implements C7W5, InterfaceC11480j6, C7W6, InterfaceC60122ou, C7W7, InterfaceC75483aF, InterfaceC2056198l, InterfaceC72513My, InterfaceC72503Mx {
    public int A00;
    public int A01;
    public int A02;
    public ViewGroup A03;
    public RecyclerView A04;
    public C35147Feo A05;
    public Capabilities A06;
    public C7O4 A07;
    public C7U0 A08;
    public C7KS A09;
    public C7IY A0A;
    public MessageListLayoutManager A0B;
    public C62882tR A0C;
    public C6WQ A0D;
    public RefreshableNestedScrollingParent A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public java.util.Set A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public Integer A0P;
    public boolean A0Q;
    public final int A0R;
    public final Handler A0S;
    public final C7W9 A0T;
    public final AbstractC59962oe A0U;
    public final InterfaceC11380iw A0V;
    public final C18920wW A0W;
    public final InterfaceC41501vz A0X;
    public final InterfaceC41501vz A0Y;
    public final InterfaceC41501vz A0Z;
    public final InterfaceC41501vz A0a;
    public final C41761wQ A0b;
    public final C41761wQ A0c;
    public final UserSession A0d;
    public final C3I9 A0e;
    public final C7U1 A0f;
    public final C7WF A0g;
    public final C7WD A0h;
    public final C7XQ A0i;
    public final C164197Wi A0j;
    public final C7U6 A0k;
    public final C7W2 A0l;
    public final C163907Ve A0m;
    public final C163867Va A0n;
    public final C164047Vt A0o;
    public final C7ZM A0p;
    public final C7WA A0q;
    public final C98K A0r;
    public final InterfaceC163937Vh A0s;
    public final C7ZX A0t;
    public final AnonymousClass988 A0u;
    public final EnumC92794Ds A0v;
    public final C98N A0w;
    public final C2055097z A0x;
    public final InterfaceC60442pS A0y;
    public final C1I2 A0z;
    public final InterfaceC59892oW A10;
    public final String A11;
    public final String A12;
    public final String A13;
    public final String A14;
    public final boolean A15;
    public final C165957bN A16;
    public final C7WE A17;
    public final C164057Vu A18;
    public final AnonymousClass983 A19;
    public final AnonymousClass983 A1A;
    public final C164087Vx A1B;
    public final C7VS A1C;
    public final C7VU A1D;
    public final C7WB A1E;
    public final C7VF A1F;

    public final boolean A0V(String str, String str2) {
        if (A03(this) != null) {
            return true;
        }
        AbstractC46765KmM.A00(this.A0d, this.A0j.A0P, str);
        AbstractC47849LBs.A01(this.A0U, str2);
        return false;
    }

    @Override // X.C7W5
    public final void CkQ(CharSequence charSequence, boolean z) {
        C14360o3.A0B(charSequence, 0);
        if (z) {
            this.A0j.A0P.A01(charSequence.toString());
            Integer valueOf = Integer.valueOf(charSequence.hashCode());
            UserSession userSession = this.A0d;
            IGFOAMessagingLocalSendSpeedLogger A00 = C7R5.A00(userSession, valueOf);
            if (A00 != null) {
                A00.onLogShowOptimisticMessageEnd();
                A00.onLogRenderWillDisplay();
                A00.onLogRenderEnd();
                A00.onEndFlowSucceed();
            }
            IGFOAMessagingSendToSentLogger A002 = C163307Sp.A00(userSession, charSequence.hashCode());
            if (A002 != null) {
                A002.onLogLSSEndFlowSucceed();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0341, code lost:
    
        if (r10 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x063d, code lost:
    
        if (r1 == null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0648, code lost:
    
        if (java.lang.Boolean.valueOf(r0).booleanValue() == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0865, code lost:
    
        if (r10 == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01af, code lost:
    
        if (r1.A01 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c2, code lost:
    
        if (r1.A01 != com.instagram.api.schemas.IGAIAgentType.A04) goto L269;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026b  */
    /* JADX WARN: Type inference failed for: r0v132, types: [android.content.Context, java.lang.Object, android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v135, types: [android.content.Context, boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.7KL, X.7XI] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.0do, X.7XI] */
    /* JADX WARN: Type inference failed for: r0v263, types: [X.Flh, android.view.View$OnClickListener, int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0sZ, X.7XI] */
    /* JADX WARN: Type inference failed for: r0v313, types: [X.7J8, java.util.List, com.instagram.model.reels.Reel, X.3AY, int, com.instagram.direct.model.messaginguser.MessagingUser] */
    /* JADX WARN: Type inference failed for: r0v91, types: [android.graphics.drawable.LayerDrawable, int] */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r31) {
        /*
            Method dump skipped, instructions count: 2242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W4.configureActionBar(X.2iU):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C7U1 A00(Bundle bundle, Bundle bundle2, C7W4 c7w4) {
        boolean z;
        C7U0 c7u0;
        LYX lyx;
        MsysThreadId msysThreadId;
        C83693oE c83693oE;
        C7TQ g5i;
        ArrayList arrayList;
        C3o9 A06;
        String str;
        if (Systrace.A0E(1L)) {
            C0fO.A01("CreateClientInfra", 2053964469);
        }
        try {
            InterfaceC83713oG A00 = AnonymousClass985.A00(bundle);
            AbstractC59962oe abstractC59962oe = c7w4.A0U;
            UserSession userSession = c7w4.A0d;
            String str2 = c7w4.A12;
            Handler handler = c7w4.A0S;
            final C164357Wy c164357Wy = c7w4.A0j.A0J;
            final C9EF c9ef = new C9EF(c7w4, 1);
            final C9EF c9ef2 = new C9EF(c7w4, 2);
            C14360o3.A0B(abstractC59962oe, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(str2, 2);
            C14360o3.A0B(handler, 3);
            C14360o3.A0B(c164357Wy, 5);
            C7O4 c7o4 = null;
            boolean contains = AbstractC163797Ut.A00.contains(str2);
            Bundle bundle3 = abstractC59962oe.mArguments;
            if (bundle3 != null) {
                long j = bundle3.getLong("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_SORT_ORDER");
                if (contains) {
                    arrayList = bundle3.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_HIGHLIGHT_RANGES");
                } else {
                    arrayList = null;
                }
                boolean z2 = A00 instanceof InterfaceC83703oF;
                if (z2) {
                    C83693oE A002 = AbstractC140956Yx.A00(AbstractC140946Yw.A01(A00));
                    if (A002 != null) {
                        String str3 = A002.A00;
                        C2DU c2du = (C2DU) AbstractC28761aE.A00(userSession);
                        C14360o3.A0B(str3, 0);
                        C81663kb A0N = c2du.A0N(str3);
                        if (A0N != null) {
                            A06 = A0N.BKb();
                        } else {
                            A06 = null;
                        }
                    }
                } else {
                    A06 = AbstractC140946Yw.A06(A00);
                }
                if (contains) {
                    if (!z2) {
                        str = String.valueOf(bundle3.getLong("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CLIENT_THREAD_PK", -1L));
                    } else {
                        str = bundle3.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID", null);
                    }
                } else {
                    str = null;
                }
                c7o4 = new C7O4(userSession, A06, Long.valueOf(j), str, arrayList, contains);
                c7o4.A03 = new C7OT(handler, abstractC59962oe);
                c7o4.A0D.add(new C7OV() { // from class: X.7OU
                    @Override // X.C7OV
                    public final void DOk() {
                        C77K c77k;
                        C164357Wy c164357Wy2 = C164357Wy.this;
                        View view = (View) c164357Wy2.A04.invoke();
                        if (view != null) {
                            view.postDelayed(new RunnableC49864M0j(c164357Wy2), 0L);
                        }
                        if (((Boolean) c9ef.invoke()).booleanValue() && (c77k = (C77K) c9ef2.invoke()) != null) {
                            c77k.A01();
                        }
                    }
                });
            }
            c7w4.A07 = c7o4;
            Capabilities capabilities = (Capabilities) bundle.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
            if (bundle2 == null) {
                if (capabilities == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                Capabilities capabilities2 = (Capabilities) bundle2.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
                if (capabilities2 == null) {
                    if (capabilities == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    capabilities = capabilities2;
                }
            }
            c7w4.A06 = capabilities;
            if (bundle2 != null) {
                z = bundle2.getBoolean("DirectThreadFragment.ARGUMENT_SHOW_PERMISSIONS");
            } else {
                z = bundle.getBoolean("DirectThreadFragment.ARGUMENT_SHOW_PERMISSIONS");
            }
            Map map = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            String string = bundle.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_NAME", null);
            c7w4.A0L = abstractC59962oe.requireArguments().getBoolean("DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET", false);
            String string2 = bundle.getString("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID");
            if (string2 == null) {
                string2 = UUID.randomUUID().toString();
                C14360o3.A07(string2);
            }
            c7w4.A0G = string2;
            String str4 = "expiringMessageReplaySessionId";
            if (bundle2 != null) {
                string2 = bundle2.getString("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID");
                if (string2 != null || (string2 = c7w4.A0G) != null) {
                    c7w4.A0G = string2;
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            }
            C165957bN c165957bN = c7w4.A16;
            Capabilities capabilities3 = c7w4.A06;
            if (capabilities3 == null) {
                str4 = "_capabilities";
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            }
            C7O4 c7o42 = c7w4.A07;
            int i = 3;
            InterfaceC83713oG A003 = AnonymousClass985.A00(bundle);
            String str5 = c165957bN.A0Q;
            final UserSession userSession2 = c165957bN.A04;
            boolean z3 = c165957bN.A0T;
            boolean z4 = c165957bN.A0V;
            String str6 = c165957bN.A0P;
            C7VF c7vf = c165957bN.A0K;
            AnonymousClass988 anonymousClass988 = c165957bN.A0H;
            C164087Vx c164087Vx = c165957bN.A0B;
            boolean z5 = c165957bN.A0S;
            InterfaceC164017Vq interfaceC164017Vq = c165957bN.A0L;
            InterfaceC164017Vq interfaceC164017Vq2 = c164087Vx.A09;
            InterfaceC60442pS interfaceC60442pS = c165957bN.A0M;
            C7WA c7wa = c165957bN.A0D;
            C7X7 c7x7 = c165957bN.A0A;
            C7XE c7xe = c165957bN.A05;
            C165907bI c165907bI = c165957bN.A0C;
            C98K c98k = c165957bN.A0F;
            C14360o3.A0B(interfaceC164017Vq, 9);
            C14360o3.A0B(c7wa, 12);
            InterfaceC83703oF A02 = AbstractC140946Yw.A02(A003);
            InterfaceC2056098k A04 = AbstractC140946Yw.A04(A003);
            if (A04 != null && A02 != null) {
                A003 = new C163787Us(A02, A04);
            }
            String str7 = null;
            if (A04 != null) {
                if (A04 instanceof MsysThreadId) {
                    msysThreadId = (MsysThreadId) A04;
                } else {
                    msysThreadId = null;
                }
                AbstractC59962oe abstractC59962oe2 = c165957bN.A01;
                Context requireContext = abstractC59962oe2.requireContext();
                C7ZX c7zx = c165957bN.A0G;
                C24231Aox c24231Aox = new C24231Aox(c165957bN);
                C165937bL c165937bL = c165957bN.A06;
                C41761wQ c41761wQ = c165957bN.A03;
                C49324LrI c49324LrI = new C49324LrI(c165957bN.A0J);
                C14360o3.A0B(c7zx, 2);
                C14360o3.A0B(c165937bL, 7);
                C14360o3.A0B(c41761wQ, 8);
                if (str5 == null) {
                    c83693oE = null;
                } else {
                    c83693oE = new C83693oE(str5);
                }
                C7T0 c7t0 = new C7T0(userSession2, capabilities3, c83693oE, A04, z);
                C49098Lnb c49098Lnb = new C49098Lnb(userSession2, c7xe, c7xe, c7xe, c7xe.A03, c7x7);
                AnonymousClass988 A004 = AnonymousClass988.A1Z.A00(userSession2, A0V.A00(userSession2));
                C48713Lgh c48713Lgh = new C48713Lgh(userSession2, c98k, anonymousClass988, c7vf);
                C7K6 c7k6 = new C7K6(userSession2, c48713Lgh, c48713Lgh);
                c164087Vx.A00 = c48713Lgh;
                C49206LpN c49206LpN = new C49206LpN(requireContext, userSession2, capabilities3, c7o42, c165937bL, c164087Vx, c7k6, c7wa, c98k, c7zx, anonymousClass988, A004, c49098Lnb, c48713Lgh, interfaceC164017Vq, interfaceC164017Vq2, c49324LrI, string, new MHH(userSession2, 37), new MHH(userSession2, 38), new MIL(15, requireContext, userSession2, anonymousClass988, c7x7, c164087Vx), z);
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession2, 2342156051466094224L)) {
                    C2DS A005 = AbstractC28761aE.A00(userSession2);
                    g5i = new G5H(userSession2, new C7TP(userSession2, null, A005), new G5I(userSession2), A005);
                } else {
                    g5i = new G5I(userSession2);
                }
                C7TQ c7tq = g5i;
                C49295Lqp c49295Lqp = (C49295Lqp) userSession2.A01(C49295Lqp.class, new C50160MDn(userSession2, 22));
                if (!C18U.A06(c06090Tz, userSession2, 36317968577140453L)) {
                    c41761wQ.A02(c7t0.A04.A0C(), c24231Aox);
                    c49098Lnb.A02(c41761wQ, c49206LpN);
                }
                c7u0 = new C48712Lgg(userSession2, new C49207LpO(), c7t0, c49098Lnb, c49206LpN, c7tq, c49295Lqp, (C49296Lqq) AbstractC41851wZ.A00(userSession2).A01(C49296Lqq.class, new C50160MDn(userSession2, 31)), c24231Aox);
                if (msysThreadId != null) {
                    lyx = new LYX(userSession2, msysThreadId.A00);
                    abstractC59962oe2.registerLifecycleListener(lyx);
                } else {
                    lyx = null;
                }
            } else {
                c7u0 = null;
                lyx = null;
            }
            if (A02 == null) {
                str7 = str5;
                if (c7u0 == null) {
                    throw new IllegalStateException("No ClientInfra available.");
                }
            } else {
                C7VU c7vu = c165957bN.A0E;
                if (c7vu != null) {
                    C164057Vu c164057Vu = c165957bN.A09;
                    Handler handler2 = c165957bN.A00;
                    AbstractC59962oe abstractC59962oe3 = c165957bN.A01;
                    C7WE c7we = c165957bN.A07;
                    C7WD c7wd = c165957bN.A08;
                    C14360o3.A0B(handler2, 5);
                    C14360o3.A0B(abstractC59962oe3, 6);
                    C14360o3.A0B(c7we, 7);
                    C14360o3.A0B(c7wd, 8);
                    C2DS A006 = AbstractC28761aE.A00(userSession2);
                    C163807Uu c163807Uu = new C163807Uu(userSession2, capabilities3, str6, z3, z4);
                    C163827Uw c163827Uw = new C163827Uw(userSession2, capabilities3, c7o42, c7xe, c7we, c7wd, c164087Vx, c163807Uu, c98k, anonymousClass988, c7vu, c7vf, interfaceC164017Vq, A006, str6, string, z5, z, z3, z4);
                    C7TG A007 = AbstractC165967bO.A00(userSession2);
                    C7TL A008 = C7TL.A00(userSession2);
                    C14360o3.A07(A008);
                    C7TP c7tp = new C7TP(userSession2, c163827Uw, A006);
                    C7TT C7W = c163827Uw.C7W();
                    C14360o3.A07(C7W);
                    boolean z6 = C7W.A0r;
                    C7VB c7vb = c163827Uw.A06;
                    C14360o3.A07(c7vb);
                    User A01 = C17060sy.A01.A01(userSession2);
                    C7TV c7tv = (C7TV) userSession2.A01(C7TV.class, C7TU.A00);
                    c7tv.A01.clear();
                    C7TY c7ty = (C7TY) userSession2.A01(C7TY.class, C7TX.A00);
                    ((C7TW) c7ty).A01.clear();
                    C163377Ta c163377Ta = (C163377Ta) userSession2.A01(C163377Ta.class, C7TZ.A00);
                    c163377Ta.A01.clear();
                    C163397Tc c163397Tc = (C163397Tc) userSession2.A01(C163397Tc.class, C163387Tb.A00);
                    c163397Tc.A01.clear();
                    C163417Te c163417Te = (C163417Te) userSession2.A01(C163417Te.class, C163407Td.A00);
                    c163417Te.A01.clear();
                    C163437Tg c163437Tg = (C163437Tg) userSession2.A01(C163437Tg.class, C163427Tf.A00);
                    c163437Tg.A01.clear();
                    C163457Ti c163457Ti = (C163457Ti) userSession2.A01(C163457Ti.class, C163447Th.A00);
                    c163457Ti.A01.clear();
                    c163457Ti.A00.clear();
                    C163477Tk c163477Tk = (C163477Tk) userSession2.A01(C163477Tk.class, C163467Tj.A00);
                    c163477Tk.A00.clear();
                    c163477Tk.A01.clear();
                    C163497Tm c163497Tm = (C163497Tm) userSession2.A01(C163497Tm.class, C163487Tl.A00);
                    c163497Tm.A00.clear();
                    c163497Tm.A01.clear();
                    C163547Tr c163547Tr = new C163547Tr(interfaceC60442pS, userSession2, new C163527Tp(userSession2), new C163537Tq(userSession2), c7o42, c164057Vu, c7x7, c7tv, c165907bI, c98k, anonymousClass988, c163417Te, c163397Tc, c7vb, c163457Ti, c7ty, c163477Tk, c163497Tm, c163377Ta, new C163507Tn(map, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, i), C7W, c163437Tg, MessagingUser.A00(A01), c163827Uw, A01, string2, new HashMap(), new InterfaceC08830cm() { // from class: X.7To
                        @Override // X.InterfaceC08830cm
                        public final /* bridge */ /* synthetic */ Object get() {
                            return Boolean.valueOf(C18U.A06(C06090Tz.A05, UserSession.this, 36317809663284837L));
                        }
                    }, z6);
                    c7u0 = new C163627Tz(c163807Uu, c163827Uw, c163827Uw, c163547Tr, A007, A008, c7tp);
                    c163827Uw.A04 = c163547Tr;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C7U0 c7u02 = c7u0;
            if (c165957bN.A0I.A00() && str7 != null) {
                InterfaceC163857Uz Avk = c7u02.Avk();
                C14360o3.A0C(Avk, "null cannot be cast to non-null type com.instagram.direct.msys.impl.thread.loader.MsysThreadViewDataLoaderIntf");
                C42221xC A022 = ((C49206LpN) Avk).A02();
                final B9X b9x = B9X.A00;
                C42221xC A0G = A022.A0M(new C6J5() { // from class: X.Lci
                    @Override // X.C6J5
                    public final /* synthetic */ boolean test(Object obj) {
                        return AbstractC25231BEo.A1a(obj, InterfaceC16660sJ.this);
                    }
                }).A0K(C48401LbG.A00).A0G();
                C41761wQ c41761wQ2 = c165957bN.A02;
                final C50359MLl c50359MLl = new C50359MLl(c165957bN, 5);
                c41761wQ2.A02(A0G.A0M(new C6J5() { // from class: X.Lci
                    @Override // X.C6J5
                    public final /* synthetic */ boolean test(Object obj) {
                        return AbstractC25231BEo.A1a(obj, InterfaceC16660sJ.this);
                    }
                }), c165957bN.A0N);
                String string3 = bundle.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_RELAUNCH_SHH_MODE_ENTRY_POINT_REFERENCE", null);
                C7YT[] values = C7YT.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    C7YT c7yt = values[i2];
                    if (C14360o3.A0K(c7yt.name(), string3)) {
                        c41761wQ2.A02(A0G, new C49708Lxd(c165957bN, c7yt, str7));
                        break;
                    }
                    i2++;
                }
            }
            C7U1 c7u1 = new C7U1(c7u02, lyx, A003, str7);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-311973806);
            }
            return c7u1;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-628817295);
            }
            throw th;
        }
    }

    public static final C2EC A01(C7W4 c7w4) {
        if (c7w4.A0F != null) {
            C2DS A00 = C2JD.A00(c7w4.A0d);
            String str = c7w4.A0F;
            if (str != null) {
                return ((C2DU) A00).A0N(str);
            }
            throw new IllegalStateException("Required value was null.");
        }
        C7U0 c7u0 = c7w4.A08;
        if (c7u0 != null) {
            EnumC2054697t enumC2054697t = EnumC2054697t.A0Y;
            if (!c7u0.AHB(enumC2054697t)) {
                AbstractC34059F1m.A00(enumC2054697t);
                return null;
            }
            C7U0 c7u02 = c7w4.A08;
            if (c7u02 != null) {
                if (!c7u02.C7r().CeQ()) {
                    return null;
                }
                C7U0 c7u03 = c7w4.A08;
                if (c7u03 != null) {
                    C2EC Co6 = c7u03.C7r().Co6();
                    if (Co6 != null) {
                        return Co6;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        C14360o3.A0F("clientInfra");
        throw C00O.createAndThrow();
    }

    public static final InterfaceC83713oG A02(C7W4 c7w4) {
        C7U0 c7u0 = c7w4.A08;
        if (c7u0 == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        InterfaceC83713oG C7i = c7u0.C7r().C7i();
        C14360o3.A07(C7i);
        return C7i;
    }

    public static final C3o9 A03(C7W4 c7w4) {
        C7U0 c7u0 = c7w4.A08;
        if (c7u0 == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        return c7u0.C7r().Afi();
    }

    public static final List A04(C7W4 c7w4) {
        C7U0 c7u0 = c7w4.A08;
        if (c7u0 != null) {
            if (!c7u0.C7r().CeQ()) {
                return null;
            }
            C7U0 c7u02 = c7w4.A08;
            if (c7u02 != null) {
                return c7u02.C7r().BSH();
            }
        }
        C14360o3.A0F("clientInfra");
        throw C00O.createAndThrow();
    }

    public static final void A05(C7W4 c7w4) {
        C7U0 c7u0 = c7w4.A08;
        if (c7u0 == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        boolean CVY = c7u0.C7r().CVY();
        c7w4.A0w.A00 = Boolean.valueOf(CVY);
        c7w4.A0x.A02("is_group", CVY);
        AbstractC09800fd.A01("DirectThreadController.onNavigationTrackerReportModuleResumed", 1188236140);
        try {
            C55772hI.A00(c7w4.A0d).A0D("deferred_logging", c7w4.A0V);
            AbstractC09800fd.A00(-1781830594);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-866573971);
            throw th;
        }
    }

    public static final void A06(C7W4 c7w4) {
        C7U0 c7u0 = c7w4.A08;
        if (c7u0 != null) {
            int i = c7u0.C7r().C7W().A08;
            String A00 = C4GR.A00(i);
            C7U0 c7u02 = c7w4.A08;
            if (c7u02 != null) {
                String C7I = c7u02.C7r().C7I();
                C62882tR c62882tR = c7w4.A0C;
                if (c62882tR != null) {
                    c62882tR.A04 = Integer.valueOf(i);
                    c62882tR.A06 = A00;
                    c62882tR.A05 = C7I;
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("clientInfra");
        throw C00O.createAndThrow();
    }

    public static final void A07(C7W4 c7w4) {
        Context context = c7w4.A0U.getContext();
        if (context != null) {
            C7U0 c7u0 = c7w4.A08;
            if (c7u0 != null) {
                DirectThreadThemeInfo C7j = c7u0.C7r().C7j();
                C164247Wn c164247Wn = c7w4.A0j.A0M;
                AnonymousClass988 anonymousClass988 = c7w4.A0u;
                C7U0 c7u02 = c7w4.A08;
                if (c7u02 != null) {
                    Integer A03 = c164247Wn.A03(c7u02.C7r());
                    c164247Wn.A05(C7ID.A00.A00(context, c164247Wn.A02(C7j), c164247Wn.A01(C7j), anonymousClass988, C7j, A03));
                    A0C(c7w4, false);
                    return;
                }
            }
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
    }

    public static final void A08(C7W4 c7w4, C7IM c7im) {
        RecyclerView recyclerView = c7w4.A04;
        String str = "messageRecyclerView";
        Parcelable parcelable = null;
        if (recyclerView != null) {
            C7KS c7ks = c7w4.A09;
            if (c7ks == null) {
                str = "messageItemDecorator";
            } else {
                recyclerView.A11(c7ks);
                RecyclerView recyclerView2 = c7w4.A04;
                if (recyclerView2 != null) {
                    Context context = recyclerView2.getContext();
                    C14360o3.A07(context);
                    C7U0 c7u0 = c7w4.A08;
                    if (c7u0 != null) {
                        InterfaceC163557Ts BT6 = c7u0.BT6();
                        UserSession userSession = c7w4.A0d;
                        InterfaceC83713oG C7i = c7u0.C7r().C7i();
                        C14360o3.A07(C7i);
                        boolean z = C7i instanceof InterfaceC83703oF;
                        C7U0 c7u02 = c7w4.A08;
                        if (c7u02 != null) {
                            C7TT C7W = c7u02.C7r().C7W();
                            C14360o3.A07(C7W);
                            C7KS c7ks2 = new C7KS(context, BT6, BT6, c7im.A04, AbstractC31236DoJ.A01(userSession, C7W, z));
                            c7w4.A09 = c7ks2;
                            RecyclerView recyclerView3 = c7w4.A04;
                            if (recyclerView3 != null) {
                                recyclerView3.A10(c7ks2);
                                RecyclerView recyclerView4 = c7w4.A04;
                                if (recyclerView4 != null) {
                                    AbstractC70663Fe abstractC70663Fe = recyclerView4.A0D;
                                    if (abstractC70663Fe != null) {
                                        parcelable = abstractC70663Fe.A1M();
                                    }
                                    RecyclerView recyclerView5 = c7w4.A04;
                                    if (recyclerView5 != null) {
                                        C7IY c7iy = c7w4.A0A;
                                        if (c7iy == null) {
                                            str = "messageListAdapterHolder";
                                        } else {
                                            recyclerView5.setAdapter(c7iy.AZT());
                                            RecyclerView recyclerView6 = c7w4.A04;
                                            if (recyclerView6 != null) {
                                                AbstractC70663Fe abstractC70663Fe2 = recyclerView6.A0D;
                                                if (abstractC70663Fe2 != null) {
                                                    if (parcelable != null) {
                                                        abstractC70663Fe2.A1P(parcelable);
                                                        return;
                                                    }
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F("clientInfra");
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x02d8, code lost:
    
        if (r4 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (X.AbstractC140946Yw.A07(r0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        if (r1 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0110, code lost:
    
        if (X.C2E8.A07(r5) == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A09(X.C7W4 r31, X.InterfaceC83733oI r32) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W4.A09(X.7W4, X.3oI):void");
    }

    public static final void A0A(C7W4 c7w4, C3o9 c3o9) {
        if (c7w4.A0U.isResumed()) {
            c7w4.A1A.A0K(c3o9);
            A06(c7w4);
            A0D(c7w4, true);
        }
    }

    public static final void A0B(C7W4 c7w4, boolean z) {
        Resources resources;
        int i;
        ViewGroup viewGroup = c7w4.A03;
        if (viewGroup != null && viewGroup.getContext() != null) {
            C7U0 c7u0 = c7w4.A08;
            if (c7u0 == null) {
                C14360o3.A0F("clientInfra");
                throw C00O.createAndThrow();
            }
            if (!c7u0.C7r().Eje()) {
                if (!z && c7w4.A0U()) {
                    resources = viewGroup.getContext().getResources();
                    i = R.dimen.direct_composer_redesign_background_height;
                } else {
                    resources = viewGroup.getContext().getResources();
                    i = R.dimen.action_bar_item_spacing_left;
                }
                AbstractC13880nE.A0Y(viewGroup, resources.getDimensionPixelOffset(i));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0280, code lost:
    
        if (r0.A0t == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0392, code lost:
    
        r4 = r5.A07.requireActivity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0398, code lost:
    
        if (r3 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x039a, code lost:
    
        r3 = r2.A0i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x039d, code lost:
    
        r3 = r2.A0l;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0C(X.C7W4 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W4.A0C(X.7W4, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x015f, code lost:
    
        if (r9 == null) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0D(X.C7W4 r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W4.A0D(X.7W4, boolean):void");
    }

    private final void A0E(boolean z, float f) {
        ViewGroup viewGroup = this.A03;
        if (viewGroup != null) {
            RecyclerView recyclerView = this.A04;
            if (recyclerView == null) {
                C14360o3.A0F("messageRecyclerView");
                throw C00O.createAndThrow();
            }
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            if (f == 0.0f) {
                AbstractC13880nE.A0d(viewGroup, 0);
            }
            float f2 = -viewGroup.getY();
            if (f == 0.0f && computeVerticalScrollOffset < f2) {
                C55942hf c55942hf = C150956qv.A02;
                AbstractC125325le.A01(viewGroup, 0).A0G();
                viewGroup.setY(0.0f);
            } else {
                if (z) {
                    C55942hf c55942hf2 = C150956qv.A02;
                    AbstractC125325le A01 = AbstractC125325le.A01(viewGroup, 0);
                    A01.A0G();
                    A01.A0K(f);
                    AbstractC125325le A0F = A01.A0F(true);
                    A0F.A06 = new C24097Ami(viewGroup, f);
                    A0F.A05 = new C24091Amc(viewGroup, f);
                    A0F.A0H();
                    return;
                }
                viewGroup.setY(f);
                AbstractC13880nE.A0d(viewGroup, -((int) f));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r14.A0d, 36316903425184466L) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r14.A0d, 36317277087667169L) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0F(X.C7W4 r14) {
        /*
            X.7U0 r0 = r14.A08
            if (r0 != 0) goto Le
            java.lang.String r0 = "clientInfra"
        L6:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            X.7Ux r6 = r0.C7r()
            boolean r0 = r6.CeQ()
            r8 = 0
            if (r0 == 0) goto L69
            X.7TT r5 = r6.C7W()
            X.4Ds r0 = r14.A0v
            boolean r7 = r0.A00()
            if (r7 != 0) goto L35
            com.instagram.common.session.UserSession r3 = r14.A0d
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316903425184466(0x810608000012d2, double:3.030294190294441E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L48
        L35:
            r4 = 0
            if (r7 == 0) goto L48
            com.instagram.common.session.UserSession r3 = r14.A0d
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317277087667169(0x81065f000513e1, double:3.030530495953121E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L49
        L48:
            r1 = 0
        L49:
            com.instagram.common.session.UserSession r9 = r14.A0d
            com.instagram.direct.capabilities.Capabilities r10 = r14.A06
            if (r10 != 0) goto L52
            java.lang.String r0 = "_capabilities"
            goto L6
        L52:
            X.3oI r11 = r5.A0P
            int r12 = r5.A08
            java.lang.String r0 = r9.userId
            boolean r13 = r6.CPb(r0)
            boolean r14 = r5.A1A
            boolean r0 = X.AbstractC160827Iq.A03(r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L69
            if (r4 != 0) goto L68
            if (r1 == 0) goto L69
        L68:
            r8 = 1
        L69:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W4.A0F(X.7W4):boolean");
    }

    public static final boolean A0G(C7W4 c7w4) {
        C7U0 c7u0 = c7w4.A08;
        if (c7u0 == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        return C161867Mw.A02(c7u0.C7r().C7W().A0G);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r6 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return X.AbstractC160497Hj.A00(r2, r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return X.AbstractC160497Hj.A01(r2, r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001a, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if ((r0 instanceof X.InterfaceC83703oF) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r4 = r3.C7W();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        X.C14360o3.A0B(r2, 0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC160517Hl A0H(boolean r6) {
        /*
            r5 = this;
            X.7U0 r0 = r5.A08
            r4 = 0
            if (r0 == 0) goto L2b
            X.7Ux r3 = r0.C7r()
        L9:
            com.instagram.common.session.UserSession r2 = r5.A0d
            if (r3 == 0) goto L19
            X.3oG r0 = r3.C7i()
            X.C14360o3.A07(r0)
            boolean r0 = r0 instanceof X.InterfaceC83703oF
            r1 = 0
            if (r0 == 0) goto L1c
        L19:
            r1 = 1
            if (r3 == 0) goto L20
        L1c:
            X.7TT r4 = r3.C7W()
        L20:
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            if (r6 == 0) goto L2d
            X.7Hl r0 = X.AbstractC160497Hj.A00(r2, r4, r1)
            return r0
        L2b:
            r3 = r4
            goto L9
        L2d:
            X.7Hl r0 = X.AbstractC160497Hj.A01(r2, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W4.A0H(boolean):X.7Hl");
    }

    public final C7DC A0I() {
        C7U0 c7u0 = this.A08;
        if (c7u0 != null) {
            if (c7u0.C7r().CeQ()) {
                C7U0 c7u02 = this.A08;
                if (c7u02 != null) {
                    if (c7u02.C7r().Eje()) {
                        C7U0 c7u03 = this.A08;
                        if (c7u03 != null) {
                            if (!c7u03.C7r().CZc()) {
                                C7U0 c7u04 = this.A08;
                                if (c7u04 != null) {
                                    return C7DD.A00(this.A0d, c7u04.Aq4());
                                }
                            }
                        }
                    }
                }
            }
            C7U0 c7u05 = this.A08;
            if (c7u05 != null) {
                InterfaceC163557Ts BT6 = c7u05.BT6();
                boolean Ain = BT6.Ain();
                C7DD c7dd = C7DC.A08;
                if (Ain) {
                    return new C7DC(C7DI.A05, null, null, null, null, null, BT6.Ail(), 0L);
                }
                C2EE Aq4 = c7u05.Aq4();
                UserSession userSession = this.A0d;
                Context requireContext = this.A0U.requireContext();
                C7U0 c7u06 = this.A08;
                if (c7u06 != null) {
                    return c7dd.A02(requireContext, userSession, c7u06.C7r().C7W().A0G, Aq4);
                }
            }
        }
        C14360o3.A0F("clientInfra");
        throw C00O.createAndThrow();
    }

    public final C7IT A0J() {
        C7IT c7it = this.A0j.A03;
        if (c7it != null) {
            return c7it;
        }
        C14360o3.A0F("directSendHelper");
        throw C00O.createAndThrow();
    }

    public final InterfaceC163977Vl A0K() {
        return ((C164517Xq) this.A0i.A0f.getValue()).A04;
    }

    public final DirectShareTarget A0L() {
        Context context = this.A0U.getContext();
        if (context == null) {
            return null;
        }
        C7U0 c7u0 = this.A08;
        if (c7u0 == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        return c7u0.C7r().C7f(context);
    }

    public final DirectThreadKey A0M() {
        C7U0 c7u0 = this.A08;
        if (c7u0 == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        return JRE.A02(c7u0.C7r().Afi());
    }

    public final Long A0N() {
        C7U0 c7u0 = this.A08;
        if (c7u0 == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        C7TT C7W = c7u0.C7r().C7W();
        C14360o3.A07(C7W);
        return AbstractC160897Ix.A00(C7W);
    }

    public final void A0O() {
        String str;
        String str2;
        Capabilities capabilities = this.A06;
        if (capabilities == null) {
            str = "_capabilities";
        } else if (capabilities.A00(EnumC2054697t.A07)) {
            C164247Wn c164247Wn = this.A0j.A0M;
            C7U0 c7u0 = this.A08;
            str = "clientInfra";
            if (c7u0 != null) {
                Integer A03 = c164247Wn.A03(c7u0.C7r());
                C14360o3.A07(A03);
                if (this.A0P != A03) {
                    this.A0P = A03;
                } else {
                    C7IM c7im = c164247Wn.A04;
                    C14360o3.A07(c7im);
                    String str3 = c7im.A09;
                    C7U0 c7u02 = this.A08;
                    if (c7u02 != null) {
                        DirectThreadThemeInfo C7j = c7u02.C7r().C7j();
                        if (C7j == null || (str2 = C7j.A0o) == null) {
                            str2 = "";
                        }
                        if (!(!C14360o3.A0K(str3, str2))) {
                            return;
                        }
                    }
                }
                A07(this);
                return;
            }
        } else {
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A0P() {
        C7KA c7ka = this.A0i.A08;
        if (c7ka == null) {
            C18950wb.A01.AEp("mDirectActivityThreadIndicatorController is not initialized yet.", 20134884).report();
        } else {
            c7ka.A01();
        }
    }

    public final void A0Q() {
        C7DC A0I;
        String str;
        String str2;
        C66057Tyu c66057Tyu;
        C66058Tyv c66058Tyv;
        if (this.A0U.isResumed()) {
            InterfaceC09390do interfaceC09390do = this.A0i.A0i;
            boolean A04 = ((C164477Xm) interfaceC09390do.getValue()).A04();
            C164477Xm c164477Xm = (C164477Xm) interfaceC09390do.getValue();
            if (A04) {
                long A02 = c164477Xm.A02();
                String A03 = ((C164477Xm) interfaceC09390do.getValue()).A03();
                C164477Xm c164477Xm2 = (C164477Xm) interfaceC09390do.getValue();
                String str3 = null;
                if (C18U.A06(C06090Tz.A05, c164477Xm2.A00, 36317161123484493L) && (c66057Tyu = c164477Xm2.A0C) != null && (c66058Tyv = c66057Tyu.A03) != null) {
                    str3 = c66058Tyv.A00;
                }
                C7U0 c7u0 = this.A08;
                if (c7u0 != null) {
                    A0I = new C7DC(C7DI.A08, c7u0.Aq4(), A03, str3, null, null, 0, TimeUnit.SECONDS.toMillis(A02) - System.currentTimeMillis());
                    this.A19.A0J(A0I);
                    A0B(this, A0I.A03());
                }
                C14360o3.A0F("clientInfra");
                throw C00O.createAndThrow();
            }
            boolean A05 = c164477Xm.A05();
            C164477Xm c164477Xm3 = (C164477Xm) interfaceC09390do.getValue();
            if (A05) {
                long j = c164477Xm3.A0D.A00;
                C7U0 c7u02 = this.A08;
                if (c7u02 != null) {
                    A0I = new C7DC(C7DI.A0A, c7u02.Aq4(), null, null, null, null, 0, TimeUnit.SECONDS.toMillis(j) - System.currentTimeMillis());
                    this.A19.A0J(A0I);
                    A0B(this, A0I.A03());
                }
                C14360o3.A0F("clientInfra");
                throw C00O.createAndThrow();
            }
            if (c164477Xm3.A06()) {
                C2EE Aq4 = ((C7U0) ((C164477Xm) interfaceC09390do.getValue()).A07.get()).Aq4();
                if (Aq4 != null) {
                    str = Aq4.BNA();
                } else {
                    str = null;
                }
                C7U0 c7u03 = this.A08;
                if (c7u03 != null) {
                    C2EE Aq42 = c7u03.Aq4();
                    C7DI c7di = C7DI.A0B;
                    if (Aq42 != null) {
                        str2 = Aq42.C7I();
                    } else {
                        str2 = null;
                    }
                    A0I = new C7DC(c7di, Aq42, null, null, str, str2, 0, 0L);
                }
                C14360o3.A0F("clientInfra");
                throw C00O.createAndThrow();
            }
            A0I = A0I();
            this.A19.A0J(A0I);
            A0B(this, A0I.A03());
        }
    }

    public final void A0R(float f) {
        if (this.A03 != null) {
            if (!this.A0Q && Build.VERSION.SDK_INT < 30) {
                A0E(true, f);
                return;
            }
            return;
        }
        this.A0U.requireArguments().putFloat("DirectThreadFragment.ARGUMENT_LIST_VIEW_TRANSLATION_Y", f);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0S(int r8, int r9, int r10, boolean r11) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.A04
            if (r0 == 0) goto L9f
            X.7Wi r0 = r7.A0j
            X.7XA r3 = r0.A0H
            com.instagram.common.session.UserSession r4 = r3.A08
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318033005647713(0x81070f003e1761, double:3.031008541527854E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L9b
            X.2iX r0 = r3.A04
        L19:
            if (r0 == 0) goto L9f
            androidx.recyclerview.widget.RecyclerView r0 = r7.A04
            java.lang.String r6 = "messageRecyclerView"
            if (r0 == 0) goto Lab
            r5 = 1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L29
            int r8 = r8 - r10
        L29:
            X.2oe r2 = r7.A0U
            android.content.Context r0 = r2.requireContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r8 = r8 - r0
            android.content.Context r0 = r2.requireContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165525(0x7f070155, float:1.794527E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            int r8 = r8 - r0
            r4 = 0
            int r1 = java.lang.Math.max(r8, r4)
            r7.A00 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r7.A04
            if (r11 == 0) goto L95
            if (r0 == 0) goto Lab
            int r2 = r0.getPaddingBottom()
            androidx.recyclerview.widget.RecyclerView r0 = r7.A04
            if (r0 == 0) goto Lab
            X.5le r0 = X.AbstractC125325le.A01(r0, r4)
            r0.A0G()
            X.5le r1 = r0.A0F(r5)
            X.Lw3 r0 = new X.Lw3
            r0.<init>(r7, r2)
            r1.A06 = r0
            r1.A0H()
        L75:
            int r0 = r7.A00
            r3.A00 = r0
            X.C7XA.A01(r3)
        L7c:
            android.view.ViewGroup r0 = r7.A03
            if (r0 == 0) goto L94
            com.instagram.common.session.UserSession r3 = r7.A0d
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36321237047387379(0x8109f9000324f3, double:3.0330347904256594E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L94
            int r0 = -r9
            float r0 = (float) r0
            r7.A0E(r11, r0)
        L94:
            return
        L95:
            if (r0 == 0) goto Lab
            X.AbstractC13880nE.A0Y(r0, r1)
            goto L75
        L9b:
            android.view.View r0 = r3.A01
            goto L19
        L9f:
            X.2oe r0 = r7.A0U
            android.os.Bundle r1 = r0.requireArguments()
            java.lang.String r0 = "DirectThreadFragment.ARGUMENT_COMPOSER_HEIGHT"
            r1.putInt(r0, r8)
            goto L7c
        Lab:
            X.C14360o3.A0F(r6)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W4.A0S(int, int, int, boolean):void");
    }

    public final void A0T(int i, int i2, Intent intent) {
        C3DN A01;
        if (i == 107) {
            if (i2 == 108) {
                FragmentActivity requireActivity = this.A0U.requireActivity();
                if (requireActivity instanceof InterfaceC53722dB) {
                    requireActivity.onBackPressed();
                } else {
                    requireActivity.finish();
                }
            }
        } else {
            int i3 = -1;
            if (i != 101) {
                if (i == 102) {
                    if (i2 != -1 || (A01 = C3DN.A00.A01(this.A0U.requireContext())) == null) {
                        return;
                    }
                    A01.A0B();
                    return;
                }
            } else {
                if (i2 != -1) {
                    return;
                }
                C7X1 c7x1 = this.A0j.A0I;
                c7x1.A00();
                if (C18U.A06(C06090Tz.A05, this.A0d, 36325506244883586L)) {
                    i3 = 0;
                }
                c7x1.A01(null, i3);
                return;
            }
        }
        InterfaceC69973Cg interfaceC69973Cg = this.A0j.A0E.A00;
        if (interfaceC69973Cg != null) {
            interfaceC69973Cg.onActivityResult(i, i2, intent);
        } else {
            C14360o3.A0F("captureFlowHelper");
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (X.C7DD.A01(r3, r6) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0U() {
        /*
            r9 = this;
            X.7U0 r0 = r9.A08
            java.lang.String r8 = "clientInfra"
            if (r0 == 0) goto L58
            X.7Ux r0 = r0.C7r()
            boolean r0 = r0.CeQ()
            r7 = 1
            if (r0 == 0) goto L4d
            X.7XQ r0 = r9.A0i
            X.0do r0 = r0.A0i
            java.lang.Object r0 = r0.getValue()
            X.7Xm r0 = (X.C164477Xm) r0
            X.98q r0 = r0.A0D
            long r4 = r0.A00
            X.7U0 r0 = r9.A08
            if (r0 == 0) goto L58
            X.2EE r6 = r0.Aq4()
            if (r6 == 0) goto L50
            com.instagram.common.session.UserSession r3 = r9.A0d
            r0 = 2
            X.C14360o3.A0B(r3, r0)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L3c
            boolean r0 = X.C7DD.A01(r3, r6)
            r1 = 1
            if (r0 != 0) goto L3d
        L3c:
            r1 = 0
        L3d:
            X.7U0 r0 = r9.A08
            if (r0 == 0) goto L58
            X.7Ux r0 = r0.C7r()
            boolean r0 = r0.Eje()
            if (r0 != 0) goto L4e
            if (r1 == 0) goto L4e
        L4d:
            return r7
        L4e:
            r7 = 0
            return r7
        L50:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L58:
            X.C14360o3.A0F(r8)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W4.A0U():boolean");
    }

    @Override // X.C7W6
    public final void ARo(boolean z) {
        MessageListLayoutManager messageListLayoutManager = this.A0B;
        if (messageListLayoutManager != null) {
            messageListLayoutManager.A00 = z;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (r0.CS0(r5) == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        r1 = "yes";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        r6.put("ig_creator_ai_enabled", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0102, code lost:
    
        if (X.C08730cb.A00(r8).A00().CS0(r5) != false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC75483aF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map B3w() {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W4.B3w():java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r3 != 62) goto L22;
     */
    @Override // X.InterfaceC11480j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11520jB E6b() {
        /*
            r8 = this;
            X.0jB r2 = new X.0jB
            r2.<init>()
            X.7U0 r0 = r8.A08
            if (r0 != 0) goto L13
            java.lang.String r0 = "clientInfra"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L13:
            X.7Ux r7 = r0.C7r()
            boolean r0 = r7.CVY()
            r4 = 1
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "canonical"
            java.util.Map r3 = r2.A00
            r3.put(r0, r1)
            X.4Ds r0 = r8.A0v
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "transport_type"
            r2.A0A(r0, r1)
            X.3o9 r1 = A03(r8)
            boolean r0 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L47
            com.instagram.model.direct.threadkey.impl.MsysThreadId r1 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r1
            long r5 = r1.A00
            java.lang.String r1 = "chat_device_seq_no"
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r3.put(r1, r0)
        L47:
            com.instagram.model.direct.DirectThreadKey r5 = r8.A0M()
            boolean r0 = r7.CVY()
            if (r0 == 0) goto L6f
            if (r5 == 0) goto L6f
            X.7TT r0 = r7.C7W()
            int r3 = r0.A08
            r0 = 28
            java.lang.String r1 = "thread_id"
            if (r3 == r0) goto L93
            r0 = 29
            if (r3 == r0) goto L70
            r0 = 32
            if (r3 == r0) goto L9b
            r0 = 61
            if (r3 == r0) goto L93
            r0 = 62
            if (r3 == r0) goto L9b
        L6f:
            return r2
        L70:
            java.lang.String r0 = r5.A00
            r2.A0A(r1, r0)
            r0 = 1105(0x451, float:1.548E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r2.A09(r0, r4)
            X.7TT r0 = r7.C7W()
            boolean r1 = r0.A0n
            java.lang.String r0 = "add_to_inbox"
            r2.A09(r0, r1)
            int r1 = r7.AdZ()
            java.lang.String r0 = "audience_type"
            r2.A09(r0, r1)
            return r2
        L93:
            java.lang.String r0 = r5.A00
            r2.A0A(r1, r0)
            java.lang.String r0 = "is_csc_chat"
            goto La2
        L9b:
            java.lang.String r0 = r5.A00
            r2.A0A(r1, r0)
            java.lang.String r0 = "is_discoverable_chat"
        La2:
            r2.A09(r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W4.E6b():X.0jB");
    }

    @Override // X.InterfaceC2056198l
    public final boolean EiU(String str) {
        C7U0 c7u0 = this.A08;
        if (c7u0 == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        if (!str.equals(c7u0.C7r().C7I()) && !str.equals(this.A0F)) {
            return true;
        }
        return false;
    }

    @Override // X.C7W7
    public final void E3l(boolean z) {
        this.A0Q = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0485, code lost:
    
        if (X.C2E8.A06(r1.A06) == false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.7WF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7W4(X.C2d4 r123, final X.AbstractC59962oe r124, X.C3I9 r125, X.C7W2 r126, X.C7W3 r127, X.C164057Vu r128, X.C163947Vi r129, X.C163907Ve r130, X.C163867Va r131, X.C164047Vt r132, X.AnonymousClass983 r133, X.AnonymousClass983 r134, X.AnonymousClass983 r135, X.AnonymousClass982 r136, X.C164087Vx r137, X.C7VS r138, X.C7VU r139, X.C98K r140, X.InterfaceC163937Vh r141, X.AnonymousClass988 r142, X.C98N r143, X.C7VF r144, X.C2055097z r145, X.InterfaceC60442pS r146, X.InterfaceC1119353f r147, java.lang.String r148, boolean r149) {
        /*
            Method dump skipped, instructions count: 1389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W4.<init>(X.2d4, X.2oe, X.3I9, X.7W2, X.7W3, X.7Vu, X.7Vi, X.7Ve, X.7Va, X.7Vt, X.983, X.983, X.983, X.982, X.7Vx, X.7VS, X.7VU, X.98K, X.7Vh, X.988, X.98N, X.7VF, X.97z, X.2pS, X.53f, java.lang.String, boolean):void");
    }
}
