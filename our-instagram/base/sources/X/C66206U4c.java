package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.facebook.dsp.core.ColorData;

/* renamed from: X.U4c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66206U4c extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ViewPropertyAnimator A04;
    public FrameLayout A05;
    public C66213U4j A06;
    public C66205U4b A07;
    public C66205U4b A08;
    public U58 A09;
    public U6H A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public C66205U4b A0F;
    public final int A0G;
    public final U4W A0H;
    public final EnumC68205VFx A0I;
    public final C65981Txa A0J;
    public final float[] A0K;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C66205U4b c66205U4b;
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        if (this.A0A != U6H.A07 && (c66205U4b = this.A0F) != null && this.A0B) {
            int width = (int) (getWidth() / 2.0f);
            int i = this.A0C;
            c66205U4b.setBounds(width - i, this.A0E, width + i, this.A0D);
            c66205U4b.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0117, code lost:
    
        if (r27 == X.EnumC191908em.A09) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66206U4c(android.content.Context r25, X.U4W r26, X.EnumC191908em r27, X.C65981Txa r28, X.C6FH r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66206U4c.<init>(android.content.Context, X.U4W, X.8em, X.Txa, X.6FH, boolean):void");
    }

    public static final void A00(C66206U4c c66206U4c, int i) {
        FrameLayout frameLayout;
        C66205U4b c66205U4b = c66206U4c.A07;
        if (c66205U4b == null) {
            frameLayout = c66206U4c.A05;
            if (frameLayout != null) {
                c66205U4b = null;
            } else {
                return;
            }
        } else {
            c66205U4b.A01(i);
            frameLayout = c66206U4c.A05;
            if (frameLayout == null) {
                return;
            }
        }
        frameLayout.setForeground(c66205U4b);
    }

    public final void A01(ColorData colorData, C6FH c6fh, float f) {
        int i;
        int i2 = this.A00;
        if (colorData != null) {
            if (c6fh.CSL()) {
                i = colorData.A00;
            } else {
                i = colorData.A01;
            }
        } else {
            i = 16777215;
        }
        if (i2 != i) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), AbstractC25228BEl.A1Z(Integer.valueOf(i2), i));
            ofObject.setDuration(f * 1000);
            ofObject.addUpdateListener(new LM2(this, i, 1));
            ofObject.start();
        }
    }

    public final C65981Txa getConfig() {
        return this.A0J;
    }

    public final void setCustomBackgroundDrawable(Drawable drawable) {
        if (drawable == null) {
            C66213U4j c66213U4j = this.A06;
            if (c66213U4j != null) {
                c66213U4j.setVisibility(0);
                Drawable drawable2 = c66213U4j.A00;
                if (drawable2 instanceof U8Z) {
                    drawable2.setVisible(true, true);
                }
            }
            U58 u58 = this.A09;
            if (u58 != null) {
                u58.setImageDrawable(null);
                u58.setVisibility(8);
                return;
            }
            return;
        }
        U58 u582 = this.A09;
        if (u582 != null) {
            u582.setImageDrawable(drawable);
            u582.setVisibility(0);
        }
        C66213U4j c66213U4j2 = this.A06;
        if (c66213U4j2 == null) {
            return;
        }
        c66213U4j2.setVisibility(8);
        Drawable drawable3 = c66213U4j2.A00;
        if (!(drawable3 instanceof U8Z)) {
            return;
        }
        drawable3.setVisible(false, true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.A0A.A01) {
            i3 = Integer.MIN_VALUE;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, i3));
        U4W u4w = this.A0H;
        int measuredWidth = u4w.getMeasuredWidth();
        int measuredHeight = u4w.getMeasuredHeight() + this.A03;
        C66213U4j c66213U4j = this.A06;
        if (c66213U4j != null) {
            c66213U4j.A00(measuredWidth, measuredHeight);
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }
}
