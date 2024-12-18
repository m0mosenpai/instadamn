package X;

import android.graphics.Bitmap;

/* renamed from: X.BeR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25977BeR extends UMK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC24901Jp A01;

    public C25977BeR(InterfaceC24901Jp interfaceC24901Jp, int i) {
        this.A01 = interfaceC24901Jp;
        this.A00 = i;
    }

    @Override // X.AbstractC58712mU
    public final void A03(C1W1 c1w1) {
        this.A01.resumeWith(null);
    }

    @Override // X.UMK
    public final void A04(Bitmap bitmap) {
        Bitmap bitmap2;
        InterfaceC24901Jp interfaceC24901Jp = this.A01;
        if (bitmap != null) {
            float max = Math.max(bitmap.getWidth(), bitmap.getHeight()) / this.A00;
            if (max < 1.0f) {
                max = 1.0f;
            }
            float ceil = (float) Math.ceil(max);
            if (ceil > 1.0f) {
                ceil = 1.0f;
            }
            bitmap2 = AbstractC25236BEt.A0B(bitmap, ceil);
            C14360o3.A07(bitmap2);
        } else {
            bitmap2 = null;
        }
        interfaceC24901Jp.resumeWith(bitmap2);
    }
}
