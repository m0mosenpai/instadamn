package com.instagram.igds.components.button;

import X.AbstractC13880nE;
import X.AbstractC14710oj;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.AbstractC56952jT;
import X.AbstractC99734dr;
import X.C05F;
import X.C14360o3;
import X.C1QI;
import X.C1QL;
import X.C99724dq;
import X.C99744du;
import X.EnumC99704do;
import X.EnumC99714dp;
import X.EnumC99774dy;
import X.KYD;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.widget.CountdownDurationToggle;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class IgdsButton extends FrameLayout {
    public int A00;
    public AbstractC99734dr A01;
    public EnumC99714dp A02;
    public EnumC99704do A03;
    public String A04;
    public boolean A05;
    public int A06;
    public int A07;
    public int A08;
    public C1QL A09;
    public final TextView A0A;
    public final C1QL A0B;
    public final SpinnerImageView A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsButton(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        Context context2 = getContext();
        this.A0A = new TextView(context2);
        this.A0C = new SpinnerImageView(context2);
        this.A03 = EnumC99704do.A07;
        C1QL A0E = C1QI.A0E();
        this.A0B = A0E;
        EnumC99714dp enumC99714dp = EnumC99714dp.A04;
        this.A02 = enumC99714dp;
        this.A01 = new C99724dq(enumC99714dp, A0E);
        A00(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void A00(AttributeSet attributeSet) {
        EnumC99714dp enumC99714dp;
        EnumC99704do enumC99704do;
        setEnabled(true);
        if (attributeSet != null) {
            Context context = getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1P);
            C14360o3.A07(obtainStyledAttributes);
            String A00 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 5);
            if (A00 != null) {
                switch (A00.hashCode()) {
                    case -1170620443:
                        if (A00.equals("secondary_link")) {
                            enumC99704do = EnumC99704do.A07;
                            break;
                        }
                        enumC99704do = EnumC99704do.A08;
                        break;
                    case -1114452969:
                        if (A00.equals("primary_link")) {
                            enumC99704do = EnumC99704do.A04;
                            break;
                        }
                        enumC99704do = EnumC99704do.A08;
                        break;
                    case -817598092:
                        if (A00.equals("secondary")) {
                            enumC99704do = EnumC99704do.A06;
                            break;
                        }
                        enumC99704do = EnumC99704do.A08;
                        break;
                    case -314765822:
                        if (A00.equals("primary")) {
                            enumC99704do = EnumC99704do.A03;
                            break;
                        }
                        enumC99704do = EnumC99704do.A08;
                        break;
                    case 115229344:
                        if (A00.equals("primary_on_color")) {
                            enumC99704do = EnumC99704do.A05;
                            break;
                        }
                        enumC99704do = EnumC99704do.A08;
                        break;
                    case 201619203:
                        if (A00.equals("label_inverted_on_media")) {
                            enumC99704do = EnumC99704do.A02;
                            break;
                        }
                        enumC99704do = EnumC99704do.A08;
                        break;
                    default:
                        enumC99704do = EnumC99704do.A08;
                        break;
                }
                setStyle(enumC99704do);
            }
            String A002 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 4);
            if (A002 != null) {
                int hashCode = A002.hashCode();
                if (hashCode != -1078030475) {
                    if (hashCode != 102742843) {
                        if (hashCode == 950483747 && A002.equals("compact")) {
                            enumC99714dp = EnumC99714dp.A02;
                            this.A02 = enumC99714dp;
                        }
                        enumC99714dp = EnumC99714dp.A05;
                        this.A02 = enumC99714dp;
                    } else {
                        if (A002.equals("large")) {
                            enumC99714dp = EnumC99714dp.A03;
                            this.A02 = enumC99714dp;
                        }
                        enumC99714dp = EnumC99714dp.A05;
                        this.A02 = enumC99714dp;
                    }
                } else {
                    if (A002.equals("medium")) {
                        enumC99714dp = EnumC99714dp.A04;
                        this.A02 = enumC99714dp;
                    }
                    enumC99714dp = EnumC99714dp.A05;
                    this.A02 = enumC99714dp;
                }
            }
            this.A04 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 3);
            this.A00 = obtainStyledAttributes.getResourceId(2, 0);
            this.A05 = obtainStyledAttributes.getBoolean(1, false);
            setEnabled(obtainStyledAttributes.getBoolean(0, true));
            obtainStyledAttributes.recycle();
        }
        A03(isEnabled());
    }

    public final void A02(EnumC99774dy enumC99774dy, int i) {
        C14360o3.A0B(enumC99774dy, 1);
        if (i == 0) {
            this.A0A.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else if (enumC99774dy == EnumC99774dy.A02) {
            this.A0A.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
        } else {
            if (enumC99774dy != EnumC99774dy.A03) {
                return;
            }
            this.A0A.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        this.A01.A04(canvas);
    }

    public final void setIcon(Drawable drawable, EnumC99774dy enumC99774dy) {
        C14360o3.A0B(enumC99774dy, 1);
        if (drawable == null) {
            this.A0A.setCompoundDrawables(null, null, null, null);
        } else if (enumC99774dy == EnumC99774dy.A02) {
            this.A0A.setCompoundDrawables(null, null, drawable, null);
        } else {
            if (enumC99774dy != EnumC99774dy.A03) {
                return;
            }
            this.A0A.setCompoundDrawables(drawable, null, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r1 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (r7 != r0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setSize(X.EnumC99714dp r7) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            r6.A02 = r7
            X.4dr r0 = r6.A01
            r0.A07(r7)
            r0.A01()
            X.4dp r5 = X.EnumC99714dp.A03
            android.content.res.Resources r4 = r6.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r7 != r5) goto L1b
            r0 = 2131165205(0x7f070015, float:1.794462E38)
        L1b:
            int r0 = r4.getDimensionPixelSize(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            r0 = 17
            r1.gravity = r0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r6.A0C
            r0.setLayoutParams(r1)
            int r3 = r7.ordinal()
            r2 = 2
            r1 = 1
            if (r3 == r1) goto La1
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            if (r3 == r2) goto L3d
            r0 = 2131165205(0x7f070015, float:1.794462E38)
        L3d:
            int r0 = r4.getDimensionPixelSize(r0)
            r6.A06 = r0
            if (r3 == r1) goto L9d
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            if (r3 == r2) goto L4c
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
        L4c:
            int r0 = r4.getDimensionPixelSize(r0)
            r6.A07 = r0
            X.AbstractC13880nE.A0i(r6, r0, r0)
            if (r7 != r5) goto L8e
            X.1QL r0 = r6.A0B
            boolean r0 = r0.A00
            r1 = 2131165207(0x7f070017, float:1.7944625E38)
            if (r0 != 0) goto L63
            r1 = 2131165228(0x7f07002c, float:1.7944667E38)
        L63:
            int r0 = r4.getDimensionPixelSize(r1)
            r6.A08 = r0
            X.4dp r0 = X.EnumC99714dp.A02
            if (r7 == r0) goto L88
            X.0od r0 = X.C14650od.A03
            if (r0 == 0) goto La5
            com.instagram.common.session.UserSession r3 = X.C14650od.A00(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320408118501851(0x810938000021db, double:3.032510572460623E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto La5
            if (r1 == 0) goto La5
        L88:
            int r0 = r6.A08
            X.AbstractC13880nE.A0j(r6, r0, r0)
            return
        L8e:
            X.4dp r0 = X.EnumC99714dp.A04
            if (r7 == r0) goto L99
            X.4dp r0 = X.EnumC99714dp.A02
            r1 = 2131165230(0x7f07002e, float:1.7944671E38)
            if (r7 == r0) goto L63
        L99:
            r1 = 2131165206(0x7f070016, float:1.7944623E38)
            goto L63
        L9d:
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            goto L4c
        La1:
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            goto L3d
        La5:
            int r0 = r6.A08
            X.AbstractC13880nE.A0i(r6, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.button.IgdsButton.setSize(X.4dp):void");
    }

    public final void setStyle(EnumC99704do enumC99704do) {
        C14360o3.A0B(enumC99704do, 0);
        if (this.A03 != enumC99704do) {
            this.A03 = enumC99704do;
            A01();
        }
    }

    public static /* synthetic */ void setIcon$default(IgdsButton igdsButton, int i, EnumC99774dy enumC99774dy, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                enumC99774dy = EnumC99774dy.A02;
            }
            igdsButton.A02(enumC99774dy, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIcon");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x008a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Type inference failed for: r2v16, types: [X.4dr, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.button.IgdsButton.A01():void");
    }

    public final void A03(boolean z) {
        if (this instanceof CountdownDurationToggle) {
            CountdownDurationToggle countdownDurationToggle = (CountdownDurationToggle) this;
            Resources resources = countdownDurationToggle.getResources();
            countdownDurationToggle.A02 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            countdownDurationToggle.A01();
            countdownDurationToggle.A01 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
            AbstractC13880nE.A0i(countdownDurationToggle, dimensionPixelSize, dimensionPixelSize);
            countdownDurationToggle.setWillNotDraw(false);
            countdownDurationToggle.setEnabled(z);
            countdownDurationToggle.setImportantForAccessibility(1);
            AbstractC56952jT.A04(countdownDurationToggle, C05F.A06);
            return;
        }
        TextView textView = this.A0A;
        textView.setGravity(17);
        textView.setTextAppearance(R.style.igds_emphasized_body_1);
        textView.setLines(1);
        textView.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        Integer num = C05F.A01;
        AbstractC14710oj.A07(getContext(), null, textView, num);
        setText(this.A04);
        A02(EnumC99774dy.A02, this.A00);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(textView, layoutParams);
        SpinnerImageView spinnerImageView = this.A0C;
        spinnerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        spinnerImageView.setVisibility(8);
        addView(spinnerImageView, new FrameLayout.LayoutParams(-2, -2));
        setSize(this.A02);
        A01();
        setWillNotDraw(false);
        setEnabled(z);
        setImportantForAccessibility(1);
        AbstractC56952jT.A04(this, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r6 = this;
            X.4dr r5 = r6.A01
            int[] r4 = r6.getDrawableState()
            X.C14360o3.A07(r4)
            android.widget.TextView r3 = r6.A0A
            boolean r0 = r5 instanceof X.C99744du
            if (r0 == 0) goto L50
            X.4du r5 = (X.C99744du) r5
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            X.1QL r0 = r5.A0C
            boolean r0 = r0.A00
            if (r0 == 0) goto L4c
            android.content.res.ColorStateList r2 = r5.A03
            if (r2 == 0) goto L2c
            android.graphics.Paint r1 = r5.A09
            int r0 = r2.getDefaultColor()
            int r0 = r2.getColorForState(r4, r0)
            r1.setColor(r0)
        L2c:
            android.content.res.ColorStateList r2 = r5.A02
            if (r2 == 0) goto L3d
            android.graphics.Paint r1 = r5.A08
            int r0 = r2.getDefaultColor()
            int r0 = r2.getColorForState(r4, r0)
            r1.setColor(r0)
        L3d:
            android.content.res.ColorStateList r1 = r5.A04
        L3f:
            if (r1 == 0) goto L4c
            int r0 = r1.getDefaultColor()
            int r0 = r1.getColorForState(r4, r0)
            r3.setTextColor(r0)
        L4c:
            super.drawableStateChanged()
            return
        L50:
            boolean r0 = r5 instanceof X.C110674yf
            if (r0 == 0) goto L63
            X.4yf r5 = (X.C110674yf) r5
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            X.1QL r0 = r5.A01
            boolean r0 = r0.A00
            if (r0 == 0) goto L4c
            android.content.res.ColorStateList r1 = r5.A00
            goto L3f
        L63:
            boolean r0 = r5 instanceof X.C99754dv
            if (r0 == 0) goto L8b
            X.4dv r5 = (X.C99754dv) r5
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            android.content.res.ColorStateList r2 = r5.A01
            if (r2 == 0) goto L7e
            android.graphics.Paint r1 = r5.A06
            int r0 = r2.getDefaultColor()
            int r0 = r2.getColorForState(r4, r0)
            r1.setColor(r0)
        L7e:
            X.1QL r0 = r5.A05
            if (r0 != 0) goto L84
            X.1QL r0 = r5.A08
        L84:
            boolean r0 = r0.A00
            if (r0 == 0) goto L4c
            android.content.res.ColorStateList r1 = r5.A02
            goto L3f
        L8b:
            boolean r0 = r5 instanceof X.C99724dq
            if (r0 == 0) goto L4c
            X.4dq r5 = (X.C99724dq) r5
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            X.1QL r0 = r5.A01
            boolean r0 = r0.A00
            if (r0 == 0) goto L4c
            android.content.res.ColorStateList r1 = r5.A00
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.button.IgdsButton.drawableStateChanged():void");
    }

    public final boolean getElevated() {
        return this.A05;
    }

    public final int getIcon() {
        return this.A00;
    }

    public final C1QL getOverridePrismVariant() {
        return this.A09;
    }

    public final C1QL getPrismButtonVariant() {
        return this.A0B;
    }

    public final EnumC99714dp getSize() {
        return this.A02;
    }

    public final EnumC99704do getStyle() {
        return this.A03;
    }

    public final CharSequence getText() {
        return this.A0A.getText();
    }

    public final TextView getTextView() {
        return this.A0A;
    }

    public final Layout getTextViewLayout() {
        Layout layout = this.A0A.getLayout();
        C14360o3.A07(layout);
        return layout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
    
        if (r1 != false) goto L12;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.widget.TextView r5 = r6.A0A
            r6.measureChild(r5, r7, r8)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r6.A0C
            r6.measureChild(r1, r7, r8)
            int r2 = r5.getMeasuredWidth()
            int r0 = r6.A07
            int r0 = r0 * 2
            int r2 = r2 + r0
            int r1 = r1.getMeasuredWidth()
            int r0 = r6.A07
            int r0 = r0 * 2
            int r1 = r1 + r0
            int r0 = r6.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = java.lang.Math.max(r2, r0)
            X.0od r0 = X.C14650od.A03
            if (r0 == 0) goto L43
            com.instagram.common.session.UserSession r4 = X.C14650od.A00(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320408118501851(0x810938000021db, double:3.032510572460623E-306)
            boolean r1 = X.C18U.A06(r2, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L43
            if (r1 != 0) goto L5c
        L43:
            X.1QL r0 = r6.A0B
            boolean r0 = r0.A00
            if (r0 != 0) goto L5c
            int r0 = r6.A06
        L4b:
            int r2 = android.view.View.resolveSize(r3, r7)
            int r1 = android.view.View.resolveSize(r0, r8)
            X.4dr r0 = r6.A01
            r0.A02(r2, r1)
            r6.setMeasuredDimension(r2, r1)
            return
        L5c:
            int r2 = r6.A06
            int r1 = r5.getMeasuredHeight()
            int r0 = r6.A08
            int r0 = r0 * 2
            int r1 = r1 + r0
            int r0 = r6.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = java.lang.Math.max(r2, r0)
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.button.IgdsButton.onMeasure(int, int):void");
    }

    public final void setActive(boolean z) {
        AbstractC99734dr c99744du;
        if (this.A03 == EnumC99704do.A06) {
            setSelected(z);
            C1QL c1ql = this.A0B;
            EnumC99714dp enumC99714dp = this.A02;
            if (z) {
                c99744du = new KYD(enumC99714dp, c1ql);
            } else {
                c99744du = new C99744du(enumC99714dp, c1ql);
            }
            this.A01 = c99744du;
            TextView textView = this.A0A;
            Resources resources = getResources();
            C14360o3.A07(resources);
            c99744du.A03(resources, textView);
            this.A01.A08(this.A0C);
            setText(textView.getText().toString());
            invalidate();
        }
    }

    public final void setElevated(boolean z) {
        this.A05 = z;
        this.A01.A06(this.A0A, z);
    }

    public final void setIconPadding(int i) {
        this.A0A.setCompoundDrawablePadding(i);
    }

    public final void setLoading(boolean z) {
        this.A01.A05(this, this.A0C, this.A0A, z);
        setEnabled(!z);
    }

    public final void setOverridePrismVariant(C1QL c1ql) {
        if (this.A09 != c1ql) {
            this.A09 = c1ql;
            A01();
        }
    }

    public final void setText(String str) {
        this.A04 = str;
        if (str != null) {
            this.A0A.setText(str);
            setContentDescription(str);
        }
    }

    public final void setTextColor(int i) {
        this.A0A.setTextColor(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A01.A09(this, this.A0A, z);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (isPressed() != z) {
            this.A01.A0A(this, this.A0A, z);
        }
        super.setPressed(z);
    }

    @Override // android.view.View
    @Deprecated(message = "Background is set by IGDSButton and should not be changed refer to the IGDS Button Spec to see the different variants available", replaceWith = @ReplaceWith(expression = "Unit", imports = {}))
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Context context2 = getContext();
        this.A0A = new TextView(context2);
        this.A0C = new SpinnerImageView(context2);
        this.A03 = EnumC99704do.A07;
        C1QL A0E = C1QI.A0E();
        this.A0B = A0E;
        EnumC99714dp enumC99714dp = EnumC99714dp.A04;
        this.A02 = enumC99714dp;
        this.A01 = new C99724dq(enumC99714dp, A0E);
        A00(attributeSet);
    }

    public static /* synthetic */ void setIcon$default(IgdsButton igdsButton, Drawable drawable, EnumC99774dy enumC99774dy, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                enumC99774dy = EnumC99774dy.A02;
            }
            igdsButton.setIcon(drawable, enumC99774dy);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIcon");
    }

    public final void setText(int i) {
        setText(getContext().getString(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        Context context2 = getContext();
        this.A0A = new TextView(context2);
        this.A0C = new SpinnerImageView(context2);
        this.A03 = EnumC99704do.A07;
        C1QL A0E = C1QI.A0E();
        this.A0B = A0E;
        EnumC99714dp enumC99714dp = EnumC99714dp.A04;
        this.A02 = enumC99714dp;
        this.A01 = new C99724dq(enumC99714dp, A0E);
        A00(attributeSet);
    }

    public /* synthetic */ IgdsButton(Context context, EnumC99704do enumC99704do, EnumC99714dp enumC99714dp, String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, enumC99704do, enumC99714dp, str, i, (i2 & 32) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsButton(Context context, EnumC99704do enumC99704do, EnumC99714dp enumC99714dp, String str, int i, boolean z) {
        super(context);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(enumC99704do, 2);
        C14360o3.A0B(enumC99714dp, 3);
        Context context2 = getContext();
        this.A0A = new TextView(context2);
        this.A0C = new SpinnerImageView(context2);
        this.A03 = EnumC99704do.A07;
        C1QL A0E = C1QI.A0E();
        this.A0B = A0E;
        EnumC99714dp enumC99714dp2 = EnumC99714dp.A04;
        this.A02 = enumC99714dp2;
        this.A01 = new C99724dq(enumC99714dp2, A0E);
        setStyle(enumC99704do);
        this.A02 = enumC99714dp;
        this.A04 = str;
        this.A00 = i;
        this.A05 = z;
        A03(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsButton(Context context, EnumC99704do enumC99704do, EnumC99714dp enumC99714dp, String str, int i) {
        this(context, enumC99704do, enumC99714dp, str, i, false);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(enumC99704do, 2);
        C14360o3.A0B(enumC99714dp, 3);
    }
}
