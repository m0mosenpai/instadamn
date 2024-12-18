package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class LCF {
    public static C206179Ba parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            Long l = null;
            Long l2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("offset".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("length".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("fbId".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("user_or_thread_fbid".equals(A0s)) {
                    l2 = AbstractC31173DnH.A0h(c16l);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("offset", c16l, "CommandRangeData");
            } else if (num2 != null || !(c16l instanceof C07950bF)) {
                if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c16l, "CommandRangeData");
                } else {
                    return new C206179Ba(l, l2, num2.intValue(), num3.intValue(), num.intValue(), 0);
                }
            } else {
                AbstractC166997dE.A1V("length", c16l, "CommandRangeData");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C206179Ba c206179Ba, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("offset", c206179Ba.A02);
        anonymousClass182.A0Q("length", c206179Ba.A01);
        anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c206179Ba.A03);
        Number number = (Number) c206179Ba.A04;
        if (number != null) {
            anonymousClass182.A0R("fbId", number.longValue());
        }
        Number number2 = (Number) c206179Ba.A05;
        if (number2 != null) {
            anonymousClass182.A0R("user_or_thread_fbid", number2.longValue());
        }
        anonymousClass182.A0a();
    }
}
