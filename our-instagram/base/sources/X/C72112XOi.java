package X;

/* renamed from: X.XOi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72112XOi extends AbstractC29571bY {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72112XOi(C1YP c1yp, Object obj, int i) {
        super(c1yp);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC29571bY
    public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
        C50679MYx c50679MYx;
        switch (this.A00) {
            case 0:
                C72111XOh c72111XOh = (C72111XOh) obj;
                interfaceC37561ot.ADp(1, c72111XOh.A03);
                interfaceC37561ot.ADp(2, c72111XOh.A02);
                interfaceC37561ot.ADg(3, c72111XOh.A00);
                c50679MYx = c72111XOh.A01;
                break;
            case 1:
                C72109XOf c72109XOf = (C72109XOf) obj;
                interfaceC37561ot.ADp(1, c72109XOf.A03);
                interfaceC37561ot.ADp(2, c72109XOf.A02);
                interfaceC37561ot.ADg(3, c72109XOf.A00);
                c50679MYx = c72109XOf.A01;
                break;
            default:
                C51682MsD c51682MsD = (C51682MsD) obj;
                AbstractC72048XLo.A0S(interfaceC37561ot, c51682MsD, c51682MsD.A06);
                AbstractC72046XLm.A0m(interfaceC37561ot, c51682MsD.A0K, 10);
                AbstractC72048XLo.A0R(interfaceC37561ot, c51682MsD);
                AbstractC72046XLm.A0m(interfaceC37561ot, c51682MsD.A0H, 17);
                AbstractC72046XLm.A0m(interfaceC37561ot, AbstractC72048XLo.A0J(interfaceC37561ot, c51682MsD), 23);
                AbstractC72046XLm.A0m(interfaceC37561ot, OPE.A01(c51682MsD.A0E), 24);
                interfaceC37561ot.ADi(25, c51682MsD.A0S ? 1L : 0L);
                AbstractC72046XLm.A0m(interfaceC37561ot, c51682MsD.A0J, 26);
                AbstractC72046XLm.A0m(interfaceC37561ot, AbstractC72048XLo.A0I(interfaceC37561ot, c51682MsD), 33);
                interfaceC37561ot.ADi(34, c51682MsD.A0Z ? 1L : 0L);
                AbstractC72046XLm.A0m(interfaceC37561ot, OPG.A01(c51682MsD.A0G), 35);
                interfaceC37561ot.ADi(36, c51682MsD.A0A);
                interfaceC37561ot.ADi(37, c51682MsD.A0C);
                return;
        }
        AbstractC72046XLm.A0m(interfaceC37561ot, c50679MYx.A01, 4);
        AbstractC72046XLm.A0m(interfaceC37561ot, c50679MYx.A00, 5);
    }

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        switch (this.A00) {
            case 0:
                return "INSERT OR REPLACE INTO `bff_ranked_user_model` (`igid`,`entity_type`,`score`,`username`,`profile_picture_url`) VALUES (?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `call_recipients_ranked_user_model` (`igid`,`entity_type`,`score`,`username`,`profile_picture_url`) VALUES (?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `drafts` (`id`,`is_uploading`,`video_path`,`video_orig_rotation`,`video_orig_width`,`video_orig_height`,`duration`,`title`,`description`,`series_id`,`is_unified_video`,`filter_id`,`filter_strength`,`post_crop_aspect_ratio`,`is_landscape_surface`,`is_over_image_custom`,`cover_image_file_path`,`cover_image_width`,`cover_image_height`,`cover_image_video_time_mx`,`is_cover_image_fram_video_edited`,`is_preview_enabled`,`preview_crop_coords`,`profile_crop_coords`,`is_internal`,`group_destination_user_id`,`share_to_facebook`,`are_captions_enabled`,`are_comments_disabled`,`is_funded_content_deal`,`is_like_and_view_counts_disabled`,`is_paid_partnership`,`branded_content_info`,`partner_boost_enabled`,`shopping_info`,`created_timestamp`,`last_modified_timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
