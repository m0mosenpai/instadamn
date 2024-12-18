package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Hjs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39722Hjs {
    public static String A00(AndroidLink androidLink) {
        EnumC906041v A01 = AbstractC114965Hm.A01(androidLink);
        if (A01 != null) {
            int ordinal = A01.ordinal();
            if (ordinal == 7) {
                if (androidLink.BGG() != null) {
                    return androidLink.BGG();
                }
            } else {
                switch (ordinal) {
                    case 0:
                        return androidLink.CHN();
                    case 1:
                        String CIt = androidLink.CIt();
                        CIt.getClass();
                        return AbstractC14490oL.A01.buildUpon().appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, CIt).build().toString();
                    case 2:
                    case 3:
                    case 4:
                    case 10:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    case 14:
                    case Process.SIGTERM /* 15 */:
                    case 16:
                    case 17:
                    case 18:
                    case Process.SIGSTOP /* 19 */:
                    case 20:
                        return androidLink.Aw8();
                }
            }
        }
        return null;
    }
}
