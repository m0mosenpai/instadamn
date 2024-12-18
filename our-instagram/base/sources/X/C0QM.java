package X;

import android.content.IntentFilter;
import java.util.Iterator;

/* renamed from: X.0QM, reason: invalid class name */
/* loaded from: classes.dex */
public class C0QM extends AbstractC07590aY implements InterfaceC08190bh {
    public static final C0NO A01 = new Object();
    public static final C07970bH A00 = new C07970bH();

    @Override // X.AbstractC07590aY
    public final Integer A05() {
        return C05F.A00;
    }

    public C0QM(InterfaceC08240bm... interfaceC08240bmArr) {
        super(interfaceC08240bmArr);
        Iterator it = interfaceC08240bmArr[0].BIr().iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            int countActions = intentFilter.countActions();
            for (int i = 0; i < countActions; i++) {
                String action = intentFilter.getAction(i);
                if (!AbstractC08230bl.A00(action) && !AbstractC08230bl.A07.contains(action)) {
                    throw new SecurityException(AnonymousClass001.A0g("Trying to register a broadcast action (", action, ") for a ProtectedActionDynamicBroadcastReceiver that is not declared in ProtectedBroadcastActions"));
                }
            }
        }
        ((AbstractC04710Mn) this).A00 = new C0OK(A00, A01);
    }
}
