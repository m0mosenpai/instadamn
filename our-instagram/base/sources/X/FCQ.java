package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* loaded from: classes6.dex */
public abstract class FCQ {
    public static void A00(C16L c16l, EB0 eb0, String str) {
        if ("profile_pic_url".equals(str)) {
            eb0.A01 = AbstractC222616c.A00(c16l);
            return;
        }
        if (AbstractC31186DnV.A00().equals(str)) {
            eb0.A05 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("full_name".equals(str)) {
            eb0.A03 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(str)) {
            eb0.A04 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if (AbstractC58317Pt9.A00(296).equals(str)) {
            eb0.A02 = AbstractC31173DnH.A0h(c16l);
            return;
        }
        if ("is_auto_block_enabled".equals(str)) {
            eb0.A06 = c16l.A0d();
        } else if ("interop_user_type".equals(str)) {
            eb0.A00 = c16l.A1D();
        } else {
            C55702hA.A01(c16l, eb0, str);
        }
    }
}
