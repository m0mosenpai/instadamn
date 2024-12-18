package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class VBn extends V2X {
    public User A00;
    public C67844UzI A01;
    public final Context A02;
    public final C65662y2 A03;
    public final UserSession A04;
    public final V3O A05;
    public final V3K A06;
    public final V3P A07;
    public final V3L A08;
    public final V33 A09;
    public final N9I A0A;

    /* JADX WARN: Type inference failed for: r6v0, types: [X.2y2, java.lang.Object, X.2y0] */
    public VBn(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C67897V1f c67897V1f, C67897V1f c67897V1f2, InterfaceC58093PpI interfaceC58093PpI) {
        this.A02 = context;
        this.A04 = userSession;
        V3O v3o = new V3O(context, interfaceC11380iw);
        this.A05 = v3o;
        V3L v3l = new V3L(context);
        this.A08 = v3l;
        V3P v3p = new V3P(context, null);
        this.A07 = v3p;
        V3K v3k = new V3K(context, c67897V1f);
        this.A06 = v3k;
        N9I n9i = new N9I(context, userSession, interfaceC58093PpI);
        this.A0A = n9i;
        ?? obj = new Object();
        this.A03 = obj;
        V33 v33 = new V33(context, VDR.A03, c67897V1f2);
        this.A09 = v33;
        A0B(v3o, v3l, v3p, v3k, n9i, obj, v33);
    }
}
