package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FUo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34786FUo {
    public static EBR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            EBR ebr = new EBR();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ig_item_id_to_reaction".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C34509FIv parseFromJson = F53.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    ebr.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, ebr, A0s);
                }
                c16l.A0z();
            }
            return ebr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
