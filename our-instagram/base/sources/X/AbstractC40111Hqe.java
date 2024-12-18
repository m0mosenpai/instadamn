package X;

import com.instagram.api.schemas.NotePogImageDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hqe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40111Hqe {
    public static Map A00(NotePogImageDictIntf notePogImageDictIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (notePogImageDictIntf.getId() != null) {
            AbstractC37300Gc1.A12(notePogImageDictIntf.getId(), A1I);
        }
        if (notePogImageDictIntf.BGu() != null) {
            A1I.put("image_url", notePogImageDictIntf.BGu());
        }
        if (notePogImageDictIntf.getPk() != null) {
            A1I.put("pk", notePogImageDictIntf.getPk());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
