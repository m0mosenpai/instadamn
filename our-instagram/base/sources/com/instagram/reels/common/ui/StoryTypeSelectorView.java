package com.instagram.reels.common.ui;

import X.ANH;
import X.ANT;
import X.AbstractC56952jT;
import X.C05F;
import X.C14360o3;
import X.C184478Gm;
import X.C81W;
import X.C81Z;
import X.EnumC184458Gk;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC184488Gn;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public class StoryTypeSelectorView extends IgFrameLayout {
    public int A00;
    public int A01;
    public EnumC184458Gk A02;
    public boolean A03;
    public int A04;
    public int A05;
    public InterfaceC184488Gn A06;
    public final int A07;
    public final float A08;
    public final AccelerateDecelerateInterpolator A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final boolean A0G;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryTypeSelectorView(Context context) {
        this(context, null, 0, false, null, "", "");
        C14360o3.A0B(context, 1);
    }

    public final void setFirstOptionDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        getFirstOptionImageView().setImageDrawable(drawable);
    }

    public final void setOnOptionSelectedListener(InterfaceC184488Gn interfaceC184488Gn) {
        C14360o3.A0B(interfaceC184488Gn, 0);
        this.A06 = interfaceC184488Gn;
    }

    public final void setOptionLabels(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        getFirstOptionTextView().setText(str);
        getSecondOptionTextView().setText(str2);
    }

    public final void setSecondOptionDrawable(Drawable drawable) {
        FrameLayout.LayoutParams layoutParams;
        C14360o3.A0B(drawable, 0);
        getSecondOptionImageView().setImageDrawable(drawable);
        ViewGroup.LayoutParams layoutParams2 = getSecondOptionImageView().getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            Context context = getContext();
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = context.getResources().getDimensionPixelSize(R.dimen.direct_reply_avatar_button_double_overlap_offset);
            layoutParams.gravity = 8388629;
            ((ViewGroup.LayoutParams) layoutParams).width = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
            ((ViewGroup.LayoutParams) layoutParams).height = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        }
    }

    public final void setSecondOptionUrl(String str, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        getSecondOptionImageView().setUrl(new SimpleImageUrl(str), interfaceC11380iw);
    }

    public final void setSelectedType(EnumC184458Gk enumC184458Gk) {
        C14360o3.A0B(enumC184458Gk, 0);
        this.A02 = enumC184458Gk;
        InterfaceC184488Gn interfaceC184488Gn = this.A06;
        if (interfaceC184488Gn != null) {
            C81Z c81z = ((C184478Gm) interfaceC184488Gn).A00;
            if (enumC184458Gk == EnumC184458Gk.A02) {
                c81z.A0V.A0N(C81W.A0I);
            } else if (enumC184458Gk == EnumC184458Gk.A03) {
                c81z.A0V.A0L(C81W.A0I);
            }
        }
        A01(this);
    }

    private final ValueAnimator A00(View view, EnumC184458Gk enumC184458Gk, float f, float f2) {
        int i;
        int i2;
        ValueAnimator ofFloat;
        ValueAnimator.AnimatorUpdateListener anh;
        if (enumC184458Gk == EnumC184458Gk.A02) {
            i = this.A05;
            i2 = this.A04;
        } else {
            i = this.A04;
            i2 = this.A05;
        }
        if (i != i2) {
            ofFloat = ValueAnimator.ofArgb(i, i2);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(this.A09);
            anh = new ANT(view, f, f2, i, i2);
        } else {
            ofFloat = ValueAnimator.ofFloat(f, f2);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(this.A09);
            anh = new ANH(view);
        }
        ofFloat.addUpdateListener(anh);
        return ofFloat;
    }

    public static final void A01(StoryTypeSelectorView storyTypeSelectorView) {
        Integer num;
        View secondOptionImageView;
        View highlightPillView;
        float f;
        boolean z = storyTypeSelectorView.A0G;
        if (!z) {
            IgTextView firstOptionTextView = storyTypeSelectorView.getFirstOptionTextView();
            num = C05F.A01;
            AbstractC56952jT.A04(firstOptionTextView, num);
            secondOptionImageView = storyTypeSelectorView.getSecondOptionTextView();
        } else {
            IgImageView firstOptionImageView = storyTypeSelectorView.getFirstOptionImageView();
            num = C05F.A01;
            AbstractC56952jT.A04(firstOptionImageView, num);
            secondOptionImageView = storyTypeSelectorView.getSecondOptionImageView();
        }
        AbstractC56952jT.A04(secondOptionImageView, num);
        int ordinal = storyTypeSelectorView.A02.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (!z) {
                    storyTypeSelectorView.getFirstOptionTextView().setTextColor(storyTypeSelectorView.A07);
                    storyTypeSelectorView.getSecondOptionTextView().setTextColor(storyTypeSelectorView.A01);
                    storyTypeSelectorView.getFirstOptionTextView().setSelected(false);
                    storyTypeSelectorView.getSecondOptionTextView().setSelected(true);
                    storyTypeSelectorView.getHighlightPillView().getBackground().mutate().setTint(storyTypeSelectorView.A05);
                } else {
                    storyTypeSelectorView.getFirstOptionImageView().setSelected(false);
                    storyTypeSelectorView.getSecondOptionImageView().setSelected(true);
                }
                highlightPillView = storyTypeSelectorView.getHighlightPillView();
                f = storyTypeSelectorView.A08;
            } else {
                throw new RuntimeException();
            }
        } else {
            if (!z) {
                storyTypeSelectorView.getFirstOptionTextView().setTextColor(storyTypeSelectorView.A00);
                storyTypeSelectorView.getSecondOptionTextView().setTextColor(storyTypeSelectorView.A07);
                storyTypeSelectorView.getFirstOptionTextView().setSelected(true);
                storyTypeSelectorView.getSecondOptionTextView().setSelected(false);
                storyTypeSelectorView.getHighlightPillView().getBackground().mutate().setTint(storyTypeSelectorView.A04);
            } else {
                storyTypeSelectorView.getFirstOptionImageView().setSelected(true);
                storyTypeSelectorView.getSecondOptionImageView().setSelected(false);
            }
            highlightPillView = storyTypeSelectorView.getHighlightPillView();
            f = 0.0f;
        }
        highlightPillView.setTranslationX(f);
    }

    private final IgImageView getFirstOptionImageView() {
        Object value = this.A0A.getValue();
        C14360o3.A07(value);
        return (IgImageView) value;
    }

    private final IgTextView getFirstOptionTextView() {
        Object value = this.A0B.getValue();
        C14360o3.A07(value);
        return (IgTextView) value;
    }

    private final View getHighlightPillView() {
        Object value = this.A0C.getValue();
        C14360o3.A07(value);
        return (View) value;
    }

    private final IgTextView getSecondOptionTextView() {
        Object value = this.A0E.getValue();
        C14360o3.A07(value);
        return (IgTextView) value;
    }

    private final View getTypeSelectorBackgroundView() {
        Object value = this.A0F.getValue();
        C14360o3.A07(value);
        return (View) value;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r10 = this;
            X.8Gk r0 = r10.A02
            int r0 = r0.ordinal()
            r4 = 0
            r7 = 0
            r6 = 1
            if (r0 == r7) goto L96
            if (r0 != r6) goto L103
            X.8Gk r5 = X.EnumC184458Gk.A02
            r1 = r5
            r10.setSelectedType(r5)
            boolean r3 = r10.A0G
            if (r3 != 0) goto L88
            com.instagram.common.ui.base.IgTextView r0 = r10.getFirstOptionTextView()
            if (r0 == 0) goto L20
            r0.setSelected(r6)
        L20:
            com.instagram.common.ui.base.IgTextView r0 = r10.getSecondOptionTextView()
        L24:
            if (r0 == 0) goto L29
            r0.setSelected(r7)
        L29:
            android.view.View r2 = r10.getHighlightPillView()
            float r0 = r10.A08
            android.animation.ValueAnimator r6 = r10.A00(r2, r5, r0, r4)
            if (r3 != 0) goto Lf0
            com.instagram.common.ui.base.IgTextView r2 = r10.getSecondOptionTextView()
            int r0 = r10.A01
            int r9 = r10.A07
            int[] r0 = new int[]{r0, r9}
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofArgb(r0)
            r3 = 200(0xc8, double:9.9E-322)
            r8.setDuration(r3)
            X.ANJ r0 = new X.ANJ
            r0.<init>(r2)
            r8.addUpdateListener(r0)
            com.instagram.common.ui.base.IgTextView r7 = r10.getFirstOptionTextView()
        L56:
            if (r5 != r1) goto L85
            int r0 = r10.A00
        L5a:
            int[] r0 = new int[]{r9, r0}
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofArgb(r0)
            r2.setDuration(r3)
            X.ANI r0 = new X.ANI
            r0.<init>(r7)
            r2.addUpdateListener(r0)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            X.AN0 r0 = new X.AN0
            r0.<init>(r10)
            r1.addListener(r0)
            android.animation.Animator[] r0 = new android.animation.Animator[]{r2, r8, r6}
        L7e:
            r1.playTogether(r0)
            r1.start()
            return
        L85:
            int r0 = r10.A01
            goto L5a
        L88:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.getFirstOptionImageView()
            if (r0 == 0) goto L91
            r0.setSelected(r6)
        L91:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.getSecondOptionImageView()
            goto L24
        L96:
            X.8Gk r5 = X.EnumC184458Gk.A03
            r10.setSelectedType(r5)
            boolean r2 = r10.A0G
            if (r2 != 0) goto Le2
            com.instagram.common.ui.base.IgTextView r0 = r10.getFirstOptionTextView()
            if (r0 == 0) goto La8
            r0.setSelected(r7)
        La8:
            com.instagram.common.ui.base.IgTextView r0 = r10.getSecondOptionTextView()
        Lac:
            if (r0 == 0) goto Lb1
            r0.setSelected(r6)
        Lb1:
            android.view.View r1 = r10.getHighlightPillView()
            float r0 = r10.A08
            android.animation.ValueAnimator r6 = r10.A00(r1, r5, r4, r0)
            if (r2 != 0) goto Lf0
            com.instagram.common.ui.base.IgTextView r2 = r10.getFirstOptionTextView()
            X.8Gk r1 = X.EnumC184458Gk.A02
            int r0 = r10.A00
            int r9 = r10.A07
            int[] r0 = new int[]{r0, r9}
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofArgb(r0)
            r3 = 200(0xc8, double:9.9E-322)
            r8.setDuration(r3)
            X.ANJ r0 = new X.ANJ
            r0.<init>(r2)
            r8.addUpdateListener(r0)
            com.instagram.common.ui.base.IgTextView r7 = r10.getSecondOptionTextView()
            goto L56
        Le2:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.getFirstOptionImageView()
            if (r0 == 0) goto Leb
            r0.setSelected(r7)
        Leb:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.getSecondOptionImageView()
            goto Lac
        Lf0:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            X.AN0 r0 = new X.AN0
            r0.<init>(r10)
            r1.addListener(r0)
            android.animation.Animator[] r0 = new android.animation.Animator[]{r6}
            goto L7e
        L103:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.common.ui.StoryTypeSelectorView.A02():void");
    }

    public final IgImageView getSecondOptionImageView() {
        Object value = this.A0D.getValue();
        C14360o3.A07(value);
        return (IgImageView) value;
    }

    public final EnumC184458Gk getSelectedType() {
        return this.A02;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.A03) {
            return false;
        }
        return super.performClick();
    }

    public final void setAnimating(boolean z) {
        this.A03 = z;
    }

    public final void setBackgroundDrawable(int i) {
        getTypeSelectorBackgroundView().setBackground(getContext().getDrawable(i));
    }

    public final void setHighlightDrawable(int i) {
        getHighlightPillView().setBackground(getContext().getDrawable(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryTypeSelectorView(Context context, AttributeSet attributeSet, int i, boolean z) {
        this(context, attributeSet, i, z, null, "", "");
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d1, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0075, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StoryTypeSelectorView(android.content.Context r5, android.util.AttributeSet r6, int r7, boolean r8, com.instagram.common.session.UserSession r9, java.lang.String r10, java.lang.String r11) {
        /*
            r4 = this;
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            r0 = 6
            X.C14360o3.A0B(r10, r0)
            r0 = 7
            X.C14360o3.A0B(r11, r0)
            r4.<init>(r5, r6, r7)
            r4.A0G = r8
            r1 = 22
            X.9E9 r0 = new X.9E9
            r0.<init>(r4, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r4.A0F = r0
            r1 = 21
            X.9E9 r0 = new X.9E9
            r0.<init>(r4, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r4.A0C = r0
            r1 = 32
            X.9Fv r0 = new X.9Fv
            r0.<init>(r10, r4, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r4.A0B = r0
            r1 = 34
            X.9Fv r0 = new X.9Fv
            r0.<init>(r11, r4, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r4.A0E = r0
            r1 = 31
            X.9Fv r0 = new X.9Fv
            r0.<init>(r10, r4, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r4.A0A = r0
            r1 = 33
            X.9Fv r0 = new X.9Fv
            r0.<init>(r11, r4, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r4.A0D = r0
            if (r8 == 0) goto Le1
            android.content.res.Resources r3 = r5.getResources()
            if (r9 == 0) goto L77
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322409573263579(0x810b0a000028db, double:3.033776300511151E-306)
            boolean r1 = X.C18U.A06(r2, r9, r0)
            r0 = 2131165383(0x7f0700c7, float:1.7944982E38)
            if (r1 != 0) goto L7a
        L77:
            r0 = 2131165733(0x7f070225, float:1.7945691E38)
        L7a:
            int r0 = r3.getDimensionPixelSize(r0)
            float r0 = (float) r0
        L7f:
            r4.A08 = r0
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r4.A09 = r0
            r1 = 2130970282(0x7f0406aa, float:1.754927E38)
            int r0 = X.AbstractC53242c7.A0H(r5, r1)
            int r0 = r5.getColor(r0)
            r4.A00 = r0
            int r0 = X.AbstractC53242c7.A0H(r5, r1)
            int r0 = r5.getColor(r0)
            r4.A01 = r0
            r1 = 2131099780(0x7f060084, float:1.7811923E38)
            int r0 = r5.getColor(r1)
            r4.A04 = r0
            int r0 = r5.getColor(r1)
            r4.A05 = r0
            r0 = 2130970314(0x7f0406ca, float:1.7549335E38)
            int r0 = X.AbstractC53242c7.A0H(r5, r0)
            int r0 = r5.getColor(r0)
            r4.A07 = r0
            X.8Gk r0 = X.EnumC184458Gk.A02
            r4.A02 = r0
            if (r8 == 0) goto Ldd
            if (r9 == 0) goto Ld3
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322409573263579(0x810b0a000028db, double:3.033776300511151E-306)
            boolean r1 = X.C18U.A06(r2, r9, r0)
            r0 = 2131627546(0x7f0e0e1a, float:1.888236E38)
            if (r1 != 0) goto Ld6
        Ld3:
            r0 = 2131627545(0x7f0e0e19, float:1.8882357E38)
        Ld6:
            android.view.View.inflate(r5, r0, r4)
            A01(r4)
            return
        Ldd:
            r0 = 2131627231(0x7f0e0cdf, float:1.888172E38)
            goto Ld6
        Le1:
            r0 = 91
            float r0 = X.AbstractC13880nE.A04(r5, r0)
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.common.ui.StoryTypeSelectorView.<init>(android.content.Context, android.util.AttributeSet, int, boolean, com.instagram.common.session.UserSession, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryTypeSelectorView(Context context, AttributeSet attributeSet, int i, boolean z, UserSession userSession, String str) {
        this(context, attributeSet, i, z, userSession, str, "");
        C14360o3.A0B(context, 1);
        C14360o3.A0B(str, 6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryTypeSelectorView(Context context, AttributeSet attributeSet, int i, boolean z, UserSession userSession) {
        this(context, attributeSet, i, z, userSession, "", "");
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ StoryTypeSelectorView(Context context, AttributeSet attributeSet, int i, boolean z, UserSession userSession, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) == 0 ? z : false, (i2 & 16) == 0 ? userSession : null, (i2 & 32) != 0 ? "" : str, (i2 & 64) == 0 ? str2 : "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryTypeSelectorView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, null, "", "");
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryTypeSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, null, "", "");
        C14360o3.A0B(context, 1);
    }
}
