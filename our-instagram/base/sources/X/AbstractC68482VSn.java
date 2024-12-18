package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.VSn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68482VSn {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Vsn, java.lang.Object] */
    public static C69646Vsn parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("account_hcm_metadata".equals(A0s)) {
                    obj.A00 = AbstractC68361VNv.parseFromJson(c16l);
                } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A0s)) {
                    obj.A04 = AbstractC84383pX.parseFromJson(c16l);
                } else if ("track_metadata".equals(A0s)) {
                    obj.A05 = AbstractC38068Gox.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    obj.A06 = AbstractC38851rI.A00(c16l, false);
                } else if ("original_sound".equals(A0s)) {
                    obj.A01 = C3XP.parseFromJson(c16l);
                } else if ("threads_search_metadata".equals(A0s)) {
                    obj.A03 = AbstractC99224cn.parseFromJson(c16l);
                } else if ("places".equals(A0s)) {
                    obj.A02 = AbstractC68385VOt.parseFromJson(c16l);
                } else if ("playlist_id".equals(A0s)) {
                    obj.A07 = AbstractC31173DnH.A0h(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
