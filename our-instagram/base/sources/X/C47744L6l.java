package X;

import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.L6l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47744L6l {
    public final AvatarStore A00;
    public final UserSession A01;

    public final boolean A00(DirectThreadKey directThreadKey, boolean z) {
        C126475ni c126475ni;
        C14360o3.A0B(directThreadKey, 0);
        AbstractC439521d abstractC439521d = this.A00.A01;
        Integer num = null;
        if ((abstractC439521d instanceof C126475ni) && (c126475ni = (C126475ni) abstractC439521d) != null) {
            num = c126475ni.A00.A00;
        }
        boolean A1X = AbstractC167007dF.A1X(num, C05F.A0C);
        if (z && A1X) {
            UserSession userSession = this.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36325278611420116L) && !C18U.A06(c06090Tz, userSession, 36325278611551189L)) {
                C81663kb A0c = AbstractC43594JPz.A0c(userSession, directThreadKey);
                if (A0c == null) {
                    return true;
                }
                List BSH = A0c.BSH();
                if (!(BSH instanceof Collection) || !BSH.isEmpty()) {
                    Iterator it = BSH.iterator();
                    while (it.hasNext()) {
                        if (!AbstractC25226BEj.A15(it).A2C()) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public C47744L6l(AvatarStore avatarStore, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, avatarStore);
        this.A01 = userSession;
        this.A00 = avatarStore;
    }
}
