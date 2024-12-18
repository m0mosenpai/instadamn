package X;

import com.instagram.business.model.BoostGuidanceItemResponse;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FTG {
    public static EBD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            EBD ebd = new EBD();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("boost_guidance_items".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            BoostGuidanceItemResponse parseFromJson = F0N.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    ebd.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, ebd, A0s);
                }
                c16l.A0z();
            }
            return ebd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
