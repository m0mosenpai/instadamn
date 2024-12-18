package X;

/* renamed from: X.XOc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72107XOc extends AbstractC49502Ph {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72107XOc(C1YP c1yp, Object obj, int i) {
        super(c1yp);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC49502Ph
    public final /* bridge */ /* synthetic */ void A01(InterfaceC37561ot interfaceC37561ot, Object obj) {
        String str;
        C50679MYx c50679MYx;
        int i;
        switch (this.A00) {
            case 0:
                str = ((C72111XOh) obj).A03;
                i = 1;
                interfaceC37561ot.ADp(i, str);
                return;
            case 1:
                C72111XOh c72111XOh = (C72111XOh) obj;
                str = c72111XOh.A03;
                interfaceC37561ot.ADp(1, str);
                interfaceC37561ot.ADp(2, c72111XOh.A02);
                interfaceC37561ot.ADg(3, c72111XOh.A00);
                c50679MYx = c72111XOh.A01;
                AbstractC72046XLm.A0m(interfaceC37561ot, c50679MYx.A01, 4);
                AbstractC72046XLm.A0m(interfaceC37561ot, c50679MYx.A00, 5);
                i = 6;
                interfaceC37561ot.ADp(i, str);
                return;
            case 2:
                str = ((C72109XOf) obj).A03;
                i = 1;
                interfaceC37561ot.ADp(i, str);
                return;
            case 3:
                C72109XOf c72109XOf = (C72109XOf) obj;
                str = c72109XOf.A03;
                interfaceC37561ot.ADp(1, str);
                interfaceC37561ot.ADp(2, c72109XOf.A02);
                interfaceC37561ot.ADg(3, c72109XOf.A00);
                c50679MYx = c72109XOf.A01;
                AbstractC72046XLm.A0m(interfaceC37561ot, c50679MYx.A01, 4);
                AbstractC72046XLm.A0m(interfaceC37561ot, c50679MYx.A00, 5);
                i = 6;
                interfaceC37561ot.ADp(i, str);
                return;
            default:
                C51682MsD c51682MsD = (C51682MsD) obj;
                long j = c51682MsD.A06;
                AbstractC72048XLo.A0S(interfaceC37561ot, c51682MsD, j);
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
                interfaceC37561ot.ADi(38, j);
                return;
        }
    }

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        switch (this.A00) {
            case 0:
                return "DELETE FROM `bff_ranked_user_model` WHERE `igid` = ?";
            case 1:
                return "UPDATE OR ABORT `bff_ranked_user_model` SET `igid` = ?,`entity_type` = ?,`score` = ?,`username` = ?,`profile_picture_url` = ? WHERE `igid` = ?";
            case 2:
                return "DELETE FROM `call_recipients_ranked_user_model` WHERE `igid` = ?";
            case 3:
                return "UPDATE OR ABORT `call_recipients_ranked_user_model` SET `igid` = ?,`entity_type` = ?,`score` = ?,`username` = ?,`profile_picture_url` = ? WHERE `igid` = ?";
            default:
                return "UPDATE OR REPLACE `drafts` SET `id` = ?,`is_uploading` = ?,`video_path` = ?,`video_orig_rotation` = ?,`video_orig_width` = ?,`video_orig_height` = ?,`duration` = ?,`title` = ?,`description` = ?,`series_id` = ?,`is_unified_video` = ?,`filter_id` = ?,`filter_strength` = ?,`post_crop_aspect_ratio` = ?,`is_landscape_surface` = ?,`is_over_image_custom` = ?,`cover_image_file_path` = ?,`cover_image_width` = ?,`cover_image_height` = ?,`cover_image_video_time_mx` = ?,`is_cover_image_fram_video_edited` = ?,`is_preview_enabled` = ?,`preview_crop_coords` = ?,`profile_crop_coords` = ?,`is_internal` = ?,`group_destination_user_id` = ?,`share_to_facebook` = ?,`are_captions_enabled` = ?,`are_comments_disabled` = ?,`is_funded_content_deal` = ?,`is_like_and_view_counts_disabled` = ?,`is_paid_partnership` = ?,`branded_content_info` = ?,`partner_boost_enabled` = ?,`shopping_info` = ?,`created_timestamp` = ?,`last_modified_timestamp` = ? WHERE `id` = ?";
        }
    }
}
