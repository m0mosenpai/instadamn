package X;

import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.Matrix;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public final class WIM implements SurfaceTexture.OnFrameAvailableListener {
    public float A00;
    public float A01;
    public SurfaceTexture A02;
    public Surface A03;
    public Surface A04;
    public Surface A05;
    public C178927x4 A06;
    public AbstractC180277zH A07;
    public AbstractC180277zH A08;
    public AbstractC180277zH A09;
    public AnonymousClass810 A0A;
    public EnumC185018Iq A0B;
    public C8J3 A0C;
    public AKR A0D;
    public C55172Odb A0E;
    public String A0F;
    public boolean A0G;
    public final int A0H;
    public final int A0I;
    public final C179877yd A0J;
    public final C201278vB A0K;
    public final Object A0L;
    public final List A0M;
    public final List A0N;
    public final AtomicInteger A0O;
    public final InterfaceC16590sC A0P;
    public final float[] A0Q;

    public WIM(Resources resources, C8J3 c8j3, String str, InterfaceC16590sC interfaceC16590sC, int i, int i2) {
        C14360o3.A0B(resources, 4);
        AbstractC167017dG.A1T(c8j3, interfaceC16590sC);
        this.A0I = i;
        this.A0H = i2;
        this.A0F = str;
        this.A0C = c8j3;
        this.A0P = interfaceC16590sC;
        this.A0L = new Object();
        this.A0J = new C179877yd(resources);
        this.A0N = new ArrayList();
        this.A0K = new C201278vB();
        this.A0O = new AtomicInteger(0);
        this.A0M = new ArrayList();
        this.A01 = -1.0f;
        this.A00 = -1.0f;
        this.A0B = EnumC185018Iq.A08;
        float[] fArr = new float[16];
        this.A0Q = fArr;
        Matrix.setIdentityM(fArr, 0);
        AnonymousClass811 anonymousClass811 = new AnonymousClass811(AbstractC111324zv.A00(597));
        anonymousClass811.A03 = 36197;
        AnonymousClass810 anonymousClass810 = new AnonymousClass810(anonymousClass811);
        this.A0A = anonymousClass810;
        SurfaceTexture surfaceTexture = new SurfaceTexture(anonymousClass810.A00);
        this.A02 = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.A0I, this.A0H);
        this.A02.setOnFrameAvailableListener(this);
        this.A03 = new Surface(this.A02);
        this.A0D = new AKR(this.A0J);
        C178927x4 c178927x4 = new C178927x4(null, 3);
        this.A06 = c178927x4;
        c178927x4.A09(EGL14.EGL_NO_CONTEXT, 1);
        A00();
    }

    private final void A00() {
        C55172Odb c55172Odb = new C55172Odb();
        c55172Odb.A04 = new C70459WWw(this);
        this.A0E = c55172Odb;
        if (c55172Odb.A05(this.A0I, this.A0H, (int) (r6 * r5 * (1.0E9d / 3.3E7d) * 4.0d * 0.07d), 0)) {
            C55172Odb c55172Odb2 = this.A0E;
            String str = "boomerangEncoder";
            if (c55172Odb2 != null) {
                Surface surface = c55172Odb2.A03;
                if (surface != null && surface.isValid()) {
                    try {
                        C178927x4 c178927x4 = this.A06;
                        if (c178927x4 == null) {
                            str = "selfEGLCore";
                        } else {
                            C55172Odb c55172Odb3 = this.A0E;
                            if (c55172Odb3 != null) {
                                Surface surface2 = c55172Odb3.A03;
                                if (surface2 != null) {
                                    AbstractC180277zH AMi = c178927x4.AMi(surface2);
                                    this.A07 = AMi;
                                    AMi.A05();
                                    C55172Odb c55172Odb4 = this.A0E;
                                    if (c55172Odb4 != null) {
                                        c55172Odb4.A04(this.A0F);
                                        AtomicInteger atomicInteger = this.A0O;
                                        if (atomicInteger.get() == 4) {
                                            A02(this, this.A01, this.A00);
                                            return;
                                        } else {
                                            atomicInteger.set(1);
                                            return;
                                        }
                                    }
                                } else {
                                    throw AbstractC166997dE.A0g();
                                }
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    } catch (Exception unused) {
                        C0K8.A0C("DecoderOutputSurfaceHandler", "Failure when creating the encoder surface - abort capture.");
                        return;
                    }
                }
                return;
            }
            C14360o3.A0F("boomerangEncoder");
            throw C00O.createAndThrow();
        }
    }

    public static final void A01(EnumC185018Iq enumC185018Iq, C8J3 c8j3, WIM wim, String str, float f, float f2) {
        AtomicInteger atomicInteger = wim.A0O;
        if (atomicInteger.get() != 0) {
            C0K8.A0C("DecoderOutputSurfaceHandler", AnonymousClass001.A0O(AbstractC111324zv.A00(1827), atomicInteger.get()));
            InterfaceC16590sC interfaceC16590sC = wim.A0P;
            Boolean A0a = AbstractC166997dE.A0a();
            if (enumC185018Iq == null) {
                enumC185018Iq = wim.A0B;
            }
            Float valueOf = Float.valueOf(-1.0f);
            interfaceC16590sC.invoke(A0a, enumC185018Iq, null, valueOf, valueOf);
            return;
        }
        wim.A0C = c8j3;
        wim.A0F = str;
        if (enumC185018Iq != null) {
            wim.A0B = enumC185018Iq;
        }
        wim.A01 = f;
        wim.A00 = f2;
        atomicInteger.set(4);
        wim.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r22.A0C.Dc2(1.0f);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba A[Catch: IndexOutOfBoundsException -> 0x0145, TryCatch #0 {IndexOutOfBoundsException -> 0x0145, blocks: (B:3:0x0004, B:5:0x0012, B:7:0x001c, B:10:0x0025, B:11:0x0023, B:14:0x0028, B:16:0x0046, B:17:0x004b, B:18:0x004f, B:20:0x0050, B:21:0x005f, B:23:0x006c, B:26:0x0073, B:27:0x00b4, B:29:0x00ba, B:31:0x00c1, B:33:0x00cf, B:35:0x00d3, B:36:0x00da, B:38:0x00e6, B:39:0x00ec, B:47:0x011d, B:52:0x013f, B:75:0x012b, B:42:0x013b, B:80:0x0118, B:83:0x00ca, B:89:0x00a1, B:91:0x0089, B:93:0x008d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ca A[EDGE_INSN: B:85:0x00ca->B:83:0x00ca BREAK  A[LOOP:1: B:21:0x005f->B:44:0x005f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.WIM r22, float r23, float r24) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WIM.A02(X.WIM, float, float):void");
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object obj = this.A0L;
        synchronized (obj) {
            if (!this.A0G) {
                this.A0G = true;
                obj.notifyAll();
            } else {
                throw new RuntimeException(AbstractC111324zv.A00(232));
            }
        }
    }
}
