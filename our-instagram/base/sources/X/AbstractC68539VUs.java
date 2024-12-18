package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68539VUs {
    public static C68806VcN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68806VcN c68806VcN = new C68806VcN();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("custom_error_message".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if ("single_value".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("validation_condition".equals(A0s)) {
                        EnumHelper.A00(c16l.A1Q(), EnumC72382XcI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("validation_type".equals(A0s)) {
                        EnumHelper.A00(c16l.A1Q(), EnumC68178VEw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("range".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c68806VcN.A00 = arrayList;
                    }
                    c16l.A0z();
                }
            }
            return c68806VcN;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
