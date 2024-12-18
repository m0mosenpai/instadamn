package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ADG {
    public static StoryGroupMentionTappableData parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            Integer num = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("custom_text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("mentioned_users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sticker_style_enum".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "StoryGroupMentionTappableData");
            } else if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("mentioned_users", c16l, "StoryGroupMentionTappableData");
            } else {
                return new StoryGroupMentionTappableData(num, str, str2, str3, arrayList);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, StoryGroupMentionTappableData storyGroupMentionTappableData) {
        anonymousClass182.A0d();
        String str = storyGroupMentionTappableData.A01;
        if (str != null) {
            anonymousClass182.A0S("custom_text_color", str);
        }
        String str2 = storyGroupMentionTappableData.A02;
        if (str2 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        }
        List list = storyGroupMentionTappableData.A04;
        if (list != null) {
            C16V.A03(anonymousClass182, "mentioned_users");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1G(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        Integer num = storyGroupMentionTappableData.A00;
        if (num != null) {
            anonymousClass182.A0Q("sticker_style_enum", num.intValue());
        }
        String str3 = storyGroupMentionTappableData.A03;
        if (str3 != null) {
            anonymousClass182.A0S("text", str3);
        }
        anonymousClass182.A0a();
    }
}
