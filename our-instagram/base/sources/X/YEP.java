package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.facebook.gputimer.GPUTimerImpl;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes12.dex */
public final class YEP implements InterfaceC11380iw, InterfaceC174857qL {
    public static final String __redex_internal_original_name = "IgMediaPipelineControllerImpl";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SurfaceTexture A05;
    public HandlerThread A06;
    public Y2I A07;
    public InterfaceC1813182j A08;
    public boolean A09;
    public final Context A0A;
    public final InterfaceC178407wE A0B;
    public final InterfaceC174767qC A0C;
    public final YOj A0D;
    public final C72834XoT A0E;
    public final C22941A9l A0F;
    public final C178597wX A0G;
    public final C174867qM A0H;
    public final InterfaceC175497rP A0I;
    public final InterfaceC1813482m A0K;
    public final UserSession A0L;
    public final String A0M;
    public volatile C175887s2 A0N;
    public volatile boolean A0O;
    public final C179237xZ A0J = new Object();
    public volatile boolean A0P = false;

    public static synchronized void A01(YEP yep) {
        int i;
        synchronized (yep) {
            if (yep.A05 != null && yep.A04 > 0 && yep.A03 > 0 && yep.A07 != null) {
                if (!yep.A0O) {
                    C72834XoT c72834XoT = yep.A0E;
                    c72834XoT.A00(yep.A05, yep.A04, yep.A03);
                    int i2 = yep.A01;
                    if (i2 > 0 && (i = yep.A00) > 0) {
                        YOj yOj = c72834XoT.A04;
                        yOj.EQt(i2, i);
                        Y2I y2i = (Y2I) c72834XoT.A05.get();
                        if (y2i != null) {
                            y2i.A03(yOj.CFC(), yOj);
                        }
                        C22941A9l c22941A9l = yep.A0F;
                        int i3 = yep.A02;
                        C22986ABl c22986ABl = c22941A9l.A04;
                        if (i3 != c22986ABl.A00) {
                            c22986ABl.A00 = i3;
                        }
                        c22986ABl.A00();
                    }
                    C73348Y9d.A00(yep.A07.A0J, true, 32);
                    Y2I y2i2 = yep.A07;
                    y2i2.A07(C05F.A00);
                    C73348Y9d.A01(y2i2.A0J, new Object[0], 6);
                    yep.A0O = true;
                    yep.A09 = false;
                    yep.A0K.onResumed();
                } else if (yep.A09) {
                    yep.A0E.A00(yep.A05, yep.A04, yep.A03);
                    yep.A09 = false;
                }
            }
        }
    }

    public final synchronized void A02() {
        this.A0O = false;
        Y2I y2i = this.A07;
        if (y2i != null) {
            y2i.A02();
        }
        if (this.A0N != null) {
            this.A0N.A05();
        }
        this.A0K.onPaused();
        Y2I y2i2 = this.A07;
        if (y2i2 != null) {
            C73348Y9d.A00(y2i2.A0J, false, 32);
        }
        this.A0E.A04.onCameraClosed();
        C23439AaC c23439AaC = this.A0F.A04.A04;
        synchronized (c23439AaC) {
            if (c23439AaC.A00 != null) {
                c23439AaC.A00 = null;
                c23439AaC.A01 = false;
            }
        }
    }

    @Override // X.InterfaceC174857qL
    public final synchronized void AP0(boolean z) {
        if (!this.A0P) {
            this.A0P = true;
            this.A0C.disconnect();
            A02();
            if (this.A0N != null) {
                this.A0N.A04();
                this.A0N = null;
            }
            Y2I y2i = this.A07;
            if (y2i != null) {
                y2i.A01();
                this.A07 = null;
            }
        }
    }

    @Override // X.InterfaceC174857qL
    public final boolean CMF(String str, String str2) {
        return true;
    }

    @Override // X.InterfaceC174857qL
    public final synchronized void D1V() {
        this.A0C.disconnect();
        if (this.A0N != null) {
            this.A0N.A05();
            this.A0N.A04();
            this.A0N = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.7xZ] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.7qM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.XiF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.9v7, java.lang.Object] */
    public YEP(Context context, View view, C178597wX c178597wX, InterfaceC178407wE interfaceC178407wE, C23454AaR c23454AaR, InterfaceC176367st interfaceC176367st, InterfaceC174767qC interfaceC174767qC, A52 a52, C22986ABl c22986ABl, InterfaceC1813482m interfaceC1813482m, InterfaceC1813182j interfaceC1813182j, UserSession userSession, String str) {
        YOj c23578AcX;
        this.A0M = str;
        Context applicationContext = context.getApplicationContext();
        this.A0A = applicationContext;
        this.A0L = userSession;
        this.A0C = interfaceC174767qC;
        Object systemService = applicationContext.getSystemService("window");
        systemService.getClass();
        WindowManager windowManager = (WindowManager) systemService;
        this.A08 = interfaceC1813182j == null ? new YE4(this) : interfaceC1813182j;
        this.A0G = c178597wX;
        this.A0B = interfaceC178407wE;
        int rotation = windowManager.getDefaultDisplay().getRotation();
        C72684XlB c72684XlB = new C72684XlB(this);
        HandlerThread handlerThread = new HandlerThread("IgMediaPipelineControllerRenderHandlerThread", -8);
        AbstractC09770fa.A00(handlerThread);
        this.A06 = handlerThread;
        Y2I y2i = new Y2I(applicationContext, AbstractC167007dF.A0J(), this.A06, new YNV() { // from class: X.AVI
            @Override // X.YNV
            public final void DEf(Exception exc) {
                AbstractC12120kG.A0H("MP: Unable to instantiate render manager", exc);
            }
        }, c178597wX, null, this.A0B, new Object(), rotation);
        if (c178597wX.A00.CUZ(86)) {
            y2i.A0J.A03.A0A = new GPUTimerImpl();
        }
        y2i.A07 = c72684XlB;
        this.A07 = y2i;
        C174867qM c174867qM = y2i.A05;
        if (c174867qM == null) {
            WeakReference A16 = AbstractC25225BEi.A16(view);
            ?? obj = new Object();
            obj.A00 = A16;
            y2i.A05 = obj;
        } else {
            c174867qM.A01(AbstractC25225BEi.A16(view));
        }
        y2i.A00 = new Y9X(y2i);
        this.A0H = y2i.A05;
        if (interfaceC176367st == null && c23454AaR == null) {
            c23578AcX = new C23577AcW(windowManager);
        } else {
            c23578AcX = new C23578AcX(context, windowManager, new Object(), c23454AaR, interfaceC176367st, userSession, AnonymousClass820.A01(applicationContext));
        }
        this.A0D = c23578AcX;
        this.A0E = new C72834XoT(this.A07, c23578AcX);
        this.A0F = new C22941A9l(this.A07, a52, c22986ABl);
        this.A0I = new C73404YBq(c23454AaR, interfaceC176367st, this, userSession);
        this.A0K = interfaceC1813482m;
        Y2I y2i2 = this.A07;
        if (y2i2 != null) {
            C73348Y9d.A00(y2i2.A0J, new Object(), 30);
        }
    }

    public static void A00(YEP yep) {
        if (yep.A0N == null) {
            Context context = yep.A0A;
            String str = yep.A0M;
            yep.A0N = C179587y8.A00(context, yep.A0B, yep.A0G.A00, str);
        }
    }

    @Override // X.InterfaceC174857qL
    public final void A9o(InterfaceC185788Ly interfaceC185788Ly) {
        Y2I y2i = this.A07;
        if (y2i != null) {
            y2i.A04(interfaceC185788Ly);
        }
    }

    @Override // X.InterfaceC174857qL
    public final void ARX(boolean z) {
        WeakReference weakReference;
        C22941A9l c22941A9l = this.A0F;
        C175727rm c175727rm = c22941A9l.A01;
        if (z) {
            weakReference = AbstractC25225BEi.A16(c22941A9l.A00);
        } else {
            WeakReference weakReference2 = c175727rm.A00;
            if (weakReference2 == null) {
                return;
            }
            weakReference2.clear();
            weakReference = null;
        }
        c175727rm.A00 = weakReference;
    }

    @Override // X.InterfaceC174857qL
    public final GPUTimerImpl B9L() {
        Y2I y2i = this.A07;
        if (y2i != null) {
            return y2i.A0J.A03.A0A;
        }
        return null;
    }

    @Override // X.InterfaceC174857qL
    public final boolean Du7(MotionEvent motionEvent) {
        if (this.A0O) {
            return this.A0H.A02(motionEvent);
        }
        return false;
    }

    @Override // X.InterfaceC174857qL
    public final void E1D() {
        this.A0B.Ebc(UUID.randomUUID().toString());
    }

    @Override // X.InterfaceC174857qL
    public final void EG2(InterfaceC185788Ly interfaceC185788Ly) {
        Y2I y2i = this.A07;
        if (y2i != null) {
            y2i.A0J.A04(interfaceC185788Ly);
        }
    }

    @Override // X.InterfaceC174857qL
    public final void ENM(InterfaceC179247xa interfaceC179247xa) {
        Y2I y2i = (Y2I) this.A0F.A05.get();
        if (y2i != null) {
            y2i.A05(interfaceC179247xa);
        }
    }

    @Override // X.InterfaceC174857qL
    public final void EOE(AXC axc) {
        C179237xZ c179237xZ = this.A0J;
        c179237xZ.A00 = axc;
        Y2I y2i = this.A07;
        if (y2i != null) {
            y2i.A05(c179237xZ);
        }
    }

    @Override // X.InterfaceC174857qL
    public final void Ehh(List list) {
        Y2I y2i = this.A07;
        if (y2i != null) {
            y2i.A08(list);
        }
    }

    @Override // X.InterfaceC174857qL
    public final void Epw(YRH yrh) {
        InterfaceC178407wE interfaceC178407wE = this.A0B;
        AbstractC196588mo.A00(interfaceC178407wE, C05F.A00, __redex_internal_original_name, hashCode());
        Y2I y2i = this.A07;
        if (y2i != null) {
            C199758sR c199758sR = new C199758sR(this.A04, this.A03);
            Y9U y9u = new Y9U(yrh, this);
            if (y2i.A03 == null) {
                y9u.D2J(new AbstractC223559ty(30000, "Cannot take snapshot. mInput is null"));
                return;
            }
            synchronized (y2i.A0P) {
                if (y2i.A0W) {
                    y9u.D2J(new AbstractC223559ty(10000, "Already taking preview photo."));
                    return;
                }
                y2i.A0W = true;
                y2i.A0L.DEb(7);
                C72172XRg c72172XRg = (C72172XRg) y2i.A0V.get();
                if (c72172XRg == null) {
                    c72172XRg = new C72172XRg(y2i.A0N);
                }
                y2i.A0V = AbstractC25225BEi.A16(c72172XRg);
                C199758sR A00 = AbstractC224549vf.A00(c199758sR, y2i.A03.BIB(), y2i.A03.BI0());
                int i = A00.A01;
                int i2 = A00.A00;
                c72172XRg.A02 = i;
                c72172XRg.A01 = i2;
                c72172XRg.A09 = false;
                C73348Y9d c73348Y9d = y2i.A0J;
                ArrayList A17 = AbstractC25225BEi.A17(1);
                A17.add(c72172XRg);
                C73348Y9d.A00(c73348Y9d, A17, 8);
                C72827XoH c72827XoH = new C72827XoH(y9u, y2i, c72172XRg);
                if (c72172XRg.A06 != null) {
                    c72827XoH.A00(AbstractC166987dD.A14("savePhoto called while already in the process of saving"));
                } else {
                    if (c72172XRg.A04 != null) {
                        c72172XRg.A08 = AbstractC25225BEi.A16(null);
                    }
                    c72172XRg.A04 = null;
                    c72172XRg.A06 = new Xkr(c72827XoH);
                }
                y9u.D2R();
                return;
            }
        }
        AbstractC223559ty abstractC223559ty = new AbstractC223559ty(10015, "MediaPipelineController is null");
        yrh.D2J(abstractC223559ty);
        AbstractC196788n8.A00(abstractC223559ty, interfaceC178407wE, __redex_internal_original_name, "high", hashCode());
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0B.BhE();
    }

    @Override // X.InterfaceC174857qL
    public final AudioServiceConfigurationAnnouncer Adz() {
        A00(this);
        if (this.A0N != null) {
            C175887s2 c175887s2 = this.A0N;
            AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer = c175887s2.A05;
            if (audioServiceConfigurationAnnouncer == null) {
                AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer2 = new AudioServiceConfigurationAnnouncer();
                c175887s2.A05 = audioServiceConfigurationAnnouncer2;
                return audioServiceConfigurationAnnouncer2;
            }
            return audioServiceConfigurationAnnouncer;
        }
        return null;
    }

    @Override // X.InterfaceC174857qL
    public final InterfaceC175497rP C4Q() {
        return this.A0I;
    }

    @Override // X.InterfaceC174857qL
    public final boolean CUA(String str) {
        return C179587y8.A01(str);
    }

    @Override // X.InterfaceC174857qL
    public final AudioGraphClientProvider getAudioGraphClientProvider() {
        A00(this);
        if (this.A0N != null) {
            return this.A0N.A02();
        }
        return null;
    }
}
