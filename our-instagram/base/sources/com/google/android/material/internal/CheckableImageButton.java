package com.google.android.material.internal;

import X.AbstractC010103p;
import X.C3OO;
import X.C65884Tvo;
import X.UC9;
import X.UEP;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes11.dex */
public class CheckableImageButton extends UC9 implements Checkable {
    public static final int[] A03 = {R.attr.state_checked};
    public boolean A00;
    public boolean A01;
    public boolean A02;

    /* loaded from: classes11.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C65884Tvo(8);
        public boolean A00;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00 ? 1 : 0);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A02;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.A02) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), A03);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        setChecked(savedState.A00);
    }

    public void setCheckable(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.A00 && this.A02 != z) {
            this.A02 = z;
            refreshDrawableState();
            sendAccessibilityEvent(C3OO.FLAG_MOVED);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.A01) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.A02);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = true;
        this.A01 = true;
        AbstractC010103p.A0B(this, new UEP(this, 7));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, com.google.android.material.internal.CheckableImageButton$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.A00 = this.A02;
        return absSavedState;
    }

    public void setPressable(boolean z) {
        this.A01 = z;
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.facebook.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
