package X;

import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: X.61n, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C61n extends AbstractDialogInterfaceOnCancelListenerC1336061o {
    public final C012504o A00;
    public final C1335961f A01;

    @Override // X.AbstractDialogInterfaceOnCancelListenerC1336061o, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void A06() {
        this.A03 = true;
        if (!this.A00.isEmpty()) {
            this.A01.A07(this);
        }
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC1336061o, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void A07() {
        this.A03 = false;
        C1335961f c1335961f = this.A01;
        synchronized (C1335961f.A0I) {
            if (c1335961f.A01 == this) {
                c1335961f.A01 = null;
                c1335961f.A0A.clear();
            }
        }
    }

    public C61n(GoogleApiAvailability googleApiAvailability, C1335961f c1335961f, InterfaceC65566Tms interfaceC65566Tms) {
        super(googleApiAvailability, interfaceC65566Tms);
        this.A00 = new C012504o(0);
        this.A01 = c1335961f;
        ((LifecycleCallback) this).A00.A80(this, "ConnectionlessLifecycleHelper");
    }
}
