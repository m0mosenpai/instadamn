package com.instagram.zero.cms;

import X.AbstractC31173DnH;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.C14360o3;
import X.InterfaceC54742fX;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes6.dex */
public class ZeroCmsTextView extends TextView {
    public InterfaceC54742fX A00;
    public String A01;

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2U);
        C14360o3.A0B(obtainStyledAttributes, 1);
        this.A01 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 1);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            AbstractC31173DnH.A12(context, this, resourceId);
            obtainStyledAttributes.recycle();
        }
    }

    public void setText(String str, String str2) {
        this.A01 = str;
        InterfaceC54742fX interfaceC54742fX = this.A00;
        if (interfaceC54742fX != null) {
            str2 = interfaceC54742fX.getString(str, str2);
        }
        setText(str2);
        setContentDescription(str2);
    }

    public ZeroCmsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public ZeroCmsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public ZeroCmsTextView(Context context) {
        super(context);
        A00(context, null);
    }
}
