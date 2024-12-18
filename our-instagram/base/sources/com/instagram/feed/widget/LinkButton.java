package com.instagram.feed.widget;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC31174DnI;
import X.C14360o3;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LinkButton extends ImageWithTitleTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    private final int getColor() {
        if (isEnabled()) {
            if (isSelected() || isPressed()) {
                return R.color.blue_6;
            }
            return R.color.badge_color;
        }
        return R.color.badge_color;
    }

    @Override // X.C3WF, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int color = getColor();
        Context context = getContext();
        ColorFilter A09 = AbstractC31174DnI.A09(context, color);
        Drawable background = getBackground();
        if (background != null) {
            AbstractC167027dH.A0d(A09, background);
            AbstractC166987dD.A1O(context, this, color);
            Drawable drawable = ((ImageWithTitleTextView) this).A01;
            if (drawable != null) {
                AbstractC167027dH.A0d(A09, drawable);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LinkButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
