package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.VOi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68374VOi {
    public static Map A00(XGD xgd) {
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (xgd.Aet() != null) {
            XG4 Aet = xgd.Aet();
            if (Aet != null) {
                treeUpdaterJNI2 = Aet.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put(AppStateModule.APP_STATE_BACKGROUND, treeUpdaterJNI2);
        }
        if (xgd.getDescription() != null) {
            linkedHashMap.put(DevServerEntity.COLUMN_DESCRIPTION, xgd.getDescription());
        }
        if (xgd.BTT() != null) {
            List<XGA> BTT = xgd.BTT();
            if (BTT != null) {
                arrayList = new ArrayList();
                for (XGA xga : BTT) {
                    if (xga != null) {
                        arrayList.add(xga.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("metadata_items", arrayList);
        }
        if (xgd.BtP() != null) {
            linkedHashMap.put("separator_color", xgd.BtP());
        }
        if (xgd.getTextColor() != null) {
            linkedHashMap.put("text_color", xgd.getTextColor());
        }
        if (xgd.C7x() != null) {
            InterfaceC72036XFy C7x = xgd.C7x();
            if (C7x != null) {
                treeUpdaterJNI = C7x.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("thumbnail", treeUpdaterJNI);
        }
        if (xgd.C8l() != null) {
            XGA C8l = xgd.C8l();
            if (C8l != null) {
                treeUpdaterJNI3 = C8l.F7o();
            }
            linkedHashMap.put(DialogModule.KEY_TITLE, treeUpdaterJNI3);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
