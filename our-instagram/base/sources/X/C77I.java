package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.77I, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77I implements InterfaceC70533Ep {
    public C7IM A00;
    public boolean A01;
    public boolean A02;
    public LayerDrawable A03;
    public String A04;
    public final int A05;
    public final int A06;
    public final LayerDrawable A07;
    public final LayerDrawable A08;
    public final TextPaint A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public C77I(Context context, C7IM c7im, String str, String str2, int i, int i2, int i3, int i4) {
        Drawable drawable = context.getDrawable(i3);
        C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        this.A08 = (LayerDrawable) drawable;
        Drawable drawable2 = context.getDrawable(i2);
        C14360o3.A0C(drawable2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) drawable2;
        this.A07 = layerDrawable;
        TextPaint textPaint = new TextPaint();
        this.A09 = textPaint;
        this.A03 = layerDrawable;
        this.A06 = context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A0A = str;
        this.A0B = context.getResources().getString(i);
        this.A0D = str2;
        this.A0C = context.getResources().getString(i4);
        this.A04 = str;
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
        textPaint.setAntiAlias(true);
        this.A00 = c7im;
        A00();
    }

    @Override // X.InterfaceC70533Ep
    public final void DA2(RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
    }

    @Override // X.InterfaceC70533Ep
    public final void EGe(Canvas canvas, View view, RefreshableNestedScrollingParent refreshableNestedScrollingParent, float f, int i, boolean z) {
        if (f > 0.0f) {
            canvas.save();
            try {
                canvas.translate(0.0f, ((view.getBottom() - view.getPaddingBottom()) - (i * f)) - this.A05);
                float width = canvas.getWidth();
                canvas.clipRect(0.0f, 0.0f, width, Float.MAX_VALUE);
                int i2 = this.A06;
                int i3 = (int) ((width - i2) / 2.0f);
                this.A03.setBounds(i3, 0, i3 + i2, i2);
                this.A03.setLevel((int) (Math.max(0.0f, f) * 10000.0f));
                this.A03.draw(canvas);
                StaticLayout staticLayout = new StaticLayout(this.A04, this.A09, (int) (canvas.getWidth() * 0.9d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                canvas.translate(width / 2.0f, i2 - r5);
                staticLayout.draw(canvas);
            } finally {
                canvas.restore();
            }
        }
    }

    @Override // X.InterfaceC70533Ep
    public final void EWc(boolean z) {
    }

    public final void A00() {
        String str;
        LayerDrawable layerDrawable;
        TextPaint textPaint;
        int i;
        String str2;
        boolean z = this.A02;
        boolean z2 = this.A01;
        if (z) {
            if (z2) {
                str2 = this.A0C;
            } else {
                str2 = this.A0B;
            }
            this.A04 = str2;
            layerDrawable = this.A08;
        } else {
            if (z2) {
                str = this.A0D;
            } else {
                str = this.A0A;
            }
            this.A04 = str;
            layerDrawable = this.A07;
        }
        this.A03 = layerDrawable;
        if (z2) {
            layerDrawable.setColorFilter(C3DY.A00(this.A00.A04.A04));
            textPaint = this.A09;
            i = this.A00.A04.A04;
        } else {
            layerDrawable.setColorFilter(null);
            textPaint = this.A09;
            i = this.A00.A00;
        }
        textPaint.setColor(i);
    }
}
