package X;

import android.content.Context;
import android.view.View;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.8ty, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200558ty extends C83P implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "PostCaptureARRenderControllerImpl";
    public int A00;
    public AnonymousClass818 A01;
    public AnonymousClass830 A02;
    public InterfaceC199698sL A03;
    public AAY A04;
    public java.util.Set A05;
    public final C1814883b A07;
    public final C200478tq A08;
    public final C83W A09;
    public final C83Y A0A;
    public final InterfaceC149836oc A0B;
    public final C1814983c A0C;
    public final InterfaceC199598sB A0D;
    public final UserSession A0E;
    public final Integer A0F;
    public final Context A0J;
    public final View A0K;
    public volatile CameraAREffect A0M;
    public final java.util.Set A0G = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final java.util.Set A0H = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final java.util.Set A0I = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public int A06 = 0;
    public final C83R A0L = new C83R() { // from class: X.8sC
        @Override // X.C83R
        public final void DFb(int i) {
            Iterator it = C200558ty.this.A0I.iterator();
            while (it.hasNext()) {
                ((C83R) it.next()).DFb(i);
            }
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        if (r3 != null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, X.PqH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(com.instagram.camera.effect.models.CameraAREffect r8) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200558ty.A00(com.instagram.camera.effect.models.CameraAREffect):void");
    }

    @Override // X.C83P
    public final void A08(EffectAttribution effectAttribution, EffectManifest effectManifest, EffectServiceHost effectServiceHost, String str) {
        C2039190d c2039190d;
        LocationDataProvider locationDataProvider;
        AnonymousClass904 anonymousClass904 = effectServiceHost.mServicesHostConfiguration;
        if (anonymousClass904 != null && (c2039190d = anonymousClass904.A03) != null && (locationDataProvider = c2039190d.A00) != null) {
            locationDataProvider.setDataSource(new QFG(this.A0J, this.A0E));
        }
        this.A0A.A00.clear();
    }

    @Override // X.C83P
    public final void A09(String str) {
        if (str != null) {
            this.A0B.EoY(str);
        }
    }

    public final void A0B() {
        InterfaceC199698sL interfaceC199698sL = this.A03;
        if (interfaceC199698sL != null) {
            interfaceC199698sL.EKd();
        }
        CameraAREffect cameraAREffect = this.A0M;
        if (cameraAREffect != null) {
            if (C18U.A06(C06090Tz.A05, this.A0E, 36315662181797349L)) {
                A00(cameraAREffect);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.83U, java.lang.Object] */
    public final void A0C(InterfaceC199678sJ interfaceC199678sJ, InterfaceC178897x1 interfaceC178897x1) {
        InterfaceC199698sL interfaceC199698sL = this.A03;
        if (interfaceC199698sL == null) {
            InterfaceC199598sB interfaceC199598sB = this.A0D;
            interfaceC199598sB.getClass();
            interfaceC199698sL = interfaceC199598sB.ALY(interfaceC199678sJ, interfaceC178897x1);
            this.A03 = interfaceC199698sL;
        }
        if (this.A01 == null) {
            Context context = this.A0J;
            UserSession userSession = this.A0E;
            ?? obj = new Object();
            C83R c83r = this.A0L;
            interfaceC199698sL.getClass();
            this.A01 = AbstractC201288vC.A00(context, obj, interfaceC199698sL.B9L(), c83r, AbstractC149806oZ.A00(userSession), userSession, AbstractC200588u1.A00(this.A0F));
        }
        InterfaceC199698sL interfaceC199698sL2 = this.A03;
        interfaceC199698sL2.getClass();
        interfaceC199698sL2.ETi(this.A0E, Collections.singletonList(new C200598u2(this.A01)));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        InterfaceC199698sL interfaceC199698sL = this.A03;
        if (interfaceC199698sL != null) {
            return interfaceC199698sL.getModuleName();
        }
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.8sD] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.8tq, java.lang.Object] */
    public C200558ty(Context context, View view, InterfaceC199598sB interfaceC199598sB, UserSession userSession, boolean z) {
        Integer num;
        this.A0J = context;
        this.A0E = userSession;
        Context applicationContext = context.getApplicationContext();
        EnumC142606cM enumC142606cM = EnumC142606cM.A01;
        C14360o3.A0B(applicationContext, 0);
        this.A0B = C149816oa.A00(applicationContext, enumC142606cM, AbstractC149806oZ.A00(userSession), null, userSession);
        this.A09 = new C83V(userSession);
        this.A0A = new C83Y();
        if (z) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        this.A0F = num;
        this.A0K = view;
        this.A0D = interfaceC199598sB;
        C1814883b c1814883b = new C1814883b();
        this.A07 = c1814883b;
        C1814983c c1814983c = new C1814983c(c1814883b, userSession);
        this.A0C = c1814983c;
        c1814983c.A00 = new Object() { // from class: X.8sD
        };
        this.A08 = new Object();
    }

    public final void A0D(CameraAREffect cameraAREffect) {
        A00(cameraAREffect);
        java.util.Set set = this.A05;
        if (set != null) {
            set.clear();
        }
    }
}
