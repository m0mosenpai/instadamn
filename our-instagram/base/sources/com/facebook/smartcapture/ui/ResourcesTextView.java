package com.facebook.smartcapture.ui;

import X.AbstractC31173DnH;
import X.AbstractC31179DnN;
import X.AbstractC55922hc;
import X.C14360o3;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes6.dex */
public final class ResourcesTextView extends TextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A21);
        boolean A1Z = AbstractC31179DnN.A1Z(context, obtainStyledAttributes, this);
        int resourceId = obtainStyledAttributes.getResourceId(1, A1Z ? 1 : 0);
        if (resourceId != 0) {
            setHint(context.getText(resourceId));
        }
        AbstractC31179DnN.A0i(context, obtainStyledAttributes, this, A1Z ? 1 : 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(A1Z ? 1 : 0, A1Z ? 1 : 0);
        if (resourceId2 != 0) {
            AbstractC31173DnH.A12(context, this, resourceId2);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesTextView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }
}
