package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes8.dex */
public final class L6i {
    public final Context A00;
    public final UserSession A01;

    public final C907542o A00(String str, String str2) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        C907542o c907542o = new C907542o(userSession);
        ImmutableList of = ImmutableList.of((Object) str);
        C14360o3.A07(of);
        C2JM A0b = AbstractC25225BEi.A0b();
        Context context = this.A00;
        C2JO c2jo = new C2JO();
        c2jo.A05(AbstractC111324zv.A00(4864), C56A.A02(context, new AnonymousClass569(userSession)));
        Pair A01 = C56A.A01();
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        Object obj = A01.first;
        String A00 = AbstractC111324zv.A00(2725);
        C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, obj, A00);
        C0CA.A00(A0T, A01.second, "max_version");
        AbstractC31173DnH.A1M(A0T, c2jo, AbstractC111324zv.A00(5444));
        if (C18U.A06(C06090Tz.A05, userSession, 36325656568542443L)) {
            Pair A002 = C56A.A00();
            C0CA A0T2 = AbstractC25227BEk.A0T(c04060Jx, A002.first, A00);
            C0CA.A00(A0T2, A002.second, "max_version");
            AbstractC31173DnH.A1M(A0T2, c2jo, AbstractC111324zv.A00(5442));
        }
        Map A003 = AnonymousClass567.A00();
        Boolean bool = Boolean.TRUE;
        String A004 = AbstractC111324zv.A00(4387);
        boolean equals = bool.equals(A003.get(A004));
        String A005 = AbstractC111324zv.A00(5137);
        if (!equals) {
            A004 = "";
            if (bool.equals(A003.get(A005))) {
                A004 = A005;
            }
        }
        c2jo.A09(A004.replace("_compression", "").replace("2", ""), AbstractC111324zv.A00(5478));
        A0b.A00(c2jo, AbstractC111324zv.A00(64));
        A0b.A05("requested_effect_ids", of);
        A0b.A04("surface", str2);
        c907542o.A08(new C907442n(A0b, C44954Jv6.class, "IGAREffectPreviewByIdQuery", false));
        return c907542o;
    }

    public L6i(Context context, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        this.A00 = context;
        this.A01 = userSession;
    }
}
