package X;

import com.instagram.reels.question.model.MusicQuestionResponseModelIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I5J {
    public static Map A00(MusicQuestionResponseModelIntf musicQuestionResponseModelIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (musicQuestionResponseModelIntf.BVV() != null) {
            A1I.put("music_asset_info", musicQuestionResponseModelIntf.BVV().F7o());
        }
        if (musicQuestionResponseModelIntf.BVa() != null) {
            A1I.put("music_consumption_info", musicQuestionResponseModelIntf.BVa().F7o());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
