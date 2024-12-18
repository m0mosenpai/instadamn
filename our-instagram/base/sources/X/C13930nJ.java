package X;

/* renamed from: X.0nJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13930nJ {
    public final int A01;
    public final byte[] A02 = new byte[256];
    public int A00 = 0;

    public C13930nJ(int i) {
        if (i >= 1 && i <= 256) {
            this.A01 = i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
