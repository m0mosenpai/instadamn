package com.google.android.material.timepicker;

import X.AbstractC010103p;
import X.AbstractC1567371w;
import X.AbstractC25228BEl;
import X.AbstractC63123SdR;
import X.C02G;
import X.C02V;
import X.C0f9;
import X.C110964z8;
import X.C152756u3;
import X.C65N;
import X.C65O;
import X.C65Q;
import X.C72G;
import X.C72H;
import X.RunnableC71301WrV;
import X.UEP;
import X.ViewTreeObserverOnPreDrawListenerC55503Okw;
import X.X88;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class ClockFaceView extends ConstraintLayout implements X88 {
    public float A00;
    public int A01;
    public C65O A02;
    public String[] A03;
    public final int A04;
    public final ColorStateList A05;
    public final RectF A06;
    public final SparseArray A07;
    public final C02V A08;
    public final ClockHandView A09;
    public final Runnable A0A;
    public final float[] A0B;
    public final int[] A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final Rect A0G;

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C65O c65o = new C65O();
        this.A02 = c65o;
        C72H c72h = new C72H(0.5f);
        C72G c72g = new C72G(c65o.A00.A0K);
        c72g.A02 = c72h;
        c72g.A03 = c72h;
        c72g.A01 = c72h;
        c72g.A00 = c72h;
        c65o.setShapeAppearanceModel(new C65Q(c72g));
        this.A02.A0F(ColorStateList.valueOf(-1));
        setBackground(this.A02);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C65N.A0U, i, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A0A = new RunnableC71301WrV(this);
        obtainStyledAttributes.recycle();
        this.A0G = new Rect();
        this.A06 = new RectF();
        this.A07 = new SparseArray();
        this.A0B = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C65N.A09, i, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList A01 = AbstractC1567371w.A01(context, obtainStyledAttributes2, 1);
        this.A05 = A01;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.A09 = clockHandView;
        this.A04 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        int colorForState = A01.getColorForState(new int[]{android.R.attr.state_selected}, A01.getDefaultColor());
        this.A0C = new int[]{colorForState, colorForState, A01.getDefaultColor()};
        clockHandView.A09.add(this);
        int defaultColor = C02G.A02(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList A012 = AbstractC1567371w.A01(context, obtainStyledAttributes2, 0);
        setBackgroundColor(A012 != null ? A012.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC55503Okw(this, 1));
        setFocusable(true);
        obtainStyledAttributes2.recycle();
        this.A08 = new UEP(this, 10);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.A03 = strArr;
        LayoutInflater A0P = AbstractC25228BEl.A0P(this);
        SparseArray sparseArray = this.A07;
        int size = sparseArray.size();
        int i2 = 0;
        while (true) {
            int length = this.A03.length;
            if (i2 < Math.max(length, size)) {
                TextView textView = (TextView) sparseArray.get(i2);
                if (i2 >= length) {
                    removeView(textView);
                    sparseArray.remove(i2);
                } else {
                    if (textView == null) {
                        textView = (TextView) A0P.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                        sparseArray.put(i2, textView);
                        addView(textView);
                    }
                    textView.setVisibility(0);
                    textView.setText(this.A03[i2]);
                    textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                    AbstractC010103p.A0B(textView, this.A08);
                    textView.setTextColor(this.A05);
                }
                i2++;
            } else {
                this.A0E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
                this.A0F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
                this.A0D = resources.getDimensionPixelSize(R.dimen.direct_clips_stacks_message_height);
                return;
            }
        }
    }

    public static void A00(ClockFaceView clockFaceView) {
        RadialGradient radialGradient;
        RectF rectF = clockFaceView.A09.A08;
        int i = 0;
        while (true) {
            SparseArray sparseArray = clockFaceView.A07;
            if (i < sparseArray.size()) {
                TextView textView = (TextView) sparseArray.get(i);
                if (textView != null) {
                    Rect rect = clockFaceView.A0G;
                    textView.getDrawingRect(rect);
                    rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                    clockFaceView.offsetDescendantRectToMyCoords(textView, rect);
                    RectF rectF2 = clockFaceView.A06;
                    rectF2.set(rect);
                    if (!RectF.intersects(rectF, rectF2)) {
                        radialGradient = null;
                    } else {
                        radialGradient = new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, rectF.width() * 0.5f, clockFaceView.A0C, clockFaceView.A0B, Shader.TileMode.CLAMP);
                    }
                    textView.getPaint().setShader(radialGradient);
                    textView.invalidate();
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.A02.A0F(ColorStateList.valueOf(i));
    }

    public final void A0D() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        C110964z8 c110964z8 = new C110964z8();
        c110964z8.A0I(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.A01;
                C152756u3 c152756u3 = C110964z8.A02(c110964z8, id).A03;
                c152756u3.A0F = R.id.circle_center;
                c152756u3.A0G = i4;
                c152756u3.A00 = f;
                f += 360.0f / (childCount - i);
            }
        }
        c110964z8.A0G(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.A0A;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(2057602936);
        super.onFinishInflate();
        A0D();
        C0f9.A0D(-1193058468, A06);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.A03.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.A0D / Math.max(Math.max(this.A0E / displayMetrics.heightPixels, this.A0F / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.A0A;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockFaceView(Context context) {
        this(context, null);
    }
}
