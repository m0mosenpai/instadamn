package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.3mG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82523mG {
    public long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82523mG)) {
            return false;
        }
        C82523mG c82523mG = (C82523mG) obj;
        return this.A01 == c82523mG.A01 && this.A00 == c82523mG.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.A01;
        if (j != -1) {
            String format = new SimpleDateFormat("mm:ss.SSS", Locale.US).format(Long.valueOf(j));
            C14360o3.A07(format);
            sb.append(AnonymousClass001.A0R("Enter: ", format));
        }
        long j2 = this.A00;
        if (j2 != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", Exit: ");
            String format2 = new SimpleDateFormat("mm:ss.SSS", Locale.US).format(Long.valueOf(j2));
            C14360o3.A07(format2);
            sb2.append(format2);
            sb2.append(", Duration: ");
            sb2.append((this.A00 - j) / 1000.0d);
            sb2.append(" secs");
            sb.append(sb2.toString());
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public C82523mG(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
