package X;

import com.instagram.api.schemas.SoundPlatformProduct;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IRU {
    public static final boolean A01(SoundPlatformProduct soundPlatformProduct, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        List Adq = AbstractC166997dE.A0Y(userSession).A03.Adq();
        if (Adq != null) {
            Iterator it = Adq.iterator();
            while (it.hasNext()) {
                List Bgx = ((InterfaceC43500JJm) it.next()).Bgx();
                if (!(Bgx instanceof Collection) || !Bgx.isEmpty()) {
                    Iterator it2 = Bgx.iterator();
                    while (it2.hasNext()) {
                        if (((JK8) it2.next()).Bya() == soundPlatformProduct) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final String A00(SoundPlatformProduct soundPlatformProduct, UserSession userSession) {
        Object obj;
        List Adq = AbstractC166987dD.A10(userSession).A03.Adq();
        if (Adq == null) {
            return null;
        }
        Iterator it = Adq.iterator();
        JK8 jk8 = null;
        while (it.hasNext()) {
            Iterator it2 = ((InterfaceC43500JJm) it.next()).Bgx().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((JK8) obj).Bya() == soundPlatformProduct) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            jk8 = (JK8) obj;
        }
        if (jk8 == null) {
            return null;
        }
        return jk8.Ah2();
    }
}
