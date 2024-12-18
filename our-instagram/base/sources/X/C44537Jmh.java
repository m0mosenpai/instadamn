package X;

import com.instagram.common.session.UserSession;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.igtv.repository.user.UserRepository;

/* renamed from: X.Jmh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44537Jmh extends AbstractC52922bZ {
    public boolean A00;
    public final C2GS A01;
    public final C2GS A02;
    public final C2GS A03;
    public final C2GS A04;
    public final UserSession A05;
    public final O39 A06;
    public final C38900HAw A07;
    public final InterfaceC50512MRp A08;
    public final InterfaceC50512MRp A09;
    public final InterfaceC50512MRp A0A;
    public final IGTVSeriesRepository A0B;
    public final UserRepository A0C;
    public final C47638L1x A0D;
    public final String A0E;
    public final boolean A0F;

    public static final void A00(C44537Jmh c44537Jmh, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        if (!c44537Jmh.A00) {
            c44537Jmh.A00 = true;
            AbstractC166987dD.A1Z(new PZO(interfaceC16660sJ, c44537Jmh, null, 17, z), AbstractC141776au.A00(c44537Jmh));
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.2GT, X.2GS] */
    public C44537Jmh(UserSession userSession, O39 o39, IGTVSeriesRepository iGTVSeriesRepository, UserRepository userRepository, C47638L1x c47638L1x, String str) {
        AbstractC25234BEr.A1R(o39, str, userRepository, iGTVSeriesRepository, c47638L1x);
        this.A05 = userSession;
        this.A06 = o39;
        this.A0E = str;
        this.A0C = userRepository;
        this.A0B = iGTVSeriesRepository;
        this.A0D = c47638L1x;
        this.A07 = new C38900HAw(EnumC39587Hdx.A0G, c47638L1x.A01, c47638L1x.A02);
        this.A0F = userSession.userId.equals(c47638L1x.A00);
        this.A04 = new C2GS();
        this.A03 = new C2GS();
        this.A02 = new C2GS();
        this.A01 = new C2GT(EnumC53150Nf5.A03);
        InterfaceC16660sJ interfaceC16660sJ = C47897LDr.A00;
        this.A09 = new C49508LuL((InterfaceC25681Mz) interfaceC16660sJ.invoke(userSession), C57452kK.class);
        this.A08 = new C49508LuL((InterfaceC25681Mz) interfaceC16660sJ.invoke(userSession), C3MC.class);
        this.A0A = new C49508LuL((InterfaceC25681Mz) interfaceC16660sJ.invoke(userSession), LYM.class);
    }
}
