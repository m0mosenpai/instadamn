package androidx.cardview.widget;

import X.AbstractC115175Io;
import X.C115145Ik;
import X.C115165Im;
import X.C115185Ip;
import X.C5In;
import X.InterfaceC115155Il;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class CardView extends FrameLayout {
    public boolean A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final C5In A04;
    public static final int[] A06 = {R.attr.colorBackground};
    public static final InterfaceC115155Il A05 = new Object();

    public CardView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C115185Ip) ((C115165Im) this.A04).A00).A02;
    }

    public float getCardElevation() {
        return ((C115165Im) this.A04).A01.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.A02.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A02.left;
    }

    public int getContentPaddingRight() {
        return this.A02.right;
    }

    public int getContentPaddingTop() {
        return this.A02.top;
    }

    public float getMaxCardElevation() {
        return ((C115185Ip) ((C115165Im) this.A04).A00).A00;
    }

    public boolean getPreventCornerOverlap() {
        return this.A01;
    }

    public float getRadius() {
        return ((C115185Ip) ((C115165Im) this.A04).A00).A01;
    }

    public boolean getUseCompatPadding() {
        return this.A00;
    }

    public void setCardBackgroundColor(int i) {
        A05.EQB(ColorStateList.valueOf(i), this.A04);
    }

    public void setCardElevation(float f) {
        ((C115165Im) this.A04).A01.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        A05.EYf(this.A04, f);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            InterfaceC115155Il interfaceC115155Il = A05;
            C5In c5In = this.A04;
            ((C115145Ik) interfaceC115155Il).EYf(c5In, ((C115185Ip) ((C115165Im) c5In).A00).A00);
        }
    }

    public void setRadius(float f) {
        C115185Ip c115185Ip = (C115185Ip) ((C115165Im) this.A04).A00;
        if (f != c115185Ip.A01) {
            c115185Ip.A01 = f;
            C115185Ip.A00(null, c115185Ip);
            c115185Ip.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            InterfaceC115155Il interfaceC115155Il = A05;
            C5In c5In = this.A04;
            ((C115145Ik) interfaceC115155Il).EYf(c5In, ((C115185Ip) ((C115165Im) c5In).A00).A00);
        }
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.A02 = rect;
        this.A03 = new Rect();
        C115165Im c115165Im = new C115165Im(this);
        this.A04 = c115165Im;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC115175Io.A00, i, com.facebook.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(A06);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(getResources().getColor(fArr[2] > 0.5f ? com.facebook.R.color.abc_decor_view_status_guard_light : com.facebook.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.A00 = obtainStyledAttributes.getBoolean(7, false);
        this.A01 = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C115145Ik c115145Ik = (C115145Ik) A05;
        C115185Ip c115185Ip = new C115185Ip(valueOf, dimension);
        c115165Im.A00 = c115185Ip;
        CardView cardView = c115165Im.A01;
        cardView.setBackgroundDrawable(c115185Ip);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        c115145Ik.EYf(c115165Im, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A05.EQB(colorStateList, this.A04);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.facebook.R.attr.cardViewStyle);
    }
}
