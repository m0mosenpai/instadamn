package X;

import com.instagram.model.hashtag.HashtagImpl;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FXF {
    public static C32211EDk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32211EDk c32211EDk = new C32211EDk();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("suggested_hashtags".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            HashtagImpl parseFromJson = AbstractC109614wn.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c32211EDk.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c32211EDk, A0s);
                }
                c16l.A0z();
            }
            return c32211EDk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
