package X;

import android.net.NetworkInfo;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: X.2sJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62182sJ implements InterfaceC15680qO {
    public final WeakReference A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(C62192sK.A00);

    @Override // X.InterfaceC15680qO
    public final void onConnectionChanged(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            ((Handler) this.A01.getValue()).post(new Runnable() { // from class: X.3qE
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) C62182sJ.this.A00.get();
                    if (interfaceC16820sZ != null) {
                        interfaceC16820sZ.invoke();
                    }
                }
            });
        }
    }

    public C62182sJ(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = new WeakReference(interfaceC16820sZ);
    }
}
