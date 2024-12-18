package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class UCo extends ProgressBar {
    public int A00;
    public int A01;
    public C68355VNp A02;
    public AbstractC69617VsK A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final AbstractC68255VJs A08;
    public final AbstractC68255VJs A09;
    public final Runnable A0A;
    public final Runnable A0B;

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - AbstractC65702TsY.A06(this), getHeight() - AbstractC65702TsY.A09(this));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        int i3;
        int paddingLeft;
        int paddingTop;
        super.onMeasure(i, i2);
        VKG currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            if (currentDrawingDelegate instanceof C67760Uxb) {
                i3 = -1;
            } else {
                C67756UxX c67756UxX = (C67756UxX) currentDrawingDelegate.A00;
                i3 = c67756UxX.A02 + (c67756UxX.A01 * 2);
            }
            int A01 = currentDrawingDelegate.A01();
            if (i3 < 0) {
                paddingLeft = getMeasuredWidth();
            } else {
                paddingLeft = i3 + getPaddingLeft() + getPaddingRight();
            }
            if (A01 < 0) {
                paddingTop = getMeasuredHeight();
            } else {
                paddingTop = A01 + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(paddingLeft, paddingTop);
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            if (A02() && z) {
                throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
            }
            AbstractC66307U8g abstractC66307U8g = (AbstractC66307U8g) getCurrentDrawable();
            if (abstractC66307U8g != null) {
                abstractC66307U8g.A01(false, false, false);
            }
            super.setIndeterminate(z);
            AbstractC66307U8g abstractC66307U8g2 = (AbstractC66307U8g) getCurrentDrawable();
            if (abstractC66307U8g2 != null) {
                abstractC66307U8g2.A01(A02(), false, false);
            }
            this.A04 = false;
        }
    }

    public void setIndicatorColor(int... iArr) {
        int i;
        if (iArr.length == 0) {
            TypedValue A02 = AbstractC1343565e.A02(getContext(), R.attr.colorPrimary);
            if (A02 != null) {
                i = A02.data;
            } else {
                i = -1;
            }
            iArr = new int[]{i};
        }
        AbstractC69617VsK abstractC69617VsK = this.A03;
        if (!Arrays.equals(abstractC69617VsK.A05, iArr)) {
            abstractC69617VsK.A05 = iArr;
            AbstractC69573Vrc abstractC69573Vrc = ((C67758UxZ) super.getIndeterminateDrawable()).A01;
            if (abstractC69573Vrc instanceof C67763Uxe) {
                C67763Uxe c67763Uxe = (C67763Uxe) abstractC69573Vrc;
                c67763Uxe.A01 = 0;
                int A01 = AbstractC69853Vwe.A01(c67763Uxe.A06.A05[0], ((AbstractC66307U8g) ((AbstractC69573Vrc) c67763Uxe).A00).A01);
                int[] iArr2 = ((AbstractC69573Vrc) c67763Uxe).A02;
                iArr2[0] = A01;
                iArr2[1] = A01;
            } else if (abstractC69573Vrc instanceof C67762Uxd) {
                C67762Uxd c67762Uxd = (C67762Uxd) abstractC69573Vrc;
                c67762Uxd.A04 = true;
                c67762Uxd.A01 = 1;
                Arrays.fill(((AbstractC69573Vrc) c67762Uxd).A02, AbstractC69853Vwe.A01(c67762Uxd.A05.A05[0], ((AbstractC66307U8g) ((AbstractC69573Vrc) c67762Uxd).A00).A01));
            } else {
                C67764Uxf c67764Uxf = (C67764Uxf) abstractC69573Vrc;
                c67764Uxf.A02 = 0;
                ((AbstractC69573Vrc) c67764Uxf).A02[0] = AbstractC69853Vwe.A01(c67764Uxf.A07.A05[0], ((AbstractC66307U8g) ((AbstractC69573Vrc) c67764Uxf).A00).A01);
                c67764Uxf.A01 = 0.0f;
            }
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            A01(i, false);
        }
    }

    public int getHideAnimationBehavior() {
        return this.A03.A00;
    }

    public int[] getIndicatorColor() {
        return this.A03.A05;
    }

    public int getShowAnimationBehavior() {
        return this.A03.A01;
    }

    public int getTrackColor() {
        return this.A03.A02;
    }

    public int getTrackCornerRadius() {
        return this.A03.A03;
    }

    public int getTrackThickness() {
        return this.A03.A04;
    }

    public void setAnimatorDurationScaleProvider(C68355VNp c68355VNp) {
        this.A02 = c68355VNp;
        if (super.getProgressDrawable() != null) {
            ((AbstractC66307U8g) super.getProgressDrawable()).A04 = c68355VNp;
        }
        if (super.getIndeterminateDrawable() != null) {
            ((AbstractC66307U8g) super.getIndeterminateDrawable()).A04 = c68355VNp;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.A03.A00 = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof C67758UxZ) {
            ((AbstractC66307U8g) drawable).A01(false, false, false);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
        super.setIndeterminateDrawable(drawable);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof C67759Uxa) {
                AbstractC66307U8g abstractC66307U8g = (AbstractC66307U8g) drawable;
                abstractC66307U8g.A01(false, false, false);
                super.setProgressDrawable(abstractC66307U8g);
                abstractC66307U8g.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.A03.A01 = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        AbstractC69617VsK abstractC69617VsK = this.A03;
        if (abstractC69617VsK.A02 != i) {
            abstractC69617VsK.A02 = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        AbstractC69617VsK abstractC69617VsK = this.A03;
        if (abstractC69617VsK.A03 != i) {
            abstractC69617VsK.A03 = Math.min(i, abstractC69617VsK.A04 / 2);
        }
    }

    public void setTrackThickness(int i) {
        AbstractC69617VsK abstractC69617VsK = this.A03;
        if (abstractC69617VsK.A04 != i) {
            abstractC69617VsK.A04 = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.A01 = i;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.VNp] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.VsK, X.UxY] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.UxX, X.VsK] */
    public UCo(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C65K.A00(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        AbstractC69617VsK abstractC69617VsK;
        this.A04 = false;
        this.A01 = 4;
        this.A0B = new RunnableC71294WrO(this);
        this.A0A = new RunnableC71295WrP(this);
        this.A09 = new UKE(this);
        this.A08 = new UKF(this);
        Context context2 = getContext();
        if (this instanceof CircularProgressIndicator) {
            ?? abstractC69617VsK2 = new AbstractC69617VsK(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
            int A04 = AbstractC167017dG.A04(context2);
            TypedArray A00 = C65M.A00(context2, attributeSet, C65N.A08, new int[0], R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
            abstractC69617VsK2.A02 = Math.max(AbstractC1567371w.A00(context2, A00, 2, dimensionPixelSize), abstractC69617VsK2.A04 * 2);
            abstractC69617VsK2.A01 = AbstractC1567371w.A00(context2, A00, 1, A04);
            abstractC69617VsK2.A00 = A00.getInt(0, 0);
            A00.recycle();
            abstractC69617VsK = abstractC69617VsK2;
        } else {
            ?? abstractC69617VsK3 = new AbstractC69617VsK(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
            TypedArray A002 = C65M.A00(context2, attributeSet, C65N.A0H, new int[0], R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
            abstractC69617VsK3.A00 = A002.getInt(0, 1);
            abstractC69617VsK3.A01 = A002.getInt(1, 0);
            A002.recycle();
            abstractC69617VsK3.A00();
            abstractC69617VsK3.A02 = abstractC69617VsK3.A01 == 1;
            abstractC69617VsK = abstractC69617VsK3;
        }
        this.A03 = abstractC69617VsK;
        TypedArray A003 = C65M.A00(context2, attributeSet, C65N.A03, new int[0], i, i2);
        A003.getInt(5, -1);
        this.A07 = Math.min(A003.getInt(3, -1), 1000);
        A003.recycle();
        this.A02 = new Object();
        this.A05 = true;
    }

    public static void A00(UCo uCo) {
        ((AbstractC66307U8g) uCo.getCurrentDrawable()).A01(false, false, true);
        if (super.getProgressDrawable() == null || !super.getProgressDrawable().isVisible()) {
            if (super.getIndeterminateDrawable() == null || !super.getIndeterminateDrawable().isVisible()) {
                uCo.setVisibility(4);
            }
        }
    }

    private VKG getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (super.getIndeterminateDrawable() == null) {
                return null;
            }
            return ((C67758UxZ) super.getIndeterminateDrawable()).A00;
        }
        if (super.getProgressDrawable() == null) {
            return null;
        }
        return ((C67759Uxa) super.getProgressDrawable()).A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A01(int i, boolean z) {
        C67764Uxf c67764Uxf;
        if (isIndeterminate()) {
            if (super.getProgressDrawable() != null) {
                this.A00 = i;
                this.A06 = z;
                this.A04 = true;
                if (super.getIndeterminateDrawable().isVisible() && Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
                    AbstractC69573Vrc abstractC69573Vrc = ((C67758UxZ) super.getIndeterminateDrawable()).A01;
                    if (abstractC69573Vrc instanceof C67763Uxe) {
                        C67763Uxe c67763Uxe = (C67763Uxe) abstractC69573Vrc;
                        boolean isVisible = ((AbstractC69573Vrc) c67763Uxe).A00.isVisible();
                        c67764Uxf = c67763Uxe;
                        if (isVisible) {
                            c67763Uxe.A04 = true;
                            c67763Uxe.A02.setRepeatCount(0);
                            return;
                        }
                    } else {
                        if (abstractC69573Vrc instanceof C67762Uxd) {
                            return;
                        }
                        C67764Uxf c67764Uxf2 = (C67764Uxf) abstractC69573Vrc;
                        if (c67764Uxf2.A04.isRunning()) {
                            return;
                        }
                        boolean isVisible2 = ((AbstractC69573Vrc) c67764Uxf2).A00.isVisible();
                        c67764Uxf = c67764Uxf2;
                        if (isVisible2) {
                            c67764Uxf2.A04.start();
                            return;
                        }
                    }
                    c67764Uxf.A00();
                    return;
                }
                AbstractC68255VJs abstractC68255VJs = this.A09;
                super.getIndeterminateDrawable();
                abstractC68255VJs.A00();
                return;
            }
            return;
        }
        super.setProgress(i);
        if (super.getProgressDrawable() == null || z) {
            return;
        }
        super.getProgressDrawable().jumpToCurrentState();
    }

    public final boolean A02() {
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                        return true;
                    }
                    return false;
                }
                if (!(parent instanceof View)) {
                    return true;
                }
                view = (View) parent;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return super.getIndeterminateDrawable();
        }
        return super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    public C67758UxZ getIndeterminateDrawable() {
        return (C67758UxZ) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C67759Uxa getProgressDrawable() {
        return (C67759Uxa) super.getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        int A03 = C0f9.A03(1215123895);
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
        C0f9.A0A(1267403212, A03);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1794676808);
        super.onAttachedToWindow();
        if (super.getProgressDrawable() != null && super.getIndeterminateDrawable() != null) {
            AbstractC69573Vrc abstractC69573Vrc = ((C67758UxZ) super.getIndeterminateDrawable()).A01;
            AbstractC68255VJs abstractC68255VJs = this.A09;
            if (abstractC69573Vrc instanceof C67764Uxf) {
                ((C67764Uxf) abstractC69573Vrc).A05 = abstractC68255VJs;
            } else if (abstractC69573Vrc instanceof C67763Uxe) {
                ((C67763Uxe) abstractC69573Vrc).A03 = abstractC68255VJs;
            }
        }
        if (super.getProgressDrawable() != null) {
            AbstractC66307U8g abstractC66307U8g = (AbstractC66307U8g) super.getProgressDrawable();
            AbstractC68255VJs abstractC68255VJs2 = this.A08;
            List list = abstractC66307U8g.A05;
            if (list == null) {
                list = new ArrayList();
                abstractC66307U8g.A05 = list;
            }
            if (!list.contains(abstractC68255VJs2)) {
                abstractC66307U8g.A05.add(abstractC68255VJs2);
            }
        }
        if (super.getIndeterminateDrawable() != null) {
            AbstractC66307U8g abstractC66307U8g2 = (AbstractC66307U8g) super.getIndeterminateDrawable();
            AbstractC68255VJs abstractC68255VJs3 = this.A08;
            List list2 = abstractC66307U8g2.A05;
            if (list2 == null) {
                list2 = new ArrayList();
                abstractC66307U8g2.A05 = list2;
            }
            if (!list2.contains(abstractC68255VJs3)) {
                abstractC66307U8g2.A05.add(abstractC68255VJs3);
            }
        }
        if (A02()) {
            if (this.A07 > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
        C0f9.A0D(-1474763308, A06);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-678117808);
        removeCallbacks(this.A0A);
        removeCallbacks(this.A0B);
        ((AbstractC66307U8g) getCurrentDrawable()).A01(false, false, false);
        if (super.getIndeterminateDrawable() != null) {
            AbstractC66307U8g abstractC66307U8g = (AbstractC66307U8g) super.getIndeterminateDrawable();
            AbstractC68255VJs abstractC68255VJs = this.A08;
            List list = abstractC66307U8g.A05;
            if (list != null && list.contains(abstractC68255VJs)) {
                abstractC66307U8g.A05.remove(abstractC68255VJs);
                if (abstractC66307U8g.A05.isEmpty()) {
                    abstractC66307U8g.A05 = null;
                }
            }
            AbstractC69573Vrc abstractC69573Vrc = ((C67758UxZ) super.getIndeterminateDrawable()).A01;
            if (abstractC69573Vrc instanceof C67764Uxf) {
                ((C67764Uxf) abstractC69573Vrc).A05 = null;
            } else if (abstractC69573Vrc instanceof C67763Uxe) {
                ((C67763Uxe) abstractC69573Vrc).A03 = null;
            }
        }
        if (super.getProgressDrawable() != null) {
            AbstractC66307U8g abstractC66307U8g2 = (AbstractC66307U8g) super.getProgressDrawable();
            AbstractC68255VJs abstractC68255VJs2 = this.A08;
            List list2 = abstractC66307U8g2.A05;
            if (list2 != null && list2.contains(abstractC68255VJs2)) {
                abstractC66307U8g2.A05.remove(abstractC68255VJs2);
                if (abstractC66307U8g2.A05.isEmpty()) {
                    abstractC66307U8g2.A05 = null;
                }
            }
        }
        super.onDetachedFromWindow();
        C0f9.A0D(-738072773, A06);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean A1N = AbstractC167007dF.A1N(i);
        if (this.A05) {
            ((AbstractC66307U8g) getCurrentDrawable()).A01(A02(), false, A1N);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        int A06 = C0f9.A06(-935244027);
        super.onWindowVisibilityChanged(i);
        if (this.A05) {
            ((AbstractC66307U8g) getCurrentDrawable()).A01(A02(), false, false);
        }
        C0f9.A0D(-130662281, A06);
    }

    @Override // android.widget.ProgressBar
    public /* bridge */ /* synthetic */ Drawable getIndeterminateDrawable() {
        return super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public /* bridge */ /* synthetic */ Drawable getProgressDrawable() {
        return super.getProgressDrawable();
    }
}
