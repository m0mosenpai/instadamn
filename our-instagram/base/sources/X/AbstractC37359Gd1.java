package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gd1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37359Gd1 {
    public static Map A00(InterfaceC88303wh interfaceC88303wh) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (interfaceC88303wh.B5u() != null) {
            MediaCroppingCoordinatesIntf B5u = interfaceC88303wh.B5u();
            if (B5u != null) {
                treeUpdaterJNI2 = B5u.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("feed_preview_crop", treeUpdaterJNI2);
        }
        if (interfaceC88303wh.BzT() != null) {
            MediaCroppingCoordinatesIntf BzT = interfaceC88303wh.BzT();
            if (BzT != null) {
                treeUpdaterJNI = BzT.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("square_crop", treeUpdaterJNI);
        }
        if (interfaceC88303wh.C7w() != null) {
            MediaCroppingCoordinatesIntf C7w = interfaceC88303wh.C7w();
            if (C7w != null) {
                treeUpdaterJNI3 = C7w.F7o();
            }
            A1I.put(AbstractC111324zv.A00(3238), treeUpdaterJNI3);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
