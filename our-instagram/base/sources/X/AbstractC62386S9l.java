package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.S9l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62386S9l {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature A02;
    public static final Feature A03;
    public static final Feature[] A04;

    static {
        Feature A0e = AbstractC58321PtD.A0e("sms_code_autofill", 2L);
        A00 = A0e;
        Feature A0e2 = AbstractC58321PtD.A0e("sms_code_browser", 2L);
        A01 = A0e2;
        Feature A0e3 = AbstractC58321PtD.A0e("sms_retrieve", 1L);
        A02 = A0e3;
        Feature A0e4 = AbstractC58321PtD.A0e("user_consent", 3L);
        A03 = A0e4;
        A04 = new Feature[]{A0e, A0e2, A0e3, A0e4};
    }
}
