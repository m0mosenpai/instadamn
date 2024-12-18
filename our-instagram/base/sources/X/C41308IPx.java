package X;

import com.instagram.api.schemas.OriginalSoundData;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IPx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41308IPx {
    public static C38873H9v parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38873H9v c38873H9v = new C38873H9v();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1W(c16l, A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            OriginalSoundData parseFromJson = C3XP.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38873H9v.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c38873H9v, A0q);
                }
                c16l.A0z();
            }
            return c38873H9v;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
