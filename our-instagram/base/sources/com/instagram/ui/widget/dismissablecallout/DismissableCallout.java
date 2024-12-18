package com.instagram.ui.widget.dismissablecallout;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31176DnK;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.C00O;
import X.C14360o3;
import X.InterfaceC11380iw;
import X.InterfaceC50404MNg;
import X.JQ0;
import X.ViewOnClickListenerC48073LPy;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class DismissableCallout extends FrameLayout {
    public int A00;
    public View A01;
    public TextView A02;
    public CircularImageView A03;
    public InterfaceC50404MNg A04;

    public final void setAvatar(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        AbstractC167007dF.A1K(imageUrl, interfaceC11380iw);
        CircularImageView circularImageView = this.A03;
        if (circularImageView != null) {
            circularImageView.setUrl(imageUrl, interfaceC11380iw);
            CircularImageView circularImageView2 = this.A03;
            if (circularImageView2 != null) {
                circularImageView2.setVisibility(0);
                return;
            }
        }
        C14360o3.A0F("avatar");
        throw C00O.createAndThrow();
    }

    public final TextView getTextView() {
        TextView textView = this.A02;
        if (textView == null) {
            C14360o3.A0F("text");
            throw C00O.createAndThrow();
        }
        return textView;
    }

    public final void setButtonContentDescription(String str) {
        View view = this.A01;
        if (view == null) {
            C14360o3.A0F("dismissButton");
            throw C00O.createAndThrow();
        }
        view.setContentDescription(str);
    }

    public final void setIsVisible(boolean z) {
    }

    public final void setOnDismissListener(InterfaceC50404MNg interfaceC50404MNg) {
        this.A04 = interfaceC50404MNg;
    }

    public /* synthetic */ DismissableCallout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    private final void A00(AttributeSet attributeSet) {
        String str;
        Context context = getContext();
        LayoutInflater.from(context).inflate(R.layout.dismissable_callout, this);
        this.A02 = AbstractC167007dF.A0N(this, R.id.dismissable_callout_info_banner);
        this.A01 = AbstractC166997dE.A0S(this, R.id.dismiss_button);
        this.A03 = AbstractC31176DnK.A0U(this, R.id.dismissable_callout_avatar);
        View view = this.A01;
        if (view == null) {
            str = "dismissButton";
        } else {
            view.setOnClickListener(new ViewOnClickListenerC48073LPy(this, 53));
            setBackgroundResource(R.color.callout_background);
            this.A00 = getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0R);
            C14360o3.A07(obtainStyledAttributes);
            TextView textView = this.A02;
            if (textView == null) {
                str = "text";
            } else {
                textView.setText(AbstractC56922jQ.A00(context, obtainStyledAttributes, 0));
                obtainStyledAttributes.recycle();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissableCallout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissableCallout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        A00(attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DismissableCallout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DismissableCallout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
