package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NotePogImageDictIntf;
import com.instagram.api.schemas.NotePogVideoDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hqi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40115Hqi {
    public static Map A00(InterfaceC1347567l interfaceC1347567l) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC1347567l.BGd() != null) {
            NotePogImageDictIntf BGd = interfaceC1347567l.BGd();
            if (BGd != null) {
                treeUpdaterJNI = BGd.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("image_dict", treeUpdaterJNI);
        }
        if (interfaceC1347567l.CF3() != null) {
            NotePogVideoDictIntf CF3 = interfaceC1347567l.CF3();
            if (CF3 != null) {
                treeUpdaterJNI2 = CF3.F7o();
            }
            A1I.put("video_dict", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
