package com.instagram.igds.components.mediabutton;

import X.AbstractC13880nE;
import X.AbstractC14710oj;
import X.AbstractC56952jT;
import X.C05F;
import X.C142716cX;
import X.C14360o3;
import X.C3DY;
import X.EnumC142696cV;
import X.EnumC142706cW;
import X.EnumC151036r4;
import X.EnumC151046r5;
import X.EnumC53232NgU;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public class IgdsMediaButton extends FrameLayout {
    public TextView A00;
    public EnumC151046r5 A01;
    public EnumC142706cW A02;
    public C142716cX A03;
    public float A04;
    public int A05;
    public EnumC151036r4 A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsMediaButton(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A05() {
        this.A03 = null;
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, textView.getCompoundDrawablesRelative()[2], (Drawable) null);
        A01(this);
    }

    public final void setButtonStyle(EnumC151036r4 enumC151036r4) {
        C14360o3.A0B(enumC151036r4, 0);
        this.A06 = enumC151036r4;
        A06();
        setBackground(A04());
    }

    public final void setEndAddOn(EnumC53232NgU enumC53232NgU) {
        int i;
        Drawable mutate;
        C14360o3.A0B(enumC53232NgU, 0);
        int i2 = enumC53232NgU.A00;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        i = R.drawable.instagram_arrow_right_pano_filled_24;
                        if (i2 != 5) {
                            i = 0;
                        }
                    } else {
                        i = R.drawable.instagram_camera_pano_filled_12;
                    }
                } else {
                    i = R.drawable.instagram_chevron_down_pano_outline_12;
                }
            } else {
                i = R.drawable.instagram_arrow_right_outline_12;
            }
        } else {
            i = R.drawable.instagram_chevron_right_pano_outline_12;
        }
        Context context = getContext();
        Drawable drawable = context.getDrawable(i);
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(C3DY.A00(context.getColor(this.A06.A01(context))));
        }
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], (Drawable) null, drawable, (Drawable) null);
        int i3 = 17;
        if (i != 0) {
            i3 = 8388627;
        }
        textView.setGravity(i3);
        A01(this);
    }

    public final void setSegmentedButtonStyle(EnumC142706cW enumC142706cW) {
        C14360o3.A0B(enumC142706cW, 0);
        this.A02 = enumC142706cW;
        setBackground(A04());
    }

    public final void setSize(EnumC151046r5 enumC151046r5) {
        C14360o3.A0B(enumC151046r5, 0);
        this.A01 = enumC151046r5;
    }

    public final void setStartAddOn(C142716cX c142716cX, CharSequence charSequence) {
        C14360o3.A0B(c142716cX, 0);
        if (charSequence != null && charSequence.length() != 0) {
            setContentDescription(charSequence);
        }
        int i = c142716cX.A00;
        if (i != 0) {
            setStartIcon(i);
        } else {
            Drawable drawable = c142716cX.A01;
            if (drawable != null) {
                setStartDrawable(drawable);
            }
        }
        this.A03 = c142716cX;
        A01(this);
    }

    public final void setWidthMode(EnumC142696cV enumC142696cV) {
        C14360o3.A0B(enumC142696cV, 0);
        int i = -1;
        if (enumC142696cV == EnumC142696cV.A02) {
            i = -2;
        }
        setLayoutParams(new ViewGroup.LayoutParams(i, -2));
    }

    private final void A00(EnumC151046r5 enumC151046r5, EnumC151036r4 enumC151036r4, EnumC142696cV enumC142696cV, EnumC142706cW enumC142706cW, float f, int i) {
        Integer num = C05F.A01;
        AbstractC56952jT.A04(this, num);
        TextView textView = this.A00;
        textView.setGravity(17);
        textView.setTextAppearance(R.style.igds_emphasized_body_2);
        AbstractC14710oj.A07(textView.getContext(), null, textView, num);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(textView, layoutParams);
        this.A01 = enumC151046r5;
        setButtonStyle(enumC151036r4);
        if (enumC142706cW != null) {
            setSegmentedButtonStyle(enumC142706cW);
        }
        setWidthMode(enumC142696cV);
        this.A05 = i;
        this.A04 = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r1 == 0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.igds.components.mediabutton.IgdsMediaButton r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.mediabutton.IgdsMediaButton.A01(com.instagram.igds.components.mediabutton.IgdsMediaButton):void");
    }

    private final boolean A02() {
        Drawable drawable = this.A00.getCompoundDrawablesRelative()[0];
        if (drawable == null || this.A01.A00 != 1) {
            return false;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Context context = getContext();
        C14360o3.A07(context);
        int A04 = (int) AbstractC13880nE.A04(context, 24);
        if (A04 != intrinsicHeight && A04 != intrinsicWidth) {
            return false;
        }
        return true;
    }

    private final boolean A03() {
        Drawable drawable = this.A00.getCompoundDrawablesRelative()[0];
        if (drawable == null || this.A01.A00 != 4) {
            return false;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Context context = getContext();
        C14360o3.A07(context);
        int A04 = (int) AbstractC13880nE.A04(context, 20);
        if (A04 != intrinsicHeight && A04 != intrinsicWidth) {
            return false;
        }
        return true;
    }

    private final void setStartDrawable(Drawable drawable) {
        int i;
        int i2;
        EnumC151046r5 enumC151046r5 = this.A01;
        Context context = getContext();
        C14360o3.A07(context);
        int i3 = enumC151046r5.A00;
        if (i3 == 2) {
            i = 8;
        } else if (i3 == 0) {
            i = 16;
        } else if (i3 == 4) {
            i = 20;
        } else {
            i = 24;
            if (i3 == 3) {
                i = 38;
            }
        }
        int A04 = (int) AbstractC13880nE.A04(context, i);
        int i4 = this.A01.A00;
        if (i4 == 2) {
            i2 = 8;
        } else if (i4 == 0) {
            i2 = 16;
        } else {
            i2 = 24;
            if (i4 == 4) {
                i2 = 20;
            }
        }
        int A042 = (int) AbstractC13880nE.A04(context, i2);
        if (drawable != null) {
            drawable.setBounds(0, 0, A04, A042);
        }
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelative(drawable, null, textView.getCompoundDrawablesRelative()[2], null);
    }

    public final GradientDrawable A04() {
        float f;
        float[] fArr;
        EnumC142706cW enumC142706cW = this.A02;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Context context = getContext();
        EnumC151036r4 enumC151036r4 = this.A06;
        C14360o3.A07(context);
        gradientDrawable.setColor(context.getColor(enumC151036r4.A00(context)));
        if (this.A06.A00 == 0) {
            f = AbstractC13880nE.A04(context, 8);
        } else {
            f = 0.0f;
        }
        setElevation(f);
        if (enumC142706cW != null) {
            int ordinal = enumC142706cW.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    fArr = new float[]{0.0f, 0.0f, 500.0f, 500.0f, 500.0f, 500.0f, 0.0f, 0.0f};
                } else {
                    throw new RuntimeException();
                }
            } else {
                fArr = new float[]{500.0f, 500.0f, 0.0f, 0.0f, 0.0f, 0.0f, 500.0f, 500.0f};
            }
            gradientDrawable.setCornerRadii(fArr);
            return gradientDrawable;
        }
        gradientDrawable.setCornerRadius(500.0f);
        return gradientDrawable;
    }

    public final int getCompoundDrawablePadding() {
        return this.A00.getCompoundDrawablePadding();
    }

    public final String getLabel() {
        return this.A00.getText().toString();
    }

    public final TextView getLabelView() {
        return this.A00;
    }

    public final float getLabelWidth() {
        this.A00.measure(0, 0);
        return r1.getMeasuredWidth();
    }

    public final EnumC151046r5 getMediaButtonSize() {
        return this.A01;
    }

    public final EnumC142706cW getSegmentedButtonStyle() {
        return this.A02;
    }

    public final void setCompoundDrawablePadding(int i) {
        this.A00.setCompoundDrawablePadding(i);
    }

    public final void setLabel(CharSequence charSequence) {
        CharSequence contentDescription;
        this.A00.setText(charSequence);
        if (charSequence != null && charSequence.length() != 0 && ((contentDescription = getContentDescription()) == null || contentDescription.length() == 0)) {
            setContentDescription(charSequence);
        }
        A01(this);
    }

    public final void setLabelAlpha(float f) {
        this.A00.setAlpha(f);
    }

    private final void setStartIcon(int i) {
        Drawable mutate;
        Drawable drawable = getContext().getDrawable(i);
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(C3DY.A00(getLabelColor()));
        }
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, textView.getCompoundDrawablesRelative()[2], (Drawable) null);
    }

    public final void A06() {
        Drawable mutate;
        int labelColor = getLabelColor();
        TextView textView = this.A00;
        textView.setTextColor(labelColor);
        C142716cX c142716cX = this.A03;
        if (c142716cX != null && c142716cX.A00 != 0) {
            textView.getCompoundDrawablesRelative()[0].mutate().setColorFilter(C3DY.A00(labelColor));
        }
        Drawable drawable = textView.getCompoundDrawablesRelative()[2];
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(C3DY.A00(labelColor));
        }
    }

    public int getLabelColor() {
        Context context = getContext();
        EnumC151036r4 enumC151036r4 = this.A06;
        C14360o3.A07(context);
        return context.getColor(enumC151036r4.A01(context));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        EnumC151036r4 enumC151036r4 = this.A06;
        if (enumC151036r4 != EnumC151036r4.A08 && enumC151036r4 != EnumC151036r4.A0B && enumC151036r4 != EnumC151036r4.A03 && enumC151036r4 != EnumC151036r4.A06 && enumC151036r4 != EnumC151036r4.A07) {
            if (getBackground() != null) {
                Drawable background = getBackground();
                int i = 77;
                if (isEnabled()) {
                    i = 255;
                }
                background.setAlpha(i);
                return;
            }
            return;
        }
        float f = 0.3f;
        if (z) {
            f = 1.0f;
        }
        setLabelAlpha(f);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        int i;
        super.setPressed(z);
        if (isEnabled() && getBackground() != null) {
            Drawable background = getBackground();
            if (z) {
                i = 179;
            } else {
                i = 77;
                if (isEnabled()) {
                    i = 255;
                }
            }
            background.setAlpha(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r6 == 12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        if (r6 == 5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        if (r6 == 1) goto L49;
     */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.6cX, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IgdsMediaButton(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.mediabutton.IgdsMediaButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsMediaButton(Context context, EnumC151036r4 enumC151036r4, EnumC151046r5 enumC151046r5, EnumC142696cV enumC142696cV) {
        this(context, enumC151036r4, enumC151046r5, enumC142696cV, (EnumC142706cW) null);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(enumC151036r4, 2);
        C14360o3.A0B(enumC151046r5, 3);
        C14360o3.A0B(enumC142696cV, 4);
    }

    public /* synthetic */ IgdsMediaButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsMediaButton(Context context, EnumC151036r4 enumC151036r4, EnumC151046r5 enumC151046r5, EnumC142696cV enumC142696cV, EnumC142706cW enumC142706cW) {
        super(context);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(enumC151036r4, 2);
        C14360o3.A0B(enumC151046r5, 3);
        C14360o3.A0B(enumC142696cV, 4);
        this.A06 = EnumC151036r4.A0D;
        this.A01 = EnumC151046r5.A07;
        this.A04 = -1.0f;
        Context context2 = getContext();
        C14360o3.A07(context2);
        this.A00 = new IgTextView(context2);
        A00(enumC151046r5, enumC151036r4, enumC142696cV, enumC142706cW, 0.0f, 0);
    }

    public /* synthetic */ IgdsMediaButton(Context context, EnumC151036r4 enumC151036r4, EnumC151046r5 enumC151046r5, EnumC142696cV enumC142696cV, EnumC142706cW enumC142706cW, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, enumC151036r4, enumC151046r5, enumC142696cV, (i & 16) != 0 ? null : enumC142706cW);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsMediaButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
