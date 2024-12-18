package X;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.61o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC1336061o extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final GoogleApiAvailability A00;
    public final AtomicReference A01;
    public final Handler A02;
    public volatile boolean A03;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void A06() {
        this.A03 = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void A07() {
        this.A03 = false;
    }

    public void A09() {
        Handler handler = ((C61n) this).A01.A06;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public void A0A(ConnectionResult connectionResult, int i) {
        ((C61n) this).A01.A06(connectionResult, i);
    }

    public final void A0B(ConnectionResult connectionResult, int i) {
        AtomicReference atomicReference;
        SER ser = new SER(connectionResult, i);
        do {
            atomicReference = this.A01;
            if (C1EM.A00(null, ser, atomicReference)) {
                this.A02.post(new TOZ(ser, this));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i;
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        AtomicReference atomicReference = this.A01;
        SER ser = (SER) atomicReference.get();
        if (ser == null) {
            i = -1;
        } else {
            i = ser.A00;
        }
        atomicReference.set(null);
        A0A(connectionResult, i);
    }

    public AbstractDialogInterfaceOnCancelListenerC1336061o(GoogleApiAvailability googleApiAvailability, InterfaceC65566Tms interfaceC65566Tms) {
        super(interfaceC65566Tms);
        this.A01 = new AtomicReference(null);
        this.A02 = new HandlerC1336161q(Looper.getMainLooper());
        this.A00 = googleApiAvailability;
    }
}
