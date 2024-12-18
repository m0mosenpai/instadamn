package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class RiZ implements InterfaceC02530Ab {
    public static final /* synthetic */ RiZ[] A01;
    public static final RiZ A02;
    public static final RiZ A03;
    public static final RiZ A04;
    public static final RiZ A05;
    public static final RiZ A06;
    public final String A00;

    static {
        RiZ riZ = new RiZ("CALL_THRIFT", 0, "call_thrift");
        RiZ riZ2 = new RiZ("GET", 1, "get");
        RiZ riZ3 = new RiZ("POST", 2, "post");
        RiZ riZ4 = new RiZ("SEND_NOTIF", 3, "send_notif");
        RiZ riZ5 = new RiZ("TAPPED_LABEL", 4, "tapped_label");
        RiZ riZ6 = new RiZ("TAPPED_LEARN_MORE", 5, "tapped_learn_more");
        A03 = riZ6;
        RiZ riZ7 = new RiZ("TAPPED_NEXT", 6, "tapped_next");
        A04 = riZ7;
        RiZ riZ8 = new RiZ("TAPPED_SEE_FEWER_ADS", 7, "tapped_fewer_ads");
        RiZ riZ9 = new RiZ("UPLOAD_FAILED", 8, "upload_failed");
        A05 = riZ9;
        RiZ riZ10 = new RiZ("UPDATED_COUNTRY", 9, "updated_country");
        RiZ riZ11 = new RiZ("VIEWED", 10, "viewed");
        A06 = riZ11;
        RiZ riZ12 = new RiZ("OPENED_BOTTOMSHEET", 11, "opened_bottomsheet");
        A02 = riZ12;
        RiZ riZ13 = new RiZ("OPENED_ABOUT_THIS_ACCOUNT", 12, "opened_about_this_account");
        RiZ riZ14 = new RiZ("OPENED_SIEP_BOTTOMSHEET", 13, "opened_siep_bottomsheet");
        RiZ riZ15 = new RiZ("IDV_UPLOADER_ID_RECEIVED", 14, "idv_uploader_id_received");
        RiZ riZ16 = new RiZ("IDV_UPLOADER_SELFIE_RECEIVED", 15, "idv_uploader_selfie_received");
        RiZ riZ17 = new RiZ("IDV_UPLOADER_FBID_CONVERSION_FAILED", 16, "idv_uploader_fbid_conversion_failed");
        RiZ riZ18 = new RiZ("IDV_UPLOADER_NOT_IN_USER_RESTRICTION", 17, "idv_uploader_not_in_user_restriction");
        RiZ riZ19 = new RiZ("IDV_UPLOADER_JSON_DECODE_FAILED", 18, "idv_uploader_json_decode_failed");
        RiZ riZ20 = new RiZ("IDV_UPLOADER_SELFIE_EVERSTORE_FORMAT_FAILED", 19, "idv_uploader_selfie_everstore_format_failed");
        RiZ riZ21 = new RiZ("IDV_UPLOADER_SELFIE_CHALLENGE_UPLOAD_FAILED", 20, "idv_uploader_selfie_challenge_upload_failed");
        RiZ riZ22 = new RiZ("IDV_SRT_ID_SUBMISSION_STARTED", 21, "idv_srt_id_submission_started");
        RiZ riZ23 = new RiZ("IDV_SRT_ID_SUBMISSION_PRECHECK_SUCCEEDED", 22, "idv_srt_id_submission_precheck_succeeded");
        RiZ riZ24 = new RiZ("IDV_SRT_ID_SUBMISSION_PRECHECK_FAILED", 23, "idv_srt_id_submission_precheck_failed");
        RiZ riZ25 = new RiZ("IDV_SRT_SELFIE_SUBMISSION_STARTED", 24, "idv_srt_selfie_submission_started");
        RiZ riZ26 = new RiZ("IDV_SRT_IMAGE_CONVERSION_FAILED", 25, "idv_srt_image_conversion_failed");
        RiZ riZ27 = new RiZ("IDV_SRT_SUBMISSION_FAILED", 26, "idv_srt_submission_failed");
        RiZ[] riZArr = new RiZ[30];
        System.arraycopy(new RiZ[]{new RiZ("IDV_SRT_ALLOW_APPEAL", 27, "idv_srt_allow_appeal"), new RiZ("IDV_SRT_AUTO_IGNORE", 28, "idv_srt_auto_ignore"), new RiZ("IDV_SRT_SUBMISSION_SUCCEEDED", 29, "idv_srt_submission_succeeded")}, AbstractC31175DnJ.A1b(new RiZ[]{riZ, riZ2, riZ3, riZ4, riZ5, riZ6, riZ7, riZ8, riZ9, riZ10, riZ11, riZ12, riZ13, riZ14, riZ15, riZ16, riZ17, riZ18, riZ19, riZ20, riZ21, riZ22, riZ23, riZ24, riZ25, riZ26, riZ27}, riZArr) ? 1 : 0, riZArr, 27, 3);
        A01 = riZArr;
    }

    public static RiZ valueOf(String str) {
        return (RiZ) Enum.valueOf(RiZ.class, str);
    }

    public static RiZ[] values() {
        return (RiZ[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    public RiZ(String str, int i, String str2) {
        this.A00 = str2;
    }
}
