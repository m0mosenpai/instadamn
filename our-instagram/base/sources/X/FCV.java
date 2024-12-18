package X;

/* loaded from: classes6.dex */
public abstract class FCV {
    public static final String A00(String str, String str2) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("user_list_group_");
        A1C.append(str);
        if (str2 != null && str2.length() > 0) {
            A1C.append("_");
            A1C.append(str2);
        }
        return AbstractC166987dD.A19(A1C);
    }
}
