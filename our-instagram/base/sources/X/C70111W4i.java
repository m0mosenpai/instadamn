package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.W4i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70111W4i {
    public final double A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final Exception A09;
    public final Integer A0A;
    public final byte[] A0B;

    public static C70111W4i A00(Exception exc) {
        return new C70111W4i(exc, C05F.A01, new byte[0], -1.0d, 0, 0, 0, 0, 0, 0, 0L, 0L);
    }

    public final String toString() {
        String str;
        JSR jsr = new JSR(C70111W4i.class.getSimpleName());
        Integer num = this.A0A;
        switch (num.intValue()) {
            case 0:
                str = "Success";
                break;
            case 1:
                str = "Failed";
                break;
            default:
                str = "Skipped";
                break;
        }
        jsr.A01(str, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        if (num == C05F.A00) {
            jsr.A02("sourceWidth", this.A03);
            jsr.A02("sourceHeight", this.A01);
            jsr.A02("sourceOrientation", this.A02);
            jsr.A03("sourceFileSize", this.A07);
            jsr.A02("targetWidth", this.A06);
            jsr.A02("targetHeight", this.A04);
        } else if (num == C05F.A0C) {
            jsr.A02("sourceWidth", this.A03);
            jsr.A02("sourceHeight", this.A01);
            jsr.A02("sourceOrientation", this.A02);
            jsr.A03("sourceFileSize", this.A07);
        } else {
            if (num == C05F.A01) {
                jsr.A04("retriable", false);
                jsr.A01(this.A09, "exception");
            }
            return jsr.toString();
        }
        jsr.A02("targetOrientation", 0);
        jsr.A03("targetFileSize", this.A08);
        jsr.A02("targetQuality", this.A05);
        JSR.A00(jsr, String.valueOf(this.A00), "psnr");
        return jsr.toString();
    }

    public C70111W4i(Exception exc, Integer num, byte[] bArr, double d, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2) {
        this.A0A = num;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A07 = j;
        this.A06 = i4;
        this.A04 = i5;
        this.A08 = j2;
        this.A05 = i6;
        this.A0B = bArr;
        this.A09 = exc;
        this.A00 = d;
    }
}
