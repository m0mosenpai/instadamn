package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "This class doesn't separate ViewModel and View layer concerns. It also has unclear scoping/time of initialization which could lead to bugs.", replaceWith = @ReplaceWith(expression = "MainFeedViewLayerDependencyProvider", imports = {}))
/* renamed from: X.3K3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3K3 {
    public C3K4 A00;
    public C41116IIh A01;
    public final InterfaceC26681Qx A02;
    public final C60802q4 A03;
    public final ViewOnTouchListenerC60632pm A04;
    public final UserSession A05;
    public final C3K0 A06;
    public final C3BV A07;
    public final C1EN A08;
    public final C69453Af A09;
    public final C61602rN A0A;
    public final C61442r7 A0B;
    public final C71723Jv A0C;
    public final C61572rK A0D;
    public final C3FY A0E;
    public final C61382r1 A0F;
    public final C71743Jx A0G;
    public final C61842rl A0H;
    public final C60862qA A0I;
    public final C60662pp A0J;
    public final C69703Be A0K;
    public final C685736u A0L;
    public final C61832rk A0M;

    public C3K3(InterfaceC26681Qx interfaceC26681Qx, C60802q4 c60802q4, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, UserSession userSession, C3K0 c3k0, C3BV c3bv, C1EN c1en, C69453Af c69453Af, C61602rN c61602rN, C61442r7 c61442r7, C71723Jv c71723Jv, C61572rK c61572rK, C3FY c3fy, C61382r1 c61382r1, C71743Jx c71743Jx, C61842rl c61842rl, C60862qA c60862qA, C60662pp c60662pp, C69703Be c69703Be, C685736u c685736u, C61832rk c61832rk) {
        C14360o3.A0B(c60862qA, 1);
        C14360o3.A0B(c61382r1, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(c71723Jv, 4);
        C14360o3.A0B(c61842rl, 11);
        C14360o3.A0B(c60802q4, 13);
        C14360o3.A0B(c1en, 17);
        C14360o3.A0B(c61572rK, 19);
        this.A0I = c60862qA;
        this.A0F = c61382r1;
        this.A05 = userSession;
        this.A0C = c71723Jv;
        this.A07 = c3bv;
        this.A04 = viewOnTouchListenerC60632pm;
        this.A09 = c69453Af;
        this.A0J = c60662pp;
        this.A0E = c3fy;
        this.A0L = c685736u;
        this.A0H = c61842rl;
        this.A0B = c61442r7;
        this.A03 = c60802q4;
        this.A0G = c71743Jx;
        this.A06 = c3k0;
        this.A02 = interfaceC26681Qx;
        this.A08 = c1en;
        this.A0K = c69703Be;
        this.A0D = c61572rK;
        this.A0A = c61602rN;
        this.A0M = c61832rk;
    }

    public final C3K4 A00() {
        C3K4 c3k4 = this.A00;
        if (c3k4 == null) {
            UserSession userSession = this.A05;
            C60862qA c60862qA = this.A0I;
            C71723Jv c71723Jv = this.A0C;
            C3FY c3fy = this.A0E;
            C61382r1 c61382r1 = this.A0F;
            C69453Af c69453Af = this.A09;
            C60662pp c60662pp = this.A0J;
            C61842rl c61842rl = this.A0H;
            C61442r7 c61442r7 = this.A0B;
            C60802q4 c60802q4 = this.A03;
            C71743Jx c71743Jx = this.A0G;
            C3K0 c3k0 = this.A06;
            C3BV c3bv = this.A07;
            InterfaceC26681Qx interfaceC26681Qx = this.A02;
            C1EN c1en = this.A08;
            C69703Be c69703Be = this.A0K;
            C3K4 c3k42 = new C3K4(interfaceC26681Qx, c60802q4, this.A04, userSession, c3k0, c3bv, c1en, c69453Af, this.A0A, c61442r7, c71723Jv, this.A0D, c3fy, c61382r1, c71743Jx, c61842rl, c60862qA, c60662pp, c69703Be, this.A0M);
            this.A00 = c3k42;
            return c3k42;
        }
        return c3k4;
    }

    public final C41116IIh A01() {
        C41116IIh c41116IIh = this.A01;
        if (c41116IIh == null) {
            C41116IIh c41116IIh2 = new C41116IIh(this.A05, this.A0F, this.A0J, this.A0L);
            this.A01 = c41116IIh2;
            return c41116IIh2;
        }
        return c41116IIh;
    }
}
