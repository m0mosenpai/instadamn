package X;

import java.security.KeyStore;

/* renamed from: X.2IF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2IF extends C0YY implements InterfaceC16820sZ {
    public static final C2IF A00 = new C2IF();

    public C2IF() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore;
    }
}
