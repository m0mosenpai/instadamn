package X;

import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.VOv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68387VOv {
    public static Map A00(XGI xgi) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xgi.getBackgroundColor() != null) {
            linkedHashMap.put("background_color", xgi.getBackgroundColor());
        }
        if (xgi.CRP() != null) {
            linkedHashMap.put("is_clips_v2_media", xgi.CRP());
        }
        if (xgi.getMediaId() != null) {
            linkedHashMap.put("media_id", xgi.getMediaId());
        }
        if (xgi.getProfilePicUrl() != null) {
            linkedHashMap.put("profile_pic_url", xgi.getProfilePicUrl());
        }
        if (xgi.getQuestion() != null) {
            linkedHashMap.put("question", xgi.getQuestion());
        }
        if (xgi.BjV() != null) {
            linkedHashMap.put("question_id", xgi.BjV());
        }
        if (xgi.Bjb() != null) {
            linkedHashMap.put("question_response_count", xgi.Bjb());
        }
        ArrayList arrayList = null;
        if (xgi.Bjf() != null) {
            QuestionStickerType Bjf = xgi.Bjf();
            if (Bjf != null) {
                str = Bjf.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("question_type", str);
        }
        if (xgi.Bom() != null) {
            List<QuestionResponseType> Bom = xgi.Bom();
            if (Bom != null) {
                arrayList = AbstractC167017dG.A0q(Bom);
                for (QuestionResponseType questionResponseType : Bom) {
                    C14360o3.A0B(questionResponseType, 0);
                    arrayList.add(questionResponseType.A00);
                }
            }
            linkedHashMap.put("response_types", arrayList);
        }
        if (xgi.getTextColor() != null) {
            linkedHashMap.put("text_color", xgi.getTextColor());
        }
        if (xgi.CG1() != null) {
            linkedHashMap.put("viewer_can_interact", xgi.CG1());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
