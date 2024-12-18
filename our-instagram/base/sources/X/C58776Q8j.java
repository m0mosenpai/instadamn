package X;

import android.app.Application;
import android.os.Bundle;

/* renamed from: X.Q8j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58776Q8j extends C53432cR {
    public final Application A00;
    public final Bundle A01;

    @Override // X.C53432cR, X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        return new Q8E(this.A00, this.A01);
    }

    public C58776Q8j(Application application, Bundle bundle) {
        super(application);
        this.A00 = application;
        this.A01 = bundle;
    }
}
