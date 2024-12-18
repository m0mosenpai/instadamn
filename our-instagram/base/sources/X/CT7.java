package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CT7 {
    public final C26913BuG A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C05A A03;
    public final C05A A04;
    public final Context A05;
    public final AbstractC018607g A06;
    public final C28142Cap A07;

    public CT7(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C28142Cap c28142Cap, String str) {
        AbstractC167017dG.A1T(abstractC018607g, c28142Cap);
        this.A05 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A06 = abstractC018607g;
        this.A07 = c28142Cap;
        this.A00 = new C26913BuG(context, abstractC018607g, new C29107CsY(this, str), interfaceC11380iw, userSession, 2);
        this.A03 = AbstractC25225BEi.A1H(AbstractC166997dE.A0a());
        this.A04 = AbstractC25235BEs.A1A(true);
    }
}
