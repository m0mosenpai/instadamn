package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import com.facebook.R;

/* loaded from: classes4.dex */
public abstract class AKk {
    public static final Toast A00(Context context, String str) {
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.layout_invalid_audio_duration_toast);
        AbstractC31177DnL.A0r(context, AbstractC166997dE.A0T(A0C, R.id.toast_subtitle_text), str, 2131955550);
        Toast toast = new Toast(context);
        toast.setView(A0C);
        toast.setGravity(80, 0, AbstractC166987dD.A0C(context, 130));
        toast.setDuration(1);
        toast.show();
        return toast;
    }

    public static final void A01(Context context, Exception exc, String str, boolean z) {
        String str2;
        int i;
        String str3;
        C14360o3.A0B(str, 1);
        if (z) {
            str2 = "ClipMetadataCorrupt";
        } else {
            str2 = "CannotAddClip";
        }
        AbstractC12120kG.A07(str2, str, exc);
        if (z) {
            i = 2131955242;
            str3 = "bad_metadata";
        } else {
            i = 2131955243;
            str3 = "add_video_failed";
        }
        C9GR.A0F(context, str3, i);
    }

    public static final void A02(Context context, Integer num, String str, int i) {
        String str2;
        C14360o3.A0B(str, 2);
        AbstractC12120kG.A07("ClipsOopsError", str, null);
        String string = context.getString(i);
        switch (num.intValue()) {
            case 0:
                str2 = "DELETE_SEGMENT_NO_UI";
                break;
            case 1:
                str2 = "STITCHED_VIDEO_ERROR";
                break;
            case 2:
                str2 = "DIRECTORY_PROVIDER_GHOST";
                break;
            case 3:
                str2 = "FRAME_RETRIEVING_FAILED";
                break;
            case 4:
                str2 = "VIDEO_PLAYER_NULL";
                break;
            case 5:
                str2 = "VIDEO_AUDIO_BURN";
                break;
            case 6:
                str2 = "IMPORT_ERROR";
                break;
            case 7:
                str2 = "VIEWHOLDER_NULL";
                break;
            case 8:
                str2 = "VVP_ERROR";
                break;
            case 9:
                str2 = "MISSING_VIDEO";
                break;
            default:
                str2 = "EFFECT_RETRIEVING_FAILED";
                break;
        }
        C9GR.A03(context, string, AbstractC167007dF.A0h(str2), 0);
    }

    public static final void A03(Context context, String str) {
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.layout_invalid_audio_duration_toast);
        AbstractC31177DnL.A0r(context, AbstractC166997dE.A0T(A0C, R.id.toast_subtitle_text), str, 2131955549);
        Toast toast = new Toast(context);
        toast.setView(A0C);
        toast.setGravity(80, 0, AbstractC166987dD.A0C(context, 130));
        toast.setDuration(1);
        toast.show();
    }
}
