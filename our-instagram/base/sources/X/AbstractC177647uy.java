package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;

/* renamed from: X.7uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC177647uy {
    public static int A00(CameraManager cameraManager, CaptureRequest.Builder builder, C176787ta c176787ta, AbstractC176767tY abstractC176767tY, String str, int i) {
        CaptureRequest.Key key;
        if (c176787ta != null && abstractC176767tY != null) {
            int i2 = 0;
            if (i != 0) {
                Object A02 = c176787ta.A02(AbstractC176797tb.A0z);
                A02.getClass();
                int intValue = ((Number) A02).intValue();
                if (intValue == -1) {
                    return intValue;
                }
                if (intValue == 1 && ((Boolean) abstractC176767tY.A01(AbstractC176767tY.A0E)).booleanValue()) {
                    i2 = 1;
                }
                key = CaptureRequest.CONTROL_AWB_MODE;
            } else {
                Object A022 = c176787ta.A02(AbstractC176797tb.A0D);
                A022.getClass();
                int intValue2 = ((Number) A022).intValue();
                if (intValue2 == 4) {
                    if (((Boolean) abstractC176767tY.A01(AbstractC176767tY.A0C)).booleanValue()) {
                        i2 = 4;
                    }
                } else if (intValue2 == 3) {
                    if (((Boolean) abstractC176767tY.A01(AbstractC176767tY.A0D)).booleanValue()) {
                        i2 = 3;
                    }
                } else if (intValue2 == 1) {
                    if (((Boolean) abstractC176767tY.A01(AbstractC176767tY.A0B)).booleanValue()) {
                        i2 = 1;
                    }
                } else if (intValue2 == 0 && ((Boolean) abstractC176767tY.A01(AbstractC176767tY.A0N)).booleanValue()) {
                    Object A023 = c176787ta.A02(AbstractC176797tb.A0d);
                    A023.getClass();
                    Number number = (Number) A023;
                    float floatValue = number.floatValue();
                    CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
                    if (str != null) {
                        Object obj = AbstractC176717tT.A00(cameraManager, str).get(key2);
                        obj.getClass();
                        if (floatValue >= ((Number) obj).floatValue()) {
                            builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, number);
                        }
                    } else {
                        throw new RuntimeException("Camera ID must be provided to check supported modes.");
                    }
                }
                key = CaptureRequest.CONTROL_AF_MODE;
            }
            builder.set(key, Integer.valueOf(i2));
            return i2;
        }
        throw new IllegalStateException("Trying to update builder after camera closed.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x02ca, code lost:
    
        if (((java.lang.Number) r0).intValue() != 3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        if (r2 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01bb, code lost:
    
        if (((java.lang.Number) r0).intValue() != 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f4, code lost:
    
        if (r0 != false) goto L82;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.hardware.camera2.CaptureRequest.Builder r8, X.C176787ta r9, X.AbstractC176767tY r10, int r11) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC177647uy.A01(android.hardware.camera2.CaptureRequest$Builder, X.7ta, X.7tY, int):void");
    }
}
