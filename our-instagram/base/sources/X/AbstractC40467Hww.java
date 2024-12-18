package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Hww, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40467Hww {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.IJT, java.lang.Object] */
    public static IJT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("pk".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    obj.A03 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("broadcast".equals(A0s)) {
                    obj.A02 = C41655Ibn.parseFromJson(c16l);
                } else if ("last_seen_broadcast_ts".equals(A0s)) {
                    obj.A00 = c16l.A0y();
                } else if (!"can_reply".equals(A0s) && !"can_reshare".equals(A0s)) {
                    if ("cover_frame_url".equals(A0s)) {
                        obj.A01 = AbstractC222616c.A00(c16l);
                    } else if ("progressive_playback_url".equals(A0s)) {
                        AbstractC31178DnM.A1I(c16l);
                    } else if ("can_share_to_igtv".equals(A0s)) {
                        obj.A05 = c16l.A0d();
                    }
                } else {
                    c16l.A0d();
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
