package com.instagram.igds.components.bottombutton;

import X.C14360o3;
import X.C64P;
import X.C64R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class IgdsBottomButtonLayout extends C64P {
    public final C64P A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsBottomButtonLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // X.C64P
    public void setButtonType(C64R c64r) {
        C14360o3.A0B(c64r, 0);
        this.A00.setButtonType(c64r);
    }

    @Override // X.C64P
    public void setDividerVisible(boolean z) {
        this.A00.setDividerVisible(z);
    }

    public final void setFooterAboveActionText(CharSequence charSequence) {
        this.A00.A04(charSequence, 0);
    }

    public final void setFooterText(CharSequence charSequence) {
        this.A00.A05(charSequence, 0);
    }

    @Override // X.C64P
    public void setPrimaryActionIsLoading(boolean z) {
        this.A00.setPrimaryActionIsLoading(z);
    }

    @Override // X.C64P
    public void setPrimaryActionOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setPrimaryActionOnClickListener(onClickListener);
    }

    @Override // X.C64P
    public void setPrimaryActionText(CharSequence charSequence) {
        this.A00.setPrimaryActionText(charSequence);
    }

    @Override // X.C64P
    public void setPrimaryButtonEnabled(boolean z) {
        this.A00.setPrimaryButtonEnabled(z);
    }

    @Override // X.C64P
    public void setSecondaryActionOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setSecondaryActionOnClickListener(onClickListener);
    }

    @Override // X.C64P
    public void setSecondaryActionText(CharSequence charSequence) {
        this.A00.setSecondaryActionText(charSequence);
    }

    @Override // X.C64P
    public void setSecondaryButtonEnabled(boolean z) {
        this.A00.setSecondaryButtonEnabled(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.64Q, X.64P, android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.64P, android.widget.LinearLayout, X.V8E, android.view.View, android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IgdsBottomButtonLayout(android.content.Context r16, android.util.AttributeSet r17, int r18) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* synthetic */ IgdsBottomButtonLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsBottomButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
