package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.HGx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39047HGx extends AbstractC65806TuP {
    public View A00;
    public INQ A01;
    public final C4ZF A02;
    public final InterfaceC09390do A03;
    public final C6FG A04;
    public final C102884kP A05;
    public final UserSession A06;
    public final InterfaceC60442pS A07;
    public final IN1 A08;

    @Override // X.AbstractC65806TuP
    public final Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        C14360o3.A0B(view, 0);
        C38321qM A0R = A0R();
        this.A00 = view;
        ((ViewOnTouchListenerC676833i) this.A03.getValue()).start();
        A0T().A00(A0R);
        A0U(true);
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        INQ inq = this.A01;
        if (inq != null) {
            inq.A03("scroll");
        }
        ((ViewOnTouchListenerC676833i) this.A03.getValue()).stop();
    }

    public final C6FG A0P() {
        if (this instanceof HE8) {
            return ((HE8) this).A00;
        }
        if (this instanceof HE7) {
            return ((HE7) this).A00;
        }
        if (this instanceof HE6) {
            return ((HE6) this).A00;
        }
        return ((HE5) this).A00;
    }

    public final UserSession A0Q() {
        if (this instanceof HE8) {
            return ((HE8) this).A01;
        }
        if (this instanceof HE7) {
            return ((HE7) this).A01;
        }
        if (this instanceof HE6) {
            return ((HE6) this).A01;
        }
        return ((HE5) this).A01;
    }

    public final C38321qM A0R() {
        C39352HZr c39352HZr;
        if (this instanceof HE8) {
            c39352HZr = ((HE8) this).A03;
        } else {
            if (this instanceof HE7) {
                return ((HE7) this).A03.A00;
            }
            if (this instanceof HE6) {
                c39352HZr = ((HE6) this).A03;
            } else {
                return ((HE5) this).A03.A00;
            }
        }
        return c39352HZr.A00;
    }

    public final InterfaceC60442pS A0S() {
        if (this instanceof HE8) {
            return ((HE8) this).A02;
        }
        if (this instanceof HE7) {
            return ((HE7) this).A02;
        }
        if (this instanceof HE6) {
            return ((HE6) this).A02;
        }
        return ((HE5) this).A02;
    }

    public final INQ A0T() {
        INQ inq = this.A01;
        if (inq == null) {
            Context context = A0P().A00;
            UserSession A0Q = A0Q();
            InterfaceC60442pS A0S = A0S();
            C42888Iy2 c42888Iy2 = C42888Iy2.A00;
            AbstractC167027dH.A13(A0Q, A0S, c42888Iy2);
            INQ inq2 = new INQ(context, A0Q, A0S, c42888Iy2);
            this.A01 = inq2;
            return inq2;
        }
        return inq;
    }

    public final void A0U(boolean z) {
        if (this instanceof HE8) {
            HE8 he8 = (HE8) this;
            View view = ((AbstractC39047HGx) he8).A00;
            if (view != null) {
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.lightbox.LightboxStoryVideoViewBinder.Holder");
                UserSession userSession = he8.A01;
                C39352HZr c39352HZr = he8.A03;
                EnumC39541HdD enumC39541HdD = EnumC39541HdD.A03;
                C4ZF c4zf = ((AbstractC39047HGx) he8).A02;
                INQ A0T = he8.A0T();
                I6D.A00(he8.A02, userSession, he8.A0O(z), (C42799Iwb) tag, A0T, enumC39541HdD, c39352HZr, c4zf);
                return;
            }
        } else if (this instanceof HE7) {
            HE7 he7 = (HE7) this;
            UserSession userSession2 = he7.A01;
            View view2 = ((AbstractC39047HGx) he7).A00;
            if (view2 != null) {
                Object tag2 = view2.getTag();
                C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.lightbox.LightboxFeedVideoViewBinder.Holder");
                C41070IGn c41070IGn = (C41070IGn) tag2;
                C39350HZp c39350HZp = he7.A03;
                EnumC39541HdD enumC39541HdD2 = EnumC39541HdD.A03;
                C4ZF c4zf2 = ((AbstractC39047HGx) he7).A02;
                INQ A0T2 = he7.A0T();
                InterfaceC60442pS interfaceC60442pS = he7.A02;
                C42835IxB A0O = he7.A0O(z);
                AbstractC167017dG.A1N(userSession2, c41070IGn);
                AbstractC25234BEr.A1R(c39350HZp, enumC39541HdD2, c4zf2, A0T2, interfaceC60442pS);
                C14360o3.A0B(A0O, 7);
                I68.A00(userSession2, A0O, c41070IGn.A00, c39350HZp);
                I67.A00(userSession2, A0O, c41070IGn.A01, c39350HZp);
                I6E.A00(interfaceC60442pS, A0O, c41070IGn.A02, A0T2, enumC39541HdD2, c39350HZp, c4zf2, ((IN1) c39350HZp).A00);
                return;
            }
        } else if (this instanceof HE6) {
            HE6 he6 = (HE6) this;
            InterfaceC60442pS interfaceC60442pS2 = he6.A02;
            UserSession userSession3 = he6.A01;
            View view3 = ((AbstractC39047HGx) he6).A00;
            if (view3 != null) {
                Object tag3 = view3.getTag();
                C14360o3.A0C(tag3, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.lightbox.LightboxStoryPhotoViewBinder.Holder");
                C39352HZr c39352HZr2 = he6.A03;
                I6C.A00(interfaceC60442pS2, userSession3, he6.A0O(z), (C42798Iwa) tag3, c39352HZr2);
                return;
            }
        } else {
            HE5 he5 = (HE5) this;
            View view4 = ((AbstractC39047HGx) he5).A00;
            if (view4 != null) {
                Object tag4 = view4.getTag();
                C14360o3.A0C(tag4, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.lightbox.LightboxProductVideoViewBinder.Holder");
                C39349HZo c39349HZo = he5.A03;
                EnumC39541HdD enumC39541HdD3 = EnumC39541HdD.A03;
                INQ A0T3 = he5.A0T();
                I6A.A00(he5.A02, he5.A01, he5.A0O(z), (IIF) tag4, A0T3, enumC39541HdD3, c39349HZo);
                return;
            }
        }
        C14360o3.A0F("viewContent");
        throw C00O.createAndThrow();
    }

    public AbstractC39047HGx(C6FG c6fg, C102884kP c102884kP, UserSession userSession, InterfaceC60442pS interfaceC60442pS, IN1 in1) {
        super(c6fg, c102884kP);
        this.A05 = c102884kP;
        this.A04 = c6fg;
        this.A06 = userSession;
        this.A07 = interfaceC60442pS;
        this.A08 = in1;
        this.A02 = new C4ZF();
        this.A03 = C1XM.A00(new J7Q(this, 29));
    }

    public final C42835IxB A0O(boolean z) {
        ViewOnTouchListenerC676833i viewOnTouchListenerC676833i;
        UserSession A0Q = A0Q();
        C6FG A0P = A0P();
        InterfaceC60442pS A0S = A0S();
        if (z) {
            viewOnTouchListenerC676833i = (ViewOnTouchListenerC676833i) this.A03.getValue();
        } else {
            viewOnTouchListenerC676833i = null;
        }
        C4ZF c4zf = this.A02;
        INQ inq = this.A01;
        if (inq == null) {
            inq = null;
        }
        C50168MDv c50168MDv = new C50168MDv(18, this, z);
        AbstractC167027dH.A12(A0Q, A0P, A0S);
        C14360o3.A0B(c4zf, 4);
        return new C42835IxB(A0P, A0Q, A0S, inq, c4zf, viewOnTouchListenerC676833i, c50168MDv);
    }
}
