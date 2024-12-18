package X;

/* renamed from: X.Km4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46747Km4 {
    public static final Integer A00(String str) {
        C14360o3.A0B(str, 0);
        int hashCode = str.hashCode();
        if (hashCode != 1501196714) {
            if (hashCode != 1563991648) {
                if (hashCode == 1885454214 && str.equals("upload_failed_transient")) {
                    return C05F.A01;
                }
            } else if (str.equals("uploaded")) {
                return C05F.A0N;
            }
        } else if (str.equals("upload_failed_permanent")) {
            return C05F.A0C;
        }
        return C05F.A00;
    }
}
