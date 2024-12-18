package X;

import android.os.Bundle;

/* renamed from: X.SfB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63207SfB {
    public final int A00;
    public final int A01;
    public final android.net.Uri A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C63207SfB c63207SfB = (C63207SfB) obj;
            if (this.A00 != c63207SfB.A00 || !this.A04.equals(c63207SfB.A04) || !this.A03.equals(c63207SfB.A03) || this.A01 != c63207SfB.A01 || !this.A02.equals(c63207SfB.A02)) {
                return false;
            }
        }
        return true;
    }

    public static C63207SfB A00(Bundle bundle) {
        int A0H = AbstractC166987dD.A0H(A01(bundle, Integer.class, "protocol_version"));
        return new C63207SfB((android.net.Uri) A01(bundle, android.net.Uri.class, "file_uri"), (String) A01(bundle, String.class, "package_name"), (String) A01(bundle, String.class, "module_name"), A0H, AbstractC166987dD.A0H(A01(bundle, Integer.class, "version_code")));
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(Integer.valueOf(this.A00), this.A04, this.A03, Integer.valueOf(this.A01), this.A02);
    }

    public C63207SfB(android.net.Uri uri, String str, String str2, int i, int i2) {
        this.A00 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = i2;
        this.A02 = uri;
    }

    public static Object A01(Bundle bundle, Class cls, String str) {
        if (bundle.containsKey(str)) {
            Object cast = cls.cast(bundle.get(str));
            if (cast != null) {
                return cast;
            }
            throw AbstractC58320PtC.A0p("value for required key %s is null", new Object[]{str});
        }
        throw AbstractC58320PtC.A0p("key %s is missing but required", new Object[]{str});
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ModuleFileInfo={protocol=");
        A1C.append(this.A00);
        A1C.append(", packageName=");
        A1C.append(this.A04);
        A1C.append(", moduleName=");
        A1C.append(this.A03);
        A1C.append(", versionCode=");
        A1C.append(this.A01);
        A1C.append(", fileUri=");
        return AbstractC50523MSb.A0W(this.A02.toString(), A1C);
    }
}
