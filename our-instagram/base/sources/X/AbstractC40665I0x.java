package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* renamed from: X.I0x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40665I0x {
    public static C41010IEf parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C41010IEf c41010IEf = new C41010IEf();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("error_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c41010IEf.A01 = A1P;
                } else if ("input_type".equals(A0s)) {
                    c41010IEf.A00 = (EnumC68196VFo) EnumHelper.A00(c16l.A1Q(), EnumC68196VFo.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                c16l.A0z();
            }
            return c41010IEf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
