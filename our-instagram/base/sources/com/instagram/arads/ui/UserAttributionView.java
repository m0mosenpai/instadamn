package com.instagram.arads.ui;

import X.AbstractC166987dD;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class UserAttributionView extends ConstraintLayout {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserAttributionView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r5.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAttribution(java.lang.String r5, java.lang.String r6, X.InterfaceC11380iw r7, android.view.View.OnClickListener r8) {
        /*
            r4 = this;
            r0 = 2
            X.C14360o3.A0B(r7, r0)
            com.instagram.common.ui.base.IgTextView r3 = r4.A01
            if (r5 == 0) goto Lf
            int r0 = r5.length()
            r1 = 0
            if (r0 != 0) goto L10
        Lf:
            r1 = 1
        L10:
            r2 = 4
            r0 = 0
            if (r1 == 0) goto L15
            r0 = 4
        L15:
            r3.setVisibility(r0)
            r3.setText(r5)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r4.A02
            if (r6 == 0) goto L26
            int r0 = r6.length()
            if (r0 == 0) goto L26
            r2 = 0
        L26:
            r1.setVisibility(r2)
            if (r6 == 0) goto L39
            int r0 = r6.length()
            if (r0 == 0) goto L39
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r6)
            r1.setUrl(r0, r7)
        L39:
            if (r8 == 0) goto L3e
            r4.setOnClickListener(r8)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arads.ui.UserAttributionView.setAttribution(java.lang.String, java.lang.String, X.0iw, android.view.View$OnClickListener):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAttributionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.user_attribution_view, this);
        this.A01 = (IgTextView) requireViewById(R.id.attribution_primary_text);
        IgTextView igTextView = (IgTextView) requireViewById(R.id.attribution_secondary_text);
        this.A00 = igTextView;
        this.A02 = (CircularImageView) requireViewById(R.id.avatar);
        AbstractC166987dD.A1P(context, igTextView, 2131974341);
    }

    public /* synthetic */ UserAttributionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserAttributionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
