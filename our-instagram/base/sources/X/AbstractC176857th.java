package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7th, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC176857th {
    public static final int[] A00 = new int[0];
    public static final Range A01;
    public static final boolean A02;

    static {
        Float valueOf = Float.valueOf(0.0f);
        A01 = Range.create(valueOf, valueOf);
        A02 = Build.VERSION.SDK_INT >= 30;
    }

    public static int A00(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return 12;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return 13;
            case 14:
                return 14;
            case Process.SIGTERM /* 15 */:
                return 15;
            case 16:
                return 16;
            case 17:
                return 18;
            case 18:
                return 17;
            default:
                return -1;
        }
    }

    public static ArrayList A02(float f) {
        if (f > 0.0f) {
            double d = f;
            int log = (int) ((Math.log(1.0E-11d + d) * 20.0d) / Math.log(2.0d));
            double d2 = 1.0d;
            double pow = Math.pow(d, 1.0d / log);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Float.valueOf(100.0f));
            for (int i = 0; i < log - 1; i++) {
                d2 *= pow;
                arrayList.add(Float.valueOf((float) (100.0d * d2)));
            }
            arrayList.add(Float.valueOf(f * 100.0f));
            return arrayList;
        }
        return null;
    }

    public static Range A01(CameraCharacteristics cameraCharacteristics) {
        Float valueOf;
        Float valueOf2;
        if (!A02) {
            List A05 = A05(cameraCharacteristics);
            valueOf = (Float) A05.get(0);
            valueOf2 = (Float) A05.get(A05.size() - 1);
        } else {
            Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            if (range != null) {
                Number number = (Number) range.getLower();
                Number number2 = (Number) range.getUpper();
                if (number != null && number2 != null) {
                    valueOf = Float.valueOf(number.floatValue() * 100.0f);
                    valueOf2 = Float.valueOf(number2.floatValue() * 100.0f);
                }
            }
            return A01;
        }
        return new Range(valueOf, valueOf2);
    }

    public static ArrayList A03(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics) {
        ArrayList arrayList = new ArrayList();
        int[] iArr = (int[]) cameraCharacteristics.get(key);
        if (iArr != null) {
            for (int i : iArr) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    public static List A04(CameraCharacteristics cameraCharacteristics) {
        long[] jArr;
        if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null) {
            ArrayList arrayList = new ArrayList();
            for (long j : jArr) {
                arrayList.add(Long.valueOf(j));
            }
            return Collections.unmodifiableList(new ArrayList(arrayList));
        }
        return Collections.emptyList();
    }

    public static List A05(CameraCharacteristics cameraCharacteristics) {
        float f;
        Number number = (Number) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        ArrayList A022 = A02(f);
        if (A022 == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(A022));
    }

    public static List A07(StreamConfigurationMap streamConfigurationMap, int i) {
        Size[] sizeArr;
        int length;
        if (streamConfigurationMap != null) {
            Size[] highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i);
            sizeArr = streamConfigurationMap.getOutputSizes(i);
            if (highResolutionOutputSizes != null && (length = highResolutionOutputSizes.length) != 0) {
                sizeArr.getClass();
                int length2 = sizeArr.length;
                Size[] sizeArr2 = new Size[length + length2];
                System.arraycopy(highResolutionOutputSizes, 0, sizeArr2, 0, length);
                System.arraycopy(sizeArr, 0, sizeArr2, length, length2);
                sizeArr = sizeArr2;
            }
        } else {
            sizeArr = null;
        }
        return AbstractC176867ti.A02(sizeArr);
    }

    public static boolean A09(CameraCharacteristics cameraCharacteristics) {
        DynamicRangeProfiles dynamicRangeProfiles;
        if (Build.VERSION.SDK_INT < 34 || !A08(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, cameraCharacteristics, 18) || (dynamicRangeProfiles = (DynamicRangeProfiles) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES)) == null) {
            return false;
        }
        boolean contains = dynamicRangeProfiles.getSupportedProfiles().contains(2L);
        if ("samsung".equals(Build.MANUFACTURER)) {
            if (!contains || AbstractC02650Ap.A00() < 60100) {
                return false;
            }
            return true;
        }
        return contains;
    }

    public static boolean A0A(CameraCharacteristics cameraCharacteristics) {
        Number number;
        if (!A02 || cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) == null || !A0C(cameraCharacteristics, 0) || (number = (Number) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)) == null || number.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public static boolean A0B(CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 33) {
            return A08(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES, cameraCharacteristics, 2);
        }
        return false;
    }

    public static boolean A0C(CameraCharacteristics cameraCharacteristics, int i) {
        Object obj = cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        obj.getClass();
        int intValue = ((Number) obj).intValue();
        if (intValue != 2 && intValue >= i) {
            return true;
        }
        return false;
    }

    public static boolean A0D(List list) {
        if (Build.VERSION.SDK_INT >= 34 && list != null && list.contains(4101)) {
            return true;
        }
        return false;
    }

    public static List A06(CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        List emptyList = Collections.emptyList();
        if (cameraExtensionCharacteristics != null && Build.VERSION.SDK_INT >= 33) {
            return cameraExtensionCharacteristics.getSupportedExtensions();
        }
        return emptyList;
    }

    public static boolean A08(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics, int i) {
        int[] iArr = (int[]) cameraCharacteristics.get(key);
        if (iArr == null) {
            iArr = A00;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
