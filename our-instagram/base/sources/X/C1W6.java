package X;

import android.content.Context;
import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.TelecomManager;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.1W6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1W6 {
    public final List A00;
    public final List A01;
    public final List A02;
    public final ConcurrentMap A03;
    public final Context A04;
    public final TelecomManager A05;

    public final void A05(String str, boolean z, boolean z2) {
        Connection connection;
        int i;
        C14360o3.A0B(str, 0);
        ConcurrentMap concurrentMap = this.A03;
        C9BW c9bw = (C9BW) concurrentMap.get(str);
        if (c9bw != null && (connection = (Connection) c9bw.A00) != null) {
            if (z) {
                i = 6;
            } else {
                i = 2;
                if (z2) {
                    i = 3;
                }
            }
            List list = this.A00;
            C14360o3.A06(list);
            ListIterator listIterator = AbstractC001800i.A0a(list).listIterator();
            while (listIterator.hasNext()) {
                ((OMu) listIterator.next()).A09(false);
            }
            connection.setDisconnected(new DisconnectCause(i));
            connection.destroy();
            concurrentMap.remove(str);
        }
    }

    public static final C9BW A00(C1W6 c1w6, C50758MbO c50758MbO, String str) {
        ConcurrentMap concurrentMap = c1w6.A03;
        C9BW c9bw = (C9BW) concurrentMap.get(str);
        if (c9bw == null) {
            return null;
        }
        Bundle bundle = (Bundle) c9bw.A01;
        C14360o3.A0B(bundle, 0);
        C9BW c9bw2 = new C9BW(bundle, c50758MbO);
        concurrentMap.put(str, c9bw2);
        return c9bw2;
    }

    public static final C50758MbO A01(C1W6 c1w6) {
        Object obj;
        Iterator it = c1w6.A03.values().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Connection connection = (Connection) ((C9BW) obj).A00;
                if (connection != null && (connection.getState() == 3 || connection.getState() == 2 || connection.getState() == 4)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C9BW c9bw = (C9BW) obj;
        if (c9bw == null) {
            return null;
        }
        return (C50758MbO) c9bw.A00;
    }

    public static final void A02(Bundle bundle, UserSession userSession, C1W6 c1w6, String str) {
        List list = c1w6.A01;
        C14360o3.A06(list);
        ListIterator listIterator = AbstractC001800i.A0a(list).listIterator();
        while (listIterator.hasNext()) {
            ((C1WF) listIterator.next()).Dm0(bundle, userSession, str);
        }
    }

    public static final void A03(Bundle bundle, UserSession userSession, C1W6 c1w6, String str) {
        List list = c1w6.A02;
        C14360o3.A06(list);
        ListIterator listIterator = AbstractC001800i.A0a(list).listIterator();
        while (listIterator.hasNext()) {
            C3ES c3es = (C3ES) listIterator.next();
            C14360o3.A0B(bundle, 2);
            c3es.Cwp(bundle, userSession, str);
        }
    }

    public C1W6(Context context) {
        this.A04 = context;
        Object systemService = context.getSystemService("telecom");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.telecom.TelecomManager");
        this.A05 = (TelecomManager) systemService;
        this.A01 = Collections.synchronizedList(new ArrayList());
        this.A02 = Collections.synchronizedList(new ArrayList());
        this.A00 = Collections.synchronizedList(new ArrayList());
        C18B c18b = new C18B();
        c18b.A03(8);
        c18b.A02(2);
        this.A03 = c18b.A00();
    }

    public static final void A04(Bundle bundle, C1W6 c1w6, Throwable th) {
        List list = c1w6.A02;
        C14360o3.A06(list);
        ListIterator listIterator = AbstractC001800i.A0a(list).listIterator();
        while (listIterator.hasNext()) {
            C3ES c3es = (C3ES) listIterator.next();
            C14360o3.A0B(bundle, 2);
            StringBuilder sb = new StringBuilder();
            sb.append("onOutgoingCallFailure(");
            sb.append("outgoing_default_connection_id");
            sb.append(", ");
            sb.append(bundle);
            sb.append(')');
            C0K8.A0F("RtcCallStackImpl", sb.toString(), th);
            InterfaceC16820sZ interfaceC16820sZ = c3es.A01;
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
            }
        }
    }
}
