package X;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes10.dex */
public final class T9O implements InterfaceC65433Tk4 {
    @Override // X.InterfaceC65433Tk4
    public final /* bridge */ /* synthetic */ Object BIZ(String algorithm, Provider provider) {
        if (provider == null) {
            return Mac.getInstance(algorithm);
        }
        return Mac.getInstance(algorithm, provider);
    }
}
