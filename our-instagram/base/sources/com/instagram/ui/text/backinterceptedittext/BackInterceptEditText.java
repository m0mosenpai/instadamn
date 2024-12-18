package com.instagram.ui.text.backinterceptedittext;

import X.C127105oo;
import X.C14360o3;
import X.InterfaceC16820sZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.facebook.R;
import com.instagram.common.ui.base.IgEditText;

/* loaded from: classes3.dex */
public final class BackInterceptEditText extends IgEditText {
    public InterfaceC16820sZ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackInterceptEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, R.style.EditTextStyle);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
        this.A00 = C127105oo.A00;
    }

    @Override // com.instagram.common.ui.base.IgEditText, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C14360o3.A0B(keyEvent, 1);
        if (i == 4 && ((Boolean) this.A00.invoke()).booleanValue()) {
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void setOnBackCallback(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        this.A00 = interfaceC16820sZ;
    }

    public final InterfaceC16820sZ getOnBackCallback() {
        return this.A00;
    }
}
