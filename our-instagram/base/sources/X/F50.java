package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F50 {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.E9L] */
    public static E9L parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(5257);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("primary_context_line".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "thread_subtype");
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c16l, "DirectChannelsSecondaryContextLines");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "DirectChannelsSecondaryContextLines");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("thread_subtype", c16l, "DirectChannelsSecondaryContextLines");
                } else {
                    int intValue = num.intValue();
                    AbstractC167027dH.A13(str, str2, str3);
                    ?? obj = new Object();
                    obj.A03 = str;
                    obj.A01 = str2;
                    obj.A02 = str3;
                    obj.A00 = intValue;
                    return obj;
                }
            } else {
                AbstractC166997dE.A1V("primary_context_line", c16l, "DirectChannelsSecondaryContextLines");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
