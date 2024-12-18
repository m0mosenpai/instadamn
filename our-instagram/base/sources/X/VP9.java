package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VP9 {
    public static Map A00(InterfaceC99404dC interfaceC99404dC) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC99404dC.AyN() != null) {
            TextAppSearchDiscussionTopic AyN = interfaceC99404dC.AyN();
            if (AyN != null) {
                treeUpdaterJNI = AyN.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put(AbstractC111324zv.A00(899), treeUpdaterJNI);
        }
        if (interfaceC99404dC.Bm9() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(1222), interfaceC99404dC.Bm9());
        }
        if (interfaceC99404dC.BmA() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(1223), interfaceC99404dC.BmA());
        }
        if (interfaceC99404dC.CAy() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(1349), interfaceC99404dC.CAy());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
