package androidx.work.impl;

import X.AbstractC28801aI;
import X.AbstractC28981ab;
import X.C1114450i;
import X.C1120653v;
import X.C1Ym;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C2M2;
import X.C2M4;
import X.C2M5;
import X.C2M6;
import X.C2M9;
import X.C2MA;
import X.C2MC;
import X.C2MD;
import X.C2PR;
import X.C2TF;
import X.C2TZ;
import X.C37471ok;
import X.C52202aL;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile C2MD A00;
    public volatile C2M4 A01;
    public volatile C2MC A02;
    public volatile C2M6 A03;
    public volatile C2M9 A04;
    public volatile C2MA A05;
    public volatile C2M2 A06;
    public volatile C2M5 A07;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C2M4 A00() {
        C2M4 c2m4;
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 == null) {
                this.A01 = new C1114450i(this);
            }
            c2m4 = this.A01;
        }
        return c2m4;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C2MC A01() {
        C2MC c2mc;
        if (this.A02 != null) {
            return this.A02;
        }
        synchronized (this) {
            if (this.A02 == null) {
                this.A02 = new C2MC(this) { // from class: X.2Ti
                    public final AbstractC29571bY A00;
                    public final C1YP A01;

                    @Override // X.C2MC
                    public final Long BPD(final String key) {
                        TreeMap treeMap = C37581ov.A08;
                        C37581ov A00 = AbstractC37591ow.A00("SELECT long_value FROM Preference where `key`=?", 1);
                        A00.ADp(1, key);
                        C1YP c1yp = this.A01;
                        c1yp.assertNotSuspendingTransaction();
                        Long l = null;
                        Cursor query = c1yp.query(A00, (CancellationSignal) null);
                        try {
                            if (query.moveToFirst() && !query.isNull(0)) {
                                l = Long.valueOf(query.getLong(0));
                            }
                            return l;
                        } finally {
                            query.close();
                            A00.A00();
                        }
                    }

                    @Override // X.C2MC
                    public final void COf(final C2YH preference) {
                        C1YP c1yp = this.A01;
                        c1yp.assertNotSuspendingTransaction();
                        c1yp.beginTransaction();
                        try {
                            this.A00.insert(preference);
                            c1yp.setTransactionSuccessful();
                        } finally {
                            c1yp.endTransaction();
                        }
                    }

                    {
                        this.A01 = this;
                        this.A00 = new AbstractC29571bY(this) { // from class: X.2Tk
                            @Override // X.AbstractC29601bb
                            public final String createQuery() {
                                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
                            }

                            @Override // X.AbstractC29571bY
                            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot stmt, Object value) {
                                C2YH c2yh = (C2YH) value;
                                stmt.ADp(1, c2yh.A01);
                                Long l = c2yh.A00;
                                if (l == null) {
                                    stmt.ADj(2);
                                } else {
                                    stmt.ADi(2, l.longValue());
                                }
                            }
                        };
                    }
                };
            }
            c2mc = this.A02;
        }
        return c2mc;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C2M6 A02() {
        C2M6 c2m6;
        if (this.A03 != null) {
            return this.A03;
        }
        synchronized (this) {
            if (this.A03 == null) {
                this.A03 = new C2PR(this);
            }
            c2m6 = this.A03;
        }
        return c2m6;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C2M9 A03() {
        C2M9 c2m9;
        if (this.A04 != null) {
            return this.A04;
        }
        synchronized (this) {
            if (this.A04 == null) {
                this.A04 = new C1120653v(this);
            }
            c2m9 = this.A04;
        }
        return c2m9;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C2MA A04() {
        C2MA c2ma;
        if (this.A05 != null) {
            return this.A05;
        }
        synchronized (this) {
            if (this.A05 == null) {
                this.A05 = new C2TZ(this);
            }
            c2ma = this.A05;
        }
        return c2ma;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C2M2 A05() {
        C2M2 c2m2;
        if (this.A06 != null) {
            return this.A06;
        }
        synchronized (this) {
            if (this.A06 == null) {
                this.A06 = new C2TF(this);
            }
            c2m2 = this.A06;
        }
        return c2m2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C2M5 A06() {
        C2M5 c2m5;
        if (this.A07 != null) {
            return this.A07;
        }
        synchronized (this) {
            if (this.A07 == null) {
                this.A07 = new C52202aL(this);
            }
            c2m5 = this.A07;
        }
        return c2m5;
    }

    @Override // X.C1YP
    public final InterfaceC29101an createOpenHelper(C28381Yz configuration) {
        return configuration.A02.AL5(AbstractC28981ab.A00(configuration.A00, new C28861aP(configuration, new AbstractC28801aI() { // from class: X.2Ln
            @Override // X.AbstractC28801aI
            public final void onPostMigrate(InterfaceC37481ol _db) {
            }

            @Override // X.AbstractC28801aI
            public final A6Q onValidateSchema(InterfaceC37481ol _db) {
                StringBuilder sb;
                String str;
                String str2;
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new C63003SaR("work_spec_id", "TEXT", null, 1, 1, true));
                hashMap.put("prerequisite_id", new C63003SaR("prerequisite_id", "TEXT", null, 2, 1, true));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new C23010ACk("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                hashSet.add(new C23010ACk("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new SP3("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
                hashSet2.add(new SP3("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), Arrays.asList("ASC"), false));
                C23008ACh c23008ACh = new C23008ACh("Dependency", hashMap, hashSet, hashSet2);
                C23008ACh A00 = RrF.A00(_db, "Dependency");
                if (!c23008ACh.equals(A00)) {
                    sb = new StringBuilder();
                    str2 = "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n";
                } else {
                    HashMap hashMap2 = new HashMap(30);
                    hashMap2.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TEXT", null, 1, 1, true));
                    hashMap2.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, new C63003SaR(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, "INTEGER", null, 0, 1, true));
                    hashMap2.put("worker_class_name", new C63003SaR("worker_class_name", "TEXT", null, 0, 1, true));
                    hashMap2.put("input_merger_class_name", new C63003SaR("input_merger_class_name", "TEXT", null, 0, 1, true));
                    hashMap2.put("input", new C63003SaR("input", "BLOB", null, 0, 1, true));
                    hashMap2.put("output", new C63003SaR("output", "BLOB", null, 0, 1, true));
                    hashMap2.put("initial_delay", new C63003SaR("initial_delay", "INTEGER", null, 0, 1, true));
                    hashMap2.put("interval_duration", new C63003SaR("interval_duration", "INTEGER", null, 0, 1, true));
                    hashMap2.put("flex_duration", new C63003SaR("flex_duration", "INTEGER", null, 0, 1, true));
                    hashMap2.put("run_attempt_count", new C63003SaR("run_attempt_count", "INTEGER", null, 0, 1, true));
                    hashMap2.put("backoff_policy", new C63003SaR("backoff_policy", "INTEGER", null, 0, 1, true));
                    hashMap2.put("backoff_delay_duration", new C63003SaR("backoff_delay_duration", "INTEGER", null, 0, 1, true));
                    hashMap2.put("last_enqueue_time", new C63003SaR("last_enqueue_time", "INTEGER", "-1", 0, 1, true));
                    hashMap2.put("minimum_retention_duration", new C63003SaR("minimum_retention_duration", "INTEGER", null, 0, 1, true));
                    hashMap2.put("schedule_requested_at", new C63003SaR("schedule_requested_at", "INTEGER", null, 0, 1, true));
                    hashMap2.put("run_in_foreground", new C63003SaR("run_in_foreground", "INTEGER", null, 0, 1, true));
                    hashMap2.put("out_of_quota_policy", new C63003SaR("out_of_quota_policy", "INTEGER", null, 0, 1, true));
                    hashMap2.put("period_count", new C63003SaR("period_count", "INTEGER", "0", 0, 1, true));
                    hashMap2.put("generation", new C63003SaR("generation", "INTEGER", "0", 0, 1, true));
                    hashMap2.put("next_schedule_time_override", new C63003SaR("next_schedule_time_override", "INTEGER", "9223372036854775807", 0, 1, true));
                    hashMap2.put("next_schedule_time_override_generation", new C63003SaR("next_schedule_time_override_generation", "INTEGER", "0", 0, 1, true));
                    hashMap2.put("stop_reason", new C63003SaR("stop_reason", "INTEGER", "-256", 0, 1, true));
                    hashMap2.put("required_network_type", new C63003SaR("required_network_type", "INTEGER", null, 0, 1, true));
                    hashMap2.put("requires_charging", new C63003SaR("requires_charging", "INTEGER", null, 0, 1, true));
                    hashMap2.put("requires_device_idle", new C63003SaR("requires_device_idle", "INTEGER", null, 0, 1, true));
                    hashMap2.put("requires_battery_not_low", new C63003SaR("requires_battery_not_low", "INTEGER", null, 0, 1, true));
                    hashMap2.put("requires_storage_not_low", new C63003SaR("requires_storage_not_low", "INTEGER", null, 0, 1, true));
                    hashMap2.put("trigger_content_update_delay", new C63003SaR("trigger_content_update_delay", "INTEGER", null, 0, 1, true));
                    hashMap2.put("trigger_max_content_delay", new C63003SaR("trigger_max_content_delay", "INTEGER", null, 0, 1, true));
                    hashMap2.put("content_uri_triggers", new C63003SaR("content_uri_triggers", "BLOB", null, 0, 1, true));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(2);
                    hashSet4.add(new SP3("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), Arrays.asList("ASC"), false));
                    hashSet4.add(new SP3("index_WorkSpec_last_enqueue_time", Arrays.asList("last_enqueue_time"), Arrays.asList("ASC"), false));
                    C23008ACh c23008ACh2 = new C23008ACh("WorkSpec", hashMap2, hashSet3, hashSet4);
                    C23008ACh A002 = RrF.A00(_db, "WorkSpec");
                    if (!c23008ACh2.equals(A002)) {
                        sb = new StringBuilder();
                        str = "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n";
                    } else {
                        HashMap hashMap3 = new HashMap(2);
                        hashMap3.put("tag", new C63003SaR("tag", "TEXT", null, 1, 1, true));
                        hashMap3.put("work_spec_id", new C63003SaR("work_spec_id", "TEXT", null, 2, 1, true));
                        HashSet hashSet5 = new HashSet(1);
                        hashSet5.add(new C23010ACk("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                        HashSet hashSet6 = new HashSet(1);
                        hashSet6.add(new SP3("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
                        c23008ACh = new C23008ACh("WorkTag", hashMap3, hashSet5, hashSet6);
                        A00 = RrF.A00(_db, "WorkTag");
                        if (!c23008ACh.equals(A00)) {
                            sb = new StringBuilder();
                            str2 = "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n";
                        } else {
                            HashMap hashMap4 = new HashMap(3);
                            hashMap4.put("work_spec_id", new C63003SaR("work_spec_id", "TEXT", null, 1, 1, true));
                            hashMap4.put("generation", new C63003SaR("generation", "INTEGER", "0", 2, 1, true));
                            hashMap4.put("system_id", new C63003SaR("system_id", "INTEGER", null, 0, 1, true));
                            HashSet hashSet7 = new HashSet(1);
                            hashSet7.add(new C23010ACk("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                            c23008ACh = new C23008ACh("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                            A00 = RrF.A00(_db, "SystemIdInfo");
                            if (!c23008ACh.equals(A00)) {
                                sb = new StringBuilder();
                                str2 = "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n";
                            } else {
                                HashMap hashMap5 = new HashMap(2);
                                hashMap5.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "TEXT", null, 1, 1, true));
                                hashMap5.put("work_spec_id", new C63003SaR("work_spec_id", "TEXT", null, 2, 1, true));
                                HashSet hashSet8 = new HashSet(1);
                                hashSet8.add(new C23010ACk("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                                HashSet hashSet9 = new HashSet(1);
                                hashSet9.add(new SP3("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
                                c23008ACh = new C23008ACh("WorkName", hashMap5, hashSet8, hashSet9);
                                A00 = RrF.A00(_db, "WorkName");
                                if (!c23008ACh.equals(A00)) {
                                    sb = new StringBuilder();
                                    str2 = "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n";
                                } else {
                                    HashMap hashMap6 = new HashMap(2);
                                    hashMap6.put("work_spec_id", new C63003SaR("work_spec_id", "TEXT", null, 1, 1, true));
                                    hashMap6.put(ReactProgressBarViewManager.PROP_PROGRESS, new C63003SaR(ReactProgressBarViewManager.PROP_PROGRESS, "BLOB", null, 0, 1, true));
                                    HashSet hashSet10 = new HashSet(1);
                                    hashSet10.add(new C23010ACk("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                                    c23008ACh = new C23008ACh("WorkProgress", hashMap6, hashSet10, new HashSet(0));
                                    A00 = RrF.A00(_db, "WorkProgress");
                                    if (!c23008ACh.equals(A00)) {
                                        sb = new StringBuilder();
                                        str2 = "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n";
                                    } else {
                                        HashMap hashMap7 = new HashMap(2);
                                        hashMap7.put("key", new C63003SaR("key", "TEXT", null, 1, 1, true));
                                        hashMap7.put("long_value", new C63003SaR("long_value", "INTEGER", null, 0, 1, false));
                                        c23008ACh2 = new C23008ACh("Preference", hashMap7, new HashSet(0), new HashSet(0));
                                        A002 = RrF.A00(_db, "Preference");
                                        if (!c23008ACh2.equals(A002)) {
                                            sb = new StringBuilder();
                                            str = "Preference(androidx.work.impl.model.Preference).\n Expected:\n";
                                        } else {
                                            return new A6Q(true, null);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    sb.append(str);
                    sb.append(c23008ACh2);
                    sb.append("\n Found:\n");
                    sb.append(A002);
                    return new A6Q(false, sb.toString());
                }
                sb.append(str2);
                sb.append(c23008ACh);
                sb.append("\n Found:\n");
                sb.append(A00);
                return new A6Q(false, sb.toString());
            }

            {
                super(20);
            }

            @Override // X.AbstractC28801aI
            public final void createAllTables(InterfaceC37481ol _db) {
                _db.ATG("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                _db.ATG("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                _db.ATG("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                _db.ATG("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                _db.ATG("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                _db.ATG("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                _db.ATG("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                _db.ATG("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                _db.ATG("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                _db.ATG("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                _db.ATG("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                _db.ATG("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                _db.ATG("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                _db.ATG("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                _db.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
            }

            @Override // X.AbstractC28801aI
            public final void dropAllTables(InterfaceC37481ol _db) {
                _db.ATG("DROP TABLE IF EXISTS `Dependency`");
                _db.ATG("DROP TABLE IF EXISTS `WorkSpec`");
                _db.ATG("DROP TABLE IF EXISTS `WorkTag`");
                _db.ATG("DROP TABLE IF EXISTS `SystemIdInfo`");
                _db.ATG("DROP TABLE IF EXISTS `WorkName`");
                _db.ATG("DROP TABLE IF EXISTS `WorkProgress`");
                _db.ATG("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                List list = workDatabase_Impl.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((C2LL) workDatabase_Impl.mCallbacks.get(i)).A01(_db);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onCreate(InterfaceC37481ol _db) {
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                List list = workDatabase_Impl.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((C2LL) workDatabase_Impl.mCallbacks.get(i)).A00(_db);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onOpen(InterfaceC37481ol _db) {
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                workDatabase_Impl.mDatabase = _db;
                _db.ATG("PRAGMA foreign_keys = ON");
                workDatabase_Impl.internalInitInvalidationTracker(_db);
                List list = workDatabase_Impl.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((C2LL) workDatabase_Impl.mCallbacks.get(i)).A02(_db);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onPreMigrate(InterfaceC37481ol _db) {
                C3EP.A01(_db);
            }
        }, "7d73d21f1bd82c9e5268b6dcf9fde2cb", "3071c8717539de5d5353f4c8cd59a032"), configuration.A04, false, false));
    }

    @Override // X.C1YP
    public final List getAutoMigrations(Map autoMigrationSpecsMap) {
        return Arrays.asList(new C1Ym() { // from class: X.2Lp
            @Override // X.C1Ym
            public final void migrate(final InterfaceC37481ol database) {
                database.ATG("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                database.ATG("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                database.ATG("DROP TABLE `WorkSpec`");
                database.ATG("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                database.ATG("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                database.ATG("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            }
        }, new C1Ym() { // from class: X.2Lq
            public final InterfaceC48752Lt A00 = new Object();

            @Override // X.C1Ym
            public final void migrate(final InterfaceC37481ol database) {
                database.ATG("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                database.ATG("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                database.ATG("DROP TABLE `WorkSpec`");
                database.ATG("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                database.ATG("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                database.ATG("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                this.A00.Da1(database);
            }
        }, new C1Ym() { // from class: X.2Lv
            @Override // X.C1Ym
            public final void migrate(final InterfaceC37481ol database) {
                database.ATG("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                database.ATG("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                database.ATG("DROP TABLE `WorkSpec`");
                database.ATG("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                database.ATG("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                database.ATG("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            }
        }, new C1Ym() { // from class: X.2Lw
            @Override // X.C1Ym
            public final void migrate(final InterfaceC37481ol database) {
                database.ATG("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
                database.ATG("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
            }
        }, new C1Ym() { // from class: X.2Lx
            @Override // X.C1Ym
            public final void migrate(final InterfaceC37481ol database) {
                database.ATG("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
            }
        }, new C1Ym() { // from class: X.2Ly
            public final InterfaceC48752Lt A00 = new Object();

            @Override // X.C1Ym
            public final void migrate(final InterfaceC37481ol database) {
                database.ATG("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                database.ATG("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                database.ATG("DROP TABLE `WorkSpec`");
                database.ATG("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                database.ATG("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                database.ATG("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                this.A00.Da1(database);
            }
        });
    }

    @Override // X.C1YP
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.C1YP
    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C2M2.class, Collections.emptyList());
        hashMap.put(C2M4.class, Collections.emptyList());
        hashMap.put(C2M5.class, Collections.emptyList());
        hashMap.put(C2M6.class, Collections.emptyList());
        hashMap.put(C2M9.class, Collections.emptyList());
        hashMap.put(C2MA.class, Collections.emptyList());
        hashMap.put(C2MC.class, Collections.emptyList());
        hashMap.put(C2MD.class, Collections.emptyList());
        return hashMap;
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("PRAGMA defer_foreign_keys = TRUE");
            CHx.ATG("DELETE FROM `Dependency`");
            CHx.ATG("DELETE FROM `WorkSpec`");
            CHx.ATG("DELETE FROM `WorkTag`");
            CHx.ATG("DELETE FROM `SystemIdInfo`");
            CHx.ATG("DELETE FROM `WorkName`");
            CHx.ATG("DELETE FROM `WorkProgress`");
            CHx.ATG("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            CHx.E7O("PRAGMA wal_checkpoint(FULL)").close();
            if (!((C37471ok) CHx).A00.inTransaction()) {
                CHx.ATG("VACUUM");
            }
        }
    }
}
