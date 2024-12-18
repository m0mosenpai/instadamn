package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes7.dex */
public abstract class I58 {
    public static final String A00(JPX jpx, String str) {
        String A00;
        C14360o3.A0B(str, 0);
        switch (jpx.BlT().intValue()) {
            case 1:
                A00 = "avatar_sticker_upsell";
                break;
            case 2:
                A00 = "caption";
                break;
            case 3:
                A00 = MSV.A00(1017);
                break;
            case 4:
                A00 = "comments";
                break;
            case 5:
                A00 = "creation_gen_ai";
                break;
            case 6:
                A00 = AbstractC43591JPw.A00(327);
                break;
            case 7:
                A00 = "dpa";
                break;
            case 8:
                A00 = "fb_xposting_to_ig";
                break;
            case 9:
                A00 = AbstractC111324zv.A00(4496);
                break;
            case 10:
                A00 = AbstractC111324zv.A00(4502);
                break;
            case 11:
                A00 = "hashtag";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A00 = "location";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A00 = "magic_mod";
                break;
            case 14:
                A00 = "mentions";
                break;
            case Process.SIGTERM /* 15 */:
                A00 = BaseViewManager.STATE_MIXED;
                break;
            case 16:
                A00 = "more_info";
                break;
            case 17:
                A00 = "polaroid_sticker";
                break;
            case 18:
                A00 = "product";
                break;
            case Process.SIGSTOP /* 19 */:
                A00 = "product_collection";
                break;
            case 20:
                A00 = "reshared_post";
                break;
            case 21:
                A00 = "threads_app_upsell";
                break;
            case 22:
                A00 = "translation";
                break;
            case 23:
                A00 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                break;
            case 24:
                A00 = "wearable";
                break;
            case 25:
                A00 = MSV.A00(35);
                break;
            default:
                A00 = "avatar_nux_entry";
                break;
        }
        return AnonymousClass001.A0g(str, "_context_sheet_", A00);
    }
}
