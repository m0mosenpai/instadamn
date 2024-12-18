package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.S9u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62395S9u {
    public static final SGS A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("US-ASCII");
    public static final Charset A03 = AbstractC58318PtA.A0u();
    public static final Charset A04 = Charset.forName("ISO-8859-1");
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        SGS sgs = new SGS(bArr);
        try {
            int i = sgs.A00 + sgs.A01;
            sgs.A00 = i;
            if (i > 0) {
                sgs.A01 = i;
                sgs.A00 = i - i;
            } else {
                sgs.A01 = 0;
            }
            A00 = sgs;
        } catch (AbstractC61015Rdj e) {
            throw new IllegalArgumentException(e);
        }
    }
}
