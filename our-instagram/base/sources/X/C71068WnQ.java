package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.WnQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71068WnQ implements InterfaceC1119253e {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public ViewTreeObserver.OnGlobalLayoutListener A09;
    public boolean A0A;
    public boolean A0B;
    public final float A0C;
    public final float A0D;
    public final LinearLayout A0E;
    public final LinearLayout A0F;
    public final IgTextView A0G;
    public final TouchInterceptorFrameLayout A0H;
    public final RoundedCornerConstraintLayout A0I;
    public final float A0J;
    public final C68762Vbf A0L;
    public final C55942hf A0K = C55942hf.A04(30.0d, 10.0d);
    public int A08 = 0;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003e, code lost:
    
        if (r2.contains(r4, r3) != false) goto L6;
     */
    @Override // X.InterfaceC1119253e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DBd(X.GestureDetectorOnGestureListenerC148016lX r9, float r10, float r11) {
        /*
            r8 = this;
            r5 = 0
            r8.A0A = r5
            android.widget.LinearLayout r1 = r8.A0E
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r7 = 2
            int[] r0 = new int[r7]
            r1.getDrawingRect(r2)
            r1.getLocationOnScreen(r0)
            r1 = r0[r5]
            r6 = 1
            r0 = r0[r6]
            r2.offset(r1, r0)
            int r4 = (int) r10
            int r3 = (int) r11
            boolean r0 = r2.contains(r4, r3)
            if (r0 != 0) goto L40
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r1 = r8.A0I
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            int[] r0 = new int[r7]
            r1.getDrawingRect(r2)
            r1.getLocationOnScreen(r0)
            r1 = r0[r5]
            r0 = r0[r6]
            r2.offset(r1, r0)
            boolean r1 = r2.contains(r4, r3)
            r0 = 0
            if (r1 == 0) goto L41
        L40:
            r0 = 1
        L41:
            r1 = r0 ^ 1
            r8.A0B = r1
            boolean r0 = r9.A04()
            if (r0 == 0) goto L4e
            if (r1 == 0) goto L4e
            r5 = 1
        L4e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71068WnQ.DBd(X.6lX, float, float):boolean");
    }

    @Override // X.InterfaceC1119253e
    public final void DC2(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, float f5) {
        if (f5 >= 0.0f && f2 >= this.A06 && f2 >= this.A0D) {
            ViewOnTouchListenerC67974V4p.A02(this.A0L.A00);
        } else {
            gestureDetectorOnGestureListenerC148016lX.A02(this.A0K, 0.0f, this.A06, f4, f5);
        }
    }

    @Override // X.InterfaceC1119253e
    public final boolean Dmo(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        return false;
    }

    public static void A00(C71068WnQ c71068WnQ, StringBuilder sb) {
        sb.append("mInitViewCalledCount: ");
        sb.append(c71068WnQ.A08);
        sb.append(" mHorizontalMargin: ");
        sb.append(c71068WnQ.A01);
        sb.append(" mDefaultSpacing: ");
        sb.append(c71068WnQ.A00);
        sb.append(" mInitialActionListHeight: ");
        sb.append(c71068WnQ.A0C);
        sb.append(" mInitialActionListOffset: ");
        sb.append(c71068WnQ.A02);
        sb.append(" mMaxTranslateY: ");
        sb.append(c71068WnQ.A05);
        sb.append(" mInitialMediaMargin: ");
        sb.append(c71068WnQ.A03);
        sb.append(" mMaxY: ");
        sb.append(c71068WnQ.A06);
        sb.append(" mMinMediaScale: ");
        sb.append(c71068WnQ.A07);
        sb.append(" mMaxMediaScale: ");
        sb.append(c71068WnQ.A04);
        sb.append(" mTouchContainer.getHeight(): ");
    }

    @Override // X.InterfaceC1119253e
    public final void DBv(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, boolean z) {
        View view;
        float f4;
        try {
            float min = (float) Math.min(Math.max(f2, this.A05), 0.0d);
            RoundedCornerConstraintLayout roundedCornerConstraintLayout = this.A0I;
            roundedCornerConstraintLayout.setTranslationY(min);
            float f5 = this.A05;
            float min2 = (float) Math.min(Math.max((float) AbstractC70163Da.A04(r11, f5, r3, 0.0d, r8), this.A06 - f5), 0.0d);
            float f6 = (min * 2.0f) + min2 + this.A02;
            LinearLayout linearLayout = this.A0E;
            linearLayout.setTranslationY(f6);
            IgTextView igTextView = this.A0G;
            igTextView.setTranslationY(min + (min2 / 2.0f) + this.A02);
            float f7 = this.A05;
            float f8 = this.A02;
            if (f6 == (f7 * 2.0f) + min2 + f8 || f6 == f8) {
                float f9 = this.A06;
                if (f2 < f9) {
                    view = roundedCornerConstraintLayout;
                    f4 = ((f2 - f9) * 0.2f) + f7;
                } else if (f2 > 0.0f) {
                    view = this.A0F;
                    f4 = f2 * 0.2f;
                }
                view.setTranslationY(f4);
            }
            double d = this.A05;
            double d2 = this.A06;
            float min3 = (float) Math.min(Math.max((float) AbstractC70163Da.A04(r11, d, d2, r3, r1), this.A07), this.A04);
            roundedCornerConstraintLayout.setPivotX(roundedCornerConstraintLayout.getWidth() / 2);
            roundedCornerConstraintLayout.setPivotY(0.0f);
            roundedCornerConstraintLayout.setScaleX(min3);
            roundedCornerConstraintLayout.setScaleY(min3);
            double d3 = this.A0D;
            float min4 = (float) Math.min(Math.max((float) AbstractC70163Da.A04(r11, 0.0d, d3, r3, 0.0d), 0.0d), this.A01);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            int i = (int) min4;
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i;
            linearLayout.setLayoutParams(marginLayoutParams);
            int min5 = (int) Math.min(Math.max((int) AbstractC70163Da.A04(r11, 0.0d, d3, 255.0d, 0.0d), 0.0d), 255.0d);
            ColorStateList textColors = igTextView.getTextColors();
            textColors.getClass();
            igTextView.setTextColor(textColors.withAlpha(min5));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            A00(this, sb);
            sb.append(this.A0H.getHeight());
            sb.append(" mMediaContainer.getHeight(): ");
            sb.append(this.A0I.getHeight());
            C0w9.A06("GridQuickPreviewDragHelper#onDrag", sb.toString(), e);
        }
    }

    @Override // X.InterfaceC1119253e
    public final void Dwn(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX) {
        if ((((this.A04 == 1.0f && this.A0E.getTranslationY() >= 0.0f) || (this.A04 < 1.0f && this.A0I.getScaleY() == this.A04)) && !this.A0A) || (!this.A0A && this.A0B)) {
            ViewOnTouchListenerC67974V4p.A02(this.A0L.A00);
        }
    }

    public C71068WnQ(Context context, LinearLayout linearLayout, LinearLayout linearLayout2, IgTextView igTextView, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C68762Vbf c68762Vbf, RoundedCornerConstraintLayout roundedCornerConstraintLayout, float f) {
        this.A0H = touchInterceptorFrameLayout;
        this.A0I = roundedCornerConstraintLayout;
        this.A0F = linearLayout;
        this.A0E = linearLayout2;
        this.A0C = f;
        this.A0G = igTextView;
        this.A0L = c68762Vbf;
        this.A0J = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.A0D = -AbstractC13880nE.A04(context, 20);
    }

    @Override // X.InterfaceC1119253e
    public final boolean DC9(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, boolean z) {
        if (Math.abs(f2) <= this.A0J) {
            return false;
        }
        this.A0A = true;
        return true;
    }
}
