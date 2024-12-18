package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156066za implements InterfaceC156076zb {
    public final /* synthetic */ UserDetailTabController A00;
    public final /* synthetic */ boolean A01;

    public C156066za(UserDetailTabController userDetailTabController, boolean z) {
        this.A00 = userDetailTabController;
        this.A01 = z;
    }

    @Override // X.InterfaceC156076zb
    public final void DxC(int i, String str) {
        UserSession userSession = this.A00.A0L;
        boolean z = this.A01;
        C14360o3.A0B(userSession, 0);
        C006802i.A0p.markerStart(18290511);
        C006802i.A0p.markerAnnotate(18290511, "self_profile", z);
        C006802i.A0p.markerAnnotate(18290511, "update_count", i);
        C006802i.A0p.markerAnnotate(18290511, "update_reason", str);
    }
}
