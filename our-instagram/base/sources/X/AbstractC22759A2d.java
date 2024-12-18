package X;

/* renamed from: X.A2d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22759A2d {
    public static int A00(float f, int i, int i2) {
        return ((((i >> 24) & 255) + ((int) ((((i2 >> 24) & 255) - r8) * f))) << 24) | ((((i >> 16) & 255) + ((int) ((((i2 >> 16) & 255) - r7) * f))) << 16) | ((((i >> 8) & 255) + ((int) ((((i2 >> 8) & 255) - r5) * f))) << 8) | ((i & 255) + ((int) (f * ((i2 & 255) - r4))));
    }
}
