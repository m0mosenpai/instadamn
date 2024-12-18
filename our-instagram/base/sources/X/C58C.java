package X;

/* renamed from: X.58C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58C {
    public static final Object[] A02;
    public static final C58C A00 = new Object();
    public static final float[] A01 = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile C005101q A03 = new C005101q(10);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.58C, java.lang.Object] */
    static {
        Object[] objArr = new Object[0];
        A02 = objArr;
        synchronized (objArr) {
            A03.A07((int) (1.15f * 100.0f), new C58D(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            A03.A07((int) (1.3f * 100.0f), new C58D(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            A03.A07((int) (1.5f * 100.0f), new C58D(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            A03.A07((int) (1.8f * 100.0f), new C58D(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            A03.A07((int) (2.0f * 100.0f), new C58D(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((A03.A01(0) / 100.0f) - 0.01f > 1.03f) {
        } else {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public final C58E A00(float f) {
        float A012;
        C58E c58e;
        float f2;
        C58D c58d;
        if (f >= 1.03f) {
            int i = (int) (f * 100.0f);
            C58E c58e2 = (C58E) AbstractC005201r.A00(A03, i);
            if (c58e2 == null) {
                C005101q c005101q = A03;
                if (c005101q.A01) {
                    AbstractC005201r.A01(c005101q);
                }
                int A002 = AbstractC005301s.A00(c005101q.A02, c005101q.A00, i);
                if (A002 >= 0) {
                    return (C58E) A03.A04(A002);
                }
                int i2 = (-(A002 + 1)) - 1;
                int i3 = i2 + 1;
                if (i3 >= A03.A00()) {
                    c58d = new C58D(new float[]{1.0f}, new float[]{f});
                } else {
                    if (i2 < 0) {
                        float[] fArr = A01;
                        c58e = new C58D(fArr, fArr);
                        A012 = 1.0f;
                    } else {
                        A012 = A03.A01(i2) / 100.0f;
                        c58e = (C58E) A03.A04(i2);
                    }
                    float A013 = A03.A01(i3) / 100.0f;
                    if (A012 == A013) {
                        f2 = 0.0f;
                    } else {
                        f2 = (f - A012) / (A013 - A012);
                    }
                    float max = 0.0f + ((1.0f - 0.0f) * Math.max(0.0f, Math.min(1.0f, f2)));
                    C58E c58e3 = (C58E) A03.A04(i3);
                    float[] fArr2 = A01;
                    float[] fArr3 = new float[9];
                    int i4 = 0;
                    do {
                        float f3 = fArr2[i4];
                        float AK9 = c58e.AK9(f3);
                        fArr3[i4] = AK9 + ((c58e3.AK9(f3) - AK9) * max);
                        i4++;
                    } while (i4 < 9);
                    c58d = new C58D(fArr2, fArr3);
                }
                synchronized (A02) {
                    C005101q clone = A03.clone();
                    clone.A07(i, c58d);
                    A03 = clone;
                }
                return c58d;
            }
            return c58e2;
        }
        return null;
    }
}
