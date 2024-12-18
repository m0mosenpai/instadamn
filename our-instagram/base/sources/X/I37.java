package X;

import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.api.schemas.StoryAdKeywordTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I37 {
    public static Map A00(JMQ jmq) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmq.B1u() != null) {
            A1I.put("end_index", jmq.B1u());
        }
        if (jmq.BKp() != null) {
            A1I.put("keyword_background_color", jmq.BKp());
        }
        if (jmq.BKq() != null) {
            A1I.put("keyword_color", jmq.BKq());
        }
        String str2 = null;
        if (jmq.BKt() != null) {
            StoryAdKeywordStyleEnum BKt = jmq.BKt();
            if (BKt != null) {
                str = BKt.A00;
            } else {
                str = null;
            }
            A1I.put("keyword_style", str);
        }
        if (jmq.BKu() != null) {
            StoryAdKeywordTypeEnum BKu = jmq.BKu();
            if (BKu != null) {
                str2 = BKu.A00;
            }
            A1I.put("keyword_type", str2);
        }
        if (jmq.Bzd() != null) {
            A1I.put("start_index", jmq.Bzd());
        }
        if (jmq.C99() != null) {
            A1I.put("token", jmq.C99());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
