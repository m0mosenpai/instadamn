package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Iyy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42946Iyy implements InterfaceC85683rx {
    public final C5KC A00;
    public final /* synthetic */ UserSession A01;

    public C42946Iyy(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = new C42987Izd(userSession, EnumC64222vh.A09);
    }

    @Override // X.InterfaceC85683rx
    public final Map Bbk(String str) {
        return this.A00.AUZ(str);
    }
}
