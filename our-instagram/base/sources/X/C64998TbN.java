package X;

import javax.crypto.Cipher;

/* renamed from: X.TbN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64998TbN extends C0YY implements InterfaceC16820sZ {
    public static final C64998TbN A00 = new C64998TbN();

    public C64998TbN() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding");
    }
}
