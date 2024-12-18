package com.instagram.realtimeclient;

import X.AnonymousClass001;
import X.C16V;

/* loaded from: classes11.dex */
public class RealtimeStoreKey {

    /* loaded from: classes11.dex */
    public class ShimValueWithId {
        public String id;
    }

    public static String getKey(RealtimeOperation realtimeOperation) {
        String str;
        String str2 = realtimeOperation.path;
        if (!str2.startsWith(RealtimeProtocol.DIRECT_V2)) {
            ShimValueWithId shimValueWithId = null;
            try {
                shimValueWithId = RealtimeStoreKey_ShimValueWithId__JsonHelper.parseFromJson(C16V.A00(realtimeOperation.value));
            } catch (Exception unused) {
            }
            if (shimValueWithId != null && (str = shimValueWithId.id) != null) {
                return AnonymousClass001.A0g(str2, "/", str);
            }
        }
        return str2;
    }
}
