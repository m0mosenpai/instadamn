package X;

import java.util.Map;

/* renamed from: X.8ec, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191808ec {
    public final /* bridge */ /* synthetic */ void A00(InterfaceC191788ea interfaceC191788ea, String str, String str2, Map map) {
        C003701c c003701c;
        AbstractC12990ll abstractC12990ll = ((C191778eZ) interfaceC191788ea).A00;
        C14360o3.A0B(abstractC12990ll, 0);
        C192028ey c192028ey = (C192028ey) abstractC12990ll.A01(C192028ey.class, C192038ez.A00);
        String A0R = AnonymousClass001.A0R(AbstractC191888ek.A00(map, str, str2), "loading_screen_query");
        C14360o3.A0B(A0R, 0);
        C191948eq c191948eq = c192028ey.A02;
        synchronized (c191948eq) {
            c003701c = c192028ey.A00;
            c003701c.A03(A0R);
        }
        String A0R2 = AnonymousClass001.A0R(AbstractC191888ek.A00(map, str, str2), "loaded_screen_query");
        C14360o3.A0B(A0R2, 0);
        synchronized (c191948eq) {
            c003701c.A03(A0R2);
        }
    }
}
