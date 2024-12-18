package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CTI {
    public final Context A00;
    public final C26913BuG A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;
    public final AbstractC018607g A09;
    public final C41683IdC A0A;
    public final C0UO A0B;

    public CTI(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41683IdC c41683IdC, String str) {
        AbstractC167017dG.A1T(abstractC018607g, c41683IdC);
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A09 = abstractC018607g;
        this.A0A = c41683IdC;
        this.A01 = new C26913BuG(context, abstractC018607g, new C29108CsZ(this, str), interfaceC11380iw, userSession, 3);
        C008002u A1H = AbstractC25225BEi.A1H(AbstractC166997dE.A0a());
        this.A04 = A1H;
        this.A07 = A1H;
        C008002u A1A = AbstractC25235BEs.A1A(true);
        this.A06 = A1A;
        this.A0B = A1A;
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A05 = A0z;
        this.A08 = A0z;
    }
}
