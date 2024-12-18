package com.instagram.leadgen.core.ui;

import X.AbstractC166997dE;
import X.AbstractC52579NNz;
import X.C14360o3;
import X.C55205OeH;
import X.InterfaceC16660sJ;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LeadGenFormPrismZipView extends AbstractC52579NNz {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormPrismZipView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
        C14360o3.A0B(context, 1);
    }

    @Override // X.AbstractC52579NNz, X.NO5, X.AbstractC50822Mcy
    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        super.A0G(leadGenFormBaseQuestion, z, z2, z3);
        FC3(C55205OeH.A00(AbstractC166997dE.A0L(this), getCurrentCountryCode()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (r1 == false) goto L7;
     */
    @Override // X.InterfaceC58120Ppj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FC3(X.C51761Mtk r6) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r5.A00 = r6
            android.content.Context r4 = r5.getContext()
            r0 = 2131964851(0x7f1333b3, float:1.9566495E38)
            java.lang.String r3 = X.AbstractC166997dE.A0p(r4, r0)
            com.instagram.igds.components.form.IgFormField r2 = r5.A02
            java.lang.String r1 = r6.A03()
            r0 = 2131964853(0x7f1333b5, float:1.95665E38)
            java.lang.String r0 = X.AbstractC31174DnI.A0t(r4, r3, r1, r0)
            r2.setComboFieldText(r1, r0)
            java.text.SimpleDateFormat r0 = X.C55205OeH.A04
            java.lang.String r1 = r6.A03()     // Catch: java.lang.IllegalArgumentException -> L3f
            r0 = 0
            com.facebook.common.locale.Country r0 = com.facebook.common.locale.Country.A00(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L3f
            if (r0 == 0) goto L3f
            com.google.common.collect.ImmutableSet r1 = X.XkX.A02
            java.util.Locale r0 = r0.A00
            java.lang.String r0 = r0.getCountry()
            boolean r1 = r1.contains(r0)
            r0 = 528497(0x81071, float:7.40582E-40)
            if (r1 != 0) goto L40
        L3f:
            r0 = 3
        L40:
            r2.setInputType(r0)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r1 = r5.A00
            if (r1 == 0) goto L4c
            java.lang.String r0 = r1.A00
            r5.A0F(r1, r0)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.ui.LeadGenFormPrismZipView.FC3(X.Mtk):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormPrismZipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenFormPrismZipView(Context context, AttributeSet attributeSet, int i, InterfaceC16660sJ interfaceC16660sJ) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        ((AbstractC52579NNz) this).A01 = interfaceC16660sJ;
    }

    public /* synthetic */ LeadGenFormPrismZipView(Context context, AttributeSet attributeSet, int i, InterfaceC16660sJ interfaceC16660sJ, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, JQ0.A03(i2, i), (i2 & 8) != 0 ? null : interfaceC16660sJ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormPrismZipView(Context context) {
        this(context, null, 0, null);
        C14360o3.A0B(context, 1);
    }
}
