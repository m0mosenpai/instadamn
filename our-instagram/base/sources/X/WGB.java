package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes11.dex */
public final class WGB {
    public int A00;
    public int A01;
    public int A02;
    public ColorStateList A03;
    public ColorStateList A04;
    public ColorStateList A05;
    public Drawable A06;
    public Drawable A07;
    public Drawable A08;
    public LayerDrawable A09;
    public C65O A0A;
    public C65Q A0B;
    public boolean A0C;
    public final MaterialCardView A0F;
    public final C65O A0G;
    public final C65O A0H;
    public static final int[] A0J = {R.attr.state_checked};
    public static final double A0I = Math.cos(Math.toRadians(45.0d));
    public final Rect A0E = new Rect();
    public boolean A0D = false;

    public static C66321U8u A03(Drawable drawable, WGB wgb) {
        int i;
        int i2;
        float f;
        float f2;
        MaterialCardView materialCardView = wgb.A0F;
        if (((CardView) materialCardView).A00) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            if (A04(wgb)) {
                f = A00(wgb);
            } else {
                f = 0.0f;
            }
            i2 = (int) Math.ceil(maxCardElevation + f);
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (A04(wgb)) {
                f2 = A00(wgb);
            } else {
                f2 = 0.0f;
            }
            i = (int) Math.ceil(maxCardElevation2 + f2);
        } else {
            i = 0;
            i2 = 0;
        }
        return new C66321U8u(drawable, wgb, i, i2, i, i2);
    }

    public static float A00(WGB wgb) {
        C65S c65s = wgb.A0B.A06;
        C65O c65o = wgb.A0G;
        float A01 = A01(c65s, c65o.A07());
        C65S c65s2 = wgb.A0B.A07;
        C65U c65u = c65o.A00.A0K.A03;
        RectF rectF = c65o.A0C;
        AbstractC65702TsY.A0x(rectF, c65o);
        float max = Math.max(A01, A01(c65s2, c65u.Art(rectF)));
        C65S c65s3 = wgb.A0B.A05;
        C65U c65u2 = c65o.A00.A0K.A01;
        AbstractC65702TsY.A0x(rectF, c65o);
        float A012 = A01(c65s3, c65u2.Art(rectF));
        C65S c65s4 = wgb.A0B.A04;
        C65U c65u3 = c65o.A00.A0K.A00;
        AbstractC65702TsY.A0x(rectF, c65o);
        return Math.max(max, Math.max(A012, A01(c65s4, c65u3.Art(rectF))));
    }

    public static float A01(C65S c65s, float f) {
        if (c65s instanceof C65R) {
            return (float) ((1.0d - A0I) * f);
        }
        if (c65s instanceof C67769Uxk) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public static LayerDrawable A02(WGB wgb) {
        if (wgb.A08 == null) {
            C65O c65o = new C65O(wgb.A0B);
            wgb.A0A = c65o;
            wgb.A08 = new RippleDrawable(wgb.A04, null, c65o);
        }
        if (wgb.A09 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable = wgb.A06;
            if (drawable != null) {
                stateListDrawable.addState(A0J, drawable);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{wgb.A08, wgb.A0H, stateListDrawable});
            wgb.A09 = layerDrawable;
            layerDrawable.setId(2, com.facebook.R.id.mtrl_card_checked_layer_id);
        }
        return wgb.A09;
    }

    public static boolean A04(WGB wgb) {
        MaterialCardView materialCardView = wgb.A0F;
        if (((CardView) materialCardView).A01 && wgb.A0G.A0I() && ((CardView) materialCardView).A00) {
            return true;
        }
        return false;
    }

    public final void A05() {
        float f;
        float f2;
        MaterialCardView materialCardView = this.A0F;
        if ((!((CardView) materialCardView).A01 || this.A0G.A0I()) && !A04(this)) {
            f = 0.0f;
        } else {
            f = A00(this);
        }
        if (((CardView) materialCardView).A01 && ((CardView) materialCardView).A00) {
            f2 = (float) ((1.0d - A0I) * materialCardView.getCardViewRadius());
        } else {
            f2 = 0.0f;
        }
        int i = (int) (f - f2);
        Rect rect = this.A0E;
        ((CardView) materialCardView).A02.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        CardView.A05.FBe(((CardView) materialCardView).A04);
    }

    public final void A06() {
        if (!this.A0D) {
            this.A0F.setBackgroundInternal(A03(this.A0G, this));
        }
        this.A0F.setForeground(A03(this.A07, this));
    }

    public final void A07(Drawable drawable) {
        this.A06 = drawable;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.A06 = mutate;
            mutate.setTintList(this.A03);
        }
        if (this.A09 != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = this.A06;
            if (drawable2 != null) {
                stateListDrawable.addState(A0J, drawable2);
            }
            this.A09.setDrawableByLayerId(com.facebook.R.id.mtrl_card_checked_layer_id, stateListDrawable);
        }
    }

    public final void A08(C65Q c65q) {
        this.A0B = c65q;
        C65O c65o = this.A0G;
        c65o.setShapeAppearanceModel(c65q);
        c65o.A03 = !c65o.A0I();
        this.A0H.setShapeAppearanceModel(c65q);
        C65O c65o2 = this.A0A;
        if (c65o2 != null) {
            c65o2.setShapeAppearanceModel(c65q);
        }
    }

    public WGB(AttributeSet attributeSet, MaterialCardView materialCardView, int i) {
        this.A0F = materialCardView;
        Paint paint = C65O.A0M;
        Context context = materialCardView.getContext();
        C65O c65o = new C65O(new C65Q(C65Q.A01(context, attributeSet, i, com.facebook.R.style.Widget_MaterialComponents_CardView)));
        this.A0G = c65o;
        c65o.A0E(context);
        c65o.A0C(-12303292);
        C72G c72g = new C72G(c65o.A00.A0K);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C65N.A05, i, com.facebook.R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            c72g.A00(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.A0H = new C65O();
        A08(new C65Q(c72g));
        obtainStyledAttributes.recycle();
    }
}
