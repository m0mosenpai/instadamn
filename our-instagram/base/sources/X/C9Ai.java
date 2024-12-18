package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.9Ai, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9Ai {
    public static final byte[] A00 = {102, 116, 121, 112};

    public static final XmlPullParser A00(UserSession userSession, File file) {
        byte[] bArr;
        C14360o3.A0B(file, 0);
        C14360o3.A0B(userSession, 1);
        long A01 = C18U.A01(C06090Tz.A06, userSession, 36602046304031277L) * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        try {
            if (file.exists() && file.isFile() && A01 >= file.length()) {
                XmlPullParser newPullParser = android.util.Xml.newPullParser();
                C14360o3.A07(newPullParser);
                C61012qP A02 = C60782q2.A02(new C60782q2(file), "Xmp");
                if (A02 != null) {
                    bArr = A02.A03;
                } else {
                    bArr = null;
                }
                if (bArr != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    C14360o3.A08(charset);
                    newPullParser.setInput(new StringReader(new String(bArr, charset)));
                }
                return newPullParser;
            }
        } catch (IOException | SecurityException | XmlPullParserException unused) {
        }
        return null;
    }
}
