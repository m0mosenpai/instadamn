package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;

/* renamed from: X.Mdi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50851Mdi extends C9U7 {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.C9U7
    public final AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str) {
        AbstractC167017dG.A1P(cls, c152406tQ);
        if (cls.isAssignableFrom(ClipsSharingDraftViewModel.class)) {
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A01;
            return new ClipsSharingDraftViewModel(c152406tQ, userSession, C75L.A00(fragmentActivity, userSession), new OVo(fragmentActivity, AbstractC018607g.A00(fragmentActivity), userSession), this.A02, C18U.A06(C06090Tz.A05, userSession, 36325643683640552L));
        }
        throw AbstractC166987dD.A12(AbstractC111324zv.A00(1841));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50851Mdi(FragmentActivity fragmentActivity, InterfaceC08430c6 interfaceC08430c6, UserSession userSession, String str) {
        super(null, interfaceC08430c6);
        AbstractC43594JPz.A1P(userSession, str);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = str;
    }
}
