package X;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* loaded from: classes10.dex */
public final class T4o implements InterfaceC65662Tqs {
    public final Credential A00;
    public final Status A01;

    public T4o(Credential credential, Status status) {
        this.A01 = status;
        this.A00 = credential;
    }

    @Override // X.C61j
    public final Status C0F() {
        return this.A01;
    }
}
