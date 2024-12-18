package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl;
import com.instagram.location.impl.LocationPluginImpl;
import com.instagram.react.impl.IgReactPluginImpl;
import com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl;

/* renamed from: X.142, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass142 extends AbstractC211911v {
    public final Context A00;
    public final C211211o A01;

    public AnonymousClass142(Context context, C211211o c211211o) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = c211211o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.1Vc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.1Vn] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.1Vo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.1Vq] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.1XF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.1XH, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.1Xa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.1Xb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.1Xq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.1Xr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, X.1Y5] */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.1Y6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.1Y8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.1Y9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, X.1YA] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.1YB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1V3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.1YR, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.1YS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.1Yl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, X.1Yo] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.1V4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [X.1Yr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [X.1Ys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, X.1Yt] */
    /* JADX WARN: Type inference failed for: r0v53, types: [X.1Yv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, X.1Z0] */
    /* JADX WARN: Type inference failed for: r0v57, types: [X.1Z3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [X.1ZD, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, X.1ZF] */
    /* JADX WARN: Type inference failed for: r0v64, types: [X.1ZG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [X.1ZL] */
    /* JADX WARN: Type inference failed for: r0v67, types: [X.1ZN] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, X.1ZP] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, X.1ZQ] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, X.1ZR] */
    /* JADX WARN: Type inference failed for: r0v71, types: [X.1ZZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, X.1Zb] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.1VN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.1VQ] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.1Vt, java.lang.Object] */
    public static final void A02(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        AbstractC27461Uz.A00 = (Application) context;
        C1V1.A00 = new C1V0();
        C1V3.A00 = new Object();
        C1V4.A00 = new Object();
        C1V8.A02 = new C1V8();
        C1VE.A02 = new C1VE(context);
        C1VL.A00 = new C1VJ();
        C1VN.A00 = new Object();
        C1VW.A00 = new LocationPluginImpl(context, new Object());
        C27491Vc.A00 = new Object();
        C27501Vd.A04 = new C27501Vd();
        C27601Vn.A00 = new Object();
        C27611Vo.A00 = new Object();
        C27631Vq.A00 = new Object();
        String str = AbstractC14490oL.A02;
        if (!"com.facebook.wearable.apps.igdirect".equals(context.getPackageName())) {
            AbstractC27671Vv.A00 = new C27661Vu(context, new Object());
        }
        C1XD.A02 = new C1XD();
        C1XF.A00 = new Object();
        C1XH.A00 = new Object();
        C1XJ.A00 = new C1XI();
        C1XO.A01 = new C1XO();
        C1XS.A00 = new C1XR(context);
        C1XZ.A00 = new C1XY();
        C27961Xa.A00 = new Object();
        C27971Xb.A00 = new Object();
        AbstractC27991Xd.A00 = new C27981Xc(context);
        C28121Xq.A00 = new Object();
        C28131Xr.A00 = new Object();
        C28151Xt.A02 = new C28151Xt();
        AbstractC28201Xy.A00 = new C28191Xx();
        C1Y5.A00 = new Object();
        C1Y6.A01 = new Object();
        C1Y8.A00 = new Object();
        C1Y9.A00 = new Object();
        C1YA.A01 = new Object();
        C1YB.A02 = new Object();
        RespectfulNudgePluginImpl.A02 = new RespectfulNudgePluginImpl(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
        C1YJ.A01 = new C1YJ();
        C1YQ.A00 = new C1YO(userSession);
        C1YR.A00 = new Object();
        C1YS.A00 = new Object();
        C1YT.A01 = new C1YT();
        C1YY.A01 = new C1YY();
        C28221Yb.A03 = new C28221Yb();
        C28261Yl.A00 = new Object();
        C28271Yo.A00 = new Object();
        C28281Yp.A01 = new C28281Yp();
        C28301Yr.A01 = new Object();
        C28311Ys.A00 = new Object();
        C28321Yt.A01 = new Object();
        C28341Yv.A00 = new Object();
        C28361Yx.A02 = new C28361Yx();
        C1Z0.A01 = new Object();
        C1Z1.A01 = new C1Z1();
        C1Z3.A00 = new Object();
        C1Z6.A00 = C1Z4.A00;
        C1Z8.A04 = new C1Z8();
        C1Z9.A03 = new C1Z9();
        C1ZB.A01 = new C1ZB();
        C1ZD.A01 = new Object();
        C1ZF.A00 = new Object();
        C1ZG.A01 = new Object();
        C1ZK.A00 = new C1ZH();
        C1ZM.A00 = new Object() { // from class: X.1ZL
        };
        C1ZO.A00 = new Object() { // from class: X.1ZN
        };
        C1ZP.A01 = new Object();
        C1ZQ.A00 = new Object();
        C1ZR.A00 = new Object();
        if (userSession != null) {
            C1ZS c1zs = C1ZS.A01;
            Context applicationContext = context.getApplicationContext();
            C14360o3.A07(applicationContext);
            if (c1zs.A00(applicationContext, userSession) != null) {
                Object A01 = userSession.A01(C56140Ow0.class, new C50171MDy(6, context, userSession));
                if (AbstractC27671Vv.A00 != null) {
                    ((C27661Vu) C3ER.A00()).A06.put(A01, null);
                }
            }
            Context applicationContext2 = context.getApplicationContext();
            C14360o3.A07(applicationContext2);
            if (c1zs.A00(applicationContext2, userSession) != null) {
                C48510Ld2 c48510Ld2 = (C48510Ld2) userSession.A01(C48510Ld2.class, new C50171MDy(5, context, userSession));
                AbstractC25651Mw.A00(c48510Ld2.A02).A01(c48510Ld2.A01, C2Io.class);
            }
        }
        C1ZZ.A00 = new Object();
        C28411Zc.A00 = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Zn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1Zm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Zl, java.lang.Object] */
    public static final void A00(Context context) {
        C28531Zo.A04 = new C28531Zo(context, new Object(), new Object(), AbstractC16960so.A1N(new Object()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Ur, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.1o1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.1o2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.1o3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, X.1oD] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, X.1oF] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, X.1oG] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.1oX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.1oY, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, X.1oZ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1Zf] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.1ny] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.1nz] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.1o0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.1oP, java.lang.Object] */
    public static final void A01(Context context, AnonymousClass142 anonymousClass142, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C27391Ur.A00 = new Object();
        C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Application");
        AbstractC27401Ut.A00 = new IgReactPluginImpl((Application) context);
        interfaceC16820sZ.invoke();
        C28421Zd.A03 = new C28421Zd(context);
        C28441Zf.A00 = new Object();
        AbstractC28481Zj.A00 = new C28471Zi(C28461Zh.A00, C28451Zg.A00);
        interfaceC16820sZ2.invoke();
        C36971nu.A04 = new C36971nu(context);
        C37001nx.A02 = new C37001nx(context);
        C37011ny.A00 = new Object();
        C37021nz.A01 = new Object();
        C1RQ.A03 = new C1RQ(context);
        ?? obj = new Object();
        ?? obj2 = new Object();
        obj2.A00 = obj;
        C1o1.A01 = obj2;
        C37041o2.A00 = new Object();
        C37051o3.A00 = new Object();
        C37091o7.A00 = new C37061o4(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
        C37101o8.A06 = new C37101o8();
        AbstractC37131oB.A00 = new C37121oA();
        UserSession A01 = AbstractC03270Dk.A01(((AnonymousClass122) anonymousClass142.A01.A00()).A08());
        if (A01 != null) {
            C18U.A06(C06090Tz.A05, A01, 36315640704863696L);
        }
        C37161oE.A00 = new Object();
        C37171oF.A00 = new Object();
        C37181oG.A00 = new Object();
        try {
            Object newInstance = Class.forName("com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl").newInstance();
            C14360o3.A0C(newInstance, "null cannot be cast to non-null type com.instagram.direct.disappearingmode.intf.DisappearingModePlugin");
            DisappearingModePluginImpl disappearingModePluginImpl = (DisappearingModePluginImpl) newInstance;
            C14360o3.A0B(disappearingModePluginImpl, 0);
            DisappearingModePluginImpl.A01 = disappearingModePluginImpl;
        } catch (Exception unused) {
        }
        C37211oK.A03 = new C37211oK();
        ?? obj3 = new Object();
        C25981Of c25981Of = new C25981Of(C37271oQ.A02, C37291oS.A02, new C0t0(new C25961Od("toggle_creator_agent_replies")), "toggle_creator_agent_replies");
        c25981Of.A04 = C37311oU.A00;
        C26141Ov.A02(new C25991Og(c25981Of));
        C37321oV.A00 = obj3;
        AbstractC37341oX.A00 = new Object();
        C37351oY.A03 = new Object();
        C37361oZ.A00 = new Object();
        C37371oa.A01 = new C37371oa();
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "PluginInitializer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (java.lang.Boolean.valueOf(r2) == null) goto L6;
     */
    @Override // X.AbstractC211911v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07() {
        /*
            r10 = this;
            android.content.Context r4 = r10.A00
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.11o r6 = r10.A01
            X.11v r0 = r6.A00()
            X.122 r0 = (X.AnonymousClass122) r0
            X.0ll r7 = r0.A08()
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession
            r5 = 0
            r3 = r5
            if (r0 == 0) goto L2a
            r3 = r7
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316379439305015(0x81058e00021137, double:3.029962819514355E-306)
            boolean r2 = X.C18U.A06(r2, r7, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            if (r0 != 0) goto L2b
        L2a:
            r2 = 0
        L2b:
            r8 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L3b
            r1 = 198670656(0xbd77940, float:8.2997424E-32)
            java.lang.String r0 = "attachPluginImplementations"
            X.C0fO.A01(r0, r1)
        L3b:
            if (r2 == 0) goto Lb3
            X.11v r0 = r6.A00()     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            X.122 r0 = (X.AnonymousClass122) r0     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            X.0ll r7 = r0.A08()     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            if (r0 == 0) goto La4
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
        L4d:
            X.12L r2 = X.C12L.A00     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r1 = 971066868(0x39e14df4, float:4.2973424E-4)
            r0 = 1
            X.0nZ r0 = r2.AOT(r1, r0)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            X.19K r6 = X.AnonymousClass194.A02(r0)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r0 = 27
            X.DGl r3 = new X.DGl     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r3.<init>(r0, r4, r10)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r0 = 28
            X.DGl r2 = new X.DGl     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r2.<init>(r0, r4, r10)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r1 = 32
            X.Pbj r0 = new X.Pbj     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r0.<init>(r1, r4, r7, r10)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            X.0sZ[] r0 = new X.InterfaceC16820sZ[]{r3, r2, r0}     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            java.util.List r1 = X.AbstractC16960so.A1Q(r0)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r1, r0)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
        L87:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            if (r0 == 0) goto La6
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            X.0sZ r2 = (X.InterfaceC16820sZ) r2     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r0 = 49
            X.MW8 r1 = new X.MW8     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r1.<init>(r2, r5, r0)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            X.191 r0 = X.AnonymousClass191.A00     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            X.2Sa r0 = X.AbstractC23641Du.A02(r0, r1, r6)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r4.add(r0)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            goto L87
        La4:
            r7 = r5
            goto L4d
        La6:
            r0 = 22
            X.MCD r1 = new X.MCD     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r1.<init>(r4, r5, r0)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            X.191 r0 = X.AnonymousClass191.A00     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            X.C2ST.A00(r0, r1)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            goto Ldd
        Lb3:
            r0 = 11
            X.9FP r2 = new X.9FP     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r2.<init>(r0, r4, r10, r3)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r1 = 24
            X.9F8 r0 = new X.9F8     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            r0.<init>(r1, r4, r10)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            A01(r4, r10, r2, r0)     // Catch: java.lang.Throwable -> Lc5 java.lang.InterruptedException -> Ld3
            goto Ldd
        Lc5:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto Ld2
            r0 = 43820468(0x29ca5b4, float:2.3017249E-37)
            X.C0fO.A00(r0)
        Ld2:
            throw r1
        Ld3:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto Le9
            r0 = 1469587719(0x57982107, float:3.3453524E14)
            goto Le6
        Ldd:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto Le9
            r0 = -336158791(0xffffffffebf69fb9, float:-5.9630004E26)
        Le6:
            X.C0fO.A00(r0)
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass142.A07():void");
    }
}
