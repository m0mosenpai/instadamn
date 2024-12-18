package com.instagram.common.ui.base;

import X.AbstractC31173DnH;
import X.AbstractC31179DnN;
import X.AbstractC55922hc;
import X.C14360o3;
import X.C14640oc;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckBox;
import kotlin.Deprecated;

@Deprecated(message = "IgCheckBox is no longer supported. Use IgdsCheckBox instead")
/* loaded from: classes6.dex */
public class IgCheckBox extends CheckBox {
    public final boolean A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = C14640oc.A05();
        A00(context, attributeSet);
    }

    public void A01() {
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A11);
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
        A01();
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = C14640oc.A05();
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgCheckBox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        this.A00 = C14640oc.A05();
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgCheckBox(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A00 = C14640oc.A05();
    }
}
