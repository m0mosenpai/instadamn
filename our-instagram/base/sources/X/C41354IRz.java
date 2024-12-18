package X;

import com.instagram.model.hashtag.HashtagImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IRz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41354IRz {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.HYT, X.N3P] */
    public static HYT parseFromJson(C16L c16l) {
        List list;
        C14360o3.A0B(c16l, 0);
        try {
            ?? n3p = new N3P();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("results".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            HashtagImpl parseFromJson = AbstractC109614wn.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    n3p.A00 = arrayList;
                } else {
                    AbstractC54184NxL.A00(c16l, n3p, A0s);
                }
                c16l.A0z();
            }
            List list2 = n3p.A00;
            if (list2 == null || (list = U12.A02(list2)) == null) {
                list = C16930sl.A00;
            }
            n3p.A09 = list;
            return n3p;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
