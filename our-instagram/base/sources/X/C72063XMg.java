package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.gallery.suggestions.database.SuggestionsDatabase_Impl;
import com.instagram.igtv.persistence.IGTVDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.XMg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72063XMg extends AbstractC28801aI {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72063XMg(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static List A00(C72063XMg c72063XMg, InterfaceC37481ol interfaceC37481ol) {
        C1YP c1yp = (C1YP) c72063XMg.A01;
        c1yp.mDatabase = interfaceC37481ol;
        c1yp.internalInitInvalidationTracker(interfaceC37481ol);
        return c1yp.mCallbacks;
    }

    @Override // X.AbstractC28801aI
    public final void createAllTables(InterfaceC37481ol interfaceC37481ol) {
        String str;
        switch (this.A00) {
            case 0:
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `bff_ranked_user_model` (`igid` TEXT NOT NULL, `entity_type` TEXT NOT NULL, `score` REAL NOT NULL, `username` TEXT, `profile_picture_url` TEXT, PRIMARY KEY(`igid`))");
                AbstractC72046XLm.A0l(interfaceC37481ol, "CREATE TABLE IF NOT EXISTS `call_recipients_ranked_user_model` (`igid` TEXT NOT NULL, `entity_type` TEXT NOT NULL, `score` REAL NOT NULL, `username` TEXT, `profile_picture_url` TEXT, PRIMARY KEY(`igid`))");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9fa95391669f185532ef5e2f5dc372b1')";
                break;
            case 1:
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `note_entities_data` (`entity_id` TEXT NOT NULL, `data` BLOB NOT NULL, `entity_index` INTEGER NOT NULL, `entity_type` INTEGER NOT NULL, `stored_time` INTEGER NOT NULL, PRIMARY KEY(`entity_id`))");
                AbstractC72046XLm.A0l(interfaceC37481ol, "CREATE INDEX IF NOT EXISTS `index_note_entities_data_stored_time` ON `note_entities_data` (`stored_time`)");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '64b9cc273fc8ab43807f96b6e89205d1')";
                break;
            case 2:
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `security_alert` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `crypto_mailbox_type` INTEGER NOT NULL, `device_change_type` INTEGER NOT NULL, `device_id` INTEGER NOT NULL, `created_timestamp_ms` INTEGER, `first_read_timestamp_ms` INTEGER, `model` TEXT, `platform` TEXT, `location` TEXT, `activity_feed_read_timestamp_ms` INTEGER, `latitude` REAL, `longitude` REAL, `is_confirm` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_security_alert_user_id` ON `security_alert` (`user_id`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_security_alert_device_id` ON `security_alert` (`device_id`)");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `participant_device_change` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` TEXT NOT NULL, `participantUserId` INTEGER NOT NULL, `device_name` TEXT, `device_change_type` INTEGER NOT NULL, `device_change_timestamp_ms` INTEGER NOT NULL, `should_display_device_change_admin_message` INTEGER NOT NULL, `is_interop_participant` INTEGER NOT NULL)");
                AbstractC72046XLm.A0l(interfaceC37481ol, "CREATE INDEX IF NOT EXISTS `index_participant_device_change_id` ON `participant_device_change` (`id`)");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8a33cd745df9f5bcd6b94548c17b2894')";
                break;
            case 3:
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `medias` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `data` BLOB NOT NULL, `stored_time` INTEGER NOT NULL, `ranking_score` REAL NOT NULL, PRIMARY KEY(`id`, `type`))");
                AbstractC72046XLm.A0l(interfaceC37481ol, "CREATE INDEX IF NOT EXISTS `index_medias_stored_time` ON `medias` (`stored_time`)");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '96087c341bf499711f9b60c1264a4b2c')";
                break;
            case 4:
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `suggestions` (`suggestion_id` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `concept` TEXT NOT NULL, `start_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `suggestion_mode` TEXT NOT NULL, `trip` INTEGER, `location` TEXT, PRIMARY KEY(`suggestion_id`))");
                AbstractC72046XLm.A0l(interfaceC37481ol, "CREATE TABLE IF NOT EXISTS `suggestion_medium` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `medium_id` TEXT NOT NULL, `suggestion_id` TEXT NOT NULL, FOREIGN KEY(`suggestion_id`) REFERENCES `suggestions`(`suggestion_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1ff21b556f1ac0738d52f2ae83a7be4f')";
                break;
            case 5:
                AbstractC72046XLm.A0l(interfaceC37481ol, "CREATE TABLE IF NOT EXISTS `drafts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_uploading` INTEGER NOT NULL DEFAULT 0, `video_path` TEXT NOT NULL DEFAULT '', `video_orig_rotation` INTEGER NOT NULL DEFAULT 0, `video_orig_width` INTEGER NOT NULL DEFAULT 0, `video_orig_height` INTEGER NOT NULL DEFAULT 0, `duration` INTEGER NOT NULL DEFAULT 0, `title` TEXT NOT NULL DEFAULT '', `description` TEXT NOT NULL DEFAULT '', `series_id` TEXT, `is_unified_video` INTEGER NOT NULL DEFAULT 0, `filter_id` INTEGER NOT NULL DEFAULT 0, `filter_strength` INTEGER NOT NULL DEFAULT 100, `post_crop_aspect_ratio` REAL NOT NULL DEFAULT 0, `is_landscape_surface` INTEGER NOT NULL DEFAULT 0, `is_over_image_custom` INTEGER NOT NULL DEFAULT 0, `cover_image_file_path` TEXT DEFAULT '', `cover_image_width` INTEGER NOT NULL DEFAULT 0, `cover_image_height` INTEGER NOT NULL DEFAULT 0, `cover_image_video_time_mx` INTEGER NOT NULL DEFAULT 0, `is_cover_image_fram_video_edited` INTEGER NOT NULL DEFAULT 0, `is_preview_enabled` INTEGER NOT NULL DEFAULT 0, `preview_crop_coords` TEXT, `profile_crop_coords` TEXT, `is_internal` INTEGER NOT NULL DEFAULT 0, `group_destination_user_id` TEXT, `share_to_facebook` INTEGER NOT NULL DEFAULT 0, `are_captions_enabled` INTEGER NOT NULL DEFAULT 0, `are_comments_disabled` INTEGER NOT NULL DEFAULT 0, `is_funded_content_deal` INTEGER NOT NULL DEFAULT 0, `is_like_and_view_counts_disabled` INTEGER NOT NULL DEFAULT 0, `is_paid_partnership` INTEGER NOT NULL DEFAULT 0, `branded_content_info` TEXT, `partner_boost_enabled` INTEGER NOT NULL DEFAULT 0, `shopping_info` TEXT, `created_timestamp` INTEGER NOT NULL DEFAULT 0, `last_modified_timestamp` INTEGER NOT NULL DEFAULT 0)");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fa0f0287d6550153fc6cd9d504c3a72d')";
                break;
            case 6:
                AbstractC72046XLm.A0l(interfaceC37481ol, "CREATE TABLE IF NOT EXISTS `qs_realtime_signals` (`signal_id` TEXT NOT NULL, `signal_type` TEXT NOT NULL, `item_id` TEXT NOT NULL, `item_type` TEXT NOT NULL, `surface_type` TEXT NOT NULL, `container_module` TEXT NOT NULL, `inventory_source` TEXT NOT NULL, `signal_status` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `signal_data` BLOB NOT NULL, `meta_idad_id` TEXT, `meta_idcampaign_id` TEXT, `meta_idapp_id` TEXT, `meta_idpage_id` TEXT, `meta_idactor_id` TEXT, `meta_idmedia_id` TEXT, PRIMARY KEY(`signal_id`))");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6b331a521c9eacb44b168743dbfa0089')";
                break;
            default:
                AbstractC72046XLm.A0l(interfaceC37481ol, "CREATE TABLE IF NOT EXISTS `suggested_users` (`user_id` TEXT NOT NULL, `impression_timestamps` TEXT NOT NULL, `last_timestamp` TEXT NOT NULL, PRIMARY KEY(`user_id`))");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '89d395671163a6d305db059df658b0ce')";
                break;
        }
        interfaceC37481ol.ATG(str);
    }

    @Override // X.AbstractC28801aI
    public final void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
        switch (this.A00) {
            case 0:
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `bff_ranked_user_model`");
                List A01 = A01(this, interfaceC37481ol, "DROP TABLE IF EXISTS `call_recipients_ranked_user_model`");
                if (A01 != null) {
                    Iterator it = A01.iterator();
                    while (it.hasNext()) {
                        AbstractC72048XLo.A0Q(interfaceC37481ol, it);
                    }
                    return;
                }
                return;
            case 1:
                List A012 = A01(this, interfaceC37481ol, "DROP TABLE IF EXISTS `note_entities_data`");
                if (A012 != null) {
                    Iterator it2 = A012.iterator();
                    while (it2.hasNext()) {
                        AbstractC72048XLo.A0Q(interfaceC37481ol, it2);
                    }
                    return;
                }
                return;
            case 2:
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `security_alert`");
                List A013 = A01(this, interfaceC37481ol, "DROP TABLE IF EXISTS `participant_device_change`");
                if (A013 != null) {
                    Iterator it3 = A013.iterator();
                    while (it3.hasNext()) {
                        AbstractC72048XLo.A0Q(interfaceC37481ol, it3);
                    }
                    return;
                }
                return;
            case 3:
                List A014 = A01(this, interfaceC37481ol, "DROP TABLE IF EXISTS `medias`");
                if (A014 != null) {
                    Iterator it4 = A014.iterator();
                    while (it4.hasNext()) {
                        AbstractC72048XLo.A0Q(interfaceC37481ol, it4);
                    }
                    return;
                }
                return;
            case 4:
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `suggestions`");
                List A015 = A01(this, interfaceC37481ol, "DROP TABLE IF EXISTS `suggestion_medium`");
                if (A015 != null) {
                    Iterator it5 = A015.iterator();
                    while (it5.hasNext()) {
                        AbstractC72048XLo.A0Q(interfaceC37481ol, it5);
                    }
                    return;
                }
                return;
            case 5:
                List A016 = A01(this, interfaceC37481ol, "DROP TABLE IF EXISTS `drafts`");
                if (A016 != null) {
                    Iterator it6 = A016.iterator();
                    while (it6.hasNext()) {
                        AbstractC72048XLo.A0Q(interfaceC37481ol, it6);
                    }
                    return;
                }
                return;
            case 6:
                List A017 = A01(this, interfaceC37481ol, "DROP TABLE IF EXISTS `qs_realtime_signals`");
                if (A017 != null) {
                    Iterator it7 = A017.iterator();
                    while (it7.hasNext()) {
                        AbstractC72048XLo.A0Q(interfaceC37481ol, it7);
                    }
                    return;
                }
                return;
            default:
                List A018 = A01(this, interfaceC37481ol, "DROP TABLE IF EXISTS `suggested_users`");
                if (A018 != null) {
                    Iterator it8 = A018.iterator();
                    while (it8.hasNext()) {
                        AbstractC72048XLo.A0Q(interfaceC37481ol, it8);
                    }
                    return;
                }
                return;
        }
    }

    @Override // X.AbstractC28801aI
    public final void onCreate(InterfaceC37481ol interfaceC37481ol) {
        int i = this.A00;
        List list = ((C1YP) this.A01).mCallbacks;
        switch (i) {
            case 0:
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                    return;
                }
                return;
            case 1:
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((C2LL) it2.next()).A00(interfaceC37481ol);
                    }
                    return;
                }
                return;
            case 2:
                if (list != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((C2LL) it3.next()).A00(interfaceC37481ol);
                    }
                    return;
                }
                return;
            case 3:
                if (list != null) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ((C2LL) it4.next()).A00(interfaceC37481ol);
                    }
                    return;
                }
                return;
            case 4:
                if (list != null) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        ((C2LL) it5.next()).A00(interfaceC37481ol);
                    }
                    return;
                }
                return;
            case 5:
                if (list != null) {
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        ((C2LL) it6.next()).A00(interfaceC37481ol);
                    }
                    return;
                }
                return;
            case 6:
                if (list != null) {
                    Iterator it7 = list.iterator();
                    while (it7.hasNext()) {
                        ((C2LL) it7.next()).A00(interfaceC37481ol);
                    }
                    return;
                }
                return;
            default:
                if (list != null) {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        ((C2LL) it8.next()).A00(interfaceC37481ol);
                    }
                    return;
                }
                return;
        }
    }

    @Override // X.AbstractC28801aI
    public final void onOpen(InterfaceC37481ol interfaceC37481ol) {
        switch (this.A00) {
            case 0:
                List A00 = A00(this, interfaceC37481ol);
                if (A00 != null) {
                    Iterator it = A00.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A02(interfaceC37481ol);
                    }
                    return;
                }
                return;
            case 1:
                List A002 = A00(this, interfaceC37481ol);
                if (A002 != null) {
                    Iterator it2 = A002.iterator();
                    while (it2.hasNext()) {
                        ((C2LL) it2.next()).A02(interfaceC37481ol);
                    }
                    return;
                }
                return;
            case 2:
                List A003 = A00(this, interfaceC37481ol);
                if (A003 != null) {
                    Iterator it3 = A003.iterator();
                    while (it3.hasNext()) {
                        ((C2LL) it3.next()).A02(interfaceC37481ol);
                    }
                    return;
                }
                return;
            case 3:
                List A004 = A00(this, interfaceC37481ol);
                if (A004 != null) {
                    Iterator it4 = A004.iterator();
                    while (it4.hasNext()) {
                        ((C2LL) it4.next()).A02(interfaceC37481ol);
                    }
                    return;
                }
                return;
            case 4:
                C1YP c1yp = (C1YP) this.A01;
                c1yp.mDatabase = interfaceC37481ol;
                interfaceC37481ol.ATG("PRAGMA foreign_keys = ON");
                c1yp.internalInitInvalidationTracker(interfaceC37481ol);
                List list = c1yp.mCallbacks;
                if (list != null) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        ((C2LL) it5.next()).A02(interfaceC37481ol);
                    }
                    return;
                }
                return;
            case 5:
                List A005 = A00(this, interfaceC37481ol);
                if (A005 != null) {
                    Iterator it6 = A005.iterator();
                    while (it6.hasNext()) {
                        ((C2LL) it6.next()).A02(interfaceC37481ol);
                    }
                    return;
                }
                return;
            case 6:
                List A006 = A00(this, interfaceC37481ol);
                if (A006 != null) {
                    Iterator it7 = A006.iterator();
                    while (it7.hasNext()) {
                        ((C2LL) it7.next()).A02(interfaceC37481ol);
                    }
                    return;
                }
                return;
            default:
                List A007 = A00(this, interfaceC37481ol);
                if (A007 != null) {
                    Iterator it8 = A007.iterator();
                    while (it8.hasNext()) {
                        ((C2LL) it8.next()).A02(interfaceC37481ol);
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.AbstractC28801aI
    public final A6Q onValidateSchema(InterfaceC37481ol interfaceC37481ol) {
        boolean A0X;
        C23008ACh c23008ACh;
        C23008ACh A00;
        StringBuilder A1C;
        String str;
        C23008ACh c23008ACh2;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                HashMap A0g = AbstractC72046XLm.A0g(5);
                AbstractC72048XLo.A1O("igid", "TEXT", A0g);
                A0X = false;
                A0X = false;
                A0g.put("entity_type", AbstractC72048XLo.A05("entity_type", "TEXT", null, 0));
                A0g.put("score", AbstractC72048XLo.A05("score", "REAL", null, 0));
                String A002 = AbstractC37315GcH.A00(19, 8, 112);
                A0g.put(A002, new C63003SaR(A002, "TEXT", null, 0, 1, false));
                String A003 = AbstractC111324zv.A00(74);
                c23008ACh2 = new C23008ACh("bff_ranked_user_model", A0g, AbstractC72048XLo.A0M(A003, new C63003SaR(A003, "TEXT", null, 0, 1, false), A0g, 0), new HashSet(0));
                A00 = RrF.A00(interfaceC37481ol, "bff_ranked_user_model");
                str2 = "\n Found:\n";
                if (!c23008ACh2.equals(A00)) {
                    A1C = AbstractC166987dD.A1C();
                    str3 = "bff_ranked_user_model(com.instagram.copresence.repository.persistence.RankedUserBFFDao.RankedUserBFF).\n Expected:\n";
                } else {
                    HashMap A0g2 = AbstractC72046XLm.A0g(5);
                    AbstractC72048XLo.A1O("igid", "TEXT", A0g2);
                    A0g2.put("entity_type", AbstractC72048XLo.A05("entity_type", "TEXT", null, 0));
                    A0g2.put("score", AbstractC72048XLo.A05("score", "REAL", null, 0));
                    A0g2.put(A002, new C63003SaR(A002, "TEXT", null, 0, 1, false));
                    c23008ACh2 = new C23008ACh("call_recipients_ranked_user_model", A0g2, AbstractC72048XLo.A0M(A003, new C63003SaR(A003, "TEXT", null, 0, 1, false), A0g2, 0), new HashSet(0));
                    A00 = RrF.A00(interfaceC37481ol, "call_recipients_ranked_user_model");
                    if (!c23008ACh2.equals(A00)) {
                        A1C = AbstractC166987dD.A1C();
                        str3 = "call_recipients_ranked_user_model(com.instagram.copresence.repository.persistence.RankedUserCallRecipientsDao.RankedUserCallRecipients).\n Expected:\n";
                    } else {
                        return new A6Q(true, null);
                    }
                }
                A1C.append(str3);
                A1C.append(c23008ACh2);
                return new A6Q(A0X, AbstractC167017dG.A0n(A00, str2, A1C));
            case 1:
                HashMap A0g3 = AbstractC72046XLm.A0g(5);
                AbstractC72048XLo.A1O("entity_id", "TEXT", A0g3);
                A0X = false;
                A0g3.put("data", AbstractC72048XLo.A05("data", "BLOB", null, 0));
                String A004 = AbstractC111324zv.A00(2313);
                A0g3.put(A004, AbstractC72048XLo.A05(A004, "INTEGER", null, 0));
                A0g3.put("entity_type", AbstractC72048XLo.A05("entity_type", "INTEGER", null, 0));
                HashSet A0M = AbstractC72048XLo.A0M("stored_time", AbstractC72048XLo.A05("stored_time", "INTEGER", null, 0), A0g3, 0);
                HashSet hashSet = new HashSet(1);
                hashSet.add(new SP3("index_note_entities_data_stored_time", AbstractC72046XLm.A0j("stored_time"), AbstractC72046XLm.A0j("ASC"), false));
                c23008ACh = new C23008ACh("note_entities_data", A0g3, A0M, hashSet);
                A00 = RrF.A00(interfaceC37481ol, "note_entities_data");
                if (!c23008ACh.equals(A00)) {
                    A1C = AbstractC166987dD.A1C();
                    str = "note_entities_data(com.instagram.direct.inbox.notes.persistence.NoteEntity).\n Expected:\n";
                    A1C.append(str);
                    A1C.append(c23008ACh);
                    str2 = "\n Found:\n";
                    return new A6Q(A0X, AbstractC167017dG.A0n(A00, str2, A1C));
                }
                return new A6Q(true, null);
            case 2:
                HashMap A0g4 = AbstractC72046XLm.A0g(14);
                AbstractC72048XLo.A1O(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TEXT", A0g4);
                A0g4.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AbstractC72048XLo.A05(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "TEXT", null, 0));
                A0X = AbstractC72049XLp.A0X(AbstractC43591JPw.A00(893), "INTEGER", A0g4);
                String A005 = AbstractC43591JPw.A00(909);
                A0g4.put(A005, AbstractC72048XLo.A05(A005, "INTEGER", null, A0X ? 1 : 0));
                String A01 = AbstractC31688Dvt.A01();
                A0g4.put(A01, AbstractC72048XLo.A05(A01, "INTEGER", null, A0X ? 1 : 0));
                String A006 = AbstractC43591JPw.A00(886);
                A0g4.put(A006, new C63003SaR(A006, "INTEGER", null, A0X ? 1 : 0, 1, A0X));
                String A007 = AbstractC43591JPw.A00(1000);
                A0g4.put(A007, new C63003SaR(A007, "INTEGER", null, A0X ? 1 : 0, 1, A0X));
                A0g4.put("model", new C63003SaR("model", "TEXT", null, A0X ? 1 : 0, 1, A0X));
                String A008 = AbstractC43591JPw.A00(187);
                A0g4.put(A008, new C63003SaR(A008, "TEXT", null, A0X ? 1 : 0, 1, A0X));
                A0g4.put("location", new C63003SaR("location", "TEXT", null, A0X ? 1 : 0, 1, A0X));
                String A009 = AbstractC43591JPw.A00(740);
                A0g4.put(A009, new C63003SaR(A009, "INTEGER", null, A0X ? 1 : 0, 1, A0X));
                A0g4.put(Location.LATITUDE, new C63003SaR(Location.LATITUDE, "REAL", null, A0X ? 1 : 0, 1, A0X));
                A0g4.put("longitude", new C63003SaR("longitude", "REAL", null, A0X ? 1 : 0, 1, A0X));
                HashSet A0M2 = AbstractC72048XLo.A0M("is_confirm", AbstractC72048XLo.A05("is_confirm", "INTEGER", "0", A0X ? 1 : 0), A0g4, A0X ? 1 : 0);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new SP3("index_security_alert_user_id", AbstractC72046XLm.A0j(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID), AbstractC72046XLm.A0j("ASC"), A0X));
                hashSet2.add(new SP3("index_security_alert_device_id", AbstractC72046XLm.A0j(A01), AbstractC72046XLm.A0j("ASC"), A0X));
                c23008ACh2 = new C23008ACh("security_alert", A0g4, A0M2, hashSet2);
                A00 = RrF.A00(interfaceC37481ol, "security_alert");
                str2 = "\n Found:\n";
                if (!c23008ACh2.equals(A00)) {
                    A1C = AbstractC166987dD.A1C();
                    str3 = "security_alert(com.instagram.direct.securityalert.data.room.SecurityAlertEntity).\n Expected:\n";
                } else {
                    HashMap A0g5 = AbstractC72046XLm.A0g(8);
                    AbstractC72048XLo.A1O(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "INTEGER", A0g5);
                    A0g5.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AbstractC72048XLo.A05(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "TEXT", null, A0X ? 1 : 0));
                    String A0010 = AbstractC43591JPw.A00(1234);
                    A0g5.put(A0010, AbstractC72048XLo.A05(A0010, "INTEGER", null, A0X ? 1 : 0));
                    String A0011 = AbstractC111324zv.A00(871);
                    A0g5.put(A0011, new C63003SaR(A0011, "TEXT", null, A0X ? 1 : 0, 1, A0X));
                    A0g5.put(A005, AbstractC72048XLo.A05(A005, "INTEGER", null, A0X ? 1 : 0));
                    String A0012 = AbstractC43591JPw.A00(908);
                    A0g5.put(A0012, AbstractC72048XLo.A05(A0012, "INTEGER", null, A0X ? 1 : 0));
                    String A0013 = AbstractC43591JPw.A00(1323);
                    A0g5.put(A0013, AbstractC72048XLo.A05(A0013, "INTEGER", null, A0X ? 1 : 0));
                    String A0014 = AbstractC43591JPw.A00(1113);
                    HashSet A0M3 = AbstractC72048XLo.A0M(A0014, AbstractC72048XLo.A05(A0014, "INTEGER", null, A0X ? 1 : 0), A0g5, A0X ? 1 : 0);
                    HashSet hashSet3 = new HashSet(1);
                    hashSet3.add(new SP3("index_participant_device_change_id", AbstractC72046XLm.A0j(PublicKeyCredentialControllerUtility.JSON_KEY_ID), AbstractC72046XLm.A0j("ASC"), A0X));
                    c23008ACh2 = new C23008ACh("participant_device_change", A0g5, A0M3, hashSet3);
                    A00 = RrF.A00(interfaceC37481ol, "participant_device_change");
                    if (!c23008ACh2.equals(A00)) {
                        A1C = AbstractC166987dD.A1C();
                        str3 = "participant_device_change(com.instagram.direct.securityalert.data.room.ParticipantDeviceChangeEntity).\n Expected:\n";
                    } else {
                        return new A6Q(true, null);
                    }
                }
                A1C.append(str3);
                A1C.append(c23008ACh2);
                return new A6Q(A0X, AbstractC167017dG.A0n(A00, str2, A1C));
            case 3:
                HashMap A0g6 = AbstractC72046XLm.A0g(5);
                AbstractC72048XLo.A1O(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TEXT", A0g6);
                A0g6.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC72048XLo.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "TEXT", null, 2));
                A0X = AbstractC72049XLp.A0X("data", "BLOB", A0g6);
                A0g6.put("stored_time", AbstractC72048XLo.A05("stored_time", "INTEGER", null, A0X ? 1 : 0));
                HashSet A0M4 = AbstractC72048XLo.A0M("ranking_score", AbstractC72048XLo.A05("ranking_score", "REAL", null, A0X ? 1 : 0), A0g6, A0X ? 1 : 0);
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new SP3("index_medias_stored_time", AbstractC72046XLm.A0j("stored_time"), AbstractC72046XLm.A0j("ASC"), A0X));
                c23008ACh = new C23008ACh("medias", A0g6, A0M4, hashSet4);
                A00 = RrF.A00(interfaceC37481ol, "medias");
                if (!c23008ACh.equals(A00)) {
                    A1C = AbstractC166987dD.A1C();
                    str = "medias(com.instagram.feed.media.flashmedia.persistence.MediaEntity).\n Expected:\n";
                    A1C.append(str);
                    A1C.append(c23008ACh);
                    str2 = "\n Found:\n";
                    return new A6Q(A0X, AbstractC167017dG.A0n(A00, str2, A1C));
                }
                return new A6Q(true, null);
            case 4:
                HashMap A0g7 = AbstractC72046XLm.A0g(9);
                String A0015 = AbstractC43591JPw.A00(212);
                AbstractC72048XLo.A1O(A0015, "TEXT", A0g7);
                A0X = AbstractC72049XLp.A0X(DialogModule.KEY_TITLE, "TEXT", A0g7);
                A0g7.put("subtitle", AbstractC72048XLo.A05("subtitle", "TEXT", null, A0X ? 1 : 0));
                A0g7.put("concept", AbstractC72048XLo.A05("concept", "TEXT", null, A0X ? 1 : 0));
                A0g7.put(TraceFieldType.StartTime, AbstractC72048XLo.A05(TraceFieldType.StartTime, "INTEGER", null, A0X ? 1 : 0));
                String A0016 = AbstractC111324zv.A00(914);
                A0g7.put(A0016, AbstractC72048XLo.A05(A0016, "INTEGER", null, A0X ? 1 : 0));
                String A0017 = AbstractC43591JPw.A00(1354);
                A0g7.put(A0017, AbstractC72048XLo.A05(A0017, "TEXT", null, A0X ? 1 : 0));
                A0g7.put("trip", new C63003SaR("trip", "INTEGER", null, A0X ? 1 : 0, 1, A0X));
                HashSet A0M5 = AbstractC72048XLo.A0M("location", new C63003SaR("location", "TEXT", null, A0X ? 1 : 0, 1, A0X), A0g7, A0X ? 1 : 0);
                HashSet hashSet5 = new HashSet(A0X ? 1 : 0);
                String A0018 = AbstractC43591JPw.A00(213);
                c23008ACh2 = new C23008ACh(A0018, A0g7, A0M5, hashSet5);
                A00 = RrF.A00(interfaceC37481ol, A0018);
                str2 = "\n Found:\n";
                if (!c23008ACh2.equals(A00)) {
                    A1C = AbstractC166987dD.A1C();
                    str3 = "suggestions(com.instagram.gallery.suggestions.database.SuggestionEntity).\n Expected:\n";
                } else {
                    HashMap A0g8 = AbstractC72046XLm.A0g(3);
                    AbstractC72048XLo.A1O(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "INTEGER", A0g8);
                    A0g8.put("medium_id", AbstractC72048XLo.A05("medium_id", "TEXT", null, A0X ? 1 : 0));
                    HashSet A0M6 = AbstractC72048XLo.A0M(A0015, AbstractC72048XLo.A05(A0015, "TEXT", null, A0X ? 1 : 0), A0g8, 1);
                    A0M6.add(new C23010ACk(A0018, AbstractC111324zv.A00(1517), AbstractC111324zv.A00(1697), AbstractC72046XLm.A0j(A0015), AbstractC72046XLm.A0j(A0015)));
                    c23008ACh2 = new C23008ACh("suggestion_medium", A0g8, A0M6, new HashSet(A0X ? 1 : 0));
                    A00 = RrF.A00(interfaceC37481ol, "suggestion_medium");
                    if (!c23008ACh2.equals(A00)) {
                        A1C = AbstractC166987dD.A1C();
                        str3 = "suggestion_medium(com.instagram.gallery.suggestions.database.SuggestionMediumEntity).\n Expected:\n";
                    } else {
                        return new A6Q(true, null);
                    }
                }
                A1C.append(str3);
                A1C.append(c23008ACh2);
                return new A6Q(A0X, AbstractC167017dG.A0n(A00, str2, A1C));
            case 5:
                HashMap A0g9 = AbstractC72046XLm.A0g(37);
                AbstractC72048XLo.A1O(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "INTEGER", A0g9);
                A0X = false;
                A0g9.put("is_uploading", AbstractC72048XLo.A05("is_uploading", "INTEGER", "0", 0));
                A0g9.put("video_path", AbstractC72048XLo.A05("video_path", "TEXT", "''", 0));
                A0g9.put("video_orig_rotation", AbstractC72048XLo.A05("video_orig_rotation", "INTEGER", "0", 0));
                A0g9.put("video_orig_width", AbstractC72048XLo.A05("video_orig_width", "INTEGER", "0", 0));
                A0g9.put("video_orig_height", AbstractC72048XLo.A05("video_orig_height", "INTEGER", "0", 0));
                A0g9.put("duration", AbstractC72048XLo.A05("duration", "INTEGER", "0", 0));
                A0g9.put(DialogModule.KEY_TITLE, AbstractC72048XLo.A05(DialogModule.KEY_TITLE, "TEXT", "''", 0));
                A0g9.put(DevServerEntity.COLUMN_DESCRIPTION, AbstractC72048XLo.A05(DevServerEntity.COLUMN_DESCRIPTION, "TEXT", "''", 0));
                A0g9.put("series_id", new C63003SaR("series_id", "TEXT", null, 0, 1, false));
                A0g9.put("is_unified_video", AbstractC72048XLo.A05("is_unified_video", "INTEGER", "0", 0));
                A0g9.put("filter_id", AbstractC72048XLo.A05("filter_id", "INTEGER", "0", 0));
                A0g9.put("filter_strength", AbstractC72048XLo.A05("filter_strength", "INTEGER", "100", 0));
                A0g9.put("post_crop_aspect_ratio", AbstractC72048XLo.A05("post_crop_aspect_ratio", "REAL", "0", 0));
                A0g9.put("is_landscape_surface", AbstractC72048XLo.A05("is_landscape_surface", "INTEGER", "0", 0));
                A0g9.put("is_over_image_custom", AbstractC72048XLo.A05("is_over_image_custom", "INTEGER", "0", 0));
                A0g9.put("cover_image_file_path", new C63003SaR("cover_image_file_path", "TEXT", "''", 0, 1, false));
                A0g9.put("cover_image_width", AbstractC72048XLo.A05("cover_image_width", "INTEGER", "0", 0));
                A0g9.put("cover_image_height", AbstractC72048XLo.A05("cover_image_height", "INTEGER", "0", 0));
                A0g9.put("cover_image_video_time_mx", AbstractC72048XLo.A05("cover_image_video_time_mx", "INTEGER", "0", 0));
                A0g9.put("is_cover_image_fram_video_edited", AbstractC72048XLo.A05("is_cover_image_fram_video_edited", "INTEGER", "0", 0));
                A0g9.put("is_preview_enabled", AbstractC72048XLo.A05("is_preview_enabled", "INTEGER", "0", 0));
                A0g9.put("preview_crop_coords", new C63003SaR("preview_crop_coords", "TEXT", null, 0, 1, false));
                A0g9.put("profile_crop_coords", new C63003SaR("profile_crop_coords", "TEXT", null, 0, 1, false));
                A0g9.put("is_internal", AbstractC72048XLo.A05("is_internal", "INTEGER", "0", 0));
                A0g9.put("group_destination_user_id", new C63003SaR("group_destination_user_id", "TEXT", null, 0, 1, false));
                A0g9.put("share_to_facebook", AbstractC72048XLo.A05("share_to_facebook", "INTEGER", "0", 0));
                A0g9.put("are_captions_enabled", AbstractC72048XLo.A05("are_captions_enabled", "INTEGER", "0", 0));
                A0g9.put("are_comments_disabled", AbstractC72048XLo.A05("are_comments_disabled", "INTEGER", "0", 0));
                A0g9.put("is_funded_content_deal", AbstractC72048XLo.A05("is_funded_content_deal", "INTEGER", "0", 0));
                A0g9.put("is_like_and_view_counts_disabled", AbstractC72048XLo.A05("is_like_and_view_counts_disabled", "INTEGER", "0", 0));
                A0g9.put("is_paid_partnership", AbstractC72048XLo.A05("is_paid_partnership", "INTEGER", "0", 0));
                A0g9.put("branded_content_info", new C63003SaR("branded_content_info", "TEXT", null, 0, 1, false));
                A0g9.put("partner_boost_enabled", AbstractC72048XLo.A05("partner_boost_enabled", "INTEGER", "0", 0));
                A0g9.put("shopping_info", new C63003SaR("shopping_info", "TEXT", null, 0, 1, false));
                A0g9.put("created_timestamp", AbstractC72048XLo.A05("created_timestamp", "INTEGER", "0", 0));
                c23008ACh = new C23008ACh("drafts", A0g9, AbstractC72048XLo.A0M("last_modified_timestamp", AbstractC72048XLo.A05("last_modified_timestamp", "INTEGER", "0", 0), A0g9, 0), new HashSet(0));
                A00 = RrF.A00(interfaceC37481ol, "drafts");
                if (!c23008ACh.equals(A00)) {
                    A1C = AbstractC166987dD.A1C();
                    str = "drafts(com.instagram.igtv.persistence.draft.IGTVDraftEntity).\n Expected:\n";
                    A1C.append(str);
                    A1C.append(c23008ACh);
                    str2 = "\n Found:\n";
                    return new A6Q(A0X, AbstractC167017dG.A0n(A00, str2, A1C));
                }
                return new A6Q(true, null);
            case 6:
                HashMap A0g10 = AbstractC72046XLm.A0g(16);
                AbstractC72048XLo.A1O("signal_id", "TEXT", A0g10);
                A0X = AbstractC72049XLp.A0X("signal_type", "TEXT", A0g10);
                A0g10.put("item_id", AbstractC72048XLo.A05("item_id", "TEXT", null, A0X ? 1 : 0));
                A0g10.put("item_type", AbstractC72048XLo.A05("item_type", "TEXT", null, A0X ? 1 : 0));
                String A0019 = AbstractC43591JPw.A00(214);
                A0g10.put(A0019, AbstractC72048XLo.A05(A0019, "TEXT", null, A0X ? 1 : 0));
                A0g10.put("container_module", AbstractC72048XLo.A05("container_module", "TEXT", null, A0X ? 1 : 0));
                A0g10.put("inventory_source", AbstractC72048XLo.A05("inventory_source", "TEXT", null, A0X ? 1 : 0));
                A0g10.put("signal_status", AbstractC72048XLo.A05("signal_status", "TEXT", null, A0X ? 1 : 0));
                A0g10.put("timestamp", AbstractC72048XLo.A05("timestamp", "INTEGER", null, A0X ? 1 : 0));
                A0g10.put("signal_data", AbstractC72048XLo.A05("signal_data", "BLOB", null, A0X ? 1 : 0));
                A0g10.put("meta_idad_id", new C63003SaR("meta_idad_id", "TEXT", null, A0X ? 1 : 0, 1, A0X));
                A0g10.put("meta_idcampaign_id", new C63003SaR("meta_idcampaign_id", "TEXT", null, A0X ? 1 : 0, 1, A0X));
                A0g10.put("meta_idapp_id", new C63003SaR("meta_idapp_id", "TEXT", null, A0X ? 1 : 0, 1, A0X));
                A0g10.put("meta_idpage_id", new C63003SaR("meta_idpage_id", "TEXT", null, A0X ? 1 : 0, 1, A0X));
                A0g10.put("meta_idactor_id", new C63003SaR("meta_idactor_id", "TEXT", null, A0X ? 1 : 0, 1, A0X));
                c23008ACh = new C23008ACh("qs_realtime_signals", A0g10, AbstractC72048XLo.A0M("meta_idmedia_id", new C63003SaR("meta_idmedia_id", "TEXT", null, A0X ? 1 : 0, 1, A0X), A0g10, A0X ? 1 : 0), new HashSet(A0X ? 1 : 0));
                A00 = RrF.A00(interfaceC37481ol, "qs_realtime_signals");
                if (!c23008ACh.equals(A00)) {
                    A1C = AbstractC166987dD.A1C();
                    str = "qs_realtime_signals(com.instagram.sponsored.asyncads.requestpathsignals.persistence.room.QSRealtimeSignalEntity).\n Expected:\n";
                    A1C.append(str);
                    A1C.append(c23008ACh);
                    str2 = "\n Found:\n";
                    return new A6Q(A0X, AbstractC167017dG.A0n(A00, str2, A1C));
                }
                return new A6Q(true, null);
            default:
                HashMap A0g11 = AbstractC72046XLm.A0g(3);
                AbstractC72048XLo.A1O(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "TEXT", A0g11);
                A0X = AbstractC72049XLp.A0X(AbstractC43591JPw.A00(1079), "TEXT", A0g11);
                String A0020 = AbstractC43591JPw.A00(1134);
                HashSet A0M7 = AbstractC72048XLo.A0M(A0020, AbstractC72048XLo.A05(A0020, "TEXT", null, A0X ? 1 : 0), A0g11, A0X ? 1 : 0);
                HashSet hashSet6 = new HashSet(A0X ? 1 : 0);
                String A0021 = AbstractC111324zv.A00(77);
                c23008ACh = new C23008ACh(A0021, A0g11, A0M7, hashSet6);
                A00 = RrF.A00(interfaceC37481ol, A0021);
                if (!c23008ACh.equals(A00)) {
                    A1C = AbstractC166987dD.A1C();
                    str = "suggested_users(com.instagram.suggestedusers.database.SuggestedUserEntity).\n Expected:\n";
                    A1C.append(str);
                    A1C.append(c23008ACh);
                    str2 = "\n Found:\n";
                    return new A6Q(A0X, AbstractC167017dG.A0n(A00, str2, A1C));
                }
                return new A6Q(true, null);
        }
    }

    public static List A01(C72063XMg c72063XMg, InterfaceC37481ol interfaceC37481ol, String str) {
        interfaceC37481ol.ATG(str);
        return ((C1YP) c72063XMg.A01).mCallbacks;
    }

    @Override // X.AbstractC28801aI
    public final void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
    }

    @Override // X.AbstractC28801aI
    public final void onPreMigrate(InterfaceC37481ol interfaceC37481ol) {
        C3EP.A01(interfaceC37481ol);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72063XMg(IGTVDatabase_Impl iGTVDatabase_Impl) {
        super(15);
        this.A00 = 5;
        this.A01 = iGTVDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72063XMg(SuggestionsDatabase_Impl suggestionsDatabase_Impl) {
        super(3);
        this.A00 = 4;
        this.A01 = suggestionsDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72063XMg(Object obj, int i, int i2) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
    }
}
