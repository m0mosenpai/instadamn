package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.UrpIndexAction;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.HwK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40429HwK {
    public static Map A00(InterfaceC105004oG interfaceC105004oG) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC105004oG.AYP() != null) {
            UrpIndexAction AYP = interfaceC105004oG.AYP();
            if (AYP != null) {
                str = AYP.A00;
            } else {
                str = null;
            }
            A1I.put("action", str);
        }
        if (interfaceC105004oG.Adb() != null) {
            InterfaceC104924o5 Adb = interfaceC105004oG.Adb();
            if (Adb != null) {
                treeUpdaterJNI = Adb.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(MediaStreamTrack.AUDIO_TRACK_KIND, treeUpdaterJNI);
        }
        if (interfaceC105004oG.Anz() != null) {
            A1I.put("client_name", interfaceC105004oG.Anz());
        }
        if (interfaceC105004oG.BHQ() != null) {
            A1I.put("index", interfaceC105004oG.BHQ());
        }
        if (interfaceC105004oG.BQX() != null) {
            InterfaceC43564JLy BQX = interfaceC105004oG.BQX();
            if (BQX != null) {
                treeUpdaterJNI2 = BQX.F7o();
            }
            A1I.put("media_composition", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
