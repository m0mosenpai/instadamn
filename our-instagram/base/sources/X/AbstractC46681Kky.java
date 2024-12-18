package X;

/* renamed from: X.Kky, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46681Kky {
    public static final Integer A00(String str) {
        Integer num = C05F.A00;
        if (!C14360o3.A0K(str, "attribution_upsell")) {
            Integer num2 = C05F.A0C;
            if (!C14360o3.A0K(str, "photo_post")) {
                Integer num3 = C05F.A0N;
                if (!C14360o3.A0K(str, "video_post")) {
                    Integer num4 = C05F.A0Y;
                    if (!C14360o3.A0K(str, AbstractC111324zv.A00(515))) {
                        Integer num5 = C05F.A0j;
                        if (!C14360o3.A0K(str, "reels_sticker_tray")) {
                            Integer num6 = C05F.A0u;
                            if (!C14360o3.A0K(str, "stories_sticker_tray")) {
                                Integer num7 = C05F.A15;
                                if (!C14360o3.A0K(str, "direct_sticker_tray")) {
                                    Integer num8 = C05F.A1F;
                                    if (!C14360o3.A0K(str, "asset_hub_create_btn")) {
                                        Integer num9 = C05F.A1I;
                                        if (!C14360o3.A0K(str, "thread_item_long_press")) {
                                            return C05F.A02;
                                        }
                                        return num9;
                                    }
                                    return num8;
                                }
                                return num7;
                            }
                            return num6;
                        }
                        return num5;
                    }
                    return num4;
                }
                return num3;
            }
            return num2;
        }
        return num;
    }
}
