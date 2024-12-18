package X;

import android.util.Base64;
import java.util.List;

/* renamed from: X.2cb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53532cb {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass001.A15("FontRequest {mProviderAuthority: ", this.A02, ", mProviderPackage: ", this.A03, ", mQuery: ", this.A04, ", mCertificates:"));
        int i = 0;
        while (true) {
            List list = this.A05;
            if (i < list.size()) {
                sb.append(" [");
                List list2 = (List) list.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i++;
            } else {
                sb.append("}");
                sb.append(AnonymousClass001.A0O("mCertificatesArray: ", this.A00));
                return sb.toString();
            }
        }
    }

    public C53532cb(String str, String str2, String str3, List list) {
        str.getClass();
        this.A02 = str;
        str2.getClass();
        this.A03 = str2;
        this.A04 = str3;
        list.getClass();
        this.A05 = list;
        this.A00 = 0;
        this.A01 = AnonymousClass001.A11(str, "-", str2, "-", str3);
    }

    public C53532cb(String str, int i) {
        this.A02 = "com.google.android.gms.fonts";
        this.A03 = "com.google.android.gms";
        this.A04 = str;
        this.A05 = null;
        this.A00 = i;
        this.A01 = AnonymousClass001.A11("com.google.android.gms.fonts", "-", "com.google.android.gms", "-", str);
    }
}
