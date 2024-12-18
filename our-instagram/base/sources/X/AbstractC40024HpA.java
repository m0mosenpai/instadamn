package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HpA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40024HpA {
    public static Map A00(JLS jls) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        jls.getHasCoverPhoto();
        A1I.put("has_cover_photo", Boolean.valueOf(jls.getHasCoverPhoto()));
        if (jls.getId() != null) {
            AbstractC37300Gc1.A12(jls.getId(), A1I);
        }
        jls.getNumEpisodes();
        A1I.put("num_episodes", Integer.valueOf(jls.getNumEpisodes()));
        if (jls.getTitle() != null) {
            AbstractC37300Gc1.A17(jls.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
