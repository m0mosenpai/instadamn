package X;

/* renamed from: X.NtV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53958NtV {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "quiet_mode_enabled";
            case 2:
                return "recipient_in_quiet_mode";
            case 3:
                return "sender_and_recipient_in_quiet_mode";
            case 4:
                return "sender_in_quiet_mode";
            default:
                return "quiet_mode_disabled";
        }
    }
}
