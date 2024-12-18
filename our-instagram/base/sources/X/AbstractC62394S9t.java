package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.S9t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62394S9t {
    public static final SGQ A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("US-ASCII");
    public static final Charset A03 = AbstractC58318PtA.A0u();
    public static final Charset A04 = Charset.forName("ISO-8859-1");
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        SGQ sgq = new SGQ(bArr);
        try {
            int i = sgq.A00 + sgq.A01;
            sgq.A00 = i;
            if (i > 0) {
                sgq.A01 = i;
                sgq.A00 = i - i;
            } else {
                sgq.A01 = 0;
            }
            A00 = sgq;
        } catch (C61029Rdx e) {
            throw new IllegalArgumentException(e);
        }
    }
}
