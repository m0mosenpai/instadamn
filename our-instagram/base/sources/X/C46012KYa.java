package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import com.facebook.R;

/* renamed from: X.KYa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46012KYa extends AbstractC44340Jif {
    public static Bitmap A02;
    public final int A00;
    public final C44333JiY A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46012KYa(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        C44333JiY c44333JiY = new C44333JiY(context);
        this.A01 = c44333JiY;
        this.A00 = C1H4.A01(this.A02);
        Bitmap bitmap = A02;
        if (bitmap == null) {
            bitmap = C6RR.A00(AbstractC166997dE.A0M(context), R.drawable.instagram_save_pano_filled_16);
            A02 = bitmap;
        }
        c44333JiY.A00 = bitmap;
        c44333JiY.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C44333JiY c44333JiY = this.A01;
        c44333JiY.setBounds(getBounds());
        c44333JiY.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    @Override // X.AbstractC44340Jif, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }
}
