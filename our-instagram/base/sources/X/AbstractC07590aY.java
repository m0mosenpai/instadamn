package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0aY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07590aY extends AbstractC04710Mn {
    public final C005001p A01 = new C005001p(0);
    public final ArrayList A00 = new ArrayList();

    public abstract Integer A05();

    @Override // X.AbstractC04710Mn
    public final Object A03(String str) {
        Object obj = this.A01.get(str);
        obj.getClass();
        return obj;
    }

    public AbstractC07590aY(InterfaceC08240bm... interfaceC08240bmArr) {
        for (InterfaceC08240bm interfaceC08240bm : interfaceC08240bmArr) {
            Iterator it = interfaceC08240bm.BIr().iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = (IntentFilter) it.next();
                this.A00.add(intentFilter);
                int countActions = intentFilter.countActions();
                for (int i = 0; i < countActions; i++) {
                    String action = intentFilter.getAction(i);
                    C005001p c005001p = this.A01;
                    action.getClass();
                    c005001p.put(action, interfaceC08240bm);
                }
            }
        }
    }

    @Override // X.AbstractC04710Mn, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C0f9.A01(1837733310);
        String action = intent.getAction();
        action.getClass();
        InterfaceC08240bm interfaceC08240bm = (InterfaceC08240bm) A03(action);
        if (interfaceC08240bm != null) {
            try {
                super.onReceive(context, intent);
                interfaceC08240bm.Dd8(context, intent, this);
                AbstractC08070bT.A00.A00(intent, A04(context), null, "allow");
            } catch (SecurityException e) {
                AbstractC08070bT.A00.A00(intent, A04(context), null, "deny");
                i = -880590552;
                if (e instanceof C08710cZ) {
                    C0f9.A0E(-1748760256, A01, intent);
                    throw e;
                }
            }
        }
        i = -559286012;
        C0f9.A0E(i, A01, intent);
    }
}
