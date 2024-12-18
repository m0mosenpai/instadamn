package X;

import android.app.Application;
import android.os.Bundle;

/* renamed from: X.Q8i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58775Q8i extends C53432cR {
    public final Application A00;
    public final Bundle A01;

    @Override // X.C53432cR, X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        if (cls.isAssignableFrom(Q8D.class)) {
            return new Q8D(this.A00, this.A01);
        }
        throw AbstractC37303Gc4.A0M(cls, "Unknown ViewModel class: ", AbstractC166987dD.A1C());
    }

    public C58775Q8i(Application application, Bundle bundle) {
        super(application);
        this.A00 = application;
        this.A01 = bundle;
    }
}
