package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class AEK {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.A98, java.lang.Object] */
    public static A98 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media".equals(A0s)) {
                    obj.A01 = C38321qM.A00(c16l);
                } else if ("mentioned_users".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    obj.A03 = arrayList;
                } else if ("year".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    obj.A02 = AbstractC38851rI.A00(c16l, false);
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

    public static void A00(AnonymousClass182 anonymousClass182, A98 a98) {
        anonymousClass182.A0d();
        if (a98.A01 != null) {
            anonymousClass182.A0r("media");
            C38321qM c38321qM = a98.A01;
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        if (a98.A03 != null) {
            C16V.A03(anonymousClass182, "mentioned_users");
            Iterator it = a98.A03.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1G(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0Q("year", a98.A00);
        if (a98.A02 != null) {
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            User user = a98.A02;
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        anonymousClass182.A0a();
    }
}
