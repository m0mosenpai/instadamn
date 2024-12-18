package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8Jc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185118Jc extends AbstractC52922bZ {
    public C81J A00;
    public final UserSession A01;
    public final C185198Jk A02;
    public final C185158Jg A03;
    public final C05A A04;
    public final InterfaceC018407e A05;

    public C185118Jc(InterfaceC018407e interfaceC018407e, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC018407e, 2);
        this.A01 = userSession;
        this.A05 = interfaceC018407e;
        this.A04 = C10E.A00(C185128Jd.A00);
        this.A03 = (C185158Jg) new C52942bb(new C185148Jf(userSession), interfaceC018407e).A00(C185158Jg.class);
        this.A02 = (C185198Jk) new C52942bb(new C185188Jj(userSession), interfaceC018407e).A00(C185198Jk.class);
        C141796aw A00 = AbstractC141776au.A00(this);
        C206639Cu c206639Cu = new C206639Cu(this, null, 44);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A03(num, anonymousClass191, c206639Cu, A00);
        AbstractC23641Du.A03(num, anonymousClass191, new C206639Cu(this, null, 45), AbstractC141776au.A00(this));
    }

    public final void A00() {
        C05A c05a = this.A04;
        if (!C14360o3.A0K(c05a.getValue(), C185128Jd.A00)) {
            c05a.Egh(C9LF.A00);
        }
    }
}
