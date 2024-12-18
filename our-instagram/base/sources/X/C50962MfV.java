package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.MfV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50962MfV extends AbstractC52922bZ {
    public String A00;
    public final IGRevShareProductType A01;
    public final UserSession A02;
    public final O8N A03;
    public final XDu A04;
    public final C65974TxR A05;
    public final InterfaceC169467hM A06;
    public final InterfaceC169497hP A07;
    public final String A08;
    public final InterfaceC09390do A09;
    public final InterfaceC24731Iq A0A;
    public final InterfaceC19390xP A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C0UO A0E;

    public /* synthetic */ C50962MfV(IGRevShareProductType iGRevShareProductType, UserSession userSession, O8N o8n, String str) {
        C169487hO c169487hO = new C169487hO();
        AbstractC167017dG.A1P(userSession, iGRevShareProductType);
        this.A02 = userSession;
        this.A01 = iGRevShareProductType;
        this.A08 = str;
        this.A03 = o8n;
        this.A07 = c169487hO;
        this.A0C = AbstractC25235BEs.A1A(false);
        Integer num = C05F.A00;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A0A = c24721Ip;
        this.A0B = AbstractC07080Za.A03(c24721Ip);
        C008002u A00 = C10E.A00(NRC.A00);
        this.A0D = A00;
        this.A0E = AbstractC208910l.A02(A00);
        this.A09 = C57509Pfj.A00(this, 45);
        C56712PFe c56712PFe = new C56712PFe(this);
        this.A06 = c56712PFe;
        this.A05 = AbstractC65980TxZ.A00(userSession, null, c56712PFe, null, c169487hO, num, 200L, 200L, false, false);
        this.A04 = new C56710PFc(this, 4);
        C141796aw A002 = AbstractC141776au.A00(this);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new PZG(this, (InterfaceC23621Ds) null, 47), A002);
    }
}
