package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.StoryPollColorType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101354gs {
    public static C101394gx parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            StoryPollColorType storyPollColorType = null;
            Integer num = null;
            Boolean bool = null;
            String str = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str2 = null;
            PollType pollType = null;
            ArrayList arrayList = null;
            String str3 = null;
            C87493vH c87493vH = null;
            ArrayList arrayList2 = null;
            Integer num2 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    storyPollColorType = (StoryPollColorType) StoryPollColorType.A01.get(A1P2);
                    if (storyPollColorType == null) {
                        storyPollColorType = StoryPollColorType.A0C;
                    }
                } else if ("expires_at".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("finished".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_multi_option_poll".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_shared_result".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("poll_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("poll_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    pollType = (PollType) PollType.A01.get(A1P);
                    if (pollType == null) {
                        pollType = PollType.A06;
                    }
                } else if ("promotion_tallies".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C101374gu parseFromJson = AbstractC101364gt.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("question".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("social_context".equals(A0q)) {
                    c87493vH = AbstractC87453vC.parseFromJson(c16l);
                } else if ("tallies".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C101374gu parseFromJson2 = AbstractC101364gt.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("total_votes".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("viewer_can_vote".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("viewer_is_owner".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("viewer_vote".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C101394gx(pollType, c87493vH, storyPollColorType, bool, bool2, bool3, bool4, bool5, num, num2, num3, str, str2, str3, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C101394gx c101394gx, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        StoryPollColorType storyPollColorType = c101394gx.A02;
        if (storyPollColorType != null) {
            anonymousClass182.A0S("color", storyPollColorType.A00);
        }
        Integer num = c101394gx.A08;
        if (num != null) {
            anonymousClass182.A0Q("expires_at", num.intValue());
        }
        Boolean bool = c101394gx.A03;
        if (bool != null) {
            anonymousClass182.A0T("finished", bool.booleanValue());
        }
        String str = c101394gx.A0B;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        Boolean bool2 = c101394gx.A04;
        if (bool2 != null) {
            anonymousClass182.A0T("is_multi_option_poll", bool2.booleanValue());
        }
        Boolean bool3 = c101394gx.A05;
        if (bool3 != null) {
            anonymousClass182.A0T("is_shared_result", bool3.booleanValue());
        }
        String str2 = c101394gx.A0C;
        if (str2 != null) {
            anonymousClass182.A0S("poll_id", str2);
        }
        PollType pollType = c101394gx.A00;
        if (pollType != null) {
            anonymousClass182.A0S("poll_type", pollType.A00);
        }
        List<C101374gu> list = c101394gx.A0E;
        if (list != null) {
            C16V.A03(anonymousClass182, "promotion_tallies");
            for (C101374gu c101374gu : list) {
                if (c101374gu != null) {
                    AbstractC101364gt.A00(anonymousClass182, c101374gu);
                }
            }
            anonymousClass182.A0Z();
        }
        String str3 = c101394gx.A0D;
        if (str3 != null) {
            anonymousClass182.A0S("question", str3);
        }
        C87493vH c87493vH = c101394gx.A01;
        if (c87493vH != null) {
            anonymousClass182.A0r("social_context");
            AbstractC87453vC.A00(anonymousClass182, c87493vH);
        }
        List<C101374gu> list2 = c101394gx.A0F;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "tallies");
            for (C101374gu c101374gu2 : list2) {
                if (c101374gu2 != null) {
                    AbstractC101364gt.A00(anonymousClass182, c101374gu2);
                }
            }
            anonymousClass182.A0Z();
        }
        Integer num2 = c101394gx.A09;
        if (num2 != null) {
            anonymousClass182.A0Q("total_votes", num2.intValue());
        }
        Boolean bool4 = c101394gx.A06;
        if (bool4 != null) {
            anonymousClass182.A0T("viewer_can_vote", bool4.booleanValue());
        }
        Boolean bool5 = c101394gx.A07;
        if (bool5 != null) {
            anonymousClass182.A0T("viewer_is_owner", bool5.booleanValue());
        }
        Integer num3 = c101394gx.A0A;
        if (num3 != null) {
            anonymousClass182.A0Q("viewer_vote", num3.intValue());
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
