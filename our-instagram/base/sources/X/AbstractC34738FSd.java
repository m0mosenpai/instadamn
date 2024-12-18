package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FSd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34738FSd {
    public static C115875Md parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("posts".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC31180DnO.A1N(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                c16l.A0z();
            }
            return new C115875Md(user, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C115875Md c115875Md) {
        anonymousClass182.A0d();
        List list = c115875Md.A01;
        if (list != null) {
            C16V.A03(anonymousClass182, "posts");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C38321qM A0i = AbstractC31172DnG.A0i(it);
                if (A0i != null) {
                    C38801rC c38801rC = C38321qM.A0h;
                    C38801rC.A07(anonymousClass182, A0i);
                }
            }
            anonymousClass182.A0Z();
        }
        User user = c115875Md.A00;
        if (user != null) {
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        anonymousClass182.A0a();
    }
}
