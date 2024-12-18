package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.CzR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29513CzR implements InterfaceC31003Dk2 {
    @Override // X.InterfaceC31003Dk2
    public final Drawable AzM(Context context, C6C c6c) {
        C14360o3.A0B(c6c, 1);
        C6C c6c2 = C6C.A03;
        int i = R.color.igds_prism_gray_03;
        if (c6c == c6c2) {
            i = R.color.memu_shutter_blue_100;
        }
        int color = context.getColor(i);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new OvalShape());
        shapeDrawable.getPaint().setColor(color);
        GradientDrawable A0O = AbstractC25228BEl.A0O(1);
        A0O.setStroke(15, color);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, A0O, C3LQ.A06(context, R.drawable.instagram_camera_pano_outline_24, R.color.igds_icon_on_color)});
        layerDrawable.setLayerInset(0, 20, 20, 20, 20);
        layerDrawable.setLayerInset(2, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
        return layerDrawable;
    }

    @Override // X.InterfaceC31003Dk2
    public final int BEs(C87 c87) {
        switch (c87.ordinal()) {
            case 0:
                if (!C1AD.A06(C06090Tz.A05, 18315746299953882L)) {
                    return R.drawable.gen_ai_assets_metaaicontextheader;
                }
                return R.drawable.gen_ai_assets_metaaicontextheader_new;
            case 1:
                return R.drawable.instagram_gen_ai_pano_outline_24;
            case 2:
            case 3:
                return R.drawable.instagram_gen_ai_pano_filled_24;
            case 4:
            case 20:
                return R.drawable.instagram_arrow_cw_pano_outline_24;
            case 5:
                return R.drawable.instagram_circle_play_pano_outline_24;
            case 6:
                return R.drawable.meta_ai_select_crosshairs;
            case 7:
                return R.drawable.instagram_palette_gen_ai_pano_outline_24;
            case 8:
                return R.drawable.instagram_x_pano_outline_24;
            case 9:
                return R.drawable.instagram_more_horizontal_pano_filled_24;
            case 10:
                return R.drawable.instagram_arrow_right_pano_filled_24;
            case 11:
                return R.drawable.instagram_undo_pano_outline_24;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return R.drawable.instagram_undo_pano_filled_24;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return R.drawable.instagram_redo_pano_filled_24;
            case 14:
                return R.drawable.instagram_chevron_left_pano_filled_24;
            case Process.SIGTERM /* 15 */:
                return R.drawable.instagram_photo_gen_ai_pano_outline_24;
            case 16:
                return R.drawable.instagram_meta_gen_ai_pano_outline_24;
            case 17:
                return R.drawable.instagram_beaker_pano_outline_24;
            case 18:
                return R.drawable.instagram_photo_pano_outline_24;
            case Process.SIGSTOP /* 19 */:
                return R.drawable.instagram_sparkles_pano_outline_24;
            case 21:
                return R.drawable.instagram_thumb_up_pano_outline_24;
            case 22:
                return R.drawable.instagram_thumb_down_pano_outline_24;
            case 23:
                return R.drawable.instagram_chevron_right_pano_outline_24;
            case 24:
                return R.drawable.instagram_download_pano_outline_24;
            case 25:
                return R.drawable.instagram_edit_ai_pano_outline_24;
            case 26:
                return R.drawable.instagram_edit_pano_outline_24;
            case 27:
                return R.drawable.memu_brand_assets_consent;
            case 28:
                return R.drawable.memu_brand_assets_nux;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return R.drawable.memu_brand_assets_card_mid;
            case 30:
                return R.drawable.memu_brand_assets_card_left;
            case 31:
                return R.drawable.memu_brand_assets_card_right;
            case 32:
                return R.drawable.memu_brand_assets_simplified_ring;
            case 33:
                return R.drawable.instagram_direct_gen_ai_pano_filled_24;
            case 34:
                return R.drawable.instagram_face2_gen_ai_pano_outline_24;
            case 35:
                return R.drawable.radio_button_checked;
            case 36:
                return R.drawable.radio_button_unchecked;
            case 37:
                return R.drawable.instagram_verified_pano_filled_24;
            case 38:
                return R.drawable.ig_illustrations_illo_write_with_ai_refresh;
            default:
                throw AbstractC166987dD.A12("Unknown icon name");
        }
    }
}
