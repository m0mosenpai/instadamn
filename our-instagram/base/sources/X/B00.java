package X;

import android.content.res.AssetManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.Matrix;
import android.os.RemoteException;
import com.facebook.cameracore.mediapipeline.arengineservices.igsandboxeffectservicehost.IgSandboxEffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.hybridlogsink.HybridLogSink;
import com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;
import com.meta.arfx.engine.interfaces.IARExperimentUtilBinding;
import com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost;
import org.webrtc.EglBase10Impl;

/* loaded from: classes4.dex */
public final class B00 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AbstractServiceC201348vN A02;
    public final /* synthetic */ IARAnalyticsLoggerHost A03;
    public final /* synthetic */ IARExperimentUtilBinding A04;
    public final /* synthetic */ IARNetworkClientWorkerHost A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public B00(AbstractServiceC201348vN abstractServiceC201348vN, IARAnalyticsLoggerHost iARAnalyticsLoggerHost, IARExperimentUtilBinding iARExperimentUtilBinding, IARNetworkClientWorkerHost iARNetworkClientWorkerHost, int i, int i2, boolean z, boolean z2) {
        this.A02 = abstractServiceC201348vN;
        this.A03 = iARAnalyticsLoggerHost;
        this.A04 = iARExperimentUtilBinding;
        this.A05 = iARNetworkClientWorkerHost;
        this.A07 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        EnumC201298vD enumC201298vD;
        AbstractServiceC201348vN abstractServiceC201348vN = this.A02;
        Integer num = abstractServiceC201348vN.A0K;
        Integer num2 = C05F.A00;
        if (num == num2 && abstractServiceC201348vN.A04 != null) {
            C23336AWf c23336AWf = new C23336AWf();
            C23341AWl c23341AWl = new C23341AWl();
            C63967Swt c63967Swt = new C63967Swt();
            abstractServiceC201348vN.A0D = c23336AWf;
            abstractServiceC201348vN.A0E = c23341AWl;
            abstractServiceC201348vN.A0F = c63967Swt;
            abstractServiceC201348vN.A0B = new AWM(abstractServiceC201348vN, new C23335AWe(), c23336AWf, c23341AWl, c63967Swt);
            IgSandboxEffectServiceHost.Companion.A00(abstractServiceC201348vN);
            abstractServiceC201348vN.A0I = new ABC();
            C23336AWf c23336AWf2 = abstractServiceC201348vN.A0D;
            if (c23336AWf2 != null) {
                c23336AWf2.A00 = this.A03;
            }
            C23341AWl c23341AWl2 = abstractServiceC201348vN.A0E;
            if (c23341AWl2 != null) {
                c23341AWl2.A00 = this.A04;
                c23341AWl2.A01.clear();
            }
            C63967Swt c63967Swt2 = abstractServiceC201348vN.A0F;
            if (c63967Swt2 != null) {
                c63967Swt2.A00 = this.A05;
            }
            abstractServiceC201348vN.A0a = null;
            InterfaceC201328vH interfaceC201328vH = abstractServiceC201348vN.A0B;
            if (interfaceC201328vH != null) {
                EffectServiceHost AMP = interfaceC201328vH.AMP(abstractServiceC201348vN);
                boolean z = this.A07;
                int i = this.A01;
                int i2 = this.A00;
                boolean z2 = this.A06;
                AssetManager assetManager = abstractServiceC201348vN.A04;
                if (assetManager != null) {
                    abstractServiceC201348vN.A0C = new AREngineController(assetManager, abstractServiceC201348vN.A0O, abstractServiceC201348vN.A0P, AMP.getEnginePluginConfigProvider());
                    try {
                        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                        abstractServiceC201348vN.A07 = eglGetDisplay;
                        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                            int[] iArr = new int[2];
                            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                                if (EGL14.eglChooseConfig(abstractServiceC201348vN.A07, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12327, 12344, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                    EGLContext eglCreateContext = EGL14.eglCreateContext(abstractServiceC201348vN.A07, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                                    abstractServiceC201348vN.A06 = eglCreateContext;
                                    if (eglCreateContext != null && EGL14.eglGetError() == 12288) {
                                        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(abstractServiceC201348vN.A07, eGLConfigArr[0], abstractServiceC201348vN.A0A, new int[]{12344}, 0);
                                        abstractServiceC201348vN.A08 = eglCreateWindowSurface;
                                        if (eglCreateWindowSurface != null && EGL14.eglGetError() == 12288) {
                                            EGLDisplay eGLDisplay = abstractServiceC201348vN.A07;
                                            EGLSurface eGLSurface = abstractServiceC201348vN.A08;
                                            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, abstractServiceC201348vN.A06);
                                            AREngineController aREngineController = abstractServiceC201348vN.A0C;
                                            if (aREngineController != null) {
                                                aREngineController.resize(abstractServiceC201348vN.A03, abstractServiceC201348vN.A02);
                                            }
                                            AREngineController aREngineController2 = abstractServiceC201348vN.A0C;
                                            if (aREngineController2 != null) {
                                                aREngineController2.setupServiceHost(AMP);
                                            }
                                            AREngineController aREngineController3 = abstractServiceC201348vN.A0C;
                                            if (aREngineController3 != null) {
                                                EnumC201298vD[] enumC201298vDArr = EnumC201298vD.A01;
                                                int length = enumC201298vDArr.length;
                                                int i3 = 0;
                                                while (true) {
                                                    if (i3 < length) {
                                                        enumC201298vD = enumC201298vDArr[i3];
                                                        if (enumC201298vD.A00 == i) {
                                                            break;
                                                        } else {
                                                            i3++;
                                                        }
                                                    } else {
                                                        enumC201298vD = EnumC201298vD.A04;
                                                        break;
                                                    }
                                                }
                                                bool = Boolean.valueOf(aREngineController3.renderSessionInit(z, enumC201298vD, i2, (GPUTimerImpl) null, (HybridLogSink) null, z2));
                                            } else {
                                                bool = null;
                                            }
                                            if (AbstractC166997dE.A1Z(bool, true)) {
                                                abstractServiceC201348vN.A0a = AMP;
                                                abstractServiceC201348vN.A0K = C05F.A01;
                                            } else {
                                                throw new Exception("renderSessionInit failed: native");
                                            }
                                        } else {
                                            throw AbstractC166987dD.A18("surface was null");
                                        }
                                    } else {
                                        throw AbstractC166987dD.A18("null context");
                                    }
                                } else {
                                    throw AbstractC166987dD.A18(AbstractC111324zv.A00(138));
                                }
                            } else {
                                abstractServiceC201348vN.A07 = null;
                                throw AbstractC166987dD.A18(AbstractC111324zv.A00(3265));
                            }
                        } else {
                            throw AbstractC166987dD.A18(AbstractC111324zv.A00(3264));
                        }
                    } catch (Exception e) {
                        C0K8.A05(AbstractServiceC201348vN.class, "renderSessionInit failed: ", e);
                        AREngineController aREngineController4 = abstractServiceC201348vN.A0C;
                        if (aREngineController4 != null) {
                            aREngineController4.releaseGl();
                        }
                        EffectServiceHost effectServiceHost = abstractServiceC201348vN.A0a;
                        if (effectServiceHost != null) {
                            effectServiceHost.destroy();
                        }
                        abstractServiceC201348vN.A0a = null;
                        AbstractServiceC201348vN.A00(abstractServiceC201348vN);
                        abstractServiceC201348vN.A0C = null;
                        C23336AWf c23336AWf3 = abstractServiceC201348vN.A0D;
                        if (c23336AWf3 != null) {
                            c23336AWf3.A00();
                        }
                        C23336AWf c23336AWf4 = abstractServiceC201348vN.A0D;
                        if (c23336AWf4 != null) {
                            c23336AWf4.A00 = null;
                        }
                        C23341AWl c23341AWl3 = abstractServiceC201348vN.A0E;
                        if (c23341AWl3 != null) {
                            c23341AWl3.A00 = null;
                            c23341AWl3.A01.clear();
                        }
                        C63967Swt c63967Swt3 = abstractServiceC201348vN.A0F;
                        if (c63967Swt3 != null) {
                            c63967Swt3.A00 = null;
                        }
                        abstractServiceC201348vN.A0K = num2;
                        try {
                            IAREngineServiceCallback iAREngineServiceCallback = abstractServiceC201348vN.A0J;
                            if (iAREngineServiceCallback != null) {
                                iAREngineServiceCallback.Ct9(e.getMessage());
                            }
                        } catch (RemoteException e2) {
                            C0K8.A05(AbstractServiceC201348vN.class, "Callback notifyException failed: ", e2);
                            abstractServiceC201348vN.stopSelf();
                        }
                    }
                } else {
                    C14360o3.A0F("assetManager");
                    throw C00O.createAndThrow();
                }
            }
            C23336AWf c23336AWf5 = abstractServiceC201348vN.A0D;
            if (c23336AWf5 != null) {
                c23336AWf5.A00();
            }
            Matrix.setIdentityM(abstractServiceC201348vN.A0W, 0);
            Matrix.setIdentityM(abstractServiceC201348vN.A0X, 0);
            Matrix.setIdentityM(abstractServiceC201348vN.A0V, 0);
        }
    }
}
