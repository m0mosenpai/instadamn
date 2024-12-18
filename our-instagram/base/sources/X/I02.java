package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.feed.media.CameraToolInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I02 {
    public static Map A00(CameraToolInfoIntf cameraToolInfoIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (cameraToolInfoIntf.Ak6() != null) {
            CameraTool Ak6 = cameraToolInfoIntf.Ak6();
            C14360o3.A0B(Ak6, 0);
            A1I.put(AbstractC111324zv.A00(779), Ak6.A00);
        }
        if (cameraToolInfoIntf.Azs() != null) {
            A1I.put(AbstractC111324zv.A00(4344), AbstractC166997dE.A0f(cameraToolInfoIntf.Azs()));
        }
        if (cameraToolInfoIntf.Bz8() != null) {
            A1I.put(AbstractC111324zv.A00(5393), AbstractC166997dE.A0f(cameraToolInfoIntf.Bz8()));
        }
        if (cameraToolInfoIntf.C8c() != null) {
            A1I.put(AbstractC111324zv.A00(5499), AbstractC166997dE.A0f(cameraToolInfoIntf.C8c()));
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
