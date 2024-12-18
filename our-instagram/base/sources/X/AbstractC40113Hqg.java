package X;

import com.instagram.api.schemas.NotePogVideoDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hqg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40113Hqg {
    public static Map A00(NotePogVideoDictIntf notePogVideoDictIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (notePogVideoDictIntf.getId() != null) {
            AbstractC37300Gc1.A12(notePogVideoDictIntf.getId(), A1I);
        }
        if (notePogVideoDictIntf.BGx() != null) {
            A1I.put("image_versions2", notePogVideoDictIntf.BGx().F7o());
        }
        if (notePogVideoDictIntf.getPk() != null) {
            A1I.put("pk", notePogVideoDictIntf.getPk());
        }
        if (notePogVideoDictIntf.CFe() != null) {
            List CFe = notePogVideoDictIntf.CFe();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = CFe.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1W(A1E, it);
            }
            A1I.put("video_versions", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
