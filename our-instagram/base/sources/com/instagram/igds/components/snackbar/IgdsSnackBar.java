package com.instagram.igds.components.snackbar;

import X.AbstractC001900j;
import X.AbstractC111324zv;
import X.AbstractC56952jT;
import X.C05F;
import X.C14360o3;
import X.C14640oc;
import X.C19270xB;
import X.C56302iJ;
import X.C57012jc;
import X.InterfaceC11380iw;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class IgdsSnackBar extends IgFrameLayout {
    public static final InterfaceC11380iw A0D = new C19270xB("igds_snack_bar");
    public final View A00;
    public final FrameLayout A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final C57012jc A06;
    public final C57012jc A07;
    public final C57012jc A08;
    public final ViewGroup A09;
    public final FrameLayout A0A;
    public final TextView A0B;
    public final C57012jc A0C;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsSnackBar(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setAvatarImageDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) this.A06.A01();
        C14360o3.A0A(gradientSpinnerAvatarView);
        this.A01.setVisibility(0);
        gradientSpinnerAvatarView.setVisibility(0);
        gradientSpinnerAvatarView.A0D(drawable);
    }

    public final void setAvatarImageUri(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) this.A06.A01();
        C14360o3.A0A(gradientSpinnerAvatarView);
        this.A01.setVisibility(0);
        gradientSpinnerAvatarView.setVisibility(0);
        gradientSpinnerAvatarView.A0F(null, A0D, imageUrl);
    }

    public final void setButtonTextAndOnClickListener(String str, View.OnClickListener onClickListener) {
        if (str != null && !AbstractC001900j.A0T(str)) {
            TextView textView = this.A0B;
            textView.setText(str);
            textView.setOnClickListener(onClickListener);
            textView.setVisibility(0);
            AbstractC56952jT.A04(textView, C05F.A01);
            return;
        }
        this.A0B.setVisibility(8);
    }

    public final void setCircularImageDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        ImageView imageView = (ImageView) this.A07.A01();
        C14360o3.A0A(imageView);
        A00(imageView);
        imageView.setImageDrawable(drawable);
    }

    public final void setCircularImageUri(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        IgImageView igImageView = (IgImageView) this.A07.A01();
        C14360o3.A0A(igImageView);
        A00(igImageView);
        igImageView.setUrl(imageUrl, A0D);
    }

    public final void setIconDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        ImageView imageView = this.A03;
        A00(imageView);
        imageView.setImageDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r4.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setMessageDescriptionText(java.lang.String r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto La
            int r0 = r4.length()
            r1 = 0
            if (r0 != 0) goto Lb
        La:
            r1 = 1
        Lb:
            android.widget.TextView r0 = r3.A04
            r0.setText(r4)
            if (r1 == 0) goto L14
            r2 = 8
        L14:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.snackbar.IgdsSnackBar.setMessageDescriptionText(java.lang.String):void");
    }

    public final void setMessageText(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        TextView textView = this.A05;
        textView.setVisibility(charSequence.length() == 0 ? 8 : 0);
        textView.setText(charSequence);
    }

    public final void setSquareImageDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        ImageView imageView = (ImageView) this.A08.A01();
        C14360o3.A0A(imageView);
        A00(imageView);
        imageView.setImageDrawable(drawable);
    }

    public final void setSquareImageUri(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        IgImageView igImageView = (IgImageView) this.A08.A01();
        C14360o3.A0A(igImageView);
        A00(igImageView);
        igImageView.setUrl(imageUrl, A0D);
    }

    private final void A00(ImageView imageView) {
        this.A01.setVisibility(0);
        imageView.setVisibility(0);
    }

    public final View getCloseImageView() {
        return this.A00;
    }

    public final void setAvatarRingColor(int i) {
        ((GradientSpinnerAvatarView) this.A06.A01()).setBackgroundRingColor(i);
    }

    public final void setButtonImageAndOnClickListener(ImageUrl imageUrl, View.OnClickListener onClickListener) {
        if (imageUrl == null) {
            this.A0A.setVisibility(8);
            this.A0C.A01().setVisibility(8);
            return;
        }
        IgImageView igImageView = (IgImageView) this.A0C.A01();
        igImageView.setVisibility(0);
        FrameLayout frameLayout = this.A0A;
        frameLayout.setVisibility(0);
        igImageView.setUrl(imageUrl, A0D);
        igImageView.setOnClickListener(onClickListener);
        AbstractC56952jT.A01(frameLayout);
    }

    public final void setButtonTextColor(int i) {
        this.A0B.setTextColor(i);
    }

    public final void setCircularImageDrawableRes(int i) {
        ImageView imageView = (ImageView) this.A07.A01();
        C14360o3.A0A(imageView);
        A00(imageView);
        imageView.setImageResource(i);
    }

    public final void setMessageMovementMethod(MovementMethod movementMethod) {
        this.A05.setMovementMethod(movementMethod);
    }

    public final void setMessageOnClick(View.OnClickListener onClickListener) {
        this.A05.setOnClickListener(onClickListener);
    }

    public final void setPresenceBadgeDrawable(Drawable drawable) {
        View A01 = this.A06.A01();
        C14360o3.A07(A01);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) A01;
        gradientSpinnerAvatarView.setPresenceBadgeDrawable(drawable);
        gradientSpinnerAvatarView.A02 = -0.03f;
    }

    public final void setSnackBarBackgroundColor(int i) {
        GradientDrawable gradientDrawable;
        ViewGroup viewGroup = this.A09;
        if (viewGroup.getBackground() instanceof GradientDrawable) {
            Drawable background = viewGroup.getBackground();
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setColor(i);
                return;
            }
            return;
        }
        viewGroup.setBackgroundColor(i);
    }

    public final void setSquareImageDrawableRes(int i) {
        ImageView imageView = (ImageView) this.A08.A01();
        C14360o3.A0A(imageView);
        A00(imageView);
        imageView.setImageResource(i);
    }

    public final void setSquareImageStrokeEnabled(boolean z) {
        RoundedCornerImageView roundedCornerImageView;
        IgImageView igImageView = (IgImageView) this.A08.A01();
        if ((igImageView instanceof RoundedCornerImageView) && (roundedCornerImageView = (RoundedCornerImageView) igImageView) != null) {
            roundedCornerImageView.setStrokeEnabled(z);
        }
    }

    public final void setSwipeListener(View.OnTouchListener onTouchListener) {
        this.A09.setOnTouchListener(onTouchListener);
    }

    public final void setTextColor(int i) {
        this.A05.setTextColor(i);
    }

    public final void setTypeface(boolean z) {
        TextView textView = this.A05;
        Typeface typeface = textView.getTypeface();
        if (typeface != null) {
            int style = typeface.getStyle();
            if (Integer.valueOf(style) != null && style == z) {
                return;
            }
        }
        textView.setTypeface(null, z ? 1 : 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int id;
        int i5;
        int id2;
        int i6;
        int id3;
        int i7;
        int id4;
        super.onLayout(z, i, i2, i3, i4);
        TextView textView = this.A04;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        int i8 = ((C56302iJ) layoutParams).A0G;
        TextView textView2 = this.A0B;
        boolean z2 = false;
        boolean z3 = false;
        if (i8 == textView2.getId()) {
            z3 = true;
        }
        TextView textView3 = this.A05;
        if ((textView3.getLineCount() > 1 || textView.getLineCount() > 1) && textView2.getMeasuredWidth() / this.A09.getMeasuredWidth() > 0.25f) {
            z2 = true;
        }
        if (z3 != z2) {
            ViewGroup.LayoutParams layoutParams2 = textView3.getLayoutParams();
            if (layoutParams2 != null) {
                C56302iJ c56302iJ = (C56302iJ) layoutParams2;
                int i9 = -1;
                if (z2) {
                    id = -1;
                } else {
                    id = textView2.getId();
                }
                c56302iJ.A0N = id;
                if (z2) {
                    i5 = this.A09.getId();
                } else {
                    i5 = -1;
                }
                c56302iJ.A0M = i5;
                textView3.setLayoutParams(c56302iJ);
                ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                if (layoutParams3 != null) {
                    C56302iJ c56302iJ2 = (C56302iJ) layoutParams3;
                    if (z2) {
                        id2 = -1;
                    } else {
                        id2 = this.A09.getId();
                    }
                    c56302iJ2.A0F = id2;
                    if (z2) {
                        i6 = textView2.getId();
                    } else {
                        i6 = -1;
                    }
                    c56302iJ2.A0G = i6;
                    textView.setLayoutParams(c56302iJ2);
                    ViewGroup.LayoutParams layoutParams4 = textView2.getLayoutParams();
                    if (layoutParams4 != null) {
                        C56302iJ c56302iJ3 = (C56302iJ) layoutParams4;
                        if (z2) {
                            id3 = -1;
                        } else {
                            id3 = this.A09.getId();
                        }
                        c56302iJ3.A0u = id3;
                        if (z2) {
                            i7 = textView.getId();
                        } else {
                            i7 = -1;
                        }
                        c56302iJ3.A0t = i7;
                        textView2.setLayoutParams(c56302iJ3);
                        View view = this.A00;
                        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                        if (layoutParams5 != null) {
                            C56302iJ c56302iJ4 = (C56302iJ) layoutParams5;
                            if (z2) {
                                id4 = -1;
                            } else {
                                id4 = this.A09.getId();
                            }
                            c56302iJ4.A0u = id4;
                            if (z2) {
                                i9 = textView.getId();
                            }
                            c56302iJ4.A0t = i9;
                            view.setLayoutParams(c56302iJ4);
                            Resources resources = getResources();
                            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
                            ViewGroup viewGroup = this.A09;
                            int paddingLeft = viewGroup.getPaddingLeft();
                            int paddingTop = viewGroup.getPaddingTop();
                            int paddingRight = viewGroup.getPaddingRight();
                            if (z2) {
                                dimensionPixelSize -= dimensionPixelSize2;
                            }
                            viewGroup.setPadding(paddingLeft, paddingTop, paddingRight, dimensionPixelSize);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsSnackBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        C14360o3.A0B(context, 1);
        LayoutInflater.from(context).inflate(C14640oc.A06() ? R.layout.igds_prism_snackbar : R.layout.igds_snackbar, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.snackbar_container);
        this.A09 = viewGroup;
        this.A01 = (FrameLayout) findViewById(R.id.image_container);
        View findViewById = findViewById(R.id.circular_image_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A07 = new C57012jc(viewStub);
        View findViewById2 = findViewById(R.id.square_image_stub);
        if (findViewById2 instanceof ViewStub) {
            viewStub2 = (ViewStub) findViewById2;
        } else {
            viewStub2 = null;
        }
        this.A08 = new C57012jc(viewStub2);
        View findViewById3 = findViewById(R.id.avatar_image_stub);
        if (findViewById3 instanceof ViewStub) {
            viewStub3 = (ViewStub) findViewById3;
        } else {
            viewStub3 = null;
        }
        this.A06 = new C57012jc(viewStub3);
        this.A03 = (ImageView) findViewById(R.id.icon_image);
        this.A05 = (TextView) findViewById(R.id.snackbar_message);
        this.A04 = (TextView) findViewById(R.id.snackbar_message_description);
        this.A0B = (TextView) findViewById(R.id.snackbar_text_button);
        this.A02 = (ImageView) findViewById(R.id.snackbar_icon_button);
        this.A0A = (FrameLayout) findViewById(R.id.snackbar_image_button_container);
        View findViewById4 = findViewById(R.id.square_image_button_stub);
        this.A0C = new C57012jc(findViewById4 instanceof ViewStub ? (ViewStub) findViewById4 : null);
        this.A00 = findViewById(R.id.snackbar_close_button);
        viewGroup.setImportantForAccessibility(2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(viewGroup.getResources().getDimensionPixelSize(C14640oc.A06() ? R.dimen.ab_test_media_thumbnail_preview_item_internal_padding : R.dimen.abc_button_padding_horizontal_material));
        viewGroup.setBackground(gradientDrawable);
    }

    public final void setAvatarImageDrawable(Drawable drawable, Drawable drawable2) {
        CircularImageView circularImageView;
        C14360o3.A0B(drawable, 0);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) this.A06.A01();
        C14360o3.A0A(gradientSpinnerAvatarView);
        this.A01.setVisibility(0);
        gradientSpinnerAvatarView.setVisibility(0);
        if (gradientSpinnerAvatarView.A08 && (circularImageView = gradientSpinnerAvatarView.A0L) != null) {
            circularImageView.setImageDrawable(drawable);
            CircularImageView circularImageView2 = gradientSpinnerAvatarView.A0K;
            if (drawable2 == null) {
                circularImageView2.A0B();
            } else {
                circularImageView2.setImageDrawable(drawable2);
            }
            GradientSpinnerAvatarView.A03(null, gradientSpinnerAvatarView);
            return;
        }
        throw new IllegalStateException(AbstractC111324zv.A00(1712));
    }

    public final void setAvatarImageUri(ImageUrl imageUrl, ImageUrl imageUrl2) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(imageUrl2, 1);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) this.A06.A01();
        C14360o3.A0A(gradientSpinnerAvatarView);
        this.A01.setVisibility(0);
        gradientSpinnerAvatarView.setVisibility(0);
        gradientSpinnerAvatarView.A0G(null, A0D, imageUrl, imageUrl2);
    }

    public final void setIconDrawable(int i) {
        ImageView imageView = this.A03;
        A00(imageView);
        imageView.setImageResource(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsSnackBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ IgdsSnackBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
