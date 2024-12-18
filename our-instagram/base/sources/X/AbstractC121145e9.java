package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5e9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC121145e9 {
    public static final Map A00;
    public static final Map A01;

    public static final boolean A00(String str) {
        C14360o3.A0B(str, 0);
        if (!str.equals("direct_user_search_nullstate") && !str.equals("direct_ibc_nullstate") && !str.equals("direct_user_search_keypressed")) {
            return false;
        }
        return true;
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        A00 = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        A01 = linkedHashMap2;
        linkedHashMap.put("reshare_share_sheet", "direct_target");
        linkedHashMap.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap.put("story_share_sheet", "direct_target");
        linkedHashMap.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap.put("direct_user_search_nullstate", "direct_target");
        linkedHashMap.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap.put("direct_user_search_nullstate", "direct_target");
        linkedHashMap.put("direct_inbox_active_now", "direct_target");
        linkedHashMap.put("forwarding_recipient_sheet", "direct_target");
        linkedHashMap.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap.put("call_recipients", "direct_target");
        linkedHashMap.put("direct_ibc_inbox_discovery", "direct_target");
        linkedHashMap.put("direct_ibc_inbox_invitations", "direct_target");
        linkedHashMap.put("direct_ibc_inbox_discovery_nullstate", "direct_target");
        linkedHashMap2.put("reshare_share_sheet", "direct_target");
        linkedHashMap2.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap2.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap2.put("direct_user_search_nullstate", "direct_target");
        linkedHashMap2.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap2.put("direct_user_search_nullstate", "direct_target");
        linkedHashMap2.put("direct_inbox_active_now", "direct_target");
        linkedHashMap2.put("direct_user_search_keypressed", "direct_target");
        linkedHashMap2.put("call_recipients", "direct_target");
        linkedHashMap2.put("direct_ibc_inbox_discovery", "direct_target");
        linkedHashMap2.put("direct_ibc_inbox_invitations", "direct_target");
        linkedHashMap2.put("direct_ibc_inbox_discovery_nullstate", "direct_target");
    }

    public static final boolean A01(String str) {
        if (!str.equals("reshare_share_sheet") && !str.equals("story_share_sheet") && !str.equals("forwarding_recipient_sheet")) {
            return false;
        }
        return true;
    }
}
