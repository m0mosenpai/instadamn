package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.people.PeopleTag;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I2S {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.instagram.model.people.PeopleTag$UserInfo] */
    public static PeopleTag.UserInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31187DnW.A01().equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (!CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s) && !"pk".equals(A0s) && !AbstractC31171DnF.A1Y(A0s)) {
                    if ("full_name".equals(A0s)) {
                        obj.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("profile_pic_url".equals(A0s)) {
                        obj.A01 = AbstractC222616c.A00(c16l);
                    }
                } else {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
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
