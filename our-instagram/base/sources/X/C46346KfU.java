package X;

/* renamed from: X.KfU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46346KfU extends Exception {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        Class<?> cls;
        C46346KfU c46346KfU;
        String str;
        String str2;
        if (this != obj) {
            Class<?> cls2 = getClass();
            String str3 = null;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                if (obj instanceof C46346KfU) {
                    c46346KfU = (C46346KfU) obj;
                } else {
                    c46346KfU = null;
                }
                String str4 = this.A00;
                if (c46346KfU != null) {
                    str = c46346KfU.A00;
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str4, str)) {
                    String str5 = this.A02;
                    if (c46346KfU != null) {
                        str2 = c46346KfU.A02;
                    } else {
                        str2 = null;
                    }
                    if (C14360o3.A0K(str5, str2)) {
                        String str6 = this.A01;
                        if (c46346KfU != null) {
                            str3 = c46346KfU.A01;
                        }
                        if (!C14360o3.A0K(str6, str3)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A04 = ((AbstractC31177DnL.A04(this.A00) * 31) + AbstractC31177DnL.A04(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A04 + i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AnonymousClass001.A14("GenAIImageQueryServerException(errorCode=", this.A00, ", errorTitle=", this.A02, ", errorDescription=", this.A01, ')');
    }

    public C46346KfU(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
