package X;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class T9J implements InterfaceC65621ToC {
    public final InterfaceC65433Tk4 A00;

    @Override // X.InterfaceC65621ToC
    public final Object BIY(String algorithm) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        C62890SVv c62890SVv = C62890SVv.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                A1E.add(provider);
            }
        }
        Iterator it = A1E.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.A00.BIZ(algorithm, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public T9J(InterfaceC65433Tk4 jceFactory) {
        this.A00 = jceFactory;
    }
}