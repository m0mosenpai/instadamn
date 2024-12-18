package X;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* renamed from: X.7u0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177047u0 implements InterfaceC177057u1, InterfaceC175347rA {
    public static int A0L = 16;
    public static int A0M = 400;
    public static long A0N = 30000000;
    public static int A0O;
    public static boolean A0P;
    public static boolean A0Q;
    public static final float[] A0R = new float[4];
    public static final int[] A0S = new int[18];
    public A4W A00;
    public C177147uA A01;
    public InterfaceC175167qq A02;
    public C175137qn A03;
    public C175177qr A04;
    public C22825A4u A05;
    public InterfaceC25161BBg A06;
    public InterfaceC177137u9 A07;
    public C7r6 A08;
    public C177627uw A09;
    public InterfaceC177197uF A0A;
    public Boolean A0B;
    public Integer A0C;
    public boolean A0D;
    public final C175087qi A0F;
    public final InterfaceC175367rC A0G;
    public volatile boolean A0I;
    public volatile boolean A0J;
    public volatile boolean A0K;
    public int A0E = 0;
    public volatile int A0H = 0;

    private void A00(InterfaceC177197uF interfaceC177197uF) {
        if (this.A0H == 1) {
            this.A0H = 0;
            this.A0B = true;
            this.A0A = interfaceC177197uF;
            this.A0F.A01();
            C7r6 c7r6 = this.A08;
            if (c7r6 != null) {
                c7r6.Dak();
                return;
            }
            return;
        }
        throw new RuntimeException("Starting preview outside BLOCK_STATE_STARTING_PREVIEW state");
    }

    private void A01(InterfaceC177197uF interfaceC177197uF) {
        if (this.A0H == 7) {
            this.A0H = 0;
            this.A0B = true;
            this.A0A = interfaceC177197uF;
            this.A0F.A01();
            return;
        }
        throw new RuntimeException("Starting recording outside BLOCK_STATE_STARTING_RECORD state");
    }

    public static boolean A02(C177427uc c177427uc) {
        Number number = (Number) c177427uc.A00(CaptureResult.SENSOR_EXPOSURE_TIME);
        Number number2 = (Number) c177427uc.A00(CaptureResult.SENSOR_SENSITIVITY);
        if (number == null || number2 == null) {
            return false;
        }
        boolean z = A0Q;
        long longValue = number.longValue();
        if (!z) {
            if (longValue <= A0N || number2.intValue() <= A0M) {
                return false;
            }
        } else if (longValue <= A0N * 0.5d || number2.intValue() <= A0M * 0.5d) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC175347rA
    public final void AE4() {
        this.A0F.A00();
    }

    @Override // X.InterfaceC175347rA
    public final /* bridge */ /* synthetic */ Object Bos() {
        Boolean bool = this.A0B;
        if (bool != null) {
            if (bool.booleanValue()) {
                return this.A0A;
            }
            throw this.A01;
        }
        throw new IllegalStateException("Start Preview operation hasn't completed yet.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0145, code lost:
    
        if (((java.lang.Integer) r10.A00(r1)).intValue() < 370) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01d9, code lost:
    
        if (r0 != 5) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01e6, code lost:
    
        if (r7.intValue() != 4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015a, code lost:
    
        if (r3 < r1) goto L85;
     */
    @Override // X.InterfaceC177057u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D2H(X.InterfaceC177197uF r9, X.C177427uc r10) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177047u0.D2H(X.7uF, X.7uc):void");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.7uA, java.lang.RuntimeException] */
    @Override // X.InterfaceC177057u1
    public final void D2L(InterfaceC177197uF interfaceC177197uF, C177437ud c177437ud) {
        C176347sr c176347sr;
        if (this.A0J) {
            if (this.A0H == 1 || this.A0H == 7) {
                this.A0H = 0;
                this.A0B = false;
                this.A01 = new RuntimeException(AnonymousClass001.A0O("Failed to start operation. Reason: ", c177437ud.A00));
                C175137qn c175137qn = this.A03;
                if (c175137qn != null && (c176347sr = c175137qn.A00.A0m) != null && !c176347sr.A00.isEmpty()) {
                    C176567tE.A00(new RunnableC24280Apl(c176347sr));
                }
                this.A0F.A01();
            }
        }
    }

    @Override // X.InterfaceC177057u1
    public final void D2T(CaptureRequest captureRequest, InterfaceC177197uF interfaceC177197uF, long j, long j2) {
        if (this.A0J) {
            if (this.A0H == 1) {
                A00(interfaceC177197uF);
            } else {
                if (this.A0H != 7) {
                    return;
                }
                A01(interfaceC177197uF);
            }
        }
    }

    public C177047u0() {
        InterfaceC175367rC interfaceC175367rC = new InterfaceC175367rC() { // from class: X.7u2
            /* JADX WARN: Type inference failed for: r0v3, types: [X.7uA, java.lang.RuntimeException] */
            @Override // X.InterfaceC175367rC
            public final void DtK() {
                C176347sr c176347sr;
                C177047u0 c177047u0 = C177047u0.this;
                if (c177047u0.A0J) {
                    if (c177047u0.A0H != 1 && c177047u0.A0H != 7) {
                        if (c177047u0.A0H == 2 || c177047u0.A0H == 3 || c177047u0.A0H == 4) {
                            c177047u0.A0H = 0;
                            return;
                        }
                        return;
                    }
                    c177047u0.A0H = 0;
                    c177047u0.A0B = false;
                    c177047u0.A01 = new RuntimeException("Failed to start operation. Operation timed out.");
                    C175137qn c175137qn = c177047u0.A03;
                    if (c175137qn == null || (c176347sr = c175137qn.A00.A0m) == null || c176347sr.A00.isEmpty()) {
                        return;
                    }
                    C176567tE.A00(new RunnableC24280Apl(c176347sr));
                }
            }
        };
        this.A0G = interfaceC175367rC;
        this.A0J = true;
        C175087qi c175087qi = new C175087qi();
        this.A0F = c175087qi;
        c175087qi.A00 = interfaceC175367rC;
    }

    @Override // X.InterfaceC177057u1
    public final void DQu(int i) {
    }
}
