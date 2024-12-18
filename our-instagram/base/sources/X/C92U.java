package X;

import com.instagram.api.schemas.LimitedInteractionsVersions;
import java.io.IOException;

/* renamed from: X.92U, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C92U {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.92T, X.1um, X.1ul] */
    public static C92T parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("duration".equals(A0q)) {
                    c40791um.A04 = Integer.valueOf(c16l.A1D());
                } else if ("limited_categories".equals(A0q)) {
                    c40791um.A00 = AbstractC53778NqU.parseFromJson(c16l);
                } else if ("show_limited_interactions_reminder".equals(A0q)) {
                    c40791um.A03 = Boolean.valueOf(c16l.A0d());
                } else if ("version".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    LimitedInteractionsVersions limitedInteractionsVersions = (LimitedInteractionsVersions) LimitedInteractionsVersions.A01.get(A1P);
                    if (limitedInteractionsVersions == null) {
                        limitedInteractionsVersions = LimitedInteractionsVersions.A04;
                    }
                    c40791um.A02 = limitedInteractionsVersions;
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            Integer num = c40791um.A04;
            C14360o3.A0A(num);
            int intValue = num.intValue();
            C124545kG c124545kG = c40791um.A00;
            Boolean bool = c40791um.A03;
            C14360o3.A0A(bool);
            c40791um.A01 = new C124355jr(c124545kG, c40791um.A02, intValue, bool.booleanValue());
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
