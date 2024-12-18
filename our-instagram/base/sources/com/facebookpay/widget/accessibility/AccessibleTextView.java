package com.facebookpay.widget.accessibility;

import X.AbstractC010103p;
import X.AbstractC31172DnG;
import X.C14360o3;
import X.C66374UEi;
import X.C69380VmQ;
import X.JQ0;
import X.XEA;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AccessibleTextView extends TextView implements XEA {
    public final C66374UEi A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C66374UEi c66374UEi = new C66374UEi(this);
        this.A00 = c66374UEi;
        C66374UEi.A04 = -1;
        c66374UEi.A00 = false;
        AbstractC010103p.A0B(this, c66374UEi);
    }

    public final void A00(String str) {
        C66374UEi c66374UEi = this.A00;
        C66374UEi.A00(c66374UEi);
        List list = c66374UEi.A03;
        if (0 < list.size()) {
            ((C69380VmQ) list.get(0)).A04 = str;
        }
    }

    @Override // android.widget.TextView, X.XEA
    public float getTextSize() {
        Layout layout = getLayout();
        if (layout == null) {
            return 0.0f;
        }
        float textSize = layout.getPaint().getTextSize();
        if (textSize > 0.0f) {
            return textSize;
        }
        throw AbstractC31172DnG.A0u();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessibleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ AccessibleTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessibleTextView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
