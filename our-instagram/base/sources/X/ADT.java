package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes4.dex */
public abstract class ADT {
    public static final StoryTemplateFillableGalleryStickerShapes A00(C8OK c8ok) {
        switch (c8ok.ordinal()) {
            case 0:
                return StoryTemplateFillableGalleryStickerShapes.A09;
            case 1:
                return StoryTemplateFillableGalleryStickerShapes.A05;
            case 2:
                return StoryTemplateFillableGalleryStickerShapes.A0C;
            case 3:
            case 4:
            case 10:
                return StoryTemplateFillableGalleryStickerShapes.A07;
            case 5:
            case 6:
            case 11:
                return StoryTemplateFillableGalleryStickerShapes.A0E;
            case 7:
            case 8:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
                return StoryTemplateFillableGalleryStickerShapes.A0F;
            default:
                throw AbstractC166987dD.A1D(AbstractC167017dG.A0n(c8ok, "No fillable shape defined for style: ", AbstractC166987dD.A1C()));
        }
    }

    public static final C8OK A01(StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes) {
        switch (storyTemplateFillableGalleryStickerShapes.ordinal()) {
            case 2:
                return C8OK.A04;
            case 3:
            case 5:
            case 7:
            case 10:
            default:
                throw AbstractC166987dD.A1D(AbstractC167017dG.A0n(storyTemplateFillableGalleryStickerShapes, "No gallery style type defined for shape: ", AbstractC166987dD.A1C()));
            case 4:
                return C8OK.A07;
            case 6:
            case 8:
                return C8OK.A0A;
            case 9:
                return C8OK.A0C;
            case 11:
                return C8OK.A0F;
        }
    }
}
