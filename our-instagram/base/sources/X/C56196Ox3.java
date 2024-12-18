package X;

import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ox3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56196Ox3 implements InterfaceC15680qO {
    public final /* synthetic */ C54772OIl A00;

    @Override // X.InterfaceC15680qO
    public final void onConnectionChanged(NetworkInfo networkInfo) {
        String str;
        Integer num;
        if (networkInfo != null) {
            networkInfo.getTypeName();
            networkInfo.getSubtypeName();
        }
        C54772OIl c54772OIl = this.A00;
        Integer num2 = c54772OIl.A00;
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
        c54772OIl.A00 = num;
        if (num2 != num) {
            List list = c54772OIl.A02;
            C14360o3.A06(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C47736L5x) it.next()).A00(c54772OIl.A00);
            }
        }
    }

    public C56196Ox3(C54772OIl c54772OIl) {
        this.A00 = c54772OIl;
    }
}
