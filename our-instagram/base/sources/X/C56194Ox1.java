package X;

import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ox1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56194Ox1 implements InterfaceC15680qO {
    public final /* synthetic */ OBP A00;

    @Override // X.InterfaceC15680qO
    public final void onConnectionChanged(NetworkInfo networkInfo) {
        String str;
        Integer num;
        if (networkInfo != null) {
            networkInfo.getTypeName();
            networkInfo.getSubtypeName();
        }
        OBP obp = this.A00;
        Integer num2 = obp.A00;
        if (networkInfo != null) {
            str = networkInfo.getTypeName();
        } else {
            str = null;
        }
        if (C14360o3.A0K(str, "WIFI")) {
            num = C05F.A00;
        } else if (C14360o3.A0K(str, "MOBILE")) {
            String subtypeName = networkInfo != null ? networkInfo.getSubtypeName() : null;
            if (C14360o3.A0K(subtypeName, "NRNSA")) {
                num = C05F.A01;
            } else if (C14360o3.A0K(subtypeName, "LTE")) {
                num = C05F.A0C;
            } else {
                num = C05F.A0N;
            }
        } else {
            num = C05F.A0Y;
        }
        obp.A00 = num;
        if (num2 != num) {
            List list = obp.A02;
            C14360o3.A06(list);
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("onNetworkChange");
            }
        }
    }

    public C56194Ox1(OBP obp) {
        this.A00 = obp;
    }
}
