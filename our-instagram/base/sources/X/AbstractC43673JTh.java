package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.graphql.IGDScheduledMessageMutationResponseImpl;

/* renamed from: X.JTh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43673JTh implements C2JL {
    public final UserSession A00;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        UserSession userSession = this.A00;
        if (!userSession.hasEnded()) {
            A01(userSession, th);
        }
    }

    public void A00(AnonymousClass436 anonymousClass436, UserSession userSession) {
        Object Bos;
        Boolean bool;
        C2JS A0k;
        Boolean bool2;
        C2JS A0k2;
        if (this instanceof C43672JTg) {
            C43672JTg c43672JTg = (C43672JTg) this;
            if (anonymousClass436 != null && (A0k2 = AbstractC25225BEi.A0k(anonymousClass436)) != null) {
                bool2 = AbstractC31174DnI.A0o(A0k2, "xig_direct_item_seen(data:$data,metadata:$metadata)", 0);
            } else {
                bool2 = null;
            }
            boolean A1b = AbstractC31177DnL.A1b(bool2);
            InterfaceC37261GbE interfaceC37261GbE = c43672JTg.A00;
            if (A1b) {
                interfaceC37261GbE.DUq(null, null);
                return;
            } else {
                interfaceC37261GbE.DUq(C114675Fx.A0c, null);
                return;
            }
        }
        if (this instanceof KYA) {
            KYA kya = (KYA) this;
            if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null) {
                bool = AbstractC31174DnI.A0o(A0k, "xig_direct_store_sticker_send(data:$data)", 0);
            } else {
                bool = null;
            }
            boolean A1b2 = AbstractC31177DnL.A1b(bool);
            InterfaceC37261GbE interfaceC37261GbE2 = kya.A00;
            if (A1b2) {
                interfaceC37261GbE2.DUq(null, null);
                return;
            } else {
                interfaceC37261GbE2.DUq(C114675Fx.A0c, null);
                return;
            }
        }
        KY9 ky9 = (KY9) this;
        if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
            C2JS c2js = (C2JS) Bos;
            C4OF c4of = C2JS.Companion;
            if (c2js.A03(IGDScheduledMessageMutationResponseImpl.XigIgdScheduledMessage.class, "xig_igd_scheduled_message(input:$input)", 2049528527) != null && c2js.A03(IGDScheduledMessageMutationResponseImpl.XigIgdScheduledMessage.class, "xig_igd_scheduled_message(input:$input)", 2049528527).getCoercedBooleanField(0, "success")) {
                ky9.A00.DUq(null, null);
                return;
            }
        }
        ky9.A00.DUq(C114675Fx.A0c, null);
    }

    public void A01(UserSession userSession, Throwable th) {
        InterfaceC37261GbE interfaceC37261GbE;
        if (this instanceof C43672JTg) {
            C14360o3.A0B(th, 1);
            interfaceC37261GbE = ((C43672JTg) this).A00;
        } else if (this instanceof KYA) {
            C14360o3.A0B(th, 1);
            interfaceC37261GbE = ((KYA) this).A00;
        } else {
            interfaceC37261GbE = ((KY9) this).A00;
        }
        interfaceC37261GbE.DUq(AbstractC35240FgZ.A03(th), null);
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass436 anonymousClass436 = (AnonymousClass436) obj;
        UserSession userSession = this.A00;
        if (!userSession.hasEnded()) {
            A00(anonymousClass436, userSession);
        }
    }

    public AbstractC43673JTh(UserSession userSession) {
        this.A00 = userSession;
    }
}
