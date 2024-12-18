package X;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SF8 {
    public final Context A00;
    public final Map A01;

    public SF8(Context context) {
        java.util.Set A03;
        SMY smy;
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = AbstractC166987dD.A1I();
        String packageName = context.getPackageName();
        java.util.Set set = S8B.A00;
        if (!set.contains(packageName)) {
            A03 = C16910sj.A00;
        } else {
            A03 = AnonymousClass090.A03(packageName, set);
        }
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            Intent A04 = AbstractC31171DnF.A04();
            AbstractC58319PtB.A19(A04, A1B, "com.meta.trusteddevice.service.TrustedDeviceFoundationServiceImpl");
            if (context.getPackageManager().resolveService(A04, 128) != null) {
                Map map = this.A01;
                if (!map.containsKey(A1B) || (smy = (SMY) map.get(A1B)) == null || smy.A00 == null) {
                    map.put(A1B, new SMY(context, A1B));
                }
            }
        }
    }
}
