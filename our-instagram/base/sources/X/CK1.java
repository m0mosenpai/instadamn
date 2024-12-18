package X;

import android.graphics.Path;

/* loaded from: classes5.dex */
public abstract class CK1 {
    public static final C60X A00(float f, long j) {
        C114205Dh A00 = AbstractC119355as.A00(f, j);
        C60X A002 = C60W.A00();
        float f2 = A00.A02;
        float f3 = A00.A01;
        float f4 = f2 - f3;
        float f5 = f4 / 8.0f;
        float f6 = f4 / 6.0f;
        long A003 = A00.A00();
        float A02 = C119365at.A02(A003);
        float f7 = f5 / 2.0f;
        float f8 = A02 - f7;
        float f9 = f3 + f5;
        A002.A01(new C114205Dh(f3, f8, f9, f8 + f5), 180.0f);
        float f10 = 2.0f * f6;
        float f11 = A00.A03;
        float f12 = f11 + f10;
        Path path = A002.A03;
        path.lineTo(f3 + f10, f12);
        float A01 = C119365at.A01(A003);
        float f13 = A01 - f7;
        path.lineTo(f13, f11 + f7);
        float f14 = f13 + f5;
        float f15 = f11 + f5;
        A002.A01(new C114205Dh(f13, f11, f14, f15), 225.0f);
        A002.A01(new C114205Dh(f13, f11, f14, f15), 270.0f);
        float f16 = A01 + f6;
        path.lineTo(f16, f12);
        float f17 = A02 - (f5 / 1.8f);
        path.lineTo(f2 - f7, f17);
        float f18 = f2 - f5;
        float f19 = f18 + f5;
        float f20 = f17 + f5;
        A002.A01(new C114205Dh(f18, f17, f19, f20), 315.0f);
        A002.A01(new C114205Dh(f18, f17, f19, f20), 0.0f);
        float f21 = A00.A00;
        float f22 = f21 - f10;
        path.lineTo(f16, f22);
        path.lineTo(A01 + f7, f21 - f7);
        float f23 = f21 - f5;
        float f24 = f23 + f5;
        A002.A01(new C114205Dh(f13, f23, f14, f24), 45.0f);
        A002.A01(new C114205Dh(f13, f23, f14, f24), 90.0f);
        path.lineTo(A01 - f6, f22);
        path.lineTo(f3 + f7, A02 + f7);
        A002.A01(new C114205Dh(f3, f17, f9, f20), 135.0f);
        return A002;
    }
}
