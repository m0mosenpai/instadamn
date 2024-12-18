package X;

import com.instagram.api.schemas.CommerceReviewStatisticsDict;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hlw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39848Hlw {
    public static CommerceReviewStatisticsDict parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f = null;
            ArrayList arrayList = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("average_rating".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC111324zv.A00(512).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            arrayList.add(AbstractC39732Hk2.A00(A1P));
                        }
                    } else {
                        arrayList = null;
                    }
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "review_count");
                }
                c16l.A0z();
            }
            return new CommerceReviewStatisticsDict(f, num, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
