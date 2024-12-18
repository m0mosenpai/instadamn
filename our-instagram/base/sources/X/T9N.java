package X;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes10.dex */
public final class T9N implements InterfaceC65433Tk4 {
    @Override // X.InterfaceC65433Tk4
    public final /* bridge */ /* synthetic */ Object BIZ(String algorithm, Provider provider) {
        if (provider == null) {
            return KeyPairGenerator.getInstance(algorithm);
        }
        return KeyPairGenerator.getInstance(algorithm, provider);
    }
}
