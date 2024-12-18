package X;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes10.dex */
public final class T9M implements InterfaceC65433Tk4 {
    @Override // X.InterfaceC65433Tk4
    public final /* bridge */ /* synthetic */ Object BIZ(String algorithm, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(algorithm);
        }
        return KeyFactory.getInstance(algorithm, provider);
    }
}
