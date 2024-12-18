package com.instagram.creation.base.ui.feedcolorfilterpicker;

import X.AbstractC43594JPz;
import X.C0f9;
import X.C44428Jkf;
import X.C44437Jky;
import X.C55105ObK;
import X.InterfaceC58110PpZ;
import X.JQ0;
import X.LNM;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.List;

/* loaded from: classes8.dex */
public class FeedColorFilterPicker extends HorizontalScrollView implements View.OnClickListener {
    public static int A09 = -1887089959;
    public int A00;
    public int A01;
    public int A02;
    public LinearLayout A03;
    public C55105ObK A04;
    public InterfaceC58110PpZ A05;
    public List A06;
    public boolean A07;
    public boolean A08;

    /* loaded from: classes8.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = LNM.A00(38);
        public int A00;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    private void setRestoreScrollPosition(int i) {
        this.A00 = i;
    }

    public final boolean A02(int i, boolean z) {
        if (this instanceof FilterPicker) {
            FilterPicker filterPicker = (FilterPicker) this;
            ((FeedColorFilterPicker) filterPicker).A03.getClass();
            if (z && filterPicker.A02) {
                if (i == C44437Jky.A00(((C44428Jkf) ((FeedColorFilterPicker) filterPicker).A03.getChildAt(r1.getChildCount() - 2)).A05)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void setBlurIconCache(C55105ObK c55105ObK) {
        this.A04 = c55105ObK;
    }

    public void setFilterListener(InterfaceC58110PpZ interfaceC58110PpZ) {
        this.A05 = interfaceC58110PpZ;
    }

    public void setRestoreSelectedIndex(int i) {
        this.A01 = i;
    }

    public void setShouldUseBlurIcons(boolean z) {
        this.A07 = z;
    }

    public void setShowOverlayText(boolean z) {
        this.A08 = z;
    }

    public FeedColorFilterPicker(Context context) {
        super(context);
        JQ0.A1H(this);
    }

    public final int A01(C44428Jkf c44428Jkf) {
        int left = ((c44428Jkf.getLeft() - c44428Jkf.getWidth()) - getScrollX()) + getPaddingLeft();
        int right = (((c44428Jkf.getRight() + c44428Jkf.getWidth()) - getWidth()) - getScrollX()) + getPaddingLeft();
        if (right > 0) {
            left = right;
        } else if (left >= 0) {
            left = 0;
        }
        return Math.max(0, Math.min(getScrollX() + left, Math.max(0, AbstractC43594JPz.A09(getChildAt(0), this)))) - getScrollX();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int A05 = C0f9.A05(-1265154930);
        C44428Jkf c44428Jkf = (C44428Jkf) view;
        if (A02(C44437Jky.A00(c44428Jkf.A05), true)) {
            smoothScrollBy(A01(c44428Jkf), 0);
        }
        InterfaceC58110PpZ interfaceC58110PpZ = this.A05;
        if (interfaceC58110PpZ != null) {
            interfaceC58110PpZ.DtE(c44428Jkf, true);
        }
        C0f9.A0C(-535519141, A05);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() > 0) {
            int i5 = this.A00;
            if (i5 == -1 && this.A01 >= 0) {
                LinearLayout linearLayout = this.A03;
                linearLayout.getClass();
                i5 = A01((C44428Jkf) linearLayout.getChildAt(this.A01));
                this.A00 = i5;
            }
            if (i5 != -1) {
                this.A00 = -1;
                this.A01 = -1;
                scrollTo(i5, 0);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        Parcelable superState = savedState.getSuperState();
        superState.getClass();
        super.onRestoreInstanceState(superState);
        this.A00 = savedState.A00;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker$SavedState] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        ?? baseSavedState = new View.BaseSavedState(onSaveInstanceState);
        baseSavedState.A00 = getScrollX();
        return baseSavedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (r5 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setEffects(java.util.List r13, boolean r14, com.instagram.common.session.UserSession r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker.setEffects(java.util.List, boolean, com.instagram.common.session.UserSession):void");
    }

    public FeedColorFilterPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        JQ0.A1H(this);
    }

    public FeedColorFilterPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        JQ0.A1H(this);
    }
}
