package X;

import com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.MessageDeletesDao;
import java.util.Arrays;

/* renamed from: X.99g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2058099g {
    public static final C1Ym A00 = new C1Ym() { // from class: X.99h
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `temp_messages_table` \n(`thread_jid` INTEGER NOT NULL, \n`sender_jid` INTEGER NOT NULL, \n`item_id` TEXT NOT NULL, \n`payload` TEXT NOT NULL, \n`hidden` INTEGER NOT NULL, \n`shh` INTEGER NOT NULL, \n`offline_threading_id` TEXT NOT NULL, \n`message_expiration_ts_sec` INTEGER, \n`hidden_ts_sec` INTEGER, \nPRIMARY KEY(`thread_jid`, `item_id`))");
            interfaceC37481ol.ATG("          INSERT INTO `temp_messages_table`\n          (`thread_jid`, `sender_jid`, `item_id`, `payload`, `hidden`, `shh`, \n          `offline_threading_id`, `message_expiration_ts_sec`, `hidden_ts_sec`)\n          SELECT `thread_jid`, `sender_jid`, `item_id`, `payload`, `hidden`, `shh`, \n          `offline_threading_id`, `message_expiration_ts_sec`, `hidden_ts_sec`\n          FROM messages_table");
            interfaceC37481ol.ATG("DROP TABLE messages_table");
            interfaceC37481ol.ATG("ALTER TABLE `temp_messages_table` RENAME TO messages_table");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_item_id` ON `messages_table` (`item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_offline_threading_id` ON `messages_table` (`offline_threading_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_message_expiration_ts_sec` ON `messages_table` (`message_expiration_ts_sec`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_hidden_ts_sec` ON `messages_table` (`hidden_ts_sec`)");
            interfaceC37481ol.ATG("          CREATE TABLE IF NOT EXISTS `temp_message_updates` \n          (`thread_jid` INTEGER NOT NULL, \n          `sender_jid` INTEGER NOT NULL, \n          `item_id` TEXT NOT NULL, \n          `target_item_id` TEXT NOT NULL, \n          `payload` TEXT NOT NULL, \n          `offline_threading_id` TEXT NOT NULL, \n          `hidden_ts_sec` INTEGER, \n          PRIMARY KEY(`thread_jid`, `item_id`))");
            interfaceC37481ol.ATG("INSERT INTO `temp_message_updates`\n(`thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`, `hidden_ts_sec`)\nSELECT `thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`, `hidden_ts_sec`\nFROM message_updates_table");
            interfaceC37481ol.ATG("DROP TABLE message_updates_table");
            interfaceC37481ol.ATG("ALTER TABLE `temp_message_updates` RENAME TO message_updates_table");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_thread_jid_target_item_id` ON `message_updates_table` (`thread_jid`, `target_item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_target_item_id` ON `message_updates_table` (`target_item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_offline_threading_id` ON `message_updates_table` (`offline_threading_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_hidden_ts_sec` ON `message_updates_table` (`hidden_ts_sec`)");
            interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `temp_message_deletes` \n(`thread_jid` INTEGER NOT NULL, \n`sender_jid` INTEGER NOT NULL, \n`item_id` TEXT NOT NULL, \n`target_item_id` TEXT NOT NULL, \n`payload` TEXT NOT NULL, \n`offline_threading_id` TEXT NOT NULL, \nPRIMARY KEY(`thread_jid`, `item_id`))");
            interfaceC37481ol.ATG("INSERT INTO `temp_message_deletes`\n(`thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`)\nSELECT `thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`\n FROM message_deletes_table");
            interfaceC37481ol.ATG("DROP TABLE message_deletes_table");
            interfaceC37481ol.ATG("ALTER TABLE `temp_message_deletes` RENAME TO message_deletes_table");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_deletes_table_thread_jid_target_item_id` ON `message_deletes_table` (`thread_jid`, `target_item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_deletes_table_offline_threading_id` ON `message_deletes_table` (`offline_threading_id`)");
        }
    };
    public static final C1Ym A01 = new C1Ym() { // from class: X.99i
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE messages_table ADD COLUMN thread_id TEXT NOT NULL DEFAULT ``");
            interfaceC37481ol.ATG("ALTER TABLE message_updates_table ADD COLUMN thread_id TEXT NOT NULL DEFAULT ``");
            interfaceC37481ol.ATG("ALTER TABLE message_deletes_table ADD COLUMN thread_id TEXT NOT NULL DEFAULT ``");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_thread_id` \n  ON `messages_table` (`thread_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_thread_id_item_id` \n  ON `messages_table` (`thread_id`, `item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_thread_id_item_id` \n  ON `message_updates_table` (`thread_id`, `item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_thread_id_target_item_id` \n  ON `message_updates_table` (`thread_id`, `target_item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_deletes_table_thread_id_item_id` \n  ON `message_deletes_table` (`thread_id`, `item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_deletes_table_thread_id_target_item_id` \n  ON `message_deletes_table` (`thread_id`, `target_item_id`)");
        }
    };
    public static final C1Ym A02 = new C1Ym() { // from class: X.99j
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            String format = String.format("ALTER TABLE %s ADD COLUMN `payload_blob` BLOB", Arrays.copyOf(new Object[]{AbstractC2059399u.MESSAGES_TABLE_NAME}, 1));
            C14360o3.A07(format);
            interfaceC37481ol.ATG(format);
            String format2 = String.format("ALTER TABLE %s ADD COLUMN `payload_blob` BLOB", Arrays.copyOf(new Object[]{AbstractC2059499v.MESSAGE_UPDATES_TABLE}, 1));
            C14360o3.A07(format2);
            interfaceC37481ol.ATG(format2);
            String format3 = String.format("ALTER TABLE %s ADD COLUMN `payload_blob` BLOB", Arrays.copyOf(new Object[]{MessageDeletesDao.MESSAGE_DELETES_TABLE}, 1));
            C14360o3.A07(format3);
            interfaceC37481ol.ATG(format3);
        }
    };
    public static final C1Ym A03 = new C1Ym() { // from class: X.99k
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `temp_messages_table` (\n`thread_jid` INTEGER NOT NULL, \n`sender_jid` INTEGER NOT NULL, \n`item_id` TEXT NOT NULL, \n`payload` TEXT NOT NULL, \n`hidden` INTEGER NOT NULL, \n`shh` INTEGER NOT NULL, \n`offline_threading_id` TEXT NOT NULL, \n`message_expiration_ts_sec` INTEGER, \n`hidden_ts_sec` INTEGER, \nPRIMARY KEY(`thread_jid`, `item_id`))");
            interfaceC37481ol.ATG("          INSERT INTO `temp_messages_table`\n          (`thread_jid`, `sender_jid`, `item_id`, `payload`, `hidden`, `shh`, \n          `offline_threading_id`, `message_expiration_ts_sec`, `hidden_ts_sec`)\n          SELECT `thread_jid`, `sender_jid`, `item_id`, `payload`, `hidden`, `shh`, \n          `offline_threading_id`, `message_expiration_ts_sec`, `hidden_ts_sec`\n          FROM messages_table");
            interfaceC37481ol.ATG("DROP TABLE messages_table");
            interfaceC37481ol.ATG("ALTER TABLE `temp_messages_table` RENAME TO messages_table");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_item_id` ON `messages_table` (`item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_offline_threading_id` ON `messages_table` (`offline_threading_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_message_expiration_ts_sec` ON `messages_table` (`message_expiration_ts_sec`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_hidden_ts_sec` ON `messages_table` (`hidden_ts_sec`)");
            interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `temp_message_updates` (\n`thread_jid` INTEGER NOT NULL, \n`sender_jid` INTEGER NOT NULL, \n`item_id` TEXT NOT NULL, \n`target_item_id` TEXT NOT NULL, \n`payload` TEXT NOT NULL, \n`offline_threading_id` TEXT NOT NULL, \n`hidden_ts_sec` INTEGER, \nPRIMARY KEY(`thread_jid`, `item_id`))");
            interfaceC37481ol.ATG("INSERT INTO `temp_message_updates`\n(`thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`, `hidden_ts_sec`)\nSELECT `thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`, `hidden_ts_sec`\nFROM message_updates_table");
            interfaceC37481ol.ATG("DROP TABLE message_updates_table");
            interfaceC37481ol.ATG("ALTER TABLE `temp_message_updates` RENAME TO message_updates_table");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_thread_jid_target_item_id` ON `message_updates_table` (`thread_jid`, `target_item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_target_item_id` ON `message_updates_table` (`target_item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_offline_threading_id` ON `message_updates_table` (`offline_threading_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_hidden_ts_sec` ON `message_updates_table` (`hidden_ts_sec`)");
            interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `temp_message_deletes` (\n`thread_jid` INTEGER NOT NULL, \n`sender_jid` INTEGER NOT NULL, \n`item_id` TEXT NOT NULL, \n`target_item_id` TEXT NOT NULL, \n`payload` TEXT NOT NULL, \n`offline_threading_id` TEXT NOT NULL, \nPRIMARY KEY(`thread_jid`, `item_id`))");
            interfaceC37481ol.ATG("INSERT INTO `temp_message_deletes`\n(`thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`)\nSELECT `thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`\n FROM message_deletes_table");
            interfaceC37481ol.ATG("DROP TABLE message_deletes_table");
            interfaceC37481ol.ATG("ALTER TABLE `temp_message_deletes` RENAME TO message_deletes_table");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_deletes_table_thread_jid_target_item_id` ON `message_deletes_table` (`thread_jid`, `target_item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_deletes_table_offline_threading_id` ON `message_deletes_table` (`offline_threading_id`)");
        }
    };
    public static final C1Ym A04 = new C1Ym() { // from class: X.99l
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("DELETE FROM `messages_table`\nWHERE shh == 3 OR payload LIKE '%\"is_dual_send\":true%' ");
            interfaceC37481ol.ATG("UPDATE `messages_table` SET shh = 1 \nWHERE shh = 0 AND payload LIKE '%\"product_type\":\"SHH_MODE\"%'  ");
        }
    };
    public static final C1Ym A05 = new C1Ym() { // from class: X.99m
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
        }
    };
    public static final C1Ym A06 = new C1Ym() { // from class: X.99n
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("DELETE FROM `messages_table` WHERE payload_blob IS NULL");
            interfaceC37481ol.ATG("DELETE FROM `message_updates_table` WHERE payload_blob IS NULL");
            interfaceC37481ol.ATG("DELETE FROM `message_deletes_table` WHERE payload_blob IS NULL");
        }
    };
    public static final C1Ym A07 = new C1Ym() { // from class: X.99o
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
        }
    };
    public static final C1Ym A08 = new C1Ym() { // from class: X.99p
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE `messages_table` ADD COLUMN `message_deletion_ts_sec` INTEGER DEFAULT NULL");
        }
    };
    public static final C1Ym A09 = new C1Ym() { // from class: X.99q
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `temp_messages_table` (\n`thread_jid` INTEGER NOT NULL, \n`sender_jid` INTEGER NOT NULL, \n`item_id` TEXT NOT NULL, \n`payload` TEXT NOT NULL, \n`payload_blob` BLOB,\n`hidden` INTEGER NOT NULL, \n`shh` INTEGER NOT NULL, \n`offline_threading_id` TEXT NOT NULL, \n`message_expiration_ts_sec` INTEGER, \n`hidden_ts_sec` INTEGER, \nPRIMARY KEY(`thread_jid`, `item_id`))");
            interfaceC37481ol.ATG("          INSERT INTO `temp_messages_table`\n          (`thread_jid`, `sender_jid`, `item_id`, `payload`, `payload_blob`, `hidden`, `shh`, \n          `offline_threading_id`, `message_expiration_ts_sec`, `hidden_ts_sec`)\n          SELECT `thread_jid`, `sender_jid`, `item_id`, `payload`, `payload_blob` , `hidden`, `shh`, \n          `offline_threading_id`, `message_expiration_ts_sec`, `hidden_ts_sec`\n          FROM messages_table");
            interfaceC37481ol.ATG("DROP TABLE messages_table");
            interfaceC37481ol.ATG("ALTER TABLE `temp_messages_table` RENAME TO messages_table");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_item_id` ON `messages_table` (`item_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_offline_threading_id` ON `messages_table` (`offline_threading_id`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_message_expiration_ts_sec` ON `messages_table` (`message_expiration_ts_sec`)");
            interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_hidden_ts_sec` ON `messages_table` (`hidden_ts_sec`)");
        }
    };
}
