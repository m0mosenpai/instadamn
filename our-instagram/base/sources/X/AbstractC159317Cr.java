package X;

import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.7Cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC159317Cr implements C33I {
    public final int A00;

    @Override // X.C33I
    public final boolean Dtk(C5SW c5sw) {
        return false;
    }

    @Override // X.C33I
    public final void Dto(C5SW c5sw) {
    }

    @Override // X.C33I
    public final void Dtq(C5SW c5sw) {
        if (this instanceof C7D4) {
            C7D4 c7d4 = (C7D4) this;
            FRk fRk = new FRk(c7d4.A00, c7d4.A01);
            String str = c7d4.A05;
            C25531Mh A03 = C25531Mh.A03(fRk.A00);
            if (((AbstractC02600Aj) A03).A00.isSampled()) {
                A03.A0M(EnumC33511Erk.IMPRESSION, "action");
                A03.A0M(EnumC33506Erf.TOOLTIP, CacheBehaviorLogger.SOURCE);
                A03.A0M(EnumC33458Eqt.A02, "prompt_type");
                A03.A0R("open_thread_id", str);
                A03.Cht();
            }
        }
    }

    public AbstractC159317Cr(int i) {
        this.A00 = i;
    }
}
