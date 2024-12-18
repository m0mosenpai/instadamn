package com.instagram.camera.effect.mq;

import X.A5R;
import X.AbstractC149806oZ;
import X.AnonymousClass818;
import X.AnonymousClass830;
import X.AnonymousClass904;
import X.C0eB;
import X.C14120nc;
import X.C142626cO;
import X.C1810981l;
import X.C1813282k;
import X.C1813582n;
import X.C1814883b;
import X.C1814983c;
import X.C203678zW;
import X.C2039190d;
import X.C83P;
import X.C83R;
import X.C83T;
import X.C83V;
import X.C83W;
import X.C83Y;
import X.InterfaceC14020nS;
import X.InterfaceC149836oc;
import X.InterfaceC149876og;
import X.InterfaceC150356pk;
import X.InterfaceC150406pp;
import X.InterfaceC150426pr;
import X.InterfaceC150446pt;
import X.InterfaceC150466pv;
import X.InterfaceC174767qC;
import X.InterfaceC174857qL;
import X.InterfaceC1813482m;
import X.InterfaceC189918bA;
import X.QFG;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public class IgCameraEffectsController extends C83P {
    public C203678zW A00;
    public InterfaceC189918bA A01;
    public InterfaceC149876og A02;
    public InterfaceC150446pt A03;
    public InterfaceC150426pr A04;
    public InterfaceC150466pv A05;
    public InterfaceC150406pp A06;
    public AnonymousClass818 A07;
    public InterfaceC174767qC A08;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public QFG A0E;
    public final Context A0F;
    public final C1814883b A0G;
    public final C83Y A0H;
    public final InterfaceC150356pk A0I;
    public final C83T A0J;
    public final C1813282k A0K;
    public final InterfaceC149836oc A0L;
    public final C1814983c A0M;
    public final UserSession A0N;
    public final InterfaceC14020nS A0O;
    public final C83W A0U;
    public final AnonymousClass830 A0W;
    public final C1810981l A0X;
    public final C1813582n A0Y;
    public final SortedMap A0T = Collections.synchronizedSortedMap(new TreeMap());
    public CameraAREffect A09 = null;
    public final Set A0Q = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final Set A0P = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final Set A0R = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final Set A0S = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final C83R A0V = new C83R() { // from class: X.83Q
        @Override // X.C83R
        public final void DFb(int i) {
            Iterator it = IgCameraEffectsController.this.A0S.iterator();
            while (it.hasNext()) {
                ((C83R) it.next()).DFb(i);
            }
        }
    };

    private CameraAREffect A00() {
        C142626cO B0c;
        InterfaceC149836oc interfaceC149836oc = this.A0L;
        if (interfaceC149836oc != null) {
            CameraAREffect cameraAREffect = this.A09;
            if (cameraAREffect != null && ((B0c = interfaceC149836oc.B0c()) == null || !C142626cO.A00(cameraAREffect, B0c))) {
                this.A0W.AVo(cameraAREffect.A0K, "effect_not_available", null);
            } else {
                return cameraAREffect;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0129, code lost:
    
        if (r2.CUA(r9) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0133, code lost:
    
        if (r7.A0J() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
    
        r26 = r2.Adz();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0139, code lost:
    
        r12 = r7.A0K;
        r8 = r37.A04;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013f, code lost:
    
        if (r8 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0141, code lost:
    
        r8 = new java.lang.Object();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0146, code lost:
    
        r5 = r37.A03;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0148, code lost:
    
        if (r5 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014a, code lost:
    
        r5 = new java.lang.Object();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
    
        r1 = r37.A05;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0151, code lost:
    
        if (r1 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0153, code lost:
    
        r1 = new java.lang.Object();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0158, code lost:
    
        r0 = r37.A06;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015a, code lost:
    
        if (r0 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015c, code lost:
    
        r0 = new java.lang.Object();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0161, code lost:
    
        r25 = new X.C8zr(r5, r8, r1, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0170, code lost:
    
        r5 = r3.AMy(r13, r16, r37.A0G, r37.A0M, null, r36, r10, r14, r0, r15, r25, r26, r37, r7, r6, r30, r30, r0, r9, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0192, code lost:
    
        if (r5 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0194, code lost:
    
        if (r7 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0196, code lost:
    
        r37.A0W.Cn3(r7.A0K, r37.A0D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019f, code lost:
    
        r2.ENM(r5);
        r1 = X.C05F.A01;
        r0 = new java.lang.Object();
        r0.A00 = r1;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ab, code lost:
    
        r2.ENM(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ae, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01af, code lost:
    
        r0 = r3.ANP(r37.A0B);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b5, code lost:
    
        if (r0 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b8, code lost:
    
        r26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ba, code lost:
    
        if (r7 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bc, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x012d, code lost:
    
        if (r7 != null) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.7vF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.EnumC150616qF r36, com.instagram.camera.effect.mq.IgCameraEffectsController r37, java.lang.String r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.IgCameraEffectsController.A01(X.6qF, com.instagram.camera.effect.mq.IgCameraEffectsController, java.lang.String, boolean, boolean):void");
    }

    public static void A02(IgCameraEffectsController igCameraEffectsController) {
        InterfaceC174857qL interfaceC174857qL = igCameraEffectsController.A0K.A04;
        if (interfaceC174857qL != null) {
            interfaceC174857qL.Ehh(new ArrayList(igCameraEffectsController.A0T.values()));
        }
    }

    @Override // X.C83P
    public final void A08(EffectAttribution effectAttribution, EffectManifest effectManifest, EffectServiceHost effectServiceHost, String str) {
        C2039190d c2039190d;
        LocationDataProvider locationDataProvider;
        AnonymousClass904 anonymousClass904 = effectServiceHost.mServicesHostConfiguration;
        if (anonymousClass904 != null && (c2039190d = anonymousClass904.A03) != null && (locationDataProvider = c2039190d.A00) != null) {
            QFG qfg = new QFG(this.A0F, this.A0N);
            this.A0E = qfg;
            locationDataProvider.setDataSource(qfg);
        }
    }

    @Override // X.C83P
    public final void A09(String str) {
        QFG qfg = this.A0E;
        if (qfg != null) {
            qfg.A01();
            this.A0E = null;
        }
    }

    @Override // X.C83P
    public final void A0A(String str, Throwable th) {
        for (A5R a5r : this.A0P) {
            if (a5r != null) {
                a5r.A00.A0J.A0A(C0eB.A00);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.83T] */
    public IgCameraEffectsController(Context context, AnonymousClass830 anonymousClass830, C1813282k c1813282k, InterfaceC149836oc interfaceC149836oc, UserSession userSession, C1810981l c1810981l, C1813582n c1813582n, String str) {
        this.A0F = context.getApplicationContext();
        this.A0N = userSession;
        this.A0K = c1813282k;
        this.A0W = anonymousClass830;
        this.A0X = c1810981l;
        this.A0Y = c1813582n;
        c1813282k.A07.A00 = new InterfaceC1813482m() { // from class: X.83S
            @Override // X.InterfaceC1813482m
            public final void onPaused() {
                IgCameraEffectsController igCameraEffectsController = IgCameraEffectsController.this;
                igCameraEffectsController.A07 = null;
                igCameraEffectsController.A0T.clear();
            }

            @Override // X.InterfaceC1813482m
            public final void onResumed() {
                IgCameraEffectsController igCameraEffectsController = IgCameraEffectsController.this;
                igCameraEffectsController.A0D = true;
                IgCameraEffectsController.A01(EnumC150616qF.SYSTEM, igCameraEffectsController, "newMediaPipelineControllerListener onResumed()", false, true);
            }
        };
        this.A0J = new Object();
        this.A0U = new C83V(userSession);
        this.A0H = new C83Y();
        this.A0I = AbstractC149806oZ.A00(userSession);
        this.A0L = interfaceC149836oc;
        this.A0B = str;
        C1814883b c1814883b = new C1814883b();
        this.A0G = c1814883b;
        this.A0M = new C1814983c(c1814883b, userSession);
        this.A0O = C14120nc.A00();
    }
}
