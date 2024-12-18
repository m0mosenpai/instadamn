package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.S9k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62385S9k {
    public static Constructor A00;
    public static Constructor A01;
    public static Method A02;
    public static Method A03;
    public static Method A04;

    public static void A00() {
        if (A00 == null || A04 == null || A02 == null) {
            Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
            A00 = cls.getConstructor(new Class[0]);
            A04 = cls.getMethod("setRotationDegrees", Float.TYPE);
            A02 = AbstractC58318PtA.A0t(cls, "build");
        }
        if (A01 == null || A03 == null) {
            Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
            A01 = cls2.getConstructor(new Class[0]);
            A03 = AbstractC58318PtA.A0t(cls2, "build");
        }
    }
}
