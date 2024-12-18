package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.fbpay.w3c.AutofillKeyFetchService;
import com.fbpay.w3c.client.W3CClient$AutofillKeyFetchServiceCallbackImpl;

/* renamed from: X.SkC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63433SkC implements ServiceConnection {
    public final /* synthetic */ C2GP A00;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.fbpay.w3c.AutofillKeyFetchService$Stub$Proxy] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AutofillKeyFetchService autofillKeyFetchService;
        C14360o3.A0B(iBinder, 1);
        C2GP c2gp = this.A00;
        synchronized (c2gp) {
            c2gp.A02 = iBinder;
        }
        try {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.fbpay.w3c.AutofillKeyFetchService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof AutofillKeyFetchService)) {
                autofillKeyFetchService = (AutofillKeyFetchService) queryLocalInterface;
            } else {
                ?? obj = new Object();
                int A03 = C0f9.A03(-1993596670);
                obj.A00 = iBinder;
                C0f9.A0A(-1870038805, A03);
                autofillKeyFetchService = obj;
            }
            autofillKeyFetchService.BZO(new W3CClient$AutofillKeyFetchServiceCallbackImpl(c2gp));
        } catch (Exception e) {
            c2gp.A05.A0A(new SED(null, e));
        }
    }

    public ServiceConnectionC63433SkC(C2GP c2gp) {
        this.A00 = c2gp;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2GP c2gp = this.A00;
        c2gp.A02 = null;
        c2gp.A00 = null;
    }
}
