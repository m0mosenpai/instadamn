package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.A1j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22739A1j {
    public static final C194808jg A00(Context context, UserSession userSession, User user, int i, boolean z) {
        C194808jg A03;
        String str;
        int i2;
        String username = user.getUsername();
        boolean A01 = AbstractC172687md.A01(userSession);
        int i3 = -1;
        Locale locale = Locale.ROOT;
        if (A01) {
            String lowerCase = username.toLowerCase(locale);
            C14360o3.A07(lowerCase);
            A03 = AbstractC202818xz.A04(context, userSession, new C217889kL(null, user, AnonymousClass001.A0D(lowerCase, '@'), AbstractC166997dE.A0E(context.getResources()), i));
            if (z) {
                ImmutableList copyOf = ImmutableList.copyOf((Collection) A03.A08);
                C14360o3.A07(copyOf);
                Iterator<E> it = copyOf.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    Drawable A0Z = AbstractC166987dD.A0Z(it);
                    if ((A0Z instanceof C202328xC) && C14360o3.A0K(((C202328xC) A0Z).A01, "mention_sticker_redesign_subtle")) {
                        i3 = i2;
                        break;
                    }
                    i2++;
                }
                A03.A0B(i3);
            }
        } else {
            A03 = AbstractC202818xz.A03(context, userSession, new C217889kL(null, user, AnonymousClass001.A0D(AbstractC166997dE.A10(locale, username), '@'), AbstractC166997dE.A0E(context.getResources()), i));
            if (z) {
                str = "mention_sticker_subtle";
            } else {
                str = "mention_sticker_hero";
            }
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A03.A08);
            C14360o3.A07(copyOf2);
            Iterator<E> it2 = copyOf2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                Drawable A0Z2 = AbstractC166987dD.A0Z(it2);
                if ((A0Z2 instanceof C202328xC) && C14360o3.A0K(((C202328xC) A0Z2).A01, str)) {
                    i3 = i2;
                    break;
                }
                i2++;
            }
            A03.A0B(i3);
        }
        return A03;
    }
}
