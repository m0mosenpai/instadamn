package X;

/* renamed from: X.5Sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117395Sy extends Exception {
    public final C2IG A00;
    public final C117395Sy A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C117395Sy(X.C4B6 r9, java.lang.Throwable r10, int r11, boolean r12) {
        /*
            r8 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Decoder init failed: ["
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = "], "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = r9.A0W
            java.lang.String r2 = "neg_"
            java.lang.String r1 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
            int r0 = java.lang.Math.abs(r11)
            java.lang.String r5 = X.AnonymousClass001.A0b(r1, r2, r0)
            r1 = 0
            r0 = r8
            r6 = r10
            r7 = r12
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117395Sy.<init>(X.4B6, java.lang.Throwable, int, boolean):void");
    }

    public C117395Sy(C2IG c2ig, C117395Sy c117395Sy, String str, String str2, String str3, Throwable th, boolean z) {
        super(str, th);
        this.A03 = str2;
        this.A04 = z;
        this.A00 = c2ig;
        this.A02 = str3;
        this.A01 = c117395Sy;
    }
}
