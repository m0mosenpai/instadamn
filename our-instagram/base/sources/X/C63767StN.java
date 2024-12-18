package X;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.StN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63767StN implements InterfaceC65570Tn3 {
    public Object A00;
    public final SAY A01;
    public final String A02;

    @Override // X.InterfaceC65570Tn3
    public final void cancel() {
    }

    @Override // X.InterfaceC65570Tn3
    public final Class Avg() {
        return InputStream.class;
    }

    @Override // X.InterfaceC65570Tn3
    public final Integer Avo() {
        return C05F.A00;
    }

    @Override // X.InterfaceC65570Tn3
    public final void ChQ(EnumC61107RfN enumC61107RfN, InterfaceC65471Tko interfaceC65471Tko) {
        try {
            String str = this.A02;
            if (str.startsWith("data:image")) {
                int indexOf = str.indexOf(44);
                if (indexOf != -1) {
                    if (str.substring(0, indexOf).endsWith(";base64")) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(AbstractC58318PtA.A0g(indexOf, str), 0));
                        this.A00 = byteArrayInputStream;
                        interfaceC65471Tko.D9H(byteArrayInputStream);
                        return;
                    }
                    throw AbstractC166987dD.A12("Not a base64 image data URL.");
                }
                throw AbstractC166987dD.A12("Missing comma in data URL.");
            }
        } catch (IllegalArgumentException e) {
            interfaceC65471Tko.DPj(e);
        }
    }

    @Override // X.InterfaceC65570Tn3
    public final void cleanup() {
        try {
            ((InputStream) this.A00).close();
        } catch (IOException unused) {
        }
    }

    public C63767StN(SAY say, String str) {
        this.A02 = str;
        this.A01 = say;
    }
}
