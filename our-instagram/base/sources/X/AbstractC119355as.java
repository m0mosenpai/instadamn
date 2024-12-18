package X;

/* renamed from: X.5as, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC119355as {
    public static final C114205Dh A00(float f, long j) {
        float A01 = C119365at.A01(j);
        float A02 = C119365at.A02(j);
        return new C114205Dh(A01 - f, A02 - f, A01 + f, A02 + f);
    }

    public static final C114205Dh A01(long j, long j2) {
        float A01 = C119365at.A01(j);
        float A02 = C119365at.A02(j);
        return new C114205Dh(A01, A02, A01 + C5YC.A02(j2), A02 + C5YC.A00(j2));
    }
}
