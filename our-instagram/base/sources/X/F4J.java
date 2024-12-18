package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class F4J {
    public static C45110Jxf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            EnumC101664hb enumC101664hb = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("timestamp".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("action_type".equals(A0s)) {
                    enumC101664hb = EnumC101664hb.valueOf(c16l.A1P().toUpperCase(Locale.US));
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("timestamp", c16l, "DirectVisualMessageActionLog");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (enumC101664hb == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("action_type", c16l, "DirectVisualMessageActionLog");
                } else {
                    return new C45110Jxf(enumC101664hb, str, l.longValue());
                }
            } else {
                AbstractC166997dE.A1V(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, c16l, "DirectVisualMessageActionLog");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
