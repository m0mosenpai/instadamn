package X;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.firebase.iid.zzm;

/* renamed from: X.Puy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58420Puy {
    public final Messenger A00;
    public final zzm A01;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.firebase.iid.zzm, java.lang.Object] */
    public C58420Puy(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.A00 = new Messenger(iBinder);
        } else {
            if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
                ?? obj = new Object();
                obj.A00 = new Messenger(iBinder);
                this.A01 = obj;
                return;
            }
            android.util.Log.w("MessengerIpcClient", AbstractC58321PtD.A0v("Invalid interface descriptor: ", interfaceDescriptor));
            throw new RemoteException();
        }
    }
}
