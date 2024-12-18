package X;

import com.instagram.feed.media.EffectPreview;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IAj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40911IAj {
    public static C40999IDu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C40999IDu c40999IDu = new C40999IDu();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("effect_configs".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            EffectPreview parseFromJson = C4HX.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40999IDu.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c40999IDu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
