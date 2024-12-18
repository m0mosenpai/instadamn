package X;

/* renamed from: X.Nwy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54162Nwy {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "incoming_call";
            case 1:
                return "ring";
            case 2:
                return "dismiss";
            case 3:
                return "call_ended";
            default:
                return "unknown";
        }
    }
}
