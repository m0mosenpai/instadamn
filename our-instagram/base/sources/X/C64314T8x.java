package X;

import java.util.Arrays;
import javax.crypto.Mac;

/* renamed from: X.T8x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64314T8x implements InterfaceC65520Tlp {
    public final C62986SaA A00;

    @Override // X.InterfaceC65520Tlp
    public final C62499SEb ARx(byte[] recipientPublicKey) {
        byte[] A00 = AbstractC58567Pxj.A00(32);
        A00[0] = (byte) (A00[0] | 7);
        byte b = (byte) (A00[31] & 63);
        A00[31] = b;
        A00[31] = (byte) (b | 128);
        byte[] A01 = SSU.A01(A00, recipientPublicKey);
        byte[] A002 = SSU.A00(A00);
        return new C62499SEb(this.A00.A03(A01, AbstractC63315ShN.A01(A002, recipientPublicKey), AbstractC63315ShN.A01(AbstractC63126SdU.A0B, AbstractC63126SdU.A0F), Mac.getInstance("HmacSha256").getMacLength()), A002);
    }

    @Override // X.InterfaceC65520Tlp
    public final byte[] BKR() {
        if (Arrays.equals(this.A00.A01(), AbstractC63126SdU.A06)) {
            return AbstractC63126SdU.A0F;
        }
        throw AbstractC58318PtA.A0x("Could not determine HPKE KEM ID");
    }

    public C64314T8x(C62986SaA hkdf) {
        this.A00 = hkdf;
    }
}
