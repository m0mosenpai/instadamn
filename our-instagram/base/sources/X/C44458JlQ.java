package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.JlQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44458JlQ extends C193578hc {
    public C05A A00;
    public final C2GT A01;
    public final C42221xC A02;
    public final C41761wQ A03;
    public final UserSession A04;
    public final KPB A05;
    public final KPU A06;
    public final C48519LdH A07;
    public final Integer A08;
    public final List A09;
    public final InterfaceC24731Iq A0A;
    public final InterfaceC19390xP A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final C05A A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44458JlQ(Application application, C12N c12n, C42221xC c42221xC, UserSession userSession, KPU kpu, C48519LdH c48519LdH, Integer num) {
        super(application);
        AbstractC167007dF.A1D(userSession, 1, kpu);
        C14360o3.A0B(num, 3);
        AbstractC25234BEr.A0k(4, c42221xC, c48519LdH, c12n, application);
        this.A04 = userSession;
        this.A06 = kpu;
        this.A08 = num;
        this.A02 = c42221xC;
        this.A07 = c48519LdH;
        this.A09 = AbstractC166987dD.A1E();
        C16930sl c16930sl = C16930sl.A00;
        this.A00 = C10E.A00(c16930sl);
        this.A03 = new C41761wQ(null);
        this.A0E = AbstractC25235BEs.A1A(false);
        C008002u A00 = C10E.A00(null);
        this.A0D = A00;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A05;
        C3JM c3jm = InterfaceC24731Iq.A00;
        C24721Ip c24721Ip = new C24721Ip(C3JM.A00);
        this.A0A = c24721Ip;
        this.A0B = AbstractC07080Za.A03(c24721Ip);
        C008002u A1H = AbstractC25225BEi.A1H(new C47317KvS(false));
        this.A0F = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(new C47317KvS(true));
        this.A0C = A1H2;
        this.A0G = AbstractC25225BEi.A1H("");
        this.A05 = AbstractC46737Klu.A00(userSession);
        InterfaceC19390xP A15 = AbstractC43593JPy.A15(c12n, C10Q.A01(C50129MCd.A00, A1H, A00, this.A00, A1H2), 1705805791);
        this.A01 = AbstractC43594JPz.A0J(new C45032JwN(null, new C47317KvS(false), new C47317KvS(true), c16930sl), AbstractC141776au.A00(this), A15, C10I.A00);
    }

    public final void A0E(boolean z) {
        C0K8.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications start");
        this.A03.A02(this.A02.A0K(new C48357LaX(0, this, z)), C49736Ly5.A00);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A03.A01();
        this.A09.clear();
    }
}
