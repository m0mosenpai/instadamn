package com.instagram.realtimeclient;

import X.AbstractC221915u;
import X.AnonymousClass182;
import X.C14360o3;
import X.C16L;
import X.C16R;
import X.C16V;
import X.C17z;
import X.C1EH;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class SkywalkerCommand__JsonHelper {
    public static SkywalkerCommand parseFromJson(C16L c16l) {
        return (SkywalkerCommand) C16V.A01(c16l, new C1EH() { // from class: com.instagram.realtimeclient.SkywalkerCommand__JsonHelper.1
            @Override // X.C1EH
            public SkywalkerCommand invoke(C16L c16l2) {
                return SkywalkerCommand__JsonHelper.unsafeParseFromJson(c16l2);
            }

            @Override // X.C1EH
            public /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                return SkywalkerCommand__JsonHelper.unsafeParseFromJson(c16l2);
            }
        });
    }

    public static boolean processSingleField(SkywalkerCommand skywalkerCommand, String str, C16L c16l) {
        String A1P;
        String A1P2;
        HashMap hashMap = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        if ("sub".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                        arrayList.add(A1P2);
                    }
                }
            }
            skywalkerCommand.mSubscribeTopics = arrayList;
            return true;
        }
        if ("unsub".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList2 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                        arrayList2.add(A1P);
                    }
                }
            }
            skywalkerCommand.mUnsubscribeTopics = arrayList2;
            return true;
        }
        if ("pub".equals(str)) {
            if (c16l.A11() == C16R.A0D) {
                HashMap hashMap2 = new HashMap();
                while (c16l.A1J() != C16R.A09) {
                    String A1P3 = c16l.A1P();
                    c16l.A1J();
                    if (c16l.A11() == C16R.A0G) {
                        hashMap2.put(A1P3, null);
                    } else {
                        String A1P4 = c16l.A1P();
                        if (A1P4 != null) {
                            hashMap2.put(A1P3, A1P4);
                        }
                    }
                }
                hashMap = hashMap2;
            }
            skywalkerCommand.mPublishTopicToPayload = hashMap;
            return true;
        }
        return false;
    }

    public static String serializeToJson(SkywalkerCommand skywalkerCommand) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        serializeToJson(A0A, skywalkerCommand, true);
        A0A.close();
        return stringWriter.toString();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.instagram.realtimeclient.SkywalkerCommand, java.lang.Object] */
    public static SkywalkerCommand unsafeParseFromJson(C16L c16l) {
        ?? obj = new Object();
        if (c16l.A11() != C16R.A0D) {
            c16l.A0z();
            return null;
        }
        while (c16l.A1J() != C16R.A09) {
            String A0q = c16l.A0q();
            c16l.A1J();
            processSingleField(obj, A0q, c16l);
            c16l.A0z();
        }
        return obj;
    }

    public static SkywalkerCommand parseFromJson(String str) {
        return parseFromJson(C16V.A00(str));
    }

    public static void serializeToJson(AnonymousClass182 anonymousClass182, SkywalkerCommand skywalkerCommand, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        if (skywalkerCommand.mSubscribeTopics != null) {
            C16V.A03(anonymousClass182, "sub");
            for (String str : skywalkerCommand.mSubscribeTopics) {
                if (str != null) {
                    anonymousClass182.A0u(str);
                }
            }
            anonymousClass182.A0Z();
        }
        if (skywalkerCommand.mUnsubscribeTopics != null) {
            C16V.A03(anonymousClass182, "unsub");
            for (String str2 : skywalkerCommand.mUnsubscribeTopics) {
                if (str2 != null) {
                    anonymousClass182.A0u(str2);
                }
            }
            anonymousClass182.A0Z();
        }
        if (skywalkerCommand.mPublishTopicToPayload != null) {
            C14360o3.A0B(anonymousClass182, 0);
            anonymousClass182.A0r("pub");
            anonymousClass182.A0d();
            for (Map.Entry entry : skywalkerCommand.mPublishTopicToPayload.entrySet()) {
                if (!C16V.A04(anonymousClass182, entry)) {
                    anonymousClass182.A0u((String) entry.getValue());
                }
            }
            anonymousClass182.A0a();
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
