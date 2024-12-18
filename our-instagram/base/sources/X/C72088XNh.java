package X;

/* renamed from: X.XNh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72088XNh extends C1Ym {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C72088XNh(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto Ld;
                case 1: goto L10;
                case 2: goto L15;
                case 3: goto L1a;
                case 4: goto L1f;
                case 5: goto L24;
                case 6: goto L29;
                case 7: goto L2d;
                default: goto L5;
            }
        L5:
            r1 = 9
            r0 = 10
        L9:
            r2.<init>(r1, r0)
            return
        Ld:
            r1 = 1
            r0 = 2
            goto L9
        L10:
            r1 = 10
            r0 = 11
            goto L9
        L15:
            r1 = 11
            r0 = 12
            goto L9
        L1a:
            r1 = 12
            r0 = 13
            goto L9
        L1f:
            r1 = 13
            r0 = 14
            goto L9
        L24:
            r1 = 14
            r0 = 15
            goto L9
        L29:
            r1 = 7
            r0 = 8
            goto L9
        L2d:
            r1 = 8
            r0 = 9
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72088XNh.<init>(int):void");
    }

    @Override // X.C1Ym
    public final void migrate(InterfaceC37481ol interfaceC37481ol) {
        String str;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(interfaceC37481ol, 0);
                str3 = "\n          ALTER TABLE medias\n          ADD COLUMN ranking_score REAL NOT NULL DEFAULT 0\n        ";
                interfaceC37481ol.ATG(str3);
                return;
            case 1:
                C14360o3.A0B(interfaceC37481ol, 0);
                str3 = "ALTER TABLE drafts ADD COLUMN partner_boost_enabled INTEGER NOT NULL DEFAULT 0";
                interfaceC37481ol.ATG(str3);
                return;
            case 2:
                C14360o3.A0B(interfaceC37481ol, 0);
                str3 = "ALTER TABLE drafts ADD COLUMN is_unified_video INTEGER NOT NULL DEFAULT 0";
                interfaceC37481ol.ATG(str3);
                return;
            case 3:
                C14360o3.A0B(interfaceC37481ol, 0);
                interfaceC37481ol.ATG("ALTER TABLE drafts ADD COLUMN filter_id INTEGER NOT NULL DEFAULT 0");
                str3 = "ALTER TABLE drafts ADD COLUMN filter_strength INTEGER NOT NULL DEFAULT 100";
                interfaceC37481ol.ATG(str3);
                return;
            case 4:
                C14360o3.A0B(interfaceC37481ol, 0);
                if (interfaceC37481ol.E7O("SELECT * FROM drafts").getColumnIndex("is_like_and_view_counts_disabled") < 0) {
                    str3 = "ALTER TABLE drafts ADD COLUMN is_like_and_view_counts_disabled INTEGER NOT NULL DEFAULT 0";
                    interfaceC37481ol.ATG(str3);
                    return;
                } else {
                    str = "igtv_db_skip_13_14_migration";
                    str2 = "skipping adding is_like_and_view_counts_disabled column since it already exist";
                    break;
                }
            case 5:
                C14360o3.A0B(interfaceC37481ol, 0);
                str3 = "ALTER TABLE drafts ADD COLUMN group_destination_user_id TEXT";
                interfaceC37481ol.ATG(str3);
                return;
            case 6:
                C14360o3.A0B(interfaceC37481ol, 0);
                interfaceC37481ol.ATG("ALTER TABLE drafts ADD COLUMN shopping_info TEXT");
                str3 = "DROP TABLE IF EXISTS shopping";
                interfaceC37481ol.ATG(str3);
                return;
            case 7:
                C14360o3.A0B(interfaceC37481ol, 0);
                if (interfaceC37481ol.E7O("SELECT * FROM drafts").getColumnIndex("are_comments_disabled") < 0) {
                    str3 = "ALTER TABLE drafts ADD COLUMN are_comments_disabled INTEGER NOT NULL DEFAULT 0";
                    interfaceC37481ol.ATG(str3);
                    return;
                } else {
                    str = "igtv_db_skip_8_9_migration";
                    str2 = "skipping adding are_comments_disabled column since it already exist";
                    break;
                }
            default:
                C14360o3.A0B(interfaceC37481ol, 0);
                interfaceC37481ol.ATG("CREATE TABLE drafts_temp(`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_uploading` INTEGER NOT NULL DEFAULT 0, `video_path` TEXT NOT NULL DEFAULT '', `video_orig_rotation` INTEGER NOT NULL DEFAULT 0, `video_orig_width` INTEGER NOT NULL DEFAULT 0, `video_orig_height` INTEGER NOT NULL DEFAULT 0, `duration` INTEGER NOT NULL DEFAULT 0, `title` TEXT NOT NULL DEFAULT '', `description` TEXT NOT NULL DEFAULT '', `series_id` TEXT, `post_crop_aspect_ratio` REAL NOT NULL DEFAULT 0, `is_landscape_surface` INTEGER NOT NULL DEFAULT 0, `is_over_image_custom` INTEGER NOT NULL DEFAULT 0, `cover_image_file_path` TEXT DEFAULT '', `cover_image_width` INTEGER NOT NULL DEFAULT 0, `cover_image_height` INTEGER NOT NULL DEFAULT 0, `cover_image_video_time_mx` INTEGER NOT NULL DEFAULT 0, `is_cover_image_fram_video_edited` INTEGER NOT NULL DEFAULT 0, `is_preview_enabled` INTEGER NOT NULL DEFAULT 0, `preview_crop_coords` TEXT, `profile_crop_coords` TEXT, `is_internal` INTEGER NOT NULL DEFAULT 0, `share_to_facebook` INTEGER NOT NULL DEFAULT 0, `are_captions_enabled` INTEGER NOT NULL DEFAULT 0, `are_comments_disabled` INTEGER NOT NULL DEFAULT 0, `is_funded_content_deal` INTEGER NOT NULL DEFAULT 0, `shopping_info` TEXT, `created_timestamp` INTEGER NOT NULL DEFAULT 0, `last_modified_timestamp` INTEGER NOT NULL DEFAULT 0)");
                interfaceC37481ol.ATG("INSERT INTO drafts_temp SELECT id, is_uploading, video_path, video_orig_rotation, video_orig_width, video_orig_height, duration, title, description, series_id, post_crop_aspect_ratio, is_landscape_surface, is_over_image_custom, cover_image_file_path, cover_image_width, cover_image_height, cover_image_video_time_mx, is_cover_image_fram_video_edited, is_preview_enabled, preview_crop_coords, profile_crop_coords, is_internal, share_to_facebook, are_captions_enabled, are_comments_disabled, is_funded_content_deal, shopping_info, created_timestamp, last_modified_timestamp FROM drafts");
                interfaceC37481ol.ATG("DROP TABLE drafts");
                interfaceC37481ol.ATG("ALTER TABLE drafts_temp RENAME TO drafts");
                interfaceC37481ol.ATG("ALTER TABLE drafts ADD COLUMN branded_content_info TEXT");
                str3 = "ALTER TABLE drafts ADD COLUMN is_paid_partnership INTEGER NOT NULL DEFAULT 0";
                interfaceC37481ol.ATG(str3);
                return;
        }
        C0w9.A03(str, str2);
    }
}
