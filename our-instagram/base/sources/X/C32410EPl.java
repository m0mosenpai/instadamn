package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.EPl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32410EPl extends C7E1 implements GXE, GWU {
    public final GWT A00;
    public final C32471ERx A01;
    public final ESI A02;
    public final ESH A03;
    public final ERX A04;
    public final List A05;

    @Override // X.GXE
    public final void D8G() {
    }

    public C32410EPl(Context context, GWT gwt, InterfaceC11380iw interfaceC11380iw, String str, String str2, String str3) {
        this.A00 = gwt;
        ERX erx = new ERX(context, this, interfaceC11380iw);
        this.A04 = erx;
        ESI esi = new ESI(context, str2 == null ? "" : str2);
        this.A02 = esi;
        ESH esh = new ESH(context, str == null ? "" : str, str3 == null ? "" : str3);
        this.A03 = esh;
        C32471ERx c32471ERx = new C32471ERx(context, this);
        this.A01 = c32471ERx;
        this.A05 = AbstractC166987dD.A1E();
        A0B(esh, erx, c32471ERx, esi);
    }
}
