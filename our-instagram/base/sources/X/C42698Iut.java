package X;

import android.view.View;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaControlSurfaceEnum;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iut, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42698Iut implements InterfaceC58152PqH {
    public final /* synthetic */ MediaControlEventSourceEnum A00;
    public final /* synthetic */ InterfaceC104934o6 A01;
    public final /* synthetic */ C690138n A02;
    public final /* synthetic */ C38321qM A03;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C42698Iut(MediaControlEventSourceEnum mediaControlEventSourceEnum, InterfaceC104934o6 interfaceC104934o6, C690138n c690138n, C38321qM c38321qM) {
        this.A02 = c690138n;
        this.A03 = c38321qM;
        this.A00 = mediaControlEventSourceEnum;
        this.A01 = interfaceC104934o6;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C690138n c690138n = this.A02;
        C38321qM c38321qM = this.A03;
        MediaControlEventSourceEnum mediaControlEventSourceEnum = this.A00;
        InterfaceC104934o6 interfaceC104934o6 = this.A01;
        UserSession userSession = c690138n.A01;
        AbstractC40625Hzj.A00(mediaControlEventSourceEnum, MediaControlSurfaceEnum.A07, c690138n.A02, userSession, c38321qM, c690138n.A04.getSessionId(), true);
        ((C37891Glm) c690138n.A05.getValue()).A00(c38321qM, C05F.A0N);
        if (interfaceC104934o6 != null) {
            c38321qM.A0C.EUN(interfaceC104934o6);
            c690138n.A03.AVK();
        }
    }
}
