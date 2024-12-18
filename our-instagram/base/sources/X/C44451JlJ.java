package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl;

/* renamed from: X.JlJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44451JlJ extends C193578hc {
    public final C25671My A00;
    public final UserSession A01;
    public final InterfaceC114705Ga A02;
    public final InterfaceC19390xP A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44451JlJ(Application application, C25671My c25671My, UserSession userSession, InterfaceC114705Ga interfaceC114705Ga) {
        super(application);
        AbstractC167027dH.A0a(1, application, userSession, c25671My, interfaceC114705Ga);
        this.A01 = userSession;
        this.A00 = c25671My;
        this.A02 = interfaceC114705Ga;
        FanClubContentPreviewInteractorImpl fanClubContentPreviewInteractorImpl = (FanClubContentPreviewInteractorImpl) interfaceC114705Ga;
        InterfaceC15070pN interfaceC15070pN = fanClubContentPreviewInteractorImpl.A08;
        InterfaceC15070pN interfaceC15070pN2 = fanClubContentPreviewInteractorImpl.A07;
        InterfaceC15070pN interfaceC15070pN3 = fanClubContentPreviewInteractorImpl.A06;
        this.A03 = C10Q.A00(new C57184PaK(this, null, 0), interfaceC15070pN, interfaceC15070pN2, interfaceC15070pN3);
        AbstractC25232BEp.A1J(this, new MC4(this, null, 12), new M9S(interfaceC15070pN2, 13));
        AbstractC25232BEp.A1J(this, new MC4(this, null, 13), new M9S(new C15430py(interfaceC15070pN3), 12));
    }
}
