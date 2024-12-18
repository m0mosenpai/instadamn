package X;

import android.graphics.PointF;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.people.PeopleTag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class IR0 {
    public static PeopleTag parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            PeopleTag peopleTag = new PeopleTag();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    peopleTag.A00 = I2S.parseFromJson(c16l);
                } else if ("show_category_of_user".equals(A0s)) {
                    peopleTag.A02 = c16l.A0d();
                } else if ("sticker_overlay_tag".equals(A0s)) {
                    peopleTag.A03 = c16l.A0d();
                } else if ("categories".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    peopleTag.A01 = arrayList;
                } else if ("position".equals(A0s)) {
                    ((com.instagram.tagging.model.Tag) peopleTag).A00 = C55X.A00(c16l);
                }
                c16l.A0z();
            }
            return peopleTag;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, PeopleTag peopleTag) {
        anonymousClass182.A0d();
        if (peopleTag.A00 != null) {
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            PeopleTag.UserInfo userInfo = peopleTag.A00;
            anonymousClass182.A0d();
            String str = userInfo.A04;
            if (str != null) {
                anonymousClass182.A0S(AbstractC31187DnW.A01(), str);
            }
            String str2 = userInfo.A03;
            if (str2 != null) {
                anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
            }
            String str3 = userInfo.A02;
            if (str3 != null) {
                anonymousClass182.A0S("full_name", str3);
            }
            if (userInfo.A01 != null) {
                anonymousClass182.A0r("profile_pic_url");
                AbstractC222616c.A01(anonymousClass182, userInfo.A01);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("show_category_of_user", peopleTag.A02);
        anonymousClass182.A0T("sticker_overlay_tag", peopleTag.A03);
        if (peopleTag.A01 != null) {
            C16V.A03(anonymousClass182, "categories");
            Iterator it = peopleTag.A01.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        PointF pointF = ((com.instagram.tagging.model.Tag) peopleTag).A00;
        if (pointF != null) {
            C55X.A01(pointF, anonymousClass182, "position");
        }
        anonymousClass182.A0a();
    }
}
