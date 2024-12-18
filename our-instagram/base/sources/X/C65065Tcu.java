package X;

import android.security.keystore.KeyGenParameterSpec;

/* renamed from: X.Tcu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65065Tcu extends C0YY implements InterfaceC16660sJ {
    public static final C65065Tcu A00 = new C65065Tcu();

    public C65065Tcu() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        KeyGenParameterSpec.Builder builder = (KeyGenParameterSpec.Builder) obj;
        C14360o3.A0B(builder, 0);
        builder.setDigests("SHA-256", "SHA-1");
        builder.setEncryptionPaddings("OAEPPadding");
        return C0eB.A00;
    }
}
