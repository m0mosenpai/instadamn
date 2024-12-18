package X;

import com.instagram.api.schemas.MediaNoticeIcon;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hpq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40064Hpq {
    public static Map A00(JM6 jm6) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jm6.getMediaId() != null) {
            AbstractC37300Gc1.A18(jm6.getMediaId(), A1I);
        }
        if (jm6.BXM() != null) {
            MediaNoticeIcon BXM = jm6.BXM();
            if (BXM != null) {
                str = BXM.A00;
            } else {
                str = null;
            }
            A1I.put("notice_icon", str);
        }
        if (jm6.getNoticeSubText() != null) {
            A1I.put("notice_sub_text", jm6.getNoticeSubText());
        }
        if (jm6.getNoticeText() != null) {
            A1I.put("notice_text", jm6.getNoticeText());
        }
        if (jm6.getNoticeUrl() != null) {
            A1I.put("notice_url", jm6.getNoticeUrl());
        }
        if (jm6.BpN() != null) {
            A1I.put("ridge_match_id", jm6.BpN());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
