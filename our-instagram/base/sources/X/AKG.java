package X;

import com.facebook.common.dextricks.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* loaded from: classes4.dex */
public final class AKG {
    public static final AKG A00 = new Object();

    public final boolean A01(String str) {
        File A11 = AbstractC166987dD.A11(str);
        if (A11.exists() && A11.isFile()) {
            try {
                Reader inputStreamReader = new InputStreamReader(new FileInputStream(A11), C15W.A05);
                if (!(inputStreamReader instanceof BufferedReader)) {
                    inputStreamReader = new BufferedReader(inputStreamReader, 8192);
                }
                return A00(inputStreamReader);
            } catch (IOException unused) {
            }
        } else {
            C0I2.A03("UltraHdrUtils", AnonymousClass001.A0R("Invalid image file: ", str));
        }
        return false;
    }

    public static final boolean A00(Reader reader) {
        int min;
        int i;
        int i2 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
        int length = "http://ns.adobe.com/hdr-gain-map/1.0/".length();
        if (65536 <= length) {
            i2 = Constants.LOAD_RESULT_PGO_ATTEMPTED + length;
        }
        char[] cArr = new char[i2];
        int i3 = length - 1;
        int i4 = i2 - i3;
        long j = -i3;
        C17u A0C = C17s.A0C(1, length);
        int i5 = i4;
        while (i5 == i4 && j < 262144) {
            try {
                try {
                    i5 = reader.read(cArr, i3, i4);
                    min = Math.min(i4, i5);
                } catch (IOException unused) {
                }
            } catch (IOException unused2) {
            }
            for (i = 0; i < min; i++) {
                if ("http://ns.adobe.com/hdr-gain-map/1.0/".charAt(0) == cArr[i]) {
                    int i6 = A0C.A00;
                    int i7 = A0C.A01;
                    if (i6 <= i7) {
                        while ("http://ns.adobe.com/hdr-gain-map/1.0/".charAt(i6) == cArr[i + i6]) {
                            if (i6 != i7) {
                                i6++;
                            }
                        }
                    }
                    if (j + i >= 0) {
                        return true;
                    }
                    return false;
                }
            }
            if (i5 == i4) {
                System.arraycopy(cArr, i4, cArr, 0, i3);
                j += i4;
            }
        }
        reader.close();
        return false;
    }
}
