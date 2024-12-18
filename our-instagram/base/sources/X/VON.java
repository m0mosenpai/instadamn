package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GroupMetadata;
import com.instagram.api.schemas.RingSpec;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VON {
    public static Map A00(GroupMetadata groupMetadata) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (groupMetadata.Aa2() != null) {
            linkedHashMap.put("admin_ids", groupMetadata.Aa2());
        }
        if (groupMetadata.AgL() != null) {
            linkedHashMap.put("blocked_user_ids", groupMetadata.AgL());
        }
        groupMetadata.Aka();
        linkedHashMap.put("can_post", Boolean.valueOf(groupMetadata.Aka()));
        if (groupMetadata.Amy() != null) {
            linkedHashMap.put("channel_admin_id", groupMetadata.Amy());
        }
        if (groupMetadata.AnK() != null) {
            linkedHashMap.put("chat_thread_id", groupMetadata.AnK());
        }
        if (groupMetadata.BAU() != null) {
            linkedHashMap.put("group_fbid", groupMetadata.BAU());
        }
        if (groupMetadata.BAf() != null) {
            linkedHashMap.put("group_pk", groupMetadata.BAf());
        }
        groupMetadata.BAh();
        linkedHashMap.put(AbstractC111324zv.A00(117), Boolean.valueOf(groupMetadata.BAh()));
        groupMetadata.BCM();
        linkedHashMap.put("has_pending_admin_invite", Boolean.valueOf(groupMetadata.BCM()));
        if (groupMetadata.BDc() != null) {
            linkedHashMap.put("hidden", groupMetadata.BDc());
        }
        groupMetadata.CVQ();
        linkedHashMap.put("is_group", Boolean.valueOf(groupMetadata.CVQ()));
        groupMetadata.CVS();
        linkedHashMap.put("is_group_full", Boolean.valueOf(groupMetadata.CVS()));
        groupMetadata.CVW();
        linkedHashMap.put("is_group_notes_allowed", Boolean.valueOf(groupMetadata.CVW()));
        groupMetadata.Cbd();
        linkedHashMap.put("is_recommendable", Boolean.valueOf(groupMetadata.Cbd()));
        groupMetadata.Cfp();
        linkedHashMap.put("is_viewer_admin", Boolean.valueOf(groupMetadata.Cfp()));
        groupMetadata.Cft();
        linkedHashMap.put("is_viewer_in_chat_thread", Boolean.valueOf(groupMetadata.Cft()));
        groupMetadata.Cfu();
        linkedHashMap.put("is_viewer_invited", Boolean.valueOf(groupMetadata.Cfu()));
        if (groupMetadata.BPY() != null) {
            linkedHashMap.put("mandatory_approvals_expire_at", groupMetadata.BPY());
        }
        groupMetadata.BXZ();
        linkedHashMap.put("num_admins", Integer.valueOf(groupMetadata.BXZ()));
        groupMetadata.BXc();
        linkedHashMap.put("num_blocked_users", Integer.valueOf(groupMetadata.BXc()));
        groupMetadata.BXp();
        linkedHashMap.put("num_pending_follow_requests", Integer.valueOf(groupMetadata.BXp()));
        groupMetadata.BXq();
        linkedHashMap.put("num_pending_invites", Integer.valueOf(groupMetadata.BXq()));
        groupMetadata.BXr();
        linkedHashMap.put("num_pending_notes", Integer.valueOf(groupMetadata.BXr()));
        groupMetadata.BXs();
        linkedHashMap.put("num_pending_notes_by_viewer", Integer.valueOf(groupMetadata.BXs()));
        groupMetadata.BXt();
        linkedHashMap.put("num_pending_posts", Integer.valueOf(groupMetadata.BXt()));
        groupMetadata.BXu();
        linkedHashMap.put("num_pending_posts_by_viewer", Integer.valueOf(groupMetadata.BXu()));
        if (groupMetadata.BcA() != null) {
            linkedHashMap.put("pending_admin_ids", groupMetadata.BcA());
        }
        if (groupMetadata.BpS() != null) {
            RingSpec BpS = groupMetadata.BpS();
            if (BpS != null) {
                treeUpdaterJNI = BpS.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("ring_spec", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
