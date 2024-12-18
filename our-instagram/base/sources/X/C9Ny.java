package X;

import com.instagram.music.common.model.MusicAssetBeatInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9Ny, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Ny {
    public static C209409Nz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C209409Nz c209409Nz = new C209409Nz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("beats".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            MusicAssetBeatInfo parseFromJson = A1M.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c209409Nz.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c209409Nz, A0q);
                }
                c16l.A0z();
            }
            return c209409Nz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
