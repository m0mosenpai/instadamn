package X;

import java.security.GeneralSecurityException;
import java.security.Signature;

/* loaded from: classes10.dex */
public final class T2w implements InterfaceC65507Tlc {
    public final /* synthetic */ C64193T3c A00;
    public final /* synthetic */ C63152Se0 A01;
    public final /* synthetic */ C62693SMh A02;
    public final /* synthetic */ byte[] A03;

    @Override // X.InterfaceC65507Tlc
    public final void CyK(SGB sgb) {
        try {
            Signature signature = sgb.A02;
            if (signature == null) {
                signature = C63346Si2.A02(((C58770Q8c) this.A00.A01).A08, this.A01.A02);
            }
            byte[] bArr = this.A03;
            C14360o3.A0B(signature, 0);
            this.A02.A00(SSF.A00(signature, bArr, true), null);
        } catch (GeneralSecurityException e) {
            this.A02.A00(null, e);
        } catch (Throwable th) {
            this.A02.A00(null, null);
            throw th;
        }
    }

    public T2w(C64193T3c c64193T3c, C63152Se0 c63152Se0, C62693SMh c62693SMh, byte[] bArr) {
        this.A00 = c64193T3c;
        this.A01 = c63152Se0;
        this.A03 = bArr;
        this.A02 = c62693SMh;
    }

    @Override // X.InterfaceC65507Tlc
    public final void CyJ(Throwable th) {
        this.A02.A00(null, th);
    }
}
