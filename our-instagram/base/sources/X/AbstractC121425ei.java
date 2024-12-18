package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import java.io.IOException;

/* renamed from: X.5ei, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC121425ei {
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, com.instagram.direct.model.thread.CreatorBroadcastThreadInfo] */
    public static CreatorBroadcastThreadInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool2 = null;
            Integer num2 = null;
            String str = null;
            SimpleImageUrl simpleImageUrl = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("ig_creator_igid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ig_creator_profile_picture_url".equals(A0q)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("is_added_to_inbox".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("audience_type".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("join_link".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_creator_verified".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("number_of_members".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("creator_username".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("social_context_username".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("is_added_to_inbox", "CreatorBroadcastThreadInfo");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (bool2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_creator_verified", "CreatorBroadcastThreadInfo");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("number_of_members", "CreatorBroadcastThreadInfo");
                } else {
                    boolean booleanValue = bool.booleanValue();
                    int intValue = num.intValue();
                    boolean booleanValue2 = bool2.booleanValue();
                    int intValue2 = num2.intValue();
                    ?? obj = new Object();
                    obj.A03 = str;
                    obj.A02 = simpleImageUrl;
                    obj.A07 = booleanValue;
                    obj.A00 = intValue;
                    obj.A05 = str2;
                    obj.A08 = booleanValue2;
                    obj.A01 = intValue2;
                    obj.A04 = str3;
                    obj.A06 = str4;
                    return obj;
                }
            } else {
                ((C07950bF) c16l).A03.A00("audience_type", "CreatorBroadcastThreadInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, CreatorBroadcastThreadInfo creatorBroadcastThreadInfo) {
        anonymousClass182.A0d();
        String str = creatorBroadcastThreadInfo.A03;
        if (str != null) {
            anonymousClass182.A0S("ig_creator_igid", str);
        }
        if (creatorBroadcastThreadInfo.A02 != null) {
            anonymousClass182.A0r("ig_creator_profile_picture_url");
            AbstractC222616c.A01(anonymousClass182, creatorBroadcastThreadInfo.A02);
        }
        anonymousClass182.A0T("is_added_to_inbox", creatorBroadcastThreadInfo.A07);
        anonymousClass182.A0Q("audience_type", creatorBroadcastThreadInfo.A00);
        String str2 = creatorBroadcastThreadInfo.A05;
        if (str2 != null) {
            anonymousClass182.A0S("join_link", str2);
        }
        anonymousClass182.A0T("is_creator_verified", creatorBroadcastThreadInfo.A08);
        anonymousClass182.A0Q("number_of_members", creatorBroadcastThreadInfo.A01);
        String str3 = creatorBroadcastThreadInfo.A04;
        if (str3 != null) {
            anonymousClass182.A0S("creator_username", str3);
        }
        String str4 = creatorBroadcastThreadInfo.A06;
        if (str4 != null) {
            anonymousClass182.A0S("social_context_username", str4);
        }
        anonymousClass182.A0a();
    }
}
