package X;

import com.google.android.gms.common.Feature;

/* loaded from: classes10.dex */
public abstract class SA3 {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature A02;
    public static final Feature A03;
    public static final Feature A04;
    public static final Feature A05;
    public static final Feature A06;
    public static final Feature A07;
    public static final Feature[] A08;

    static {
        Feature A0e = AbstractC58321PtD.A0e("auth_api_credentials_begin_sign_in", 8L);
        A00 = A0e;
        Feature A0e2 = AbstractC58321PtD.A0e("auth_api_credentials_sign_out", 2L);
        A01 = A0e2;
        Feature A0e3 = AbstractC58321PtD.A0e("auth_api_credentials_authorize", 1L);
        A02 = A0e3;
        Feature A0e4 = AbstractC58321PtD.A0e("auth_api_credentials_revoke_access", 1L);
        A03 = A0e4;
        Feature A0e5 = AbstractC58321PtD.A0e("auth_api_credentials_save_password", 4L);
        A04 = A0e5;
        Feature A0e6 = AbstractC58321PtD.A0e("auth_api_credentials_get_sign_in_intent", 6L);
        A05 = A0e6;
        Feature A0e7 = AbstractC58321PtD.A0e("auth_api_credentials_save_account_linking_token", 3L);
        A06 = A0e7;
        Feature A0e8 = AbstractC58321PtD.A0e("auth_api_credentials_get_phone_number_hint_intent", 3L);
        A07 = A0e8;
        A08 = new Feature[]{A0e, A0e2, A0e3, A0e4, A0e5, A0e6, A0e7, A0e8};
    }
}
