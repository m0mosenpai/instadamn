package com.instagram.realtimeclient;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C16L;
import X.C16R;
import X.C16V;
import X.C1EH;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.realtimeclient.RealtimeOperation;

/* loaded from: classes11.dex */
public final class RealtimeOperation__JsonHelper {
    public static RealtimeOperation parseFromJson(C16L c16l) {
        return (RealtimeOperation) C16V.A01(c16l, new C1EH() { // from class: com.instagram.realtimeclient.RealtimeOperation__JsonHelper.1
            @Override // X.C1EH
            public RealtimeOperation invoke(C16L c16l2) {
                return RealtimeOperation__JsonHelper.unsafeParseFromJson(c16l2);
            }

            @Override // X.C1EH
            public /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                return RealtimeOperation__JsonHelper.unsafeParseFromJson(c16l2);
            }
        });
    }

    public static boolean processSingleField(RealtimeOperation realtimeOperation, String str, C16L c16l) {
        if ("op".equals(str)) {
            realtimeOperation.op = RealtimeOperation.Type.valueOf(c16l.A1P());
            return true;
        }
        if ("path".equals(str)) {
            realtimeOperation.path = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(str)) {
            realtimeOperation.value = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if ("ts".equals(str)) {
            realtimeOperation.timestamp = AbstractC167017dG.A0m(c16l);
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.instagram.realtimeclient.RealtimeOperation] */
    public static RealtimeOperation unsafeParseFromJson(C16L c16l) {
        ?? obj = new Object();
        if (c16l.A11() != C16R.A0D) {
            c16l.A0z();
            return null;
        }
        while (c16l.A1J() != C16R.A09) {
            processSingleField(obj, AbstractC166997dE.A0s(c16l), c16l);
            c16l.A0z();
        }
        return obj;
    }

    public static RealtimeOperation parseFromJson(String str) {
        return parseFromJson(C16V.A00(str));
    }
}
