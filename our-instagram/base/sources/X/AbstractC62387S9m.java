package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.S9m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62387S9m {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature[] A02;
    public static final Feature A03;
    public static final Feature A04;

    static {
        Feature A0e = AbstractC58321PtD.A0e("name_ulr_private", 1L);
        A03 = A0e;
        Feature A0e2 = AbstractC58321PtD.A0e("name_sleep_segment_request", 1L);
        A04 = A0e2;
        Feature A0e3 = AbstractC58321PtD.A0e("support_context_feature_id", 1L);
        A00 = A0e3;
        Feature A0e4 = AbstractC58321PtD.A0e("get_current_location", 1L);
        A01 = A0e4;
        A02 = new Feature[]{A0e, A0e2, A0e3, A0e4};
    }
}
