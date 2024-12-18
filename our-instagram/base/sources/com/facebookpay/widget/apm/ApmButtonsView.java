package com.facebookpay.widget.apm;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC31174DnI;
import X.AbstractC65702TsY;
import X.AbstractC68349VNj;
import X.C14360o3;
import X.C2FP;
import X.C70161WEa;
import X.JQ0;
import X.VD0;
import X.XGq;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class ApmButtonsView extends ConstraintLayout {
    public final ShimmerFrameLayout A00;
    public final ViewGroup A01;
    public final TextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApmButtonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.fbpay_apm_view, this);
        ViewGroup viewGroup = (ViewGroup) requireViewById(R.id.apm_bloks_container);
        this.A01 = viewGroup;
        TextView textView = (TextView) requireViewById(R.id.or_pay_with_card_text_view);
        this.A02 = textView;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) requireViewById(R.id.shimmer);
        this.A00 = shimmerFrameLayout;
        C70161WEa.A02(context, viewGroup, VD0.A02, 2, 60);
        C2FP.A0A();
        AbstractC31174DnI.A1C(textView, context.getColor(R.color.igds_elevated_background));
        C2FP.A0A();
        AbstractC166987dD.A1O(context, textView, R.color.igds_secondary_text);
        C2FP.A0A();
        Drawable drawable = context.getDrawable(R.drawable.apm_buttons_shimmer_background);
        if (drawable != null) {
            C2FP.A0A();
            AbstractC65702TsY.A0t(context, drawable, shimmerFrameLayout, R.color.igds_primary_text);
            AbstractC68349VNj.A00(shimmerFrameLayout, null);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void setupBloksApms(FragmentActivity fragmentActivity, XGq xGq, Map map) {
        AbstractC167027dH.A12(fragmentActivity, xGq, map);
        C2FP.A0H().A01(AbstractC166997dE.A0L(this), this.A01, fragmentActivity, xGq, map);
    }

    public final ShimmerFrameLayout getShimmer() {
        return this.A00;
    }

    public final void setPayWithCardText(int i) {
        AbstractC166987dD.A1P(getContext(), this.A02, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApmButtonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ ApmButtonsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApmButtonsView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
