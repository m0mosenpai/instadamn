package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.CSz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27940CSz {
    public final HBY A00;
    public final C05A A01;
    public final C05A A02;
    public final Context A03;
    public final AbstractC018607g A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;

    public C27940CSz(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(abstractC018607g, 4);
        this.A03 = context;
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A04 = abstractC018607g;
        this.A01 = AbstractC25227BEk.A0z();
        this.A02 = AbstractC25235BEs.A1A(false);
        HBY hby = new HBY(context, abstractC018607g, interfaceC11380iw, userSession);
        this.A00 = hby;
        hby.A03(new C29109Csa(this, 0));
    }
}
