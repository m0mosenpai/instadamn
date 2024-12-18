package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.business.onelink.cache.AdAccountCacheInfo;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Wds, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70614Wds implements C97Q {
    public C69093Vhj A00;
    public final C68947Vel A01;
    public final C97O A02;
    public final C25671My A03;
    public final UserSession A04;

    public C70614Wds(C97O c97o, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = c97o;
        this.A01 = new C68947Vel(userSession);
        this.A03 = AbstractC25651Mw.A00(userSession);
    }

    @Override // X.C97Q
    public final void AHf(C9CN c9cn) {
        C14360o3.A0B(c9cn, 0);
        if (C97Y.A00.A00(this.A04, c9cn.A02)) {
            this.A00 = null;
            C68947Vel c68947Vel = this.A01;
            AbstractC19590xm.A09(c68947Vel.A00, new C50259MHo(c68947Vel, 41));
            this.A03.E4s(C70713Wfd.A00);
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
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0J, c2jm, "input"), "IGOneLinkMiddlewareAdAccountQuery", c2jm.getParamsCopy(), new C2JM().getParamsCopy(), C66752UaD.class, false, null, 0, null, "xfb_one_link_monoschema", new ArrayList()), new U7V(0, c9cn, this, c97k, c97x));
    }

    @Override // X.C97Q
    public final /* bridge */ /* synthetic */ Object AuS(C9CN c9cn) {
        AdAccountCacheInfo adAccountCacheInfo;
        C208059Im c208059Im;
        C14360o3.A0B(c9cn, 0);
        if (!C97Y.A00.A00(this.A04, c9cn.A02)) {
            return null;
        }
        C68947Vel c68947Vel = this.A01;
        String string = c68947Vel.A00.getString("ad_account_info", null);
        if (string == null || (adAccountCacheInfo = (AdAccountCacheInfo) c68947Vel.A01.A00(string, C71736X0b.A00)) == null) {
            return null;
        }
        String str = adAccountCacheInfo.A01;
        String str2 = adAccountCacheInfo.A00;
        C208059Im c208059Im2 = null;
        if (str2 != null) {
            c208059Im = new C208059Im(str2);
        } else {
            c208059Im = null;
        }
        String str3 = adAccountCacheInfo.A02;
        if (str3 != null) {
            c208059Im2 = new C208059Im(str3);
        }
        return new C69093Vhj(c208059Im, c208059Im2, str);
    }
}
