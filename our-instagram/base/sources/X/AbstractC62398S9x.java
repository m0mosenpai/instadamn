package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.S9x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62398S9x {
    public static final AbstractC61611Rqa A00;
    public static final ByteBuffer A01;
    public static final byte[] A05;
    public static final Charset A03 = Charset.forName("US-ASCII");
    public static final Charset A04 = AbstractC58318PtA.A0u();
    public static final Charset A02 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C58539Px7 c58539Px7 = new C58539Px7(bArr, 0, 0);
        try {
            c58539Px7.A0G(0);
            A00 = c58539Px7;
        } catch (C61032Re1 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
