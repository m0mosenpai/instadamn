package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class XOX {
    public static final /* synthetic */ XOX[] A01;
    public final String A00;

    static {
        XOX A00 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        XOX A002 = A00("BODY_TRACKING_3D_DETECTION", 1);
        XOX A003 = A00("BODY_TRACKING_3D_LANDMARK", 2);
        XOX A004 = A00("CAFFE2_INIT_NET", 3);
        XOX A005 = A00("CAFFE2_PREDICT_NET", 4);
        XOX A006 = A00("EXPRESSION_FITTING", 5);
        XOX A007 = A00("FACE_TRACKER_FACE_ALIGN", 6);
        XOX A008 = A00("FACE_TRACKER_FACE_CONTOUR", 7);
        XOX A009 = A00("FACE_TRACKER_FACE_DETECT", 8);
        XOX A0010 = A00("FACE_TRACKER_FACE_MESH", 9);
        XOX A0011 = A00("MULTICLASS_INIT_NET", 10);
        XOX A0012 = A00("MULTICLASS_PREDICT_NET", 11);
        XOX A0013 = A00("M_SUGGESTIONS_CORE_P13N_FILTERING_FEATURES", 12);
        XOX A0014 = A00("M_SUGGESTIONS_CORE_P13N_FILTERING_INIT", 13);
        XOX A0015 = A00("M_SUGGESTIONS_CORE_P13N_FILTERING_PREDICT", 14);
        XOX A0016 = A00("M_SUGGESTIONS_CORE_SENSITIVITY_INIT", 15);
        XOX A0017 = A00("M_SUGGESTIONS_CORE_SENSITIVITY_PREDICT", 16);
        XOX A0018 = A00("M_SUGGESTIONS_CORE_STICKER_RECEIVER_INTENT_INIT", 17);
        XOX A0019 = A00("M_SUGGESTIONS_CORE_STICKER_RECEIVER_INTENT_PREDICT", 18);
        XOX A0020 = A00("M_SUGGESTIONS_CORE_STICKER_RECEIVER_TAG_INIT", 19);
        XOX A0021 = A00("M_SUGGESTIONS_CORE_STICKER_RECEIVER_TAG_PREDICT", 20);
        XOX A0022 = A00("M_SUGGESTIONS_CORE_STICKER_SENDER_INTENT_INIT", 21);
        XOX A0023 = A00("M_SUGGESTIONS_CORE_STICKER_SENDER_INTENT_PREDICT", 22);
        XOX A0024 = A00("M_SUGGESTIONS_CORE_STICKER_SENDER_TAG_INIT", 23);
        XOX A0025 = A00("M_SUGGESTIONS_CORE_STICKER_SENDER_TAG_PREDICT", 24);
        XOX A0026 = A00("NAMETAG_DETECTION_INIT", 25);
        XOX A0027 = A00("NAMETAG_DETECTION_PRED", 26);
        XOX[] xoxArr = new XOX[45];
        System.arraycopy(new XOX[]{A00("NAMETAG_OCR_INIT", 27), A00("NAMETAG_OCR_PRED", 28), A00("OCR2GO_CONFIG", 29), A00("OCR2GO_DET_MODEL", 30), A00("OCR2GO_RCG_MODEL", 31), A00("PYTORCH_MODEL", 32), A00("RECOGNITION_CLASSIFICATION_INIT", 33), A00("RECOGNITION_DETECTION_INIT", 34), A00("RUNTIME_RIG_RETARGETING_CONFIG", 35), A00("TARGET_RECOGNITION_CLASSIFICATION_INIT", 36), A00("TARGET_RECOGNITION_CLASSIFICATION_PRED", 37), A00("TARGET_RECOGNITION_DETECTION_INIT", 38), A00("TARGET_RECOGNITION_DETECTION_PRED", 39), A00("UNKNOWN", 40), A00("XRAY_CLASSES", 41), A00("XRAY_CONFIGURATION", 42), A00("XRAY_INIT_NET", 43), A00("XRAY_PREDICT_NET", 44)}, AbstractC31175DnJ.A1b(new XOX[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, xoxArr) ? 1 : 0, xoxArr, 27, 18);
        A01 = xoxArr;
    }

    public static XOX A00(String str, int i) {
        return new XOX(str, i, str);
    }

    public static XOX valueOf(String str) {
        return (XOX) Enum.valueOf(XOX.class, str);
    }

    public static XOX[] values() {
        return (XOX[]) A01.clone();
    }

    public XOX(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
