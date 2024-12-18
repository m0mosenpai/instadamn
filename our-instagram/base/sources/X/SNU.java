package X;

/* loaded from: classes10.dex */
public final class SNU {
    public final android.net.Uri A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
                SNU snu = (SNU) obj;
                if (!C14360o3.A0K(this.A00, snu.A00) || this.A01 != snu.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0G = AbstractC166987dD.A0G(this.A00);
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return A0G + i;
    }

    public SNU(boolean z, android.net.Uri uri) {
        this.A00 = uri;
        this.A01 = z;
    }
}
