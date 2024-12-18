package com.instagram.ui.igeditseekbar;

import X.AbstractC13630mp;
import X.AbstractC166987dD;
import X.AbstractC25229BEm;
import X.AbstractC31175DnJ;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC66357UBy;
import X.C0f9;
import X.C14360o3;
import X.MSW;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.R;
import java.util.List;

/* loaded from: classes9.dex */
public final class IgEditSeekBar extends AbstractC66357UBy {
    public int A00;
    public int A01;
    public int A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public Drawable A06;
    public final int A07;
    public final int A08;
    public final Paint A09;
    public final int A0A;
    public final int A0B;
    public final Context A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Drawable A0G;
    public final boolean A0H;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgEditSeekBar(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // X.AbstractC66357UBy
    public final boolean A03() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
    
        if (r13.A01 <= r2) goto L26;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.igeditseekbar.IgEditSeekBar.onDraw(android.graphics.Canvas):void");
    }

    private final int A00(float f) {
        return (this.A00 / 2) + this.A07 + ((int) (getLengthPx() * Math.min(1.0f, Math.max(0.0f, f / (super.A02 + getFatZeroExtraSegmentSize())))));
    }

    private final int getFatZeroExtraSegmentSize() {
        float f = super.A01;
        if (f != 0.0f && f != 1.0f) {
            return getFatZeroRadiusSegmentSize() * 2;
        }
        return getFatZeroRadiusSegmentSize();
    }

    private final int getFatZeroRadiusSegmentSize() {
        return Math.round(super.A02 / 100.0f);
    }

    private final int getKnobCenterX() {
        return (this.A00 / 2) + this.A07 + ((int) (super.A00 * getLengthPx()));
    }

    private final int getLeftBound() {
        return (this.A00 / 2) + this.A07;
    }

    private final int getRootCenterX() {
        return (this.A00 / 2) + this.A07 + (((int) (super.A01 * getLengthPx())) * (this.A0H ? 1 : 0));
    }

    private final int getSeekerBarSegmentSize() {
        return super.A02 + getFatZeroExtraSegmentSize();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = IgEditSeekBar.class.getName();
        C14360o3.A07(name);
        return name;
    }

    @Override // X.AbstractC66357UBy
    public int getCurrentPositionAsValue() {
        int A0A = AbstractC166987dD.A0A(super.A00 - super.A01, super.A02 + getFatZeroExtraSegmentSize());
        int abs = Math.abs(A0A);
        int fatZeroRadiusSegmentSize = getFatZeroRadiusSegmentSize();
        if (abs <= fatZeroRadiusSegmentSize) {
            return 0;
        }
        if (A0A <= 0) {
            fatZeroRadiusSegmentSize = -fatZeroRadiusSegmentSize;
        }
        return A0A - fatZeroRadiusSegmentSize;
    }

    public final int getKnobWidthInPx() {
        return this.A00;
    }

    public final void setActiveColor(int i) {
        this.A0E.setColor(i);
        Drawable mutate = this.A06.mutate();
        this.A06 = mutate;
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public final void setInactiveColor(int i) {
        this.A0F.setColor(i);
    }

    public final void setSeekBarHeight(float f) {
        this.A0E.setStrokeWidth(f);
        this.A0F.setStrokeWidth(f);
    }

    public final void setShouldOverrideVisualValue(boolean z) {
        this.A04 = z;
        this.A05 = z;
    }

    private final int getCenterY() {
        return MSW.A03(this);
    }

    @Override // X.AbstractC66357UBy
    public final float A02(int i) {
        int fatZeroRadiusSegmentSize = getFatZeroRadiusSegmentSize();
        if (i <= 0) {
            fatZeroRadiusSegmentSize = -fatZeroRadiusSegmentSize;
        }
        int i2 = i + fatZeroRadiusSegmentSize;
        if (Math.abs(i2) <= fatZeroRadiusSegmentSize) {
            return super.A01;
        }
        return (i2 / (super.A02 + getFatZeroExtraSegmentSize())) + super.A01;
    }

    @Override // X.AbstractC66357UBy, X.X97
    public final boolean Cee(float f, float f2) {
        return AbstractC31175DnJ.A1S((AbstractC166987dD.A01(f2, MSW.A03(this)) > this.A08 ? 1 : (AbstractC166987dD.A01(f2, MSW.A03(this)) == this.A08 ? 0 : -1)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.A06.setState(getDrawableState());
    }

    @Override // X.AbstractC66357UBy
    public int getLengthPx() {
        int width = getWidth();
        int i = this.A00 / 2;
        int i2 = this.A07;
        return ((width - i) - i2) - (i + i2);
    }

    @Override // X.AbstractC66357UBy, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-975113420);
        super.onDetachedFromWindow();
        C0f9.A0D(806346548, A06);
    }

    public final void setOverrideVisualValueList(List list) {
        super.A02 = AbstractC25229BEm.A09(list);
        this.A03 = list;
    }

    public final void setDisplayCurrentValueText(boolean z) {
        this.A04 = z;
    }

    public final void setKnobWidthInPx(int i) {
        this.A00 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgEditSeekBar(Context context, AttributeSet attributeSet) {
        super(AbstractC53242c7.A0I(context, R.attr.seekBarStyle), attributeSet);
        C14360o3.A0B(context, 1);
        this.A04 = true;
        this.A0H = true;
        this.A0C = context;
        Resources resources = context.getResources();
        Paint A0R = AbstractC166987dD.A0R();
        this.A0F = A0R;
        Context context2 = getContext();
        A0R.setColor(AbstractC53242c7.A0F(context2, R.attr.seekBarInactiveColor));
        A0R.setStrokeWidth(AbstractC166987dD.A04(resources, R.dimen.afi_indicator_arrow_margin_top));
        Paint.Cap cap = Paint.Cap.ROUND;
        A0R.setStrokeCap(cap);
        Paint A0R2 = AbstractC166987dD.A0R();
        this.A0E = A0R2;
        A0R2.setColor(AbstractC53242c7.A0F(context2, R.attr.seekBarActiveColor));
        A0R2.setStrokeWidth(AbstractC166987dD.A04(resources, R.dimen.afi_indicator_arrow_margin_top));
        A0R2.setStrokeCap(cap);
        Paint A0R3 = AbstractC166987dD.A0R();
        this.A09 = A0R3;
        A0R3.setColor(AbstractC53242c7.A0F(context2, R.attr.seekBarTextColor));
        A0R3.setTextSize(AbstractC166987dD.A04(resources, R.dimen.auth_title_text_size));
        A0R3.setAlpha(AbstractC53242c7.A0F(context2, R.attr.seekBarTextAlpha));
        A0R3.setTextAlign(Paint.Align.CENTER);
        A0R3.setAntiAlias(true);
        Paint A0R4 = AbstractC166987dD.A0R();
        this.A0D = A0R4;
        A0R4.setColor(AbstractC53242c7.A0F(context2, R.attr.seekBarRectangleRangeColor));
        A0R4.setAlpha(AbstractC53242c7.A0F(context2, R.attr.seekBarRectangleRangeAlpha));
        this.A0A = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0B = resources.getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
        this.A08 = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC55922hc.A15);
        C14360o3.A07(obtainStyledAttributes);
        this.A00 = resources.getDimensionPixelSize(obtainStyledAttributes.getResourceId(1, AbstractC53242c7.A0H(context2, R.attr.seekBarKnobSize)));
        this.A07 = obtainStyledAttributes.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness));
        this.A06 = AbstractC13630mp.A00(context2, obtainStyledAttributes.getResourceId(0, AbstractC53242c7.A0H(context2, R.attr.seekBarKnob)));
        obtainStyledAttributes.recycle();
        int A0H = AbstractC53242c7.A0H(context2, R.attr.seekBarRoot);
        this.A0G = A0H != 0 ? context2.getDrawable(A0H) : null;
    }
}
