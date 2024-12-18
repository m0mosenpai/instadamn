package X;

import android.security.keystore.KeyGenParameterSpec;

/* renamed from: X.2Ow, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49392Ow extends C0YY implements InterfaceC16660sJ {
    public static final C49392Ow A00 = new C49392Ow();

    public C49392Ow() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        KeyGenParameterSpec.Builder builder = (KeyGenParameterSpec.Builder) obj;
        C14360o3.A0B(builder, 0);
        builder.setDigests("SHA-256");
        builder.setSignaturePaddings("PKCS1");
        return C0eB.A00;
    }
}
