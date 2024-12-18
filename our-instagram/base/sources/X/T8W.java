package X;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class T8W implements InterfaceC65518Tln {
    public static final java.util.Set A03;
    public static final byte[] A04 = new byte[0];
    public final InterfaceC65518Tln A00;
    public final AbstractC61590RqE A01;
    public final String A02;

    static {
        HashSet A1H = AbstractC166987dD.A1H();
        A1H.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        A1H.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        A1H.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        A1H.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        A1H.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        A1H.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        A03 = Collections.unmodifiableSet(A1H);
    }

    @Override // X.InterfaceC65518Tln
    public final byte[] AOR(final byte[] ciphertext, final byte[] associatedData) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(ciphertext);
            int i = wrap.getInt();
            if (i > 0 && i <= ciphertext.length - 4) {
                byte[] bArr = new byte[i];
                wrap.get(bArr, 0, i);
                byte[] bArr2 = new byte[wrap.remaining()];
                wrap.get(bArr2, 0, wrap.remaining());
                byte[] AOR = this.A00.AOR(bArr, A04);
                String str = this.A02;
                InterfaceC65432Tk3 interfaceC65432Tk3 = AbstractC58536Px4.A02;
                return ((InterfaceC65518Tln) C62987SaB.A01.A00(C58550PxN.A01.A05(C58551PxO.A00(Rj2.SYMMETRIC, PxH.RAW, AbstractC58536Px4.A01(AOR, 0, AOR.length), null, str)), InterfaceC65518Tln.class)).AOR(bArr2, associatedData);
            }
            throw AbstractC58318PtA.A0x("invalid ciphertext");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // X.InterfaceC65518Tln
    public final byte[] ASM(final byte[] plaintext, final byte[] associatedData) {
        AbstractC61589RqD A00 = C63163SeN.A00(this.A01, C63163SeN.A02);
        byte[] ASM = this.A00.ASM(((C58551PxO) C58550PxN.A01.A07(A00)).A02.A04(), A04);
        byte[] ASM2 = ((InterfaceC65518Tln) C62987SaB.A01.A00(A00, InterfaceC65518Tln.class)).ASM(plaintext, associatedData);
        int length = ASM.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 4 + ASM2.length);
        allocate.putInt(length);
        allocate.put(ASM);
        allocate.put(ASM2);
        return allocate.array();
    }

    @Deprecated
    public T8W(InterfaceC65518Tln dekTemplate, RVD remote) {
        if (A03.contains(remote.typeUrl_)) {
            this.A02 = remote.typeUrl_;
            PxQ pxQ = (PxQ) RVD.DEFAULT_INSTANCE.A0F(C05F.A0Y);
            if (!pxQ.A01.equals(remote)) {
                AbstractC58533Px1 A00 = PxQ.A00(pxQ);
                AbstractC58320PtC.A0d(A00).CpL(A00, remote);
            }
            RUZ ruz = (RUZ) pxQ;
            ruz.A05(PxH.RAW);
            this.A01 = SSQ.A00(ruz.A02().A0E());
            this.A00 = dekTemplate;
            return;
        }
        throw AbstractC58320PtC.A0l("Unsupported DEK key type: ", remote.typeUrl_, ". Only Tink AEAD key types are supported.");
    }
}
