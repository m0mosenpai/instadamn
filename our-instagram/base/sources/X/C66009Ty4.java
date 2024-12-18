package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.business.onelink.cache.FBPageCacheInfo;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Ty4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66009Ty4 implements C97Q {
    public C31590DuI A00;
    public final C68949Ven A01;
    public final C97O A02;
    public final C25671My A03;
    public final UserSession A04;

    public C66009Ty4(C97O c97o, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = c97o;
        this.A01 = new C68949Ven(userSession);
        this.A03 = AbstractC25651Mw.A00(userSession);
    }

    @Override // X.C97Q
    public final void AHf(C9CN c9cn) {
        C14360o3.A0B(c9cn, 0);
        if (C97Y.A00.A00(this.A04, c9cn.A02)) {
            this.A00 = null;
            C68949Ven c68949Ven = this.A01;
            AbstractC19590xm.A09(c68949Ven.A00, new C50259MHo(c68949Ven, 43));
            this.A03.E4s(C70715Wff.A00);
        }
    }

    @Override // X.C97Q
    public final void AV3(C9CN c9cn, C97K c97k, C97X c97x) {
        AbstractC167007dF.A1K(c9cn, c97k);
        C97Y c97y = C97Y.A00;
        UserSession userSession = this.A04;
        if (!c97y.A00(userSession, c9cn.A02)) {
            c97x.onError(X1z.A00);
            return;
        }
        C0CA A0J = AbstractC65702TsY.A0J(GraphQlCallInput.A02, AbstractC65702TsY.A0K(c9cn), c97k, c97k);
        C2JM c2jm = new C2JM();
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0J, c2jm, "input"), "IGOneLinkMiddlewarePageQuery", c2jm.getParamsCopy(), new C2JM().getParamsCopy(), C66030TyS.class, false, null, 0, null, "xfb_one_link_monoschema", new ArrayList()), new U7V(2, c9cn, this, c97k, c97x));
    }

    @Override // X.C97Q
    public final /* bridge */ /* synthetic */ Object AuS(C9CN c9cn) {
        C68949Ven c68949Ven;
        InterfaceC19630xq interfaceC19630xq;
        String string;
        FBPageCacheInfo fBPageCacheInfo;
        C14360o3.A0B(c9cn, 0);
        if (C97Y.A00.A00(this.A04, c9cn.A02) && (interfaceC19630xq = (c68949Ven = this.A01).A00) != null && (string = interfaceC19630xq.getString("fb_page_info", null)) != null && (fBPageCacheInfo = (FBPageCacheInfo) c68949Ven.A01.A00(string, C66012Ty7.A00)) != null) {
            return A00(fBPageCacheInfo);
        }
        return null;
    }

    public static final C31590DuI A00(FBPageCacheInfo fBPageCacheInfo) {
        C208059Im c208059Im;
        String str = fBPageCacheInfo.A03;
        String str2 = fBPageCacheInfo.A02;
        C208059Im c208059Im2 = null;
        if (str2 != null) {
            c208059Im = new C208059Im(str2);
        } else {
            c208059Im = null;
        }
        String str3 = fBPageCacheInfo.A04;
        String str4 = fBPageCacheInfo.A01;
        String str5 = fBPageCacheInfo.A00;
        if (str5 != null) {
            c208059Im2 = new C208059Im(str5);
        }
        return new C31590DuI(c208059Im, c208059Im2, str, str3, str4, fBPageCacheInfo.A05);
    }
}
