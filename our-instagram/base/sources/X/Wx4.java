package X;

import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class Wx4 implements Runnable {
    public final /* synthetic */ EnumC68206VFy A00;
    public final /* synthetic */ C69445VnU A01;
    public final /* synthetic */ C68046V7y A02;
    public final /* synthetic */ V1R A03;

    public Wx4(EnumC68206VFy enumC68206VFy, C69445VnU c69445VnU, C68046V7y c68046V7y, V1R v1r) {
        this.A00 = enumC68206VFy;
        this.A03 = v1r;
        this.A02 = c68046V7y;
        this.A01 = c69445VnU;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String obj = this.A00.toString();
        V1R v1r = this.A03;
        WG5 wg5 = v1r.A0c;
        C68046V7y c68046V7y = this.A02;
        int i = c68046V7y.A00;
        Map map = wg5.A00;
        synchronized (map) {
            C69578Vrh c69578Vrh = (C69578Vrh) AbstractC166997dE.A0m(map, i);
            if (c69578Vrh != null) {
                c69578Vrh.A01.put("tab", obj);
            }
        }
        WG5.A01(wg5, i, true);
        WG5.A05(wg5, "FEED_REQUEST_SUCCESS", i);
        if (c68046V7y.A03) {
            C154846xZ c154846xZ = v1r.A02;
            if (c154846xZ != null) {
                if (obj != null && obj.length() != 0) {
                    c154846xZ.A01 = obj;
                }
                List list = this.A01.A07;
                C14360o3.A06(list);
                if (list.isEmpty()) {
                    C154846xZ c154846xZ2 = v1r.A02;
                    if (c154846xZ2 != null) {
                        ((MTJ) c154846xZ2).A00.A07(AbstractC111324zv.A00(2308));
                        C154846xZ c154846xZ3 = v1r.A02;
                        if (c154846xZ3 != null) {
                            c154846xZ3.D4q();
                            return;
                        }
                    }
                } else {
                    C154846xZ c154846xZ4 = v1r.A02;
                    if (c154846xZ4 != null) {
                        c154846xZ4.A00 = Integer.valueOf(list.size());
                        C154846xZ c154846xZ5 = v1r.A02;
                        if (c154846xZ5 != null) {
                            ((MTJ) c154846xZ5).A00.A05();
                            C154846xZ c154846xZ6 = v1r.A02;
                            if (c154846xZ6 != null) {
                                c154846xZ6.D4r();
                                return;
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("gridPerfLogger");
            throw C00O.createAndThrow();
        }
    }
}
