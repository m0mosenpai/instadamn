package com.instagram.user.follow;

import X.AbstractC53242c7;
import X.C14360o3;
import X.C1QL;
import X.EnumC110544yR;
import X.EnumC110554yS;
import X.EnumC77553df;
import X.ViewOnAttachStateChangeListenerC110564yT;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import com.instagram.ui.widget.textview.UpdatableButton;
import kotlin.Deprecated;

@Deprecated(message = "You should NOT use this directly and should only use [FollowButton] instead.")
/* loaded from: classes2.dex */
public class FollowButtonBase extends UpdatableButton {
    public int A00;
    public int A01;
    public GradientDrawable A02;
    public C1QL A03;
    public EnumC77553df A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public int A0E;
    public EnumC110544yR A0F;
    public EnumC110554yS A0G;
    public EnumC77553df A0H;
    public boolean A0I;
    public final ViewOnAttachStateChangeListenerC110564yT A0J;
    public final int A0K;
    public final int A0L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FollowButtonBase(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A02() {
        this.A08 = true;
        Context context = getContext();
        C14360o3.A07(context);
        A04(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text_on_media), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0131, code lost:
    
        if (r5 == r0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0223, code lost:
    
        if (r15.A27() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x022d, code lost:
    
        if (r6 == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if (X.AbstractC100604fP.A02(r13) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r11 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00fc, code lost:
    
        if (r12.A0B != false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(com.instagram.common.session.UserSession r13, com.instagram.user.model.FollowStatus r14, com.instagram.user.model.User r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.FollowButtonBase.A05(com.instagram.common.session.UserSession, com.instagram.user.model.FollowStatus, com.instagram.user.model.User, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(com.instagram.user.model.FollowStatus r5) {
        /*
            r4 = this;
            r1 = 0
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            r2 = -1
            r3 = 1
            if (r5 != r0) goto L4c
            boolean r0 = r4.A07()
            if (r0 == 0) goto L3d
            boolean r0 = r4.A09
            if (r0 != 0) goto L3a
            X.4yR r1 = r4.A0F
            X.4yR r0 = X.EnumC110544yR.A03
            if (r1 == r0) goto L37
            X.4yR r0 = X.EnumC110544yR.A04
            if (r1 == r0) goto L3a
            X.4yR r0 = X.EnumC110544yR.A05
            if (r1 != r0) goto L37
            boolean r0 = r4.A0B
            if (r0 == 0) goto L37
            java.lang.Integer r0 = X.C05F.A15
        L25:
            r4.A01 = r0
        L27:
            int r0 = r4.A0D
            if (r0 != r2) goto L2e
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
        L2e:
            r4.A01 = r0
        L30:
            r4.refreshDrawableState()
            r4.A01()
            return
        L37:
            java.lang.Integer r0 = X.C05F.A0j
            goto L25
        L3a:
            java.lang.Integer r0 = X.C05F.A0u
            goto L25
        L3d:
            boolean r0 = r4.A07
            if (r0 == 0) goto L44
            java.lang.Integer r0 = X.C05F.A0Y
            goto L25
        L44:
            boolean r0 = r4.A0B
            r0 = r0 ^ 1
            r4.setIsFollowButtonBlue(r0)
            goto L27
        L4c:
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r5 == r0) goto L54
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            if (r5 != r0) goto L30
        L54:
            boolean r0 = r4.A07()
            if (r0 == 0) goto L76
            X.4yR r0 = r4.A0F
            int r1 = r0.ordinal()
            if (r1 == r3) goto L73
            r0 = 3
            if (r1 == r0) goto L70
            java.lang.Integer r0 = X.C05F.A0u
        L67:
            r4.A01 = r0
        L69:
            int r0 = r4.A0D
            if (r0 != r2) goto L2e
            int r0 = r4.A0K
            goto L2e
        L70:
            java.lang.Integer r0 = X.C05F.A15
            goto L67
        L73:
            java.lang.Integer r0 = X.C05F.A0j
            goto L67
        L76:
            boolean r0 = r4.A07
            if (r0 == 0) goto L7d
            java.lang.Integer r0 = X.C05F.A0Y
            goto L67
        L7d:
            r4.setIsFollowButtonBlue(r1)
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.FollowButtonBase.A06(com.instagram.user.model.FollowStatus):void");
    }

    public final void setBaseStyle(EnumC77553df enumC77553df) {
        C14360o3.A0B(enumC77553df, 0);
        this.A04 = enumC77553df;
        this.A0H = enumC77553df;
        this.A0I = enumC77553df == EnumC77553df.A0D;
    }

    public final void setFollowButtonSize(EnumC110554yS enumC110554yS) {
        int i;
        C14360o3.A0B(enumC110554yS, 0);
        this.A0G = enumC110554yS;
        if (enumC110554yS == EnumC110554yS.A03) {
            i = this.A0L;
        } else {
            i = 0;
        }
        ((ImageWithTitleTextView) this).A00 = i;
    }

    public final void setPrismButtonVariant(C1QL c1ql) {
        C14360o3.A0B(c1ql, 0);
        this.A03 = c1ql;
    }

    public final void setPrismStyle(EnumC110544yR enumC110544yR) {
        C14360o3.A0B(enumC110544yR, 0);
        this.A0F = enumC110544yR;
    }

    private final void setIsFollowButtonBlue(boolean z) {
        if (this.A09) {
            z = false;
        }
        setIsBlueButton(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r0 == null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r4 = this;
            boolean r1 = r4 instanceof com.instagram.user.follow.FollowButton
            boolean r0 = r4.A07()
            if (r1 == 0) goto L1a
            if (r0 != 0) goto L45
            android.graphics.drawable.GradientDrawable r0 = r4.A02
            if (r0 != 0) goto L3e
        Le:
            boolean r0 = r4.A06
            if (r0 == 0) goto L19
            r0 = 0
            r4.A06 = r0
            r0 = 0
        L16:
            r4.setBackground(r0)
        L19:
            return
        L1a:
            if (r0 != 0) goto L45
            android.graphics.drawable.GradientDrawable r0 = r4.A02
            if (r0 == 0) goto Le
            android.content.Context r1 = r4.getContext()
            int r0 = r4.A00
            int r3 = r1.getColor(r0)
            android.graphics.drawable.GradientDrawable r2 = r4.A02
            if (r2 == 0) goto L3c
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r2.setStroke(r0, r3)
        L3c:
            android.graphics.drawable.GradientDrawable r0 = r4.A02
        L3e:
            r4.setBackground(r0)
            r0 = 1
            r4.A06 = r0
            return
        L45:
            android.graphics.drawable.GradientDrawable r0 = r4.A02
            if (r0 != 0) goto L50
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r4.A02 = r0
        L50:
            java.lang.Integer r2 = r4.A01
            java.lang.Integer r3 = X.C05F.A0u
            if (r2 != r3) goto Lc7
            android.content.Context r2 = r4.getContext()
            X.C14360o3.A07(r2)
            android.content.res.ColorStateList r0 = X.C1QI.A09(r2)
        L61:
            android.graphics.drawable.GradientDrawable r1 = r4.A02
            if (r1 == 0) goto L68
            r1.setColor(r0)
        L68:
            java.lang.Integer r1 = r4.A01
            if (r1 != r3) goto La7
            X.C14360o3.A07(r2)
            X.1QL r1 = X.C1QI.A0E()
            X.1QL r0 = X.C1QL.A04
            if (r1 != r0) goto Lba
            r0 = 2131100457(0x7f060329, float:1.7813296E38)
        L7a:
            android.content.res.ColorStateList r3 = X.C02G.A02(r2, r0)
        L7e:
            android.graphics.drawable.GradientDrawable r2 = r4.A02
            if (r2 == 0) goto L90
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165257(0x7f070049, float:1.7944726E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setStroke(r0, r3)
        L90:
            android.graphics.drawable.GradientDrawable r2 = r4.A02
            if (r2 == 0) goto La3
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r2.setCornerRadius(r0)
        La3:
            android.graphics.drawable.GradientDrawable r0 = r4.A02
            goto L16
        La7:
            java.lang.Integer r0 = X.C05F.A15
            if (r1 != r0) goto Lbc
            X.C14360o3.A07(r2)
            X.1QL r1 = X.C1QI.A0E()
            X.1QL r0 = X.C1QL.A04
            if (r1 != r0) goto Lba
            r0 = 2131100455(0x7f060327, float:1.7813292E38)
            goto L7a
        Lba:
            r3 = 0
            goto L7e
        Lbc:
            android.graphics.drawable.GradientDrawable r2 = r4.A02
            if (r2 == 0) goto L90
            r1 = 0
            int r0 = r4.A00
            r2.setStroke(r1, r0)
            goto L90
        Lc7:
            java.lang.Integer r1 = X.C05F.A15
            r0 = 0
            if (r2 != r1) goto Lcd
            r0 = 1
        Lcd:
            android.content.Context r2 = r4.getContext()
            if (r0 == 0) goto Ldb
            X.C14360o3.A07(r2)
            android.content.res.ColorStateList r0 = X.C1QI.A0A(r2)
            goto L61
        Ldb:
            X.C14360o3.A07(r2)
            r0 = 0
            android.content.res.ColorStateList r0 = X.C1QI.A0B(r2, r0)
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.FollowButtonBase.A01():void");
    }

    public final void A03() {
        boolean z = this.A0C;
        Resources resources = getResources();
        int i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        if (z) {
            i = R.dimen.abc_button_padding_horizontal_material;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        boolean z2 = this.A08;
        int i2 = R.dimen.abc_edit_text_inset_bottom_material;
        if (z2) {
            i2 = R.dimen.accent_edge_thickness;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }

    public final void A04(int i, boolean z) {
        GradientDrawable gradientDrawable = this.A02;
        if ((gradientDrawable == null || this.A00 != i || gradientDrawable.getColor() != null) && !A07()) {
            this.A00 = i;
            this.A02 = new GradientDrawable();
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.account_recs_header_image_margin);
            GradientDrawable gradientDrawable2 = this.A02;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setCornerRadius(r2.getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material));
            }
            GradientDrawable gradientDrawable3 = this.A02;
            if (z) {
                if (gradientDrawable3 != null) {
                    gradientDrawable3.setStroke(dimensionPixelOffset, getContext().getColor(this.A00));
                }
            } else if (gradientDrawable3 != null) {
                Context context = getContext();
                gradientDrawable3.setColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_panavision)));
            }
            if (!this.A05) {
                A03();
            }
        }
    }

    public final boolean A07() {
        if (this.A03.A00 && !this.A08 && this.A04 != EnumC77553df.A0F) {
            return true;
        }
        return false;
    }

    public final GradientDrawable getBorder() {
        return this.A02;
    }

    public final int getBorderColor() {
        return this.A00;
    }

    public final boolean getDisableBasePaddingSetting() {
        return this.A05;
    }

    public final boolean getHadBorderOnLastDraw() {
        return this.A06;
    }

    public final ViewOnAttachStateChangeListenerC110564yT getHelper() {
        return this.A0J;
    }

    public final C1QL getPrismButtonVariant() {
        return this.A03;
    }

    public final void setCustomForegroundColor(int i) {
        if (!A07()) {
            this.A0E = i;
            this.A0D = i;
        }
    }

    public final void setIsElevated(boolean z) {
        Context context = getContext();
        int i = R.drawable.button_state_drawable_panavision_soft_update;
        if (z) {
            i = R.drawable.button_elevated_state_drawable_panavision_soft_update;
        }
        setBackground(context.getDrawable(i));
    }

    public final void setBorder(GradientDrawable gradientDrawable) {
        this.A02 = gradientDrawable;
    }

    public final void setBorderColor(int i) {
        this.A00 = i;
    }

    public final void setDisableBasePaddingSetting(boolean z) {
        this.A05 = z;
    }

    public final void setDrawableOnRightSide(boolean z) {
        ((ImageWithTitleTextView) this).A02 = z;
    }

    public final void setHadBorderOnLastDraw(boolean z) {
        this.A06 = z;
    }

    public final void setIsBlackBackground(boolean z) {
        this.A07 = z;
    }

    public final void setIsMediaOverlayButton(boolean z) {
        this.A08 = z;
    }

    public final void setShouldOverrideToGreyBackground(boolean z) {
        this.A09 = z;
    }

    public final void setShouldShowFollowBack(boolean z) {
        this.A0A = z;
    }

    public final void setUseSmallHorizontalPadding(boolean z) {
        this.A0C = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FollowButtonBase(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            r4 = 1
            X.C14360o3.A0B(r8, r4)
            r7.<init>(r8, r9, r10)
            r0 = 2130970282(0x7f0406aa, float:1.754927E38)
            int r0 = X.AbstractC53242c7.A0H(r8, r0)
            r7.A00 = r0
            r0 = 2130970280(0x7f0406a8, float:1.7549266E38)
            int r6 = X.AbstractC53242c7.A0H(r8, r0)
            r7.A0K = r6
            X.4yR r0 = X.EnumC110544yR.A02
            r7.A0F = r0
            X.1QL r0 = X.C1QI.A0E()
            r7.A03 = r0
            int[] r0 = X.AbstractC55922hc.A0p
            r1 = 0
            android.content.res.TypedArray r5 = r8.obtainStyledAttributes(r9, r0, r10, r1)
            X.C14360o3.A07(r5)
            r0 = 2
            java.lang.String r3 = r5.getNonResourceString(r0)
            r2 = -1
            int r0 = r5.getResourceId(r1, r2)
            r7.A0D = r0
            int r0 = r5.getResourceId(r4, r2)
            r7.A0E = r0
            r2 = 3
            boolean r0 = r5.hasValue(r2)
            if (r0 == 0) goto L4d
            boolean r0 = r5.getBoolean(r2, r1)
            r7.setIsElevated(r0)
        L4d:
            r5.recycle()
            r7.setIncludeFontPadding(r1)
            r7.A01 = r6
            if (r3 == 0) goto L5e
            int r0 = r3.hashCode()
            switch(r0) {
                case -1675226276: goto L8c;
                case -1078030475: goto L9b;
                case -1003783559: goto La6;
                case -609832938: goto Lb1;
                case 102742843: goto Lbc;
                case 777739954: goto Lc7;
                case 1538783709: goto Ld2;
                default: goto L5e;
            }
        L5e:
            X.3df r0 = X.EnumC77553df.A0E
        L60:
            r7.A04 = r0
        L62:
            r7.A0H = r0
            int r0 = r7.A00
            r7.A0L = r0
            X.4yS r0 = X.EnumC110554yS.A03
            r7.A0G = r0
            X.4yT r0 = new X.4yT
            r0.<init>(r7)
            r7.A0J = r0
            r7.addOnAttachStateChangeListener(r0)
            r0 = 17
            r7.setGravity(r0)
            java.lang.Integer r2 = X.C05F.A01
            android.view.View$AccessibilityDelegate r0 = X.AbstractC010103p.A00(r7)
            if (r0 != 0) goto L8b
            X.2jU r0 = new X.2jU
            r0.<init>(r2, r1)
            X.AbstractC010103p.A0B(r7, r0)
        L8b:
            return
        L8c:
            java.lang.String r0 = "messageOption"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5e
            X.3df r0 = X.EnumC77553df.A0D
            r7.A04 = r0
            r7.A0I = r4
            goto L62
        L9b:
            java.lang.String r0 = "medium"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5e
            X.3df r0 = X.EnumC77553df.A0C
            goto L60
        La6:
            java.lang.String r0 = "textOnly"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5e
            X.3df r0 = X.EnumC77553df.A0F
            goto L60
        Lb1:
            java.lang.String r0 = "actionbaricon"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5e
            X.3df r0 = X.EnumC77553df.A08
            goto L60
        Lbc:
            java.lang.String r0 = "large"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5e
            X.3df r0 = X.EnumC77553df.A0B
            goto L60
        Lc7:
            java.lang.String r0 = "inlineIcon"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5e
            X.3df r0 = X.EnumC77553df.A0A
            goto L60
        Ld2:
            java.lang.String r0 = "actionableText"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5e
            X.3df r0 = X.EnumC77553df.A07
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.FollowButtonBase.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FollowButtonBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
