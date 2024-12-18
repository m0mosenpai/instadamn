package X;

/* renamed from: X.VVx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68570VVx {
    public static Integer A00(String str) {
        if (str.equals("VIEW")) {
            return C05F.A00;
        }
        if (str.equals("PRIMARY")) {
            return C05F.A01;
        }
        if (str.equals("SECONDARY")) {
            return C05F.A0C;
        }
        if (str.equals("DISMISS")) {
            return C05F.A0N;
        }
        throw new IllegalArgumentException(str);
    }
}
