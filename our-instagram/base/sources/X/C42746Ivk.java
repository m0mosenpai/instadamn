package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.Ivk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42746Ivk implements InterfaceC65342xW {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final ICY A02;
    public final C155396yS A03;
    public final C39144HKx A04;
    public final Context A05;
    public final User A06;

    public C42746Ivk(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, ICY icy, C155396yS c155396yS, C38U c38u, User user) {
        AbstractC167007dF.A1H(userSession, 2, c38u);
        this.A05 = context;
        this.A00 = userSession;
        this.A03 = c155396yS;
        this.A06 = user;
        this.A01 = interfaceC60442pS;
        this.A02 = icy;
        this.A04 = new C39144HKx(C42411xV.A00(userSession), c38u);
    }

    @Override // X.InterfaceC65342xW
    public final Iterator EWm(InterfaceC61752rc interfaceC61752rc) {
        throw C00O.createAndThrow();
    }
}
