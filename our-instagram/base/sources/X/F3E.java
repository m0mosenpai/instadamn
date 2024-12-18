package X;

/* loaded from: classes6.dex */
public abstract class F3E {
    public static final boolean A00(String str) {
        android.net.Uri A0B = AbstractC25227BEk.A0B(str);
        if ("instagram".equals(A0B.getScheme()) && "thread".equals(A0B.getHost()) && !A0B.getPathSegments().isEmpty()) {
            String str2 = A0B.getPathSegments().get(0);
            C14360o3.A07(str2);
            if (str2.length() != 0 && AbstractC31176DnK.A0l(A0B, 1).equals("details") && AbstractC25226BEj.A1I(A0B.getPathSegments(), 2).equals("invite_link")) {
                return true;
            }
        }
        return false;
    }
}
