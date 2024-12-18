package X;

/* renamed from: X.Nwp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54153Nwp {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "peer_action";
            case 2:
                return "end_call";
            case 3:
                return "effect_link";
            case 4:
                return "removed_from_tray";
            case 5:
                return "switch_effect";
            case 6:
                return "avatar_mode_on";
            case 7:
                return "avatar_mode_off";
            case 8:
                return "switch_avatar";
            case 9:
                return "persistence";
            default:
                return "user_click";
        }
    }
}
