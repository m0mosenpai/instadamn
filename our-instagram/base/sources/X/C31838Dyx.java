package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Dyx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31838Dyx extends AbstractC52922bZ {
    public C50679MYx A00;
    public C50679MYx A01;
    public C50679MYx A02;
    public EnumC33373Ep6 A03;
    public AbstractC34695FQg A04;
    public String A05;
    public String A06;
    public String A07;
    public final UserSession A08;
    public final C33091Eir A09;
    public final C34702FQn A0A;
    public final InterfaceC24731Iq A0B;
    public final InterfaceC19390xP A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C0UO A0F;
    public final C0UO A0G;

    public C31838Dyx(UserSession userSession, C33091Eir c33091Eir) {
        C14360o3.A0B(c33091Eir, 2);
        this.A08 = userSession;
        this.A09 = c33091Eir;
        this.A03 = EnumC33373Ep6.A0L;
        C008002u A00 = C10E.A00(C32795Ebz.A00);
        this.A0D = A00;
        this.A0F = AbstractC208910l.A02(A00);
        C008002u A002 = C10E.A00(C32805Ec9.A00);
        this.A0E = A002;
        this.A0G = AbstractC208910l.A02(A002);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A05;
        C3JM c3jm = InterfaceC24731Iq.A00;
        C24721Ip c24721Ip = new C24721Ip(C3JM.A00);
        this.A0B = c24721Ip;
        this.A0C = AbstractC07080Za.A03(c24721Ip);
        this.A0A = new C34702FQn(this);
        GSR.A02(this, AbstractC141776au.A00(this), 30);
    }

    public static final void A00(C31838Dyx c31838Dyx, int i) {
        AbstractC166987dD.A1Z(new C57155PYz(c31838Dyx, null, i, 21), AbstractC141776au.A00(c31838Dyx));
    }
}
