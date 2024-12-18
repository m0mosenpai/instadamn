package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9he, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216219he extends C5RN implements Drawable.Callback {
    public int A00;
    public final GradientDrawable A01;
    public final List A02;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AbstractC166987dD.A0Z(it).draw(canvas);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable != null) {
            return gradientDrawable.getIntrinsicHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public C216219he(Context context) {
        Drawable drawable;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        Drawable drawable2 = context.getDrawable(R.drawable.interactive_sticker_background);
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        this.A01 = gradientDrawable;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A02 = A1E;
        if (gradientDrawable != null) {
            Collections.addAll(A1E, gradientDrawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int A02 = (int) AbstractC166987dD.A02(Math.max((i3 - i) - this.A00, 0));
        int i5 = i + A02;
        int i6 = i3 - A02;
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(i5, i2, i6, i4);
        }
    }
}
