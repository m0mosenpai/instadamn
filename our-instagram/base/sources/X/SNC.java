package X;

/* loaded from: classes10.dex */
public abstract class SNC {
    public static final C62997SaL A00;
    public static final SNC A02;
    public static final SNC A03;
    public static final SNC A05;
    public static final SNC A04 = new Object();
    public static final SNC A01 = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.SNC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.SNC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.SNC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.SNC] */
    static {
        ?? obj = new Object();
        A02 = obj;
        A05 = new Object();
        A03 = obj;
        A00 = new C62997SaL(C62997SaL.A04, obj, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
    }

    public final float A00(int i, int i2, int i3, int i4) {
        if (this instanceof QBT) {
            return 1.0f;
        }
        if (this instanceof QBS) {
            return Math.min(i3 / i, i4 / i2);
        }
        if (this instanceof QBR) {
            return Math.max(i3 / i, i4 / i2);
        }
        return Math.min(1.0f, A04.A00(i, i2, i3, i4));
    }

    public final Integer A01(int i, int i2, int i3, int i4) {
        if (!(this instanceof QBT) && !(this instanceof QBS) && !(this instanceof QBR) && A00(i, i2, i3, i4) != 1.0f) {
            return A04.A01(i, i2, i3, i4);
        }
        return C05F.A01;
    }
}
