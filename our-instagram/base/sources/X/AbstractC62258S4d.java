package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.S4d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62258S4d {
    public static final void A00(InterfaceC26421Px interfaceC26421Px, String str, java.net.URI uri, C23781El[] c23781ElArr) {
        C14360o3.A0B(c23781ElArr, 2);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("curl ");
        A1C.append("-X ");
        A1C.append(str);
        A1C.append(" ");
        for (C23781El c23781El : c23781ElArr) {
            A1C.append("--header \"");
            String A0d = AbstractC002300n.A0d(AbstractC166987dD.A19(c23781El), "\"", "\\\"", false);
            int length = A0d.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A19 = AbstractC167027dH.A19(A0d, i2);
                if (!z) {
                    if (!A19) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (A19) {
                    length--;
                }
            }
            A1C.append(AbstractC31177DnL.A0g(A0d, length, i));
            A1C.append("\" ");
        }
        A1C.append("\"");
        A1C.append(uri);
        A1C.append("\"");
        if (interfaceC26421Px != null) {
            long contentLength = interfaceC26421Px.getContentLength();
            if (0 < contentLength && contentLength < OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) {
                ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
                try {
                    InputStream E2i = interfaceC26421Px.E2i();
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = E2i.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            A0U.write(bArr, 0, read);
                        }
                    }
                    A0U.flush();
                } catch (IOException unused) {
                }
                AbstractC58320PtC.A1N(" --data-ascii \"", AbstractC166987dD.A19(A0U), "\"", A1C);
            } else {
                A1C.append(" [TOO MUCH DATA TO INCLUDE]");
            }
        }
        C14360o3.A07(A1C.toString());
    }
}
