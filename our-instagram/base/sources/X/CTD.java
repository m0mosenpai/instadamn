package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CTD {
    public final C26912BuF A00;
    public final C26913BuG A01;
    public final UserSession A02;
    public final String A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final Context A07;
    public final AbstractC018607g A08;
    public final InterfaceC11380iw A09;

    public CTD(Context context, AbstractC018607g abstractC018607g, C26912BuF c26912BuF, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        AbstractC167007dF.A1G(str, 1, abstractC018607g);
        this.A07 = context;
        this.A02 = userSession;
        this.A09 = interfaceC11380iw;
        this.A08 = abstractC018607g;
        this.A00 = c26912BuF;
        this.A03 = AbstractC166997dE.A0p(context, 2131973321);
        this.A05 = AbstractC25227BEk.A0z();
        this.A04 = AbstractC25225BEi.A1H(AbstractC166997dE.A0a());
        this.A06 = AbstractC25235BEs.A1A(true);
        C26913BuG c26913BuG = new C26913BuG(context, abstractC018607g, new C42165ImD(str), interfaceC11380iw, userSession, 1);
        this.A01 = c26913BuG;
        c26913BuG.A03(new C29109Csa(this, 2));
    }
}
