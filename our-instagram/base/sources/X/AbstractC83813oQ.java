package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3oQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC83813oQ {
    public static C83473no parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C83473no c83473no = new C83473no();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("media_reaction_group_reactions".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            E6A parseFromJson = F4N.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c83473no.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c83473no;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
