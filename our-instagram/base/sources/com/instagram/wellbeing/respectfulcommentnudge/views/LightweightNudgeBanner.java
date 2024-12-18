package com.instagram.wellbeing.respectfulcommentnudge.views;

import X.AbstractC166987dD;
import X.AbstractC43592JPx;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class LightweightNudgeBanner extends IgLinearLayout {
    public final TextView A00;

    public final void setBody(String str) {
        C14360o3.A0B(str, 0);
        this.A00.setText(str);
    }

    public /* synthetic */ LightweightNudgeBanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LightweightNudgeBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        AbstractC43592JPx.A1H(View.inflate(context, R.layout.layout_lightweight_nudge, this), -1, -2);
        this.A00 = AbstractC166987dD.A0e(this, R.id.banner_body);
        setOrientation(1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LightweightNudgeBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LightweightNudgeBanner(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
