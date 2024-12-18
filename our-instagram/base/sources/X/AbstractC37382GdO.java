package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.EffectActionSheetIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37382GdO {
    public static Map A00(EffectPreviewIntf effectPreviewIntf) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (effectPreviewIntf.AdP() != null) {
            A1I.put("attribution_user", effectPreviewIntf.AdP().F7o());
        }
        if (effectPreviewIntf.AxJ() != null) {
            A1I.put(AbstractC43591JPw.A00(19), effectPreviewIntf.AxJ());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (effectPreviewIntf.B0O() != null) {
            EffectActionSheetIntf B0O = effectPreviewIntf.B0O();
            if (B0O != null) {
                treeUpdaterJNI = B0O.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("effect_action_sheet", treeUpdaterJNI);
        }
        if (effectPreviewIntf.getEffectId() != null) {
            A1I.put("effect_id", effectPreviewIntf.getEffectId());
        }
        if (effectPreviewIntf.getFailureCode() != null) {
            A1I.put("failure_code", effectPreviewIntf.getFailureCode());
        }
        if (effectPreviewIntf.getFailureReason() != null) {
            A1I.put(TraceFieldType.FailureReason, effectPreviewIntf.getFailureReason());
        }
        if (effectPreviewIntf.getFormattedClipsMediaCount() != null) {
            A1I.put("formatted_clips_media_count", effectPreviewIntf.getFormattedClipsMediaCount());
        }
        if (effectPreviewIntf.BEx() != null) {
            ImageUrl BEx = effectPreviewIntf.BEx();
            if (BEx != null) {
                str = BEx.getUrl();
            } else {
                str = null;
            }
            A1I.put("icon_url", str);
        }
        if (effectPreviewIntf.getId() != null) {
            AbstractC37300Gc1.A12(effectPreviewIntf.getId(), A1I);
        }
        if (effectPreviewIntf.CPi() != null) {
            A1I.put("is_age_restricted", effectPreviewIntf.CPi());
        }
        if (effectPreviewIntf.getName() != null) {
            AbstractC37300Gc1.A14(effectPreviewIntf.getName(), A1I);
        }
        if (effectPreviewIntf.getSaveStatus() != null) {
            A1I.put("save_status", effectPreviewIntf.getSaveStatus());
        }
        if (effectPreviewIntf.C84() != null) {
            EffectThumbnailImageDictIntf C84 = effectPreviewIntf.C84();
            if (C84 != null) {
                treeUpdaterJNI2 = C84.F7o();
            }
            A1I.put("thumbnail_image", treeUpdaterJNI2);
        }
        if (effectPreviewIntf.getTitle() != null) {
            AbstractC37300Gc1.A17(effectPreviewIntf.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
