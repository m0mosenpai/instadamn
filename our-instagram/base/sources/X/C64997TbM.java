package X;

import java.security.KeyStore;

/* renamed from: X.TbM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64997TbM extends C0YY implements InterfaceC16820sZ {
    public static final C64997TbM A00 = new C64997TbM();

    public C64997TbM() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore;
    }
}
