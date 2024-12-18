package com.instagram.share.facebook.cxpnotice.noticestate.internal;

import X.AbstractC09990gB;
import X.AbstractC40511uK;
import X.AbstractC40691uc;
import X.C14360o3;
import X.C2JM;
import X.C2JQ;
import X.C2JS;
import X.C40701ud;
import X.C55P;
import X.C5SL;
import X.C9B9;
import X.EnumC46582Bw;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class CXPNoticeStateApi {
    public final C40701ud A00;

    public static final PandoGraphQLRequest A00(ImmutableList immutableList) {
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A05("client_states", immutableList);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AbstractC40511uK.A00(), "SyncCXPNoticeStateMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C55P.class, true, null, 0, null, "xcxp_sync_notice_state", new ArrayList());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.graphql.calls.GraphQlCallInput, java.lang.Object, X.2JO] */
    public static final ImmutableList A01(Map map) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            ?? graphQlCallInput = new GraphQlCallInput();
            graphQlCallInput.A09(entry.getKey().toString(), "variant");
            graphQlCallInput.A07(Integer.valueOf(((C9B9) entry.getValue()).A00), "impression_count");
            graphQlCallInput.A07(Integer.valueOf(((C9B9) entry.getValue()).A01), "sequence_number");
            graphQlCallInput.A07(Integer.valueOf(((C9B9) entry.getValue()).A03), "last_impression_time");
            arrayList.add(graphQlCallInput);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            builder.add(it.next());
        }
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }

    public static final EnumMap A02(C55P c55p, Map map) {
        ImmutableList requiredCompactedTreeListField;
        EnumMap enumMap = new EnumMap(EnumC46582Bw.class);
        if (c55p != null && (requiredCompactedTreeListField = c55p.getRequiredCompactedTreeListField(0, "xcxp_sync_notice_state(params:$client_states)", C5SL.class, -1367190550)) != null) {
            Iterator<E> it = requiredCompactedTreeListField.iterator();
            while (it.hasNext()) {
                C2JS c2js = (C2JS) it.next();
                Enum optionalEnumField = c2js.getOptionalEnumField(0, "variant", EnumC46582Bw.A0Z);
                if (optionalEnumField != null && map.containsKey(optionalEnumField)) {
                    enumMap.put((EnumMap) optionalEnumField, (Enum) new C9B9(true, c2js.getCoercedIntField(1, "impression_count"), ((C9B9) AbstractC09990gB.A0I(optionalEnumField, map)).A01, c2js.getCoercedIntField(2, "last_impression_time"), 0));
                }
            }
        }
        return enumMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.util.Map r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 35
            boolean r0 = X.C206459Cc.A00(r10, r3)
            if (r0 == 0) goto L67
            r7 = r10
            X.9Cc r7 = (X.C206459Cc) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A03
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L3d
            if (r0 != r5) goto L76
            java.lang.Object r9 = r7.A02
            java.util.Map r9 = (java.util.Map) r9
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L6d
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            X.55P r0 = (X.C55P) r0
            java.util.EnumMap r1 = A02(r0, r9)
            return r1
        L3d:
            X.AbstractC09560e7.A00(r1)
            com.google.common.collect.ImmutableList r0 = A01(r9)
            com.facebook.pando.PandoGraphQLRequest r4 = A00(r0)
            X.12L r2 = X.C12L.A00
            r3 = 0
            r1 = 1158112076(0x4507634c, float:2166.206)
            r0 = 3
            X.0nZ r2 = r2.CPG(r1, r0)
            r1 = 34
            X.9D4 r0 = new X.9D4
            r0.<init>(r4, r8, r3, r1)
            r7.A01 = r8
            r7.A02 = r9
            r7.A00 = r5
            java.lang.Object r1 = X.AbstractC23641Du.A00(r7, r2, r0)
            if (r1 != r6) goto L28
            return r6
        L67:
            X.9Cc r7 = new X.9Cc
            r7.<init>(r8, r10, r3)
            goto L16
        L6d:
            X.0sk r1 = X.C16920sk.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            X.C14360o3.A0C(r1, r0)
            return r1
        L76:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateApi.A03(java.util.Map, X.1Ds):java.lang.Object");
    }

    public CXPNoticeStateApi(UserSession userSession) {
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C14360o3.A0B(A01, 1);
        this.A00 = A01;
    }
}
