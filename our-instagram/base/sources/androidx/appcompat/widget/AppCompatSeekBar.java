package androidx.appcompat.widget;

import X.C3WR;
import X.C65858TvL;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.facebook.R;

/* loaded from: classes11.dex */
public class AppCompatSeekBar extends SeekBar {
    public final C65858TvL A00;

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        C65858TvL c65858TvL = this.A00;
        if (c65858TvL.A00 != null) {
            int max = c65858TvL.A05.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = c65858TvL.A00.getIntrinsicWidth();
                int intrinsicHeight = c65858TvL.A00.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                c65858TvL.A00.setBounds(-i, -i2, i, i2);
                float width = ((r6.getWidth() - r6.getPaddingLeft()) - r6.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r6.getPaddingLeft(), r6.getHeight() / 2);
                int i3 = 0;
                do {
                    c65858TvL.A00.draw(canvas);
                    canvas.translate(width, 0.0f);
                    i3++;
                } while (i3 <= max);
                canvas.restoreToCount(save);
            }
        }
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C3WR.A03(this, getContext());
        C65858TvL c65858TvL = new C65858TvL(this);
        this.A00 = c65858TvL;
        c65858TvL.A02(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C65858TvL c65858TvL = this.A00;
        Drawable drawable = c65858TvL.A00;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = c65858TvL.A05;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A00.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }
}
