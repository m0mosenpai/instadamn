package X;

import android.telephony.PhoneNumberFormattingTextWatcher;
import com.facebook.R;
import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: classes11.dex */
public final class W3U {
    /* JADX WARN: Type inference failed for: r0v5, types: [android.telephony.PhoneNumberFormattingTextWatcher, com.facebookpay.form.cell.text.formatter.TextFormatter] */
    public static final TextCellParams A00(C67524UnO c67524UnO, String str, String str2, boolean z, boolean z2) {
        ImmutableList of;
        String optionalStringField;
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
            of = ImmutableList.of((Object) new TextValidatorParams(C05F.A0Y, "", 2131954911, 2131954910), (Object) new TextValidatorParams(C05F.A01, "25", 2131961536, 0), (Object) new TextValidatorParams(C05F.A02, "", 2131961536, 0));
        }
        C67664Uuw c67664Uuw = new C67664Uuw(0);
        c67664Uuw.A01(C05F.A0j);
        C14360o3.A0A(of);
        C14360o3.A0B(of, 0);
        c67664Uuw.A0G.addAll(of);
        c67664Uuw.A0B = str;
        c67664Uuw.A04 = new PhoneNumberFormattingTextWatcher();
        ((AbstractC69334Vlg) c67664Uuw).A01 = R.id.phone_number_field;
        c67664Uuw.A09 = "phoneNumber";
        c67664Uuw.A0C = z;
        c67664Uuw.A0D = z2;
        if (c67524UnO != null && (optionalStringField = c67524UnO.getOptionalStringField(0, "label")) != null && optionalStringField.length() != 0) {
            String optionalStringField2 = c67524UnO.getOptionalStringField(0, "label");
            if (optionalStringField2 != null) {
                c67664Uuw.A0A = optionalStringField2;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            c67664Uuw.A03 = 2131954913;
        }
        if (str2 != null) {
            ((AbstractC69334Vlg) c67664Uuw).A02 = new FormCellLoggingEvents(new FormCellFocusEvents("user_click_contactdetails_atomic", "client_add_contactdetails_fail", "client_add_contactdetails_success", str2));
        }
        return c67664Uuw.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r36.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebookpay.form.fragment.model.FormParams A01(X.C67524UnO r34, java.lang.Integer r35, java.lang.String r36, java.lang.String r37, int r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3U.A01(X.UnO, java.lang.Integer, java.lang.String, java.lang.String, int, boolean, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}
