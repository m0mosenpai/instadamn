package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Mc6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50789Mc6 extends ViewGroup {
    public int A00;
    public C75113Zb A01;
    public OXO A02;
    public C76733cL A03;
    public boolean A04;

    public AbstractC50789Mc6(Context context) {
        super(context, null, 0);
        this.A00 = -1;
        this.A04 = true;
    }

    public abstract String getTaggedId();

    public abstract CharSequence getText();

    public abstract C57482kN getTextLayoutParams();

    public abstract int getTextLineHeight();

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        PointF pointF;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(0, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        OXO A01 = A01(this);
        AbstractC50789Mc6 abstractC50789Mc6 = A01.A0I;
        int measuredWidth = abstractC50789Mc6.getMeasuredWidth();
        int measuredHeight = abstractC50789Mc6.getMeasuredHeight();
        if ((A01.A01 != measuredWidth || A01.A00 != measuredHeight) && measuredWidth != 0 && measuredHeight != 0 && (pointF = A01.A06) != null) {
            A01.A01 = measuredWidth;
            A01.A00 = measuredHeight;
            PointF pointF2 = new PointF();
            pointF2.x = pointF.x * A01.A01;
            pointF2.y = pointF.y * A01.A00;
            A01.A04(pointF2);
        }
    }

    public static OXO A01(AbstractC50789Mc6 abstractC50789Mc6) {
        OXO oxo = abstractC50789Mc6.A02;
        C18C.A07(oxo, "mTagViewDelegate not initialized");
        return oxo;
    }

    @Deprecated
    public final C38321qM getMedia() {
        C76733cL c76733cL = this.A03;
        if (c76733cL != null) {
            return c76733cL.A00();
        }
        return null;
    }

    public final OXO A02() {
        return A01(this);
    }

    public void A03() {
        int i;
        OXO A01 = A01(this);
        ImageView imageView = A01.A02;
        if (imageView != null && imageView.getVisibility() == 0) {
            i = 8;
        } else {
            imageView = OXO.A00(A01);
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public final void A04() {
        int measuredWidth;
        int i;
        int i2;
        int measuredHeight;
        OXO A01 = A01(this);
        Rect rect = A01.A09;
        Rect rect2 = A01.A08;
        rect.set(rect2);
        ViewGroup viewGroup = A01.A0C;
        Rect rect3 = new Rect(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
        int dimensionPixelSize = A01.A05.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        ImageView imageView = A01.A02;
        if (imageView != null && imageView.getVisibility() == 0) {
            rect.top -= dimensionPixelSize;
            rect3.top += dimensionPixelSize;
            rect3.bottom += dimensionPixelSize;
            if (rect2.right + dimensionPixelSize > A01.A0I.getMeasuredWidth()) {
                rect.left -= dimensionPixelSize;
                rect3.left += dimensionPixelSize;
                rect3.right += dimensionPixelSize;
            } else {
                rect.right += dimensionPixelSize;
            }
        }
        ImageView imageView2 = A01.A0E;
        if (imageView2.getVisibility() == 0) {
            int measuredHeight2 = rect.top - imageView2.getMeasuredHeight();
            rect.top = measuredHeight2;
            A01.A0I.layout(rect.left, measuredHeight2, rect.right, rect.bottom);
            int measuredWidth2 = imageView2.getMeasuredWidth() / 2;
            PointF A012 = A01.A01();
            int i3 = (int) A012.x;
            int i4 = (int) A012.y;
            imageView2.layout(i3 - measuredWidth2, i4, i3 + measuredWidth2, imageView2.getMeasuredHeight() + i4);
            rect3.top += imageView2.getMeasuredHeight();
            rect3.bottom += imageView2.getMeasuredHeight();
        } else {
            ImageView imageView3 = A01.A0D;
            if (imageView3.getVisibility() == 0) {
                int measuredHeight3 = rect.bottom + imageView3.getMeasuredHeight();
                rect.bottom = measuredHeight3;
                A01.A0I.layout(rect.left, rect.top, rect.right, measuredHeight3);
                int measuredWidth3 = imageView3.getMeasuredWidth() / 2;
                PointF A013 = A01.A01();
                imageView3.layout(((int) A013.x) - measuredWidth3, ((int) A013.y) - imageView3.getMeasuredHeight(), ((int) A013.x) + measuredWidth3, (int) A013.y);
            }
        }
        viewGroup.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        ImageView imageView4 = A01.A02;
        if (imageView4 != null && imageView4.getVisibility() == 0) {
            ImageView A00 = OXO.A00(A01);
            if (rect2.right + dimensionPixelSize > A01.A0I.getMeasuredWidth()) {
                measuredWidth = 0;
                i = rect3.top - dimensionPixelSize;
                i2 = A00.getMeasuredWidth();
                measuredHeight = (rect3.top - dimensionPixelSize) + A00.getMeasuredHeight();
            } else {
                measuredWidth = (rect3.right + dimensionPixelSize) - A00.getMeasuredWidth();
                i = rect3.top - dimensionPixelSize;
                i2 = rect3.right + dimensionPixelSize;
                measuredHeight = i + A00.getMeasuredHeight();
            }
            A00.layout(measuredWidth, i, i2, measuredHeight);
        }
    }

    public void A05(CharSequence charSequence, int i) {
        OXO A01 = A01(this);
        TextView textView = A01.A0F;
        AbstractC166987dD.A1O(textView.getContext(), textView, i);
        textView.setText(charSequence);
        textView.measure(0, 0);
        A01.A02();
    }

    public boolean A06() {
        ImageView imageView = A01(this).A02;
        if (imageView != null && imageView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean A07(int i, int i2) {
        ImageView imageView;
        OXO A01 = A01(this);
        if (A01.A0I.A04 && (imageView = A01.A02) != null && imageView.getVisibility() == 0) {
            Rect A0U = AbstractC166987dD.A0U();
            OXO.A00(A01).getHitRect(A0U);
            Rect rect = A01.A09;
            return A0U.contains(i - rect.left, i2 - rect.top);
        }
        return false;
    }

    public PointF getAbsoluteTagPosition() {
        return A01(this).A07;
    }

    public int getBubbleWidth() {
        return A01(this).A0A.width();
    }

    public Rect getDrawingBounds() {
        return A01(this).A08;
    }

    public PointF getNormalizedPosition() {
        return A01(this).A06;
    }

    public Rect getPreferredBounds() {
        return A01(this).A0A;
    }

    public PointF getRelativeTagPosition() {
        return A01(this).A01();
    }

    public Rect getVisibleBounds() {
        return A01(this).A0B;
    }

    public void setPosition(PointF pointF) {
        A01(this).A04(pointF);
    }

    public void setText(CharSequence charSequence) {
        OXO A01 = A01(this);
        TextView textView = A01.A0F;
        textView.setText(charSequence);
        textView.measure(0, 0);
        A01.A02();
    }

    public void setCarouselIndex(int i) {
        this.A00 = i;
    }

    public void setLazyMediaFetcher(C76733cL c76733cL) {
        this.A03 = c76733cL;
    }

    public void setMediaState(C75113Zb c75113Zb) {
        this.A01 = c75113Zb;
    }
}
