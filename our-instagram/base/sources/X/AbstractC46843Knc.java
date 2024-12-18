package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Knc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46843Knc {
    public static L4D parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            L4D l4d = new L4D();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("poll_id".equals(A0s)) {
                    l4d.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("poll_question".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    l4d.A04 = A0m;
                } else if ("poll_author_picture".equals(A0s)) {
                    l4d.A00 = AbstractC222616c.A00(c16l);
                } else if (AbstractC111324zv.A00(5064).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            L1X parseFromJson = AbstractC46842Knb.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    l4d.A05 = arrayList;
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    l4d.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("action_log".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    l4d.A01 = A0m2;
                }
                c16l.A0z();
            }
            return l4d;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
