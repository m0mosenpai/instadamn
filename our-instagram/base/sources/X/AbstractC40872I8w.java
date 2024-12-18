package X;

import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I8w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40872I8w {
    public static C38685GzQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38685GzQ c38685GzQ = new C38685GzQ(5);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("header".equals(A0s)) {
                    ShoppingTaggingFeedHeader parseFromJson = AbstractC40871I8v.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c38685GzQ.A00 = parseFromJson;
                } else if ("logging_meta".equals(A0s)) {
                    C38686GzR parseFromJson2 = AbstractC40861I8l.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c38685GzQ.A01 = parseFromJson2;
                } else if ("selection_limits".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51757Mtg parseFromJson3 = AbstractC40864I8o.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38685GzQ.A02 = arrayList;
                }
                c16l.A0z();
            }
            return c38685GzQ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
