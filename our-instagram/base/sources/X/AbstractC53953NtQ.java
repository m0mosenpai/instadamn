package X;

/* renamed from: X.NtQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53953NtQ {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "cancel";
            case 2:
                return "continue";
            case 3:
                return AbstractC58317Pt9.A00(305);
            case 4:
                return "mute";
            case 5:
                return "unmute";
            case 6:
                return "bot_mute";
            case 7:
                return "bot_unmute";
            default:
                return "ai_voice";
        }
    }
}
