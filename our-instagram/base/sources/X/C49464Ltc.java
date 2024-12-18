package X;

import android.graphics.Bitmap;

/* renamed from: X.Ltc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49464Ltc implements MQ9 {
    @Override // X.MQ9
    public final Object AWr(AbstractC47450Kxf abstractC47450Kxf, InterfaceC23621Ds interfaceC23621Ds) {
        char c;
        C26056Bfj[] c26056BfjArr;
        C26056Bfj c26056Bfj;
        Bitmap bitmap;
        C31200Dnj c31200Dnj;
        String str;
        if (abstractC47450Kxf instanceof KY2) {
            KY2 ky2 = (KY2) abstractC47450Kxf;
            bitmap = (Bitmap) ky2.A03.A00;
            c31200Dnj = ky2.A01;
        } else {
            if (abstractC47450Kxf instanceof KY0) {
                bitmap = (Bitmap) ((KY0) abstractC47450Kxf).A02.A00;
                str = "";
                c26056BfjArr = new C26056Bfj[1];
                c = 0;
                c26056Bfj = new C26056Bfj(bitmap, null, str, "contentId", "requestid", "responseId", null, 96);
                c26056BfjArr[c] = c26056Bfj;
                return AbstractC25225BEi.A0z(new C51755Mte(AbstractC133095zb.A04(c26056BfjArr), 30));
            }
            if (abstractC47450Kxf instanceof KY1) {
                KY1 ky1 = (KY1) abstractC47450Kxf;
                bitmap = (Bitmap) ky1.A02.A00;
                c31200Dnj = ky1.A01;
            } else {
                if (abstractC47450Kxf instanceof C46011KXz) {
                    Bitmap bitmap2 = (Bitmap) ((C46011KXz) abstractC47450Kxf).A00.A00;
                    int width = bitmap2.getWidth();
                    int height = bitmap2.getHeight();
                    Bitmap A0F = AbstractC167007dF.A0F(width, height);
                    c = 0;
                    for (int i = 0; i < width; i++) {
                        for (int i2 = 0; i2 < height; i2++) {
                            int i3 = i2 - (height / 2);
                            if (((float) Math.sqrt(((i - (width / 2)) * (i - AbstractC166987dD.A02(width))) + (i3 * i3))) < 450.0f) {
                                A0F.setPixel(i, i2, -1);
                            }
                        }
                    }
                    c26056BfjArr = new C26056Bfj[1];
                    c26056Bfj = new C26056Bfj(A0F, new C51755Mte(AbstractC166987dD.A1J(new C25313BIi(C05F.A00, "111:222:333", 255, true)), 32), null, "contentId", "requestid", "responseId", null, 64);
                    c26056BfjArr[c] = c26056Bfj;
                    return AbstractC25225BEi.A0z(new C51755Mte(AbstractC133095zb.A04(c26056BfjArr), 30));
                }
                throw B4Z.A00();
            }
        }
        str = c31200Dnj.A00;
        c26056BfjArr = new C26056Bfj[1];
        c = 0;
        c26056Bfj = new C26056Bfj(bitmap, null, str, "contentId", "requestid", "responseId", null, 96);
        c26056BfjArr[c] = c26056Bfj;
        return AbstractC25225BEi.A0z(new C51755Mte(AbstractC133095zb.A04(c26056BfjArr), 30));
    }

    @Override // X.MQ9
    public final Object FDC(C51755Mte c51755Mte, InterfaceC23621Ds interfaceC23621Ds) {
        return new KY4("mockHandle");
    }
}
