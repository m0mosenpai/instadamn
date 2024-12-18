package X;

import com.instagram.shopping.model.pdp.link.secondarytext.SecondaryTextContent;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I8K {
    public static SecondaryTextContent parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            SecondaryTextContent secondaryTextContent = new SecondaryTextContent();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("responsiveness".equals(A0s)) {
                    secondaryTextContent.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("ice_breaker".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    secondaryTextContent.A01 = arrayList;
                }
                c16l.A0z();
            }
            return secondaryTextContent;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
