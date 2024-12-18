package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.343, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass343 {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.344] */
    public static final AnonymousClass344 A00(final UserSession userSession, InterfaceC64212vg interfaceC64212vg, EnumC64222vh enumC64222vh) {
        final C64252vk c64252vk = new C64252vk(userSession, interfaceC64212vg, new C64232vi(), enumC64222vh);
        return new InterfaceC673231x(userSession, c64252vk) { // from class: X.344
            public final C64272vm A00;
            public final C64272vm A01;
            public final C64272vm A02;

            @Override // X.InterfaceC673231x
            public final void ABh(C59072n8 c59072n8) {
                C14360o3.A0B(c59072n8, 0);
                c59072n8.A00(this.A00);
            }

            @Override // X.InterfaceC673231x
            public final void ABj(C59072n8 c59072n8) {
                C14360o3.A0B(c59072n8, 0);
                c59072n8.A00(this.A01);
            }

            @Override // X.InterfaceC673231x
            public final void ABm(C59072n8 c59072n8) {
                C14360o3.A0B(c59072n8, 0);
                c59072n8.A00(this.A02);
            }

            {
                this.A01 = new C64272vm(userSession, c64252vk, EnumC64262vl.A04);
                this.A02 = new C64272vm(userSession, c64252vk, EnumC64262vl.A05);
                this.A00 = new C64272vm(userSession, c64252vk, EnumC64262vl.A03);
            }
        };
    }
}
