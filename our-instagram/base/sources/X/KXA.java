package X;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class KXA extends AbstractC33630Etg {
    public final Integer A00;
    public final Collection A01;
    public final /* synthetic */ LLk A02;

    public KXA(LLk lLk, Integer num, Collection collection) {
        this.A02 = lLk;
        this.A01 = collection;
        this.A00 = num;
    }

    @Override // X.AbstractC33630Etg
    public final void A00(C32071E6x c32071E6x, InterfaceC40821up interfaceC40821up, UserSession userSession) {
        if (this.A00 == C05F.A00) {
            LLk lLk = this.A02;
            Context context = lLk.A0Y;
            if (context != null) {
                FUF.A01(context, c32071E6x, userSession, null, this.A01.size(), false);
            }
            HashSet hashSet = lLk.A0v;
            Collection<?> collection = this.A01;
            hashSet.removeAll(collection);
            if (lLk.A0O) {
                LLk.A0A(ImmutableSet.A03(collection), lLk);
            }
            LLk.A0J(lLk);
        }
    }

    @Override // X.AbstractC33630Etg
    public final void A01(AbstractC115105If abstractC115105If, UserSession userSession) {
        LLk lLk = this.A02;
        if (lLk.A0b.isResumed()) {
            AbstractC46744Km1.A00(lLk.A0h, lLk.A0Y, abstractC115105If instanceof C115115Ig);
        }
    }
}
