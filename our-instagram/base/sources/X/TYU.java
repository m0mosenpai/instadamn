package X;

import java.security.GeneralSecurityException;

/* loaded from: classes10.dex */
public final class TYU extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        try {
            return InterfaceC65621ToC.A00(C62890SVv.A01, "AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
