package X;

import android.util.Patterns;
import com.facebook.R;
import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: classes11.dex */
public final class W3S {
    public static final TextCellParams A00(C67524UnO c67524UnO, String str, String str2, boolean z, boolean z2) {
        ImmutableList of;
        String A07;
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
            TextValidatorParams textValidatorParams = new TextValidatorParams(C05F.A0Y, "", 2131954888, 2131954887);
            Integer num = C05F.A0N;
            String pattern = Patterns.EMAIL_ADDRESS.pattern();
            C14360o3.A07(pattern);
            of = ImmutableList.of((Object) textValidatorParams, (Object) new TextValidatorParams(num, pattern, 2131961416, 0));
        }
        C67664Uuw c67664Uuw = new C67664Uuw(1);
        c67664Uuw.A01(C05F.A0u);
        AbstractC167007dF.A1C(of);
        c67664Uuw.A0G.addAll(of);
        c67664Uuw.A0B = str;
        ((AbstractC69334Vlg) c67664Uuw).A01 = R.id.email_field;
        c67664Uuw.A09 = AbstractC58317Pt9.A00(768);
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
            c67664Uuw.A03 = 2131954891;
        }
        if (str2 != null) {
            ((AbstractC69334Vlg) c67664Uuw).A02 = new FormCellLoggingEvents(new FormCellFocusEvents("user_click_contactdetails_atomic", "client_add_contactdetails_fail", "client_add_contactdetails_success", str2));
        }
        return c67664Uuw.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r39.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebookpay.form.fragment.model.FormParams A01(X.C67524UnO r37, java.lang.Integer r38, java.lang.String r39, java.lang.String r40, int r41, boolean r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3S.A01(X.UnO, java.lang.Integer, java.lang.String, java.lang.String, int, boolean, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}
