package X;

import java.security.Signature;
import java.security.SignatureException;

/* renamed from: X.T3b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64192T3b implements InterfaceC65391TjO {
    public final int A00;
    public final Object A01;

    public C64192T3b(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65391TjO
    public final void Elx(C63152Se0 c63152Se0, C62693SMh c62693SMh, byte[] bArr) {
        if (this.A00 != 0) {
            AbstractC167017dG.A1N(c63152Se0, bArr);
            try {
                c62693SMh.A00(((C63346Si2) this.A01).A08(c63152Se0, bArr), null);
                return;
            } catch (Exception e) {
                c62693SMh.A00(null, e);
                return;
            } catch (Throwable th) {
                c62693SMh.A00(null, null);
                throw th;
            }
        }
        try {
            Signature signature = ((SGB) this.A01).A02;
            signature.getClass();
            c62693SMh.A00(SSF.A00(signature, bArr, true), null);
        } catch (SignatureException e2) {
            c62693SMh.A00(null, e2);
        } catch (Throwable th2) {
            c62693SMh.A00(null, null);
            throw th2;
        }
    }
}
