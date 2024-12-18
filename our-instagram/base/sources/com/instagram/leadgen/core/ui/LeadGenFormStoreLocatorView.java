package com.instagram.leadgen.core.ui;

import X.AbstractC166987dD;
import X.AbstractC31172DnG;
import X.AbstractC50822Mcy;
import X.C00O;
import X.C14360o3;
import X.InterfaceC16660sJ;
import X.InterfaceC57957Pn3;
import X.InterfaceC58120Ppj;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.RadioGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LeadGenFormStoreLocatorView extends AbstractC50822Mcy {
    public String A00;
    public LeadGenFormBaseQuestion A01;
    public final RadioGroup A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final Map A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final LeadGenFormPrismZipView A08;
    public final LeadGenFormZipView A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadGenFormStoreLocatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = "";
        this.A05 = AbstractC166987dD.A1I();
        View.inflate(context, R.layout.lead_gen_view_form_store_locator, this);
        this.A06 = AbstractC31172DnG.A0X(this, R.id.label_text_view);
        this.A09 = (LeadGenFormZipView) requireViewById(R.id.zip_code_picker);
        this.A08 = (LeadGenFormPrismZipView) requireViewById(R.id.prism_zip_code_picker);
        this.A04 = AbstractC31172DnG.A0X(this, R.id.store_locator_error_text_view);
        this.A03 = AbstractC31172DnG.A0X(this, R.id.store_locator_empty_list_text_view);
        this.A02 = (RadioGroup) requireViewById(R.id.store_options);
        this.A07 = AbstractC31172DnG.A0X(this, R.id.optional_label);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        if (r30.A0I == false) goto L22;
     */
    @Override // X.AbstractC50822Mcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r30, boolean r31, boolean r32, boolean r33) {
        /*
            r29 = this;
            r1 = 0
            r6 = r30
            X.C14360o3.A0B(r6, r1)
            r4 = r29
            r5 = r32
            r4.A06 = r5
            r3 = r33
            r4.A04 = r3
            com.instagram.common.ui.base.IgTextView r2 = r4.A06
            java.lang.String r0 = r6.A0A
            r2.setText(r0)
            java.util.List r0 = r6.A0F
            r9 = 0
            r2 = 0
            if (r0 == 0) goto L97
            java.lang.Object r7 = X.AbstractC001800i.A0O(r0, r1)
        L21:
            java.lang.String r0 = "post_code"
            boolean r8 = X.C14360o3.A0K(r7, r0)
            android.content.Context r7 = r4.getContext()
            r0 = 2131964869(0x7f1333c5, float:1.9566532E38)
            if (r8 == 0) goto L92
            r0 = 2131964868(0x7f1333c4, float:1.956653E38)
            java.lang.String r11 = r7.getString(r0)
        L37:
            X.C14360o3.A0A(r11)
            if (r8 == 0) goto L8f
            X.VEF r8 = X.VEF.A0Q
        L3e:
            java.lang.String r10 = r6.A06
            X.0sl r19 = X.C16930sl.A00
            java.lang.String r13 = r4.A00
            java.lang.String r12 = ""
            X.0sk r23 = X.AbstractC06930Yk.A0E()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r7 = new com.instagram.leadgen.core.model.LeadGenFormBaseQuestion
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r20 = r9
            r21 = r9
            r22 = r9
            r24 = r1
            r25 = r1
            r26 = r1
            r27 = r1
            r28 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4.A01 = r7
            com.instagram.leadgen.core.ui.LeadGenFormZipView r7 = r4.A09
            r0 = r32 ^ 1
            int r0 = X.AbstractC167007dF.A05(r0)
            r7.setVisibility(r0)
            com.instagram.leadgen.core.ui.LeadGenFormPrismZipView r7 = r4.A08
            int r0 = X.AbstractC167007dF.A05(r5)
            r7.setVisibility(r0)
            X.Mcy r7 = r4.getZipCodePicker()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = r4.A01
            if (r0 != 0) goto L99
            java.lang.String r0 = "zipQuestion"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L8f:
            X.VEF r8 = X.VEF.A0a
            goto L3e
        L92:
            java.lang.String r11 = r7.getString(r0)
            goto L37
        L97:
            r7 = r9
            goto L21
        L99:
            r7.A0G(r0, r1, r5, r3)
            if (r33 == 0) goto La3
            boolean r0 = r6.A0I
            r1 = 1
            if (r0 != 0) goto La4
        La3:
            r1 = 0
        La4:
            com.instagram.common.ui.base.IgTextView r0 = r4.A07
            if (r1 != 0) goto Laa
            r2 = 8
        Laa:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.ui.LeadGenFormStoreLocatorView.A0G(com.instagram.leadgen.core.model.LeadGenFormBaseQuestion, boolean, boolean, boolean):void");
    }

    public final void setCountryPickerClickListener(InterfaceC16660sJ interfaceC16660sJ) {
        InterfaceC58120Ppj interfaceC58120Ppj;
        C14360o3.A0B(interfaceC16660sJ, 0);
        ViewParent zipCodePicker = getZipCodePicker();
        if ((zipCodePicker instanceof InterfaceC58120Ppj) && (interfaceC58120Ppj = (InterfaceC58120Ppj) zipCodePicker) != null) {
            interfaceC58120Ppj.setOnCountryPickerClickListener(interfaceC16660sJ);
        }
    }

    public final void setCurrentInput(String str) {
        C14360o3.A0B(str, 0);
        this.A00 = str;
    }

    public final void setSearchKeyChangeListener(InterfaceC57957Pn3 interfaceC57957Pn3) {
        C14360o3.A0B(interfaceC57957Pn3, 0);
        getZipCodePicker().A01 = interfaceC57957Pn3;
    }

    private final AbstractC50822Mcy getZipCodePicker() {
        if (((AbstractC50822Mcy) this).A06) {
            return this.A08;
        }
        return this.A09;
    }

    public final String getCurrentInput() {
        return this.A00;
    }

    public final boolean A0I() {
        AbstractC50822Mcy zipCodePicker = getZipCodePicker();
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = this.A01;
        if (leadGenFormBaseQuestion == null) {
            C14360o3.A0F("zipQuestion");
            throw C00O.createAndThrow();
        }
        return zipCodePicker.A0H(leadGenFormBaseQuestion, false);
    }

    public final String getCountryCode() {
        InterfaceC58120Ppj interfaceC58120Ppj;
        ViewParent zipCodePicker = getZipCodePicker();
        if ((zipCodePicker instanceof InterfaceC58120Ppj) && (interfaceC58120Ppj = (InterfaceC58120Ppj) zipCodePicker) != null) {
            return interfaceC58120Ppj.getCurrentCountryCode();
        }
        return "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormStoreLocatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadGenFormStoreLocatorView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LeadGenFormStoreLocatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
