package X;

/* renamed from: X.8mz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196698mz {
    public final int A00;
    public final C196708n0 A01;
    public final Integer A02;
    public final Integer A03;
    public final byte[] A04;

    public C196698mz(C196708n0 c196708n0) {
        Integer num;
        this.A04 = null;
        this.A01 = c196708n0;
        this.A00 = 35;
        if (c196708n0 != null) {
            num = Integer.valueOf(c196708n0.A02);
        } else {
            num = null;
        }
        this.A03 = num;
        this.A02 = c196708n0 != null ? Integer.valueOf(c196708n0.A00) : null;
    }

    public C196698mz(byte[] bArr, int i) {
        this.A04 = bArr;
        this.A01 = null;
        this.A00 = i;
        this.A03 = null;
        this.A02 = null;
    }
}
