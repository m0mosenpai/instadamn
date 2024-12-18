package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class AEC {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.A7Z, java.lang.Object] */
    public static A7Z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("audience_member_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    obj.A01 = arrayList;
                } else if ("friend_list_id".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, A7Z a7z) {
        anonymousClass182.A0d();
        if (a7z.A01 != null) {
            C16V.A03(anonymousClass182, "audience_member_ids");
            Iterator it = a7z.A01.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        String str = a7z.A00;
        if (str != null) {
            anonymousClass182.A0S("friend_list_id", str);
        }
        anonymousClass182.A0a();
    }
}
