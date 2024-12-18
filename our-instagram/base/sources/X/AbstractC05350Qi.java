package X;

/* renamed from: X.0Qi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05350Qi {
    public abstract int A02(int i);

    public abstract Object A03(int i);

    public final int A01(int i, int i2) {
        try {
            return A02(i);
        } catch (C03800Iv e) {
            C0DF.A00.A0A(e, "Could not get SomeArgs int arg at %d. Returning default %d.", Integer.valueOf(i), Integer.valueOf(i2));
            return i2;
        }
    }
}
