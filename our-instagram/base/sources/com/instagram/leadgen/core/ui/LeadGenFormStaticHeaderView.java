package com.instagram.leadgen.core.ui;

import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.C14360o3;
import X.InterfaceC11380iw;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LeadGenFormStaticHeaderView extends ConstraintLayout {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;
    public final IgImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenFormStaticHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_form_static_header, this);
        this.A02 = AbstractC31173DnH.A0T(this, R.id.static_header_profile_image);
        this.A03 = AbstractC31172DnG.A0Z(this, R.id.static_header_info_icon);
        this.A00 = AbstractC31172DnG.A0X(this, R.id.static_header_business_name);
        this.A01 = AbstractC31172DnG.A0X(this, R.id.static_header_business_info_text);
    }

    public final void A0D(InterfaceC11380iw interfaceC11380iw, LeadGenProfileContentInfo leadGenProfileContentInfo) {
        this.A00.setText(leadGenProfileContentInfo.A02);
        this.A02.setUrl(leadGenProfileContentInfo.A00, interfaceC11380iw);
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload = leadGenProfileContentInfo.A01;
        if (leadGenTrustSignalsPayload != null) {
            setUpHeaderFromPayload(leadGenTrustSignalsPayload);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r1 == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setUpHeaderFromPayload(com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r6) {
        /*
            r5 = this;
            X.NhC r0 = r6.A00()
            int r3 = r0.ordinal()
            r2 = 1
            r1 = 4
            r0 = 0
            if (r3 == r1) goto L58
            if (r3 != r2) goto L36
            com.instagram.leadgen.core.model.LeadGenTrustSignal r1 = r6.A02
            if (r1 == 0) goto L36
            java.lang.String r1 = r1.A02
            if (r1 == 0) goto L36
            java.lang.Integer r3 = X.AbstractC003100w.A0i(r1)
            if (r3 == 0) goto L36
            int r1 = r3.intValue()
            if (r1 <= 0) goto L36
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r0 = X.AbstractC166997dE.A0M(r2)
            java.lang.String r1 = X.C84963qk.A03(r0, r3)
            r0 = 2131964993(0x7f133441, float:1.9566783E38)
            java.lang.String r0 = X.AbstractC167007dF.A0f(r2, r1, r0)
        L36:
            boolean r4 = r6.A01()
            com.instagram.common.ui.base.IgTextView r3 = r5.A01
            r3.setText(r0)
            r2 = 0
            if (r0 == 0) goto L49
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L4b
        L49:
            r0 = 8
        L4b:
            r3.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A03
            if (r4 != 0) goto L54
            r2 = 8
        L54:
            r0.setVisibility(r2)
            return
        L58:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r1 = r6.A00
            if (r1 == 0) goto L36
            java.lang.String r0 = r1.A02
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.ui.LeadGenFormStaticHeaderView.setUpHeaderFromPayload(com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormStaticHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormStaticHeaderView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormStaticHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
