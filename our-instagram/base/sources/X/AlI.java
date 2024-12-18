package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes4.dex */
public final class AlI implements BE3 {
    public int A00;
    public int A01;
    public int A02;
    public final SeekBar A03;
    public final C209739Pj A04;

    public AlI(View view, C190018bK c190018bK) {
        C14360o3.A0B(c190018bK, 2);
        c190018bK.A02.add(this);
        C24027AlK c24027AlK = new C24027AlK(c190018bK);
        SeekBar seekBar = (SeekBar) view.requireViewById(R.id.fast_scrubber);
        this.A03 = seekBar;
        final Context context = seekBar.getContext();
        final boolean A0L = AbstractC53242c7.A0L(context, R.attr.musicCreationShadowEnabled, false);
        C14360o3.A0A(context);
        C209739Pj c209739Pj = new C209739Pj(context, A0L);
        this.A04 = c209739Pj;
        seekBar.setThumb(new Drawable(context, A0L) { // from class: X.9Rp
            public final float A00;
            public final float A01;
            public final int A02;
            public final int A03;
            public final Paint A04;
            public final RectF A05;
            public final BUU A06;

            {
                BUU buu;
                C14360o3.A0B(context, 1);
                this.A05 = AbstractC166987dD.A0X();
                Resources resources = context.getResources();
                this.A03 = AbstractC166997dE.A08(resources);
                int A0D = AbstractC166997dE.A0D(resources);
                this.A02 = A0D;
                float A02 = AbstractC166987dD.A02(A0D);
                this.A01 = A02;
                this.A00 = resources.getDimension(R.dimen.abc_control_corner_material);
                Paint A0R = AbstractC166987dD.A0R();
                this.A04 = A0R;
                AbstractC166987dD.A1N(context, A0R, AbstractC53242c7.A0H(context, R.attr.fastScrubberDotColor));
                A0R.setAntiAlias(true);
                if (A0L) {
                    buu = BUU.A00(context, resources.getDimension(R.dimen.abc_control_corner_material), A02);
                } else {
                    buu = null;
                }
                this.A06 = buu;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                C14360o3.A0B(canvas, 0);
                BUU buu = this.A06;
                if (buu != null) {
                    buu.draw(canvas);
                }
                RectF rectF = this.A05;
                float f = this.A01;
                canvas.drawRoundRect(rectF, f, f, this.A04);
            }

            @Override // android.graphics.drawable.Drawable
            @Deprecated(message = "This declaration overrides deprecated members", replaceWith = @ReplaceWith(expression = "resolveOpacity(int, int)", imports = {}))
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                C14360o3.A0B(rect, 0);
                super.onBoundsChange(rect);
                RectF rectF = this.A05;
                float f = this.A03 / 2.0f;
                float f2 = this.A02 / 2.0f;
                rectF.set(rect.centerX() - f, rect.centerY() - f2, rect.centerX() + f, rect.centerY() + f2);
                BUU buu = this.A06;
                if (buu != null) {
                    float f3 = rectF.left;
                    float f4 = this.A00;
                    AbstractC167027dH.A0f(rectF, buu, f3, f4, f4);
                }
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                this.A04.setAlpha(i);
                BUU buu = this.A06;
                if (buu != null) {
                    AbstractC167027dH.A0h(buu, i);
                }
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.A04.setColorFilter(colorFilter);
                BUU buu = this.A06;
                if (buu != null) {
                    AbstractC167027dH.A0d(colorFilter, buu);
                }
                invalidateSelf();
            }
        });
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c209739Pj, new ColorDrawable(0)});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.progress);
        seekBar.setProgressDrawable(layerDrawable);
        AbstractC166997dE.A18(context, seekBar, 2131967975);
        seekBar.setOnSeekBarChangeListener(new C23288ATz(1, context, this, c24027AlK));
    }

    @Override // X.BE3
    public final void DUm(int i) {
    }

    @Override // X.BE3
    public final void CO5(List list, int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i3;
        this.A00 = i2;
        SeekBar seekBar = this.A03;
        seekBar.setMax(i - i2);
        seekBar.setProgress(i3);
        int i4 = this.A02 - this.A00;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(Math.min(AbstractC167007dF.A0B(it) / i4, 1.0f)));
        }
        C209739Pj c209739Pj = this.A04;
        c209739Pj.A00 = arrayList;
        c209739Pj.invalidateSelf();
    }

    @Override // X.BE3
    public final void DnB(int i) {
        this.A00 = i;
        this.A03.setMax(this.A02 - i);
    }

    @Override // X.BE3
    public final void DnC(int i) {
        this.A01 = i;
        this.A03.setProgress(i);
    }
}
