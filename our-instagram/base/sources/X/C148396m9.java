package X;

import android.animation.TimeInterpolator;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.6m9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148396m9 {
    public int A00;
    public final IgFrameLayout A01;
    public final IgSimpleImageView A02;
    public final ColorFilterAlphaImageView A03;

    public C148396m9(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 1);
        this.A00 = 8;
        View requireViewById = viewGroup.requireViewById(R.id.row_thread_composer_send_button_container);
        C14360o3.A07(requireViewById);
        IgFrameLayout igFrameLayout = (IgFrameLayout) requireViewById;
        this.A01 = igFrameLayout;
        View requireViewById2 = viewGroup.requireViewById(R.id.row_thread_composer_send_button_background);
        C14360o3.A07(requireViewById2);
        this.A03 = (ColorFilterAlphaImageView) requireViewById2;
        View requireViewById3 = igFrameLayout.requireViewById(R.id.row_thread_composer_send_button_icon);
        C14360o3.A07(requireViewById3);
        this.A02 = (IgSimpleImageView) requireViewById3;
    }

    public final void A01(Boolean bool, boolean z, boolean z2) {
        IgFrameLayout igFrameLayout;
        float f;
        TimeInterpolator overshootInterpolator;
        float rotation;
        ViewGroup viewGroup;
        float f2 = 1.0f;
        int i = this.A00;
        if (!z ? i != 0 : i != 8) {
            if (bool != null) {
                igFrameLayout = this.A01;
            } else {
                return;
            }
        } else {
            int i2 = 8;
            if (z) {
                i2 = 0;
            }
            this.A00 = i2;
            if (z2) {
                IgFrameLayout igFrameLayout2 = this.A01;
                ViewParent parent = igFrameLayout2.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.setLayoutTransition(null);
                }
                if (AbstractC125325le.A01(igFrameLayout2, 1).A0W()) {
                    f = igFrameLayout2.getScaleX();
                } else {
                    f = 1.0f;
                    if (z) {
                        f = 0.3f;
                    }
                }
                if (!z) {
                    f2 = 0.0f;
                }
                long A02 = C1H4.A02(Math.abs(f - f2) * 140.0f);
                if (this.A00 == 0) {
                    IgSimpleImageView igSimpleImageView = this.A02;
                    if (!AbstractC125325le.A01(igSimpleImageView, 1).A0W() && igFrameLayout2.getVisibility() != 0) {
                        rotation = 120.0f;
                    } else {
                        rotation = igSimpleImageView.getRotation();
                    }
                    igSimpleImageView.setRotation(rotation);
                    AbstractC125325le A01 = AbstractC125325le.A01(igSimpleImageView, 1);
                    A01.A0G();
                    AbstractC125325le A0C = A01.A0C(140L);
                    A0C.A0O(rotation, 0.0f);
                    A0C.A0D(new OvershootInterpolator(1.2f)).A0H();
                }
                AbstractC125325le A012 = AbstractC125325le.A01(igFrameLayout2, 1);
                A012.A0G();
                AbstractC125325le A0C2 = A012.A0C(A02);
                A0C2.A0U(f, f2, -1.0f);
                A0C2.A0V(f, f2, -1.0f);
                A0C2.A0I(f2);
                A0C2.A05 = new C49600Lvt(this, bool);
                A0C2.A06 = new C49606Lvz(this);
                if (this.A00 == 8) {
                    overshootInterpolator = new C128935sB();
                } else {
                    overshootInterpolator = new OvershootInterpolator(1.2f);
                }
                A0C2.A0D(overshootInterpolator);
                A0C2.A0H();
                return;
            }
            igFrameLayout = this.A01;
            if (i2 == 0) {
                igFrameLayout.setVisibility(0);
            } else {
                igFrameLayout.setVisibility(8);
            }
            if (bool == null) {
                return;
            }
        }
        boolean booleanValue = bool.booleanValue();
        igFrameLayout.setEnabled(booleanValue);
        if (booleanValue) {
            igFrameLayout.setAlpha(1.0f);
        } else {
            igFrameLayout.setAlpha(0.5f);
        }
    }

    public final void A00(int i, boolean z) {
        float dimensionPixelSize = this.A01.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize}, null, null));
        AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, i);
        int i2 = 255;
        if (z) {
            i2 = 77;
        }
        shapeDrawable.setAlpha(i2);
        this.A03.setBackground(shapeDrawable);
    }
}
