package X;

import android.content.Context;

/* renamed from: X.8cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190958cr {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Integer A09;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C190958cr() {
        /*
            r11 = this;
            r1 = 0
            r6 = 0
            r2 = 0
            r10 = 1023(0x3ff, float:1.434E-42)
            r0 = r11
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r6
            r8 = r6
            r9 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190958cr.<init>():void");
    }

    public final int A00(Context context) {
        C14360o3.A0B(context, 1);
        return (int) (this.A03 * AbstractC188878Yd.A01(context));
    }

    public /* synthetic */ C190958cr(Integer num, float f, float f2, float f3, float f4, int i, int i2, int i3, int i4, int i5) {
        num = (i5 & 1) != 0 ? null : num;
        i = (i5 & 2) != 0 ? 0 : i;
        i2 = (i5 & 4) != 0 ? 0 : i2;
        i3 = (i5 & 8) != 0 ? 0 : i3;
        int i6 = (i5 & 16) == 0 ? i4 : 0;
        f = (i5 & 32) != 0 ? 0.0f : f;
        float f5 = (i5 & 64) == 0 ? f2 : 0.0f;
        f3 = (i5 & 128) != 0 ? 1.0f : f3;
        f4 = (i5 & 256) != 0 ? 0.2f : f4;
        float f6 = (i5 & 512) != 0 ? 0.3f : 0.0f;
        this.A09 = num;
        this.A05 = i;
        this.A06 = i2;
        this.A08 = i3;
        this.A07 = i6;
        this.A02 = f;
        this.A03 = f5;
        this.A00 = f3;
        this.A04 = f4;
        this.A01 = f6;
    }
}
