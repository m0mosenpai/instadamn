package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.NZe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52821NZe extends PJ0 implements InterfaceC58172Pqc {
    public C56803PIu A00;
    public AbstractC110824yu A01;
    public AnonymousClass195 A02;
    public final AbstractC52865NaM A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    public AbstractC52821NZe(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg, AbstractC52865NaM abstractC52865NaM) {
        super(view, abstractC59962oe, userSession, enumC142806cg, abstractC52865NaM);
        this.A03 = abstractC52865NaM;
        this.A04 = C57547PgL.A00(view, 3);
        this.A05 = AbstractC09440dt.A01(new C57547PgL(this, 4));
        this.A01 = new C110814yt(super.A03.getContext());
    }

    public void A06() {
        C2GT c2gt = this.A09.A02;
        AbstractC59962oe abstractC59962oe = super.A04;
        AbstractC37301Gc2.A0w(abstractC59962oe.getViewLifecycleOwner(), c2gt, C57755Pji.A02(this, 1), 18);
        AbstractC37301Gc2.A0w(abstractC59962oe.getViewLifecycleOwner(), this.A03.A04, C57755Pji.A02(this, 2), 19);
    }

    public void A07() {
        AnonymousClass195 anonymousClass195 = super.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        super.A00 = null;
        this.A06.onStop();
        AnonymousClass195 anonymousClass1952 = this.A02;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        this.A02 = null;
    }

    public void A08() {
        if (super.A00 == null) {
            super.A00 = AbstractC18560vj.A03(AbstractC25235BEs.A0S(super.A04), C57167PZl.A02(this, this.A09.A0C, 9));
        }
        C3I9 c3i9 = this.A06;
        AbstractC59962oe abstractC59962oe = super.A04;
        MSX.A17(abstractC59962oe, c3i9);
        if (this.A02 == null) {
            this.A02 = AbstractC50522MSa.A0s(abstractC59962oe, C57167PZl.A01(this, null, 10), this.A03.A0C);
        }
    }
}
