package X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.5mV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125805mV {
    public long A00;
    public long A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C125805mV c125805mV = (C125805mV) obj;
            if (this.A00 != c125805mV.A00 || this.A01 != c125805mV.A01 || this.A02 != c125805mV.A02) {
                return false;
            }
        }
        return true;
    }

    public final String A00() {
        String str = this.A02;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("NON_REVEALABLE")) {
                return "NON_REVEALABLE";
            }
            if (str.equals("REVEALABLE")) {
                return "REVEALABLE";
            }
        }
        return "UNKNOWN";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), Long.valueOf(this.A01), this.A02});
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r4.equals("REVEALABLE") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C125805mV(long r6, long r8, java.lang.String r10) {
        /*
            r5 = this;
            r5.<init>()
            r5.A00 = r6
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L2d
            r4 = 0
        Lc:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r3 = "REVEALABLE"
            java.lang.String r2 = "UNKNOWN"
            java.lang.String r1 = "NON_REVEALABLE"
            if (r0 != 0) goto L2b
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L24
            r3 = r1
        L1f:
            r5.A02 = r3
            r5.A01 = r8
            return
        L24:
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L2b
            goto L1f
        L2b:
            r3 = r2
            goto L1f
        L2d:
            java.lang.String r1 = "\""
            java.lang.String r0 = ""
            java.lang.String r4 = r10.replaceAll(r1, r0)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125805mV.<init>(long, long, java.lang.String):void");
    }

    public C125805mV() {
    }
}
