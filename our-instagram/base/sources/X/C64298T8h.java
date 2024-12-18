package X;

import java.security.GeneralSecurityException;

/* renamed from: X.T8h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64298T8h implements InterfaceC65427Tjy {
    public final C62916SWx A00;
    public final S3M A01;

    @Override // X.InterfaceC65427Tjy
    public final byte[] ASM(final byte[] plaintext, final byte[] contextInfo) {
        SJ4 sj4 = this.A00.A00;
        if (sj4 != null) {
            try {
                return ((InterfaceC65427Tjy) sj4.A04).ASM(plaintext, contextInfo);
            } catch (GeneralSecurityException e) {
                throw e;
            }
        }
        throw AbstractC58318PtA.A0x("keyset without primary key");
    }

    public C64298T8h(final C62916SWx primitives) {
        this.A00 = primitives;
        if (MSW.A1b(primitives.A01.A00)) {
            SU3.A00(primitives);
        }
        this.A01 = SU3.A00;
    }
}
