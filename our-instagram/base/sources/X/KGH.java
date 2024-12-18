package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGH extends AbstractC61132qb {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;

    public KGH(UserSession userSession, Context context, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = z;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, X.2pF] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Context context = this.A00;
        UserSession userSession = this.A01;
        return new Jn9(userSession, new C48263LXm(context, null, null, userSession, null, new Object(), null, this.A02), new C47290Kv1(context));
    }
}
