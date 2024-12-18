package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.SeekBar;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BZI extends SeekBar implements SeekBar.OnSeekBarChangeListener {
    public int A00;
    public int A01;
    public boolean A02;
    public ValueAnimator A03;
    public SeekBar.OnSeekBarChangeListener A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final RectF A08;

    public BZI(Context context) {
        super(context, null, 0);
        this.A02 = true;
        this.A08 = AbstractC166987dD.A0X();
        this.A07 = AbstractC166987dD.A0R();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC55922hc.A0P, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        this.A00 = obtainStyledAttributes.getColor(1, context.getColor(R.color.body_parametric_default_progress_color));
        this.A01 = obtainStyledAttributes.getColor(1, context.getColor(R.color.black_10_transparent));
        this.A06 = obtainStyledAttributes.getDimensionPixelSize(3, 30);
        this.A05 = obtainStyledAttributes.getDimensionPixelSize(0, 30);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        Object valueOf;
        Object valueOf2;
        C14360o3.A0B(canvas, 0);
        Drawable thumb = getThumb();
        C14360o3.A07(getThumb().getBounds());
        float trackRange = getTrackRange();
        float trackRange2 = getTrackRange() / 2.0f;
        float f = this.A06 / 2.0f;
        int height = getHeight() / 2;
        float trackWidth = getTrackWidth();
        float f2 = trackWidth / 2.0f;
        RectF rectF = this.A08;
        float f3 = height;
        float f4 = f3 - f;
        float f5 = f3 + f;
        rectF.set(getPaddingLeft(), f4, trackWidth, f5);
        Paint paint = this.A07;
        paint.setColor(this.A01);
        float f6 = this.A05;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        if (getProgress() < trackRange2) {
            float progress = f2 - ((trackWidth / trackRange) * (trackRange2 - getProgress()));
            if (thumb.getBounds().left > progress) {
                valueOf2 = Integer.valueOf(thumb.getBounds().left);
            } else {
                valueOf2 = Float.valueOf(progress);
            }
            rectF.set(AbstractC166987dD.A09(valueOf2), f4, f2, f5);
            paint.setColor(this.A00);
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
        if (getProgress() > trackRange2) {
            float progress2 = ((trackWidth / trackRange) * (getProgress() - trackRange2)) + f2;
            if (thumb.getBounds().right < getLeft()) {
                valueOf = Integer.valueOf(thumb.getBounds().right);
            } else {
                valueOf = Float.valueOf(progress2);
            }
            rectF.set(f2, f4, AbstractC166987dD.A09(valueOf), f5);
            paint.setColor(this.A00);
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
        thumb.draw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) != 0) {
            i3 = View.MeasureSpec.getSize(i);
        } else {
            i3 = 0;
        }
        int intrinsicHeight = getThumb().getIntrinsicHeight();
        if (View.MeasureSpec.getMode(i2) != 0) {
            intrinsicHeight = (int) Math.min(intrinsicHeight, View.MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(i3, intrinsicHeight);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener;
        C14360o3.A0B(seekBar, 0);
        if ((z || this.A02) && (onSeekBarChangeListener = this.A04) != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        C14360o3.A0B(seekBar, 0);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A04;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C14360o3.A0B(seekBar, 0);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A04;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    public void setInitialProgress(int i) {
        A01(this, i, 0L);
    }

    public void setInitialProgress$SmoothSeekBar(int i) {
        A01(this, i, 0L);
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A04 = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(this);
    }

    public static final void A01(BZI bzi, int i, long j) {
        int progress = bzi.getProgress();
        ValueAnimator valueAnimator = bzi.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        bzi.A03 = null;
        bzi.A02 = true;
        ValueAnimator ofInt = ValueAnimator.ofInt(progress, i);
        ofInt.setDuration(j);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new LM2(bzi, i, 0));
        ofInt.start();
        bzi.A03 = ofInt;
    }

    private final int getTrackRange() {
        return getMax() - getMin();
    }

    private final int getTrackWidth() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        A01(this, i, getResources().getInteger(android.R.integer.config_mediumAnimTime));
    }

    public final void setFilledTrackColor(int i) {
        this.A00 = i;
    }

    public final void setUnFilledTrackColor(int i) {
        this.A01 = i;
    }
}
