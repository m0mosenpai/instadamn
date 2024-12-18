package com.instagram.realtimeclient;

import X.AbstractC37301Gc2;
import X.C16L;
import X.C16R;
import X.C16V;
import X.C1EH;
import com.instagram.realtimeclient.RealtimeStoreKey;

/* loaded from: classes11.dex */
public final class RealtimeStoreKey_ShimValueWithId__JsonHelper {
    public static RealtimeStoreKey.ShimValueWithId parseFromJson(C16L c16l) {
        return (RealtimeStoreKey.ShimValueWithId) C16V.A01(c16l, new C1EH() { // from class: com.instagram.realtimeclient.RealtimeStoreKey_ShimValueWithId__JsonHelper.1
            @Override // X.C1EH
            public RealtimeStoreKey.ShimValueWithId invoke(C16L c16l2) {
                return RealtimeStoreKey_ShimValueWithId__JsonHelper.unsafeParseFromJson(c16l2);
            }

            @Override // X.C1EH
            public /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                return RealtimeStoreKey_ShimValueWithId__JsonHelper.unsafeParseFromJson(c16l2);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.instagram.realtimeclient.RealtimeStoreKey$ShimValueWithId, java.lang.Object] */
    public static RealtimeStoreKey.ShimValueWithId unsafeParseFromJson(C16L c16l) {
        if (c16l.A11() != C16R.A0D) {
            c16l.A0z();
            return null;
        }
        String str = null;
        while (c16l.A1J() != C16R.A09) {
            String A0q = c16l.A0q();
            if (AbstractC37301Gc2.A1V(c16l, A0q) || "pk".equals(A0q) || "item_id".equals(A0q)) {
                if (c16l.A11() == C16R.A0G) {
                    str = null;
                } else {
                    str = c16l.A1P();
                }
            }
            c16l.A0z();
        }
        ?? obj = new Object();
        if (str != null) {
            obj.id = str;
        }
        return obj;
    }

    public static RealtimeStoreKey.ShimValueWithId parseFromJson(String str) {
        return parseFromJson(C16V.A00(str));
    }
}
