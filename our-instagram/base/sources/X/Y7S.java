package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import com.facebook.tigon.tigonhuc.HucClient;

/* loaded from: classes12.dex */
public abstract class Y7S {
    public static final String A00 = new C176877tj(0, 0).toString();

    public static C176877tj A06(Size[] sizeArr) {
        int length;
        if (sizeArr != null && (length = sizeArr.length) != 0) {
            Size size = sizeArr[0];
            for (int i = 1; i < length; i++) {
                Size size2 = sizeArr[i];
                if (size2.getWidth() * size2.getHeight() > size.getWidth() * size.getHeight()) {
                    size = size2;
                }
            }
            return new C176877tj(size.getWidth(), size.getHeight());
        }
        return new C176877tj(0, 0);
    }

    public static long A01(Context context, SharedPreferences sharedPreferences, C72719Xlr c72719Xlr) {
        String str = c72719Xlr.A01;
        if (!sharedPreferences.contains(str)) {
            A07(context, sharedPreferences);
        }
        return sharedPreferences.getLong(str, -2L);
    }

    public static C72864XpT A03(Context context, SharedPreferences sharedPreferences, C72719Xlr c72719Xlr) {
        int i;
        int indexOf;
        int i2;
        String str = c72719Xlr.A01;
        String string = sharedPreferences.getString(str, "com.facebook.devicesegmentation.NOT_STORED");
        string.getClass();
        if (!string.equals("com.facebook.devicesegmentation.NOT_STORED") && (indexOf = string.indexOf(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS)) > 0 && string.length() > (i2 = indexOf + 1)) {
            return new C72864XpT(Float.parseFloat(string.substring(0, indexOf)), Float.parseFloat(string.substring(i2)));
        }
        A07(context, sharedPreferences);
        String string2 = sharedPreferences.getString(str, "com.facebook.devicesegmentation.NOT_STORED");
        string2.getClass();
        try {
            int indexOf2 = string2.indexOf(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
            if (indexOf2 > 0 && string2.length() > (i = indexOf2 + 1)) {
                return new C72864XpT(Float.parseFloat(string2.substring(0, indexOf2)), Float.parseFloat(string2.substring(i)));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static C176877tj A04(Context context, SharedPreferences sharedPreferences, C72719Xlr c72719Xlr) {
        String str = c72719Xlr.A01;
        String string = sharedPreferences.getString(str, "com.facebook.devicesegmentation.NOT_STORED");
        string.getClass();
        if (!string.equals("com.facebook.devicesegmentation.NOT_STORED")) {
            try {
                return C176877tj.A00(string);
            } catch (NumberFormatException unused) {
            }
        }
        A07(context, sharedPreferences);
        try {
            return C176877tj.A00(sharedPreferences.getString(str, "com.facebook.devicesegmentation.NOT_STORED"));
        } catch (NumberFormatException unused2) {
            return null;
        }
    }

    public static void A07(Context context, SharedPreferences sharedPreferences) {
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        CameraManager cameraManager = (CameraManager) systemService;
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            int length = cameraIdList.length;
            CameraCharacteristics cameraCharacteristics = null;
            CameraCharacteristics cameraCharacteristics2 = null;
            int i = 0;
            while (true) {
                if (i < length) {
                    CameraCharacteristics cameraCharacteristics3 = cameraManager.getCameraCharacteristics(cameraIdList[i]);
                    Object obj = cameraCharacteristics3.get(CameraCharacteristics.LENS_FACING);
                    obj.getClass();
                    if (AbstractC166987dD.A0H(obj) == 0) {
                        if (cameraCharacteristics2 == null) {
                            cameraCharacteristics2 = cameraCharacteristics3;
                        }
                        if (cameraCharacteristics != null) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        if (cameraCharacteristics == null) {
                            cameraCharacteristics = cameraCharacteristics3;
                        }
                        if (cameraCharacteristics2 != null) {
                            break;
                        } else {
                            i++;
                        }
                    }
                } else if (cameraCharacteristics2 != null) {
                }
            }
            A08(context, sharedPreferences, cameraCharacteristics2, false);
            if (cameraCharacteristics != null) {
                A08(context, sharedPreferences, cameraCharacteristics, true);
            }
        } catch (CameraAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void A0C(SharedPreferences.Editor editor, String str, boolean[] zArr, int i) {
        editor.putBoolean(str, zArr[i]);
    }

    public static float A00(Range[] rangeArr) {
        int intValue;
        rangeArr.getClass();
        int length = rangeArr.length;
        if (length == 0) {
            return 0.0f;
        }
        Number number = (Number) rangeArr[0].getUpper();
        Number number2 = (Number) rangeArr[0].getLower();
        for (int i = 1; i < length; i++) {
            Number number3 = (Number) rangeArr[i].getUpper();
            if (number3.intValue() > number.intValue()) {
                number = number3;
            }
            Number number4 = (Number) rangeArr[i].getLower();
            if (number4.intValue() < number2.intValue()) {
                number2 = number4;
            }
        }
        if (number2.intValue() >= 1000 && (intValue = number.intValue()) >= 1000) {
            return intValue / 1000.0f;
        }
        return number.intValue();
    }

    public static long A02(StreamConfigurationMap streamConfigurationMap) {
        Size[] highSpeedVideoSizes = streamConfigurationMap.getHighSpeedVideoSizes();
        highSpeedVideoSizes.getClass();
        long j = 0;
        for (Size size : highSpeedVideoSizes) {
            Range<Integer>[] highSpeedVideoFpsRangesFor = streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size);
            highSpeedVideoFpsRangesFor.getClass();
            long width = r3.getWidth() * r3.getHeight() * A00(highSpeedVideoFpsRangesFor);
            if (width > j) {
                j = width;
            }
        }
        return j;
    }

    public static C176877tj A05(StreamConfigurationMap streamConfigurationMap, int i) {
        Size[] highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i);
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
        if (highResolutionOutputSizes != null) {
            if (outputSizes != null) {
                int length = highResolutionOutputSizes.length;
                int length2 = outputSizes.length;
                Size[] sizeArr = new Size[length + length2];
                System.arraycopy(highResolutionOutputSizes, 0, sizeArr, 0, length);
                System.arraycopy(outputSizes, 0, sizeArr, length, length2);
                highResolutionOutputSizes = sizeArr;
            }
        } else {
            highResolutionOutputSizes = null;
            if (outputSizes != null) {
                highResolutionOutputSizes = outputSizes;
            }
        }
        return A06(highResolutionOutputSizes);
    }

    public static void A09(SharedPreferences.Editor editor, CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics, String str, int i) {
        editor.putBoolean(str, A0D(key, cameraCharacteristics, i));
    }

    public static void A0A(SharedPreferences.Editor editor, StreamConfigurationMap streamConfigurationMap, Class cls, String str) {
        editor.putString(str, A06(streamConfigurationMap.getOutputSizes(cls)).toString());
    }

    public static void A0B(SharedPreferences.Editor editor, StreamConfigurationMap streamConfigurationMap, String str, int i) {
        editor.putString(str, A05(streamConfigurationMap, i).toString());
    }

    public static boolean A0D(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics, int i) {
        int[] iArr = (int[]) cameraCharacteristics.get(key);
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0060, code lost:
    
        if (A0D(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION, r47, 1) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0074, code lost:
    
        if (r0.intValue() != 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A08(android.content.Context r45, android.content.SharedPreferences r46, android.hardware.camera2.CameraCharacteristics r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 1712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y7S.A08(android.content.Context, android.content.SharedPreferences, android.hardware.camera2.CameraCharacteristics, boolean):void");
    }
}
