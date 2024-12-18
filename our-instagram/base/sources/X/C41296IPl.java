package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IPl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41296IPl {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.5jh, X.HDk] */
    public static C38958HDk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c124275jh = new C124275jh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ad_preview_media_items".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38252Grv parseFromJson = AbstractC38251Gru.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c124275jh.A00 = arrayList;
                } else {
                    C37410Gdq.A00(c16l, c124275jh, A0s);
                }
                c16l.A0z();
            }
            c124275jh.A01();
            return c124275jh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
