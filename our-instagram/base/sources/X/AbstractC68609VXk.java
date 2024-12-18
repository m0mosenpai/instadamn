package X;

/* renamed from: X.VXk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68609VXk {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "WebviewFailedToLoad";
            case 1:
                return "DecodingError";
            case 2:
                return "EncodingError";
            default:
                return "MetaOnlyErrorWebviewFailedToRunInjectedJS";
        }
    }
}
