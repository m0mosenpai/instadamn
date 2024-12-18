package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.model.InstagramAudioApplySource;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AEU {
    public static final boolean A00(Intent intent, FragmentActivity fragmentActivity, UserSession userSession, Integer num, boolean z) {
        C22P c22p;
        EnumC222859sQ enumC222859sQ;
        INH A0C;
        Intent intent2 = (Intent) intent.getParcelableExtra(AbstractC54200Nxe.A00(num));
        if (intent2 == null) {
            return false;
        }
        if (z && userSession != null) {
            int intValue = num.intValue();
            if (intValue != 4) {
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            c22p = C22P.A5N;
                        } else {
                            c22p = C22P.A5G;
                        }
                    } else {
                        c22p = C22P.A5F;
                    }
                } else if (C14360o3.A0K(intent2.getAction(), "com.instagram.share.ADD_AUTO_CAPTURE_TO_REEL") && C18U.A06(C06090Tz.A05, userSession, 36320734536016740L)) {
                    c22p = C22P.A3b;
                } else if (C14360o3.A0K(intent2.getAction(), MSV.A00(1073)) && C18U.A06(C06090Tz.A05, userSession, 36320734536409959L)) {
                    c22p = C22P.A3c;
                } else {
                    c22p = C22P.A5I;
                }
            } else {
                c22p = C22P.A2c;
            }
            C198278pc A00 = C198278pc.A0A.A00();
            Integer num2 = C05F.A01;
            String A002 = MSV.A00(1069);
            if (num == num2) {
                String stringExtra = intent2.getStringExtra(MSV.A00(1070));
                if (stringExtra != null) {
                    String stringExtra2 = intent2.getStringExtra(A002);
                    InstagramAudioApplySource instagramAudioApplySource = InstagramAudioApplySource.A08;
                    String stringExtra3 = intent2.getStringExtra("attribution");
                    A0C = AbstractC86593tX.A0C(c22p);
                    A0C.A0c = stringExtra;
                    A0C.A0J = stringExtra2;
                    A0C.A0A = instagramAudioApplySource;
                    A0C.A0F = stringExtra3;
                    A0C.A0q = true;
                } else {
                    return true;
                }
            } else if (num == C05F.A0C) {
                Medium medium = A00.A03;
                if (medium == null) {
                    return true;
                }
                String stringExtra4 = intent2.getStringExtra(A002);
                if (c22p == C22P.A5G) {
                    enumC222859sQ = EnumC222859sQ.A04;
                } else {
                    enumC222859sQ = EnumC222859sQ.A06;
                }
                A0C = AbstractC86593tX.A0C(c22p);
                A0C.A0F = stringExtra4;
                A0C.A0q = true;
                MediaUploadMetadata mediaUploadMetadata = medium.A0G;
                String str = medium.A0N;
                String str2 = medium.A0X;
                int i = medium.A0B;
                int i2 = medium.A04;
                A0C.A04 = new SharePlatformStickerClientModel(mediaUploadMetadata, enumC222859sQ, str, str2, 0.0f, 0.0f, i2, i, medium.A07, i, i2, true);
            } else {
                AbstractC86593tX.A0V(fragmentActivity, c22p, userSession, intent2.getStringExtra("attribution"), intent2.getStringExtra("mwa_ac_templates_thumbnail_index"), intent2.getStringExtra("mwa_ac_templates_category"), A00.A09, false);
                return true;
            }
            C6XJ.A02(fragmentActivity, A0C.A00(), userSession, TransparentModalActivity.class, "clips_camera").A0C(fragmentActivity);
            return true;
        }
        C9GR.A06(fragmentActivity, 2131968074);
        return false;
    }

    public static final boolean A01(String str, String str2) {
        List A0m = AbstractC167007dF.A0m(str2, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        return (A0m == null || A0m.isEmpty() || str == null || str.length() == 0 || !A0m.contains(str)) ? false : true;
    }
}
