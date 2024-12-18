package X;

import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes10.dex */
public final class RH1 extends AbstractDialogInterfaceOnCancelListenerC1336061o {
    public final SparseArray A00;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void A08(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.A00.size(); i++) {
            T53 A01 = A01(i);
            if (A01 != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(A01.A00);
                printWriter.println(":");
                A01.A02.A0E(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC1336061o
    public final void A09() {
        for (int i = 0; i < this.A00.size(); i++) {
            T53 A01 = A01(i);
            if (A01 != null) {
                A01.A02.A08();
            }
        }
    }

    public RH1(InterfaceC65566Tms interfaceC65566Tms) {
        super(GoogleApiAvailability.A00, interfaceC65566Tms);
        this.A00 = AbstractC58318PtA.A0G();
        ((LifecycleCallback) this).A00.A80(this, "AutoManageHelper");
    }

    private final T53 A01(int i) {
        SparseArray sparseArray = this.A00;
        if (sparseArray.size() <= i) {
            return null;
        }
        return (T53) sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC1336061o
    public final void A0A(ConnectionResult connectionResult, int i) {
        android.util.Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            android.util.Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        SparseArray sparseArray = this.A00;
        T53 t53 = (T53) sparseArray.get(i);
        if (t53 == null) {
            return;
        }
        T53 t532 = (T53) sparseArray.get(i);
        sparseArray.remove(i);
        if (t532 != null) {
            AbstractC1335861e abstractC1335861e = t532.A02;
            C63459Ske c63459Ske = ((C60650RGb) abstractC1335861e).A0B;
            synchronized (c63459Ske.A03) {
                if (!c63459Ske.A06.remove(t532)) {
                    android.util.Log.w("GmsClientEvents", AnonymousClass001.A0g("unregisterConnectionFailedListener(): listener ", String.valueOf(t532), " not found"));
                }
            }
            abstractC1335861e.A09();
        }
        t53.A01.D7D(connectionResult);
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC1336061o, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void A06() {
        super.A06();
        SparseArray sparseArray = this.A00;
        String.valueOf(sparseArray);
        if (this.A01.get() == null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                T53 A01 = A01(i);
                if (A01 != null) {
                    A01.A02.A08();
                }
            }
        }
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC1336061o, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void A07() {
        super.A07();
        for (int i = 0; i < this.A00.size(); i++) {
            T53 A01 = A01(i);
            if (A01 != null) {
                A01.A02.A09();
            }
        }
    }
}
