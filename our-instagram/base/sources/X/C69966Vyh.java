package X;

import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.hashtag.response.HashtagCollection;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Vyh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69966Vyh {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.model.hashtag.response.HashtagCollection, X.1um, X.1ul] */
    public static HashtagCollection parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("tags".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            HashtagImpl parseFromJson = AbstractC109614wn.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
