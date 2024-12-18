package X;

import com.instagram.api.schemas.MediaVCRTappableDataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC225489xD {
    public static Map A00(MediaVCRTappableDataIntf mediaVCRTappableDataIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        mediaVCRTappableDataIntf.getCanViewerLinkBackToOriginalMediaFromVcr();
        A1I.put(AbstractC111324zv.A00(180), Boolean.valueOf(mediaVCRTappableDataIntf.getCanViewerLinkBackToOriginalMediaFromVcr()));
        if (mediaVCRTappableDataIntf.getEndBackgroundColor() != null) {
            A1I.put("end_background_color", mediaVCRTappableDataIntf.getEndBackgroundColor());
        }
        if (mediaVCRTappableDataIntf.B29() != null) {
            A1I.put("end_time_ms", AbstractC166997dE.A0f(mediaVCRTappableDataIntf.B29()));
        }
        if (mediaVCRTappableDataIntf.BZm() != null) {
            A1I.put(AbstractC111324zv.A00(249), mediaVCRTappableDataIntf.BZm().A07());
        }
        if (mediaVCRTappableDataIntf.getOriginalCommentId() != null) {
            A1I.put(AbstractC111324zv.A00(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION), mediaVCRTappableDataIntf.getOriginalCommentId());
        }
        if (mediaVCRTappableDataIntf.getOriginalCommentText() != null) {
            A1I.put(AbstractC111324zv.A00(251), mediaVCRTappableDataIntf.getOriginalCommentText());
        }
        if (mediaVCRTappableDataIntf.BZs() != null) {
            A1I.put("original_media_code", mediaVCRTappableDataIntf.BZs());
        }
        if (mediaVCRTappableDataIntf.getOriginalMediaId() != null) {
            A1I.put("original_media_id", mediaVCRTappableDataIntf.getOriginalMediaId());
        }
        if (mediaVCRTappableDataIntf.getStartBackgroundColor() != null) {
            A1I.put("start_background_color", mediaVCRTappableDataIntf.getStartBackgroundColor());
        }
        if (mediaVCRTappableDataIntf.Bzq() != null) {
            A1I.put("start_time_ms", AbstractC166997dE.A0f(mediaVCRTappableDataIntf.Bzq()));
        }
        if (mediaVCRTappableDataIntf.getTextColor() != null) {
            A1I.put("text_color", mediaVCRTappableDataIntf.getTextColor());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
