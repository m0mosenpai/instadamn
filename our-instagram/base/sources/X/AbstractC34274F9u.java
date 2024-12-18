package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.io.IOException;

/* renamed from: X.F9u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34274F9u {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.Fae] */
    public static C34954Fae parseFromJson(C16L c16l) {
        EnumC33522Erv enumC33522Erv;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("title_text".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("content_text".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if (OptSvcAnalyticsStore.LOGGING_KEY_STEP.equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    EnumC33522Erv[] values = EnumC33522Erv.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC33522Erv = values[i];
                            if (AbstractC002300n.A0g(enumC33522Erv.name(), A1Q, true)) {
                                break;
                            }
                            i++;
                        } else {
                            enumC33522Erv = EnumC33522Erv.A0V;
                            break;
                        }
                    }
                    obj.A00 = enumC33522Erv;
                } else if ("qualifying_value".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
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
