package com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb;

import X.AbstractC2059399u;
import X.AbstractC2059499v;
import X.AbstractC28801aI;
import X.AbstractC28981ab;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C37471ok;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase_Impl;
import com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.MessageDeletesDao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class ArmadilloExpressEncryptedBackupDatabase_Impl extends ArmadilloExpressEncryptedBackupDatabase {
    public volatile MessageDeletesDao A00;
    public volatile AbstractC2059499v A01;
    public volatile AbstractC2059399u A02;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, new HashMap(0), new HashMap(0), AbstractC2059399u.MESSAGES_TABLE_NAME, MessageDeletesDao.MESSAGE_DELETES_TABLE, AbstractC2059499v.MESSAGE_UPDATES_TABLE);
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `messages_table`");
            CHx.ATG("DELETE FROM `message_deletes_table`");
            CHx.ATG("DELETE FROM `message_updates_table`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            CHx.E7O("PRAGMA wal_checkpoint(FULL)").close();
            if (!((C37471ok) CHx).A00.inTransaction()) {
                CHx.ATG("VACUUM");
            }
        }
    }

    @Override // X.C1YP
    public final InterfaceC29101an createOpenHelper(C28381Yz c28381Yz) {
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, new AbstractC28801aI() { // from class: X.99t
            @Override // X.AbstractC28801aI
            public final void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
            }

            {
                super(17);
            }

            @Override // X.AbstractC28801aI
            public final void createAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `messages_table` (`thread_jid` INTEGER NOT NULL, `sender_jid` INTEGER NOT NULL, `item_id` TEXT NOT NULL, `payload` TEXT NOT NULL, `payload_blob` BLOB, `hidden` INTEGER NOT NULL, `shh` INTEGER NOT NULL, `offline_threading_id` TEXT NOT NULL, `message_expiration_ts_sec` INTEGER, `hidden_ts_sec` INTEGER, `message_deletion_ts_sec` INTEGER, PRIMARY KEY(`thread_jid`, `item_id`))");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_item_id` ON `messages_table` (`item_id`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_offline_threading_id` ON `messages_table` (`offline_threading_id`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_message_expiration_ts_sec` ON `messages_table` (`message_expiration_ts_sec`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_messages_table_hidden_ts_sec` ON `messages_table` (`hidden_ts_sec`)");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `message_deletes_table` (`thread_jid` INTEGER NOT NULL, `sender_jid` INTEGER NOT NULL, `item_id` TEXT NOT NULL, `target_item_id` TEXT NOT NULL, `payload` TEXT NOT NULL, `payload_blob` BLOB, `offline_threading_id` TEXT NOT NULL, PRIMARY KEY(`thread_jid`, `item_id`))");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_deletes_table_thread_jid_target_item_id` ON `message_deletes_table` (`thread_jid`, `target_item_id`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_deletes_table_offline_threading_id` ON `message_deletes_table` (`offline_threading_id`)");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `message_updates_table` (`thread_jid` INTEGER NOT NULL, `sender_jid` INTEGER NOT NULL, `item_id` TEXT NOT NULL, `target_item_id` TEXT NOT NULL, `payload` TEXT NOT NULL, `payload_blob` BLOB, `offline_threading_id` TEXT NOT NULL, `hidden_ts_sec` INTEGER, PRIMARY KEY(`thread_jid`, `item_id`))");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_thread_jid_target_item_id` ON `message_updates_table` (`thread_jid`, `target_item_id`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_target_item_id` ON `message_updates_table` (`target_item_id`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_offline_threading_id` ON `message_updates_table` (`offline_threading_id`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_message_updates_table_hidden_ts_sec` ON `message_updates_table` (`hidden_ts_sec`)");
                interfaceC37481ol.ATG(AbstractC111324zv.A00(40));
                interfaceC37481ol.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3c770570a042c4d5015e1ab84459d331')");
            }

            @Override // X.AbstractC28801aI
            public final void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `messages_table`");
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `message_deletes_table`");
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `message_updates_table`");
                List list = ArmadilloExpressEncryptedBackupDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A01(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onCreate(InterfaceC37481ol interfaceC37481ol) {
                List list = ArmadilloExpressEncryptedBackupDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onOpen(InterfaceC37481ol interfaceC37481ol) {
                ArmadilloExpressEncryptedBackupDatabase_Impl armadilloExpressEncryptedBackupDatabase_Impl = ArmadilloExpressEncryptedBackupDatabase_Impl.this;
                armadilloExpressEncryptedBackupDatabase_Impl.mDatabase = interfaceC37481ol;
                armadilloExpressEncryptedBackupDatabase_Impl.internalInitInvalidationTracker(interfaceC37481ol);
                List list = armadilloExpressEncryptedBackupDatabase_Impl.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A02(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final A6Q onValidateSchema(InterfaceC37481ol interfaceC37481ol) {
                StringBuilder sb;
                String str;
                HashMap hashMap = new HashMap(11);
                hashMap.put("thread_jid", new C63003SaR("thread_jid", "INTEGER", null, 1, 1, true));
                hashMap.put("sender_jid", new C63003SaR("sender_jid", "INTEGER", null, 0, 1, true));
                hashMap.put("item_id", new C63003SaR("item_id", "TEXT", null, 2, 1, true));
                hashMap.put("payload", new C63003SaR("payload", "TEXT", null, 0, 1, true));
                hashMap.put("payload_blob", new C63003SaR("payload_blob", "BLOB", null, 0, 1, false));
                hashMap.put("hidden", new C63003SaR("hidden", "INTEGER", null, 0, 1, true));
                hashMap.put("shh", new C63003SaR("shh", "INTEGER", null, 0, 1, true));
                hashMap.put("offline_threading_id", new C63003SaR("offline_threading_id", "TEXT", null, 0, 1, true));
                hashMap.put("message_expiration_ts_sec", new C63003SaR("message_expiration_ts_sec", "INTEGER", null, 0, 1, false));
                hashMap.put("hidden_ts_sec", new C63003SaR("hidden_ts_sec", "INTEGER", null, 0, 1, false));
                hashMap.put("message_deletion_ts_sec", new C63003SaR("message_deletion_ts_sec", "INTEGER", null, 0, 1, false));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(4);
                hashSet2.add(new SP3("index_messages_table_item_id", Arrays.asList("item_id"), Arrays.asList("ASC"), false));
                hashSet2.add(new SP3("index_messages_table_offline_threading_id", Arrays.asList("offline_threading_id"), Arrays.asList("ASC"), false));
                hashSet2.add(new SP3("index_messages_table_message_expiration_ts_sec", Arrays.asList("message_expiration_ts_sec"), Arrays.asList("ASC"), false));
                hashSet2.add(new SP3("index_messages_table_hidden_ts_sec", Arrays.asList("hidden_ts_sec"), Arrays.asList("ASC"), false));
                C23008ACh c23008ACh = new C23008ACh(AbstractC2059399u.MESSAGES_TABLE_NAME, hashMap, hashSet, hashSet2);
                C23008ACh A00 = RrF.A00(interfaceC37481ol, AbstractC2059399u.MESSAGES_TABLE_NAME);
                if (!c23008ACh.equals(A00)) {
                    sb = new StringBuilder();
                    str = "messages_table(com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.MessagesDao.Message).\n Expected:\n";
                } else {
                    HashMap hashMap2 = new HashMap(7);
                    hashMap2.put("thread_jid", new C63003SaR("thread_jid", "INTEGER", null, 1, 1, true));
                    hashMap2.put("sender_jid", new C63003SaR("sender_jid", "INTEGER", null, 0, 1, true));
                    hashMap2.put("item_id", new C63003SaR("item_id", "TEXT", null, 2, 1, true));
                    String A002 = AbstractC43591JPw.A00(476);
                    hashMap2.put(A002, new C63003SaR(A002, "TEXT", null, 0, 1, true));
                    hashMap2.put("payload", new C63003SaR("payload", "TEXT", null, 0, 1, true));
                    hashMap2.put("payload_blob", new C63003SaR("payload_blob", "BLOB", null, 0, 1, false));
                    hashMap2.put("offline_threading_id", new C63003SaR("offline_threading_id", "TEXT", null, 0, 1, true));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(2);
                    hashSet4.add(new SP3("index_message_deletes_table_thread_jid_target_item_id", Arrays.asList("thread_jid", A002), Arrays.asList("ASC", "ASC"), false));
                    hashSet4.add(new SP3("index_message_deletes_table_offline_threading_id", Arrays.asList("offline_threading_id"), Arrays.asList("ASC"), false));
                    c23008ACh = new C23008ACh(MessageDeletesDao.MESSAGE_DELETES_TABLE, hashMap2, hashSet3, hashSet4);
                    A00 = RrF.A00(interfaceC37481ol, MessageDeletesDao.MESSAGE_DELETES_TABLE);
                    if (!c23008ACh.equals(A00)) {
                        sb = new StringBuilder();
                        str = "message_deletes_table(com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.MessageDeletesDao.MessageDelete).\n Expected:\n";
                    } else {
                        HashMap hashMap3 = new HashMap(8);
                        hashMap3.put("thread_jid", new C63003SaR("thread_jid", "INTEGER", null, 1, 1, true));
                        hashMap3.put("sender_jid", new C63003SaR("sender_jid", "INTEGER", null, 0, 1, true));
                        hashMap3.put("item_id", new C63003SaR("item_id", "TEXT", null, 2, 1, true));
                        hashMap3.put(A002, new C63003SaR(A002, "TEXT", null, 0, 1, true));
                        hashMap3.put("payload", new C63003SaR("payload", "TEXT", null, 0, 1, true));
                        hashMap3.put("payload_blob", new C63003SaR("payload_blob", "BLOB", null, 0, 1, false));
                        hashMap3.put("offline_threading_id", new C63003SaR("offline_threading_id", "TEXT", null, 0, 1, true));
                        hashMap3.put("hidden_ts_sec", new C63003SaR("hidden_ts_sec", "INTEGER", null, 0, 1, false));
                        HashSet hashSet5 = new HashSet(0);
                        HashSet hashSet6 = new HashSet(4);
                        hashSet6.add(new SP3("index_message_updates_table_thread_jid_target_item_id", Arrays.asList("thread_jid", A002), Arrays.asList("ASC", "ASC"), false));
                        hashSet6.add(new SP3("index_message_updates_table_target_item_id", Arrays.asList(A002), Arrays.asList("ASC"), false));
                        hashSet6.add(new SP3("index_message_updates_table_offline_threading_id", Arrays.asList("offline_threading_id"), Arrays.asList("ASC"), false));
                        hashSet6.add(new SP3("index_message_updates_table_hidden_ts_sec", Arrays.asList("hidden_ts_sec"), Arrays.asList("ASC"), false));
                        c23008ACh = new C23008ACh(AbstractC2059499v.MESSAGE_UPDATES_TABLE, hashMap3, hashSet5, hashSet6);
                        A00 = RrF.A00(interfaceC37481ol, AbstractC2059499v.MESSAGE_UPDATES_TABLE);
                        if (!c23008ACh.equals(A00)) {
                            sb = new StringBuilder();
                            str = "message_updates_table(com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.MessageUpdatesDao.MessageUpdate).\n Expected:\n";
                        } else {
                            return new A6Q(true, null);
                        }
                    }
                }
                sb.append(str);
                sb.append(c23008ACh);
                sb.append("\n Found:\n");
                sb.append(A00);
                return new A6Q(false, sb.toString());
            }

            @Override // X.AbstractC28801aI
            public final void onPreMigrate(InterfaceC37481ol interfaceC37481ol) {
                C3EP.A01(interfaceC37481ol);
            }
        }, "3c770570a042c4d5015e1ab84459d331", "1754e8552ba86a86a72e0026828d9e5f"), c28381Yz.A04, false, false));
    }

    @Override // X.C1YP
    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    @Override // X.C1YP
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.C1YP
    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC2059399u.class, Collections.emptyList());
        hashMap.put(AbstractC2059499v.class, Collections.emptyList());
        hashMap.put(MessageDeletesDao.class, Collections.emptyList());
        return hashMap;
    }
}
