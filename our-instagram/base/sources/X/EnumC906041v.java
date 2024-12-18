package X;

import android.util.SparseArray;

/* renamed from: X.41v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC906041v {
    AD_DESTINATION_WEB(1),
    AD_DESTINATION_APP_STORE(2),
    AD_DESTINATION_DEEPLINK(3),
    AD_DESTINATION_PHONE(4),
    AD_DESTINATION_MAP(5),
    AD_DESTINATION_CANVAS(6),
    AD_DESTINATION_LEAD_AD(7),
    AD_DESTINATION_PROFILE_VISIT(8),
    AD_DESTINATION_DIRECT_MESSAGE(10),
    IG_DESTINATION_SHOPPING_SHEET(12),
    IG_DESTINATION_MINI_SHOP_STOREFRONT(13),
    AD_DESTINATION_SHOPPING_PDP(14),
    IG_DESTINATION_MINI_SHOP_COLLECTION(17),
    IG_DESTINATION_BLOKS(20),
    IGTV_CHANNEL_DESTINATION(21),
    IGTV_VIDEO_DESTINATION(22),
    AD_DESTINATION_CLIPS_VIEWER(23),
    AD_DESTINATION_AUDIO_PAGE(24),
    AD_DESTINATION_CLIPS_PROFILE(25),
    AD_DESTINATION_AR_CAMERA(26),
    AD_DESTINATION_ORGANIC_COLLECTION(32),
    AD_DESTINATION_JOIN_CHANNEL(33);

    public static final SparseArray A01 = new SparseArray();
    public final int A00;

    static {
        for (EnumC906041v enumC906041v : values()) {
            A01.put(enumC906041v.A00, enumC906041v);
        }
    }

    EnumC906041v(int i) {
        this.A00 = i;
    }
}
