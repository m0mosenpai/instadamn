package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.business.onelink.cache.BusinessAccountCacheInfo;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Wdt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70615Wdt implements C97Q {
    public C68951Vep A00;
    public final C68948Vem A01;
    public final C97O A02;
    public final C25671My A03;
    public final UserSession A04;

    public C70615Wdt(C97O c97o, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = c97o;
        this.A01 = new C68948Vem(userSession);
        this.A03 = AbstractC25651Mw.A00(userSession);
    }

    @Override // X.C97Q
    public final void AHf(C9CN c9cn) {
        C14360o3.A0B(c9cn, 0);
        if (C97Y.A00.A00(this.A04, c9cn.A02)) {
            this.A00 = null;
            C68948Vem c68948Vem = this.A01;
            AbstractC19590xm.A09(c68948Vem.A00, new C50259MHo(c68948Vem, 42));
            this.A03.E4s(C70714Wfe.A00);
        }
    }

    @Override // X.C97Q
    public final void AV3(C9CN c9cn, C97K c97k, C97X c97x) {
        boolean A1R = AbstractC167007dF.A1R(0, c9cn, c97k);
        C97Y c97y = C97Y.A00;
        UserSession userSession = this.A04;
        if (!c97y.A00(userSession, c9cn.A02)) {
            c97x.onError(X1z.A00);
            return;
        }
        C0CA A0J = AbstractC65702TsY.A0J(GraphQlCallInput.A02, AbstractC65702TsY.A0K(c9cn), c97k, c97k);
        C2JM c2jm = new C2JM();
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0J, c2jm, "input"), "IGOneLinkMiddlewareBusinessAccountQuery", c2jm.getParamsCopy(), new C2JM().getParamsCopy(), C66756UaH.class, false, null, 0, null, "xfb_one_link_monoschema", new ArrayList()), new U7V(A1R ? 1 : 0, c9cn, this, c97k, c97x));
    }

    @Override // X.C97Q
    public final /* bridge */ /* synthetic */ Object AuS(C9CN c9cn) {
        BusinessAccountCacheInfo businessAccountCacheInfo;
        C208059Im c208059Im;
        C14360o3.A0B(c9cn, 0);
        if (C97Y.A00.A00(this.A04, c9cn.A02)) {
            C68948Vem c68948Vem = this.A01;
            String string = c68948Vem.A00.getString(AbstractC43591JPw.A00(819), null);
            if (string != null && (businessAccountCacheInfo = (BusinessAccountCacheInfo) c68948Vem.A01.A00(string, C71737X0c.A00)) != null) {
                String str = businessAccountCacheInfo.A01;
                String str2 = businessAccountCacheInfo.A00;
                if (str2 != null) {
                    c208059Im = new C208059Im(str2);
                } else {
                    c208059Im = null;
                }
                return new C68951Vep(c208059Im, str);
            }
            return null;
        }
        return null;
    }
}
