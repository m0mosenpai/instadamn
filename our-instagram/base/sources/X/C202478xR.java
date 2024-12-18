package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.8xR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202478xR extends AbstractC130945vi {
    public boolean A00;
    public final int A01;
    public final LevelListDrawable A02;
    public final C24018Akw A03;
    public final Context A04;

    public C202478xR(Context context, C24018Akw c24018Akw) {
        LevelListDrawable levelListDrawable;
        C14360o3.A0B(c24018Akw, 2);
        this.A04 = context;
        this.A03 = c24018Akw;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        Drawable drawable = context.getDrawable(c24018Akw.A00.A00);
        if (drawable instanceof LevelListDrawable) {
            levelListDrawable = (LevelListDrawable) drawable;
        } else {
            levelListDrawable = null;
        }
        this.A02 = levelListDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A00) {
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            matrix.postTranslate(canvas.getWidth(), 0.0f);
            canvas.save();
            canvas.concat(matrix);
            LevelListDrawable levelListDrawable = this.A02;
            if (levelListDrawable != null) {
                levelListDrawable.draw(canvas);
            }
            canvas.restore();
            return;
        }
        LevelListDrawable levelListDrawable2 = this.A02;
        if (levelListDrawable2 == null) {
            return;
        }
        levelListDrawable2.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1O(this.A02);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        LevelListDrawable levelListDrawable = this.A02;
        if (levelListDrawable != null) {
            int i5 = this.A01;
            levelListDrawable.setBounds(i, i2, i + i5, i5 + i2);
        }
    }
}
