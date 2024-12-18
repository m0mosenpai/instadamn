package X;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.8mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196658mv implements InterfaceC177057u1, InterfaceC175347rA {
    public static final float[] A0A = new float[4];
    public static final int[] A0B = new int[18];
    public Long A00;
    public final C177627uw A02;
    public final C175087qi A03;
    public final boolean A05;
    public final InterfaceC175367rC A06;
    public volatile C196698mz A08;
    public volatile Boolean A09;
    public volatile C177147uA A07 = new RuntimeException("Uninitialized exception.");
    public WeakReference A01 = new WeakReference(null);
    public final C196668mw A04 = new C196668mw(this);

    @Override // X.InterfaceC175347rA
    public final void AE4() {
        this.A03.A00();
    }

    @Override // X.InterfaceC175347rA
    public final /* bridge */ /* synthetic */ Object Bos() {
        if (this.A09 != null) {
            if (this.A09.booleanValue()) {
                C196698mz c196698mz = this.A08;
                if (c196698mz != null && (c196698mz.A04 != null || c196698mz.A01 != null)) {
                    return c196698mz;
                }
                throw new IllegalStateException("Photo capture data is null.");
            }
            throw this.A07;
        }
        throw new IllegalStateException("Photo capture operation hasn't completed yet.");
    }

    @Override // X.InterfaceC177057u1
    public final void D2L(InterfaceC177197uF interfaceC177197uF, C177437ud c177437ud) {
        this.A01.clear();
    }

    @Override // X.InterfaceC177057u1
    public final void DQu(int i) {
        InterfaceC196578mn interfaceC196578mn = (InterfaceC196578mn) this.A01.get();
        if (interfaceC196578mn != null) {
            interfaceC196578mn.Dbk(i);
        }
        if (i == 100) {
            this.A01.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7uA, java.lang.RuntimeException] */
    public C196658mv(boolean z, boolean z2) {
        long j;
        InterfaceC175367rC interfaceC175367rC = new InterfaceC175367rC() { // from class: X.8mx
            /* JADX WARN: Type inference failed for: r0v2, types: [X.7uA, java.lang.RuntimeException] */
            @Override // X.InterfaceC175367rC
            public final void DtK() {
                C196658mv c196658mv = C196658mv.this;
                c196658mv.A09 = false;
                c196658mv.A07 = new RuntimeException("Photo capture failed. Still capture timed out.");
            }
        };
        this.A06 = interfaceC175367rC;
        this.A05 = z;
        if (z2) {
            j = 20000;
        } else {
            j = 10000;
        }
        C175087qi c175087qi = new C175087qi();
        this.A03 = c175087qi;
        c175087qi.A00 = interfaceC175367rC;
        c175087qi.A02(j);
        this.A02 = new C177627uw();
    }

    @Override // X.InterfaceC177057u1
    public final void D2H(InterfaceC177197uF interfaceC177197uF, C177427uc c177427uc) {
        C196998nU A00 = C196998nU.A00();
        C196998nU.A01(A00, 6, A00.A03);
        C177637ux A002 = this.A02.A00(c177427uc);
        try {
            RggbChannelVector rggbChannelVector = (RggbChannelVector) c177427uc.A00(CaptureResult.COLOR_CORRECTION_GAINS);
            if (rggbChannelVector != null) {
                float[] fArr = A0A;
                rggbChannelVector.copyTo(fArr, 0);
                A002.A01(C177637ux.A0H, fArr);
            }
        } catch (IllegalArgumentException unused) {
        }
        try {
            ColorSpaceTransform colorSpaceTransform = (ColorSpaceTransform) c177427uc.A00(CaptureResult.COLOR_CORRECTION_TRANSFORM);
            if (colorSpaceTransform != null) {
                int[] iArr = A0B;
                colorSpaceTransform.copyElements(iArr, 0);
                A002.A01(C177637ux.A0I, iArr);
            }
        } catch (IllegalArgumentException unused2) {
        }
        this.A00 = (Long) c177427uc.A00(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (this.A05 && Boolean.TRUE.equals(this.A09)) {
            this.A03.A01();
        }
    }

    @Override // X.InterfaceC177057u1
    public final void D2T(CaptureRequest captureRequest, InterfaceC177197uF interfaceC177197uF, long j, long j2) {
        C196998nU.A00().A03 = SystemClock.elapsedRealtime();
    }
}
