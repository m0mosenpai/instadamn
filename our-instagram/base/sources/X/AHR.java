package X;

/* loaded from: classes4.dex */
public abstract class AHR {
    public static final int A00(C148276lx c148276lx) {
        if (c148276lx.A0F != C05F.A01) {
            return Integer.MIN_VALUE;
        }
        return 9;
    }

    public static final VHl A01(String str, String str2) {
        if (C14360o3.A0K(str2, EnumC150226pU.A04.toString())) {
            return VHl.A02;
        }
        if (str == null) {
            return null;
        }
        if (AbstractC002300n.A0h(str, AbstractC111324zv.A00(1990), false)) {
            return VHl.A04;
        }
        if (AbstractC002300n.A0h(str, AbstractC111324zv.A00(1989), false)) {
            return VHl.A03;
        }
        if (!AbstractC002300n.A0h(str, "emoji_reaction_", false) && !str.equals("reaction_sticker_bundle_id")) {
            if (!str.equals("rollcall_v2_photo_sticker") && !str.equals("rollcall_v2_video_sticker")) {
                if (str.equals("rollcall_v2_timestamp_sticker")) {
                    return VHl.A0B;
                }
                if (!str.equals("group_mention_sticker_bundle_id")) {
                    return null;
                }
                return VHl.A06;
            }
            return VHl.A0A;
        }
        return VHl.A09;
    }

    public static final String A02(C148276lx c148276lx, boolean z) {
        if (c148276lx.A0Y) {
            return "SUGGESTED_PINNABLES_PEEK";
        }
        if (c148276lx.A0F == C05F.A00) {
            return "STICKER_DROP_PROMO";
        }
        if (z) {
            return "WITH_BANNER_NEW";
        }
        return null;
    }
}
