package X;

/* renamed from: X.SFz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62548SFz {
    public Object A00;
    public Object A01;
    public boolean A02;

    public static final String A00(C62548SFz c62548SFz, String str, int i) {
        Object obj;
        try {
            if (i != 0) {
                if (i != 1) {
                    obj = null;
                } else {
                    obj = c62548SFz.A01;
                }
            } else {
                obj = c62548SFz.A00;
            }
            if (obj == null) {
                return null;
            }
            Object invoke = obj.getClass().getDeclaredMethod(str, new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return invoke.toString();
            }
            throw AbstractC166997dE.A0g();
        } catch (Exception unused) {
            return null;
        }
    }
}
