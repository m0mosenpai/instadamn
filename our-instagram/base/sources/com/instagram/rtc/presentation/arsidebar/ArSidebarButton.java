package com.instagram.rtc.presentation.arsidebar;

import X.AbstractC31172DnG;
import X.AbstractC54898OPt;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.C00O;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ArSidebarButton extends IgLinearLayout {
    public Drawable A00;
    public Drawable A01;
    public IgTextView A02;
    public IgImageView A03;
    public boolean A04;
    public IgTextView A05;
    public Integer A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArSidebarButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C14360o3.A0B(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2A, i, 0);
        C14360o3.A07(obtainStyledAttributes);
        LayoutInflater.from(context).inflate(R.layout.sidebar_button, (ViewGroup) this, true);
        this.A03 = AbstractC31172DnG.A0a(this, R.id.sidebar_icon);
        IgTextView A0Y = AbstractC31172DnG.A0Y(this, R.id.sidebar_label);
        this.A02 = A0Y;
        if (A0Y == null) {
            str = "labelView";
        } else {
            A0Y.setText(AbstractC56922jQ.A00(context, obtainStyledAttributes, 2));
            this.A05 = AbstractC31172DnG.A0Y(this, R.id.sidebar_new_tag);
            this.A06 = Integer.valueOf(obtainStyledAttributes.getColor(0, 0));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            IgImageView igImageView = this.A03;
            if (igImageView == null) {
                str = "iconView";
            } else {
                igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                obtainStyledAttributes.recycle();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A00(boolean z) {
        Drawable drawable;
        int i;
        if (z) {
            drawable = this.A00;
            i = 255;
        } else {
            drawable = this.A01;
            i = 0;
        }
        Integer num = this.A06;
        if (num != null) {
            int intValue = num.intValue();
            IgImageView igImageView = this.A03;
            if (z) {
                if (igImageView != null) {
                    igImageView.clearColorFilter();
                }
            } else if (igImageView != null) {
                igImageView.setColorFilter(intValue);
            }
            C14360o3.A0F("iconView");
            throw C00O.createAndThrow();
        }
        IgImageView igImageView2 = this.A03;
        if (igImageView2 != null) {
            igImageView2.setImageDrawable(drawable);
            igImageView2.getBackground().setAlpha(i);
            return;
        }
        C14360o3.A0F("iconView");
        throw C00O.createAndThrow();
    }

    public final void A01(boolean z) {
        IgTextView igTextView = this.A02;
        if (z) {
            if (igTextView != null) {
                AbstractC54898OPt.A00(igTextView, true);
                if (this.A04) {
                    IgTextView igTextView2 = this.A05;
                    if (igTextView2 != null) {
                        AbstractC54898OPt.A00(igTextView2, true);
                        return;
                    }
                    C14360o3.A0F("newTagView");
                } else {
                    return;
                }
            }
            C14360o3.A0F("labelView");
        } else {
            if (igTextView != null) {
                AbstractC54898OPt.A01(igTextView, true);
                IgTextView igTextView3 = this.A05;
                if (igTextView3 != null) {
                    AbstractC54898OPt.A01(igTextView3, true);
                    return;
                }
                C14360o3.A0F("newTagView");
            }
            C14360o3.A0F("labelView");
        }
        throw C00O.createAndThrow();
    }

    public final boolean getCanShowNewTag() {
        return this.A04;
    }

    public final void setCanShowNewTag(boolean z) {
        this.A04 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArSidebarButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArSidebarButton(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ ArSidebarButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
