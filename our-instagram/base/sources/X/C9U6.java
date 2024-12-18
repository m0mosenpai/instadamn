package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;

/* renamed from: X.9U6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9U6 extends AbstractC52922bZ implements C8BD {
    public int A00;
    public C22P A01;
    public InterfaceC185638Lg A02;
    public InterfaceC143326dX A03;
    public final AnonymousClass830 A04;
    public final C142246bh A05;
    public final C8LB A06;
    public final UserSession A07;
    public final C1810981l A08;
    public final A5T A09;
    public final InterfaceC24731Iq A0A;

    public final void A00() {
        AbstractC191638eL.A00.Egh(null);
        this.A06.A00.A00().ETb(null);
        AbstractC166987dD.A1Z(new MBT(this, null, 49), AbstractC141776au.A00(this));
        InterfaceC185638Lg interfaceC185638Lg = this.A02;
        if (interfaceC185638Lg != null) {
            interfaceC185638Lg.DZr(null);
        }
    }

    public final void A01(CameraAREffect cameraAREffect) {
        AbstractC191638eL.A00.Egh(cameraAREffect);
        A5T a5t = this.A09;
        C81U c81u = C81U.A00;
        AnonymousClass229.A01(a5t.A00).A11(AbstractC191238dS.A00(c81u), null, cameraAREffect.A0K, cameraAREffect.A0M, cameraAREffect.A0I, 0, 1, cameraAREffect.CcN());
        this.A04.Emx(this.A01, c81u, cameraAREffect, AbstractC166997dE.A0t(this.A07), "mini_gallery_select_effect");
        C25024B5f.A02(this, AbstractC141776au.A00(this), 0);
        C8LB c8lb = this.A06;
        AbstractC18560vj.A03(AbstractC141776au.A00(this), new C15340po(new MBT(this, null, 48), C0JE.A00(new C9D3(c8lb, null, 18))));
        c8lb.A00.A00().ETb(cameraAREffect);
        InterfaceC185638Lg interfaceC185638Lg = this.A02;
        if (interfaceC185638Lg != null) {
            interfaceC185638Lg.DZr(cameraAREffect);
        }
    }

    @Override // X.C8BD
    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }

    public C9U6(C22P c22p, AnonymousClass830 anonymousClass830, C142246bh c142246bh, C8LB c8lb, UserSession userSession, C1810981l c1810981l, A5T a5t) {
        AbstractC167017dG.A1R(c8lb, c142246bh);
        C14360o3.A0B(anonymousClass830, 6);
        this.A07 = userSession;
        this.A06 = c8lb;
        this.A05 = c142246bh;
        this.A08 = c1810981l;
        this.A09 = a5t;
        this.A04 = anonymousClass830;
        this.A01 = c22p;
        this.A00 = -1;
        this.A0A = new C24721Ip(0);
    }
}
