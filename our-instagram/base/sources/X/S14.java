package X;

/* loaded from: classes10.dex */
public abstract class S14 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FBNS";
            case 2:
                return "PreloadedFBNS";
            case 3:
                return "MqttDirect";
            default:
                return "MqttSimpleClient";
        }
    }
}
