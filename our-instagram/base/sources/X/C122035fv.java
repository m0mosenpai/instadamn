package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: X.5fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122035fv {
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static final SettableFuture A00(C2JO c2jo, UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        ?? obj = new Object();
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A00(c2jo, "input");
        Boolean valueOf = Boolean.valueOf(z);
        c2jm.A02(AbstractC58317Pt9.A00(985), valueOf);
        boolean z2 = false;
        if (valueOf != null) {
            z2 = true;
        }
        C18C.A0E(z2);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGGraphQLBanyanQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59889QqZ.class, false, null, 0, null, "get_paginated_ig_share_sheet_ranking_query", new ArrayList());
        C06090Tz c06090Tz = C06090Tz.A05;
        pandoGraphQLRequest.setMaxToleratedCacheAgeMs(Math.max(C18U.A01(c06090Tz, userSession, 36594916658972653L), C18U.A01(c06090Tz, userSession, 36604820853036166L)));
        pandoGraphQLRequest.setFreshCacheAgeMs(TimeUnit.HOURS.toMillis(C18U.A01(c06090Tz, userSession, 36604820853036166L)));
        A01.ATV(new C48133LSi(obj), new C23373AXx(obj), pandoGraphQLRequest);
        return obj;
    }

    public static final C1ON A01(UserSession userSession, Boolean bool, String str, List list, Map map, boolean z) {
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("banyan/banyan/");
        c25621Ms.A9s("views", new JSONArray((Collection) list).toString());
        c25621Ms.A0I("is_real_time", z);
        c25621Ms.A0P(null, C122045fw.class, C122055fx.class, false);
        if (str != null) {
            c25621Ms.A9s(MSV.A00(227), str);
        }
        if (bool != null) {
            c25621Ms.A0I("is_private_share", bool.booleanValue());
        }
        if (map != null) {
            c25621Ms.A9s("IBCShareSheetParams", A02(map));
        }
        return c25621Ms.A0N();
    }

    public static final String A02(Map map) {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Integer valueOf = Integer.valueOf(((Number) entry.getValue()).intValue());
                A0A.A0r(str);
                A0A.A0J(valueOf);
            }
            A0A.A0a();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            C0w9.A06(new C0YZ(C122035fv.class).toString(), "Failed to convert collection to json", e);
            return null;
        }
    }
}
