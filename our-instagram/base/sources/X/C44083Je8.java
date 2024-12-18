package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Je8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44083Je8 extends AbstractC29601bb {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44083Je8(C1YP c1yp, Object obj, int i) {
        super(c1yp);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        switch (this.A00) {
            case 0:
                return "DELETE FROM bff_ranked_user_model";
            case 1:
                return "DELETE FROM call_recipients_ranked_user_model";
            case 2:
                return "DELETE FROM message_deletes_table WHERE thread_jid == ?";
            case 3:
                return "DELETE FROM message_deletes_table WHERE item_id < ?";
            case 4:
                return "DELETE FROM message_updates_table WHERE thread_jid == ? AND target_item_id == ?";
            case 5:
                return "DELETE FROM message_updates_table WHERE thread_jid == ?";
            case 6:
                return "DELETE FROM message_updates_table WHERE hidden_ts_sec < ?";
            case 7:
                return "\n    DELETE FROM note_entities_data\n    WHERE entity_index NOT IN (\n      SELECT entity_index\n      FROM note_entities_data\n      WHERE stored_time > ?\n      ORDER BY stored_time DESC\n      LIMIT ?\n    )\n  ";
            case 8:
                return "DELETE FROM note_entities_data";
            case 9:
                return "\n    DELETE FROM participant_device_change WHERE user_id = ?\n  ";
            case 10:
                return "\n    DELETE FROM security_alert WHERE id = ?\n  ";
            case 11:
                return "\n    DELETE FROM security_alert WHERE user_id = ?\n  ";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "\n    UPDATE security_alert\n    SET first_read_timestamp_ms = CURRENT_TIMESTAMP\n    WHERE user_id = ?\n      AND created_timestamp_ms >= ?\n  ";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "\n    UPDATE security_alert\n    SET activity_feed_read_timestamp_ms = CURRENT_TIMESTAMP\n    WHERE id = ?\n  ";
            case 14:
                return "\n    UPDATE security_alert\n    SET is_confirm = ?\n    WHERE id = ?\n  ";
            case Process.SIGTERM /* 15 */:
                return "\n    DELETE FROM security_alert WHERE user_id = ? AND created_timestamp_ms < ?;\n      ";
            case 16:
                return "\n    DELETE FROM medias\n    WHERE id = ?\n      AND type = ?";
            case 17:
                return "\n    DELETE FROM medias\n    WHERE type = ?";
            case 18:
                return "\n    DELETE FROM medias\n    WHERE stored_time <= ? \n      AND type = ?";
            case Process.SIGSTOP /* 19 */:
                return "DELETE FROM suggestions WHERE suggestion_id = ?";
            case 20:
                return "DELETE FROM suggestions WHERE suggestion_mode = ?";
            case 21:
                return "DELETE FROM qs_realtime_signals WHERE timestamp < ?";
            case 22:
                return "DELETE FROM suggested_users";
            default:
                return "DELETE FROM suggested_users WHERE CAST(last_timestamp AS LONG) < ?";
        }
    }
}
