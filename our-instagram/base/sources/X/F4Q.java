package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F4Q {
    public static BroadcastChannelXpostingChannelInfo parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            SimpleImageUrl simpleImageUrl = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC58317Pt9.A00(837);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("thread_fbid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("group_image_uri".equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("is_enabled".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (A00.equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("thread_fbid", c16l, "BroadcastChannelXpostingChannelInfo");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_enabled", c16l, "BroadcastChannelXpostingChannelInfo");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "BroadcastChannelXpostingChannelInfo");
                } else {
                    return new BroadcastChannelXpostingChannelInfo(simpleImageUrl, str, str2, str3, bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "BroadcastChannelXpostingChannelInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
