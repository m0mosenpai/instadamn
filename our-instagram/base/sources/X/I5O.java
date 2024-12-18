package X;

import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponsesModel;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I5O {
    public static QuestionResponsesModel parseFromJson(C16L c16l) {
        String A00;
        String A002;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            Long l = null;
            String str2 = null;
            String str3 = null;
            User user = null;
            String str4 = null;
            QuestionStickerType questionStickerType = null;
            ArrayList arrayList = null;
            String str5 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(1354);
                A002 = AbstractC111324zv.A00(507);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1075).equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("max_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("more_available".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("question".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1201).equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("question_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (A002.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("question_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    questionStickerType = (QuestionStickerType) QuestionStickerType.A01.get(A1P);
                    if (questionStickerType == null) {
                        questionStickerType = QuestionStickerType.A09;
                    }
                } else if ("responders".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            QuestionResponseModel parseFromJson = I5M.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, A00);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("background_color", c16l, "QuestionResponsesModel");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("question", c16l, "QuestionResponsesModel");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("question_id", c16l, "QuestionResponsesModel");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A002, c16l, "QuestionResponsesModel");
                } else if (questionStickerType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("question_type", c16l, "QuestionResponsesModel");
                } else if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("responders", c16l, "QuestionResponsesModel");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("text_color", c16l, "QuestionResponsesModel");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "QuestionResponsesModel");
                } else {
                    return new QuestionResponsesModel(questionStickerType, user, l, str, str2, str3, str4, str5, arrayList, num.intValue(), num2.intValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("more_available", c16l, "QuestionResponsesModel");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
