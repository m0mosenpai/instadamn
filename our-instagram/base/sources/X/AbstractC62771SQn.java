package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.Map;

/* renamed from: X.SQn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62771SQn {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(android.content.Context r7, com.facebook.browser.lite.extensions.autofill.model.AutofillData r8) {
        /*
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            r2 = 1
            java.util.Map r6 = r8.A00
            java.lang.String r5 = "tel"
            java.lang.Object r1 = r6.get(r5)
            if (r1 == 0) goto L75
            com.facebook.phonenumbers.PhoneNumberUtil r4 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r7)
            X.C14360o3.A0A(r4)
            X.C14360o3.A0B(r4, r2)
            java.lang.String r2 = "tel-country-code"
            java.lang.String r1 = X.AbstractC166987dD.A1A(r2, r6)
            r7 = 0
            if (r1 == 0) goto L3b
            boolean r1 = X.AbstractC001900j.A0T(r1)
            if (r1 != 0) goto L3b
            java.lang.String r2 = X.AbstractC166987dD.A1A(r2, r6)
        L2e:
            if (r2 == 0) goto L75
        L30:
            boolean r1 = X.AbstractC001900j.A0T(r2)
            if (r1 != 0) goto L75
            java.lang.String r1 = X.AbstractC166987dD.A1A(r5, r6)
            goto L5f
        L3b:
            java.lang.String r3 = "country"
            java.lang.String r1 = X.AbstractC166987dD.A1A(r3, r6)
            if (r1 == 0) goto L49
            boolean r1 = X.AbstractC001900j.A0T(r1)
            if (r1 == 0) goto L4a
        L49:
            r7 = 1
        L4a:
            java.lang.String r2 = ""
            if (r7 != 0) goto L30
            java.lang.String r1 = X.AbstractC166987dD.A1A(r3, r6)
            int r3 = r4.A0A(r1)
            if (r3 == 0) goto L30
            X.78E r1 = r4.A00
            java.lang.String r2 = r1.A01(r3)
            goto L2e
        L5f:
            X.793 r1 = r4.A0F(r1, r2)     // Catch: X.C40f -> L75
            boolean r1 = r4.A0M(r1)     // Catch: X.C40f -> L75
            if (r1 == 0) goto L75
            java.lang.String r1 = X.AbstractC166987dD.A1A(r5, r6)     // Catch: X.C40f -> L75
            X.793 r1 = r4.A0F(r1, r2)     // Catch: X.C40f -> L75
            boolean r0 = r4.A0N(r1)     // Catch: X.C40f -> L75
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC62771SQn.A00(android.content.Context, com.facebook.browser.lite.extensions.autofill.model.AutofillData):boolean");
    }

    public static final boolean A01(AutofillData autofillData) {
        if (autofillData != null) {
            Map map = autofillData.A00;
            String A1A = AbstractC166987dD.A1A("given-name", map);
            if (A1A == null || A1A.length() == 0) {
                String A1A2 = AbstractC166987dD.A1A("family-name", map);
                if (A1A2 == null || A1A2.length() == 0) {
                    String A1A3 = AbstractC166987dD.A1A("address-line1", map);
                    if (A1A3 != null && A1A3.length() != 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
