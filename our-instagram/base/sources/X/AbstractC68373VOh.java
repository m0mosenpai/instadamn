package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VOh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68373VOh {
    public static Map A00(C5H8 c5h8) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (c5h8.BTU() != null) {
            InterfaceC72033XFv BTU = c5h8.BTU();
            if (BTU != null) {
                treeUpdaterJNI3 = BTU.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put("metadata_multi_comment_card_payload_v1", treeUpdaterJNI3);
        }
        if (c5h8.BTV() != null) {
            XGD BTV = c5h8.BTV();
            if (BTV != null) {
                treeUpdaterJNI2 = BTV.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("metadata_payload_v1", treeUpdaterJNI2);
        }
        if (c5h8.BTW() != null) {
            XG5 BTW = c5h8.BTW();
            if (BTW != null) {
                treeUpdaterJNI = BTW.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("metadata_photo_card_payload_v1", treeUpdaterJNI);
        }
        if (c5h8.BTY() != null) {
            XG7 BTY = c5h8.BTY();
            if (BTY != null) {
                treeUpdaterJNI4 = BTY.F7o();
            }
            linkedHashMap.put("metadata_single_comment_card_payload_v1", treeUpdaterJNI4);
        }
        if (c5h8.BZL() != null) {
            linkedHashMap.put("option_value", c5h8.BZL());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
