package X;

import com.instagram.business.promote.model.AudienceInterest;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VxW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69905VxW {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Uyh, X.1um, X.1ul] */
    public static C67808Uyh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("interest_results".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AudienceInterest parseFromJson = VRZ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
