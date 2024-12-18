package com.instagram.realtimeclient;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31173DnH;
import X.C16L;
import X.C16R;
import X.C16V;
import X.C1EH;
import X.EnumC81843l3;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* loaded from: classes6.dex */
public final class DirectRealtimePayload__JsonHelper {
    public static DirectRealtimePayload parseFromJson(C16L c16l) {
        return (DirectRealtimePayload) C16V.A01(c16l, new C1EH() { // from class: com.instagram.realtimeclient.DirectRealtimePayload__JsonHelper.1
            @Override // X.C1EH
            public DirectRealtimePayload invoke(C16L c16l2) {
                return DirectRealtimePayload__JsonHelper.unsafeParseFromJson(c16l2);
            }

            @Override // X.C1EH
            public /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                return DirectRealtimePayload__JsonHelper.unsafeParseFromJson(c16l2);
            }
        });
    }

    public static boolean processSingleField(DirectRealtimePayload directRealtimePayload, String str, C16L c16l) {
        if ("client_request_id".equals(str)) {
            directRealtimePayload.clientRequestId = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if ("client_context".equals(str)) {
            directRealtimePayload.clientContext = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if ("item_id".equals(str)) {
            directRealtimePayload.itemId = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(str)) {
            directRealtimePayload.threadId = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if ("timestamp".equals(str)) {
            directRealtimePayload.timestamp = c16l.A0y();
            return true;
        }
        if ("count".equals(str)) {
            directRealtimePayload.count = AbstractC166997dE.A0h(c16l);
            return true;
        }
        if (DialogModule.KEY_MESSAGE.equals(str)) {
            directRealtimePayload.message = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if ("client_facing_error_message".equals(str)) {
            directRealtimePayload.clientFacingErrorMessage = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if ("is_epd_error".equals(str)) {
            directRealtimePayload.isEpdError = c16l.A0d();
            return true;
        }
        if ("can_see_notes".equals(str)) {
            directRealtimePayload.canSeeNotes = c16l.A0d();
            return true;
        }
        if ("can_see_broadcast_chats".equals(str)) {
            directRealtimePayload.canSeeBroadcastChats = c16l.A0d();
            return true;
        }
        if ("biz_thread_throttling_state".equals(str)) {
            EnumC81843l3 enumC81843l3 = (EnumC81843l3) EnumC81843l3.A01.get(AbstractC167017dG.A0m(c16l));
            if (enumC81843l3 == null) {
                enumC81843l3 = EnumC81843l3.A06;
            }
            directRealtimePayload.throttlingType = enumC81843l3;
            return true;
        }
        if (TraceFieldType.ErrorCode.equals(str)) {
            directRealtimePayload.errorCode = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if ("ttl".equals(str)) {
            directRealtimePayload.ttlMs = AbstractC31173DnH.A0h(c16l);
            return true;
        }
        if ("error".equals(str)) {
            directRealtimePayload.error = DirectApiError__JsonHelper.parseFromJson(c16l);
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.instagram.realtimeclient.DirectRealtimePayload, java.lang.Object] */
    public static DirectRealtimePayload unsafeParseFromJson(C16L c16l) {
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

    public static DirectRealtimePayload parseFromJson(String str) {
        return parseFromJson(C16V.A00(str));
    }
}
