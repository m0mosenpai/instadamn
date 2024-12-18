package com.instagram.video.live.mvvm.view.likes.customviews;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC53541Nm8;
import X.C0f9;
import X.C14360o3;
import X.C50551MTi;
import X.C6RB;
import X.InterfaceC11380iw;
import X.InterfaceC16660sJ;
import X.JQ0;
import X.NYT;
import X.NYU;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class MixedReactionsView extends FrameLayout implements InterfaceC11380iw {
    public InterfaceC16660sJ A00;
    public boolean A01;
    public boolean A02;
    public final String A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MixedReactionsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, C50551MTi.A00);
        C14360o3.A0B(context, 1);
    }

    public final void setOnStickerUrlExpired(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00 = interfaceC16660sJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(android.graphics.drawable.Drawable r10, com.instagram.common.typedurl.ImageUrl r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            X.OCT r5 = new X.OCT
            r5.<init>(r10, r11, r12, r13)
            java.lang.String r3 = r5.A01
            java.lang.String r6 = "AVATAR_REACTION_TYPE"
            boolean r0 = X.C14360o3.A0K(r3, r6)
            android.content.Context r2 = r9.getContext()
            if (r0 == 0) goto Le7
            X.C14360o3.A07(r2)
            r0 = 0
            X.Rbw r4 = new X.Rbw
            r4.<init>(r2, r0)
        L1c:
            int r0 = r9.getRight()
            float r1 = (float) r0
            int r0 = X.AbstractC167017dG.A0B(r2)
            float r0 = (float) r0
            float r1 = r1 - r0
            r4.setX(r1)
            android.graphics.drawable.Drawable r0 = r5.A00
            if (r0 != 0) goto Le2
            com.instagram.common.typedurl.ImageUrl r2 = r5.A02
            if (r2 == 0) goto L3d
            r1 = 5
            X.Whg r0 = new X.Whg
            r0.<init>(r1, r9, r5)
            r4.A0E = r0
            r4.setUrl(r2, r9)
        L3d:
            r9.addView(r4)
            boolean r0 = X.C14360o3.A0K(r3, r6)
            if (r0 == 0) goto Lce
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
        L4d:
            int r8 = r1.getDimensionPixelSize(r0)
        L51:
            boolean r1 = r9.A01
            android.content.res.Resources r2 = r9.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            if (r1 == 0) goto L5f
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
        L5f:
            float r0 = X.AbstractC166987dD.A04(r2, r0)
            int r1 = r9.getRight()
            int r0 = (int) r0
            int r1 = r1 - r0
            int r1 = r1 - r8
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r0 = r1 - r0
            X.17u r5 = new X.17u
            r5.<init>(r0, r1)
            java.lang.String r0 = "EMOJI_REACTION_TYPE"
            boolean r0 = X.C14360o3.A0K(r3, r0)
            if (r0 == 0) goto Lcc
            boolean r0 = r9.A01
            if (r0 != 0) goto Lcc
            r0 = 2131165208(0x7f070018, float:1.7944627E38)
            int r6 = r2.getDimensionPixelSize(r0)
        L8b:
            X.5le r7 = X.AbstractC43592JPx.A0n(r4)
            r2 = 4627448617123184640(0x4038000000000000, double:24.0)
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            X.2hf r0 = X.C55942hf.A04(r2, r0)
            X.5le r3 = r7.A0E(r0)
            float r2 = (float) r8
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.A0R(r1, r2)
            r3.A0N(r1, r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            r3.A0M(r0, r1)
            int r0 = r9.getBottom()
            float r1 = (float) r0
            float r1 = r1 - r2
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r0 = (float) r6
            float r2 = r2 + r0
            r3.A0T(r1, r2)
            X.2Ut r0 = X.AbstractC50712Us.A00
            int r0 = X.C17s.A04(r0, r5)
            float r0 = (float) r0
            r3.A0J(r0)
            X.Lw6 r0 = new X.Lw6
            r0.<init>(r4, r9)
            r3.A06 = r0
            r3.A0H()
            return
        Lcc:
            r6 = 0
            goto L8b
        Lce:
            java.lang.String r0 = "EMOJI_REACTION_TYPE"
            boolean r0 = X.C14360o3.A0K(r3, r0)
            if (r0 == 0) goto Ldf
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            goto L4d
        Ldf:
            r8 = 0
            goto L51
        Le2:
            r4.setImageDrawable(r0)
            goto L3d
        Le7:
            X.C14360o3.A07(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r4 = new com.instagram.common.ui.widget.imageview.IgImageView
            r4.<init>(r2)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.view.likes.customviews.MixedReactionsView.A00(android.graphics.drawable.Drawable, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String):void");
    }

    public final void A01(AbstractC53541Nm8 abstractC53541Nm8) {
        if (this.A02) {
            if (abstractC53541Nm8 instanceof NYT) {
                Spannable spannable = C6RB.A0d;
                Context context = getContext();
                Resources resources = getResources();
                C6RB c6rb = new C6RB(context, resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material));
                c6rb.A0M(((NYT) abstractC53541Nm8).A02);
                c6rb.A0A(AbstractC166987dD.A04(resources, R.dimen.abc_dialog_padding_material));
                A00(c6rb, null, "EMOJI_REACTION_TYPE", null);
            }
            if (abstractC53541Nm8 instanceof NYU) {
                NYU nyu = (NYU) abstractC53541Nm8;
                A00(nyu.A00, nyu.A01, "AVATAR_REACTION_TYPE", nyu.A06);
            }
            invalidate();
        }
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return this.A03;
    }

    public final InterfaceC16660sJ getOnStickerUrlExpired() {
        return this.A00;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-639177397);
        super.onAttachedToWindow();
        this.A02 = true;
        C0f9.A0D(-1709949400, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1992495762);
        super.onDetachedFromWindow();
        this.A02 = false;
        C0f9.A0D(1083793028, A06);
    }

    public final void setSelfView(boolean z) {
        this.A01 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MixedReactionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, C50551MTi.A00);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MixedReactionsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, C50551MTi.A00);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MixedReactionsView(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC16660sJ interfaceC16660sJ) {
        super(context, attributeSet, i, i2);
        AbstractC167007dF.A1G(context, 1, interfaceC16660sJ);
        this.A00 = interfaceC16660sJ;
        this.A03 = "IGLIVE_SELF_MIXED_REACTIONS_VIEW";
    }

    public /* synthetic */ MixedReactionsView(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC16660sJ interfaceC16660sJ, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i3), (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? C50551MTi.A00 : interfaceC16660sJ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MixedReactionsView(Context context) {
        this(context, null, 0, 0, C50551MTi.A00);
        C14360o3.A0B(context, 1);
    }
}
