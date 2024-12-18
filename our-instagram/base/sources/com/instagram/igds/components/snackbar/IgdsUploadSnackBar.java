package com.instagram.igds.components.snackbar;

import X.AbstractC09440dt;
import X.AbstractC53242c7;
import X.AbstractC56372iV;
import X.C14360o3;
import X.C9EM;
import X.InterfaceC09390do;
import X.InterfaceC56392iX;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class IgdsUploadSnackBar extends IgFrameLayout {
    public InterfaceC56392iX A00;
    public final TextView A01;
    public final ViewGroup A02;
    public final ImageView A03;
    public final IgFrameLayout A04;
    public final RoundedCornerImageView A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsUploadSnackBar(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A00(int i) {
        getProgressBar().setProgress(i, true);
    }

    public final void setButtonTextAndOnClickListener(String str, View.OnClickListener onClickListener) {
        C14360o3.A0B(str, 0);
        TextView textView = this.A01;
        textView.setText(str);
        textView.setOnClickListener(onClickListener);
        textView.setVisibility(str.length() <= 0 ? 8 : 0);
    }

    public final void setExplanationText(String str) {
        C14360o3.A0B(str, 0);
        TextView explanationTextView = getExplanationTextView();
        explanationTextView.setText(str);
        explanationTextView.setVisibility(str.length() <= 0 ? 8 : 0);
    }

    public final void setMediaThumbnailBitmap(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        this.A05.setImageBitmap(bitmap);
    }

    public final void setMediaThumbnailDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        this.A05.setImageDrawable(drawable);
    }

    public final void setStatusText(String str) {
        C14360o3.A0B(str, 0);
        getStatusTextView().setText(str);
    }

    private final TextView getExplanationTextView() {
        Object value = this.A06.getValue();
        C14360o3.A07(value);
        return (TextView) value;
    }

    private final ProgressBar getProgressBar() {
        Object value = this.A07.getValue();
        C14360o3.A07(value);
        return (ProgressBar) value;
    }

    private final TextView getStatusTextView() {
        Object value = this.A08.getValue();
        C14360o3.A07(value);
        return (TextView) value;
    }

    public final void setContainerVisibility(int i) {
        this.A04.setVisibility(i);
    }

    public final void setMediaThumbnailDrawableRes(int i) {
        throw new UnsupportedOperationException();
    }

    public final void setOverlayVisibility(int i) {
        this.A03.setVisibility(i);
    }

    public final void setProgressBarVisibility(int i) {
        getProgressBar().setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsUploadSnackBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C14360o3.A0B(context, 1);
        this.A08 = AbstractC09440dt.A01(new C9EM(this, 34));
        this.A06 = AbstractC09440dt.A01(new C9EM(this, 32));
        this.A07 = AbstractC09440dt.A01(new C9EM(this, 33));
        LayoutInflater.from(context).inflate(R.layout.igds_upload_snackbar, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.upload_snackbar_container);
        this.A02 = viewGroup;
        this.A05 = (RoundedCornerImageView) findViewById(R.id.media_thumbnail);
        this.A03 = (ImageView) findViewById(R.id.media_thumbnail_overlay);
        this.A04 = (IgFrameLayout) findViewById(R.id.media_thumbnail_container);
        this.A01 = (TextView) findViewById(R.id.upload_snackbar_button);
        this.A00 = AbstractC56372iV.A01(findViewById(R.id.upload_progress_bar_container), false, true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_tag_or_toast_background)));
        Resources resources = viewGroup.getResources();
        gradientDrawable.setCornerRadius(resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
        viewGroup.setBackground(gradientDrawable);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
            marginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        viewGroup.setElevation(resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
    }

    public final void setExplanationText(int i) {
        TextView explanationTextView = getExplanationTextView();
        explanationTextView.setText(i);
        explanationTextView.setVisibility(0);
    }

    public final void setStatusText(int i) {
        getStatusTextView().setText(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsUploadSnackBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ IgdsUploadSnackBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
