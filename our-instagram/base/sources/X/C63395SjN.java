package X;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import com.facebook.react.bridge.ReadableArray;
import java.util.Map;

/* renamed from: X.SjN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63395SjN {
    public static final ColorMatrix A02(float f) {
        float f2 = 1.0f - f;
        float f3 = 0.7152f - (f2 * 0.7152f);
        float f4 = 0.0722f - (f2 * 0.0722f);
        float f5 = 0.2126f - (f2 * 0.2126f);
        return A06(new float[]{(0.7874f * f2) + 0.2126f, f3, f4, 0.0f, 0.0f, f5, (0.2848f * f2) + 0.7152f, f4, 0.0f, 0.0f, f5, f3, (f2 * 0.9278f) + 0.0722f, 0.0f, 0.0f});
    }

    public static final ColorMatrix A03(float f) {
        double radians = Math.toRadians(f);
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);
        float f2 = 0.715f - (cos * 0.715f);
        float f3 = sin * 0.715f;
        float f4 = 0.072f - (cos * 0.072f);
        float f5 = 0.213f - (cos * 0.213f);
        return A06(new float[]{((cos * 0.787f) + 0.213f) - (sin * 0.213f), f2 - f3, (sin * 0.928f) + f4, 0.0f, 0.0f, (0.143f * sin) + f5, (0.285f * cos) + 0.715f + (0.14f * sin), f4 - (0.283f * sin), 0.0f, 0.0f, f5 - (0.787f * sin), f2 + f3, (cos * 0.928f) + 0.072f + (sin * 0.072f), 0.0f, 0.0f});
    }

    public static final ColorMatrix A04(float f) {
        float f2 = 1.0f - (2.0f * f);
        float[] fArr = new float[20];
        fArr[0] = f2;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        A09(fArr, f * 255.0f, f2);
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        return new ColorMatrix(fArr);
    }

    public static final ColorMatrix A05(float f) {
        float f2 = 1.0f - f;
        return A06(new float[]{(0.607f * f2) + 0.393f, 0.769f - (f2 * 0.769f), 0.189f - (f2 * 0.189f), 0.0f, 0.0f, 0.349f - (f2 * 0.349f), (0.314f * f2) + 0.686f, 0.168f - (f2 * 0.168f), 0.0f, 0.0f, 0.272f - (f2 * 0.272f), 0.534f - (f2 * 0.534f), (f2 * 0.869f) + 0.131f, 0.0f, 0.0f});
    }

    public static ColorMatrix A06(float[] fArr) {
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        return new ColorMatrix(fArr);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.RenderEffect A08(com.facebook.react.bridge.ReadableArray r10) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63395SjN.A08(com.facebook.react.bridge.ReadableArray):android.graphics.RenderEffect");
    }

    public static void A09(float[] fArr, float f, float f2) {
        fArr[4] = f;
        fArr[5] = 0.0f;
        fArr[6] = f2;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = f2;
        fArr[13] = 0.0f;
        fArr[14] = f;
    }

    public static final boolean A0A(ReadableArray readableArray) {
        if (readableArray.size() == 0) {
            return false;
        }
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            Object key = AbstractC166987dD.A1K(readableArray.getMap(i).getEntryIterator()).getKey();
            if (C14360o3.A0K(key, "blur") || C14360o3.A0K(key, "dropShadow")) {
                return false;
            }
        }
        return true;
    }

    public static float A01(Map.Entry entry) {
        String A00 = AbstractC111324zv.A00(487);
        Object value = entry.getValue();
        C14360o3.A0C(value, A00);
        return (float) ((Number) value).doubleValue();
    }

    public static final ColorMatrixColorFilter A07(ReadableArray readableArray) {
        ColorMatrix colorMatrix;
        ColorMatrix colorMatrix2 = new ColorMatrix();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            Map.Entry A1K = AbstractC166987dD.A1K(readableArray.getMap(i).getEntryIterator());
            String A17 = AbstractC31172DnG.A17(A1K);
            Object value = A1K.getValue();
            C14360o3.A0C(value, AbstractC111324zv.A00(487));
            float A00 = (float) MSW.A00(value);
            switch (A17.hashCode()) {
                case -2114203985:
                    if (!A17.equals("saturate")) {
                        throw AbstractC167007dF.A0c("Invalid color matrix filter: ", A17);
                    }
                    colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(A00);
                    break;
                case -1267206133:
                    if (!A17.equals("opacity")) {
                        throw AbstractC167007dF.A0c("Invalid color matrix filter: ", A17);
                    }
                    colorMatrix = new ColorMatrix();
                    colorMatrix.setScale(1.0f, 1.0f, 1.0f, A00);
                    break;
                case -1183703082:
                    if (!A17.equals("invert")) {
                        throw AbstractC167007dF.A0c("Invalid color matrix filter: ", A17);
                    }
                    colorMatrix = A04(A00);
                    break;
                case -905411385:
                    if (!A17.equals("grayscale")) {
                        throw AbstractC167007dF.A0c("Invalid color matrix filter: ", A17);
                    }
                    colorMatrix = A02(A00);
                    break;
                case -566947070:
                    if (!A17.equals("contrast")) {
                        throw AbstractC167007dF.A0c("Invalid color matrix filter: ", A17);
                    }
                    float[] fArr = new float[20];
                    fArr[0] = A00;
                    AbstractC43594JPz.A1U(fArr, 0.0f, 1);
                    A09(fArr, 255.0f * ((-(A00 / 2.0f)) + 0.5f), A00);
                    colorMatrix = A06(fArr);
                    break;
                case 109324790:
                    if (!A17.equals("sepia")) {
                        throw AbstractC167007dF.A0c("Invalid color matrix filter: ", A17);
                    }
                    colorMatrix = A05(A00);
                    break;
                case 648162385:
                    if (!A17.equals("brightness")) {
                        throw AbstractC167007dF.A0c("Invalid color matrix filter: ", A17);
                    }
                    colorMatrix = new ColorMatrix();
                    colorMatrix.setScale(A00, A00, A00, 1.0f);
                    break;
                case 650888307:
                    if (!A17.equals("hueRotate")) {
                        throw AbstractC167007dF.A0c("Invalid color matrix filter: ", A17);
                    }
                    colorMatrix = A03(A00);
                    break;
                default:
                    throw AbstractC167007dF.A0c("Invalid color matrix filter: ", A17);
            }
            colorMatrix2.preConcat(colorMatrix);
        }
        return new ColorMatrixColorFilter(colorMatrix2);
    }

    public static final float A00(float f) {
        return (WF1.A01(f) - 0.5f) / 0.57735f;
    }
}
