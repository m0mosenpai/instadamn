package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: X.UOz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66612UOz extends AbstractC56722j5 implements InterfaceC56762j9 {
    public float A00;
    public float A01;
    public StaticLayout A02;
    public final TextPaint A03;
    public final AbstractC56602it A04;
    public final String A05;

    public C66612UOz(AbstractC56612iu abstractC56612iu, C56682j1 c56682j1) {
        super(abstractC56612iu, c56682j1);
        int i;
        String str = abstractC56612iu.A0s;
        if (str != null) {
            this.A05 = str;
            AbstractC56612iu abstractC56612iu2 = super.A04;
            this.A04 = abstractC56612iu2.A0r;
            TextPaint textPaint = new TextPaint(1);
            this.A03 = textPaint;
            C56502ij c56502ij = abstractC56612iu2.A0U;
            if (c56502ij != null) {
                i = Color.argb(c56502ij.A00, c56502ij.A03, c56502ij.A02, c56502ij.A01);
            } else {
                i = -16777216;
            }
            textPaint.setColor(i);
            A00();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC56722j5
    public final void A0E(RectF rectF) {
        C14360o3.A0B(rectF, 0);
        StaticLayout staticLayout = this.A02;
        if (staticLayout != null) {
            float width = staticLayout.getWidth();
            if (this.A02 != null) {
                rectF.set(0.0f, 0.0f, width, r0.getHeight());
                return;
            }
        }
        C14360o3.A0F("textLayout");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66612UOz.A00():void");
    }

    @Override // X.AbstractC56722j5
    public final void A08(float f) {
        StaticLayout staticLayout = this.A02;
        if (staticLayout == null) {
            C14360o3.A0F("textLayout");
            throw C00O.createAndThrow();
        }
        staticLayout.getPaint().setAlpha(super.A01);
    }

    @Override // X.InterfaceC56762j9
    public final void ERi(ColorFilter colorFilter) {
        StaticLayout staticLayout = this.A02;
        if (staticLayout == null) {
            C14360o3.A0F("textLayout");
            throw C00O.createAndThrow();
        }
        staticLayout.getPaint().setColorFilter(colorFilter);
    }

    @Override // X.AbstractC56722j5
    public final void A07() {
        super.A07();
        A00();
    }

    @Override // X.AbstractC56722j5
    public final void A0A(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        canvas.translate(this.A00, this.A01);
        StaticLayout staticLayout = this.A02;
        if (staticLayout == null) {
            C14360o3.A0F("textLayout");
            throw C00O.createAndThrow();
        }
        staticLayout.draw(canvas);
        canvas.restore();
    }
}
