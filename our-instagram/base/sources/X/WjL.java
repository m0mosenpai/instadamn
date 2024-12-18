package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WjL implements GXY {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ViewOnClickListenerC66108Tzj A01;
    public final /* synthetic */ String A02;

    public WjL(ViewOnClickListenerC66108Tzj viewOnClickListenerC66108Tzj, String str, long j) {
        this.A01 = viewOnClickListenerC66108Tzj;
        this.A02 = str;
        this.A00 = j;
    }

    @Override // X.GXY
    public final void Dsp() {
        long A07 = AbstractC43593JPy.A07();
        ViewOnClickListenerC66108Tzj viewOnClickListenerC66108Tzj = this.A01;
        if (!viewOnClickListenerC66108Tzj.A0G) {
            C18920wW c18920wW = viewOnClickListenerC66108Tzj.A08;
            String str = this.A02;
            long j = this.A00;
            AbstractC167017dG.A1N(c18920wW, str);
            AbstractC66181U2w.A02(c18920wW, str, "ig_search_explore_donut", "", "", j, A07);
        }
        UserSession userSession = viewOnClickListenerC66108Tzj.A09;
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36327950082325499L)) {
            AbstractC35257Fgr.A08(userSession, viewOnClickListenerC66108Tzj.A06, EnumC33519Ers.A09.toString());
        }
    }
}
