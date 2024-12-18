package X;

import com.instagram.user.model.UpcomingEventImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.7lP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171947lP {
    public static C171937lO parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C171937lO c171937lO = new C171937lO();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                ArrayList arrayList = null;
                if ("upcoming_events".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            UpcomingEventImpl parseFromJson = IT3.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c171937lO.A01 = arrayList;
                } else if ("next_max_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c171937lO.A00 = str;
                } else if ("more_available".equals(A0q)) {
                    c16l.A0d();
                } else {
                    C55702hA.A01(c16l, c171937lO, A0q);
                }
                c16l.A0z();
            }
            return c171937lO;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
