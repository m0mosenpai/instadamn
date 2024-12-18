package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Arrays;

/* renamed from: X.6At, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135446At {
    public static final EnumC135456Au A02 = EnumC135456Au.AUTO;
    public float[] A01 = new float[0];
    public int A00 = 0;

    public static void A00(C135446At c135446At, int i) {
        int i2 = c135446At.A00 + i;
        float[] fArr = c135446At.A01;
        int length = fArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            if (i3 < i2) {
                i3 += i2 - i3;
            }
            c135446At.A01 = Arrays.copyOf(fArr, i3);
        }
    }

    public static boolean A01(float f) {
        if (Float.compare(f, Float.NaN) != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0035. Please report as an issue. */
    public final String toString() {
        String str;
        Object obj;
        String str2;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < this.A00) {
            Integer[] A00 = C05F.A00(32);
            float[] fArr = this.A01;
            String str3 = "  flexBasis: ";
            switch (A00[(int) fArr[i]].intValue()) {
                case 0:
                    str3 = "  flex: ";
                    sb.append(str3);
                    sb.append(fArr[i + 1]);
                    sb.append("\n");
                    i += 2;
                    break;
                case 1:
                    str3 = "  flexGrow: ";
                    sb.append(str3);
                    sb.append(fArr[i + 1]);
                    sb.append("\n");
                    i += 2;
                    break;
                case 2:
                    str3 = "  flexShrink: ";
                    sb.append(str3);
                    sb.append(fArr[i + 1]);
                    sb.append("\n");
                    i += 2;
                    break;
                case 3:
                    sb.append(str3);
                    sb.append(fArr[i + 1]);
                    sb.append("\n");
                    i += 2;
                    break;
                case 4:
                    sb.append("  flexBasis: ");
                    sb.append(fArr[i + 1]);
                    sb.append("%\n");
                    i += 2;
                    break;
                case 6:
                    sb.append("  width: ");
                    sb.append(fArr[i + 1]);
                    sb.append("\n");
                    i += 2;
                    break;
                case 7:
                    sb.append("  width: ");
                    sb.append(fArr[i + 1]);
                    sb.append("%\n");
                    i += 2;
                    break;
                case 9:
                    sb.append("  minWidth: ");
                    sb.append(fArr[i + 1]);
                    sb.append("\n");
                    i += 2;
                    break;
                case 10:
                    sb.append("  minWidth: ");
                    sb.append(fArr[i + 1]);
                    sb.append("%\n");
                    i += 2;
                    break;
                case 11:
                    sb.append("  maxWidth: ");
                    sb.append(fArr[i + 1]);
                    sb.append("\n");
                    i += 2;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    sb.append("  maxWidth: ");
                    sb.append(fArr[i + 1]);
                    sb.append("%\n");
                    i += 2;
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    sb.append("  height: ");
                    sb.append(fArr[i + 1]);
                    sb.append("\n");
                    i += 2;
                    break;
                case 14:
                    sb.append("  height: ");
                    sb.append(fArr[i + 1]);
                    sb.append("%\n");
                    i += 2;
                    break;
                case 16:
                    sb.append("  minHeight: ");
                    sb.append(fArr[i + 1]);
                    sb.append("\n");
                    i += 2;
                    break;
                case 17:
                    sb.append("  minHeight: ");
                    sb.append(fArr[i + 1]);
                    sb.append("%\n");
                    i += 2;
                    break;
                case 18:
                    sb.append("  maxHeight: ");
                    sb.append(fArr[i + 1]);
                    sb.append("\n");
                    i += 2;
                    break;
                case Process.SIGSTOP /* 19 */:
                    sb.append("  maxHeight: ");
                    sb.append(fArr[i + 1]);
                    sb.append("%\n");
                    i += 2;
                    break;
                case 20:
                    obj = EnumC135456Au.values()[(int) this.A01[i + 1]];
                    str2 = "  alignSelf: ";
                    sb.append(str2);
                    sb.append(obj);
                    sb.append("\n");
                    i += 2;
                    break;
                case 21:
                    obj = EnumC39529Hcw.values()[(int) this.A01[i + 1]];
                    str2 = "  positionType: ";
                    sb.append(str2);
                    sb.append(obj);
                    sb.append("\n");
                    i += 2;
                    break;
                case 22:
                    str3 = "  aspectRatio: ";
                    sb.append(str3);
                    sb.append(fArr[i + 1]);
                    sb.append("\n");
                    i += 2;
                    break;
                case 23:
                    obj = EnumC72352Xbo.values()[(int) this.A01[i + 1]];
                    str2 = "  display: ";
                    sb.append(str2);
                    sb.append(obj);
                    sb.append("\n");
                    i += 2;
                    break;
                case 24:
                    Integer A01 = C6BG.A01((int) fArr[i + 1]);
                    float f = fArr[i + 2];
                    sb.append("  margin");
                    sb.append(C6BG.A02(A01));
                    sb.append(": ");
                    sb.append(f);
                    sb.append("\n");
                    i += 3;
                    break;
                case 25:
                    Integer A012 = C6BG.A01((int) fArr[i + 1]);
                    float f2 = fArr[i + 2];
                    sb.append("  margin");
                    sb.append(C6BG.A02(A012));
                    sb.append(": ");
                    sb.append(f2);
                    sb.append("%\n");
                    i += 3;
                    break;
                case 26:
                    Integer A013 = C6BG.A01((int) fArr[i + 1]);
                    sb.append("  margin");
                    sb.append(C6BG.A02(A013));
                    sb.append(": ");
                    sb.append("auto\n");
                    i += 2;
                    break;
                case 27:
                    Integer A014 = C6BG.A01((int) fArr[i + 1]);
                    float f3 = fArr[i + 2];
                    sb.append("  position");
                    sb.append(C6BG.A02(A014));
                    sb.append(": ");
                    sb.append(f3);
                    sb.append("\n");
                    i += 3;
                    break;
                case 28:
                    Integer A015 = C6BG.A01((int) fArr[i + 1]);
                    float f4 = fArr[i + 2];
                    sb.append("  position");
                    sb.append(C6BG.A02(A015));
                    sb.append(": ");
                    sb.append(f4);
                    sb.append("%\n");
                    i += 3;
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    str = "  hasMeasureFunction: true\n";
                    sb.append(str);
                    i++;
                    break;
                case 30:
                    str = "  hasBaselineFunction: true\n";
                    sb.append(str);
                    i++;
                    break;
                case 31:
                    str = "  enableTextRounding: true\n";
                    sb.append(str);
                    i++;
                    break;
            }
        }
        if (sb.length() > 0) {
            return AnonymousClass001.A0g("{\n", sb.toString(), "}");
        }
        return "";
    }
}
