package X;

import android.util.Base64;
import java.net.URLConnection;

/* renamed from: X.NrK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53830NrK {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        byte[] A09;
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 1);
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A00()).A00;
        try {
            C6BS c6bs = C6BS.A02;
            android.net.Uri A01 = C6BX.A01(AbstractC25227BEk.A0B(A0e), true);
            String path = A01.getPath();
            if (path != null) {
                C06090Tz c06090Tz = C06090Tz.A05;
                C14360o3.A08(c06090Tz);
                if (C1AD.A06(c06090Tz, 18312984635914794L)) {
                    C54846OMr c54846OMr = new C54846OMr();
                    c54846OMr.A06(path);
                    c54846OMr.A07("image/");
                    A09 = AbstractC57194Pae.A09(c54846OMr.A00());
                } else {
                    String guessContentTypeFromName = URLConnection.guessContentTypeFromName(path);
                    C14360o3.A0A(guessContentTypeFromName);
                    if (AbstractC002300n.A0h(guessContentTypeFromName, "image/", false)) {
                        A09 = AbstractC57194Pae.A09(AbstractC166987dD.A11(path));
                    } else {
                        throw AbstractC166987dD.A12("File is not an image.");
                    }
                }
                String encodeToString = Base64.encodeToString(A09, 0);
                C14360o3.A0A(encodeToString);
                C14360o3.A0B(encodeToString, 1);
                C6FX c6fx = new C6FX();
                c6fx.A03(encodeToString, 0);
                AbstractC25227BEk.A1M(c6fq, c6fx, A0I);
                return null;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("URI ");
            A1C.append(A01);
            throw AbstractC166987dD.A12(AbstractC166997dE.A0x(" has no path", A1C));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                C6FX c6fx2 = new C6FX();
                c6fx2.A03(message, 0);
                AbstractC25227BEk.A1M(c6fq, c6fx2, interfaceC103384lE);
            }
            throw e;
        }
    }
}
