package X;

import com.instagram.api.schemas.PaymentCredentialTypeEnum;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hr3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40135Hr3 {
    public static UQ6 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            MUW muw = null;
            ArrayList arrayList = null;
            PaymentCredentialTypeEnum paymentCredentialTypeEnum = null;
            MUW muw2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC43591JPw.A00(734).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(96).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(2289).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("display_label".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("inline_action".equals(A0s)) {
                    muw = AbstractC39768Hke.parseFromJson(c16l);
                } else if ("logos_uri".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("payment_credential_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    paymentCredentialTypeEnum = (PaymentCredentialTypeEnum) PaymentCredentialTypeEnum.A01.get(A1P);
                    if (paymentCredentialTypeEnum == null) {
                        paymentCredentialTypeEnum = PaymentCredentialTypeEnum.A1G;
                    }
                } else if (AbstractC111324zv.A00(5086).equals(A0s)) {
                    muw2 = AbstractC39768Hke.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("logos_uri", c16l, "PaymentDetails");
                throw C00O.createAndThrow();
            }
            return new UQ6(muw, muw2, paymentCredentialTypeEnum, str, str2, str3, str4, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
