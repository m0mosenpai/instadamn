package X;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes10.dex */
public final class T9Q implements InterfaceC65433Tk4 {
    @Override // X.InterfaceC65433Tk4
    public final /* bridge */ /* synthetic */ Object BIZ(String algorithm, Provider provider) {
        if (provider == null) {
            return Signature.getInstance(algorithm);
        }
        return Signature.getInstance(algorithm, provider);
    }
}
