package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187358Sd extends C193578hc {
    public int A00;
    public int A01;
    public C115475Kh A02;
    public boolean A03;
    public boolean A04;
    public final C2GS A05;
    public final C2GS A06;
    public final C2GS A07;
    public final UserSession A08;
    public final C05A A09;
    public final C0UO A0A;
    public final C2GT A0B;
    public final C2GT A0C;
    public final C58252li A0D;
    public final InterfaceC16660sJ A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.2GT, X.2GS] */
    public C187358Sd(Application application, C2GT c2gt, C2GT c2gt2, UserSession userSession) {
        super(application);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c2gt, 3);
        C14360o3.A0B(c2gt2, 4);
        this.A08 = userSession;
        this.A0B = c2gt;
        this.A0C = c2gt2;
        C008002u c008002u = new C008002u(new C206189Bb());
        this.A09 = c008002u;
        AnonymousClass059 A02 = AbstractC208910l.A02(c008002u);
        this.A0A = A02;
        this.A07 = new C2GS();
        this.A06 = new C2GS();
        C58252li c58252li = new C58252li();
        this.A0D = c58252li;
        ?? c2gt3 = new C2GT(C193588hd.A00);
        this.A05 = c2gt3;
        C9EL c9el = new C9EL(this, 6);
        this.A0E = c9el;
        c2gt.A09(new C187388Sg(c9el));
        c58252li.A0E(c2gt2, new C187388Sg(new C9EL(this, 4)));
        c58252li.A0E(AbstractC58232lf.A00(AnonymousClass191.A00, A02), new C187388Sg(new C9EL(this, 5)));
        c2gt3.A09(new C187388Sg(c9el));
    }

    public final void A0G(AbstractC187378Sf abstractC187378Sf) {
        C14360o3.A0B(abstractC187378Sf, 0);
        if (!abstractC187378Sf.equals(A0E())) {
            C05A c05a = this.A09;
            AbstractC187378Sf abstractC187378Sf2 = (AbstractC187378Sf) ((C206189Bb) c05a.getValue()).A00;
            boolean z = ((C206189Bb) c05a.getValue()).A01;
            C14360o3.A0B(abstractC187378Sf2, 1);
            c05a.Egh(new C206189Bb(abstractC187378Sf, abstractC187378Sf2, z));
        }
    }

    public final AbstractC187378Sf A0E() {
        return (AbstractC187378Sf) ((C206189Bb) this.A0A.getValue()).A00;
    }

    public final void A0F(int i, Integer num) {
        this.A07.A0B(new C8A8(new Object()));
        if (num == C05F.A00) {
            this.A01 = i;
        } else {
            this.A00 = i;
        }
        A00(this);
    }

    public final void A0H(C115475Kh c115475Kh) {
        Object obj;
        this.A02 = c115475Kh;
        C2GS c2gs = this.A05;
        if (c115475Kh != null) {
            obj = new C8ZT(AbstractC226979zt.A00(c115475Kh));
        } else {
            obj = C193588hd.A00;
        }
        c2gs.A0B(obj);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C2GT c2gt = this.A0B;
        InterfaceC16660sJ interfaceC16660sJ = this.A0E;
        c2gt.A08(new C187388Sg(interfaceC16660sJ));
        this.A05.A08(new C187388Sg(interfaceC16660sJ));
    }

    public static final void A00(C187358Sd c187358Sd) {
        Integer num;
        AbstractC187378Sf A0E = c187358Sd.A0E();
        C87J c87j = (C87J) c187358Sd.A0C.A02();
        if (A0E != null && c87j != null) {
            if (c187358Sd.A04) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            int CFM = c87j.CFM();
            int Bdt = c87j.Bdt();
            if (A0E instanceof AbstractC187488Sq) {
                CFM -= c187358Sd.A01;
                C115475Kh c115475Kh = c187358Sd.A02;
                if (c115475Kh != null) {
                    Bdt = (int) ((c187358Sd.A00 - r1) / Math.abs(c115475Kh.A00));
                }
            }
            c187358Sd.A0D.A0A(new C9BQ(num, Math.max(CFM, 0), Bdt, 0));
        }
    }

    public final boolean A0I() {
        AbstractC187378Sf A0E = A0E();
        if ((A0E instanceof C52410NHg) && ((C52410NHg) A0E).A01) {
            return true;
        }
        return false;
    }
}
