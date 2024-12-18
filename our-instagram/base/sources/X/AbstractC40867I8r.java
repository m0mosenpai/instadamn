package X;

import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.io.IOException;

/* renamed from: X.I8r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40867I8r {
    public static MUD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MUD mud = new MUD(32);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("header".equals(A0s)) {
                    ShoppingTaggingFeedHeader parseFromJson = AbstractC40871I8v.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    mud.A00 = parseFromJson;
                } else if ("source_type".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    mud.A02 = A0m;
                } else if ("source_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    mud.A01 = A0m2;
                }
                c16l.A0z();
            }
            return mud;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
