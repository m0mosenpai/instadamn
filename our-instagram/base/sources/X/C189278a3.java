package X;

/* renamed from: X.8a3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189278a3 implements InterfaceC189288a4 {
    public static final C189278a3 A00;
    public static final C8a5 A01;
    public static final C8a5 A02;
    public static final C8a5 A03;
    public static final C8a5 A04;
    public static final C8a5 A05;
    public static final C8a5 A06;
    public static final C8a5 A07;
    public static final C8a5 A08;
    public static final C8a5 A09;
    public static final C8a5 A0A;
    public static final C8a5[] A0B;
    public static final String[] A0C;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.8a3, java.lang.Object] */
    static {
        C8a5 c8a5 = new C8a5(1, "083c91286b5271b7f187fb0a353f72c2ccc374c6", new String[]{"CREATE TABLE gallery_media_metadata (\nid TEXT PRIMARY KEY NOT NULL,\nscanner_versions TEXT,\nfeature_name TEXT,\nlocality TEXT,\nsub_admin_area TEXT,\ncountry_name TEXT,\nvisual_embeddings TEXT,\nface_count INTEGER DEFAULT(0),\nfaces_json TEXT,\ngroup_scan_id INTEGER DEFAULT(-1),\ngroup_id INTEGER DEFAULT(-1)\n)"});
        A09 = c8a5;
        C8a5 c8a52 = new C8a5(2, "b556a00e0a5977a698a08f349235af69c09203ae", new String[]{"ALTER TABLE gallery_media_metadata ADD ocn_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD ocv_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD person_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD smiling_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD food_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD nature_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD landmark_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD top_concept INTEGER DEFAULT(-1)", "ALTER TABLE gallery_media_metadata ADD top_concept_score REAL DEFAULT(0)"});
        A05 = c8a52;
        C8a5 c8a53 = new C8a5(3, "af5cc50d8ae1bce9bafe081571f1aba0435127bb", new String[]{"ALTER TABLE gallery_media_metadata ADD aesthetic_score REAL DEFAULT(0)"});
        A06 = c8a53;
        C8a5 c8a54 = new C8a5(4, "2aa35f54399381d98405d8e58fa72ef6fabea513", new String[]{"ALTER TABLE gallery_media_metadata ADD blur_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD document_score REAL DEFAULT(0)"});
        A07 = c8a54;
        C8a5 c8a55 = new C8a5(5, "da822d65ff9cfcde28bfdae01cae3eb3369aa3c7", new String[]{"ALTER TABLE gallery_media_metadata ADD pet_score REAL DEFAULT(0)"});
        A08 = c8a55;
        C8a5 c8a56 = new C8a5(6, "89925ddc219159c80e423a137397e1bb3b814426", new String[]{"ALTER TABLE gallery_media_metadata ADD highlight_start_ms INTEGER DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD highlight_duration_ms INTEGER DEFAULT(0)"});
        A04 = c8a56;
        C8a5 c8a57 = new C8a5(7, "3c2ad996f96b9e5c19426a9a019f106f5d616cd0", new String[]{"ALTER TABLE gallery_media_metadata ADD date_sec INTEGER DEFAULT(0)", "UPDATE gallery_media_metadata SET date_sec = strftime('%s', 'now')"});
        A03 = c8a57;
        C8a5 c8a58 = new C8a5(8, "11ddddf7ea6eda560658324f65a68f315adff5a9", new String[]{"BEGIN TRANSACTION", "CREATE TABLE temp_gallery_media_metadata AS\nSELECT id, scanner_versions, feature_name, locality, sub_admin_area, country_name, visual_embeddings, ocn_score, ocv_score, person_score, food_score, nature_score, landmark_score, aesthetic_score, blur_score, document_score, pet_score, date_sec\nFROM gallery_media_metadata", "DROP TABLE gallery_media_metadata", "ALTER TABLE temp_gallery_media_metadata RENAME TO gallery_media_metadata", "COMMIT"});
        A0A = c8a58;
        C8a5 c8a59 = new C8a5(9, "32058a9b59412435b9a737869178f40b70f7e4e5", new String[]{"ALTER TABLE gallery_media_metadata ADD plant_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD sports_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD vehicle_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD water_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD outdoors_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD event_score REAL DEFAULT(0)"});
        A02 = c8a59;
        C8a5 c8a510 = new C8a5(10, "a4fd8ee38e0bdfcdde36b8bea677ae49cc245312", new String[]{"ALTER TABLE gallery_media_metadata ADD admin_area TEXT DEFAULT ''"});
        A01 = c8a510;
        A00 = new Object();
        A0B = new C8a5[]{c8a5, c8a52, c8a53, c8a54, c8a55, c8a56, c8a57, c8a58, c8a59, c8a510};
        A0C = new String[]{"gallery_media_metadata"};
    }

    @Override // X.InterfaceC189288a4
    public final String getName() {
        return "gallery_media_metadata";
    }

    @Override // X.InterfaceC189288a4
    public final C8a5[] BTm() {
        return A0B;
    }

    @Override // X.InterfaceC189288a4
    public final String[] C4v() {
        return A0C;
    }
}
