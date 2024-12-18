package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.LyricsIntf;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf;
import com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xX, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class C9xX {
    public static Map A00(StoryTemplateMusicStickerDictIntf storyTemplateMusicStickerDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyTemplateMusicStickerDictIntf.AdC() != null) {
            A1I.put("attribution", storyTemplateMusicStickerDictIntf.AdC());
        }
        if (storyTemplateMusicStickerDictIntf.getAudioAssetId() != null) {
            A1I.put("audio_asset_id", storyTemplateMusicStickerDictIntf.getAudioAssetId());
        }
        storyTemplateMusicStickerDictIntf.getAudioAssetStartTimeInMs();
        A1I.put(AbstractC111324zv.A00(740), Integer.valueOf(storyTemplateMusicStickerDictIntf.getAudioAssetStartTimeInMs()));
        if (storyTemplateMusicStickerDictIntf.getAudioClusterId() != null) {
            A1I.put("audio_cluster_id", storyTemplateMusicStickerDictIntf.getAudioClusterId());
        }
        if (storyTemplateMusicStickerDictIntf.getColor() != null) {
            A1I.put("color", storyTemplateMusicStickerDictIntf.getColor());
        }
        storyTemplateMusicStickerDictIntf.Awo();
        A1I.put(AbstractC111324zv.A00(107), Integer.valueOf(storyTemplateMusicStickerDictIntf.Awo()));
        if (storyTemplateMusicStickerDictIntf.Ayd() != null) {
            A1I.put("display_type", storyTemplateMusicStickerDictIntf.Ayd());
        }
        storyTemplateMusicStickerDictIntf.BDQ();
        A1I.put(IgReactMediaPickerNativeModule.HEIGHT, AbstractC166997dE.A0e(storyTemplateMusicStickerDictIntf.BDQ()));
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (storyTemplateMusicStickerDictIntf.BPT() != null) {
            LyricsIntf BPT = storyTemplateMusicStickerDictIntf.BPT();
            if (BPT != null) {
                treeUpdaterJNI = BPT.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("lyrics", treeUpdaterJNI);
        }
        if (storyTemplateMusicStickerDictIntf.BVU() != null) {
            StoryTemplateMusicAssetInfoDictIntf BVU = storyTemplateMusicStickerDictIntf.BVU();
            if (BVU != null) {
                treeUpdaterJNI2 = BVU.F7o();
            }
            A1I.put(AbstractC111324zv.A00(4942), treeUpdaterJNI2);
        }
        storyTemplateMusicStickerDictIntf.getOverlapDurationInMs();
        A1I.put(AbstractC111324zv.A00(2848), Integer.valueOf(storyTemplateMusicStickerDictIntf.getOverlapDurationInMs()));
        storyTemplateMusicStickerDictIntf.BpY();
        A1I.put("rotation", AbstractC166997dE.A0e(storyTemplateMusicStickerDictIntf.BpY()));
        storyTemplateMusicStickerDictIntf.CHe();
        A1I.put(IgReactMediaPickerNativeModule.WIDTH, AbstractC166997dE.A0e(storyTemplateMusicStickerDictIntf.CHe()));
        storyTemplateMusicStickerDictIntf.CI0();
        A1I.put("x", AbstractC166997dE.A0e(storyTemplateMusicStickerDictIntf.CI0()));
        storyTemplateMusicStickerDictIntf.CIZ();
        A1I.put("y", AbstractC166997dE.A0e(storyTemplateMusicStickerDictIntf.CIZ()));
        storyTemplateMusicStickerDictIntf.getZIndex();
        return AbstractC167017dG.A0v(A1I, storyTemplateMusicStickerDictIntf.getZIndex());
    }
}
