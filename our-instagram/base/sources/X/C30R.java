package X;

import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.30R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30R {
    public static final C30R A04;
    public static final C30R A05;
    public static final C30R A06;
    public static final C30R A07;
    public static final C30R A08;
    public static final C30R A09;
    public static final C30R A0A;
    public static final C30R A0B;
    public static final C30R A0C;
    public final int A00;
    public final int A01;
    public final C30Q A02;
    public final boolean A03;

    static {
        C30Q c30q = C30Q.SLIDE_OUT;
        A08 = new C30R(c30q, 5000, -1, false);
        A07 = new C30R(c30q, 5000, 5000, false);
        A0C = new C30R(c30q, 0, -1, false);
        A0B = new C30R(c30q, 0, 3000, false);
        A09 = new C30R(c30q, 5000, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, false);
        A05 = new C30R(c30q, -1, -1, false);
        A06 = new C30R(c30q, 3000, -1, false);
        A04 = new C30R(c30q, 0, -1, false);
        A0A = new C30R(C30Q.SLIDE_IN, 0, 0, false);
    }

    public C30R(C30Q c30q, int i, int i2, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = c30q;
        this.A03 = z;
    }
}
