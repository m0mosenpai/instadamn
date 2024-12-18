package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FUh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34782FUh {
    public static C32192ECn parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32192ECn c32192ECn = new C32192ECn();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("broadcast_chats".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C34642FNz parseFromJson = AbstractC34149F4z.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32192ECn.A02 = arrayList;
                } else if ("cursor_timestamp_seconds".equals(A0s)) {
                    c32192ECn.A00 = AbstractC166997dE.A0h(c16l);
                } else if ("cursor_thread_id".equals(A0s)) {
                    c32192ECn.A01 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c32192ECn, A0s);
                }
                c16l.A0z();
            }
            return c32192ECn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
