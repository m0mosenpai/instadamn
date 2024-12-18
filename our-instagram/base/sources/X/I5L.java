package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.model.MusicQuestionResponseModelIntf;
import com.instagram.reels.question.model.QuestionResponseModelIntf;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I5L {
    public static Map A00(QuestionResponseModelIntf questionResponseModelIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        questionResponseModelIntf.BCd();
        A1I.put("has_shared_response", Boolean.valueOf(questionResponseModelIntf.BCd()));
        if (questionResponseModelIntf.getId() != null) {
            AbstractC37300Gc1.A12(questionResponseModelIntf.getId(), A1I);
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (questionResponseModelIntf.BRR() != null) {
            QuestionMediaResponseModelIntf BRR = questionResponseModelIntf.BRR();
            if (BRR != null) {
                treeUpdaterJNI = BRR.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("media_response", treeUpdaterJNI);
        }
        if (questionResponseModelIntf.BVk() != null) {
            MusicQuestionResponseModelIntf BVk = questionResponseModelIntf.BVk();
            if (BVk != null) {
                treeUpdaterJNI2 = BVk.F7o();
            }
            A1I.put("music_response", treeUpdaterJNI2);
        }
        if (questionResponseModelIntf.Bog() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, questionResponseModelIntf.Bog());
        }
        if (questionResponseModelIntf.Bol() != null) {
            QuestionResponseType Bol = questionResponseModelIntf.Bol();
            C14360o3.A0B(Bol, 0);
            A1I.put("response_type", Bol.A00);
        }
        if (questionResponseModelIntf.Bs7() != null) {
            A1I.put("seen", questionResponseModelIntf.Bs7());
        }
        if (questionResponseModelIntf.Bv1() != null) {
            A1I.put("should_enable_reply_creation", questionResponseModelIntf.Bv1());
        }
        questionResponseModelIntf.CBC();
        A1I.put("ts", Integer.valueOf(questionResponseModelIntf.CBC()));
        if (questionResponseModelIntf.CDj() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, questionResponseModelIntf.CDj().A07());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
