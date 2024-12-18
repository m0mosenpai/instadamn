package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.3jW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81023jW {
    public static void A00(AnonymousClass182 anonymousClass182, AbstractC81003jU abstractC81003jU) {
        String str = abstractC81003jU.A01;
        if (str != null) {
            anonymousClass182.A0S("client_context", str);
        }
        String str2 = abstractC81003jU.A04;
        if (str2 != null) {
            anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        }
        String str3 = abstractC81003jU.A02;
        if (str3 != null) {
            anonymousClass182.A0S("item_id", str3);
        }
        String str4 = abstractC81003jU.A03;
        if (str4 != null) {
            anonymousClass182.A0S("original_message_client_context", str4);
        }
        anonymousClass182.A0R("date_created_ms", abstractC81003jU.A00);
    }

    public static void A01(C16L c16l, AbstractC81003jU abstractC81003jU, String str) {
        String str2 = null;
        if ("client_context".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str2 = c16l.A1P();
            }
            abstractC81003jU.A01 = str2;
            return;
        }
        if (!ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(str) && !"story_id".equals(str)) {
            if ("item_id".equals(str)) {
                if (c16l.A11() != C16R.A0G) {
                    str2 = c16l.A1P();
                }
                abstractC81003jU.A02 = str2;
                return;
            } else if ("original_message_client_context".equals(str)) {
                if (c16l.A11() != C16R.A0G) {
                    str2 = c16l.A1P();
                }
                abstractC81003jU.A03 = str2;
                return;
            } else {
                if (!"date_created_ms".equals(str) && !"task_creation_time_ms".equals(str) && !"timestamp".equals(str)) {
                    return;
                }
                abstractC81003jU.A00 = c16l.A0y();
                return;
            }
        }
        if (c16l.A11() != C16R.A0G) {
            str2 = c16l.A1P();
        }
        abstractC81003jU.A04 = str2;
    }
}
