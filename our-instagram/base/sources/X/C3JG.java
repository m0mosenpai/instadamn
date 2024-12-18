package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3JG, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3JG {
    public static C1WZ A00;
    public static final long A01 = TimeUnit.HOURS.toMillis(5);

    public static void A01() {
        ArrayList arrayList = new ArrayList();
        for (PushChannelType pushChannelType : PushChannelType.values()) {
            arrayList.add(pushChannelType.A01);
        }
        InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ARD.EEj(AnonymousClass001.A0R("push_reg_date", (String) it.next()));
        }
        ARD.apply();
    }

    public static String A00(PushChannelType pushChannelType) {
        C17280tP A002 = C17280tP.A00();
        if (((Boolean) A002.A1h.CES(A002, C17280tP.A4G[30])).booleanValue()) {
            return pushChannelType.A00;
        }
        return null;
    }

    public static void A02(Integer num) {
        A01();
        C74063Tx.A00().ED2(num);
    }
}
