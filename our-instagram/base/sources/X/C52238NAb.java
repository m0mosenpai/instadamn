package X;

import X.AbstractC25230BEn;
import X.AbstractC50523MSb;
import X.C00O;
import X.C14360o3;
import X.C23432Aa5;
import X.C52238NAb;
import X.C55013OVy;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bloks.components.bkcomponentsfoaavatareditorautogencameraview.BloksComponentFoaAvatarAutogenCameraViewRenderUnit$lifeCycleListener$1;
import com.facebook.avatar.autogen.download.IgModelDownloader;
import com.facebook.avatar.autogen.flow.AESelfieCaptureConfig;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.NAb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52238NAb extends AbstractC65806TuP {
    public C55013OVy A00;
    public final C54498O6a A01;
    public final BloksComponentFoaAvatarAutogenCameraViewRenderUnit$lifeCycleListener$1 A02;
    public final C56035Ou7 A03;
    public final C25671My A04;
    public final boolean A05;
    public final UserSession A06;

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new FrameLayout(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        Object A1D;
        Application application;
        FrameLayout frameLayout = (FrameLayout) view;
        boolean A1R = AbstractC167007dF.A1R(0, frameLayout, c6fg);
        File A0w = MSW.A0w(AbstractC23881Ey.A00().AXd(null, 456305453), String.valueOf(System.currentTimeMillis()));
        if (!A0w.exists()) {
            A0w.mkdirs();
        }
        File A0w2 = MSW.A0w(A0w, "TEMP_SELFIE.jpg");
        AESelfieCaptureConfig aESelfieCaptureConfig = new AESelfieCaptureConfig(new IgModelDownloader((UserSession) C6BQ.A0A(c6fg)), Boolean.valueOf(this.A05), A0w2.getCanonicalPath());
        Context context = c6fg.A00;
        C55013OVy c55013OVy = new C55013OVy(context, this.A01, C54923OQz.A00, aESelfieCaptureConfig);
        this.A00 = c55013OVy;
        c55013OVy.A00 = frameLayout;
        C23432Aa5 c23432Aa5 = c55013OVy.A03;
        if (c23432Aa5 == null) {
            c23432Aa5 = AbstractC224579vi.A00(c55013OVy.A05, new C55602Omi(c55013OVy), null, false);
            C23432Aa5.A00(c23432Aa5).Egx(921600);
            C23432Aa5.A00(c23432Aa5).Eal(1048576);
            C23432Aa5.A00(c23432Aa5).EbP(921600);
            C23432Aa5.A00(c23432Aa5).Eam(false);
            C23432Aa5.A00(c23432Aa5).EaF(A1R);
            c55013OVy.A03 = c23432Aa5;
        }
        C14360o3.A0C(c23432Aa5, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.LiteCameraController");
        try {
            c23432Aa5.A03(A1R ? 1 : 0);
            A1D = C0eB.A00;
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        Throwable A00 = C09550e6.A00(A1D);
        if (A00 != null) {
            C0K8.A0F("AESelfieViewProvider", "Unable to set initial camera facing", A00);
        }
        Context context2 = c55013OVy.A05;
        View A01 = c23432Aa5.A01();
        FrameLayout frameLayout2 = c55013OVy.A00;
        if (frameLayout2 != null) {
            frameLayout2.addView(A01);
        }
        C55601Omh c55601Omh = new C55601Omh(context2, c55013OVy.A07, c55013OVy, C12P.A00);
        c55013OVy.A01 = c55601Omh;
        c55013OVy.A02 = c55601Omh.A03;
        c23432Aa5.EKd();
        AbstractC25230BEn.A1N(C55013OVy.A00(context2, c55013OVy), AnonymousClass194.A02(AnonymousClass131.A00), 20);
        Context applicationContext = context.getApplicationContext();
        if ((applicationContext instanceof Application) && (application = (Application) applicationContext) != null) {
            application.registerActivityLifecycleCallbacks(this.A02);
        }
        this.A04.A01(this.A03, C55978OtB.class);
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        Application application;
        ViewGroup viewGroup = (ViewGroup) view;
        AbstractC167017dG.A1N(viewGroup, c6fg);
        C55013OVy c55013OVy = this.A00;
        if (c55013OVy == null) {
            C14360o3.A0F("selfieViewProvider");
            throw C00O.createAndThrow();
        }
        C23432Aa5 c23432Aa5 = c55013OVy.A03;
        if (c23432Aa5 != null) {
            c23432Aa5.destroy();
        }
        AbstractC25230BEn.A1N(C55013OVy.A00(c55013OVy.A05, c55013OVy), AbstractC50523MSb.A0e(), 19);
        c55013OVy.A03 = null;
        c55013OVy.A01 = null;
        viewGroup.removeAllViews();
        Context applicationContext = c6fg.A00.getApplicationContext();
        if ((applicationContext instanceof Application) && (application = (Application) applicationContext) != null) {
            application.unregisterActivityLifecycleCallbacks(this.A02);
        }
        this.A04.A02(this.A03, C55978OtB.class);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bloks.components.bkcomponentsfoaavatareditorautogencameraview.BloksComponentFoaAvatarAutogenCameraViewRenderUnit$lifeCycleListener$1] */
    public C52238NAb(C54498O6a c54498O6a, C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
        this.A01 = c54498O6a;
        UserSession A00 = AbstractC03270Dk.A00(C6BQ.A0A(c6fg));
        this.A06 = A00;
        this.A04 = AbstractC25651Mw.A00(A00);
        this.A05 = c102884kP.A0S(42, false);
        this.A02 = new Application.ActivityLifecycleCallbacks() { // from class: com.bloks.components.bkcomponentsfoaavatareditorautogencameraview.BloksComponentFoaAvatarAutogenCameraViewRenderUnit$lifeCycleListener$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                C55013OVy c55013OVy = C52238NAb.this.A00;
                if (c55013OVy == null) {
                    C14360o3.A0F("selfieViewProvider");
                    throw C00O.createAndThrow();
                }
                c55013OVy.A01();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                C55013OVy c55013OVy = C52238NAb.this.A00;
                if (c55013OVy == null) {
                    C14360o3.A0F("selfieViewProvider");
                    throw C00O.createAndThrow();
                }
                C23432Aa5 c23432Aa5 = c55013OVy.A03;
                if (c23432Aa5 != null) {
                    c23432Aa5.EKd();
                }
                AbstractC25230BEn.A1N(C55013OVy.A00(c55013OVy.A05, c55013OVy), AbstractC50523MSb.A0e(), 20);
            }
        };
        this.A03 = C56035Ou7.A00(this, 0);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }
}
