package X;

import com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;

/* renamed from: X.7UL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7UL extends C7VI implements InterfaceC65626Tpm {
    public final AvatarPrivacySettingsRepository A00;
    public final AvatarStore A01;
    public final C7UM A02;
    public final AvatarReactionsRepository A03;

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onResume(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7UL(C7VG c7vg) {
        super(c7vg);
        UserSession userSession = c7vg.A00;
        C7UM c7um = new C7UM(userSession);
        AvatarReactionsRepository A00 = C7UN.A00(userSession);
        AvatarPrivacySettingsRepository A002 = AbstractC163657Uc.A00(userSession);
        AvatarStore A003 = C20Y.A00(userSession);
        C14360o3.A0B(A00, 3);
        C14360o3.A0B(A002, 4);
        C14360o3.A0B(A003, 5);
        this.A02 = c7um;
        this.A03 = A00;
        this.A00 = A002;
        this.A01 = A003;
    }
}
