package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Nu3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53992Nu3 {
    public static C54531O7j parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C54531O7j c54531O7j = new C54531O7j();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("avatar_sdk_ar_effect_transparent_thumbnail".equals(A0s)) {
                    c54531O7j.A00 = AbstractC53991Nu2.parseFromJson(c16l);
                } else if ("avatar_sdk_ar_effects".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C54738OFp parseFromJson = AbstractC54003NuF.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c54531O7j.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c54531O7j;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
