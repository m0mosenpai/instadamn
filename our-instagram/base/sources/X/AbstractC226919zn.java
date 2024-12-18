package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.9zn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226919zn {
    public static C83o parseFromJson(C16L c16l) {
        String A00;
        String A002;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Float f = null;
            User user = null;
            User user2 = null;
            String str = null;
            Integer num3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Float f2 = null;
            C88513x8 c88513x8 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(2613);
                A002 = AbstractC111324zv.A00(348);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if (AbstractC111324zv.A00(4521).equals(A0s)) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    user2 = AbstractC38851rI.A00(c16l, false);
                } else if ("original_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("container_height".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("container_width".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (A002.equals(A0s)) {
                    f = AbstractC167007dF.A0b(c16l);
                } else if ("media_duration".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(2066).equals(A0s)) {
                    c88513x8 = AbstractC83943oe.parseFromJson(c16l);
                } else if (A00.equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_video_transcoding_enabled".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("full_screen_scale".equals(A0s)) {
                    f2 = AbstractC167007dF.A0b(c16l);
                }
                c16l.A0z();
            }
            if (user == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_USER, c16l, "ClipsReshareViewModel");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("container_height", c16l, "ClipsReshareViewModel");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("container_width", c16l, "ClipsReshareViewModel");
                } else if (f == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A002, c16l, "ClipsReshareViewModel");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("media_duration", c16l, "ClipsReshareViewModel");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "ClipsReshareViewModel");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_video_transcoding_enabled", c16l, "ClipsReshareViewModel");
                } else if (f2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("full_screen_scale", c16l, "ClipsReshareViewModel");
                } else {
                    return new C83o(c88513x8, user, user2, str, f.floatValue(), f2.floatValue(), num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("original_media_id", c16l, "ClipsReshareViewModel");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
