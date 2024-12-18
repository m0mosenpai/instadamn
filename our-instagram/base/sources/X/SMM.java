package X;

import com.instagram.direct.locationsharing.service.DirectLiveLocationService;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SMM {
    public final SCN A00;
    public final Map A01 = AbstractC166987dD.A1I();
    public final Map A03 = AbstractC166987dD.A1I();
    public final Map A02 = AbstractC166987dD.A1I();

    public final void A00(InterfaceC159157Cb interfaceC159157Cb, int i) {
        Map map = this.A03;
        if (map.isEmpty()) {
            DirectLiveLocationService directLiveLocationService = this.A00.A00;
            RGW rgw = directLiveLocationService.A00;
            if (rgw != null) {
                rgw.A01(directLiveLocationService.A04);
            }
            directLiveLocationService.A03 = false;
            directLiveLocationService.stopForeground(1);
            if (i > 0) {
                directLiveLocationService.stopSelf(i);
                return;
            } else {
                directLiveLocationService.stopSelf();
                return;
            }
        }
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            SB9 sb9 = new SB9((C7CW) A1K.getValue());
            sb9.A00.AYt(new C63928Sw3(0, new C63929Sw4(interfaceC159157Cb, this, A17, i), sb9));
        }
    }

    public SMM(SCN scn) {
        this.A00 = scn;
    }
}
