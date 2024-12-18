package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.UzY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67853UzY extends AnonymousClass935 {
    public final /* synthetic */ C53S A00;
    public final /* synthetic */ C3G2 A01;
    public final /* synthetic */ InterfaceC63982vJ A02;
    public final /* synthetic */ C38E A03;
    public final /* synthetic */ C3Ow A04;
    public final /* synthetic */ C66151U1s A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67853UzY(C53S c53s, UserSession userSession, C3G2 c3g2, InterfaceC63982vJ interfaceC63982vJ, C38E c38e, C3Ow c3Ow, C66151U1s c66151U1s) {
        super(userSession);
        this.A05 = c66151U1s;
        this.A00 = c53s;
        this.A04 = c3Ow;
        this.A02 = interfaceC63982vJ;
        this.A03 = c38e;
        this.A01 = c3g2;
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(890565646);
        C105824pt c105824pt = (C105824pt) obj;
        int A032 = C0f9.A03(891810700);
        AbstractC167017dG.A1N(userSession, c105824pt);
        super.A05(userSession, c105824pt);
        C1OU c1ou = C1OU.$redex_init_class;
        ReelStore A033 = ReelStore.A03(userSession);
        C14360o3.A07(A033);
        Reel A0G = A033.A0G(c105824pt);
        C66151U1s c66151U1s = this.A05;
        C53S c53s = this.A00;
        C3Ow c3Ow = this.A04;
        C66151U1s.A01(c53s, A0G, this.A01, this.A02, this.A03, c3Ow, null, c66151U1s);
        C0f9.A0A(-1710134439, A032);
        C0f9.A0A(1283495732, A03);
    }
}
