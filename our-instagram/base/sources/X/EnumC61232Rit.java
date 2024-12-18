package X;

import org.webrtc.ScreenCapturerAndroid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rit, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61232Rit implements InterfaceC65416Tjn {
    public static final /* synthetic */ EnumC61232Rit[] A01;
    public static final EnumC61232Rit A02;
    public static final EnumC61232Rit A03;
    public static final EnumC61232Rit A04;
    public final int A00;

    @Override // X.InterfaceC65416Tjn
    public final int FFU() {
        return this.A00;
    }

    static {
        EnumC61232Rit enumC61232Rit = new EnumC61232Rit("NO_ERROR", 0, 0);
        A03 = enumC61232Rit;
        EnumC61232Rit enumC61232Rit2 = new EnumC61232Rit("INCOMPATIBLE_INPUT", 1, 1);
        EnumC61232Rit enumC61232Rit3 = new EnumC61232Rit("INCOMPATIBLE_OUTPUT", 2, 2);
        EnumC61232Rit enumC61232Rit4 = new EnumC61232Rit("INCOMPATIBLE_TFLITE_VERSION", 3, 3);
        EnumC61232Rit enumC61232Rit5 = new EnumC61232Rit("MISSING_OP", 4, 4);
        EnumC61232Rit A00 = A00("DATA_TYPE_ERROR", 5, 6);
        EnumC61232Rit A002 = A00("TFLITE_INTERNAL_ERROR", 6, 7);
        EnumC61232Rit A003 = A00("TFLITE_UNKNOWN_ERROR", 7, 8);
        EnumC61232Rit A004 = A00("MEDIAPIPE_ERROR", 8, 9);
        EnumC61232Rit A005 = A00("TIME_OUT_FETCHING_MODEL_METADATA", 9, 5);
        EnumC61232Rit A006 = A00("MODEL_NOT_DOWNLOADED", 10, 100);
        A04 = A006;
        EnumC61232Rit A007 = A00("URI_EXPIRED", 11, 101);
        EnumC61232Rit A008 = A00("NO_NETWORK_CONNECTION", 12, 102);
        EnumC61232Rit A009 = A00("METERED_NETWORK", 13, 103);
        EnumC61232Rit A0010 = A00("DOWNLOAD_FAILED", 14, 104);
        EnumC61232Rit A0011 = A00("MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS", 15, 105);
        EnumC61232Rit A0012 = A00("MODEL_INFO_DOWNLOAD_NO_HASH", 16, 106);
        EnumC61232Rit A0013 = A00("MODEL_INFO_DOWNLOAD_CONNECTION_FAILED", 17, 107);
        EnumC61232Rit A0014 = A00("NO_VALID_MODEL", 18, 108);
        EnumC61232Rit A0015 = A00("LOCAL_MODEL_INVALID", 19, 109);
        EnumC61232Rit A0016 = A00("REMOTE_MODEL_INVALID", 20, 110);
        EnumC61232Rit A0017 = A00("REMOTE_MODEL_LOADER_ERROR", 21, 111);
        EnumC61232Rit A0018 = A00("REMOTE_MODEL_LOADER_LOADS_NO_MODEL", 22, 112);
        EnumC61232Rit A0019 = A00("SMART_REPLY_LANG_ID_DETECTAION_FAILURE", 23, 113);
        EnumC61232Rit A0020 = A00("MODEL_NOT_REGISTERED", 24, 114);
        EnumC61232Rit A0021 = A00("MODEL_TYPE_MISUSE", 25, 115);
        EnumC61232Rit A0022 = A00("MODEL_HASH_MISMATCH", 26, 116);
        EnumC61232Rit A0023 = A00("OPTIONAL_MODULE_NOT_AVAILABLE", 27, 201);
        EnumC61232Rit A0024 = A00("OPTIONAL_MODULE_INIT_ERROR", 28, 202);
        EnumC61232Rit A0025 = A00("OPTIONAL_MODULE_INFERENCE_ERROR", 29, 203);
        EnumC61232Rit A0026 = A00("OPTIONAL_MODULE_RELEASE_ERROR", 30, 204);
        EnumC61232Rit A0027 = A00("OPTIONAL_TFLITE_MODULE_INIT_ERROR", 31, 205);
        EnumC61232Rit A0028 = A00("NATIVE_LIBRARY_LOAD_ERROR", 32, 206);
        EnumC61232Rit A0029 = A00("OPTIONAL_MODULE_CREATE_ERROR", 33, 207);
        EnumC61232Rit A0030 = A00("CAMERAX_SOURCE_ERROR", 34, 301);
        EnumC61232Rit A0031 = A00("CAMERA1_SOURCE_CANT_START_ERROR", 35, 302);
        EnumC61232Rit A0032 = A00("CAMERA1_SOURCE_NO_SUITABLE_SIZE_ERROR", 36, 303);
        EnumC61232Rit A0033 = A00("CAMERA1_SOURCE_NO_SUITABLE_FPS_ERROR", 37, 304);
        EnumC61232Rit A0034 = A00("CAMERA1_SOURCE_NO_BYTE_SOURCE_FOUND_ERROR", 38, 305);
        EnumC61232Rit A0035 = A00("CODE_SCANNER_UNAVAILABLE", 39, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
        EnumC61232Rit A0036 = A00("CODE_SCANNER_CANCELLED", 40, 401);
        EnumC61232Rit A0037 = A00("CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED", 41, 402);
        EnumC61232Rit A0038 = A00("CODE_SCANNER_APP_NAME_UNAVAILABLE", 42, 403);
        EnumC61232Rit A0039 = A00("CODE_SCANNER_TASK_IN_PROGRESS", 43, 404);
        EnumC61232Rit A0040 = A00("CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR", 44, 405);
        EnumC61232Rit A0041 = A00("CODE_SCANNER_PIPELINE_INFERENCE_ERROR", 45, 406);
        EnumC61232Rit A0042 = A00("CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD", 46, 407);
        EnumC61232Rit A0043 = A00("UNKNOWN_ERROR", 47, 9999);
        A02 = A0043;
        EnumC61232Rit[] enumC61232RitArr = new EnumC61232Rit[48];
        System.arraycopy(new EnumC61232Rit[]{A0023, A0024, A0025, A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043}, AbstractC31175DnJ.A1b(new EnumC61232Rit[]{enumC61232Rit, enumC61232Rit2, enumC61232Rit3, enumC61232Rit4, enumC61232Rit5, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022}, enumC61232RitArr) ? 1 : 0, enumC61232RitArr, 27, 21);
        A01 = enumC61232RitArr;
    }

    public static EnumC61232Rit A00(String str, int i, int i2) {
        return new EnumC61232Rit(str, i, i2);
    }

    public static EnumC61232Rit[] values() {
        return (EnumC61232Rit[]) A01.clone();
    }

    public EnumC61232Rit(String str, int i, int i2) {
        this.A00 = i2;
    }
}
