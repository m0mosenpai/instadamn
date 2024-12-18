package X;

import com.instagram.model.direct.HighlightRange;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F5C {
    public static C34607FMq parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34607FMq c34607FMq = new C34607FMq();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("sender_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c34607FMq.A03 = A0m;
                } else if ("item_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c34607FMq.A01 = A0m2;
                } else if (MSV.A00(230).equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c34607FMq.A02 = A0m3;
                } else if ("timestamp".equals(A0s)) {
                    c34607FMq.A00 = c16l.A0y();
                } else if ("matched_message_range_data".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            HighlightRange parseFromJson = AbstractC34253F8z.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c34607FMq.A04 = arrayList;
                }
                c16l.A0z();
            }
            return c34607FMq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
