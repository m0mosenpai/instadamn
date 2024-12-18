package X;

import android.content.Intent;
import com.instagram.common.notifications.push.intf.PushChannelType;
import java.io.IOException;

/* renamed from: X.KrZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47078KrZ {
    public static void A00(Intent intent) {
        C14360o3.A0B(intent, 0);
        String str = null;
        try {
            C116155Nu A00 = C116155Nu.A00(intent, null, false);
            if (A00 != null) {
                str = A00.A0j;
            }
        } catch (IOException unused) {
        }
        MRU A002 = JQX.A00(str);
        long Enf = A002.Enf(C05F.A0C);
        A002.EWo("ADMMessageHandler", Enf);
        try {
            C116155Nu A003 = C116155Nu.A00(intent, "ADM", false);
            if (A003 != null) {
                AbstractC43602JQi.A00(A003, Enf);
            }
        } catch (IOException unused2) {
        }
        C1WZ A004 = C3J1.A00();
        PushChannelType pushChannelType = PushChannelType.A04;
        A004.A06(intent, pushChannelType, Long.valueOf(Enf), C3JG.A00(pushChannelType));
    }
}
