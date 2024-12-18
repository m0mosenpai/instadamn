package com.facebookpay.widget.paybutton;

import X.AbstractC09440dt;
import X.AbstractC111324zv;
import X.AbstractC166997dE;
import X.AbstractC31173DnH;
import X.AbstractC55922hc;
import X.AbstractC68349VNj;
import X.AbstractC69838VwO;
import X.AbstractC70177WFc;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C14360o3;
import X.C18U;
import X.C2FP;
import X.C63406Sjd;
import X.C70203WGv;
import X.EnumC68120VCd;
import X.InterfaceC09390do;
import X.InterfaceC16820sZ;
import X.UCn;
import X.VET;
import X.VEX;
import X.WF7;
import X.WH6;
import X.WH8;
import X.X4J;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.widget.button.FBPayButton;

/* loaded from: classes11.dex */
public final class FBPayAnimationButton extends ShimmerFrameLayout {
    public static final InterfaceC09390do A0C = AbstractC09440dt.A01(X4J.A00);
    public static final boolean A0D = C18U.A06(C06090Tz.A06, C2FP.A0D().A00, 36314489655921303L);
    public Drawable A00;
    public Drawable A01;
    public ViewPropertyAnimator A02;
    public ViewPropertyAnimator A03;
    public TextView A04;
    public FBPayButton A05;
    public UCn A06;
    public InterfaceC16820sZ A07;
    public String A08;
    public boolean A09;
    public final int A0A;
    public final AttributeSet A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBPayAnimationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0B = attributeSet;
        this.A0A = i;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        setClipChildren(false);
        Context context2 = getContext();
        C2FP.A0A();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(R.style.FBPayUIButton, AbstractC55922hc.A0d);
        C2FP.A0A();
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            C2FP.A0A();
            AbstractC31173DnH.A0y(context2, drawable, R.color.igds_primary_text);
            this.A00 = drawable;
            C2FP.A0A();
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 != null) {
                C2FP.A0A();
                AbstractC31173DnH.A0y(context2, drawable2, R.color.fds_transparent);
                this.A01 = drawable2;
                obtainStyledAttributes.recycle();
                AbstractC68349VNj.A00(this, null);
                A00(this);
                this.A08 = "";
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final Animator.AnimatorListener getCollapseButtonAnimationEndListener() {
        return new C70203WGv(this, 2);
    }

    @Override // com.facebook.shimmer.ShimmerFrameLayout
    public final void A06(boolean z) {
        super.A06(true);
        Drawable drawable = this.A00;
        if (drawable == null) {
            C14360o3.A0F("shimmerViewBackground");
            throw C00O.createAndThrow();
        }
        setBackground(drawable);
        getButtonView().setVisibility(8);
        getProgressBarView().setVisibility(8);
        AbstractC69838VwO.A00(this, null, C05F.A00, null, getButtonView().getContext().getString(2131961356));
        setImportantForAccessibility(1);
    }

    public final void A08(C63406Sjd c63406Sjd) {
        EnumC68120VCd enumC68120VCd = c63406Sjd.A00;
        if (enumC68120VCd != EnumC68120VCd.LOADING) {
            removeView(getButtonView());
            if (getProgressBarView().getScaleX() != 1.0f) {
                getProgressBarView().setScaleX(1.0f);
                getProgressBarView().setScaleY(1.0f);
            }
            A01(this);
            if (enumC68120VCd != null) {
                int ordinal = enumC68120VCd.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return;
                        }
                    } else {
                        AbstractC69838VwO.A00(this, null, C05F.A00, null, getContext().getString(2131961525));
                        setImportantForAccessibility(1);
                        getProgressBarView().setCircleColor(4);
                        UCn progressBarView = getProgressBarView();
                        progressBarView.A00(4);
                        RotateDrawable rotateDrawable = progressBarView.A02;
                        if (rotateDrawable == null) {
                            C14360o3.A0F("layerSpinnerRingDrawable");
                            throw C00O.createAndThrow();
                        }
                        rotateDrawable.setAlpha(0);
                        getProgressBarView().setIcon(VET.A0Q);
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        performHapticFeedback(16);
                        return;
                    }
                } else {
                    AbstractC69838VwO.A00(this, null, C05F.A00, null, getContext().getString(2131961524));
                    setImportantForAccessibility(1);
                    getProgressBarView().setIcon(VET.A0P);
                    UCn progressBarView2 = getProgressBarView();
                    progressBarView2.setVisibility(0);
                    progressBarView2.setCircleColor(4);
                    progressBarView2.A00(21);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setDuration(250L).addUpdateListener(new WH6(1, AbstractC166997dE.A0L(progressBarView2), this, this.A07));
                    ofFloat.start();
                    return;
                }
            }
            throw new RuntimeException();
        }
    }

    public final void setButtonView(FBPayButton fBPayButton) {
        C14360o3.A0B(fBPayButton, 0);
        this.A05 = fBPayButton;
    }

    public final void setProgressBarView(UCn uCn) {
        C14360o3.A0B(uCn, 0);
        this.A06 = uCn;
    }

    public final void setProgressMsgView(TextView textView) {
        C14360o3.A0B(textView, 0);
        this.A04 = textView;
    }

    public final void setText(String str) {
        C14360o3.A0B(str, 0);
        getButtonView().setText(str);
        this.A08 = str;
    }

    public static final void A01(FBPayAnimationButton fBPayAnimationButton) {
        ViewPropertyAnimator viewPropertyAnimator = fBPayAnimationButton.A03;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = fBPayAnimationButton.A02;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator3 = fBPayAnimationButton.getProgressBarView().A03;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.cancel();
        }
        fBPayAnimationButton.getProgressBarView().setVisibility(8);
        fBPayAnimationButton.getProgressMsgView().setVisibility(8);
    }

    public final AttributeSet getAttrs() {
        return this.A0B;
    }

    public final FBPayButton getButtonView() {
        FBPayButton fBPayButton = this.A05;
        if (fBPayButton != null) {
            return fBPayButton;
        }
        C14360o3.A0F("buttonView");
        throw C00O.createAndThrow();
    }

    public final int getDefStyleAttr() {
        return this.A0A;
    }

    public final boolean getPayButtonState() {
        return this.A09;
    }

    public final InterfaceC16820sZ getPostSuccessfulTransactionAction() {
        return this.A07;
    }

    public final UCn getProgressBarView() {
        UCn uCn = this.A06;
        if (uCn != null) {
            return uCn;
        }
        C14360o3.A0F("progressBarView");
        throw C00O.createAndThrow();
    }

    public final TextView getProgressMsgView() {
        TextView textView = this.A04;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F("progressMsgView");
        throw C00O.createAndThrow();
    }

    public final String getText() {
        return this.A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.UCn, android.widget.ProgressBar, android.view.View] */
    public static final void A00(FBPayAnimationButton fBPayAnimationButton) {
        Context A0L = AbstractC166997dE.A0L(fBPayAnimationButton);
        AttributeSet attributeSet = fBPayAnimationButton.A0B;
        int i = fBPayAnimationButton.A0A;
        fBPayAnimationButton.setButtonView(new FBPayButton(A0L, attributeSet, i, VEX.A08));
        fBPayAnimationButton.getButtonView().setId(R.id.fbpay_ui_button_id);
        ?? progressBar = new ProgressBar(A0L, attributeSet, i);
        progressBar.setIndeterminate(true);
        Resources resources = progressBar.getResources();
        progressBar.setIndeterminateDrawable(resources.getDrawable(R.drawable.fbpay_widget_pay_spinner, progressBar.getContext().getTheme()));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        C14360o3.A0C(indeterminateDrawable, AbstractC111324zv.A00(28));
        LayerDrawable layerDrawable = (LayerDrawable) indeterminateDrawable;
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.layer_item_circle);
        C14360o3.A0C(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        progressBar.A01 = (GradientDrawable) findDrawableByLayerId;
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.layer_item_spinner);
        C14360o3.A0C(findDrawableByLayerId2, "null cannot be cast to non-null type android.graphics.drawable.RotateDrawable");
        progressBar.A02 = (RotateDrawable) findDrawableByLayerId2;
        Drawable findDrawableByLayerId3 = layerDrawable.findDrawableByLayerId(R.id.layer_item_icon);
        C14360o3.A0C(findDrawableByLayerId3, AbstractC111324zv.A00(477));
        progressBar.A00 = findDrawableByLayerId3;
        progressBar.setCircleColor(20);
        progressBar.setIcon(VET.A0S);
        progressBar.A00(16);
        AbstractC70177WFc.A01(progressBar, 4);
        progressBar.setVisibility(4);
        fBPayAnimationButton.setProgressBarView(progressBar);
        fBPayAnimationButton.getProgressBarView().setId(R.id.fbpay_ui_progress_bar_id);
        TextView textView = new TextView(A0L, attributeSet, i);
        textView.setAlpha(0.0f);
        WF7.A01(textView, 3, 1);
        fBPayAnimationButton.setProgressMsgView(textView);
        fBPayAnimationButton.getProgressMsgView().setId(R.id.fbpay_ui_progress_message_id);
        TextView progressMsgView = fBPayAnimationButton.getProgressMsgView();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        progressMsgView.setLayoutParams(layoutParams);
        fBPayAnimationButton.addView(fBPayAnimationButton.getButtonView());
        fBPayAnimationButton.addView(fBPayAnimationButton.getProgressBarView());
        fBPayAnimationButton.addView(fBPayAnimationButton.getProgressMsgView());
        fBPayAnimationButton.A05();
    }

    @Override // com.facebook.shimmer.ShimmerFrameLayout
    public final void A05() {
        super.A05();
        Drawable drawable = this.A01;
        if (drawable == null) {
            C14360o3.A0F("trasparentBackground");
            throw C00O.createAndThrow();
        }
        setBackground(drawable);
        getButtonView().setVisibility(0);
        setFocusable(false);
        setImportantForAccessibility(2);
        getProgressMsgView().setImportantForAccessibility(2);
    }

    public final void A07() {
        if (getProgressBarView().getVisibility() != 0) {
            C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36314489655921303L);
            Drawable current = getButtonView().getBackground().getCurrent();
            C14360o3.A0C(current, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ValueAnimator ofFloat = ValueAnimator.ofFloat(((GradientDrawable) current).getCornerRadius(), getButtonView().getHeight() / 2.0f);
            ofFloat.setDuration(400L).addUpdateListener(new WH8(this));
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (getButtonView().getX() + (getButtonView().getWidth() / 2)) - (getButtonView().getHeight() / 2), 0.0f, 0.0f);
            InterfaceC09390do interfaceC09390do = A0C;
            PathInterpolator pathInterpolator = (PathInterpolator) interfaceC09390do.getValue();
            if (pathInterpolator != null) {
                translateAnimation.setInterpolator(pathInterpolator);
            }
            translateAnimation.setDuration(400L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat);
            PathInterpolator pathInterpolator2 = (PathInterpolator) interfaceC09390do.getValue();
            if (pathInterpolator2 != null) {
                animatorSet.setInterpolator(pathInterpolator2);
            }
            animatorSet.addListener(new C70203WGv(this, 2));
            animatorSet.start();
            getButtonView().startAnimation(translateAnimation);
            AbstractC69838VwO.A00(this, null, C05F.A00, null, getContext().getString(2131961526));
            setImportantForAccessibility(1);
            sendAccessibilityEvent(Constants.LOAD_RESULT_PGO);
            getButtonView().setEnabled(false);
        }
    }

    public final void setPayButtonState(boolean z) {
        getButtonView().setEnabled(z);
        this.A09 = z;
    }

    public final void setPostSuccessfulTransactionAction(InterfaceC16820sZ interfaceC16820sZ) {
        this.A07 = interfaceC16820sZ;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayAnimationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayAnimationButton(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
