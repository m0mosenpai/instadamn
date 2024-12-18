package com.instagram.ui.widget.gradientspinneravatarview;

import X.AbstractC13880nE;
import X.AbstractC14670of;
import X.AbstractC53242c7;
import X.C0f9;
import X.C0w9;
import X.C14360o3;
import X.C73743Sc;
import X.C9BW;
import X.InterfaceC11380iw;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class GradientSpinnerAvatarView extends IgFrameLayout {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public Drawable A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public float A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public Drawable A0I;
    public boolean A0J;
    public final CircularImageView A0K;
    public final CircularImageView A0L;
    public final CircularImageView A0M;
    public final CircularImageView A0N;
    public final GradientSpinner A0O;
    public final GradientSpinner A0P;
    public final Paint A0Q;
    public final RectF A0R;
    public final boolean A0S;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientSpinnerAvatarView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public final void A06() {
        this.A0J = true;
        this.A08 = false;
        Context context = getContext();
        C14360o3.A07(context);
        this.A0K.A0H((int) AbstractC13880nE.A04(context, 1), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_photo_border)));
    }

    public final void A0D(Drawable drawable) {
        this.A0K.setImageDrawable(drawable);
        A02(null);
    }

    public final void A0E(Drawable drawable, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl) {
        CircularImageView circularImageView;
        if (this.A08 && (circularImageView = this.A0L) != null) {
            circularImageView.setImageDrawable(drawable);
            if (imageUrl != null) {
                this.A0K.setUrl(imageUrl, interfaceC11380iw);
            }
            A03(null, this);
            return;
        }
        throw new IllegalStateException("Params for double avatars were not passed in at initialization time");
    }

    public final void A0F(C9BW c9bw, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl) {
        C14360o3.A0B(interfaceC11380iw, 1);
        if (imageUrl == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("avatar url is null, ");
            sb.append(interfaceC11380iw);
            C0w9.A03("GradientSpinnerAvatarView", sb.toString());
            return;
        }
        this.A0K.setUrl(imageUrl, interfaceC11380iw);
        A02(c9bw);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Drawable drawable = this.A06;
        if (drawable != null) {
            A01(canvas, drawable, this.A09, this.A00, this.A01, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        Drawable drawable2 = this.A0I;
        if (drawable2 != null) {
            Rect bounds = drawable2.getBounds();
            C14360o3.A07(bounds);
            int i = bounds.right - bounds.left;
            int i2 = bounds.bottom - bounds.top;
            float f = this.A02;
            if (f == 0.0f) {
                f = 0.03f;
            }
            A01(canvas, drawable2, f, this.A0A, 0.0f, i, i2);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        if (this.A06 != drawable && this.A0I != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    private final void A00() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.A04;
        int i6 = 0;
        boolean z = false;
        if (i5 == 2) {
            z = true;
        }
        int i7 = this.A0H;
        if (z) {
            i = this.A0C;
        } else {
            i = this.A0G;
        }
        if (z) {
            i2 = this.A0D;
        } else {
            i2 = 0;
        }
        if (i5 == 2) {
            i7 = this.A0E;
            i6 = this.A0F;
        }
        int i8 = 17;
        if (z) {
            i8 = 51;
        }
        GradientSpinner gradientSpinner = this.A0O;
        ViewGroup.LayoutParams layoutParams = gradientSpinner.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        CircularImageView circularImageView = this.A0K;
        ViewGroup.LayoutParams layoutParams3 = circularImageView.getLayoutParams();
        C14360o3.A0C(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        ((ViewGroup.LayoutParams) layoutParams2).height = i;
        ((ViewGroup.LayoutParams) layoutParams2).width = i;
        layoutParams4.gravity = i8;
        layoutParams2.gravity = i8;
        ((ViewGroup.LayoutParams) layoutParams4).height = i7;
        ((ViewGroup.LayoutParams) layoutParams4).width = i7;
        ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = i2;
        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = i6;
        if (z) {
            int i9 = (i - i7) / 2;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i6 - i9;
            i3 = i2 - i9;
        } else {
            i3 = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i3;
        if (this.A08) {
            if (z) {
                i4 = circularImageView.A00;
            } else {
                i4 = 0;
            }
            circularImageView.setStrokeAlpha(i4);
        }
        gradientSpinner.setLayoutParams(layoutParams2);
        circularImageView.setLayoutParams(layoutParams4);
        this.A0M.setLayoutParams(layoutParams4);
        if (z) {
            int i10 = this.A0B;
            GradientSpinner gradientSpinner2 = this.A0P;
            if (gradientSpinner2 != null) {
                CircularImageView circularImageView2 = this.A0L;
                if (circularImageView2 != null) {
                    CircularImageView circularImageView3 = this.A0N;
                    if (circularImageView3 != null) {
                        ViewGroup.LayoutParams layoutParams5 = gradientSpinner2.getLayoutParams();
                        C14360o3.A0C(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5;
                        ViewGroup.LayoutParams layoutParams6 = circularImageView2.getLayoutParams();
                        C14360o3.A0C(layoutParams6, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
                        int i11 = i + i10;
                        ((ViewGroup.LayoutParams) marginLayoutParams).height = i11;
                        ((ViewGroup.LayoutParams) marginLayoutParams).width = i11;
                        gradientSpinner2.setPadding(i10, i10, 0, 0);
                        ((ViewGroup.LayoutParams) layoutParams7).height = i7;
                        ((ViewGroup.LayoutParams) layoutParams7).width = i7;
                        layoutParams7.gravity = 85;
                        ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin = i2;
                        ((ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin = i6;
                        int i12 = (i - i7) / 2;
                        marginLayoutParams.topMargin = i6 - i12;
                        marginLayoutParams.leftMargin = i2 - i12;
                        circularImageView2.setStrokeAlpha(circularImageView2.A00);
                        gradientSpinner2.setLayoutParams(marginLayoutParams);
                        circularImageView2.setLayoutParams(layoutParams7);
                        circularImageView3.setLayoutParams(layoutParams7);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final void A02(C9BW c9bw) {
        if (this.A08) {
            CircularImageView circularImageView = this.A0L;
            if (circularImageView != null) {
                circularImageView.setVisibility(8);
                GradientSpinner gradientSpinner = this.A0P;
                if (gradientSpinner != null) {
                    gradientSpinner.setVisibility(8);
                    CircularImageView circularImageView2 = this.A0N;
                    if (circularImageView2 != null) {
                        circularImageView2.setVisibility(8);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (1 != this.A04) {
            this.A04 = 1;
            A00();
        }
        if (c9bw != null) {
            this.A0O.setProgressState((C73743Sc) c9bw.A00);
        }
    }

    public static final void A03(C9BW c9bw, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        CircularImageView circularImageView = gradientSpinnerAvatarView.A0L;
        if (circularImageView != null) {
            circularImageView.setVisibility(0);
            GradientSpinner gradientSpinner = gradientSpinnerAvatarView.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.setVisibility(0);
                if (2 != gradientSpinnerAvatarView.A04) {
                    gradientSpinnerAvatarView.A04 = 2;
                    gradientSpinnerAvatarView.A00();
                }
                if (c9bw != null) {
                    gradientSpinnerAvatarView.A0O.setProgressState((C73743Sc) c9bw.A00);
                    C73743Sc c73743Sc = (C73743Sc) c9bw.A01;
                    if (c73743Sc != null) {
                        gradientSpinner.setProgressState(c73743Sc);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A04() {
        this.A0K.A09();
        if (this.A08) {
            CircularImageView circularImageView = this.A0L;
            if (circularImageView != null) {
                circularImageView.A09();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A05() {
        this.A0O.setVisibility(8);
    }

    public final void A07() {
        this.A0K.setVisibility(0);
        if (this.A04 == 2) {
            CircularImageView circularImageView = this.A0L;
            if (circularImageView != null) {
                circularImageView.setVisibility(0);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A08() {
        this.A0O.A05();
        if (this.A04 == 2) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.A05();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A09() {
        this.A0O.A06();
        if (this.A04 == 2) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.A06();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0A() {
        this.A0O.A08();
        if (this.A04 == 2) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.A08();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0B(int i, int i2) {
        this.A0H = i;
        Context context = getContext();
        C14360o3.A07(context);
        this.A0G = AbstractC14670of.A05(context, i, i2);
        A00();
    }

    public final void A0G(C9BW c9bw, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, ImageUrl imageUrl2) {
        CircularImageView circularImageView;
        if (this.A08 && (circularImageView = this.A0L) != null) {
            if (imageUrl != null && interfaceC11380iw != null) {
                circularImageView.setUrl(imageUrl, interfaceC11380iw);
            }
            if (imageUrl2 == null) {
                this.A0K.A0B();
            } else if (interfaceC11380iw != null) {
                this.A0K.setUrl(imageUrl2, interfaceC11380iw);
            }
            A03(c9bw, this);
            return;
        }
        throw new IllegalStateException("Params for double avatars were not passed in at initialization time");
    }

    public final RectF getAvatarBounds() {
        View view;
        if (this.A04 == 2) {
            view = this;
        } else {
            view = this.A0K;
        }
        return AbstractC13880nE.A0G(view);
    }

    public final CircularImageView getBackAvatarView() {
        return this.A0K;
    }

    public final GradientSpinner getBackGradientSpinner() {
        return this.A0O;
    }

    public final Drawable getBottomBadgeDrawable() {
        return this.A06;
    }

    public final C9BW getCurrentSpinnerProgressState() {
        C73743Sc c73743Sc;
        C73743Sc progressState = this.A0O.getProgressState();
        GradientSpinner gradientSpinner = this.A0P;
        if (gradientSpinner != null) {
            c73743Sc = gradientSpinner.getProgressState();
        } else {
            c73743Sc = null;
        }
        return new C9BW(36, c73743Sc, progressState);
    }

    public final CircularImageView getFrontAvatarView() {
        return this.A0L;
    }

    public final GradientSpinner getFrontGradientSpinner() {
        return this.A0P;
    }

    public final boolean getGradientSpinnerActivated() {
        if (this.A0O.A06 != 0) {
            return false;
        }
        return true;
    }

    public final Drawable getPresenceBadgeDrawable() {
        return this.A0I;
    }

    public final int getSpinnerMargin() {
        int i;
        int i2;
        if (this.A04 == 2) {
            i = this.A0E;
            i2 = this.A0C;
        } else {
            i = this.A0H;
            i2 = this.A0G;
        }
        return (i2 - i) / 2;
    }

    public final void setAvatarViewDrawable(Drawable drawable) {
        this.A0K.setImageDrawable(drawable);
        if (this.A04 == 2) {
            CircularImageView circularImageView = this.A0L;
            if (circularImageView != null) {
                circularImageView.setImageDrawable(drawable);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void setBackAvatarTranslationZ(float f) {
        this.A0K.setTranslationZ(f);
    }

    public final void setBackgroundRingColor(int i) {
        this.A03 = i;
        if (this.A08) {
            CircularImageView circularImageView = this.A0L;
            if (circularImageView != null) {
                int i2 = this.A05;
                circularImageView.A0H(i2, i);
                this.A0K.A0H(i2, this.A03);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void setBottomBadgeDrawable(Drawable drawable) {
        Drawable drawable2 = this.A06;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.A06 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
            invalidate();
        }
    }

    public final void setDoubleAvatarGradientPadding(int i) {
        this.A0B = i;
        A00();
    }

    public final void setGradientColor(RingSpec ringSpec) {
        if (ringSpec != null) {
            this.A0O.setGradientColors(ringSpec);
            if (this.A08) {
                GradientSpinner gradientSpinner = this.A0P;
                if (gradientSpinner != null) {
                    gradientSpinner.setGradientColors(ringSpec);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final void setGradientColorRes(int i) {
        this.A0O.setGradientColors(i);
        if (this.A08) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.setGradientColors(i);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void setGradientSpinnerActivated(boolean z) {
        GradientSpinner gradientSpinner = this.A0O;
        if (z) {
            gradientSpinner.A02();
            if (this.A04 == 2) {
                GradientSpinner gradientSpinner2 = this.A0P;
                if (gradientSpinner2 != null) {
                    gradientSpinner2.A02();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        gradientSpinner.A04();
        if (this.A04 != 2) {
            return;
        }
        GradientSpinner gradientSpinner3 = this.A0P;
        if (gradientSpinner3 != null) {
            gradientSpinner3.A04();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void setGradientSpinnerActiveStrokeWidth(float f) {
        this.A0O.setActiveStrokeWidth(f);
        if (this.A08) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.setActiveStrokeWidth(f);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void setGradientSpinnerInactiveStrokeWidth(float f) {
        this.A0O.setInactiveStrokeWidth(f);
        if (this.A08) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.setInactiveStrokeWidth(f);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void setGradientSpinnerVisible(boolean z) {
        int i;
        GradientSpinner gradientSpinner;
        GradientSpinner gradientSpinner2 = this.A0O;
        if (z) {
            i = 0;
            gradientSpinner2.setVisibility(0);
            if (this.A04 == 2) {
                gradientSpinner = this.A0P;
                if (gradientSpinner == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                return;
            }
        } else {
            i = 4;
            gradientSpinner2.setVisibility(4);
            if (this.A04 == 2) {
                gradientSpinner = this.A0P;
                if (gradientSpinner == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                return;
            }
        }
        gradientSpinner.setVisibility(i);
    }

    public final void setPresenceBadgeDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.A0I = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            invalidate();
        }
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        this.A0K.setScaleType(scaleType);
    }

    public final void setSpinnerRotation(float f) {
        this.A0O.setRotation(f);
        if (this.A08) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.setRotation(f);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final void A01(Canvas canvas, Drawable drawable, float f, float f2, float f3, int i, int i2) {
        float f4;
        canvas.save();
        int width = getWidth();
        int height = getHeight();
        if (!this.A07) {
            f3 += (height - i2) - (height * f);
            if (this.A0S) {
                f4 = (width * f) - f2;
            } else {
                f4 = ((width - i) - (width * f)) + f2;
            }
            f2 = f4;
        }
        canvas.translate(f2, f3);
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void A0C(Context context, int i, int i2) {
        this.A01 = context.getResources().getDimensionPixelSize(i);
        this.A00 = context.getResources().getDimensionPixelSize(i2);
        this.A07 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(556483911);
        super.onAttachedToWindow();
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable2 = this.A0I;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        C0f9.A0D(1189109594, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1107170153);
        super.onDetachedFromWindow();
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        Drawable drawable2 = this.A0I;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        C0f9.A0D(1083735507, A06);
    }

    public final void setBottomBadgeAdditionalHorizontalOffset(float f) {
        this.A00 = f;
    }

    public final void setBottomBadgeAdditionalVerticalOffset(float f) {
        this.A01 = f;
    }

    public final void setBottomBadgeDrawableMarginPercent(float f) {
        this.A09 = f;
    }

    public final void setPresenceBadgeAdditionalHorizontalOffset(float f) {
        this.A0A = f;
    }

    public final void setPresenceBadgeDrawableMarginPercent(float f) {
        this.A02 = f;
    }

    public final void setShouldUseAbsoluteOffset(boolean z) {
        this.A07 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bf, code lost:
    
        if (r23.A0D == (-1)) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GradientSpinnerAvatarView(android.content.Context r24, android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* synthetic */ GradientSpinnerAvatarView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientSpinnerAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
