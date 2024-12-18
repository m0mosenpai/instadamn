package X;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes10.dex */
public abstract class SU1 {
    public static final Object A00 = AbstractC58318PtA.A0b();

    public static void A00(InterfaceC65518Tln handle, C58549PxM writer, PxU masterAead) {
        try {
            if (handle != null) {
                byte[] bArr = new byte[0];
                PxJ pxJ = writer.A01;
                byte[] ASM = handle.ASM(pxJ.A0E(), bArr);
                try {
                    if (AbstractC58533Px1.A06(C58534Px2.A00(), PxJ.DEFAULT_INSTANCE, handle.AOR(ASM, bArr)).equals(pxJ)) {
                        PxQ pxQ = (PxQ) C58558Pxa.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                        ((C58558Pxa) PxQ.A00(pxQ)).encryptedKeyset_ = AbstractC58536Px4.A01(ASM, 0, ASM.length);
                        C58565Pxh A002 = SU0.A00(pxJ);
                        C58558Pxa c58558Pxa = (C58558Pxa) PxQ.A00(pxQ);
                        A002.getClass();
                        c58558Pxa.keysetInfo_ = A002;
                        c58558Pxa.bitField0_ |= 1;
                        if (!masterAead.A00.putString(masterAead.A01, AbstractC58562Pxe.A00(pxQ.A02().A0E())).commit()) {
                            throw MSW.A0y("Failed to write to SharedPreferences");
                        }
                        return;
                    }
                    throw AbstractC58318PtA.A0x("cannot encrypt keyset");
                } catch (C61032Re1 unused) {
                    throw AbstractC58318PtA.A0x("invalid keyset, corrupted key material");
                }
            }
            if (!masterAead.A00.putString(masterAead.A01, AbstractC58562Pxe.A00(writer.A01.A0E())).commit()) {
            }
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
