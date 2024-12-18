package X;

/* renamed from: X.JbH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43906JbH extends AbstractC29571bY {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43906JbH(C1YP c1yp, Object obj, int i) {
        super(c1yp);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0104  */
    @Override // X.AbstractC29571bY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC37561ot r5, java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43906JbH.bind(X.1ot, java.lang.Object):void");
    }

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        switch (this.A00) {
            case 0:
                return "INSERT OR REPLACE INTO `message_deletes_table` (`thread_jid`,`sender_jid`,`item_id`,`target_item_id`,`payload`,`payload_blob`,`offline_threading_id`) VALUES (?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `message_updates_table` (`thread_jid`,`sender_jid`,`item_id`,`target_item_id`,`payload`,`payload_blob`,`offline_threading_id`,`hidden_ts_sec`) VALUES (?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `note_entities_data` (`entity_id`,`data`,`entity_index`,`entity_type`,`stored_time`) VALUES (?,?,?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `participant_device_change` (`id`,`user_id`,`participantUserId`,`device_name`,`device_change_type`,`device_change_timestamp_ms`,`should_display_device_change_admin_message`,`is_interop_participant`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `security_alert` (`id`,`user_id`,`crypto_mailbox_type`,`device_change_type`,`device_id`,`created_timestamp_ms`,`first_read_timestamp_ms`,`model`,`platform`,`location`,`activity_feed_read_timestamp_ms`,`latitude`,`longitude`,`is_confirm`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `medias` (`id`,`type`,`data`,`stored_time`,`ranking_score`) VALUES (?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `suggestion_medium` (`id`,`medium_id`,`suggestion_id`) VALUES (nullif(?, 0),?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `suggestions` (`suggestion_id`,`title`,`subtitle`,`concept`,`start_time`,`end_time`,`suggestion_mode`,`trip`,`location`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `qs_realtime_signals` (`signal_id`,`signal_type`,`item_id`,`item_type`,`surface_type`,`container_module`,`inventory_source`,`signal_status`,`timestamp`,`signal_data`,`meta_idad_id`,`meta_idcampaign_id`,`meta_idapp_id`,`meta_idpage_id`,`meta_idactor_id`,`meta_idmedia_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `suggested_users` (`user_id`,`impression_timestamps`,`last_timestamp`) VALUES (?,?,?)";
        }
    }
}
