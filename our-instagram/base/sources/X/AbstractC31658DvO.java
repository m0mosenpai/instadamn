package X;

import com.instagram.direct.store.InboxNetworkSource;

/* renamed from: X.DvO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31658DvO {
    public long A00;
    public AnonymousClass195 A01;
    public final C19L A02 = AbstractC167017dG.A0w(C12L.A00, 637518912);

    public final void A00() {
        AnonymousClass195 anonymousClass195 = this.A01;
        if ((anonymousClass195 != null && anonymousClass195.isActive()) || !(this instanceof C32731Eax)) {
            return;
        }
        C32731Eax c32731Eax = (C32731Eax) this;
        if (c32731Eax.A02 == null || !c32731Eax.A03) {
            return;
        }
        if (!C18U.A06(C06090Tz.A05, c32731Eax.A01, 36315846865194618L)) {
            return;
        }
        this.A01 = AbstractC25226BEj.A1L(new GSS(this, null, 15), this.A02);
    }

    public final void A01(C19L c19l) {
        if (this instanceof C31457Ds1) {
            ((InboxNetworkSource) ((C31457Ds1) this).A03.getValue()).A03();
            return;
        }
        C14360o3.A0B(c19l, 0);
        GSR gsr = new GSR(this, null, 7);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A01(num, anonymousClass191, gsr, c19l);
        AbstractC23641Du.A01(num, anonymousClass191, new GSR(this, null, 8), c19l);
    }

    public AbstractC31658DvO(long j) {
        this.A00 = j;
    }
}
