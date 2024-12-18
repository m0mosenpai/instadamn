package X;

import java.io.IOException;

/* renamed from: X.F7v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34223F7v {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.FOM, java.lang.Object] */
    public static FOM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("existing_user_intro_state".equals(A0s)) {
                    obj.A02 = AbstractC34225F7x.parseFromJson(c16l);
                } else if ("tos_data_policy_consent_state".equals(A0s)) {
                    obj.A05 = AbstractC34225F7x.parseFromJson(c16l);
                } else if ("age_consent_state".equals(A0s)) {
                    obj.A00 = AbstractC34225F7x.parseFromJson(c16l);
                } else if ("dob".equals(A0s)) {
                    obj.A01 = AbstractC34225F7x.parseFromJson(c16l);
                } else if ("parental_consent_intro".equals(A0s)) {
                    obj.A04 = AbstractC34225F7x.parseFromJson(c16l);
                } else if ("parental_consent_email".equals(A0s)) {
                    obj.A03 = AbstractC34225F7x.parseFromJson(c16l);
                } else if ("third_party_data_consent_state".equals(A0s)) {
                    obj.A07 = AbstractC34225F7x.parseFromJson(c16l);
                } else if ("third_party_data_intro".equals(A0s)) {
                    obj.A09 = AbstractC34225F7x.parseFromJson(c16l);
                } else if ("third_party_data_confirm".equals(A0s)) {
                    obj.A06 = AbstractC34225F7x.parseFromJson(c16l);
                } else if ("third_party_data_dialog".equals(A0s)) {
                    obj.A08 = AbstractC34225F7x.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
