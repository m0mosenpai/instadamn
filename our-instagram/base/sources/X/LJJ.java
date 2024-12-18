package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import java.io.File;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LJJ {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2Bc, java.lang.Object] */
    public static final synchronized C64214T4d A00(LJJ ljj, File file, boolean z) {
        C64214T4d c64214T4d;
        synchronized (ljj) {
            String path = file.getPath();
            Map map = C48517LdF.A09;
            c64214T4d = (C64214T4d) map.get(path);
            if (c64214T4d == null) {
                if (!z) {
                    c64214T4d = new C64214T4d(new Object(), file);
                } else {
                    c64214T4d = new C64214T4d(new C46392Bb(C48517LdF.A07), file);
                }
            }
            map.put(path, c64214T4d);
        }
        return c64214T4d;
    }

    public static final C48517LdF A01(UserSession userSession) {
        return (C48517LdF) userSession.A01(C48517LdF.class, MHS.A00(userSession, 17));
    }

    public static final String A02(CommonMediaTransport commonMediaTransport) {
        String str;
        String str2 = commonMediaTransport.fileSha256_;
        C14360o3.A07(str2);
        String A00 = AbstractC62268S4n.A00(str2);
        if ((commonMediaTransport.bitField0_ & 256) != 0) {
            str = commonMediaTransport.mimetype_;
        } else {
            str = null;
        }
        return AnonymousClass001.A0R(A00, LLT.A05(str));
    }
}
