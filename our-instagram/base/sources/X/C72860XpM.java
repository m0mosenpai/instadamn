package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.XpM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C72860XpM {
    public final byte[] A02(InputStream inputStream, int i) {
        try {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(String.format("Unable to read the value of the ASN.1 object", e));
        }
    }

    public final int A00(InputStream inputStream) {
        try {
            int read = inputStream.read();
            if (read >= 127) {
                int i = read & StringTreeSet.MAX_SYMBOL_COUNT;
                read = 0;
                for (int i2 = 0; i2 < i; i2++) {
                    read = (read << 8) + inputStream.read();
                }
                if (read == 0) {
                    throw new RuntimeException("The indefinite length form is not (yet) supported!");
                }
            }
            return read;
        } catch (IOException e) {
            throw new RuntimeException(String.format("Unable to read the length of the ASN.1 object.", e));
        }
    }

    public final Y4A A01(InputStream inputStream) {
        EnumC72354Xbq enumC72354Xbq;
        try {
            int read = inputStream.read();
            byte b = (byte) read;
            int i = b & 192;
            for (EnumC72367Xc3 enumC72367Xc3 : EnumC72367Xc3.values()) {
                if (enumC72367Xc3.A00 == i) {
                    if ((b & 32) == 0) {
                        enumC72354Xbq = EnumC72354Xbq.Primitive;
                    } else {
                        enumC72354Xbq = EnumC72354Xbq.Constructed;
                    }
                    int i2 = read & 31;
                    if (i2 <= 30) {
                        return Y4A.A00(enumC72367Xc3, i2).A02(enumC72354Xbq);
                    }
                    int read2 = inputStream.read();
                    int i3 = 0;
                    do {
                        i3 = (i3 << 7) | (read2 & StringTreeSet.MAX_SYMBOL_COUNT);
                        read2 = inputStream.read();
                    } while ((read2 & 128) > 0);
                    return Y4A.A00(enumC72367Xc3, i3).A02(enumC72354Xbq);
                }
            }
            throw AbstractC166987dD.A14("Could not parse ASN.1 Tag Class (should be impossible)");
        } catch (IOException e) {
            throw new RuntimeException(String.format("Unable to parse ASN.1 tag", e));
        }
    }
}
