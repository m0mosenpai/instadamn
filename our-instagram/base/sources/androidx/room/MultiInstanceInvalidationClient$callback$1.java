package androidx.room;

import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes10.dex */
public abstract class MultiInstanceInvalidationClient$callback$1 extends Binder implements IMultiInstanceInvalidationCallback {
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.room.IMultiInstanceInvalidationCallback$Stub$Proxy, androidx.room.IMultiInstanceInvalidationCallback, java.lang.Object] */
    public static IMultiInstanceInvalidationCallback A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(IMultiInstanceInvalidationCallback.A00);
        if (queryLocalInterface != null && (queryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
            return (IMultiInstanceInvalidationCallback) queryLocalInterface;
        }
        ?? obj = new Object();
        int A03 = C0f9.A03(-34603265);
        obj.A00 = iBinder;
        C0f9.A0A(-1199259771, A03);
        return obj;
    }
}
