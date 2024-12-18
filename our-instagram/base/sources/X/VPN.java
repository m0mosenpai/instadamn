package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VPN {
    public static Map A00(InterfaceC72033XFv interfaceC72033XFv) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = null;
        if (interfaceC72033XFv.Aet() != null) {
            XG4 Aet = interfaceC72033XFv.Aet();
            if (Aet != null) {
                treeUpdaterJNI = Aet.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put(AppStateModule.APP_STATE_BACKGROUND, treeUpdaterJNI);
        }
        if (interfaceC72033XFv.Apm() != null) {
            List<XG9> Apm = interfaceC72033XFv.Apm();
            if (Apm != null) {
                arrayList = new ArrayList();
                for (XG9 xg9 : Apm) {
                    if (xg9 != null) {
                        arrayList.add(xg9.F7o());
                    }
                }
            }
            linkedHashMap.put("comments", arrayList);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
