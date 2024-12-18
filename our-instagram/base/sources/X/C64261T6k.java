package X;

import android.os.BaseBundle;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* renamed from: X.T6k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64261T6k implements InterfaceC65423Tju {
    public final /* synthetic */ C62917SWy A00;

    public C64261T6k(C62917SWy c62917SWy) {
        this.A00 = c62917SWy;
    }

    @Override // X.InterfaceC65423Tju
    public final /* synthetic */ Object Eq5(C5KS c5ks) {
        Object obj;
        synchronized (c5ks.A04) {
            C3U5.A09(c5ks.A02, "Task is not yet complete");
            if (!c5ks.A05) {
                if (!IOException.class.isInstance(c5ks.A00)) {
                    Exception exc = c5ks.A00;
                    if (exc == null) {
                        obj = c5ks.A01;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw ((Throwable) IOException.class.cast(c5ks.A00));
                }
            } else {
                throw new CancellationException(AbstractC111324zv.A00(3778));
            }
        }
        BaseBundle baseBundle = (BaseBundle) obj;
        if (baseBundle != null) {
            String string = baseBundle.getString("registration_id");
            if (string == null && (string = baseBundle.getString("unregistered")) == null) {
                String string2 = baseBundle.getString("error");
                if (!"RST".equals(string2)) {
                    if (string2 != null) {
                        throw MSW.A0y(string2);
                    }
                    String valueOf = String.valueOf(baseBundle);
                    android.util.Log.w("FirebaseInstanceId", MSZ.A0u("Unexpected response: ", valueOf, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 21)), new Throwable());
                    throw MSW.A0y("SERVICE_NOT_AVAILABLE");
                }
                throw MSW.A0y("INSTANCE_ID_RESET");
            }
            return string;
        }
        throw MSW.A0y("SERVICE_NOT_AVAILABLE");
    }
}
