package X;

import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.QuestionResponseModelIntf;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I5N {
    public static Map A00(QuestionResponsesModelIntf questionResponsesModelIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (questionResponsesModelIntf.getBackgroundColor() != null) {
            A1I.put("background_color", questionResponsesModelIntf.getBackgroundColor());
        }
        if (questionResponsesModelIntf.BMC() != null) {
            A1I.put(AbstractC111324zv.A00(1075), questionResponsesModelIntf.BMC());
        }
        if (questionResponsesModelIntf.BPp() != null) {
            A1I.put("max_id", questionResponsesModelIntf.BPp());
        }
        questionResponsesModelIntf.BUt();
        A1I.put("more_available", Boolean.valueOf(questionResponsesModelIntf.BUt()));
        if (questionResponsesModelIntf.getQuestion() != null) {
            A1I.put("question", questionResponsesModelIntf.getQuestion());
        }
        User BjR = questionResponsesModelIntf.BjR();
        if (BjR != null) {
            A1I.put(AbstractC111324zv.A00(1201), BjR.A07());
        }
        if (questionResponsesModelIntf.BjV() != null) {
            A1I.put("question_id", questionResponsesModelIntf.BjV());
        }
        questionResponsesModelIntf.Bja();
        A1I.put(AbstractC111324zv.A00(507), Integer.valueOf(questionResponsesModelIntf.Bja()));
        if (questionResponsesModelIntf.Bjf() != null) {
            QuestionStickerType Bjf = questionResponsesModelIntf.Bjf();
            C14360o3.A0B(Bjf, 0);
            A1I.put("question_type", Bjf.A00);
        }
        if (questionResponsesModelIntf.Boe() != null) {
            List<QuestionResponseModelIntf> Boe = questionResponsesModelIntf.Boe();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (QuestionResponseModelIntf questionResponseModelIntf : Boe) {
                if (questionResponseModelIntf != null) {
                    A1E.add(questionResponseModelIntf.F7o());
                }
            }
            A1I.put("responders", A1E);
        }
        if (questionResponsesModelIntf.getTextColor() != null) {
            A1I.put("text_color", questionResponsesModelIntf.getTextColor());
        }
        questionResponsesModelIntf.CCJ();
        return AbstractC37301Gc2.A0r(AbstractC111324zv.A00(1354), Integer.valueOf(questionResponsesModelIntf.CCJ()), A1I);
    }
}
