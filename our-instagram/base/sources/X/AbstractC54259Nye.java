package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Nye, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54259Nye {
    public static C56802PIt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C56802PIt c56802PIt = new C56802PIt();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (!"pk".equals(A0s) && !PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if ("created_at".equals(A0s)) {
                        c56802PIt.A02 = c16l.A0y();
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                        EnumC53245Ngi enumC53245Ngi = (EnumC53245Ngi) EnumC53245Ngi.A01.get(AbstractC167017dG.A0m(c16l));
                        if (enumC53245Ngi == null) {
                            enumC53245Ngi = EnumC53245Ngi.A0D;
                        }
                        c56802PIt.A05 = enumC53245Ngi;
                    } else if (AbstractC111324zv.A00(1361).equals(A0s)) {
                        c56802PIt.A01 = c16l.A1D();
                    } else if ("featured_image".equals(A0s)) {
                        AbstractC31178DnM.A1I(c16l);
                    } else if ("cta_text".equals(A0s)) {
                        c56802PIt.A07 = AbstractC167017dG.A0m(c16l);
                    } else if ("shopping_logging_info".equals(A0s)) {
                        c56802PIt.A03 = AbstractC54254NyZ.parseFromJson(c16l);
                    } else if (!PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s) && !"owner".equals(A0s)) {
                        if ("text".equals(A0s)) {
                            c56802PIt.A09 = AbstractC167017dG.A0m(c16l);
                        }
                    } else {
                        Parcelable.Creator creator = User.CREATOR;
                        c56802PIt.A04 = AbstractC38851rI.A00(c16l, false);
                    }
                } else {
                    c56802PIt.A06 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c56802PIt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
