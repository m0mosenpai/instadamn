package com.facebook.wearable.mediastream.layouts;

import X.AbstractC111324zv;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC54520O6x;
import X.AbstractC55922hc;
import X.C12500ku;
import X.C14360o3;
import X.C44249Jgt;
import X.C52052N1d;
import X.C52053N1e;
import X.C52054N1f;
import X.C52057N1i;
import X.C52064N1p;
import X.C52066N1r;
import X.C52070N1v;
import X.JQ0;
import X.MSW;
import X.MSZ;
import X.N1T;
import X.N1V;
import X.OW2;
import X.PLG;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class SupToggle extends RelativeLayout {
    public int A00;
    public ImageView A01;
    public ImageView A02;
    public int A03;
    public int A04;
    public boolean A05;
    public final int A06;
    public final View A07;
    public final View A08;
    public final RelativeLayout A09;
    public final TextView A0A;
    public final StatusIndicator A0B;
    public final int A0C;
    public final int A0D;
    public final View A0E;
    public final View A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupToggle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.sup_toggle_view, this);
        C14360o3.A07(inflate);
        this.A0F = inflate;
        this.A09 = (RelativeLayout) AbstractC166997dE.A0R(inflate, R.id.sup_toggle_view);
        View A0S = AbstractC166997dE.A0S(inflate, R.id.sup_toggle_track);
        this.A07 = A0S;
        this.A02 = AbstractC31176DnK.A0D(inflate, R.id.sup_toggle_icon);
        this.A01 = AbstractC31176DnK.A0D(inflate, R.id.sup_toggle_close_icon);
        StatusIndicator statusIndicator = (StatusIndicator) AbstractC166997dE.A0R(inflate, R.id.sup_toggle_status_indicator);
        this.A0B = statusIndicator;
        this.A0E = AbstractC166997dE.A0S(inflate, R.id.glasses_tile_background);
        this.A05 = true;
        this.A0C = context.getColor(R.color.black);
        this.A04 = context.getColor(R.color.black);
        this.A03 = inflate.getContext().getColor(R.color.primary_text_disabled_material_dark);
        View A0S2 = AbstractC166997dE.A0S(inflate, R.id.hint_message);
        this.A08 = A0S2;
        this.A0A = AbstractC167007dF.A0N(A0S2, R.id.hint_message_text);
        Resources resources = getResources();
        this.A00 = resources.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        this.A06 = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        this.A0D = AbstractC166997dE.A07(resources);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(1);
        layoutTransition.setInterpolator(1, new AccelerateDecelerateInterpolator());
        layoutTransition.setDuration(150L);
        layoutTransition.setAnimateParentHierarchy(false);
        setLayoutTransition(layoutTransition);
        Drawable background = A0S.getBackground();
        C14360o3.A0C(background, AbstractC111324zv.A00(27));
        this.A00 = background.getIntrinsicHeight();
        statusIndicator.setParentView(inflate);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2H);
        try {
            this.A05 = obtainStyledAttributes.getBoolean(0, true);
            this.A04 = obtainStyledAttributes.getColor(2, this.A04);
            this.A03 = obtainStyledAttributes.getColor(1, this.A03);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void A00(View.OnClickListener onClickListener, AbstractC54520O6x abstractC54520O6x) {
        StatusIndicator statusIndicator = this.A0B;
        if (!(abstractC54520O6x instanceof C52057N1i) && !abstractC54520O6x.equals(N1V.A00) && !abstractC54520O6x.equals(C52054N1f.A00) && !abstractC54520O6x.equals(C52052N1d.A00) && !abstractC54520O6x.equals(C52053N1e.A00)) {
            TextView textView = statusIndicator.A0M;
            textView.setClickable(false);
            textView.setTypeface(textView.getTypeface(), 0);
        } else {
            statusIndicator.A05.post(new PLG(statusIndicator));
            TextView textView2 = statusIndicator.A0M;
            textView2.setOnClickListener(onClickListener);
            textView2.setTypeface(textView2.getTypeface(), 1);
        }
    }

    public final void setSupCloseIcon(ImageView imageView) {
        C14360o3.A0B(imageView, 0);
        this.A01 = imageView;
    }

    public final void setSupIcon(ImageView imageView) {
        C14360o3.A0B(imageView, 0);
        this.A02 = imageView;
    }

    private final void setTileBackgroundVisibility(boolean z) {
        this.A0E.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        this.A0B.setStatusIndicatorCollapsedStrokeColor(z);
    }

    public final void A01(AbstractC54520O6x abstractC54520O6x, boolean z) {
        ImageView imageView;
        Drawable drawable;
        StatusIndicator statusIndicator = this.A0B;
        if (abstractC54520O6x instanceof C52066N1r) {
            if (z) {
                statusIndicator.A0O.A01();
                return;
            }
        } else if (abstractC54520O6x instanceof C52057N1i) {
            if (z) {
                OW2 ow2 = statusIndicator.A0O;
                ow2.A05.clearColorFilter();
                ow2.A04.clearColorFilter();
                ow2.A03.setColorFilter(ow2.A00);
                return;
            }
        } else {
            if (abstractC54520O6x instanceof N1T) {
                statusIndicator.A0J.setImageDrawable(statusIndicator.A03);
                MSZ.A11(statusIndicator.A0H.getResources(), statusIndicator.A0L, Long.valueOf(((N1T) abstractC54520O6x).A00), R.string.res_0x7f1300f5_name_removed);
                return;
            }
            if (abstractC54520O6x instanceof C52064N1p) {
                imageView = statusIndicator.A0J;
                drawable = statusIndicator.A04;
            } else {
                if (!(abstractC54520O6x instanceof C52070N1v)) {
                    return;
                }
                imageView = statusIndicator.A0J;
                drawable = statusIndicator.A02;
            }
            imageView.setImageDrawable(drawable);
            return;
        }
        statusIndicator.A0I.setColorFilter(statusIndicator.A0G, PorterDuff.Mode.SRC_IN);
    }

    public final void A02(boolean z, boolean z2, boolean z3) {
        boolean z4;
        ImageView imageView;
        int i;
        int i2;
        if (!this.A05 ? !(z2 || z3 || !z) : !(z2 || z3)) {
            z4 = true;
        } else {
            z4 = false;
        }
        setTileBackgroundVisibility(z4);
        if (!z2 && !z3) {
            imageView = this.A02;
            if (z) {
                i = this.A0C;
            } else {
                i = this.A04;
            }
        } else {
            imageView = this.A02;
            i = this.A03;
        }
        imageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        if (!z) {
            int i3 = this.A00;
            View view = this.A07;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
            i2 = 8;
            getLayoutTransition().hideChild(this.A09, this.A01, 8);
        } else {
            if (this.A01.getVisibility() == 0) {
                return;
            }
            i2 = 0;
            ValueAnimator ofInt = ValueAnimator.ofInt(this.A07.getHeight(), this.A06);
            ofInt.setDuration(150L);
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.addUpdateListener(new C44249Jgt(3, ofInt, this));
            ofInt.start();
            getLayoutTransition().showChild(this.A09, this.A01, 8);
        }
        this.A01.setVisibility(i2);
    }

    public final void A03(boolean z, boolean z2, boolean z3, boolean z4) {
        ImageView imageView = this.A02;
        if (z) {
            imageView.setEnabled(false);
            this.A01.setEnabled(false);
            StatusIndicator statusIndicator = this.A0B;
            StatusIndicator.A01(statusIndicator);
            if (!z4) {
                statusIndicator.A0I.setColorFilter(statusIndicator.A00, PorterDuff.Mode.SRC_IN);
            }
            StatusIndicator.A02(statusIndicator, true, z4, false);
            if (z4) {
                OW2 ow2 = statusIndicator.A0O;
                ow2.A03.setColorFilter(ow2.A00);
                ow2.A01.start();
            }
            StatusIndicator.A00(statusIndicator.A0N, statusIndicator, Integer.valueOf(R.string.res_0x7f1300fd_name_removed), true, false);
            statusIndicator.A06(null, false, z3, z4);
            statusIndicator.A03();
            return;
        }
        imageView.setEnabled(true);
        this.A01.setEnabled(true);
        if (!z2) {
            return;
        }
        this.A0B.setConnected(z4);
    }

    public final ImageView getSupCloseIcon() {
        return this.A01;
    }

    public final ImageView getSupIcon() {
        return this.A02;
    }

    public final void setDoublePressPromptVisibility(boolean z) {
        this.A0B.setDoublePressPromptVisibility(z);
    }

    public final void setStatusIndicatorVisibility(boolean z) {
        this.A0B.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    public final void setViewVisible(boolean z) {
        this.A0F.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    public final void setToggleSide(boolean z) {
        int i;
        int i2 = 8388611;
        if (z) {
            i2 = 8388613;
        }
        View view = this.A0F;
        if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, AbstractC111324zv.A00(5));
            ((FrameLayout.LayoutParams) layoutParams).gravity = i2;
        } else if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            C14360o3.A0C(layoutParams2, AbstractC111324zv.A00(35));
            ((LinearLayout.LayoutParams) layoutParams2).gravity = i2;
        }
        C12500ku c12500ku = new C12500ku(this.A09);
        while (c12500ku.hasNext()) {
            View A0A = MSW.A0A(c12500ku);
            if (A0A.getId() != R.id.sup_toggle_status_indicator && A0A.getId() != R.id.status_indicator_right_arrow && A0A.getId() != R.id.status_indicator_left_arrow) {
                ViewGroup.LayoutParams layoutParams3 = A0A.getLayoutParams();
                C14360o3.A0C(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                if (z) {
                    layoutParams4.removeRule(20);
                    layoutParams4.addRule(21, -1);
                } else {
                    layoutParams4.removeRule(21);
                    layoutParams4.addRule(20);
                }
                A0A.setLayoutParams(layoutParams4);
            }
        }
        View view2 = this.A0E;
        ViewGroup.MarginLayoutParams A08 = AbstractC31175DnJ.A08(view2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = this.A0D;
        }
        A08.setMarginStart(i);
        if (z) {
            i3 = this.A0D;
        }
        A08.setMarginEnd(i3);
        view2.setLayoutParams(A08);
        this.A0B.setIndicatorSide(z);
        View view3 = this.A08;
        C14360o3.A0C(view3, AbstractC111324zv.A00(4));
        ((LinearLayout) view3).setGravity(z ? 8388613 : 8388611);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SupToggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SupToggle(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ SupToggle(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
