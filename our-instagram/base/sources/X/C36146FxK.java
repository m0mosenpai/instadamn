package X;

import android.content.ComponentCallbacks2;
import com.instagram.ui.swipenavigation.PositionConfig;

/* renamed from: X.FxK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36146FxK implements InterfaceC41501vz {
    public final /* synthetic */ C53I A00;

    public C36146FxK(C53I c53i) {
        this.A00 = c53i;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        InterfaceC53892dT interfaceC53892dT;
        int A03 = C0f9.A03(1588944370);
        C36060Fvw c36060Fvw = (C36060Fvw) obj;
        int A032 = C0f9.A03(-973085692);
        C14360o3.A0B(c36060Fvw, 0);
        C53I c53i = this.A00;
        InterfaceC53722dB interfaceC53722dB = (InterfaceC53722dB) AbstractC31469DsD.A00(c53i.A02);
        if (interfaceC53722dB != null) {
            interfaceC53722dB.EfI(C1QO.A0C);
        }
        ComponentCallbacks2 rootActivity = c53i.getRootActivity();
        if ((rootActivity instanceof InterfaceC53892dT) && (interfaceC53892dT = (InterfaceC53892dT) rootActivity) != null) {
            interfaceC53892dT.FBp(new PositionConfig(null, null, null, AbstractC111324zv.A00(1120), c36060Fvw.A01, null, null, c36060Fvw.A02, null, null, null, null, null, -1.0f, c36060Fvw.A00, true));
        }
        C0f9.A0A(-257880644, A032);
        C0f9.A0A(-1808372979, A03);
    }
}
