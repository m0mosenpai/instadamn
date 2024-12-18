package X;

import java.security.KeyStore;

/* loaded from: classes11.dex */
public final class X4K extends C0YY implements InterfaceC16820sZ {
    public static final X4K A00 = new X4K();

    public X4K() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        KeyStore keyStore = C63264SgO.A01;
        if (keyStore == null) {
            C14360o3.A0F("keyStore");
            throw C00O.createAndThrow();
        }
        keyStore.deleteEntry("ecp-40bbaf72-50a8-11ec-bf63-0242ac130002");
        return C0eB.A00;
    }
}
