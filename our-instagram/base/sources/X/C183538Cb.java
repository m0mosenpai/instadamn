package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;

/* renamed from: X.8Cb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183538Cb extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC16820sZ A02;

    public C183538Cb(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(fragmentActivity, 2);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        return new ClipsCreationDraftViewModel(fragmentActivity, userSession, (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class), (C89P) new C52942bb(AbstractC183548Cd.A00(fragmentActivity, userSession), fragmentActivity).A00(C89P.class), C75L.A00(fragmentActivity, userSession), (C1828989k) new C52942bb(fragmentActivity).A00(C1828989k.class), AbstractC50653MXt.A00(fragmentActivity, userSession), this.A02);
    }
}
