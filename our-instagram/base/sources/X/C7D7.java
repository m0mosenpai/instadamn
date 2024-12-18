package X;

import android.graphics.PointF;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7D7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7D7 {
    public static final C7D7 A00 = new Object();

    public static final AnonymousClass441 A00(String str, List list) {
        long longValue;
        C14360o3.A0B(str, 1);
        Iterator it = list.iterator();
        AnonymousClass441 anonymousClass441 = null;
        long j = 0;
        while (it.hasNext()) {
            AnonymousClass441 anonymousClass4412 = (AnonymousClass441) it.next();
            boolean A0K = C14360o3.A0K(anonymousClass4412.A00(), str);
            if (anonymousClass4412.A00 != null) {
                Long l = anonymousClass4412.A01;
                if (l == null) {
                    if (A0K) {
                        return anonymousClass4412;
                    }
                    longValue = 0;
                } else {
                    longValue = l.longValue();
                }
                if (longValue > j) {
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    anonymousClass441 = anonymousClass4412;
                }
            }
        }
        return anonymousClass441;
    }

    public static final AnonymousClass441 A01(String str, List list) {
        long longValue;
        C14360o3.A0B(str, 1);
        Iterator it = list.iterator();
        AnonymousClass441 anonymousClass441 = null;
        long j = 0;
        while (it.hasNext()) {
            AnonymousClass441 anonymousClass4412 = (AnonymousClass441) it.next();
            boolean A0K = C14360o3.A0K(anonymousClass4412.A00(), str);
            String str2 = anonymousClass4412.A04;
            if (str2 != null && str2.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                Long l = anonymousClass4412.A01;
                if (l == null) {
                    if (A0K) {
                        return anonymousClass4412;
                    }
                    longValue = 0;
                } else {
                    longValue = l.longValue();
                }
                if (longValue > j) {
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    anonymousClass441 = anonymousClass4412;
                }
            }
        }
        return anonymousClass441;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [X.7DA, X.7AS] */
    public static final C7DA A02(PointF pointF, UserSession userSession, AnonymousClass988 anonymousClass988, C7IH c7ih, C2EY c2ey, C18A c18a, Long l, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        ImageUrl imageUrl;
        C14360o3.A0B(c18a, 1);
        C14360o3.A0B(list, 2);
        C14360o3.A0B(str4, 6);
        C14360o3.A0B(c2ey, 12);
        if (z3) {
            C16930sl c16930sl = C16930sl.A00;
            C16920sk A0E = AbstractC06930Yk.A0E();
            boolean z5 = !list.isEmpty();
            C14360o3.A0B(c16930sl, 1);
            return new C7AS(null, userSession, null, anonymousClass988, null, c7ih, c2ey, null, l, "", str3, null, str4, null, c16930sl, c16930sl, A0E, 0, z, z2, false, z5, z4);
        }
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass441 anonymousClass441 = (AnonymousClass441) it.next();
            User A02 = c18a.A02(anonymousClass441.A00());
            String str5 = anonymousClass441.A02;
            if (A02 != null && str5 != null) {
                if (hashMap.containsKey(str5)) {
                    List list2 = (List) hashMap.get(str5);
                    if (list2 != null) {
                        list2.add(A02.getId());
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(A02.getId());
                    hashMap.put(str5, arrayList);
                }
            } else {
                C0w9.A04("DirectReactionsMessagePillModelGenerator", "user in reaction list not in cache", 1);
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass441 anonymousClass4412 = (AnonymousClass441) it2.next();
            User A022 = c18a.A02(anonymousClass4412.A00());
            String A002 = anonymousClass4412.A00();
            if (A022 != null) {
                imageUrl = A022.Bhu();
            } else {
                imageUrl = null;
            }
            hashMap2.put(A002, imageUrl);
        }
        C7D7 c7d7 = A00;
        MessageIdentifier messageIdentifier = null;
        if (str != null) {
            messageIdentifier = new MessageIdentifier(str, null);
        }
        return c7d7.A03(pointF, userSession, anonymousClass988, c7ih, c2ey, messageIdentifier, l, str2, str3, str4, list, hashMap, hashMap2, z, z2, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        if (r10.size() > 1) goto L18;
     */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.7DA, X.7AS] */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.7DA, X.7AS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C7DA A03(android.graphics.PointF r38, com.instagram.common.session.UserSession r39, X.AnonymousClass988 r40, X.C7IH r41, X.C2EY r42, com.instagram.model.direct.messageid.MessageIdentifier r43, java.lang.Long r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.util.List r48, java.util.Map r49, java.util.Map r50, boolean r51, boolean r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7D7.A03(android.graphics.PointF, com.instagram.common.session.UserSession, X.988, X.7IH, X.2EY, com.instagram.model.direct.messageid.MessageIdentifier, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.Map, java.util.Map, boolean, boolean, boolean):X.7DA");
    }
}
