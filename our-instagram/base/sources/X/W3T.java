package X;

import com.facebook.R;
import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: classes11.dex */
public final class W3T {
    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    public static final TextCellParams A00(C67524UnO c67524UnO, Integer num, String str, String str2, boolean z, boolean z2) {
        ImmutableList of;
        int i;
        String A07;
        int i2 = 2131954899;
        int i3 = 2131954903;
        int i4 = 2131954904;
        int i5 = R.id.name_field;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 41) {
                i2 = 2131954897;
                i3 = 2131954896;
                i4 = 2131954898;
                i5 = R.id.first_name_field;
            } else if (intValue == 42) {
                i2 = 2131954901;
                i3 = 2131954900;
                i4 = 2131954902;
                i5 = R.id.last_name_field;
            }
        }
        if (c67524UnO != null) {
            ImmutableList A0E = c67524UnO.A0E();
            C14360o3.A07(A0E);
            boolean coercedBooleanField = c67524UnO.getCoercedBooleanField(6, "is_optional");
            String A0B = c67524UnO.A0B("field_id");
            if (A0B != null) {
                of = ImmutableList.copyOf((Collection) WF4.A04(A0B, c67524UnO.A0A("error_message"), A0E, coercedBooleanField, false, false));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            of = ImmutableList.of((Object) new TextValidatorParams(C05F.A0Y, "", i2, i3));
        }
        C14360o3.A0A(of);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2;
        }
        C67664Uuw c67664Uuw = new C67664Uuw(i);
        c67664Uuw.A01(C05F.A0N);
        C14360o3.A0B(of, 0);
        c67664Uuw.A0G.addAll(of);
        c67664Uuw.A04 = new Object();
        c67664Uuw.A0B = str;
        ((AbstractC69334Vlg) c67664Uuw).A01 = i5;
        c67664Uuw.A09 = "personName";
        c67664Uuw.A0C = z;
        c67664Uuw.A0D = z2;
        if (c67524UnO != null && (A07 = c67524UnO.A07("label")) != null && A07.length() != 0) {
            String A072 = c67524UnO.A07("label");
            if (A072 != null) {
                c67664Uuw.A0A = A072;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            c67664Uuw.A03 = i4;
        }
        if (str2 != null) {
            ((AbstractC69334Vlg) c67664Uuw).A02 = new FormCellLoggingEvents(new FormCellFocusEvents("user_click_contactdetails_atomic", "client_add_contactdetails_fail", "client_add_contactdetails_success", str2));
        }
        return c67664Uuw.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r32.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebookpay.form.fragment.model.FormParams A01(X.C67524UnO r31, java.lang.String r32, int r33, boolean r34, boolean r35) {
        /*
            r30 = this;
            r7 = 2131961481(0x7f132689, float:1.955966E38)
            r0 = 0
            r12 = r32
            if (r32 == 0) goto Lf
            int r1 = r12.length()
            r2 = 0
            if (r1 != 0) goto L10
        Lf:
            r2 = 1
        L10:
            r11 = 0
            if (r2 == 0) goto Lca
            java.lang.String r13 = "new_full_name_form_field"
        L15:
            r10 = r31
            r1 = r34
            r14 = r1
            r15 = r0
            com.facebookpay.form.cell.text.TextCellParams r6 = A00(r10, r11, r12, r13, r14, r15)
            java.lang.String r3 = "client_load_contact_success"
            if (r2 == 0) goto L9c
            java.lang.String r5 = "add_name"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r5, r11)
            java.util.List r16 = X.AbstractC166987dD.A1J(r2)
            java.lang.String r4 = "user_add_contact_submit"
            java.lang.String r3 = "add_name_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r4, r3)
            java.util.List r17 = X.AbstractC166987dD.A1J(r2)
            java.lang.String r2 = "client_add_contact_success"
            java.util.List r18 = X.AbstractC65703TsZ.A1C(r2, r5)
            java.lang.String r2 = "client_add_contact_fail"
            java.util.List r19 = X.AbstractC65703TsZ.A1C(r2, r5)
            com.facebookpay.form.fragment.model.FormLoggingEvents r10 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L50:
            X.WDa r2 = X.C2FP.A0D()
            boolean r2 = r2.A05()
            if (r2 == 0) goto L94
            r2 = 2131961331(0x7f1325f3, float:1.9559356E38)
            com.facebookpay.form.cell.label.LabelCellParams r8 = X.AbstractC69846VwW.A01(r2, r0, r0, r0)
        L61:
            com.facebookpay.form.cell.CellParams[] r2 = new com.facebookpay.form.cell.CellParams[]{r6}
            java.util.ArrayList r19 = X.AbstractC16960so.A1M(r2)
            com.facebookpay.form.fragment.model.FeatureConfiguration r9 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r2 = r35
            r9.<init>(r1, r0, r2)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            r22 = 5
            com.facebookpay.form.fragment.model.FormParams r7 = new com.facebookpay.form.fragment.model.FormParams
            r23 = r33
            r16 = r11
            r17 = r11
            r18 = r11
            r20 = r11
            r21 = r11
            r24 = r0
            r25 = r0
            r26 = r0
            r27 = r0
            r28 = r0
            r29 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r7
        L94:
            r2 = 2131961334(0x7f1325f6, float:1.9559362E38)
            com.facebookpay.form.cell.label.LabelCellParams r8 = X.AbstractC69846VwW.A00(r2)
            goto L61
        L9c:
            java.lang.String r5 = "edit_email"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r5, r11)
            java.util.List r16 = X.AbstractC166987dD.A1J(r2)
            java.lang.String r4 = "user_edit_contact_submit"
            java.lang.String r3 = "edit_name_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r4, r3)
            java.util.List r17 = X.AbstractC166987dD.A1J(r2)
            java.lang.String r2 = "client_edit_contact_success"
            java.util.List r18 = X.AbstractC65703TsZ.A1C(r2, r5)
            java.lang.String r2 = "client_edit_contact_fail"
            java.util.List r19 = X.AbstractC65703TsZ.A1C(r2, r5)
            com.facebookpay.form.fragment.model.FormLoggingEvents r10 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L50
        Lca:
            r13 = r11
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3T.A01(X.UnO, java.lang.String, int, boolean, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}
