package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.GsE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38269GsE {
    public static C9C8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            H5N h5n = null;
            C31200Dnj c31200Dnj = null;
            ArrayList arrayList = null;
            Boolean bool2 = null;
            String str = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("avatar_quick_reaction".equals(A0q)) {
                    h5n = AbstractC40268HtY.parseFromJson(c16l);
                } else if ("emoji_reaction".equals(A0q)) {
                    c31200Dnj = AbstractC40696I2c.parseFromJson(c16l);
                } else if ("emoji_reactions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C31200Dnj parseFromJson = AbstractC40696I2c.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("has_liked".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_spam_viewer".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("reply_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("is_spam_viewer", "StoryViewerWithInteractions");
            } else if (user == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_USER, "StoryViewerWithInteractions");
            } else {
                return new C9C8(c31200Dnj, h5n, user, bool2, str, arrayList, bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
