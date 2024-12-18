package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;

/* renamed from: X.Eau, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32729Eau extends AbstractC32730Eaw {
    public final C05A A00;
    public final C05A A01;
    public final C0UO A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32729Eau(UserSession userSession, EnumC33329EoO enumC33329EoO) {
        super(userSession, enumC33329EoO);
        C14360o3.A0B(userSession, 1);
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A00 = A00;
        C008002u A002 = C10E.A00(c16930sl);
        this.A01 = A002;
        C15230pd A003 = C10Q.A00(new GSX(this, 1), this.A07, A00, A002);
        this.A02 = AbstractC208910l.A01(new FIV(EnumC33356Eop.A02, c16930sl), AbstractC141776au.A00(this), A003, C10I.A01);
        GSR.A02(this, AbstractC141776au.A00(this), 3);
    }

    @Override // X.AbstractC32730Eaw
    public final void A0G(EnumC33424Epv enumC33424Epv) {
        C14360o3.A0B(enumC33424Epv, 0);
        C05A c05a = this.A00;
        C16930sl c16930sl = C16930sl.A00;
        c05a.Egh(c16930sl);
        this.A01.Egh(c16930sl);
        ((ChannelDiscoveryViewModel) this).A01 = AbstractC167007dF.A1X(enumC33424Epv, EnumC33424Epv.A06);
        super.A0G(enumC33424Epv);
    }
}
