package X;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes10.dex */
public final class T9K implements InterfaceC65433Tk4 {
    @Override // X.InterfaceC65433Tk4
    public final /* bridge */ /* synthetic */ Object BIZ(String algorithm, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(algorithm);
        }
        return Cipher.getInstance(algorithm, provider);
    }
}
