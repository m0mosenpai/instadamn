package X;

import android.graphics.drawable.Drawable;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.9U3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9U3 extends AbstractC52922bZ {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final C183828Di A03;
    public final C23031Ai A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;
    public final C0UO A08;

    public C9U3(UserSession userSession, C183828Di c183828Di) {
        AbstractC167007dF.A1D(userSession, 1, c183828Di);
        this.A02 = userSession;
        this.A03 = c183828Di;
        this.A04 = AbstractC23021Ah.A00(userSession);
        C008002u c008002u = new C008002u(new A8G(null, AbstractC001800i.A0k(c183828Di.A00), c183828Di.A07()));
        this.A07 = c008002u;
        this.A08 = AbstractC208910l.A02(c008002u);
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A05 = c24721Ip;
        this.A06 = AbstractC07080Za.A03(c24721Ip);
        this.A01 = true;
        this.A00 = true;
        C141796aw A00 = AbstractC141776au.A00(this);
        C25024B5f c25024B5f = new C25024B5f(this, null, 33);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, c25024B5f, A00);
        AbstractC23641Du.A05(anonymousClass191, new C25024B5f(this, null, 34), AbstractC141776au.A00(this));
        AbstractC23641Du.A05(anonymousClass191, new C25024B5f(this, null, 35), AbstractC141776au.A00(this));
    }

    public static final Drawable A00(Drawable drawable, C9U3 c9u3) {
        if (drawable instanceof C194808jg) {
            Drawable A04 = ((C194808jg) drawable).A04();
            C14360o3.A07(A04);
            return A00(A04, c9u3);
        }
        return drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A03(Drawable drawable, int i) {
        AbstractC223849uT abstractC223849uT;
        C183828Di c183828Di = this.A03;
        if (drawable instanceof C74Q) {
            C74Q c74q = (C74Q) drawable;
            UserSession userSession = c183828Di.A02;
            if (c74q.CaH(userSession)) {
                if (c74q.Cf3()) {
                    abstractC223849uT = C219129mM.A00;
                    C183828Di.A02(abstractC223849uT, c183828Di);
                }
                if (!AbstractC001800i.A0k(c183828Di.A00).contains(Integer.valueOf(i))) {
                    C183828Di.A00(drawable, c183828Di, i);
                } else {
                    C183828Di.A01(drawable, c183828Di, i, false);
                }
                C183828Di.A02(C219139mN.A00, c183828Di);
                C22C A01 = AnonymousClass229.A01(userSession);
                EnumC50631MWs enumC50631MWs = ((C22F) A01).A04.A0C;
                if (A01.A0J() == null || enumC50631MWs == null) {
                    return;
                }
                A01.A1R(enumC50631MWs, "STORY_TEMPLATE_EDITOR_ELEMENT_TAPPED");
                return;
            }
        }
        abstractC223849uT = C219149mO.A00;
        C183828Di.A02(abstractC223849uT, c183828Di);
    }

    public static final void A01(AbstractC223859uU abstractC223859uU, C9U3 c9u3) {
        C141796aw A00 = AbstractC141776au.A00(c9u3);
        C12T c12t = C12P.A00;
        AbstractC23641Du.A05(AnonymousClass131.A00.A06(), new C25023B5e(abstractC223859uU, c9u3, null, 36), A00);
    }

    public final void A02() {
        C219349mi c219349mi;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Object value = this.A07.getValue();
        if ((value instanceof C219349mi) && (c219349mi = (C219349mi) value) != null) {
            C183828Di c183828Di = this.A03;
            c183828Di.A06(((A8G) c219349mi).A01);
            Boolean valueOf = Boolean.valueOf(c219349mi.A01);
            A1I.put(AppStateModule.APP_STATE_BACKGROUND, valueOf);
            c183828Di.A05.Egh(valueOf);
        }
        A01(new C219319mf(A1I), this);
    }
}
