package com.facebookpay.widget.otc;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC65702TsY;
import X.C14360o3;
import X.C2FP;
import X.C70161WEa;
import X.C70265WOs;
import X.InterfaceC16660sJ;
import X.VD0;
import X.VEP;
import X.WF7;
import X.WFM;
import X.X5e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class AnonCheckoutToggleButton extends ConstraintLayout {
    public InterfaceC16660sJ A00;
    public final TextView A01;
    public final TextView A02;
    public final SwitchCompat A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonCheckoutToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = X5e.A00;
        View.inflate(context, R.layout.ecp_anon_checkout_toggle, this);
        SwitchCompat switchCompat = (SwitchCompat) requireViewById(R.id.toggle_switch);
        this.A03 = switchCompat;
        TextView textView = (TextView) requireViewById(R.id.title_text);
        this.A02 = textView;
        TextView textView2 = (TextView) requireViewById(R.id.description_text);
        this.A01 = textView2;
        WF7.A02(textView, VEP.A0s);
        Resources resources = getResources();
        textView.setTextSize(0, resources.getDimension(R.dimen.auth_edit_field_text_size));
        C2FP.A0A();
        AbstractC166987dD.A1O(context, textView2, R.color.igds_secondary_text);
        textView2.setTextSize(0, resources.getDimension(R.dimen.auth_edit_field_text_size));
        C2FP.A0A();
        textView2.setLinkTextColor(context.getColor(R.color.igds_link));
        textView2.setMovementMethod(new LinkMovementMethod());
        int[][] iArr = {new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
        C2FP.A0A();
        int[] iArr2 = {context.getColor(R.color.audio_bar_action_color_enabled), C2FP.A0A().A02(context, 44)};
        C2FP.A0A();
        int[] iArr3 = {context.getColor(R.color.igds_separator), C2FP.A0A().A02(context, 45)};
        switchCompat.A0A.setTintList(new ColorStateList(iArr, iArr2));
        switchCompat.A0B.setTintList(new ColorStateList(iArr, iArr3));
        switchCompat.setOnCheckedChangeListener(new C70265WOs(this, 2));
    }

    public final void setOnToggleCheckedListener(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00 = interfaceC16660sJ;
    }

    public final TextView getDescriptionTextView() {
        return this.A01;
    }

    public final InterfaceC16660sJ getOnToggleCheckedListener() {
        return this.A00;
    }

    public final SwitchCompat getOtcSwitch() {
        return this.A03;
    }

    public final TextView getTitleTextView() {
        return this.A02;
    }

    public final void setEnableRedesign(boolean z) {
        if (z) {
            Context A0L = AbstractC166997dE.A0L(this);
            C70161WEa.A01(A0L, this, VD0.A02);
            int A03 = AbstractC167017dG.A03(A0L);
            int A0E = AbstractC167017dG.A0E(A0L);
            Integer valueOf = Integer.valueOf(A03);
            Integer valueOf2 = Integer.valueOf(A0E);
            WFM.A02(this, valueOf, valueOf, valueOf2, valueOf2);
            WFM.A03(this, null, null, Integer.valueOf(AbstractC167017dG.A06(A0L)), null);
            return;
        }
        C2FP.A0A();
        Context A0L2 = AbstractC166997dE.A0L(this);
        Drawable drawable = A0L2.getDrawable(R.drawable.apm_buttons_shimmer_background);
        if (drawable != null) {
            C2FP.A0A();
            AbstractC65702TsY.A0t(A0L2, drawable, this, R.color.igds_elevated_background);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void setToggleOn(boolean z) {
        this.A03.setChecked(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnonCheckoutToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnonCheckoutToggleButton(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
