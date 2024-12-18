package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.user.model.User;

/* renamed from: X.Mgw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51044Mgw extends AbstractC52922bZ {
    public C54805OJz A00;
    public String A01;
    public boolean A02;
    public AnonymousClass195 A03;
    public boolean A04;
    public final int A05;
    public final C55782hJ A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final C1810981l A09;
    public final C171617kr A0A;
    public final C99694dm A0B;
    public final C171537kj A0C;
    public final MonetizationRepository A0D;
    public final C23031Ai A0E;
    public final User A0F;
    public final C18A A0G;
    public final C37021nz A0H;
    public final InterfaceC24731Iq A0I;
    public final InterfaceC19390xP A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C05A A0P;
    public final C05A A0Q;
    public final C05A A0R;
    public final C05A A0S;
    public final C0UO A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final Context A0b;
    public final boolean A0c;

    private final void A00() {
        AbstractC25229BEm.A1R(this.A03);
        C54805OJz c54805OJz = this.A00;
        this.A03 = MSY.A0q(this, MV5.A00(this, AbstractC50522MSa.A1b(new C0UO[]{c54805OJz.A0A, this.A0Q, c54805OJz.A0J, c54805OJz.A0C, this.A0N, this.A0O, this.A0M, this.A0L, this.A0R, this.A0S, c54805OJz.A0H, c54805OJz.A0B, this.A0P}), 32));
    }

    public static final void A01(C3PO c3po, C51044Mgw c51044Mgw) {
        if (c3po != C3PO.A08) {
            C54805OJz c54805OJz = c51044Mgw.A00;
            C14360o3.A0B(c3po, 0);
            c54805OJz.A00.Egh(c3po);
            PZY.A02(c3po, c51044Mgw, AbstractC141776au.A00(c51044Mgw), 43);
            AbstractC166997dE.A1Y(c51044Mgw.A0M, c51044Mgw.A0W);
        }
    }

    public static final void A02(C51044Mgw c51044Mgw) {
        if (c51044Mgw.A0c) {
            c51044Mgw.A00 = C190298bn.A03.A00(c51044Mgw.A0b, c51044Mgw.A08).A01();
            c51044Mgw.A00();
        }
        if (!c51044Mgw.A04) {
            C57164PZi.A03(c51044Mgw, AbstractC141776au.A00(c51044Mgw), 44);
            A01((C3PO) c51044Mgw.A00.A0A.getValue(), c51044Mgw);
            c51044Mgw.A04 = true;
        }
    }

    public static final void A03(C51044Mgw c51044Mgw) {
        PZD.A02(c51044Mgw, AbstractC141776au.A00(c51044Mgw), 2);
        c51044Mgw.A0Q.Egh(MSY.A0Y());
        C05A c05a = c51044Mgw.A0L;
        Boolean A0a = AbstractC166997dE.A0a();
        c05a.Egh(A0a);
        c51044Mgw.A0N.Egh(A0a);
    }

    public C51044Mgw(Context context, C55782hJ c55782hJ, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, C171617kr c171617kr, C99694dm c99694dm, C171537kj c171537kj, MonetizationRepository monetizationRepository, C23031Ai c23031Ai, User user, C18A c18a, C37021nz c37021nz, C54805OJz c54805OJz, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        AbstractC167027dH.A0a(1, c54805OJz, monetizationRepository, c1810981l, context);
        AbstractC25229BEm.A1J(interfaceC11380iw, 6, c171537kj);
        AbstractC25234BEr.A1Q(c23031Ai, c18a, c99694dm);
        C14360o3.A0B(c171617kr, 15);
        this.A00 = c54805OJz;
        this.A0D = monetizationRepository;
        this.A09 = c1810981l;
        this.A0b = context;
        this.A08 = userSession;
        this.A07 = interfaceC11380iw;
        this.A0F = user;
        this.A05 = i;
        this.A0H = c37021nz;
        this.A0C = c171537kj;
        this.A06 = c55782hJ;
        this.A0E = c23031Ai;
        this.A0G = c18a;
        this.A0B = c99694dm;
        this.A0A = c171617kr;
        this.A0a = z;
        this.A0V = z2;
        this.A0Y = z3;
        this.A0U = z4;
        this.A0X = z5;
        this.A0Z = z6;
        this.A0W = z7;
        this.A0c = z8;
        this.A0Q = AbstractC25225BEi.A1H(MSY.A0Y());
        this.A0L = AbstractC25225BEi.A1H(false);
        this.A0P = MSY.A0u(0);
        this.A0N = AbstractC25225BEi.A1H(false);
        this.A0O = AbstractC25225BEi.A1H(false);
        this.A0M = AbstractC25225BEi.A1H(false);
        this.A0R = MSX.A0s(AbstractC167007dF.A1W(c171537kj.A00));
        this.A0S = C10E.A00(c171537kj.A00(userSession));
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A0I = c24721Ip;
        this.A0J = AbstractC07080Za.A03(c24721Ip);
        C008002u A00 = C10E.A00(null);
        this.A0K = A00;
        this.A0T = AbstractC208910l.A02(A00);
        A00();
    }
}
