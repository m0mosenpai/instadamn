package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2pY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60492pY {
    public static final InterfaceC09390do A02(Fragment fragment) {
        C14360o3.A0B(fragment, 0);
        return AbstractC09440dt.A00(EnumC09460dv.A02, new C9F8(41, C023409i.A0A, fragment));
    }

    public static final void A03(Bundle bundle, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", abstractC12990ll.getToken());
    }

    public static final void A04(Bundle bundle, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        A03(bundle, userSession);
    }

    public static final InterfaceC09390do A01(Fragment fragment) {
        return AbstractC09440dt.A00(EnumC09460dv.A02, new C9F8(40, C023409i.A0A, fragment));
    }

    public static final String A00(Object obj) {
        Class<?> cls = obj.getClass();
        Map map = C0YZ.A03;
        C14360o3.A0B(cls, 1);
        String A00 = AbstractC13230m9.A00(cls);
        if (A00 == null) {
            String obj2 = cls.toString();
            C14360o3.A07(obj2);
            return obj2;
        }
        return A00;
    }
}
