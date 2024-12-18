package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class V7C extends AbstractC202988yG {
    public final AccelerateInterpolator A00;
    public final OvershootInterpolator A01;
    public final int A02;
    public final EnumC194908jr A03;
    public final ArrayList A04;

    @Override // X.AbstractC202988yG
    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, C57482kN c57482kN, float f, float f2, int i) {
        int A06 = AbstractC167007dF.A06(0, canvas, spannable);
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            int A0W = i % A0W();
            float min = Math.min(A0W() * 0.13f, 650.0f);
            float max = Math.max(A0W() - (Math.min(A0W() * 0.13f, 650.0f) * 2.0f), 0.0f);
            float f3 = A0W;
            float f4 = 1.0f;
            if (f3 <= min) {
                f4 = this.A01.getInterpolation(f3 / min);
            } else if (f3 > max) {
                if (f3 <= max + min) {
                    f4 = this.A00.getInterpolation(1.0f - ((f3 - max) / min));
                } else {
                    f4 = 0.0f;
                }
            }
            int i2 = this.A02;
            int min2 = Math.min(C1H4.A01(i2 * f4), i2);
            canvas.save();
            float f5 = 0.0f;
            canvas.translate(0.0f, (-(this.A0b.getTextSize() * 0.25f)) / 2.0f);
            float height = staticLayout.getHeight() / 2.0f;
            int i3 = AbstractC68630VYg.A00[this.A0E.ordinal()];
            if (i3 != 1) {
                f5 = staticLayout.getWidth();
                if (i3 != A06) {
                    f5 /= 2.0f;
                }
            }
            canvas.scale(f4, f4, f5, height);
            C190868ci c190868ci = (C190868ci) C4GL.A00(spannable, C190868ci.class);
            if (c190868ci != null) {
                c190868ci.A03 = Integer.valueOf(min2);
            }
            Iterator A13 = AbstractC166997dE.A13(this.A04);
            while (A13.hasNext()) {
                C71066WnO c71066WnO = (C71066WnO) AbstractC166997dE.A0l(A13);
                c71066WnO.A01.setAlpha(min2);
                c71066WnO.onPreDraw();
                c71066WnO.AQP(canvas);
            }
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return 5000;
    }

    @Override // X.AbstractC202988yG
    public final float A0U() {
        return this.A0A * 0.1f;
    }

    @Override // X.AbstractC202988yG
    public final float A0V() {
        return ((C6RB) this).A06 * 0.1f;
    }

    @Override // X.AbstractC202988yG
    public final EnumC194908jr A0X() {
        return this.A03;
    }

    @Override // X.AbstractC202988yG
    public final void A0Y() {
        if (!TextUtils.isEmpty(this.A0F)) {
            Iterator A13 = AbstractC166997dE.A13(this.A04);
            while (A13.hasNext()) {
                C71066WnO c71066WnO = (C71066WnO) AbstractC166997dE.A0l(A13);
                c71066WnO.A01.setAlpha(this.A02);
            }
            Spannable spannable = this.A0F;
            C14360o3.A07(spannable);
            C190868ci c190868ci = (C190868ci) C4GL.A00(spannable, C190868ci.class);
            if (c190868ci != null) {
                c190868ci.A03 = Integer.valueOf(this.A02);
            }
        }
    }

    public V7C(Context context, int i) {
        super(context, i);
        this.A01 = new OvershootInterpolator(2.0f);
        this.A00 = new AccelerateInterpolator(2.0f);
        this.A02 = Color.alpha(-1);
        this.A04 = new ArrayList();
        this.A03 = EnumC194908jr.A03;
    }

    @Override // X.C6RB
    public final void A0R() {
        super.A0R();
        ArrayList arrayList = this.A04;
        arrayList.clear();
        if (!TextUtils.isEmpty(this.A0F)) {
            Spannable spannable = this.A0F;
            C14360o3.A07(spannable);
            AnonymousClass016.A18(arrayList, C4GL.A06(spannable, C71066WnO.class));
        }
    }
}
