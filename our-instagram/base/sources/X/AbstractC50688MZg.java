package X;

/* renamed from: X.MZg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50688MZg {
    public static final C3T1 A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != -1281977283) {
                if (hashCode == 336650556 && str.equals("loading")) {
                    return C3T1.LOADING;
                }
            } else if (str.equals("failed")) {
                return C3T1.FAILED;
            }
        } else if (str.equals("success")) {
            return C3T1.SUCCESS;
        }
        throw AbstractC31175DnJ.A0V("unknown spinner state: ", str);
    }
}
