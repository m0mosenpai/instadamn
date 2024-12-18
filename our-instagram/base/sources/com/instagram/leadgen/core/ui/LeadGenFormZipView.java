package com.instagram.leadgen.core.ui;

import X.AbstractC166997dE;
import X.C14360o3;
import X.C55205OeH;
import X.C55345Oi5;
import X.InterfaceC16660sJ;
import X.JQ0;
import X.NOA;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LeadGenFormZipView extends NOA {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenFormZipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, null);
        C14360o3.A0B(context, 1);
    }

    @Override // X.NOA, X.AbstractC50822Mcy
    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        super.A0G(leadGenFormBaseQuestion, z, z2, z3);
        IgFormField igFormField = ((NOA) this).A04;
        igFormField.setText(leadGenFormBaseQuestion.A00);
        setLastKnownInput(leadGenFormBaseQuestion.A00);
        igFormField.A0H(new C55345Oi5(2, leadGenFormBaseQuestion, this));
        FC3(C55205OeH.A00(AbstractC166997dE.A0L(this), getCurrentCountryCode()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r1 == false) goto L7;
     */
    @Override // X.NOA, X.InterfaceC58120Ppj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FC3(X.C51761Mtk r4) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            super.FC3(r4)
            com.instagram.common.ui.base.IgTextView r1 = r3.A03
            java.lang.String r0 = r4.A03()
            r1.setText(r0)
            com.instagram.igds.components.form.IgFormField r2 = r3.A04
            java.text.SimpleDateFormat r0 = X.C55205OeH.A04
            java.lang.String r1 = r4.A03()     // Catch: java.lang.IllegalArgumentException -> L30
            r0 = 0
            com.facebook.common.locale.Country r0 = com.facebook.common.locale.Country.A00(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L30
            if (r0 == 0) goto L30
            com.google.common.collect.ImmutableSet r1 = X.XkX.A02
            java.util.Locale r0 = r0.A00
            java.lang.String r0 = r0.getCountry()
            boolean r1 = r1.contains(r0)
            r0 = 528497(0x81071, float:7.40582E-40)
            if (r1 != 0) goto L31
        L30:
            r0 = 3
        L31:
            r2.setInputType(r0)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r1 = r3.A00
            if (r1 == 0) goto L3d
            java.lang.String r0 = r1.A00
            r3.A0F(r1, r0)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.ui.LeadGenFormZipView.FC3(X.Mtk):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenFormZipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, null);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenFormZipView(Context context, AttributeSet attributeSet, int i, InterfaceC16660sJ interfaceC16660sJ) {
        super(context, attributeSet, i, interfaceC16660sJ);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormZipView(Context context, AttributeSet attributeSet, int i, InterfaceC16660sJ interfaceC16660sJ, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, JQ0.A03(i2, i), (i2 & 8) != 0 ? null : interfaceC16660sJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenFormZipView(Context context) {
        super(context, null, 0, null);
        C14360o3.A0B(context, 1);
    }
}
