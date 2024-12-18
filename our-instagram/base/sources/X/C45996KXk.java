package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.friendmap.data.MapText;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Iterator;

/* renamed from: X.KXk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45996KXk extends JQC {
    public final UserSession A00;
    public final FriendMapRepository A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45996KXk(UserSession userSession, FriendMapRepository friendMapRepository, String str) {
        super(new C45290K2s(null, "", false, false));
        Object obj;
        AbstractC167027dH.A13(userSession, str, friendMapRepository);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = friendMapRepository;
        Iterator it = ((Iterable) friendMapRepository.A0M.getValue()).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            } else {
                obj = it.next();
            }
        } while (!C14360o3.A0K(((Jx8) obj).A09, this.A02));
        Jx8 jx8 = (Jx8) obj;
        if (jx8 != null) {
            A0O(new C50355MLh(LLE.A02(jx8), 42));
        } else {
            A0M(C49423Lsx.A00);
        }
    }

    public static final void A00(EnumC152186t3 enumC152186t3, C45996KXk c45996KXk, String str) {
        DirectShareTarget A00;
        C45128JyU c45128JyU = ((C45290K2s) c45996KXk.A0L()).A00;
        if (c45128JyU != null && (A00 = AbstractC47888LDi.A00(enumC152186t3, c45996KXk.A00, c45128JyU, str)) != null) {
            c45996KXk.A0M(new C49422Lsw(c45128JyU.A06.Bhu(), new MapText.Res(2131962906, new String[0]), new MapText.Res(2131962907, new String[0]), A00.A01()));
        }
    }
}
