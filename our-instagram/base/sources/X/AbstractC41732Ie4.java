package X;

import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.EffectActionSheet;
import com.instagram.feed.media.EffectActionSheetIntf;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;

/* renamed from: X.Ie4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41732Ie4 {
    public static final ImageUrl A00(EffectPreviewIntf effectPreviewIntf) {
        EffectThumbnailImageDictIntf C84 = effectPreviewIntf.C84();
        if (C84 != null) {
            return C84.CDO();
        }
        return null;
    }

    public static final EffectPreview A01(EffectPreviewIntf effectPreviewIntf, boolean z) {
        String str;
        EffectActionSheet effectActionSheet;
        AttributionUser AdP = effectPreviewIntf.AdP();
        String AxJ = effectPreviewIntf.AxJ();
        EffectActionSheetIntf B0O = effectPreviewIntf.B0O();
        String effectId = effectPreviewIntf.getEffectId();
        String failureCode = effectPreviewIntf.getFailureCode();
        String failureReason = effectPreviewIntf.getFailureReason();
        String formattedClipsMediaCount = effectPreviewIntf.getFormattedClipsMediaCount();
        ImageUrl BEx = effectPreviewIntf.BEx();
        String id = effectPreviewIntf.getId();
        Boolean CPi = effectPreviewIntf.CPi();
        String name = effectPreviewIntf.getName();
        effectPreviewIntf.getSaveStatus();
        EffectThumbnailImageDictIntf C84 = effectPreviewIntf.C84();
        String title = effectPreviewIntf.getTitle();
        if (z) {
            str = "SAVED";
        } else {
            str = "NOT_SAVED";
        }
        AttributionUserImpl Eqz = AdP.Eqz();
        EffectThumbnailImageDict effectThumbnailImageDict = null;
        if (B0O != null) {
            effectActionSheet = B0O.F4Z();
        } else {
            effectActionSheet = null;
        }
        if (C84 != null) {
            effectThumbnailImageDict = C84.F5t();
        }
        return new EffectPreview(Eqz, BEx, effectActionSheet, effectThumbnailImageDict, CPi, AxJ, effectId, failureCode, failureReason, formattedClipsMediaCount, id, name, str, title);
    }

    public static final String A02(EffectPreviewIntf effectPreviewIntf) {
        String instagramUserId = effectPreviewIntf.AdP().getInstagramUserId();
        if (instagramUserId == null) {
            return "";
        }
        return instagramUserId;
    }

    public static final String A03(EffectPreviewIntf effectPreviewIntf) {
        String username = effectPreviewIntf.AdP().getUsername();
        if (username == null) {
            return "";
        }
        return username;
    }

    public static final boolean A04(EffectPreviewIntf effectPreviewIntf) {
        return AbstractC167007dF.A1W(effectPreviewIntf.getFailureReason());
    }
}
