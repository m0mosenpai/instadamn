package com.facebook.smartcapture.ui.view;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.AbstractC43592JPx;
import X.AbstractC47961LGz;
import X.AbstractC47994LKy;
import X.B4Z;
import X.C00O;
import X.C14360o3;
import X.C47597L0h;
import X.EnumC61156RgH;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class ArrowHintView extends FrameLayout {
    public static final Interpolator A07 = new AccelerateDecelerateInterpolator();
    public Paint A00;
    public ImageView A01;
    public ImageView A02;
    public C47597L0h A03;
    public final Paint A04;
    public final Paint A05;
    public final Paint A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrowHintView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A04 = A0S;
        this.A05 = AbstractC166987dD.A0S(1);
        this.A00 = A0S;
        this.A06 = AbstractC166987dD.A0S(1);
        A00(context);
    }

    private final void A00(Context context) {
        setWillNotDraw(false);
        setClipToPadding(false);
        LayoutInflater.from(context).inflate(R.layout.arrow_hint_view, (ViewGroup) this, true);
        this.A01 = AbstractC47961LGz.A01(this, R.id.iv_arrow);
        ImageView A01 = AbstractC47961LGz.A01(this, R.id.iv_face_check);
        this.A02 = A01;
        String str = "checkView";
        if (A01 != null) {
            A01.setVisibility(8);
            ImageView imageView = this.A01;
            if (imageView == null) {
                str = "arrow";
            } else {
                imageView.setColorFilter(AbstractC47994LKy.A01(context, R.attr.selfie_arrow_hint_pending));
                ImageView imageView2 = this.A02;
                if (imageView2 != null) {
                    imageView2.setColorFilter(AbstractC47994LKy.A01(context, R.attr.selfie_arrow_hint_success));
                    Paint paint = this.A06;
                    AbstractC166987dD.A1R(paint);
                    this.A04.setColor(AbstractC47994LKy.A01(context, R.attr.selfie_arrow_hint_fill_pending));
                    this.A05.setColor(AbstractC47994LKy.A01(context, R.attr.selfie_arrow_hint_fill_success));
                    paint.setStrokeWidth(AbstractC47994LKy.A00(context, R.attr.selfie_arrow_hint_border));
                    AbstractC43592JPx.A1E(paint);
                    paint.setColor(AbstractC47994LKy.A01(context, R.attr.selfie_arrow_hint_border_color));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        float A072 = AbstractC166987dD.A07(this) / 2.0f;
        float A08 = AbstractC166987dD.A08(this) / 2.0f;
        float min = Math.min(getWidth(), getHeight()) / 2.0f;
        Paint paint = this.A06;
        canvas.drawCircle(A072, A08, min - (paint.getStrokeWidth() / 2.0f), this.A00);
        canvas.drawCircle(A072, A08, min - (paint.getStrokeWidth() / 2.0f), paint);
    }

    private final void setArrowGravity(int i) {
        ImageView imageView = this.A01;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            C14360o3.A0C(layoutParams, AbstractC111324zv.A00(5));
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
            ImageView imageView2 = this.A01;
            if (imageView2 != null) {
                imageView2.requestLayout();
                return;
            }
        }
        C14360o3.A0F("arrow");
        throw C00O.createAndThrow();
    }

    private final void setArrowMode(EnumC61156RgH enumC61156RgH) {
        int i;
        ImageView imageView = this.A01;
        if (enumC61156RgH == null) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
        } else if (imageView != null) {
            imageView.setVisibility(0);
            int ordinal = enumC61156RgH.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            ImageView imageView2 = this.A01;
                            if (imageView2 != null) {
                                imageView2.setRotation(270.0f);
                                i = 81;
                                setArrowGravity(i);
                                return;
                            }
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        ImageView imageView3 = this.A01;
                        if (imageView3 != null) {
                            imageView3.setRotation(180.0f);
                            i = 21;
                            setArrowGravity(i);
                            return;
                        }
                    }
                } else {
                    ImageView imageView4 = this.A01;
                    if (imageView4 != null) {
                        imageView4.setRotation(90.0f);
                        i = 49;
                        setArrowGravity(i);
                        return;
                    }
                }
            } else {
                ImageView imageView5 = this.A01;
                if (imageView5 != null) {
                    imageView5.setRotation(0.0f);
                    i = 19;
                    setArrowGravity(i);
                    return;
                }
            }
        }
        C14360o3.A0F("arrow");
        throw C00O.createAndThrow();
    }

    public final void setCaptureState(EnumC61156RgH enumC61156RgH) {
        String str;
        Property property;
        float[] fArr;
        if (enumC61156RgH != null) {
            setArrowMode(enumC61156RgH);
            C47597L0h c47597L0h = this.A03;
            if (c47597L0h != null) {
                c47597L0h.A00 = true;
                c47597L0h.A01.cancel();
                ImageView imageView = this.A01;
                if (imageView == null) {
                    str = "arrow";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                imageView.setRotationX(0.0f);
                imageView.setRotationY(0.0f);
                imageView.setTranslationX(0.0f);
                imageView.setTranslationY(0.0f);
            }
            this.A03 = null;
            ImageView imageView2 = this.A01;
            str = "arrow";
            if (imageView2 != null) {
                float dimension = AbstractC25228BEl.A0M(imageView2).getDimension(R.dimen.abc_button_inset_vertical_material);
                C47597L0h c47597L0h2 = new C47597L0h();
                AnimatorSet animatorSet = c47597L0h2.A01;
                animatorSet.setStartDelay(300L);
                animatorSet.setDuration(1200L);
                animatorSet.setInterpolator(A07);
                ImageView imageView3 = this.A01;
                if (imageView3 != null) {
                    int ordinal = enumC61156RgH.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    property = View.TRANSLATION_Y;
                                } else {
                                    throw B4Z.A00();
                                }
                            } else {
                                property = View.TRANSLATION_X;
                            }
                            fArr = new float[]{0.0f};
                            fArr[1] = dimension;
                            fArr[2] = 0.0f;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property, fArr);
                            C14360o3.A0A(ofFloat);
                            animatorSet.playTogether((Animator[]) Arrays.copyOf(new Animator[]{ofFloat}, 1));
                            this.A03 = c47597L0h2;
                            animatorSet.start();
                            return;
                        }
                        property = View.TRANSLATION_Y;
                    } else {
                        property = View.TRANSLATION_X;
                    }
                    fArr = new float[]{0.0f};
                    dimension = -dimension;
                    fArr[1] = dimension;
                    fArr[2] = 0.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property, fArr);
                    C14360o3.A0A(ofFloat2);
                    animatorSet.playTogether((Animator[]) Arrays.copyOf(new Animator[]{ofFloat2}, 1));
                    this.A03 = c47597L0h2;
                    animatorSet.start();
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrowHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A04 = A0S;
        this.A05 = AbstractC166987dD.A0S(1);
        this.A00 = A0S;
        this.A06 = AbstractC166987dD.A0S(1);
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrowHintView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A04 = A0S;
        this.A05 = AbstractC166987dD.A0S(1);
        this.A00 = A0S;
        this.A06 = AbstractC166987dD.A0S(1);
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrowHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A04 = A0S;
        this.A05 = AbstractC166987dD.A0S(1);
        this.A00 = A0S;
        this.A06 = AbstractC166987dD.A0S(1);
        A00(context);
    }
}
