package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.immersivemedia.PostCaptureImmersivePhotoViewModel$enabled$1;

/* renamed from: X.8Ec, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183968Ec extends AbstractC61152qd implements C8BD {
    public InterfaceC143326dX A00;
    public final C2GT A01;
    public final UserSession A02;
    public final C1810981l A03;
    public final C1816783z A04;
    public final InterfaceC1810081c A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C0UO A0A;
    public final C0UO A0B;
    public final C0UO A0C;

    public C183968Ec(UserSession userSession, C1810981l c1810981l, C1816783z c1816783z, InterfaceC1810081c interfaceC1810081c) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c1816783z, 2);
        C14360o3.A0B(interfaceC1810081c, 3);
        C14360o3.A0B(c1810981l, 4);
        this.A02 = userSession;
        this.A04 = c1816783z;
        this.A05 = interfaceC1810081c;
        this.A03 = c1810981l;
        C008002u A00 = C10E.A00(null);
        this.A07 = A00;
        C008002u c008002u = new C008002u(true);
        this.A09 = c008002u;
        this.A0C = c008002u;
        C008002u c008002u2 = new C008002u(false);
        this.A06 = c008002u2;
        AnonymousClass059 A01 = AbstractC208910l.A01(false, AbstractC141776au.A00(this), C10Q.A00(new PostCaptureImmersivePhotoViewModel$enabled$1(this, null), A00, c008002u, c008002u2), C10I.A00);
        this.A0A = A01;
        this.A01 = AbstractC58232lf.A00(AnonymousClass191.A00, A01);
        C008002u c008002u3 = new C008002u(false);
        this.A08 = c008002u3;
        this.A0B = c008002u3;
    }

    @Override // X.C8BD
    public final boolean onBackPressed() {
        C05A c05a = this.A08;
        if (!((Boolean) c05a.getValue()).booleanValue()) {
            return false;
        }
        c05a.Egh(false);
        this.A05.E4u(new Object());
        return true;
    }
}
