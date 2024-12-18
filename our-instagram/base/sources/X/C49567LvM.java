package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.LvM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49567LvM implements MPC {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C145176gc A01;
    public final /* synthetic */ String A02;

    public C49567LvM(Fragment fragment, C145176gc c145176gc, String str) {
        this.A00 = fragment;
        this.A01 = c145176gc;
        this.A02 = str;
    }

    @Override // X.MPC
    public final void Dau() {
        Fragment fragment = this.A00;
        C145176gc c145176gc = this.A01;
        InterfaceC1119353f interfaceC1119353f = c145176gc.A17;
        UserSession userSession = c145176gc.A09;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        AbstractC47126KsL.A00(null, AbstractC167017dG.A0T("unlockable_sticker_type", EnumC46137Kbb.A02, AbstractC166987dD.A1L("unlockable_sticker_id", this.A02)), fragment, userSession, interfaceC1119353f);
    }
}
