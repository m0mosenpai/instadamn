package X;

import android.os.Bundle;

/* renamed from: X.T2q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64184T2q implements TmO {
    public final Q8V A00;

    @Override // X.TmO
    public final C63152Se0 BLy() {
        throw AbstractC166987dD.A14("Should not be called");
    }

    @Override // X.TmO
    public final void DHb(Bundle bundle, C63152Se0 c63152Se0) {
        C63167SeR.A01(this.A00.A02, new C3AY(c63152Se0, bundle));
    }

    @Override // X.TmO
    public final void DHc(Throwable th) {
        C63167SeR.A01(this.A00.A01, th);
    }

    public C64184T2q(Bundle bundle, Q8V q8v) {
        this.A00 = q8v;
        C63167SeR.A01(q8v.A00, new C3AY("AUTH_USUP", new Bundle(bundle)));
    }
}
