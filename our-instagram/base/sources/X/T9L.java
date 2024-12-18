package X;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes10.dex */
public final class T9L implements InterfaceC65433Tk4 {
    @Override // X.InterfaceC65433Tk4
    public final /* bridge */ /* synthetic */ Object BIZ(String algorithm, Provider provider) {
        if (provider == null) {
            return KeyAgreement.getInstance(algorithm);
        }
        return KeyAgreement.getInstance(algorithm, provider);
    }
}
