package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.reels.question.model.QuestionResponseReshareModel;

/* renamed from: X.8xZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202558xZ extends Drawable implements Drawable.Callback, BCC {
    public final Paint A00 = new Paint(1);
    public final QuestionResponseReshareModel A01;

    public AbstractC202558xZ(QuestionResponseReshareModel questionResponseReshareModel) {
        this.A01 = questionResponseReshareModel;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable;
        C6RB c6rb;
        boolean z = this instanceof C221209pi;
        if (z) {
            drawable = ((C221209pi) this).A0A;
        } else {
            drawable = ((C221199ph) this).A06;
        }
        drawable.mutate().setAlpha(i);
        this.A00.setAlpha(i);
        if (z) {
            c6rb = ((C221209pi) this).A0B;
        } else {
            c6rb = ((C221199ph) this).A07;
        }
        c6rb.mutate().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable;
        C6RB c6rb;
        boolean z = this instanceof C221209pi;
        if (z) {
            drawable = ((C221209pi) this).A0A;
        } else {
            drawable = ((C221199ph) this).A06;
        }
        drawable.mutate().setColorFilter(colorFilter);
        this.A00.setColorFilter(colorFilter);
        if (z) {
            c6rb = ((C221209pi) this).A0B;
        } else {
            c6rb = ((C221199ph) this).A07;
        }
        c6rb.mutate().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // X.BCC
    public final C22932A9c Bjc() {
        return this.A01.A02;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
