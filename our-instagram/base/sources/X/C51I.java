package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.51I, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C51I {
    public static final C9BW A00(UserSession userSession, byte[] bArr) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(bArr, 1);
        try {
            return new C9BW(21, C38321qM.A0h.A0B(C07950bF.A04.A01(userSession, new String(bArr, C15W.A05)), false), (Object) null);
        } catch (IOException e) {
            return new C9BW(21, (Object) null, e);
        }
    }
}
