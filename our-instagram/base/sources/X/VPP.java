package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VPP {
    public static Map A00(XG7 xg7) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (xg7.Aet() != null) {
            XG4 Aet = xg7.Aet();
            if (Aet != null) {
                treeUpdaterJNI3 = Aet.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put(AppStateModule.APP_STATE_BACKGROUND, treeUpdaterJNI3);
        }
        if (xg7.ApX() != null) {
            XG9 ApX = xg7.ApX();
            if (ApX != null) {
                treeUpdaterJNI2 = ApX.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, treeUpdaterJNI2);
        }
        if (xg7.Bb2() != null) {
            XGA Bb2 = xg7.Bb2();
            if (Bb2 != null) {
                treeUpdaterJNI = Bb2.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("page_name", treeUpdaterJNI);
        }
        if (xg7.C7x() != null) {
            InterfaceC72036XFy C7x = xg7.C7x();
            if (C7x != null) {
                treeUpdaterJNI4 = C7x.F7o();
            }
            linkedHashMap.put("thumbnail", treeUpdaterJNI4);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
