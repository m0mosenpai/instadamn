package com.instagram.ui.widget.filmstriptimeline;

import X.AbstractC22994ABt;
import X.AbstractC55922hc;
import X.BDJ;
import X.C14360o3;
import X.C23689AeO;
import X.C51683MsE;
import X.C8J6;
import X.C8R4;
import X.C8R6;
import X.C8R7;
import X.C8R8;
import X.C8RA;
import X.C8RB;
import X.C8RH;
import X.C8RI;
import X.C8RL;
import X.C8RN;
import X.InterfaceC184998Io;
import X.RunnableC24813AyZ;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class FilmstripTimelineView extends FrameLayout {
    public InterfaceC184998Io A00;
    public boolean A01;
    public boolean A02;
    public C8RA A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Drawable A07;
    public final FrameLayout A08;
    public final C8RN A09;
    public final C8RH A0A;
    public final C8RB A0B;
    public final int A0C;
    public final C8R6 A0D;
    public final C8R4 A0E;
    public final C8R8 A0F;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilmstripTimelineView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A00() {
        C8RN c8rn = this.A09;
        ViewGroup.LayoutParams layoutParams = c8rn.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
            c8rn.setLayoutParams(layoutParams);
            c8rn.requestLayout();
        }
    }

    public final void A01(float f, float f2) {
        if (f >= 0.0f && f <= 1.0f && f2 >= 0.0f && f2 <= 1.0f && f <= f2) {
            C8RB c8rb = this.A0B;
            c8rb.A01 = f;
            c8rb.A02 = f2;
            c8rb.postInvalidate();
            this.A0A.A05(f, f2);
            C8RN c8rn = this.A09;
            c8rn.A01 = f;
            c8rn.A00 = f2;
        }
    }

    public final void A02(C8J6 c8j6, int i, int i2) {
        setSeekPosition(0.0f);
        C8RB c8rb = this.A0B;
        BDJ bdj = c8rb.A09;
        if (bdj == c8rb.A0B && c8rb.A07 == i && c8rb.A06 == i2) {
            return;
        }
        if (bdj != null) {
            bdj.reset();
        }
        C23689AeO c23689AeO = c8rb.A0B;
        if (c23689AeO == null) {
            Context context = c8rb.getContext();
            C14360o3.A07(context);
            c23689AeO = new C23689AeO(context, c8rb);
            c8rb.A0B = c23689AeO;
        }
        c8rb.A09 = c23689AeO;
        c23689AeO.A06 = c8j6;
        c8rb.A07 = i;
        c8rb.A06 = i2;
        c8rb.post(new RunnableC24813AyZ(c8rb, i, i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                requestDisallowInterceptTouchEvent(false);
            }
        } else {
            requestDisallowInterceptTouchEvent(true);
        }
        C8RH c8rh = this.A0A;
        if (c8rh.getVisibility() == 0 && c8rh.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setGeneratedVideoTimelineBitmaps(C51683MsE c51683MsE) {
        C14360o3.A0B(c51683MsE, 0);
        this.A0B.setGeneratedVideoTimelineBitmaps(c51683MsE);
        requestLayout();
    }

    public final void setMeasureSpecBuilder(C8RA c8ra) {
        C14360o3.A0B(c8ra, 0);
        this.A03 = c8ra;
        C8RB c8rb = this.A0B;
        ViewGroup.LayoutParams layoutParams = c8rb.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C8RA c8ra2 = this.A03;
        marginLayoutParams.setMargins(0, c8ra2.Bs3(), 0, c8ra2.Bs1());
        c8rb.setLayoutParams(marginLayoutParams);
        C8RH c8rh = this.A0A;
        ViewGroup.LayoutParams layoutParams2 = c8rh.getLayoutParams();
        C14360o3.A0C(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        C8RA c8ra3 = this.A03;
        marginLayoutParams2.setMargins(0, c8ra3.Bs3(), 0, c8ra3.Bs1());
        c8rh.setLayoutParams(marginLayoutParams2);
        requestLayout();
    }

    public final void setOverlaySegments(List list) {
        C14360o3.A0B(list, 0);
        this.A0B.setOverlaySegments(list);
    }

    public final void setShowSeekbar(boolean z) {
        this.A09.setVisibility(z ? 0 : 8);
    }

    public final void setTrimmerSnapValues(float[] fArr) {
        C14360o3.A0B(fArr, 0);
        this.A0A.A0C = fArr;
    }

    public final void setupTrimmer(AbstractC22994ABt abstractC22994ABt) {
        C14360o3.A0B(abstractC22994ABt, 0);
        abstractC22994ABt.A05 = this.A06;
        abstractC22994ABt.A02 = this.A04;
        if (this.A01) {
            int i = this.A05;
            Drawable drawable = this.A07;
            abstractC22994ABt.A03 = i;
            abstractC22994ABt.A06 = drawable;
        }
        if (this.A02) {
            int i2 = this.A05;
            Drawable drawable2 = this.A07;
            abstractC22994ABt.A04 = i2;
            abstractC22994ABt.A08 = drawable2;
        }
        this.A0A.setupTrimmer(abstractC22994ABt);
    }

    private final void setSeekbarMargins(FrameLayout.LayoutParams layoutParams) {
        int i;
        int i2;
        C8RH c8rh = this.A0A;
        if (c8rh.getVisibility() != 8) {
            boolean z = this.A01;
            i = this.A06;
            if (z) {
                i += this.A05;
            }
        } else {
            i = 0;
        }
        if (c8rh.getVisibility() != 8) {
            boolean z2 = this.A02;
            i2 = this.A06;
            if (z2) {
                i2 += this.A05;
            }
        } else {
            i2 = 0;
        }
        int i3 = this.A0C / 2;
        layoutParams.setMargins(i - i3, 0, i2 - i3, 0);
    }

    public final void A03(boolean z, boolean z2, boolean z3) {
        C8RN c8rn = this.A09;
        c8rn.A06 = z;
        c8rn.A08 = z2;
        c8rn.A07 = z3;
    }

    public final int getAdditionalHeightFromSeekbar() {
        C8RA c8ra = this.A03;
        return c8ra.Bs3() + c8ra.Bs1();
    }

    public final int getFilmstripTimelineWidth() {
        return this.A0B.getWidth();
    }

    public final boolean getIncludeLeftHandle() {
        return this.A01;
    }

    public final boolean getIncludeRightHandle() {
        return this.A02;
    }

    public final int getInnerContainerLeft() {
        return this.A08.getLeft();
    }

    public final int getInnerContainerRight() {
        return this.A08.getRight();
    }

    public final float getLeftTrimmerPosition() {
        return this.A0A.getLeftTrimmerValue();
    }

    public final int getMaxSelectedFilmstripWidth() {
        int width = this.A08.getWidth();
        boolean z = this.A01;
        int i = this.A06;
        int i2 = i;
        if (z) {
            i += this.A05;
        }
        if (this.A02) {
            i2 += this.A05;
        }
        return width - (i + i2);
    }

    public final float getRightTrimmerPosition() {
        return this.A0A.getRightTrimmerValue();
    }

    public final float getScrollXPercent() {
        return this.A0B.getScrollXPercent();
    }

    public final float getSeekPosition() {
        return this.A09.A02;
    }

    public final float getWidthScrollXPercent() {
        return this.A0B.getWidthScrollXPercent();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        C8RA c8ra = this.A03;
        C8RB c8rb = this.A0B;
        super.onMeasure(c8ra.AEt(this, c8rb, i), this.A03.AEg(this, c8rb, i2));
    }

    public final void setCornerRadius(int i) {
        this.A0B.setCornerRadius(i);
    }

    public final void setDragBeyondAllowed(boolean z) {
        this.A0A.A06 = z;
    }

    public final void setDurationSlidingAllowed(boolean z) {
        this.A0A.A07 = z;
    }

    public final void setFilmstripScrollX(int i) {
        C8RB.A03(this.A0B, i, false);
    }

    public final void setFilmstripTimelineWidth(int i) {
        C8RB c8rb = this.A0B;
        ViewGroup.LayoutParams layoutParams = c8rb.getLayoutParams();
        layoutParams.width = -1;
        c8rb.setLayoutParams(layoutParams);
        c8rb.A08 = i;
        c8rb.A05 = getMaxSelectedFilmstripWidth();
    }

    public final void setInnerContainerClipChildren(boolean z) {
        FrameLayout frameLayout = this.A08;
        frameLayout.setClipChildren(z);
        frameLayout.requestLayout();
    }

    public final void setOnlyScrollXMargin(int i) {
        this.A0B.A04 = i;
        FrameLayout frameLayout = this.A08;
        if (frameLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
            frameLayout.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setScrollXMargin(int i) {
        C8RI c8ri = this.A0A.A04;
        if (c8ri != null) {
            c8ri.A06(0);
        }
        C8RB c8rb = this.A0B;
        c8rb.A0D = true;
        c8rb.postInvalidate();
        boolean z = this.A01;
        int i2 = this.A06;
        if (z) {
            i2 += this.A05;
        }
        c8rb.A04 = i2 + i;
        FrameLayout frameLayout = this.A08;
        if (frameLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
            frameLayout.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setScrollXPercent(float f) {
        C8RB.A03(this.A0B, r2.A08 * f, false);
    }

    public final void setSeekPosition(float f) {
        this.A09.setSeekbarValue(f);
    }

    public final void setSeekerWidth(int i) {
        this.A09.setSeekerWidth(i);
    }

    public final void setShowTrimmer(boolean z) {
        C8RH c8rh = this.A0A;
        int i = 8;
        if (z) {
            i = 0;
        }
        c8rh.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = this.A09.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        setSeekbarMargins((FrameLayout.LayoutParams) layoutParams);
    }

    public final void setTrimmerMaximumRange(float f) {
        this.A0A.setMaximumRange(f);
    }

    public final void setTrimmerMinimumRange(float f) {
        this.A0A.setMinimumRange(f);
    }

    public final void setAllowSeekbarTouch(boolean z) {
        A03(z, z, z);
    }

    public final void setIncludeLeftHandle(boolean z) {
        this.A01 = z;
    }

    public final void setIncludeRightHandle(boolean z) {
        this.A02 = z;
    }

    public final void setListener(InterfaceC184998Io interfaceC184998Io) {
        this.A00 = interfaceC184998Io;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilmstripTimelineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C8R4 c8r4 = new C8R4() { // from class: X.8R3
            @Override // X.C8R4
            public final void DOo(float f, float f2) {
                FilmstripTimelineView filmstripTimelineView = FilmstripTimelineView.this;
                InterfaceC184998Io interfaceC184998Io = filmstripTimelineView.A00;
                if (interfaceC184998Io != null) {
                    interfaceC184998Io.DOn(f, f2);
                }
                C8RH c8rh = filmstripTimelineView.A0A;
                filmstripTimelineView.A01(c8rh.getLeftTrimmerValue(), c8rh.getRightTrimmerValue());
            }

            @Override // X.C8R4
            public final void DOr(float f) {
                FilmstripTimelineView filmstripTimelineView = FilmstripTimelineView.this;
                InterfaceC184998Io interfaceC184998Io = filmstripTimelineView.A00;
                if (interfaceC184998Io != null) {
                    interfaceC184998Io.DOp(f);
                }
                C8RH c8rh = filmstripTimelineView.A0A;
                filmstripTimelineView.A01(c8rh.getLeftTrimmerValue(), c8rh.getRightTrimmerValue());
            }

            @Override // X.C8R4
            public final void DhT(float f) {
                FilmstripTimelineView filmstripTimelineView = FilmstripTimelineView.this;
                InterfaceC184998Io interfaceC184998Io = filmstripTimelineView.A00;
                if (interfaceC184998Io != null) {
                    interfaceC184998Io.DhR(f);
                }
                C8RH c8rh = filmstripTimelineView.A0A;
                filmstripTimelineView.A01(c8rh.getLeftTrimmerValue(), c8rh.getRightTrimmerValue());
            }

            @Override // X.C8R4
            public final void DuI() {
                InterfaceC184998Io interfaceC184998Io = FilmstripTimelineView.this.A00;
                if (interfaceC184998Io != null) {
                    interfaceC184998Io.DuJ(true);
                }
            }

            @Override // X.C8R4
            public final void DuK() {
                InterfaceC184998Io interfaceC184998Io = FilmstripTimelineView.this.A00;
                if (interfaceC184998Io != null) {
                    interfaceC184998Io.DuL(true);
                }
            }
        };
        this.A0E = c8r4;
        C8R6 c8r6 = new C8R6() { // from class: X.8R5
            @Override // X.C8R6
            public final void Djw(float f) {
                InterfaceC184998Io interfaceC184998Io = FilmstripTimelineView.this.A00;
                if (interfaceC184998Io != null) {
                    interfaceC184998Io.Djx(f);
                }
            }

            @Override // X.C8R6
            public final void DuI() {
                InterfaceC184998Io interfaceC184998Io = FilmstripTimelineView.this.A00;
                if (interfaceC184998Io != null) {
                    interfaceC184998Io.DuJ(false);
                }
            }

            @Override // X.C8R6
            public final void DuK() {
                InterfaceC184998Io interfaceC184998Io = FilmstripTimelineView.this.A00;
                if (interfaceC184998Io != null) {
                    interfaceC184998Io.DuL(false);
                }
            }
        };
        this.A0D = c8r6;
        C8R7 c8r7 = new C8R7(this);
        this.A0F = c8r7;
        this.A01 = true;
        this.A02 = true;
        this.A03 = new C8RA(this) { // from class: X.8R9
            public final int A00;
            public final int A01;

            @Override // X.C8RA
            public final int AEg(FilmstripTimelineView filmstripTimelineView, C8RB c8rb, int i2) {
                C14360o3.A0B(c8rb, 2);
                return View.MeasureSpec.makeMeasureSpec(c8rb.A06 + filmstripTimelineView.getAdditionalHeightFromSeekbar(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            }

            @Override // X.C8RA
            public final int AEt(FilmstripTimelineView filmstripTimelineView, C8RB c8rb, int i2) {
                return i2;
            }

            @Override // X.C8RA
            public final int Bs1() {
                return this.A00;
            }

            @Override // X.C8RA
            public final int Bs3() {
                return this.A01;
            }

            {
                Resources resources = this.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right) + resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
                this.A00 = dimensionPixelSize;
                this.A01 = dimensionPixelSize;
            }
        };
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0l);
        C14360o3.A07(obtainStyledAttributes);
        this.A01 = obtainStyledAttributes.getBoolean(0, true);
        this.A02 = obtainStyledAttributes.getBoolean(1, true);
        int i2 = obtainStyledAttributes.getInt(2, 0);
        this.A04 = i2;
        Drawable drawable = obtainStyledAttributes.getDrawable(3);
        if (drawable != null) {
            this.A07 = drawable;
            obtainStyledAttributes.recycle();
            Resources resources = context.getResources();
            setContentDescription(resources.getString(2131975756));
            this.A05 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            this.A06 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
            Drawable drawable2 = null;
            int i3 = 0;
            Drawable drawable3 = null;
            int i4 = 0;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
            this.A0C = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
            C8RB c8rb = new C8RB(context);
            this.A0B = c8rb;
            c8rb.A0A = c8r7;
            c8rb.setDimmerColor(i2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C8RA c8ra = this.A03;
            layoutParams.setMargins(0, c8ra.Bs3(), 0, c8ra.Bs1());
            addView(c8rb, layoutParams);
            FrameLayout frameLayout = new FrameLayout(context);
            this.A08 = frameLayout;
            addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            C8RH c8rh = new C8RH(context);
            this.A0A = c8rh;
            int i5 = this.A06;
            int i6 = this.A04;
            if (this.A01) {
                i3 = this.A05;
                drawable2 = this.A07;
            }
            if (this.A02) {
                i4 = this.A05;
                drawable3 = this.A07;
            }
            C8RI c8ri = new C8RI(-1, dimensionPixelSize, i5, 0);
            if (i3 > 0) {
                C8RL c8rl = new C8RL(i3, -1);
                c8rl.A00(drawable2, 0);
                c8ri.A08(c8rl);
            }
            if (i4 > 0) {
                C8RL c8rl2 = new C8RL(i4, -1);
                c8rl2.A00(drawable3, i5);
                c8ri.A09(c8rl2);
            }
            c8ri.A06(i6);
            c8rh.A04 = c8ri;
            if (c8rh.getWidth() > 0 && c8rh.getHeight() > 0) {
                C8RI c8ri2 = c8rh.A04;
                C14360o3.A0A(c8ri2);
                c8ri2.setBounds(0, 0, c8rh.getWidth(), c8rh.getHeight());
            }
            c8rh.invalidate();
            c8rh.A02 = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
            c8rh.A05 = c8r4;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            C8RA c8ra2 = this.A03;
            layoutParams2.setMargins(0, c8ra2.Bs3(), 0, c8ra2.Bs1());
            frameLayout.addView(c8rh, layoutParams2);
            C8RN c8rn = new C8RN(context);
            this.A09 = c8rn;
            c8rn.A05 = c8r6;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            setSeekbarMargins(layoutParams3);
            frameLayout.addView(c8rn, layoutParams3);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public /* synthetic */ FilmstripTimelineView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilmstripTimelineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
