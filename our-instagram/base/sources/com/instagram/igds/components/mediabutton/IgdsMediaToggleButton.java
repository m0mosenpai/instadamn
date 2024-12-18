package com.instagram.igds.components.mediabutton;

import X.AbstractC167027dH;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC53242c7;
import X.C14360o3;
import X.EnumC142696cV;
import X.EnumC142706cW;
import X.EnumC151036r4;
import X.EnumC151046r5;
import X.EnumC53269Nh7;
import X.JQ0;
import X.ViewOnClickListenerC55465OkK;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class IgdsMediaToggleButton extends IgdsMediaButton {
    public EnumC53269Nh7 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r2 != 3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:5:0x0018, B:7:0x001e, B:9:0x0022, B:11:0x0027, B:13:0x002d, B:15:0x0036), top: B:4:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IgdsMediaToggleButton(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            r5 = 1
            X.C14360o3.A0B(r7, r5)
            r6.<init>(r7, r8, r9)
            X.Nh7 r4 = X.EnumC53269Nh7.A05
            r6.A00 = r4
            if (r8 == 0) goto L46
            android.content.res.Resources$Theme r2 = r7.getTheme()
            int[] r1 = X.AbstractC55922hc.A1X
            r0 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r8, r1, r9, r0)
            int r2 = r3.getInt(r0, r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == r0) goto L2c
            X.Nh7 r1 = X.EnumC53269Nh7.A06     // Catch: java.lang.Throwable -> L3e
            if (r2 == r5) goto L2d
            X.Nh7 r1 = X.EnumC53269Nh7.A07     // Catch: java.lang.Throwable -> L3e
            r0 = 2
            if (r2 == r0) goto L2d
            X.Nh7 r1 = X.EnumC53269Nh7.A08     // Catch: java.lang.Throwable -> L3e
            r0 = 3
            if (r2 == r0) goto L2d
        L2c:
            r1 = r4
        L2d:
            r6.A00 = r1     // Catch: java.lang.Throwable -> L3e
            r0 = 6
            boolean r0 = r3.hasValue(r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L43
            java.lang.String r1 = "IgdsMediaToggleButton"
            java.lang.String r0 = "For media toggle buttons, please set mediaToggleButtonStyle instead of mediaButtonStyle attribute."
            X.C0w9.A03(r1, r0)     // Catch: java.lang.Throwable -> L3e
            goto L43
        L3e:
            r0 = move-exception
            r3.recycle()
            throw r0
        L43:
            r3.recycle()
        L46:
            X.Nh7 r0 = r6.A00
            r6.setToggleButtonStyle(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.mediabutton.IgdsMediaToggleButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setToggleButtonStyle(EnumC53269Nh7 enumC53269Nh7) {
        C14360o3.A0B(enumC53269Nh7, 0);
        this.A00 = enumC53269Nh7;
        A00(enumC53269Nh7);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(ViewOnClickListenerC55465OkK.A00(onClickListener, this, 34));
    }

    private final void A00(EnumC53269Nh7 enumC53269Nh7) {
        EnumC151036r4 enumC151036r4;
        GradientDrawable gradientDrawable;
        if (isSelected()) {
            if (this.A00.A00 == 0) {
                Drawable background = getBackground();
                if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                    gradientDrawable.setColor(AbstractC31173DnH.A01(getContext()));
                }
                A06();
                return;
            }
            enumC151036r4 = enumC53269Nh7.A02;
        } else {
            enumC151036r4 = enumC53269Nh7.A01;
        }
        setButtonStyle(enumC151036r4);
    }

    @Override // com.instagram.igds.components.mediabutton.IgdsMediaButton
    public int getLabelColor() {
        if (isSelected()) {
            if (AbstractC31174DnI.A1a(EnumC53269Nh7.A05, this.A00.toString())) {
                Context context = getContext();
                return context.getColor(AbstractC53242c7.A0A(context));
            }
        }
        return super.getLabelColor();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        A00(this.A00);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsMediaToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsMediaToggleButton(Context context, EnumC53269Nh7 enumC53269Nh7, EnumC151046r5 enumC151046r5, EnumC142696cV enumC142696cV) {
        super(context, enumC53269Nh7.A01, enumC151046r5, enumC142696cV, (EnumC142706cW) null);
        AbstractC167027dH.A0a(1, context, enumC53269Nh7, enumC151046r5, enumC142696cV);
        this.A00 = EnumC53269Nh7.A05;
        setToggleButtonStyle(enumC53269Nh7);
    }

    public /* synthetic */ IgdsMediaToggleButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsMediaToggleButton(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
