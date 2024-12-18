package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapRepository;
import java.util.List;

/* renamed from: X.KXh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45993KXh extends JQC {
    public final UserSession A00;
    public final FriendMapRepository A01;
    public final LJ4 A02;
    public final C45999KXn A03;
    public final Double A04;
    public final Double A05;
    public final List A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45993KXh(UserSession userSession, FriendMapRepository friendMapRepository, LJ4 lj4, C45999KXn c45999KXn, Double d, Double d2, List list) {
        super(new C45287K2p("", C16930sl.A00, false));
        AbstractC167017dG.A1Q(userSession, friendMapRepository);
        AbstractC167017dG.A1U(lj4, c45999KXn);
        this.A00 = userSession;
        this.A06 = list;
        this.A01 = friendMapRepository;
        this.A04 = d;
        this.A05 = d2;
        this.A02 = lj4;
        this.A03 = c45999KXn;
        MBp.A01(this, AbstractC141776au.A00(this), 44);
    }
}
