package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;

/* loaded from: classes11.dex */
public class UCx extends Spinner {
    public static final int[] A08 = {R.attr.spinnerMode};
    public int A00;
    public SpinnerAdapter A01;
    public InterfaceC71999XEn A02;
    public WO8 A03;
    public final Context A04;
    public final Rect A05;
    public final C3WT A06;
    public final boolean A07;

    public final int A00(Drawable drawable, SpinnerAdapter spinnerAdapter) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.A05;
            drawable.getPadding(rect);
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC71999XEn interfaceC71999XEn = this.A02;
        if (interfaceC71999XEn != null) {
            return interfaceC71999XEn.BEJ();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC71999XEn interfaceC71999XEn = this.A02;
        if (interfaceC71999XEn != null) {
            return interfaceC71999XEn.CEs();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.A02 != null) {
            return this.A00;
        }
        return super.getDropDownWidth();
    }

    public final InterfaceC71999XEn getInternalPopup() {
        return this.A02;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC71999XEn interfaceC71999XEn = this.A02;
        if (interfaceC71999XEn != null) {
            return interfaceC71999XEn.Aes();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.A04;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC71999XEn interfaceC71999XEn = this.A02;
        if (interfaceC71999XEn != null) {
            return interfaceC71999XEn.BED();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3WT c3wt = this.A06;
        if (c3wt != null) {
            return c3wt.A00();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3WT c3wt = this.A06;
        if (c3wt != null) {
            return c3wt.A01();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (appCompatSpinner$SavedState.A00 && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new WOE(this, 2));
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC71999XEn interfaceC71999XEn = this.A02;
        if (interfaceC71999XEn != null) {
            if (!interfaceC71999XEn.CdI()) {
                interfaceC71999XEn.Ek9(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.WOx, android.widget.ListAdapter, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.A07) {
            this.A01 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC71999XEn interfaceC71999XEn = this.A02;
        if (interfaceC71999XEn == 0) {
            return;
        }
        Context context = this.A04;
        if (context == null) {
            context = getContext();
        }
        Resources.Theme theme = context.getTheme();
        ?? obj = new Object();
        obj.A01 = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            obj.A00 = (ListAdapter) spinnerAdapter;
        }
        if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (!C02O.A00(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
        interfaceC71999XEn.EPH(obj);
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC71999XEn interfaceC71999XEn = this.A02;
        if (interfaceC71999XEn != null) {
            interfaceC71999XEn.EVq(i);
            interfaceC71999XEn.EVp(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC71999XEn interfaceC71999XEn = this.A02;
        if (interfaceC71999XEn != null) {
            interfaceC71999XEn.Egm(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.A02 != null) {
            this.A00 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC71999XEn interfaceC71999XEn = this.A02;
        if (interfaceC71999XEn != null) {
            interfaceC71999XEn.EQC(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C71x.A00(this.A04, i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC71999XEn interfaceC71999XEn = this.A02;
        if (interfaceC71999XEn != null) {
            interfaceC71999XEn.Ebn(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3WT c3wt = this.A06;
        if (c3wt != null) {
            c3wt.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3WT c3wt = this.A06;
        if (c3wt != null) {
            c3wt.A06(mode);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        if (r1 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UCx(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r6 = 2130971211(0x7f040a4b, float:1.7551154E38)
            r5 = 0
            r10.<init>(r11, r12, r6)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.A05 = r0
            android.content.Context r0 = r10.getContext()
            X.C3WR.A03(r10, r0)
            int[] r7 = X.AbstractC53402cO.A0L
            r4 = 0
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r12, r7, r6, r4)
            X.3WT r0 = new X.3WT
            r0.<init>(r10)
            r10.A06 = r0
            r0 = 4
            int r1 = r3.getResourceId(r0, r4)
            if (r1 == 0) goto L35
            X.2aJ r0 = new X.2aJ
            r0.<init>(r11, r1)
            r10.A04 = r0
        L31:
            r0 = -1
            if (r13 != r0) goto L57
            goto L38
        L35:
            r10.A04 = r11
            goto L31
        L38:
            int[] r0 = X.UCx.A08     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L57
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r0, r6, r4)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L57
            boolean r0 = r1.hasValue(r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L52
            if (r0 == 0) goto L54
            int r13 = r1.getInt(r4, r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L52
            goto L54
        L49:
            r0 = move-exception
            if (r1 == 0) goto L51
            r1.recycle()
            throw r0
        L50:
            r0 = move-exception
        L51:
            throw r0
        L52:
            if (r1 == 0) goto L57
        L54:
            r1.recycle()
        L57:
            r2 = 1
            if (r13 == 0) goto Lc7
            if (r13 != r2) goto L97
            android.content.Context r0 = r10.A04
            X.UDs r1 = new X.UDs
            r1.<init>(r0, r12, r10)
            android.content.Context r9 = r10.A04
            android.content.res.TypedArray r7 = r9.obtainStyledAttributes(r12, r7, r6, r4)
            r8 = 3
            r0 = -2
            int r0 = r7.getLayoutDimension(r8, r0)
            r10.A00 = r0
            boolean r0 = r7.hasValue(r2)
            if (r0 == 0) goto Lc2
            int r0 = r7.getResourceId(r2, r4)
            if (r0 == 0) goto Lc2
            android.graphics.drawable.Drawable r0 = X.C71x.A00(r9, r0)
        L81:
            r1.EQC(r0)
            r0 = 2
            java.lang.String r0 = r3.getString(r0)
            r1.A02 = r0
            r7.recycle()
            r10.A02 = r1
            X.UDn r0 = new X.UDn
            r0.<init>(r10, r1, r10)
            r10.A03 = r0
        L97:
            java.lang.CharSequence[] r4 = r3.getTextArray(r4)
            if (r4 == 0) goto Lae
            r0 = 17367048(0x1090008, float:2.5162948E-38)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r11, r0, r4)
            r0 = 2131629599(0x7f0e161f, float:1.8886523E38)
            r1.setDropDownViewResource(r0)
            r10.setAdapter(r1)
        Lae:
            r3.recycle()
            r10.A07 = r2
            android.widget.SpinnerAdapter r0 = r10.A01
            if (r0 == 0) goto Lbc
            r10.setAdapter(r0)
            r10.A01 = r5
        Lbc:
            X.3WT r0 = r10.A06
            r0.A07(r12, r6)
            return
        Lc2:
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r2)
            goto L81
        Lc7:
            X.WI4 r1 = new X.WI4
            r1.<init>(r10)
            r10.A02 = r1
            r0 = 2
            java.lang.String r0 = r3.getString(r0)
            r1.A01 = r0
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UCx.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3WT c3wt = this.A06;
        if (c3wt != null) {
            c3wt.A02();
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-876323291);
        super.onDetachedFromWindow();
        InterfaceC71999XEn interfaceC71999XEn = this.A02;
        if (interfaceC71999XEn != null && interfaceC71999XEn.CdI()) {
            interfaceC71999XEn.dismiss();
        }
        C0f9.A0D(152169190, A06);
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), A00(getBackground(), getAdapter())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1 == false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, androidx.appcompat.widget.AppCompatSpinner$SavedState] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.appcompat.widget.AppCompatSpinner$SavedState r2 = new androidx.appcompat.widget.AppCompatSpinner$SavedState
            r2.<init>(r0)
            X.XEn r0 = r3.A02
            if (r0 == 0) goto L14
            boolean r1 = r0.CdI()
            r0 = 1
            if (r1 != 0) goto L15
        L14:
            r0 = 0
        L15:
            r2.A00 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UCx.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A05 = C0f9.A05(-455843648);
        WO8 wo8 = this.A03;
        if (wo8 != null && wo8.onTouch(this, motionEvent)) {
            onTouchEvent = true;
            i = 1183333584;
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = -93545254;
        }
        C0f9.A0C(i, A05);
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3WT c3wt = this.A06;
        if (c3wt != null) {
            c3wt.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3WT c3wt = this.A06;
        if (c3wt != null) {
            c3wt.A04(i);
        }
    }
}
