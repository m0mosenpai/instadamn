package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.UserMonetizationProductType;
import java.io.IOException;

/* renamed from: X.IOb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41260IOb {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.H96, X.1um, X.1ul] */
    public static H96 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("account_level_monetization_toggle".equals(A0s)) {
                    c40791um.A00 = AbstractC37304Gc5.A0A(AbstractC167017dG.A0m(c16l));
                } else if ("product_type".equals(A0s)) {
                    c40791um.A02 = AbstractC104314mu.A00(AbstractC167017dG.A0m(c16l));
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting = c40791um.A00;
            C14360o3.A0A(iGTVAccountLevelMonetizationToggleSetting);
            UserMonetizationProductType userMonetizationProductType = c40791um.A02;
            C14360o3.A0A(userMonetizationProductType);
            c40791um.A01 = new C38603Gy6(iGTVAccountLevelMonetizationToggleSetting, userMonetizationProductType);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
