package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.JYa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43787JYa implements MRN {
    public final C42201xA A00;
    public final C42201xA A01;
    public final C6D2 A02;
    public final C6D2 A03;
    public final C5Fn A04;
    public final UserSession A05;
    public final C27F A06;
    public final JS8 A07;
    public final MSI A08;
    public final MSJ A09;
    public final AbstractC46972Dl A0A;
    public final C2DS A0B;
    public final C41951wl A0C;
    public final InterfaceC09390do A0D;
    public final Context A0E;

    @Override // X.MRN
    public final void Ead(int i) {
    }

    @Override // X.MRN
    public final void Efi(C4I3 c4i3) {
        C14360o3.A0B(c4i3, 0);
        this.A00.accept(c4i3);
    }

    public C43787JYa(Context context, C5Fn c5Fn, UserSession userSession, JS8 js8, AbstractC46972Dl abstractC46972Dl, C2DS c2ds, C4I3 c4i3, C41951wl c41951wl, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c2ds, 3);
        this.A0E = context;
        this.A05 = userSession;
        this.A0B = c2ds;
        this.A0C = c41951wl;
        this.A04 = c5Fn;
        this.A0A = abstractC46972Dl;
        this.A07 = js8;
        this.A02 = new C43597JQd(this, 27);
        this.A03 = new C43597JQd(this, 28);
        this.A0D = AbstractC09440dt.A01(new MHM(this, 38));
        this.A00 = AbstractC42021ws.A01(c4i3);
        this.A01 = AbstractC42021ws.A01(new C51761Mtk(abstractC46972Dl, AbstractC166997dE.A0a()));
        this.A08 = new C43947Jbw(context, (C42221xC) ((C2DU) c2ds).A0C.A0I.getValue(), c5Fn, userSession, abstractC46972Dl);
        this.A09 = new JSM(((C42221xC) this.A0D.getValue()).A0K(JST.A00), userSession, js8, abstractC46972Dl, z, z2, z3);
        this.A06 = C27D.A00(userSession);
    }

    @Override // X.MRN
    public final C42221xC AED() {
        return C43597JQd.A00(((C2DU) this.A0B).A0C.A09(EnumC46982Dm.A04), this, 26);
    }

    @Override // X.MRN
    public final C42221xC AVJ() {
        return this.A00.A0C();
    }

    @Override // X.MRN
    public final C42221xC AWK() {
        return this.A01.A0C();
    }

    @Override // X.MRN
    public final MSI B7D() {
        return this.A08;
    }

    @Override // X.MRN
    public final MSJ C7c() {
        return this.A09;
    }

    @Override // X.MRN
    public final C42221xC E41() {
        C46922Dg c46922Dg = ((C2DU) this.A0B).A0C;
        return c46922Dg.A08.A0O((C5Fn) c46922Dg.A0H.getValue());
    }

    @Override // X.MRN
    public final void EUg(C51761Mtk c51761Mtk) {
        this.A01.accept(c51761Mtk);
    }

    @Override // X.MRN
    public final C42221xC Eq6() {
        return ((C42221xC) this.A0D.getValue()).A0K(JSY.A00);
    }
}
