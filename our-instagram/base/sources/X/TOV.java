package X;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class TOV implements Runnable {
    public final /* synthetic */ C63197Sez A00;
    public final /* synthetic */ SX6 A01;

    public TOV(C63197Sez c63197Sez, SX6 sx6) {
        this.A01 = sx6;
        this.A00 = c63197Sez;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C63197Sez c63197Sez = this.A00;
        C60646RFw c60646RFw = (C60646RFw) c63197Sez.A07;
        C60643RFt c60643RFt = (C60643RFt) c63197Sez.A01(C60643RFt.class);
        if (TextUtils.isEmpty(c60643RFt.A02)) {
            C60685RMd c60685RMd = c60646RFw.A01.A08;
            C63335Shm.A02(c60685RMd);
            c60643RFt.A02 = c60685RMd.A0J();
        }
        if (c60646RFw.A00 && TextUtils.isEmpty(c60643RFt.A04)) {
            C60690RMi c60690RMi = c60646RFw.A01.A05;
            C63335Shm.A02(c60690RMi);
            c60690RMi.A0I();
            AdvertisingIdClient.Info A00 = C60690RMi.A00(c60690RMi);
            if (A00 != null) {
                str = A00.A00;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            c60643RFt.A04 = str;
            c60690RMi.A0I();
            AdvertisingIdClient.Info A002 = C60690RMi.A00(c60690RMi);
            boolean z = false;
            if (A002 != null && !A002.A01) {
                z = true;
            }
            c60643RFt.A06 = z;
        }
        Iterator it = this.A01.A03.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("zza");
        }
        C3U5.A05("deliver should be called from worker thread");
        C3U5.A08(c63197Sez.A03, "Measurement must be submitted");
        List<InterfaceC65513Tli> list = c63197Sez.A08;
        if (!list.isEmpty()) {
            HashSet A1H = AbstractC166987dD.A1H();
            for (InterfaceC65513Tli interfaceC65513Tli : list) {
                android.net.Uri FFl = interfaceC65513Tli.FFl();
                if (!A1H.contains(FFl)) {
                    A1H.add(FFl);
                    interfaceC65513Tli.FFt(c63197Sez);
                }
            }
        }
    }
}
