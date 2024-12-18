package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.JlP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44457JlP extends C193578hc {
    public InterfaceC41521w1 A00;
    public C05A A01;
    public final C2GT A02;
    public final C42221xC A03;
    public final C42221xC A04;
    public final C41761wQ A05;
    public final UserSession A06;
    public final KPU A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C12N A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44457JlP(Application application, C12N c12n, C42221xC c42221xC, C42221xC c42221xC2, UserSession userSession, KPU kpu) {
        super(application);
        AbstractC25233BEq.A0x(2, c42221xC, kpu, c12n);
        C14360o3.A0B(application, 6);
        this.A06 = userSession;
        this.A04 = c42221xC;
        this.A03 = c42221xC2;
        this.A07 = kpu;
        this.A0C = c12n;
        this.A05 = AbstractC31174DnI.A0S();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A05;
        C3JM c3jm = InterfaceC24731Iq.A00;
        C24721Ip c24721Ip = new C24721Ip(C3JM.A00);
        this.A08 = c24721Ip;
        this.A09 = AbstractC07080Za.A03(c24721Ip);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A0B = A1A;
        C16930sl c16930sl = C16930sl.A00;
        this.A01 = C10E.A00(c16930sl);
        C008002u A1H = AbstractC25225BEi.A1H(new C47318KvT(true));
        this.A0A = A1H;
        InterfaceC19390xP A15 = AbstractC43593JPy.A15(c12n, C10Q.A00(C50127MCb.A00, A1A, this.A01, A1H), 1705805791);
        this.A02 = AbstractC43594JPz.A0J(new C45022JwD(new C47318KvT(true), c16930sl, false), AbstractC141776au.A00(this), A15, C10I.A00);
    }

    public final void A0E(boolean z) {
        C0K8.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications start");
        this.A05.A02(this.A04.A0K(new C48357LaX(1, this, z)), C49738Ly7.A00);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A05.A01();
    }
}
