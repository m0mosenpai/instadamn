package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2vm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64272vm implements InterfaceC43071ya {
    public final UserSession A00;
    public final C64252vk A01;
    public final EnumC64262vl A02;
    public final Map A03;
    public final Map A04;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        final long j;
        final float f;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                A00(c59062n7, interfaceC57162jr);
                Map map = this.A04;
                String str = c59062n7.A05;
                C82383m1 c82383m1 = (C82383m1) map.get(str);
                if (c82383m1 != null) {
                    j = c82383m1.A01(interfaceC57162jr);
                } else {
                    j = -1;
                }
                Map map2 = this.A03;
                Number number = (Number) map2.get(str);
                if (number != null) {
                    f = number.floatValue();
                } else {
                    f = -1.0f;
                }
                final C64252vk c64252vk = this.A01;
                final Object obj = c59062n7.A03;
                final Object obj2 = c59062n7.A04;
                final EnumC64262vl enumC64262vl = this.A02;
                final long currentTimeMillis = System.currentTimeMillis();
                C14360o3.A0B(enumC64262vl, 2);
                if (c64252vk.A02) {
                    AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.9jo
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super("signalManagerNewSignal", 577195361);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C64252vk c64252vk2 = C64252vk.this;
                            Object obj3 = obj;
                            Object obj4 = obj2;
                            C64252vk.A00(c64252vk2, enumC64262vl, obj3, obj4, f, j, currentTimeMillis);
                        }
                    });
                } else {
                    C64252vk.A00(c64252vk, enumC64262vl, obj, obj2, f, j, currentTimeMillis);
                }
                map.remove(str);
                map2.remove(str);
                return;
            }
            A00(c59062n7, interfaceC57162jr);
            return;
        }
        Map map3 = this.A04;
        String str2 = c59062n7.A05;
        map3.put(str2, new C82383m1());
        this.A03.put(str2, Float.valueOf(interfaceC57162jr.CGk(c59062n7)));
        final C64252vk c64252vk2 = this.A01;
        final Object obj3 = c59062n7.A03;
        final Object obj4 = c59062n7.A04;
        final EnumC64262vl enumC64262vl2 = this.A02;
        final long currentTimeMillis2 = System.currentTimeMillis();
        final float f2 = -1.0f;
        final long j2 = -1;
        C14360o3.A0B(enumC64262vl2, 2);
        if (c64252vk2.A02) {
            AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.9jo
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("signalManagerNewSignal", 577195361);
                }

                @Override // X.AbstractC18280vF
                public final void loggedRun() {
                    C64252vk c64252vk22 = C64252vk.this;
                    Object obj32 = obj3;
                    Object obj42 = obj4;
                    C64252vk.A00(c64252vk22, enumC64262vl2, obj32, obj42, f2, j2, currentTimeMillis2);
                }
            });
        } else {
            C64252vk.A00(c64252vk2, enumC64262vl2, obj3, obj4, -1.0f, -1L, currentTimeMillis2);
        }
    }

    public /* synthetic */ C64272vm(UserSession userSession, C64252vk c64252vk, EnumC64262vl enumC64262vl) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        this.A00 = userSession;
        this.A01 = c64252vk;
        this.A02 = enumC64262vl;
        this.A04 = hashMap;
        this.A03 = hashMap2;
    }

    private final void A00(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        float f;
        Map map = this.A04;
        String str = c59062n7.A05;
        C82383m1 c82383m1 = (C82383m1) map.get(str);
        if (c82383m1 != null) {
            c82383m1.A03(c59062n7, interfaceC57162jr);
        }
        Map map2 = this.A03;
        float CGk = interfaceC57162jr.CGk(c59062n7);
        Number number = (Number) map2.get(str);
        if (number != null) {
            f = number.floatValue();
        } else {
            f = -1.0f;
        }
        map2.put(str, Float.valueOf(Math.max(CGk, f)));
    }
}
