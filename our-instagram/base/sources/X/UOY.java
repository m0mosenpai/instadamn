package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* loaded from: classes11.dex */
public final class UOY extends C5FF {
    public final int A00;

    public UOY(int i, Float f) {
        if (f != null) {
            int floatValue = (int) (f.floatValue() * 255.0f);
            if (floatValue < 0) {
                floatValue = 0;
            } else if (floatValue > 255) {
                floatValue = 255;
            }
            i = (i & 16777215) | (floatValue << 24);
        }
        this.A00 = i;
        StringBuilder sb = new StringBuilder();
        sb.append("Tint. tintColor=");
        sb.append(i);
        AbstractC167017dG.A0n(null, ", mode=", sb).getClass();
    }

    @Override // X.C5FF
    public final void A01(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        new Canvas(bitmap).drawColor(this.A00);
    }
}
