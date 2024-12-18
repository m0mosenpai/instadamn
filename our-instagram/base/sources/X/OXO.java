package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.tagging.widget.TagsLayout;

/* loaded from: classes9.dex */
public final class OXO {
    public int A00;
    public int A01;
    public ImageView A02;
    public boolean A03;
    public final int A04;
    public final Resources A05;
    public final PointF A06;
    public final ViewGroup A0C;
    public final ImageView A0D;
    public final ImageView A0E;
    public final TextView A0F;
    public final UserSession A0G;
    public final C38321qM A0H;
    public final AbstractC50789Mc6 A0I;
    public final boolean A0J;
    public final int A0K;
    public final Rect A0A = new Rect(0, 0, 0, 0);
    public final Rect A08 = new Rect(0, 0, 0, 0);
    public final Rect A09 = new Rect(0, 0, 0, 0);
    public final Rect A0B = new Rect(0, 0, 0, 0);
    public final PointF A07 = new PointF(0.0f, 0.0f);

    public static ImageView A00(OXO oxo) {
        if (oxo.A02 == null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
            AbstractC50789Mc6 abstractC50789Mc6 = oxo.A0I;
            Context context = abstractC50789Mc6.getContext();
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.legacy_tag_close_bg);
            imageView.setVisibility(8);
            imageView.setFocusable(true);
            AbstractC166997dE.A18(context, imageView, 2131972317);
            oxo.A02 = imageView;
            abstractC50789Mc6.addView(imageView, layoutParams);
        }
        return oxo.A02;
    }

    public final PointF A01() {
        PointF pointF = this.A07;
        float f = pointF.x;
        Rect rect = this.A09;
        return new PointF(f - rect.left, pointF.y - rect.top);
    }

    public final void A02() {
        ViewGroup viewGroup = this.A0C;
        viewGroup.measure(0, 0);
        int measuredWidth = viewGroup.getMeasuredWidth() / 2;
        Rect rect = this.A0A;
        int i = ((int) this.A07.x) - measuredWidth;
        rect.left = i;
        rect.right = i + viewGroup.getMeasuredWidth();
    }

    public final void A03(int i) {
        Rect rect = this.A0A;
        int width = i - (rect.width() / 2);
        int width2 = rect.width();
        PointF pointF = this.A07;
        int i2 = (int) pointF.x;
        Resources resources = this.A05;
        int min = Math.min(Math.max(Math.max((((int) pointF.x) + resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material)) - rect.width(), Math.min(i2 - resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), width)), 0), this.A0I.getMeasuredWidth() - width2);
        Rect rect2 = this.A08;
        int i3 = this.A0K;
        rect2.set(i3 + min, rect.top, min + this.A0C.getMeasuredWidth() + i3, rect.bottom);
    }

    public final void A04(PointF pointF) {
        Rect rect;
        float f = pointF.x;
        Resources resources = this.A05;
        float max = Math.max(f, AbstractC166987dD.A04(resources, R.dimen.abc_select_dialog_padding_start_material));
        pointF.x = max;
        AbstractC50789Mc6 abstractC50789Mc6 = this.A0I;
        pointF.x = Math.min(max, abstractC50789Mc6.getMeasuredWidth() - resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
        float max2 = Math.max(pointF.y, AbstractC166987dD.A04(resources, R.dimen.accent_edge_thickness));
        pointF.y = max2;
        pointF.y = Math.min(max2, abstractC50789Mc6.getMeasuredHeight() - resources.getDimensionPixelSize(R.dimen.accent_edge_thickness));
        PointF pointF2 = this.A07;
        pointF2.set(pointF);
        this.A06.set(pointF.x / this.A01, pointF.y / this.A00);
        float f2 = pointF2.y - this.A04;
        pointF2.y = f2;
        int i = (int) pointF2.x;
        int i2 = (int) f2;
        ViewGroup viewGroup = this.A0C;
        int measuredWidth = viewGroup.getMeasuredWidth() / 2;
        if (!this.A0J ? i2 + this.A0E.getMeasuredHeight() + viewGroup.getMeasuredHeight() + resources.getDimensionPixelSize(R.dimen.accent_edge_thickness) > this.A00 : ((i2 - this.A0D.getMeasuredHeight()) - viewGroup.getMeasuredHeight()) - resources.getDimensionPixelSize(R.dimen.accent_edge_thickness) > 0) {
            this.A0E.setVisibility(8);
            ImageView imageView = this.A0D;
            imageView.setVisibility(0);
            int measuredHeight = i2 - imageView.getMeasuredHeight();
            rect = this.A0A;
            int i3 = i - measuredWidth;
            int i4 = i + measuredWidth;
            rect.set(i3, measuredHeight - viewGroup.getMeasuredHeight(), i4, measuredHeight);
            this.A0B.set(i3, measuredHeight - viewGroup.getMeasuredHeight(), i4, i2);
        } else {
            ImageView imageView2 = this.A0E;
            imageView2.setVisibility(0);
            this.A0D.setVisibility(8);
            int measuredHeight2 = imageView2.getMeasuredHeight() + i2;
            rect = this.A0A;
            int i5 = i - measuredWidth;
            int i6 = i + measuredWidth;
            rect.set(i5, measuredHeight2, i6, viewGroup.getMeasuredHeight() + measuredHeight2);
            this.A0B.set(i5, i2, i6, measuredHeight2 + viewGroup.getMeasuredHeight());
        }
        Context context = abstractC50789Mc6.getContext();
        UserSession userSession = this.A0G;
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        int A00 = (int) AbstractC13880nE.A00(context, (float) C18U.A00(A0j, userSession, 37172074364076599L));
        int A002 = (int) AbstractC13880nE.A00(context, (float) C18U.A00(A0j, userSession, 37172074364011062L));
        C38321qM c38321qM = this.A0H;
        boolean z = abstractC50789Mc6 instanceof C39383HaP;
        if (c38321qM != null && C18U.A06(A0j, userSession, 36327649433828091L) && (((c38321qM.CdW() && z) || C18U.A06(A0j, userSession, 36327649434548990L)) && A00 > 0 && A002 > 0)) {
            Rect A0U = AbstractC166987dD.A0U();
            A0U.left = Math.max(0, rect.left - A002);
            A0U.right = Math.min(rect.right + A002, this.A01);
            A0U.top = Math.max(0, rect.top - A00);
            A0U.bottom = Math.min(this.A00, rect.bottom + A00);
            Object parent = abstractC50789Mc6.getParent();
            if (parent != null && (parent instanceof TagsLayout)) {
                ((View) parent).setTouchDelegate(new C50783Mbr(A0U, A0U, abstractC50789Mc6, this));
            }
        }
        A03((int) pointF2.x);
    }

    public final boolean A06(MotionEvent motionEvent) {
        AbstractC50789Mc6 abstractC50789Mc6 = this.A0I;
        if (abstractC50789Mc6.isClickable()) {
            if (A05((int) motionEvent.getX(), (int) motionEvent.getY())) {
                if (motionEvent.getAction() == 0) {
                    this.A03 = true;
                } else if (motionEvent.getAction() == 1) {
                    this.A03 = false;
                    abstractC50789Mc6.setPressed(false);
                }
                Object parent = abstractC50789Mc6.getParent();
                if (parent != null && (parent instanceof TagsLayout)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    int childCount = viewGroup.getChildCount();
                    int i = 0;
                    while (i < childCount && viewGroup.getChildAt(i) != abstractC50789Mc6) {
                        i++;
                    }
                    Resources resources = viewGroup.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.bubble_external_padding);
                    Rect rect = new Rect(AbstractC50789Mc6.A01(abstractC50789Mc6).A08);
                    rect.inset(dimensionPixelSize, dimensionPixelSize);
                    Rect A0U = AbstractC166987dD.A0U();
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    RectF rectF = AbstractC13880nE.A01;
                    int applyDimension = (int) TypedValue.applyDimension(1, 250.0f, displayMetrics);
                    while (true) {
                        i++;
                        if (i < childCount) {
                            if (A0U.setIntersect(AbstractC50789Mc6.A01((AbstractC50789Mc6) viewGroup.getChildAt(i)).A08, rect)) {
                                A0U.inset(dimensionPixelSize, dimensionPixelSize);
                                if (!A0U.isEmpty() && A0U.width() * A0U.height() >= applyDimension) {
                                    if (motionEvent.getAction() == 1) {
                                        abstractC50789Mc6.bringToFront();
                                        ((View) parent).invalidate();
                                    }
                                }
                            }
                        } else {
                            if (motionEvent.getAction() == 0) {
                                abstractC50789Mc6.setPressed(true);
                                return true;
                            }
                            if (motionEvent.getAction() == 1) {
                                abstractC50789Mc6.performClick();
                                return true;
                            }
                        }
                    }
                }
                return true;
            }
            if (this.A03) {
                motionEvent.setAction(3);
                abstractC50789Mc6.setPressed(false);
                this.A03 = false;
                return true;
            }
        }
        return false;
    }

    public OXO(PointF pointF, ViewGroup viewGroup, ImageView imageView, ImageView imageView2, TextView textView, UserSession userSession, C38321qM c38321qM, AbstractC50789Mc6 abstractC50789Mc6, int i, int i2, boolean z) {
        this.A0I = abstractC50789Mc6;
        this.A0C = viewGroup;
        this.A0F = textView;
        this.A0E = imageView;
        this.A0D = imageView2;
        this.A06 = pointF;
        this.A05 = AbstractC25228BEl.A0M(abstractC50789Mc6);
        this.A0K = i;
        this.A04 = i2;
        this.A0J = z;
        this.A0H = c38321qM;
        this.A0G = userSession;
    }

    public final boolean A05(int i, int i2) {
        Rect A0U = AbstractC166987dD.A0U();
        int i3 = 0;
        while (true) {
            AbstractC50789Mc6 abstractC50789Mc6 = this.A0I;
            if (i3 >= abstractC50789Mc6.getChildCount()) {
                return false;
            }
            View childAt = abstractC50789Mc6.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(A0U);
                if (A0U.contains(i, i2)) {
                    return true;
                }
            }
            i3++;
        }
    }
}
