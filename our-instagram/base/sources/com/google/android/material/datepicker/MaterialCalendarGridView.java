package com.google.android.material.datepicker;

import X.AbstractC010103p;
import X.AbstractC1343565e;
import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.AbstractC66384UEs;
import X.C0f9;
import X.C0fA;
import X.C3AY;
import X.C69410Vmu;
import X.UBE;
import X.UEP;
import X.UEx;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.facebook.R;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class MaterialCalendarGridView extends GridView {
    public final Calendar A00;
    public final boolean A01;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object obj;
        int A00;
        int left;
        int A002;
        int left2;
        int i;
        int i2;
        super.onDraw(canvas);
        UBE ube = (UBE) super.getAdapter();
        DateSelector dateSelector = ube.A03;
        C69410Vmu c69410Vmu = ube.A00;
        Month month = ube.A04;
        Long item = ube.getItem(month.A00());
        int A003 = month.A00();
        int i3 = month.A01;
        Long item2 = ube.getItem((A003 + i3) - 1);
        Iterator it = dateSelector.Bsm().iterator();
        while (it.hasNext()) {
            C3AY c3ay = (C3AY) it.next();
            Object obj2 = c3ay.A00;
            if (obj2 != null && (obj = c3ay.A01) != null) {
                long longValue = ((Number) obj2).longValue();
                long longValue2 = ((Number) obj).longValue();
                if (item != null && item2 != null) {
                    long longValue3 = item2.longValue();
                    if (longValue <= longValue3) {
                        long longValue4 = item.longValue();
                        if (longValue2 >= longValue4) {
                            boolean A1a = AbstractC65703TsZ.A1a(this);
                            if (longValue < longValue4) {
                                A00 = month.A00();
                                if (A00 % month.A02 == 0) {
                                    left = 0;
                                } else {
                                    View childAt = getChildAt(A00 - 1);
                                    if (!A1a) {
                                        left = childAt.getRight();
                                    } else {
                                        left = childAt.getLeft();
                                    }
                                }
                            } else {
                                this.A00.setTimeInMillis(longValue);
                                A00 = month.A00() + (r0.get(5) - 1);
                                View childAt2 = getChildAt(A00);
                                left = childAt2.getLeft() + (childAt2.getWidth() / 2);
                            }
                            if (longValue2 > longValue3) {
                                A002 = Math.min((month.A00() + i3) - 1, getChildCount() - 1);
                                if ((A002 + 1) % month.A02 == 0) {
                                    left2 = getWidth();
                                } else {
                                    View childAt3 = getChildAt(A002);
                                    if (!A1a) {
                                        left2 = childAt3.getRight();
                                    } else {
                                        left2 = childAt3.getLeft();
                                    }
                                }
                            } else {
                                this.A00.setTimeInMillis(longValue2);
                                A002 = month.A00() + (r0.get(5) - 1);
                                View childAt4 = getChildAt(A002);
                                left2 = childAt4.getLeft() + (childAt4.getWidth() / 2);
                            }
                            int itemId = (int) ube.getItemId(A002);
                            for (int itemId2 = (int) ube.getItemId(A00); itemId2 <= itemId; itemId2++) {
                                int numColumns = getNumColumns() * itemId2;
                                int numColumns2 = (getNumColumns() + numColumns) - 1;
                                View childAt5 = getChildAt(numColumns);
                                int top = childAt5.getTop();
                                Rect rect = c69410Vmu.A01.A00;
                                int i4 = top + rect.top;
                                int bottom = childAt5.getBottom() - rect.bottom;
                                if (!A1a) {
                                    i = left;
                                    if (numColumns > A00) {
                                        i = 0;
                                    }
                                    if (A002 <= numColumns2) {
                                        i2 = left2;
                                    }
                                    i2 = getWidth();
                                } else {
                                    i = left2;
                                    if (A002 > numColumns2) {
                                        i = 0;
                                    }
                                    if (numColumns <= A00) {
                                        i2 = left;
                                    }
                                    i2 = getWidth();
                                }
                                canvas.drawRect(i, i4, i2, bottom, c69410Vmu.A00);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.A01) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public final void setAdapter2(ListAdapter listAdapter) {
        if (listAdapter instanceof UBE) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), UBE.class.getCanonicalName()));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = AbstractC65702TsY.A0l();
        Context context2 = getContext();
        if (AbstractC66384UEs.A01(context2)) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(AbstractC1343565e.A00(context2, UEx.class.getCanonicalName(), R.attr.materialCalendarStyle), new int[]{R.attr.nestedScrollable});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.A01 = z;
        AbstractC010103p.A0B(this, new UEP(this, 6));
    }

    public final UBE A00() {
        return (UBE) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final /* bridge */ /* synthetic */ ListAdapter getAdapter() {
        return super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(331470910);
        super.onAttachedToWindow();
        C0fA.A00((BaseAdapter) super.getAdapter(), -1683200808);
        C0f9.A0D(1802301946, A06);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        boolean z2;
        int A00;
        int A06 = C0f9.A06(-1236514159);
        if (z) {
            if (i == 33) {
                Month month = ((UBE) super.getAdapter()).A04;
                A00 = (month.A00() + month.A01) - 1;
            } else if (i == 130) {
                A00 = ((UBE) super.getAdapter()).A04.A00();
            } else {
                z2 = true;
            }
            setSelection(A00);
            C0f9.A0D(-668309057, A06);
        }
        z2 = false;
        super.onFocusChanged(z2, i, rect);
        C0f9.A0D(-668309057, A06);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() != -1 && getSelectedItemPosition() < ((UBE) super.getAdapter()).A04.A00()) {
                if (19 == i) {
                    setSelection(((UBE) super.getAdapter()).A04.A00());
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((UBE) super.getAdapter()).A04.A00()) {
            i = ((UBE) super.getAdapter()).A04.A00();
        }
        super.setSelection(i);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final /* bridge */ /* synthetic */ ListAdapter getAdapter2() {
        return super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
        setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }
}
