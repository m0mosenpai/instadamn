package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.V2b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67911V2b extends C7E1 {
    public final int A00;
    public final User A01;
    public final V3Q A02;
    public final N9I A03;
    public final boolean A04;
    public final Context A05;
    public final UserSession A06;
    public final V3P A07;

    public C67911V2b(Context context, UserSession userSession, User user, C68107VBl c68107VBl, InterfaceC58093PpI interfaceC58093PpI, int i, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A05 = context;
        this.A06 = userSession;
        this.A01 = user;
        this.A00 = i;
        this.A04 = z;
        N9I n9i = new N9I(context, userSession, interfaceC58093PpI);
        this.A03 = n9i;
        V3Q v3q = new V3Q(context, userSession, c68107VBl);
        this.A02 = v3q;
        V3P v3p = new V3P(context, null);
        this.A07 = v3p;
        A0B(n9i, v3q, v3p);
    }
}
