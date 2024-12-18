package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4i2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101894i2 {
    public static final ReactionViewModel A00(UserSession userSession, ImageUrl imageUrl, User user, String str, boolean z, boolean z2, boolean z3) {
        ImageUrl imageUrl2 = imageUrl;
        String A0T = AnonymousClass001.A0T(user.getId(), str, ' ');
        String A07 = AbstractC101904i3.A07(user);
        int i = 0;
        if (z) {
            i = 2131959345;
        }
        ImageUrl Bhu = user.Bhu();
        MessagingUser A00 = MessagingUser.A00(user);
        if (!z && !C18U.A06(C06090Tz.A05, userSession, 36322568487250244L)) {
            imageUrl2 = null;
        }
        return new ReactionViewModel(Bhu, imageUrl2, A00, A0T, A07, str, i, z, z2, z3);
    }

    public static final void A01(UserSession userSession, String str, List list) {
        C14360o3.A0B(list, 1);
        C14360o3.A0B(str, 2);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            arrayList.add(A00(userSession, null, user, null, C14360o3.A0K(user.getId(), str), true, false));
        }
        C14360o3.A07(Collections.unmodifiableList(arrayList));
    }
}
