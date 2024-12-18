package X;

import com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Pn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162507Pn {
    public final AvatarPrivacySettingsRepository A00;
    public final AvatarStore A01;
    public final UserSession A02;
    public final C7UM A03;
    public final AvatarReactionsRepository A04;

    public final boolean A00(List list, int i, boolean z) {
        C206409Bx c206409Bx;
        C14360o3.A0B(list, 1);
        if (AbstractC16960so.A1Q(1003, 47).contains(Integer.valueOf(i)) && !z && C14360o3.A0K(this.A01.A01.A00, C125535lz.A00)) {
            UserSession userSession = this.A03.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36322568487053634L) && ((i != 47 || C18U.A06(c06090Tz, userSession, 36322568487315781L)) && (!((Collection) this.A04.A0C.getValue()).isEmpty()) && (c206409Bx = this.A00.A00) != null)) {
                int ordinal = ((EnumC33432Eq3) c206409Bx.A00).ordinal();
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        if ((list instanceof Collection) && list.isEmpty()) {
                            return true;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!((User) it.next()).A26()) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ C162507Pn(UserSession userSession) {
        C7UM c7um = new C7UM(userSession);
        AvatarReactionsRepository A00 = C7UN.A00(userSession);
        AvatarPrivacySettingsRepository A002 = AbstractC163657Uc.A00(userSession);
        AvatarStore A003 = C20Y.A00(userSession);
        C14360o3.A0B(A00, 3);
        C14360o3.A0B(A002, 4);
        C14360o3.A0B(A003, 5);
        this.A02 = userSession;
        this.A03 = c7um;
        this.A04 = A00;
        this.A00 = A002;
        this.A01 = A003;
    }
}
