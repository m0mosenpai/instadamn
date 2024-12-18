package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.store.ReplaceDirectMessageLoader;

/* renamed from: X.Jbg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43931Jbg implements C1NJ {
    public InterfaceC59502nt A00;
    public InterfaceC50476MQe A01;
    public C4AF A02;
    public final int A03;
    public final UserSession A04;

    public C43931Jbg(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36606324091917754L);
    }

    public final void A01(Context context, InterfaceC11380iw interfaceC11380iw, InterfaceC50476MQe interfaceC50476MQe, C45093JxN c45093JxN, C2EC c2ec, String str, String str2) {
        C14360o3.A0B(str2, 4);
        this.A01 = interfaceC50476MQe;
        if (c45093JxN.A0Z) {
            C49331LrP c49331LrP = new C49331LrP(context, interfaceC11380iw, interfaceC50476MQe, this, c45093JxN, c2ec);
            UserSession userSession = this.A04;
            String C7I = c2ec.C7I();
            if (C7I != null) {
                ReplaceDirectMessageLoader.A01(userSession, c49331LrP, C7I, str, str2);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        A00(this, c45093JxN, interfaceC11380iw.getModuleName());
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(interfaceC59502nt, 0);
        if (C14360o3.A0K(this.A00, interfaceC59502nt)) {
            this.A00 = null;
            InterfaceC50476MQe interfaceC50476MQe = this.A01;
            if (interfaceC50476MQe != null) {
                interfaceC50476MQe.DS0();
            }
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        C14360o3.A0B(interfaceC59502nt, 0);
        if (C14360o3.A0K(this.A00, interfaceC59502nt)) {
            this.A00 = null;
            InterfaceC50476MQe interfaceC50476MQe = this.A01;
            if (interfaceC50476MQe != null) {
                interfaceC50476MQe.DRV();
            }
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public static final void A00(C43931Jbg c43931Jbg, C45093JxN c45093JxN, String str) {
        ImageUrl imageUrl = c45093JxN.A04;
        boolean A1X = AbstractC167007dF.A1X(c45093JxN.A0B, EnumC40111tc.A0a);
        boolean A03 = AbstractC81033jX.A03(imageUrl);
        if (A1X) {
            if (!A03) {
                if (imageUrl != null) {
                    C1OG A0J = C25821No.A00().A0J(imageUrl, null);
                    A0J.A05 = c43931Jbg.A04;
                    InterfaceC59502nt A00 = A0J.A00();
                    c43931Jbg.A00 = A00;
                    A00.E7X();
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            UserSession userSession = c43931Jbg.A04;
            C75363a3 A002 = c45093JxN.A00();
            if (c45093JxN.A0R) {
                InterfaceC50476MQe interfaceC50476MQe = c43931Jbg.A01;
                if (interfaceC50476MQe != null && c45093JxN.A0H != null) {
                    interfaceC50476MQe.DS0();
                    return;
                }
                return;
            }
            C4AD c4ad = new C4AD(A002, str);
            c4ad.A02 = 5242880;
            C49682LxD c49682LxD = new C49682LxD(c43931Jbg, 0);
            c43931Jbg.A02 = c49682LxD;
            c4ad.A01(c49682LxD, c43931Jbg.A03);
            C4AG.A00(userSession).A01(c4ad);
            return;
        }
        if (A03) {
            return;
        }
        if (imageUrl != null) {
            C1OG A0J2 = C25821No.A00().A0J(imageUrl, null);
            A0J2.A05 = c43931Jbg.A04;
            A0J2.A02(c43931Jbg);
            InterfaceC59502nt A003 = A0J2.A00();
            c43931Jbg.A00 = A003;
            A003.E7X();
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
