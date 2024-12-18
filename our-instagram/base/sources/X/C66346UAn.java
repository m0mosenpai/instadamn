package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.UAn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66346UAn extends ViewGroup {
    public boolean A00;
    public int A01;
    public String A02;
    public final CircularImageView A03;
    public final GradientSpinner A04;
    public final int A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    public C66346UAn(Context context) {
        super(context, null, 0);
        CircularImageView circularImageView = new CircularImageView(context, null, 0);
        this.A03 = circularImageView;
        this.A06 = AbstractC09440dt.A01(new C50150MDd(context, 19));
        this.A07 = AbstractC09440dt.A01(new C50150MDd(context, 20));
        this.A08 = AbstractC09440dt.A01(new C50150MDd(context, 21));
        GradientSpinner gradientSpinner = new GradientSpinner(context, null, 0, 6, null);
        this.A04 = gradientSpinner;
        this.A02 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        int A04 = (int) AbstractC13880nE.A04(context, 4);
        this.A05 = A04;
        this.A01 = A04;
        addView(circularImageView);
        addView(gradientSpinner);
    }

    public static /* synthetic */ void getRenderType$annotations() {
    }

    public final void setRenderType(String str) {
        C14360o3.A0B(str, 0);
        this.A02 = str;
        boolean equals = str.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        if (!equals && !this.A00) {
            this.A00 = true;
            addView(getPreviewCard(), 0);
            View gradient = getGradient();
            Context context = getContext();
            AbstractC31173DnH.A0z(context, gradient, R.drawable.reel_background_content_gradient);
            addView(getGradient(), 1);
            TextView usernameLabel = getUsernameLabel();
            usernameLabel.setTextSize(2, 14.0f);
            usernameLabel.setEllipsize(TextUtils.TruncateAt.END);
            usernameLabel.setMaxLines(1);
            int A07 = AbstractC167017dG.A07(context);
            AbstractC13880nE.A0i(getUsernameLabel(), A07, A07);
            addView(getUsernameLabel(), 2);
        }
        boolean z = !equals;
        AbstractC68398VPg.A00(getGradient(), z);
        AbstractC68398VPg.A00(getPreviewCard(), z);
        AbstractC68398VPg.A00(getUsernameLabel(), z);
    }

    private final View getGradient() {
        return (View) this.A06.getValue();
    }

    public final CircularImageView getAvatarView() {
        return this.A03;
    }

    public final IgImageView getPreviewCard() {
        return (IgImageView) this.A07.getValue();
    }

    public final GradientSpinner getRing() {
        return this.A04;
    }

    public final TextView getUsernameLabel() {
        return (TextView) this.A08.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (C14360o3.A0K(this.A02, "with_preview_card")) {
            getPreviewCard().layout(0, 0, getPreviewCard().getMeasuredWidth(), getPreviewCard().getMeasuredHeight());
            getGradient().layout(0, 0, getGradient().getMeasuredWidth(), getGradient().getMeasuredHeight());
            int measuredWidth = getPreviewCard().getMeasuredWidth() / 2;
            int measuredHeight = getPreviewCard().getMeasuredHeight();
            Context A0L = AbstractC166997dE.A0L(this);
            int A00 = measuredHeight - ((int) AbstractC13880nE.A00(A0L, A0L.getResources().getDimension(R.dimen.account_discovery_bottom_gap)));
            GradientSpinner gradientSpinner = this.A04;
            int measuredHeight2 = A00 - (gradientSpinner.getMeasuredHeight() / 2);
            gradientSpinner.layout(measuredWidth - (gradientSpinner.getMeasuredWidth() / 2), measuredHeight2 - (gradientSpinner.getMeasuredHeight() / 2), (gradientSpinner.getMeasuredWidth() / 2) + measuredWidth, (gradientSpinner.getMeasuredHeight() / 2) + measuredHeight2);
            TextView usernameLabel = getUsernameLabel();
            int paddingLeft = (measuredWidth - getUsernameLabel().getPaddingLeft()) - (getUsernameLabel().getMeasuredWidth() / 2);
            int measuredHeight3 = (gradientSpinner.getMeasuredHeight() / 2) + measuredHeight2;
            int i5 = this.A05;
            usernameLabel.layout(paddingLeft, measuredHeight3 + i5, getUsernameLabel().getPaddingRight() + measuredWidth + (getUsernameLabel().getMeasuredWidth() / 2), gradientSpinner.getMeasuredHeight() + measuredHeight2 + i5 + getUsernameLabel().getMeasuredHeight());
            CircularImageView circularImageView = this.A03;
            circularImageView.layout(measuredWidth - (circularImageView.getMeasuredWidth() / 2), measuredHeight2 - (circularImageView.getMeasuredHeight() / 2), measuredWidth + (circularImageView.getMeasuredWidth() / 2), measuredHeight2 + (circularImageView.getMeasuredHeight() / 2));
            return;
        }
        GradientSpinner gradientSpinner2 = this.A04;
        gradientSpinner2.layout(0, 0, gradientSpinner2.getMeasuredWidth(), gradientSpinner2.getMeasuredHeight());
        CircularImageView circularImageView2 = this.A03;
        int i6 = this.A01;
        circularImageView2.layout(i6, i6, circularImageView2.getMeasuredWidth(), circularImageView2.getMeasuredHeight());
    }

    public final void setRingActive(boolean z) {
        GradientSpinner gradientSpinner = this.A04;
        if (z) {
            gradientSpinner.A02();
        } else {
            gradientSpinner.A04();
        }
    }

    public final void setRingSpacing(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.A05;
        }
        this.A01 = i;
        this.A03.invalidate();
    }

    public final void setShowRing(boolean z) {
        AbstractC68398VPg.A00(this.A04, z);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = Math.min(size, size2);
        int i4 = min - this.A01;
        if (C14360o3.A0K(this.A02, "with_preview_card")) {
            Context context = getContext();
            i3 = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
            i4 = context.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height);
        } else {
            i3 = min;
        }
        AbstractC65702TsY.A12(this.A03, i4, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(i4, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
        AbstractC65702TsY.A12(this.A04, i3, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(i3, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
        if (C14360o3.A0K(this.A02, "with_preview_card")) {
            AbstractC65702TsY.A12(getPreviewCard(), size2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(size, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            AbstractC65702TsY.A12(getGradient(), size2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(size, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            AbstractC65702TsY.A12(getUsernameLabel(), (int) AbstractC13880nE.A03(AbstractC166997dE.A0L(this), getUsernameLabel().getTextSize()), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(size - (this.A05 * 2), Integer.MIN_VALUE));
            setMeasuredDimension(size, size2);
            return;
        }
        setMeasuredDimension(min, min);
    }

    public final void setProfilePicUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        AbstractC167017dG.A1N(imageUrl, interfaceC11380iw);
        this.A03.setUrl(imageUrl, interfaceC11380iw);
    }
}
