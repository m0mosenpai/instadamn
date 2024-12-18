package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* renamed from: X.UOa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66590UOa extends C5FF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Paint A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66590UOa() {
        /*
            r2 = this;
            r1 = 0
            r0 = 7
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66590UOa.<init>():void");
    }

    public /* synthetic */ C66590UOa(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? 20 : i;
        float f = (i3 & 2) != 0 ? 4.0f : 0.0f;
        i2 = (i3 & 4) != 0 ? 335544320 : i2;
        this.A01 = i;
        this.A00 = f;
        this.A02 = i2;
        this.A03 = new Paint(1);
        StringBuilder sb = new StringBuilder();
        sb.append("tintblur:radius=");
        sb.append(i);
        sb.append(":downscale=");
        sb.append(f);
        sb.toString().getClass();
    }

    @Override // X.C5FF
    public final C1VO A00(Bitmap bitmap, AbstractC27691Vx abstractC27691Vx) {
        AbstractC167007dF.A1K(bitmap, abstractC27691Vx);
        float width = bitmap.getWidth();
        float f = this.A00;
        C1VO A00 = abstractC27691Vx.A00(Bitmap.Config.ARGB_8888, (int) (width / f), (int) (bitmap.getHeight() / f));
        try {
            Bitmap bitmap2 = (Bitmap) A00.A04();
            Canvas canvas = new Canvas(bitmap2);
            Rect rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
            Paint paint = this.A03;
            paint.setColorFilter(new PorterDuffColorFilter(this.A02, PorterDuff.Mode.SRC_ATOP));
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            int i = this.A01;
            NativeBlurFilter nativeBlurFilter = NativeBlurFilter.$redex_init_class;
            boolean z = true;
            if (i <= 0) {
                z = false;
            }
            C0Hf.A00(Boolean.valueOf(z));
            NativeBlurFilter.nativeIterativeBoxBlur(bitmap2, 2, i);
            C1VO A02 = A00.A02();
            A00.close();
            return A02;
        } catch (Throwable th) {
            C1VO.A01(A00);
            throw th;
        }
    }
}
