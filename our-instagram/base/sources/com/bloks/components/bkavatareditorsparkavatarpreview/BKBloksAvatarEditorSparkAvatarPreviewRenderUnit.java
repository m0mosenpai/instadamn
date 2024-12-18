package com.bloks.components.bkavatareditorsparkavatarpreview;

import X.AbstractC12990ll;
import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.AbstractC43592JPx;
import X.AbstractC54324Nzi;
import X.AbstractC56402iY;
import X.AbstractC65806TuP;
import X.AnonymousClass634;
import X.C006802i;
import X.C00O;
import X.C06090Tz;
import X.C102884kP;
import X.C12M;
import X.C12T;
import X.C14360o3;
import X.C18U;
import X.C19L;
import X.C50526MSf;
import X.C50806McN;
import X.C54753OHi;
import X.C54772OIl;
import X.C55127Obo;
import X.C55655Ong;
import X.C57312k6;
import X.C66224U4u;
import X.C6BQ;
import X.C6FG;
import X.EnumC60772q1;
import X.InterfaceC58017Po2;
import X.InterfaceC58098PpN;
import X.MSX;
import X.MSZ;
import X.O1H;
import X.O1N;
import X.O6S;
import X.O6T;
import X.O6U;
import X.O9X;
import X.OBR;
import X.OL0;
import X.OMg;
import X.OMs;
import X.OQy;
import X.PPO;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.commonavatarliveediting.CdlProviderImpl;
import com.facebook.commonavatarliveediting.CommonSparkAvatarPreviewController;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class BKBloksAvatarEditorSparkAvatarPreviewRenderUnit extends AbstractC65806TuP {
    public boolean A00;
    public final C54753OHi A01;
    public final C54753OHi A02;
    public final O1H A03;
    public final O1H A04;
    public final O1N A05;
    public final C54772OIl A06;
    public final C50526MSf A07;
    public final QuickPerformanceLogger A08;
    public final C6FG A09;
    public final C6FG A0A;
    public final C102884kP A0B;
    public final C102884kP A0C;
    public final UserSession A0D;
    public final C12T A0E;
    public final C19L A0F;
    public final C19L A0G;

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        Activity A00;
        C14360o3.A0B(context, 0);
        if (this.A0B.A0S(52, false) && (A00 = C66224U4u.A00(context)) != null) {
            Window window = A00.getWindow();
            C14360o3.A07(window);
            AbstractC56402iY.A08(window, true);
            AbstractC56402iY.A02(A00, MSX.A02(A00));
        }
        return new C50806McN(context, -((int) AbstractC13880nE.A00(context, 1.0f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    @Override // X.AbstractC65806TuP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r25, X.C6FG r26, X.C102884kP r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit.A0K(android.view.View, X.6FG, X.4kP, java.lang.Object):java.lang.Object");
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0L(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        FrameLayout frameLayout = (FrameLayout) view;
        AbstractC167027dH.A12(frameLayout, c6fg, c102884kP);
        if (C18U.A06(C06090Tz.A05, this.A04.A00, 2342160655669597635L)) {
            new Handler(c6fg.A00.getMainLooper()).postDelayed(new PPO(frameLayout, this), 500L);
        } else {
            A0P(frameLayout);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, X.NnY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0O(android.widget.FrameLayout r22, X.C51641MrY r23, X.C51653Mrk r24, X.OMg r25, X.InterfaceC23621Ds r26) {
        /*
            r21 = this;
            r3 = 16
            r4 = r26
            boolean r0 = X.MAQ.A02(r4, r3)
            r9 = r21
            if (r0 == 0) goto Lab
            r5 = r4
            X.MAQ r5 = (X.MAQ) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lab
            int r2 = r2 - r1
            r5.A00 = r2
        L1a:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r7 = 1
            if (r1 == 0) goto L31
            if (r1 != r7) goto Lb4
            X.AbstractC09560e7.A00(r0)
        L28:
            boolean r0 = X.AbstractC166987dD.A1a(r0)
        L2c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L31:
            X.AbstractC09560e7.A00(r0)
            X.6FG r1 = r9.A09
            androidx.fragment.app.Fragment r0 = X.C6BQ.A00(r1)
            X.07X r8 = r0.getViewLifecycleOwner()
            X.4kP r3 = r9.A0B
            java.lang.Object r6 = X.AnonymousClass634.A06(r1, r3)
            X.O6S r6 = (X.O6S) r6
            if (r6 == 0) goto La9
            com.instagram.common.session.UserSession r2 = r9.A0D
            android.content.Context r10 = r1.A00
            X.19L r1 = r9.A0F
            X.OHi r12 = r9.A02
            r0 = 55
            boolean r20 = r3.A0S(r0, r7)
            r5.A00 = r7
            X.O1H r13 = new X.O1H
            r13.<init>(r2)
            X.AbstractC167017dG.A1O(r2, r1)
            com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider r7 = new com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider
            r7.<init>(r8, r13, r2, r1)
            r8 = r24
            java.lang.Double r0 = r8.A06
            if (r0 == 0) goto L9b
            double r0 = r0.doubleValue()
        L6f:
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r2
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            X.NnY r9 = new X.NnY
            r9.<init>()
            r9.A01 = r2
            r9.A00 = r0
            X.MoV r14 = new X.MoV
            r14.<init>(r13, r9, r8)
            com.facebook.commonavatarliveediting.CommonSparkAvatarPreviewController r9 = r6.A00
            r11 = r22
            r15 = r23
            r17 = r25
            r18 = r7
            r19 = r5
            r16 = r8
            java.lang.Object r0 = r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r0 != r4) goto L28
            return r4
        L9b:
            com.instagram.common.session.UserSession r3 = r13.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 37162071384981723(0x8406b5000500db, double:3.564781811288439E-306)
            double r0 = X.C18U.A00(r2, r3, r0)
            goto L6f
        La9:
            r0 = 0
            goto L2c
        Lab:
            r0 = 42
            X.MAQ r5 = new X.MAQ
            r5.<init>(r9, r4, r3, r0)
            goto L1a
        Lb4:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit.A0O(android.widget.FrameLayout, X.MrY, X.Mrk, X.OMg, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.O6U, java.lang.Object] */
    public final void A0P(FrameLayout frameLayout) {
        Activity A00;
        String str;
        C6FG c6fg = this.A09;
        C102884kP c102884kP = this.A0B;
        O6S o6s = (O6S) AnonymousClass634.A06(c6fg, c102884kP);
        if (o6s != null) {
            CommonSparkAvatarPreviewController commonSparkAvatarPreviewController = o6s.A00;
            O6T o6t = O6T.A01;
            if (o6t == null) {
                o6t = new O6T();
                O6T.A01 = o6t;
            }
            o6t.A00.remove(commonSparkAvatarPreviewController);
            FoaLiveEditingProvider foaLiveEditingProvider = commonSparkAvatarPreviewController.A00;
            if (foaLiveEditingProvider != null) {
                synchronized (foaLiveEditingProvider) {
                    InterfaceC58017Po2 interfaceC58017Po2 = foaLiveEditingProvider.A01;
                    if (interfaceC58017Po2 != null) {
                        CdlProviderImpl cdlProviderImpl = (CdlProviderImpl) interfaceC58017Po2;
                        synchronized (cdlProviderImpl) {
                            try {
                                synchronized (cdlProviderImpl) {
                                    try {
                                        Iterator A14 = AbstractC166997dE.A14(cdlProviderImpl.A05);
                                        while (A14.hasNext()) {
                                            Object A0m = MSZ.A0m(A14);
                                            C14360o3.A07(A0m);
                                            CdlProviderImpl.A03(cdlProviderImpl, (String) A0m);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        OBR obr = cdlProviderImpl.A00;
                        if (obr != null) {
                            O9X o9x = obr.A01.A00;
                            if (o9x == null) {
                                str = "flipperPluginBridge";
                            } else {
                                C55655Ong c55655Ong = o9x.A00;
                                str = "avatarDebuggerFlipperPlugin";
                                if (c55655Ong != null) {
                                    String str2 = o9x.A01;
                                    c55655Ong.A00.remove(str2);
                                    C55655Ong c55655Ong2 = o9x.A00;
                                    if (c55655Ong2 != null) {
                                        c55655Ong2.A00(str2, "destroy", null);
                                    }
                                }
                            }
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                    }
                    foaLiveEditingProvider.A01 = null;
                    C55127Obo c55127Obo = foaLiveEditingProvider.A02;
                    if (c55127Obo == null) {
                        C14360o3.A0F("commonLiveEditingProvider");
                        throw C00O.createAndThrow();
                    }
                    synchronized (c55127Obo) {
                        OQy.A00.remove(c55127Obo);
                        c55127Obo.A02 = null;
                        OMg oMg = c55127Obo.A05;
                        if (oMg != null) {
                            oMg.A05((short) 3);
                        }
                        c55127Obo.A05 = null;
                        OL0 ol0 = c55127Obo.A03;
                        if (ol0 == null) {
                            C14360o3.A0F("fallbackLogic");
                        } else {
                            ol0.A00();
                            OMs oMs = c55127Obo.A0B;
                            oMs.A0E.remove(c55127Obo);
                            oMs.A02();
                            QuickPerformanceLogger quickPerformanceLogger = AbstractC54324Nzi.A00;
                            if (quickPerformanceLogger == null) {
                                C14360o3.A0F("quickPerformanceLogger");
                            } else {
                                quickPerformanceLogger.dropAllInstancesOfMarker(231933222);
                                O6U o6u = O6U.A01;
                                O6U o6u2 = o6u;
                                if (o6u == null) {
                                    ?? obj = new Object();
                                    O6U.A01 = obj;
                                    o6u2 = obj;
                                }
                                o6u2.A00 = null;
                            }
                        }
                        throw C00O.createAndThrow();
                    }
                    InterfaceC58098PpN interfaceC58098PpN = foaLiveEditingProvider.A00;
                    if (interfaceC58098PpN != null) {
                        interfaceC58098PpN.AP3();
                    }
                }
            }
            commonSparkAvatarPreviewController.A00 = null;
        }
        frameLayout.removeAllViews();
        Context context = c6fg.A00;
        if (c102884kP.A0S(52, false) && (A00 = C66224U4u.A00(context)) != null) {
            AbstractC56402iY.A05(A00, EnumC60772q1.A02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BKBloksAvatarEditorSparkAvatarPreviewRenderUnit(C54753OHi c54753OHi, C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
        AbstractC12990ll A0A = C6BQ.A0A(c6fg);
        AbstractC31171DnF.A1Q(A0A);
        UserSession userSession = (UserSession) A0A;
        O1H o1h = new O1H(userSession);
        C57312k6 A0S = AbstractC25235BEs.A0S(C6BQ.A00(c6fg));
        C14360o3.A0B(userSession, 4);
        C12T c12t = new C12M().A04;
        C006802i A0N = AbstractC43592JPx.A0N();
        C54772OIl c54772OIl = C54772OIl.A03;
        if (c54772OIl == null) {
            c54772OIl = new C54772OIl();
            C54772OIl.A03 = c54772OIl;
        }
        C50526MSf c50526MSf = new C50526MSf(2, 1, true);
        C14360o3.A0B(c54772OIl, 8);
        this.A0C = c102884kP;
        this.A0A = c6fg;
        this.A01 = c54753OHi;
        this.A04 = o1h;
        this.A0G = A0S;
        this.A0E = c12t;
        this.A08 = A0N;
        this.A06 = c54772OIl;
        this.A07 = c50526MSf;
        this.A05 = new O1N(o1h);
        this.A0B = c102884kP;
        this.A09 = c6fg;
        this.A02 = c54753OHi;
        this.A0D = userSession;
        this.A03 = o1h;
        this.A0F = A0S;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }
}
