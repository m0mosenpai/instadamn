package X;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.T8a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64291T8a implements InterfaceC65519Tlo {
    public final S3M A00;
    public final S3M A01;
    public final C62916SWx A02;

    @Override // X.InterfaceC65519Tlo
    public final byte[] AOS(final byte[] ciphertext, final byte[] associatedData) {
        if (ciphertext.length > 5) {
            byte[] copyOf = Arrays.copyOf(ciphertext, 5);
            List A12 = AbstractC43592JPx.A12(C58526Pwu.A00(copyOf), this.A02.A03);
            if (A12 == null) {
                A12 = Collections.emptyList();
            }
            Iterator it = A12.iterator();
            while (it.hasNext()) {
                try {
                    return ((InterfaceC65519Tlo) ((SJ4) it.next()).A04).AOS(ciphertext, associatedData);
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        C62916SWx c62916SWx = this.A02;
        byte[] bArr = AbstractC62851STy.A00;
        List A122 = AbstractC43592JPx.A12(C58526Pwu.A00(bArr), c62916SWx.A03);
        if (A122 == null) {
            A122 = Collections.emptyList();
        }
        Iterator it2 = A122.iterator();
        while (it2.hasNext()) {
            try {
                return ((InterfaceC65519Tlo) ((SJ4) it2.next()).A04).AOS(ciphertext, associatedData);
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw AbstractC58318PtA.A0x("decryption failed");
    }

    @Override // X.InterfaceC65519Tlo
    public final byte[] ASN(final byte[] plaintext, final byte[] associatedData) {
        try {
            return ((InterfaceC65519Tlo) this.A02.A00.A04).ASN(plaintext, associatedData);
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }

    public C64291T8a(C62916SWx primitives) {
        this.A02 = primitives;
        if (MSW.A1b(primitives.A01.A00)) {
            SU3.A00(primitives);
        }
        S3M s3m = SU3.A00;
        this.A01 = s3m;
        this.A00 = s3m;
    }
}
