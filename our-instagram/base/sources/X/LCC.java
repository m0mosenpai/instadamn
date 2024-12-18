package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.reels.ReelType;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public abstract class LCC {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.7QP] */
    public static C7QP parseFromJson(C16L c16l) {
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
                } else if ("text".equals(A0s)) {
                    obj.A08 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("is_linked".equals(A0s)) {
                    obj.A09 = c16l.A0d();
                } else if ("is_moment".equals(A0s)) {
                    obj.A03 = AbstractC166997dE.A0d(c16l);
                } else if ("is_reel_persisted".equals(A0s)) {
                    obj.A0A = c16l.A0d();
                } else if ("reel_type".equals(A0s)) {
                    obj.A02 = AbstractC40281tw.A00(AbstractC167017dG.A0m(c16l));
                } else if ("story_share_type".equals(A0s)) {
                    String A1P = c16l.A1P();
                    Integer num = C05F.A01;
                    if (!"chat_sticker_initial".equals(A1P)) {
                        num = C05F.A00;
                    }
                    obj.A04 = num;
                } else if ("reel_id".equals(A0s)) {
                    obj.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("reel_owner".equals(A0s)) {
                    obj.A00 = AbstractC37519Gfb.parseFromJson(c16l);
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

    public static void A00(AnonymousClass182 anonymousClass182, C7QP c7qp) {
        String str;
        anonymousClass182.A0d();
        if (c7qp.A01 != null) {
            anonymousClass182.A0r("media");
            C38321qM c38321qM = c7qp.A01;
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        AbstractC37301Gc2.A1E(anonymousClass182, c7qp.A08);
        String str2 = c7qp.A06;
        if (str2 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str2);
        }
        String str3 = c7qp.A05;
        if (str3 != null) {
            anonymousClass182.A0S(DialogModule.KEY_MESSAGE, str3);
        }
        anonymousClass182.A0T("is_linked", c7qp.A09);
        Boolean bool = c7qp.A03;
        if (bool != null) {
            anonymousClass182.A0T("is_moment", bool.booleanValue());
        }
        anonymousClass182.A0T("is_reel_persisted", c7qp.A0A);
        ReelType reelType = c7qp.A02;
        if (reelType != null) {
            anonymousClass182.A0S("reel_type", reelType.A00);
        }
        Integer num = c7qp.A04;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            } else {
                str = "chat_sticker_initial";
            }
            anonymousClass182.A0S("story_share_type", str);
        }
        String str4 = c7qp.A07;
        if (str4 != null) {
            anonymousClass182.A0S("reel_id", str4);
        }
        if (c7qp.A00 != null) {
            anonymousClass182.A0r("reel_owner");
            AbstractC37519Gfb.A00(anonymousClass182, c7qp.A00);
        }
        anonymousClass182.A0a();
    }
}
