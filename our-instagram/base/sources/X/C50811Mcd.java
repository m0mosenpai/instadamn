package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Mcd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50811Mcd extends LinearLayout {
    public Drawable A00;
    public ImageView A01;
    public IgTextView A02;
    public EnumC151036r4 A03;
    public EnumC53257Ngv A04;
    public Integer A05;

    public final void setButtonStyle(EnumC151036r4 enumC151036r4) {
        String str;
        C14360o3.A0B(enumC151036r4, 0);
        this.A03 = enumC151036r4;
        int labelColor = getLabelColor();
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            str = "labelTextView";
        } else {
            igTextView.setTextColor(labelColor);
            if (this.A05 != null || this.A00 != null) {
                ImageView imageView = this.A01;
                str = "iconImageView";
                if (imageView != null) {
                    if (imageView.getDrawable() != null) {
                        imageView.getDrawable().setTint(labelColor);
                    }
                }
            }
            A00(this);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void setIcon(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        ImageView imageView = this.A01;
        if (imageView == null) {
            C14360o3.A0F("iconImageView");
            throw C00O.createAndThrow();
        }
        if (indexOfChild(imageView) == -1) {
            Context A0L = AbstractC166997dE.A0L(this);
            int ordinal = this.A04.ordinal();
            int i = 14;
            if (ordinal == 4) {
                i = 24;
            }
            int A0C = AbstractC166987dD.A0C(A0L, i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0C, A0C);
            int i2 = 4;
            if (ordinal == 4) {
                i2 = 0;
            }
            layoutParams.setMargins(0, 0, 0, AbstractC166987dD.A0C(A0L, i2));
            layoutParams.gravity = 1;
            addView(imageView, 0, layoutParams);
        }
        this.A00 = drawable;
        int labelColor = getLabelColor();
        drawable.setTint(labelColor);
        setBackgroundColor(labelColor);
        imageView.setImageDrawable(drawable);
    }

    public static final void A00(C50811Mcd c50811Mcd) {
        EnumC53257Ngv enumC53257Ngv = c50811Mcd.A04;
        if (!enumC53257Ngv.A01 && enumC53257Ngv != EnumC53257Ngv.A05) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            Context context = c50811Mcd.getContext();
            EnumC151036r4 enumC151036r4 = c50811Mcd.A03;
            C14360o3.A07(context);
            gradientDrawable.setColor(context.getColor(enumC151036r4.A00(context)));
            gradientDrawable.setCornerRadius(enumC53257Ngv.A00);
            c50811Mcd.setBackground(gradientDrawable);
            return;
        }
        c50811Mcd.setBackgroundColor(0);
    }

    public final void A02() {
        EnumC53257Ngv enumC53257Ngv = this.A04;
        int ordinal = enumC53257Ngv.ordinal();
        if (ordinal != 4) {
            int i = 0;
            Context context = getContext();
            if (ordinal != 5) {
                C14360o3.A07(context);
                int A0C = AbstractC166987dD.A0C(context, 8);
                AbstractC13880nE.A0j(this, A0C, A0C);
                if (!enumC53257Ngv.A01) {
                    i = AbstractC166987dD.A0C(context, 8);
                }
                AbstractC13880nE.A0i(this, i, i);
            } else {
                C14360o3.A07(context);
                int A0C2 = AbstractC166987dD.A0C(context, 16);
                AbstractC13880nE.A0j(this, A0C2, A0C2);
                IgTextView igTextView = this.A02;
                if (igTextView == null) {
                    C14360o3.A0F("labelTextView");
                    throw C00O.createAndThrow();
                }
                CharSequence text = igTextView.getText();
                if (text != null && text.length() != 0) {
                    i = AbstractC166987dD.A0C(context, 6);
                }
                igTextView.setCompoundDrawablePadding(i);
                int A0C3 = AbstractC166987dD.A0C(context, 16);
                AbstractC13880nE.A0i(this, A0C3, A0C3);
                igTextView.setTextSize(12.0f);
            }
        } else {
            Context A0L = AbstractC166997dE.A0L(this);
            int A0C4 = AbstractC166987dD.A0C(A0L, 10);
            AbstractC13880nE.A0j(this, A0C4, A0C4);
            int A0C5 = AbstractC166987dD.A0C(A0L, 10);
            AbstractC13880nE.A0i(this, A0C5, A0C5);
        }
        A00(this);
    }

    public final EnumC53257Ngv getButtonType() {
        return this.A04;
    }

    public final void setLabel(CharSequence charSequence) {
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            C14360o3.A0F("labelTextView");
            throw C00O.createAndThrow();
        }
        igTextView.setText(charSequence);
        if (charSequence != null && charSequence.length() != 0) {
            CharSequence contentDescription = getContentDescription();
            if (contentDescription == null || contentDescription.length() == 0) {
                setContentDescription(charSequence);
            }
        }
    }

    public C50811Mcd(Context context, EnumC53257Ngv enumC53257Ngv) {
        super(context);
        int i;
        this.A04 = EnumC53257Ngv.A08;
        this.A03 = EnumC151036r4.A0D;
        Context A0L = AbstractC166997dE.A0L(this);
        int ordinal = enumC53257Ngv.ordinal();
        if (ordinal != 2 && ordinal != 3) {
            if (ordinal != 4) {
                i = 48;
                if (ordinal != 1) {
                    i = 60;
                }
            } else {
                i = 44;
            }
        } else {
            i = 8;
        }
        setMinimumWidth(AbstractC166987dD.A0C(A0L, i));
        setMinimumHeight(AbstractC166987dD.A0C(A0L, ordinal == 4 ? 44 : 48));
        setOrientation(1);
        this.A04 = enumC53257Ngv;
        this.A02 = new IgTextView(A0L);
        IgSimpleImageView igSimpleImageView = new IgSimpleImageView(A0L);
        igSimpleImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01 = igSimpleImageView;
        AbstractC56952jT.A01(this);
        IgTextView igTextView = this.A02;
        if (igTextView != null) {
            igTextView.setGravity(49);
            igTextView.setTextAppearance(R.style.igds_emphasized_body_2);
            boolean z = enumC53257Ngv.A01;
            if (z) {
                igTextView.setSingleLine(true);
                igTextView.setMaxLines(1);
                IgTextView igTextView2 = this.A02;
                if (igTextView2 != null) {
                    igTextView2.setAutoSizeTextTypeUniformWithConfiguration(6, 10, 1, 2);
                }
            } else {
                igTextView.setSingleLine();
            }
            igTextView.setEllipsize(TextUtils.TruncateAt.END);
            int i2 = z ? -1 : -2;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            layoutParams.gravity = 17;
            setTextAlignment(4);
            if (enumC53257Ngv != EnumC53257Ngv.A06) {
                View view = this.A02;
                if (view != null) {
                    addView(view, layoutParams);
                }
            }
            A02();
            return;
        }
        C14360o3.A0F("labelTextView");
        throw C00O.createAndThrow();
    }

    private final float getButtonAlpha() {
        if (!isActivated()) {
            return 0.4f;
        }
        return 1.0f;
    }

    private final int getLabelColor() {
        Context context = getContext();
        EnumC151036r4 enumC151036r4 = this.A03;
        C14360o3.A07(context);
        return context.getColor(enumC151036r4.A01(context));
    }

    public final void A01() {
        Drawable mutate;
        setContentDescription("");
        Drawable drawable = getContext().getDrawable(R.drawable.instagram_chevron_left_outline_16);
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            AbstractC166997dE.A1F(mutate, getLabelColor());
        }
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            C14360o3.A0F("labelTextView");
            throw C00O.createAndThrow();
        }
        igTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A0N = AbstractC167017dG.A0N(canvas, -1510444127);
        ImageView imageView = this.A01;
        if (imageView == null) {
            C14360o3.A0F("iconImageView");
            throw C00O.createAndThrow();
        }
        imageView.setColorFilter(getLabelColor());
        super.draw(canvas);
        C0f9.A0A(1015854882, A0N);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(getButtonAlpha());
    }

    public final void setIconResId(int i) {
        this.A05 = Integer.valueOf(i);
        ImageView imageView = this.A01;
        if (imageView == null) {
            C14360o3.A0F("iconImageView");
            throw C00O.createAndThrow();
        }
        if (indexOfChild(imageView) == -1) {
            Context A0L = AbstractC166997dE.A0L(this);
            int ordinal = this.A04.ordinal();
            int i2 = 14;
            if (ordinal == 4) {
                i2 = 24;
            }
            int A0C = AbstractC166987dD.A0C(A0L, i2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0C, A0C);
            int i3 = 4;
            if (ordinal == 4) {
                i3 = 0;
            }
            layoutParams.setMargins(0, 0, 0, AbstractC166987dD.A0C(A0L, i3));
            layoutParams.gravity = 1;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            addView(imageView, 0, layoutParams);
        }
        Drawable drawable = getContext().getDrawable(i);
        this.A00 = drawable;
        int labelColor = getLabelColor();
        if (drawable != null) {
            drawable.setTint(labelColor);
        }
        setBackgroundColor(labelColor);
        imageView.setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        float buttonAlpha;
        super.setPressed(z);
        if (z) {
            buttonAlpha = 0.7f;
        } else {
            buttonAlpha = getButtonAlpha();
        }
        setAlpha(buttonAlpha);
    }
}
