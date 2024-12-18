package com.instagram.igds.components.snackbar;

import X.AbstractC56952jT;
import X.C14360o3;
import X.C19270xB;
import X.InterfaceC11380iw;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class IgdsDualButtonSnackBar extends IgFrameLayout {
    public static final InterfaceC11380iw A09 = new C19270xB("igds_dual_button_snack_bar");
    public FrameLayout A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public TextView A03;
    public IgImageView A04;
    public ViewGroup A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsDualButtonSnackBar(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setCircularImageUri(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        IgImageView igImageView = this.A04;
        this.A00.setVisibility(0);
        igImageView.setVisibility(0);
        igImageView.setUrl(imageUrl, A09);
    }

    public final void setMessageText(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        this.A02.setVisibility(0);
        this.A03.setText(charSequence);
    }

    public final void setPrimaryButtonTextAndOnClickListener(String str, View.OnClickListener onClickListener) {
        C14360o3.A0B(str, 0);
        TextView textView = this.A07;
        textView.setText(str);
        textView.setOnClickListener(onClickListener);
        textView.setVisibility(0);
        this.A01.setVisibility(0);
        AbstractC56952jT.A01(textView);
    }

    public final void setSecondaryButtonTextAndOnClickListener(String str, View.OnClickListener onClickListener) {
        C14360o3.A0B(str, 0);
        TextView textView = this.A08;
        textView.setText(str);
        textView.setOnClickListener(onClickListener);
        textView.setVisibility(0);
        this.A01.setVisibility(0);
        AbstractC56952jT.A01(textView);
    }

    public final void setCircularImageDrawable(Drawable drawable) {
        IgImageView igImageView = this.A04;
        this.A00.setVisibility(0);
        igImageView.setVisibility(0);
        igImageView.setImageDrawable(drawable);
    }

    public final void setCircularImageDrawableRes(int i) {
        IgImageView igImageView = this.A04;
        this.A00.setVisibility(0);
        igImageView.setVisibility(0);
        igImageView.setImageResource(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r5.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setMessageDescriptionText(java.lang.String r5) {
        /*
            r4 = this;
            android.widget.TextView r3 = r4.A06
            r3.setText(r5)
            r1 = 0
            if (r5 == 0) goto Lf
            int r0 = r5.length()
            r2 = 0
            if (r0 != 0) goto L12
        Lf:
            r2 = 1
            r1 = 8
        L12:
            r3.setVisibility(r1)
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165264(0x7f070050, float:1.794474E38)
            if (r2 == 0) goto L25
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
        L25:
            int r0 = r1.getDimensionPixelOffset(r0)
            X.AbstractC13880nE.A0f(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.snackbar.IgdsDualButtonSnackBar.setMessageDescriptionText(java.lang.String):void");
    }

    public final void setSnackBarBackgroundColor(int i) {
        this.A05.setBackgroundColor(i);
    }

    public final void setTextColor(int i) {
        this.A03.setTextColor(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsDualButtonSnackBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.igds_dual_button_snackbar, this);
        this.A05 = (ViewGroup) requireViewById(R.id.dual_button_snackbar_container);
        this.A00 = (FrameLayout) requireViewById(R.id.image_container);
        this.A04 = (IgImageView) requireViewById(R.id.circular_image);
        this.A02 = (LinearLayout) requireViewById(R.id.message_container);
        this.A03 = (TextView) requireViewById(R.id.snackbar_message);
        this.A06 = (TextView) requireViewById(R.id.snackbar_message_description);
        this.A01 = (LinearLayout) requireViewById(R.id.button_container);
        this.A07 = (TextView) requireViewById(R.id.snackbar_button_primary);
        this.A08 = (TextView) requireViewById(R.id.snackbar_button_secondary);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsDualButtonSnackBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ IgdsDualButtonSnackBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
