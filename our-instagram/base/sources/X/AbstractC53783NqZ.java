package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.NqZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC53783NqZ {
    public static Map A00(InterfaceC109844xC interfaceC109844xC) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str2 = null;
        if (interfaceC109844xC.AfH() != null) {
            IGLiveBadgeSettings AfH = interfaceC109844xC.AfH();
            if (AfH != null) {
                str = AfH.A00;
            } else {
                str = null;
            }
            A1I.put("badge_setting", str);
        }
        if (interfaceC109844xC.AfI() != null) {
            A1I.put("badges_count", interfaceC109844xC.AfI());
        }
        if (interfaceC109844xC.BPm() != null) {
            A1I.put("max_amount_reached", interfaceC109844xC.BPm());
        }
        if (interfaceC109844xC.Bbh() != null) {
            InterfaceC109814x8 Bbh = interfaceC109844xC.Bbh();
            if (Bbh != null) {
                treeUpdaterJNI = Bbh.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("pay_config", treeUpdaterJNI);
        }
        if (interfaceC109844xC.CGK() != null) {
            LiveUserPaySupportTier CGK = interfaceC109844xC.CGK();
            if (CGK != null) {
                str2 = CGK.A00;
            }
            A1I.put("viewer_support_tier", str2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
