package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.VOn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68379VOn {
    public static Map A00(XG5 xg5) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = null;
        if (xg5.Abr() != null) {
            InterfaceC72032XFu Abr = xg5.Abr();
            if (Abr != null) {
                treeUpdaterJNI3 = Abr.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put("animation", treeUpdaterJNI3);
        }
        if (xg5.Aet() != null) {
            XG4 Aet = xg5.Aet();
            if (Aet != null) {
                treeUpdaterJNI2 = Aet.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put(AppStateModule.APP_STATE_BACKGROUND, treeUpdaterJNI2);
        }
        if (xg5.AfD() != null) {
            InterfaceC72031XFt AfD = xg5.AfD();
            if (AfD != null) {
                treeUpdaterJNI = AfD.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("badge", treeUpdaterJNI);
        }
        if (xg5.Bd0() != null) {
            List<XGC> Bd0 = xg5.Bd0();
            if (Bd0 != null) {
                arrayList = new ArrayList();
                for (XGC xgc : Bd0) {
                    if (xgc != null) {
                        arrayList.add(xgc.F7o());
                    }
                }
            }
            linkedHashMap.put("photos", arrayList);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
