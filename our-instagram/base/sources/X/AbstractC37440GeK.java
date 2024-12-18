package X;

import com.instagram.user.model.User;
import java.util.Locale;

/* renamed from: X.GeK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37440GeK {
    public static final void A00(C11520jB c11520jB, User user) {
        c11520jB.A04(AbstractC128995sK.A01, user.getId());
        c11520jB.A04(AbstractC128995sK.A02, user.getUsername());
        C11500j9 c11500j9 = AbstractC128995sK.A06;
        Locale locale = Locale.getDefault();
        C14360o3.A07(locale);
        c11520jB.A04(c11500j9, AbstractC31172DnG.A16(locale, "USER"));
        c11520jB.A04(AbstractC128995sK.A00, AbstractC37442GeM.A00(AbstractC37441GeL.A00(user.B7L())));
    }
}
