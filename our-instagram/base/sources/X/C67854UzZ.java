package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.UzZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67854UzZ extends AnonymousClass935 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67854UzZ(InterfaceC71948XBz interfaceC71948XBz, UserSession userSession, int i) {
        super(userSession);
        this.A00 = i;
        this.A01 = interfaceC71948XBz;
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(224595091);
                ((InterfaceC71948XBz) this.A01).onFailure(new Throwable());
                i = -1186123883;
                break;
            case 1:
                A03 = C0f9.A03(-1651366905);
                ((InterfaceC71948XBz) this.A01).onFailure(new Throwable());
                i = 1271437806;
                break;
            case 2:
                A03 = C0f9.A03(-1293481487);
                ((InterfaceC71948XBz) this.A01).onFailure(new Throwable());
                i = -2138023896;
                break;
            case 3:
                A03 = C0f9.A03(-647283204);
                ((InterfaceC71948XBz) this.A01).onFailure(new Throwable());
                i = 692571612;
                break;
            default:
                A03 = C0f9.A03(-2015193086);
                ((InterfaceC71948XBz) this.A01).onFailure(new Throwable());
                i = -709955885;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(410572476);
                int A032 = C0f9.A03(1341156221);
                ((InterfaceC71948XBz) this.A01).DqR(null, new C68736VbF((C67814Uyn) obj));
                C0f9.A0A(-1709771025, A032);
                i = 998773851;
                break;
            case 1:
                A03 = C0f9.A03(2008629769);
                int A033 = C0f9.A03(400477840);
                ((InterfaceC71948XBz) this.A01).DqR(null, WUR.A00);
                C0f9.A0A(1272945176, A033);
                i = -219305004;
                break;
            case 2:
                A03 = C0f9.A03(570978140);
                int A034 = C0f9.A03(1999188996);
                ((InterfaceC71948XBz) this.A01).DqR(null, WUS.A00);
                C0f9.A0A(-88275396, A034);
                i = -279487030;
                break;
            case 3:
                A03 = C0f9.A03(1129421505);
                C67836Uz9 c67836Uz9 = (C67836Uz9) obj;
                int A0G = AbstractC25231BEo.A0G(c67836Uz9, -2034645797);
                ((InterfaceC71948XBz) this.A01).DqR(null, new C68737VbG(c67836Uz9));
                C0f9.A0A(-733408844, A0G);
                i = 1066948068;
                break;
            default:
                A03 = C0f9.A03(-547267432);
                C67802Uyb c67802Uyb = (C67802Uyb) obj;
                int A0G2 = AbstractC25231BEo.A0G(c67802Uyb, 1519694973);
                ((InterfaceC71948XBz) this.A01).DqR(null, new C68738VbH(c67802Uyb));
                C0f9.A0A(2050569738, A0G2);
                i = -159141422;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
