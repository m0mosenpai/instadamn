package X;

import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ADF {
    public static URE parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Long l = null;
            QuestionStickerType questionStickerType = null;
            ArrayList arrayList = null;
            String str6 = null;
            Boolean bool2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_clips_v2_media".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("profile_pic_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("question".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("question_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(507).equals(A0s)) {
                    l = Long.valueOf(c16l.A0y());
                } else if (MSV.A00(253).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    questionStickerType = (QuestionStickerType) QuestionStickerType.A01.get(A1P2);
                    if (questionStickerType == null) {
                        questionStickerType = QuestionStickerType.A09;
                    }
                } else if ("response_types".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            arrayList.add(AbstractC201648vt.A00(A1P));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("viewer_can_interact".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return new URE(questionStickerType, bool, bool2, l, str, str2, str3, str4, str5, str6, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, URE ure, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        String str = ure.A04;
        if (str != null) {
            anonymousClass182.A0S("background_color", str);
        }
        Boolean bool = ure.A01;
        if (bool != null) {
            anonymousClass182.A0T("is_clips_v2_media", bool.booleanValue());
        }
        String str2 = ure.A05;
        if (str2 != null) {
            anonymousClass182.A0S("media_id", str2);
        }
        String str3 = ure.A06;
        if (str3 != null) {
            anonymousClass182.A0S("profile_pic_url", str3);
        }
        String str4 = ure.A07;
        if (str4 != null) {
            anonymousClass182.A0S("question", str4);
        }
        String str5 = ure.A08;
        if (str5 != null) {
            anonymousClass182.A0S("question_id", str5);
        }
        Long l = ure.A03;
        if (l != null) {
            anonymousClass182.A0R(AbstractC111324zv.A00(507), l.longValue());
        }
        QuestionStickerType questionStickerType = ure.A00;
        if (questionStickerType != null) {
            anonymousClass182.A0S(MSV.A00(253), questionStickerType.A00);
        }
        List<QuestionResponseType> list = ure.A0A;
        if (list != null) {
            C16V.A03(anonymousClass182, "response_types");
            for (QuestionResponseType questionResponseType : list) {
                if (questionResponseType != null) {
                    anonymousClass182.A0u(questionResponseType.A00);
                }
            }
            anonymousClass182.A0Z();
        }
        String str6 = ure.A09;
        if (str6 != null) {
            anonymousClass182.A0S("text_color", str6);
        }
        Boolean bool2 = ure.A02;
        if (bool2 != null) {
            anonymousClass182.A0T("viewer_can_interact", bool2.booleanValue());
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
