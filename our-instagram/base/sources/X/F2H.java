package X;

/* loaded from: classes6.dex */
public abstract class F2H {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "direct_v2/icebreakers/create/";
            case 1:
                return "direct_v2/icebreakers/update/%s/";
            default:
                return "direct_v2/icebreakers/delete/%s/";
        }
    }
}
