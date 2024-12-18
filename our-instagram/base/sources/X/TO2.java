package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class TO2 implements Runnable {
    public final /* synthetic */ C62488SDp A00;
    public final /* synthetic */ C63277Sgc A01;

    public TO2(C62488SDp c62488SDp, C63277Sgc c63277Sgc) {
        this.A00 = c62488SDp;
        this.A01 = c63277Sgc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC122375gY enumC122375gY = (EnumC122375gY) this.A01.A04.A01();
        C62488SDp c62488SDp = this.A00;
        C63367SiS c63367SiS = c62488SDp.A01;
        List list = c63367SiS.A0H.A00;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("onMqttNetworkConnectionFailed");
            }
        }
        if (enumC122375gY.equals(EnumC122375gY.FAILED_CONNECTION_REFUSED_SERVER_SHEDDING_LOAD) || enumC122375gY.equals(EnumC122375gY.FAILED_CONNECTION_REFUSED_NOT_AUTHORIZED)) {
            SZK szk = c63367SiS.A0V;
            synchronized (szk) {
                szk.A0A = true;
            }
        }
        if (c63367SiS.A0w == c62488SDp.A00) {
            Integer num = C05F.A00;
            if (enumC122375gY.equals(EnumC122375gY.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD)) {
                c63367SiS.A0I.clear();
            } else if (enumC122375gY.equals(EnumC122375gY.FAILED_CONNECTION_REFUSED_REVOKED_PUBLIC_KEY)) {
                c63367SiS.A0R.E4B();
                throw null;
            }
            C63367SiS.A01(new C60547R6k(enumC122375gY), c63367SiS, num);
        }
        ((T1G) c63367SiS.A0D.A05(C60548R6l.class)).A03(EnumC61222Rii.A07, enumC122375gY.name());
    }
}
