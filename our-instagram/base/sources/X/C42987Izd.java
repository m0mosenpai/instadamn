package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Izd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42987Izd implements C5KC {
    public final C5KD A00;
    public final InterfaceC25391Lt A01;
    public final InterfaceC115345Ji A02;

    @Override // X.C5KC
    public final HashMap AUZ(String str) {
        return this.A00.A02(str, this.A01.EMt(this.A02));
    }

    public /* synthetic */ C42987Izd(UserSession userSession, EnumC64222vh enumC64222vh) {
        InterfaceC25391Lt A00 = C25361Lq.A00(userSession);
        C5KA c5ka = new C5KA(enumC64222vh);
        C5KD c5kd = new C5KD(userSession, null, "ad_and_netego_realtime_information", "organic_realtime_information");
        C14360o3.A0B(A00, 3);
        this.A01 = A00;
        this.A02 = c5ka;
        this.A00 = c5kd;
    }
}
