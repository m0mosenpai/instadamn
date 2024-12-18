package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.34A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C34A extends AbstractC64162vb {
    public final UserSession A00;
    public final C30W A01;
    public final InterfaceC60442pS A02;
    public final AbstractC61692rW A03;
    public final Context A04;

    public C34A(Context context, C1BX c1bx, UserSession userSession, C30W c30w, InterfaceC60442pS interfaceC60442pS, AbstractC61692rW abstractC61692rW) {
        super(c1bx, C34B.A00);
        this.A00 = userSession;
        this.A01 = c30w;
        this.A02 = interfaceC60442pS;
        this.A04 = context;
        this.A03 = abstractC61692rW;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        int position;
        C38321qM c38321qM = (C38321qM) obj;
        C75113Zb c75113Zb = (C75113Zb) obj2;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        Boolean valueOf = Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36311985687692115L));
        Boolean valueOf2 = Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36313424502589421L));
        if (!c75113Zb.A0p()) {
            C0w9.A03("OrganicImpressionEventAction:handleImpression", AnonymousClass001.A0R("position in media state is not set, media type is ", c38321qM.BRp().name()));
            position = -1;
        } else {
            position = c75113Zb.getPosition();
        }
        AbstractC61692rW abstractC61692rW = this.A03;
        if (abstractC61692rW != null && abstractC61692rW.A09(c75113Zb.A0o)) {
            abstractC61692rW.A06(c38321qM, c75113Zb.A03);
        }
        if (c75113Zb.A0o == AnonymousClass341.A0H) {
            C34H.A00(C05F.A0Y);
        }
        if (C3YV.A09(c38321qM)) {
            C34H.A00(C05F.A02);
            if (position == 0) {
                C34H.A00(C05F.A1I);
            }
        }
        int i = c75113Zb.A03;
        C82623mQ.A01(userSession, this.A01, c38321qM, this.A02, c75113Zb, valueOf, true, valueOf2, position, i);
    }
}
