package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.DrN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31418DrN extends C03E implements InterfaceC16660sJ {
    public C31418DrN(Object obj) {
        super(1, obj, C31414DrJ.class, "showMediaSharedWithCloseFriendsDialog", "showMediaSharedWithCloseFriendsDialog(Lcom/instagram/feed/media/Media;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C38321qM c38321qM = (C38321qM) obj;
        C31414DrJ c31414DrJ = (C31414DrJ) AbstractC25229BEm.A0o(c38321qM, this);
        FragmentActivity fragmentActivity = c31414DrJ.A00;
        UserSession userSession = c31414DrJ.A02;
        C684436h c684436h = new C684436h(fragmentActivity, userSession);
        FRV frv = new FRV(fragmentActivity, c684436h, userSession);
        C55885OrZ c55885OrZ = new C55885OrZ(userSession, c38321qM);
        C35937Ftv c35937Ftv = new C35937Ftv(c684436h, c31414DrJ);
        frv.A02(null, c31414DrJ.A01, EnumC33409Epg.CLIPS_VIEWER, c55885OrZ, c35937Ftv, c31414DrJ.A03);
        return C0eB.A00;
    }
}
