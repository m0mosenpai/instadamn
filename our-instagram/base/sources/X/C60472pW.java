package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.IOException;

/* renamed from: X.2pW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60472pW {
    public static final String A06 = System.getProperty("line.separator");
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;

    public C60472pW(String str) {
        String[] strArr = (String[]) new C11L("@").A03(str).toArray(new String[0]);
        int length = strArr.length;
        if (length == 6) {
            try {
                this.A04 = strArr[0];
                this.A00 = Integer.parseInt(strArr[1]);
                this.A01 = Integer.parseInt(strArr[2]);
                this.A05 = strArr[3];
                this.A02 = Long.parseLong(strArr[4]);
                this.A03 = Long.parseLong(strArr[5]);
                return;
            } catch (NumberFormatException e) {
                throw new IOException(e);
            }
        }
        throw new IOException(StringFormatUtil.formatStrLocaleSafe("Malformatted cacheEvent on disk. Found unexpected number of fields %d. For: %s", Integer.valueOf(length), str));
    }

    public C60472pW(String str, String str2, int i, int i2, long j) {
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = str2 == null ? "unknown" : str2;
        this.A02 = j;
        this.A03 = System.currentTimeMillis();
    }
}
