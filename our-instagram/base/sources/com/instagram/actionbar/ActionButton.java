package com.instagram.actionbar;

import X.AbstractC56952jT;
import X.C00O;
import X.C05F;
import X.C14360o3;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.ui.widget.spinner.RefreshSpinner;

/* loaded from: classes.dex */
public final class ActionButton extends ViewSwitcher {
    public ImageView A00;
    public ImageView A01;

    /* loaded from: classes.dex */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0gV
            /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, com.instagram.actionbar.ActionButton$SavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                C14360o3.A0B(parcel, 0);
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.A00 = parcel.readInt();
                return baseSavedState;
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ActionButton.SavedState[i];
            }
        };
        public int A00;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButton(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A00(context);
    }

    public final void setButtonDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        ImageView imageView = this.A00;
        if (imageView == null) {
            C14360o3.A0F("button");
            throw C00O.createAndThrow();
        }
        imageView.setImageDrawable(drawable);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        String str;
        C14360o3.A0B(colorFilter, 0);
        ImageView imageView = this.A00;
        if (imageView == null) {
            str = "button";
        } else {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.mutate().setColorFilter(colorFilter);
            }
            ImageView imageView2 = this.A01;
            if (imageView2 == null) {
                str = "spinner";
            } else {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 != null) {
                    drawable2.mutate().setColorFilter(colorFilter);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A00(Context context) {
        AbstractC56952jT.A04(this, C05F.A01);
        ImageView imageView = new ImageView(context);
        this.A00 = imageView;
        imageView.setImageResource(R.drawable.instagram_arrow_cw_pano_outline_24);
        ImageView imageView2 = this.A00;
        String str = "button";
        if (imageView2 != null) {
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            View view = this.A00;
            if (view != null) {
                addView(view);
                this.A01 = new RefreshSpinner(context);
                FrameLayout frameLayout = new FrameLayout(context);
                ImageView imageView3 = this.A01;
                if (imageView3 == null) {
                    str = "spinner";
                } else {
                    frameLayout.addView(imageView3, new FrameLayout.LayoutParams(-2, -2));
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
                    addView(frameLayout, new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setDisplayedChild(savedState.A00);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, com.instagram.actionbar.ActionButton$SavedState, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A00 = getDisplayedChild();
        return baseSavedState;
    }

    public final void setButtonResource(int i) {
        if (i == R.drawable.instagram_arrow_back_24) {
            i = R.drawable.instagram_arrow_left_pano_outline_24;
        }
        ImageView imageView = this.A00;
        if (imageView == null) {
            C14360o3.A0F("button");
            throw C00O.createAndThrow();
        }
        imageView.setImageResource(i);
    }

    @Override // android.widget.ViewAnimator
    public void setDisplayedChild(int i) {
        super.setDisplayedChild(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        setClickable(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ImageView imageView = this.A00;
        if (imageView == null) {
            C14360o3.A0F("button");
            throw C00O.createAndThrow();
        }
        int i = 77;
        if (z) {
            i = 255;
        }
        imageView.setAlpha(i / 255.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
        A00(context);
    }
}
