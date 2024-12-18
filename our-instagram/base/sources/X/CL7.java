package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes5.dex */
public abstract class CL7 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "Meta2";
            case 2:
                return "Meta3";
            case 3:
                return "Meta4";
            case 4:
                return "Body1";
            case 5:
                return "Body2";
            case 6:
                return "Body2_Emphasized";
            case 7:
                return "Body2Bold";
            case 8:
                return "Body2Small";
            case 9:
                return "Body2SmallEmphasized";
            case 10:
                return "Body3";
            case 11:
                return "Body4";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "Headline2";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "Headline3";
            case 14:
                return "Headline3Emphasized";
            case Process.SIGTERM /* 15 */:
                return "Headline4";
            case 16:
                return "Headline4Emphasized";
            case 17:
                return "TextOnMedia";
            case 18:
                return "TextOnMediaEmphasized";
            case Process.SIGSTOP /* 19 */:
                return "SecondaryHeader";
            case 20:
                return "TextInputText";
            case 21:
                return "Body1_Emphasized";
            case 22:
                return "Button1";
            case 23:
                return "Label";
            case 24:
                return "Body1_Emphasized2";
            case 25:
                return "Headline1Emphasized";
            case 26:
                return "OverlayButton";
            case 27:
                return "SuggestionsOverlayImagine";
            case 28:
                return "SuggestionsOverlayPrompt";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "HeaderActionButton";
            case 30:
                return "SuggestionsSectionHeader";
            case 31:
                return "Title2";
            default:
                return "Meta";
        }
    }
}
