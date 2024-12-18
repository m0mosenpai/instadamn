package X;

import android.graphics.BlendMode;
import android.os.Build;

/* renamed from: X.VwC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69826VwC {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000d. Please report as an issue. */
    public static final BlendMode A00(String str) {
        if (str == null || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        switch (str.hashCode()) {
            case -2120744511:
                if (str.equals("luminosity")) {
                    return BlendMode.LUMINOSITY;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case -1427739212:
                if (str.equals("hard-light")) {
                    return BlendMode.HARD_LIGHT;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case -1338968417:
                if (str.equals("darken")) {
                    return BlendMode.DARKEN;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case -1247677005:
                if (str.equals("soft-light")) {
                    return BlendMode.SOFT_LIGHT;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case -1091287984:
                if (str.equals("overlay")) {
                    return BlendMode.OVERLAY;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case -1039745817:
                if (str.equals("normal")) {
                    return null;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case -907689876:
                if (str.equals("screen")) {
                    return BlendMode.SCREEN;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case -230491182:
                if (str.equals("saturation")) {
                    return BlendMode.SATURATION;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case -120580883:
                if (str.equals("color-dodge")) {
                    return BlendMode.COLOR_DODGE;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case 103672:
                if (str.equals("hue")) {
                    return BlendMode.HUE;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case 94842723:
                if (str.equals("color")) {
                    return BlendMode.COLOR;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case 170546239:
                if (str.equals("lighten")) {
                    return BlendMode.LIGHTEN;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case 653829668:
                if (str.equals("multiply")) {
                    return BlendMode.MULTIPLY;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case 1242982905:
                if (str.equals("color-burn")) {
                    return BlendMode.COLOR_BURN;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case 1686617550:
                if (str.equals("exclusion")) {
                    return BlendMode.EXCLUSION;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            case 1728361789:
                if (str.equals("difference")) {
                    return BlendMode.DIFFERENCE;
                }
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
            default:
                throw AbstractC167007dF.A0c("Invalid mix-blend-mode name: ", str);
        }
    }
}
