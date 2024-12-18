package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Ltw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49483Ltw implements GZB {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C105824pt A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C3KX A04;

    @Override // X.GZB
    public final void D3J(Context context) {
        C14360o3.A0B(context, 0);
        UserSession userSession = this.A00;
        if (AbstractC31206Dnp.A01(userSession)) {
            C3KX c3kx = this.A04;
            AbstractC31206Dnp.A00(context, userSession, new C49693LxO(1, this.A01, this.A03, c3kx, this.A02));
            return;
        }
        Integer num = C05F.A0C;
        if (!AbstractC43607JQo.A00(userSession, num)) {
            C3KX c3kx2 = this.A04;
            String str = this.A01.A0e;
            str.getClass();
            Reel reel = this.A02;
            C3KX.A06(c3kx2, str, AbstractC37301Gc2.A0i(reel), this.A03.getId());
            C3KX.A01(reel, C3G2.A1E, c3kx2, null, null);
            return;
        }
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        int i = A00.A01.getInt("zero_rating_live_nux_count", 0);
        C1R0 C98 = C26661Qv.A00(userSession).C98();
        C3KX c3kx3 = this.A04;
        C105824pt c105824pt = this.A01;
        Reel reel2 = this.A02;
        AbstractC34362FDe.A00(context, new ViewOnClickListenerC42006Ijb(i, 1, A00, reel2, this.A03, c105824pt, c3kx3), C98, C3KX.A08, reel2.A07(), false, num);
    }

    public C49483Ltw(UserSession userSession, C105824pt c105824pt, Reel reel, User user, C3KX c3kx) {
        this.A00 = userSession;
        this.A04 = c3kx;
        this.A01 = c105824pt;
        this.A02 = reel;
        this.A03 = user;
    }

    @Override // X.GZB
    public final void onDismiss() {
        C3KW.A02(this.A00, this.A03.getId());
    }
}
