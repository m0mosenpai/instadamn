package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes11.dex */
public abstract class UBZ extends FrameLayout {
    public static final View.OnTouchListener A07 = new ViewOnTouchListenerC44256Jh0(0);
    public int A00;
    public ColorStateList A01;
    public InterfaceC71912X9w A02;
    public X85 A03;
    public PorterDuff.Mode A04;
    public final float A05;
    public final float A06;

    public UBZ(Context context, AttributeSet attributeSet) {
        super(C65K.A00(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C65N.A0Y);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.A00 = obtainStyledAttributes.getInt(2, 0);
        this.A06 = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC1567371w.A01(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC126235nK.A01(PorterDuff.Mode.SRC_IN, obtainStyledAttributes.getInt(5, -1)));
        this.A05 = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(A07);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(AbstractC69853Vwe.A00(this.A06, AbstractC1343565e.A01(this, R.attr.colorSurface), AbstractC1343565e.A01(this, R.attr.colorOnSurface)));
            ColorStateList colorStateList = this.A01;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.A05;
    }

    public int getAnimationMode() {
        return this.A00;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.A06;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.A01 != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.A01);
            drawable.setTintMode(this.A04);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.A01 = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.A04);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.A04 = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnTouchListener onTouchListener;
        if (onClickListener != null) {
            onTouchListener = null;
        } else {
            onTouchListener = A07;
        }
        setOnTouchListener(onTouchListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1997438247);
        super.onAttachedToWindow();
        InterfaceC71912X9w interfaceC71912X9w = this.A02;
        if (interfaceC71912X9w != null) {
            interfaceC71912X9w.onViewAttachedToWindow(this);
        }
        requestApplyInsets();
        C0f9.A0D(-2104590064, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        C69083VhZ c69083VhZ;
        int A06 = C0f9.A06(-422997081);
        super.onDetachedFromWindow();
        InterfaceC71912X9w interfaceC71912X9w = this.A02;
        if (interfaceC71912X9w != null) {
            C70539WcT c70539WcT = (C70539WcT) interfaceC71912X9w;
            AbstractC70175WEx abstractC70175WEx = c70539WcT.A00;
            C70194WFy A00 = C70194WFy.A00();
            X87 x87 = abstractC70175WEx.A04;
            synchronized (A00.A03) {
                if (!C70194WFy.A03(x87, A00) && ((c69083VhZ = A00.A01) == null || x87 == null || c69083VhZ.A02.get() != x87)) {
                    z = false;
                }
                z = true;
            }
            if (z) {
                AbstractC70175WEx.A0D.post(new RunnableC71298WrS(c70539WcT));
            }
        }
        C0f9.A0D(1299515988, A06);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        X85 x85 = this.A03;
        if (x85 != null) {
            AbstractC70175WEx abstractC70175WEx = ((WcU) x85).A00;
            abstractC70175WEx.A09.A03 = null;
            AbstractC70175WEx.A01(abstractC70175WEx);
        }
    }

    public void setAnimationMode(int i) {
        this.A00 = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        throw C00O.createAndThrow();
    }

    public void setOnAttachStateChangeListener(InterfaceC71912X9w interfaceC71912X9w) {
        this.A02 = interfaceC71912X9w;
    }

    public void setOnLayoutChangeListener(X85 x85) {
        this.A03 = x85;
    }
}
