package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.9Ps, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209829Ps {
    public static final HashMap A00(String str) {
        String str2;
        String str3;
        C14360o3.A0B(str, 0);
        HashMap A1G = AbstractC166987dD.A1G();
        try {
            C60782q2 c60782q2 = new C60782q2(str);
            for (Integer num : C05F.A00(21)) {
                if (num == C05F.A01) {
                    int A0M = c60782q2.A0M("SceneCaptureType", -1);
                    if (A0M != 0) {
                        if (A0M != 1) {
                            if (A0M != 2) {
                                if (A0M != 3) {
                                    str3 = "";
                                } else {
                                    str3 = "night";
                                }
                            } else {
                                str3 = "portrait";
                            }
                        } else {
                            str3 = "landscape";
                        }
                    } else {
                        str3 = "standard";
                    }
                    A1G.put("scene_capture_type", str3);
                } else {
                    switch (num.intValue()) {
                        case 1:
                            str2 = "SceneCaptureType";
                            break;
                        case 2:
                            str2 = AbstractC111324zv.A00(3559);
                            break;
                        case 3:
                            str2 = AbstractC111324zv.A00(3558);
                            break;
                        case 4:
                            str2 = AbstractC111324zv.A00(1800);
                            break;
                        case 5:
                            str2 = "MakerNote";
                            break;
                        case 6:
                            str2 = "Make";
                            break;
                        case 7:
                            str2 = "Model";
                            break;
                        case 8:
                            str2 = "Xmp";
                            break;
                        case 9:
                            str2 = "ImageDescription";
                            break;
                        case 10:
                            str2 = "ImageUniqueID";
                            break;
                        case 11:
                            str2 = "ExposureTime";
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            str2 = "ApertureValue";
                            break;
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            str2 = "ShutterSpeedValue";
                            break;
                        case 14:
                            str2 = "FocalLength";
                            break;
                        case Process.SIGTERM /* 15 */:
                            str2 = "Flash";
                            break;
                        case 16:
                            str2 = "LensModel";
                            break;
                        case 17:
                            str2 = "MeteringMode";
                            break;
                        case 18:
                            str2 = "FocalPlaneXResolution";
                            break;
                        case Process.SIGSTOP /* 19 */:
                            str2 = "FocalPlaneYResolution";
                            break;
                        case 20:
                            str2 = "FocalPlaneResolutionUnit";
                            break;
                        default:
                            str2 = "SceneType";
                            break;
                    }
                    String A0N = c60782q2.A0N(str2);
                    if (A0N != null) {
                        A1G.put(AbstractC210029Qp.A00(num), A0N);
                    }
                }
            }
        } catch (IOException | NullPointerException e) {
            C0K8.A0G("LoadExif", "Failed to read exif for shared photo", e);
        }
        return A1G;
    }
}
