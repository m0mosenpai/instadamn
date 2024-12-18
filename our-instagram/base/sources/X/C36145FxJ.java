package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FxJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36145FxJ implements InterfaceC41501vz {
    public final /* synthetic */ C152336tJ A00;

    public C36145FxJ(C152336tJ c152336tJ) {
        this.A00 = c152336tJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.EtE] */
    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(551423432);
        C36103Fwd c36103Fwd = (C36103Fwd) obj;
        int A032 = C0f9.A03(-199557946);
        int i2 = c36103Fwd.A01;
        int i3 = c36103Fwd.A00;
        C152336tJ c152336tJ = this.A00;
        UserSession userSession = c152336tJ.A05;
        C33602EtE c33602EtE = (C33602EtE) userSession.A00(C33602EtE.class);
        if (c33602EtE != null && i3 == c33602EtE.A00 && i2 == c33602EtE.A01) {
            i = 492722439;
        } else {
            c152336tJ.A00 = i2;
            ?? obj2 = new Object();
            obj2.A01 = i2;
            obj2.A00 = i3;
            userSession.A04(C33602EtE.class, obj2);
            C152336tJ.A02(c152336tJ);
            i = -9191452;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-1351571427, A03);
    }
}
