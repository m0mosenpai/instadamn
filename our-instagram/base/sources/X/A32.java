package X;

/* loaded from: classes4.dex */
public abstract class A32 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "lwn_warning";
            case 2:
                return "persistent_lwn_welcome";
            case 3:
                return "persistent_lwn_warning";
            case 4:
                return "set_tone_lwn";
            case 5:
                return "persistent_set_tone_lwn";
            default:
                return "lwn_welcome";
        }
    }
}
