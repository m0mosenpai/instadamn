package X;

import com.facebook.proxygen.RootCACallbacks;

/* renamed from: X.Oov, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55729Oov implements RootCACallbacks {
    public static final C55729Oov A00 = new C55729Oov();

    @Override // com.facebook.proxygen.RootCACallbacks
    public final byte[][] getSystemRootCAs() {
        C63162SeL c63162SeL = C51962Mxy.A00;
        if (c63162SeL != null) {
            return c63162SeL.A02();
        }
        throw AbstractC166997dE.A0g();
    }
}
