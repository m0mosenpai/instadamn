package com.instagram.fbpay.hub.view;

import X.AbstractC167007dF;
import X.AbstractC31176DnK;
import X.AbstractC55922hc;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class BrandingRowItem extends ConstraintLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingRowItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View inflate = View.inflate(context, R.layout.branding_row_item, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A06);
        C14360o3.A07(obtainStyledAttributes);
        ImageView A0D = AbstractC31176DnK.A0D(inflate, R.id.icon);
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.title);
        TextView A0N2 = AbstractC167007dF.A0N(inflate, R.id.subtitle);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            A0D.setImageResource(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId2 != 0) {
            A0N.setText(resourceId2);
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId3 != 0) {
            A0N2.setText(resourceId3);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandingRowItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ BrandingRowItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandingRowItem(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
