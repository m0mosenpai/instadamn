package X;

import com.facebook.proxygen.RootCACallbacks;

/* renamed from: X.Szf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64121Szf implements RootCACallbacks {
    public final /* synthetic */ C63188Sen A00;

    public C64121Szf(C63188Sen c63188Sen) {
        this.A00 = c63188Sen;
    }

    @Override // com.facebook.proxygen.RootCACallbacks
    public final byte[][] getSystemRootCAs() {
        return new C63162SeL().A02();
    }
}
