package X;

import android.app.Activity;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Dqx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31393Dqx implements InterfaceC42271xH {
    public final /* synthetic */ UserDetailFragment A00;

    public C31393Dqx(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        throw AbstractC166987dD.A15("userId");
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1333583424);
        int A032 = C0f9.A03(664691178);
        Activity rootActivity = this.A00.getRootActivity();
        if (!rootActivity.isFinishing()) {
            C3DN A0r = AbstractC31172DnG.A0r(rootActivity);
            if (A0r != null) {
                C3DP c3dp = (C3DP) A0r;
                if (c3dp.A0h) {
                    A0r.A0R(new C33171EkI(1, rootActivity, this));
                    if (!c3dp.A0b) {
                        A0r.A0B();
                    }
                }
            }
            rootActivity.onBackPressed();
        }
        C0f9.A0A(2071869336, A032);
        C0f9.A0A(1768357135, A03);
    }
}
