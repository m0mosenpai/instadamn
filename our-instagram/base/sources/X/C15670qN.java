package X;

import android.content.Context;

/* renamed from: X.0qN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15670qN {
    public static final void A00(InterfaceC15680qO interfaceC15680qO) {
        C14360o3.A0B(interfaceC15680qO, 0);
        C18150uz.A0C.remove(interfaceC15680qO);
    }

    public final synchronized C18150uz A01() {
        C18150uz c18150uz;
        A02();
        c18150uz = C18150uz.A09;
        if (c18150uz == null) {
            C14360o3.A0F("instance");
            throw C00O.createAndThrow();
        }
        return c18150uz;
    }

    public final synchronized void A02() {
        if (C18150uz.A09 == null) {
            Context context = AbstractC12290kX.A00;
            C14360o3.A07(context);
            C18150uz.A09 = new C18150uz(context);
        }
    }

    public final void A03(InterfaceC15680qO interfaceC15680qO) {
        C14360o3.A0B(interfaceC15680qO, 0);
        if (C18150uz.A0A && C18150uz.A0C.contains(interfaceC15680qO)) {
            return;
        }
        C18150uz.A0C.add(interfaceC15680qO);
    }
}
