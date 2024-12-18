package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes4.dex */
public abstract class A14 {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.AA7] */
    public static AA7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("images".equals(A0s)) {
                    obj.A00 = A11.parseFromJson(c16l);
                } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A0s)) {
                    obj.A01 = A13.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    obj.A02 = A15.parseFromJson(c16l);
                } else if ("is_sticker".equals(A0s)) {
                    obj.A03 = AbstractC166997dE.A0d(c16l);
                } else if ("expression_id".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
