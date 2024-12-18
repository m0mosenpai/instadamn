package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CTC {
    public final C26913BuG A00;
    public final C05A A01;
    public final C05A A02;
    public final C05A A03;
    public final C05A A04;
    public final Context A05;
    public final AbstractC018607g A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.5R5] */
    public CTC(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(abstractC018607g, 4);
        this.A05 = context;
        this.A08 = userSession;
        this.A07 = interfaceC11380iw;
        this.A06 = abstractC018607g;
        this.A03 = C10E.A00(null);
        this.A01 = C10E.A00(null);
        this.A02 = AbstractC25235BEs.A1A(false);
        this.A04 = AbstractC25235BEs.A1A(true);
        C26913BuG c26913BuG = new C26913BuG(context, abstractC018607g, new Object(), interfaceC11380iw, userSession, 0);
        this.A00 = c26913BuG;
        c26913BuG.A03(new C29109Csa(this, 1));
    }
}
