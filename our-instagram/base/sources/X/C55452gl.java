package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55452gl {
    public final InterfaceC16620sF A00;
    public static final C55462gm A01 = new Object();
    public static final C55472gn A04 = new Object();
    public static final C55482go A06 = new Object();
    public static final C55492gp A05 = new Object();
    public static final C55502gq A07 = new Object();
    public static final C55512gr A03 = new Object();
    public static final C55522gs A08 = new Object();
    public static final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A04, C55532gt.A00);

    public final C49I A00(Context context, UserSession userSession, C55732hE c55732hE, String str, java.util.Set set) {
        List list;
        C14360o3.A0B(set, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(userSession, 3);
        long currentTimeMillis = System.currentTimeMillis();
        C49G c49g = (C49G) this.A00.invoke(userSession, str);
        if (C18U.A06(C06090Tz.A05, userSession, 36314279200164359L)) {
            list = Collections.singletonList(new C55731Oox(new O41(userSession)));
            C14360o3.A07(list);
        } else {
            list = C16930sl.A00;
        }
        AbstractC54912fq.A00();
        C55712hB c55712hB = new C55712hB(context, userSession);
        C55472gn c55472gn = A04;
        C18920wW A022 = AbstractC12220kQ.A02(userSession);
        C55482go c55482go = A06;
        return new C49I(A022, c49g, new C49H(context, c49g, userSession, c55732hE), A03, c55472gn, A05, c55482go, A07, A08, str, list, set, currentTimeMillis, ((InterfaceC19630xq) ((IGDevToolPersistentStateHandler) c55712hB.A00.getValue()).A02.getValue()).getBoolean("/shared/qp/dev_mode", false));
    }

    public C55452gl(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC16620sF;
    }
}
