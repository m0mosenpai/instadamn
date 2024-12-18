package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HDa extends AbstractC193068gm {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ JG4 A01;
    public final /* synthetic */ C688938a A02;
    public final /* synthetic */ C40990IDl A03;

    public HDa(AbstractC59962oe abstractC59962oe, JG4 jg4, C688938a c688938a, C40990IDl c40990IDl) {
        this.A03 = c40990IDl;
        this.A02 = c688938a;
        this.A00 = abstractC59962oe;
        this.A01 = jg4;
    }

    @Override // X.AbstractC192848gQ
    public final void A01() {
        this.A02.A00 = false;
    }

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        if (this.A03 != null) {
            C006802i.A0p.markerPoint(387850546, "bloks_request_failed");
            C006802i.A0p.markerEnd(387850546, (short) 3);
        }
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q c66246U5q = (C66246U5q) obj;
        C14360o3.A0B(c66246U5q, 0);
        if (this.A03 != null) {
            C006802i.A0p.markerPoint(387850546, "bloks_request_succeeded");
        }
        UserSession userSession = this.A02.A01;
        AbstractC59962oe abstractC59962oe = this.A00;
        C62862tP A03 = C62862tP.A03(abstractC59962oe, userSession, null);
        JG4 jg4 = this.A01;
        if (jg4 != null) {
            A03.A01.put(R.id.open_share_sheet_handler, jg4);
        }
        AbstractC10360h2 abstractC10360h2 = abstractC59962oe.mFragmentManager;
        if (!C06P.A00(abstractC10360h2) && C06P.A01(abstractC10360h2)) {
            AbstractC33787EwD.A00(A03, c66246U5q);
        }
    }
}
