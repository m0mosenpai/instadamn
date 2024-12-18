package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.2vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64252vk {
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C206839Do(this, 15));
    public final boolean A02;
    public final InterfaceC64212vg A03;
    public final InterfaceC64242vj A04;
    public final EnumC64222vh A05;

    public static final void A00(C64252vk c64252vk, EnumC64262vl enumC64262vl, Object obj, Object obj2, float f, long j, long j2) {
        InterfaceC64212vg interfaceC64212vg = c64252vk.A03;
        C9CQ AUX = interfaceC64212vg.AUX(obj, obj2);
        String obj3 = UUID.randomUUID().toString();
        C14360o3.A07(obj3);
        ((InterfaceC25391Lt) c64252vk.A01.getValue()).DVh(new C9BW(new C9C7(AUX, enumC64262vl, EnumC74603Ws.A03, AnonymousClass317.A0M, c64252vk.A05, obj3), interfaceC64212vg.AUY(enumC64262vl, obj, obj2, f, j, j2)));
    }

    public C64252vk(UserSession userSession, InterfaceC64212vg interfaceC64212vg, InterfaceC64242vj interfaceC64242vj, EnumC64222vh enumC64222vh) {
        this.A00 = userSession;
        this.A04 = interfaceC64242vj;
        this.A03 = interfaceC64212vg;
        this.A05 = enumC64222vh;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36317650750150087L);
        this.A02 = A06;
        if (!A06) {
            this.A01.getValue().hashCode();
        }
    }
}
