package X;

import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes10.dex */
public final class T9P implements InterfaceC65433Tk4 {
    @Override // X.InterfaceC65433Tk4
    public final /* bridge */ /* synthetic */ Object BIZ(String algorithm, Provider provider) {
        if (provider == null) {
            return MessageDigest.getInstance(algorithm);
        }
        return MessageDigest.getInstance(algorithm, provider);
    }
}
