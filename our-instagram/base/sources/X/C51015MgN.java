package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.MgN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51015MgN extends AbstractC52922bZ {
    public final UserSession A00;
    public final C54558O8k A01;
    public final NSQ A02;
    public final C166257bu A03;
    public final Map A04;
    public final C05A A05;
    public final C0UO A06;
    public final C25671My A07;

    public C51015MgN(C25671My c25671My, UserSession userSession, NSQ nsq, C166257bu c166257bu) {
        C14360o3.A0B(c25671My, 2);
        this.A03 = c166257bu;
        this.A07 = c25671My;
        this.A00 = userSession;
        this.A02 = nsq;
        this.A01 = new C54558O8k(userSession, C18U.A06(C06090Tz.A05, userSession, 36324685906719121L));
        C008002u A1H = AbstractC25225BEi.A1H(new C51725Mt2(null, null, null, EnumC53155NfA.A03, "", C5HZ.A01, false, false, false));
        this.A05 = A1H;
        this.A06 = AbstractC208910l.A02(A1H);
        this.A04 = AbstractC166987dD.A1I();
        AbstractC25232BEp.A1J(this, new C43171J6q(this, null, 8), new AnonymousClass625(c25671My).A00(C3MC.class));
        PZC.A02(this, AbstractC141776au.A00(this), 23);
    }

    public static final void A00(C51015MgN c51015MgN, FollowStatus followStatus, String str) {
        Object value;
        User user = (User) c51015MgN.A04.get(str);
        if (user != null) {
            user.A0k(followStatus);
        }
        C5Hc<C51635MrS> c5Hc = ((C51725Mt2) c51015MgN.A06.getValue()).A05;
        ArrayList A0q = AbstractC167017dG.A0q(c5Hc);
        for (C51635MrS c51635MrS : c5Hc) {
            String str2 = c51635MrS.A04;
            if (C14360o3.A0K(str2, str)) {
                BJ3 A00 = CKG.A00(followStatus);
                String str3 = c51635MrS.A05;
                ImageUrl imageUrl = c51635MrS.A00;
                String str4 = c51635MrS.A03;
                boolean z = c51635MrS.A08;
                boolean z2 = c51635MrS.A07;
                boolean z3 = c51635MrS.A06;
                Reel reel = c51635MrS.A02;
                C14360o3.A0B(str3, 0);
                AbstractC25233BEq.A0w(1, imageUrl, str2, A00);
                c51635MrS = new C51635MrS(imageUrl, A00, reel, str3, str4, str2, z, z2, z3);
            }
            A0q.add(c51635MrS);
        }
        C5Hc A002 = AbstractC133095zb.A00(A0q);
        C05A c05a = c51015MgN.A05;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C51725Mt2.A00(null, null, (C51725Mt2) value, null, A002, 507)));
    }

    public final void A01(int i) {
        C57155PYz.A00(this, AbstractC141776au.A00(this), i, 31);
    }
}
