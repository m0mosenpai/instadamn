package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public abstract class SVC {
    public static final SWP A00;
    public static final ByteBuffer A01;
    public static final byte[] A05;
    public static final Charset A03 = Charset.forName("US-ASCII");
    public static final Charset A04 = AbstractC58318PtA.A0u();
    public static final Charset A02 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        SWP swp = new SWP(bArr);
        try {
            int i = swp.A01 + swp.A00;
            swp.A01 = i;
            if (i > 0) {
                swp.A00 = i;
                swp.A01 = i - i;
            } else {
                swp.A00 = 0;
            }
            A00 = swp;
        } catch (AbstractC61019Rdn e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static RaB A00(Object obj, Object obj2) {
        RaB raB = (RaB) ((TEY) obj);
        AbstractC60879RZb abstractC60879RZb = (AbstractC60879RZb) raB.A03(C05F.A0Y);
        abstractC60879RZb.A00(raB);
        TEY tey = (TEY) obj2;
        if (abstractC60879RZb.A02.getClass().isInstance(tey)) {
            abstractC60879RZb.A00((RaB) tey);
            if (!abstractC60879RZb.A01) {
                RaB raB2 = abstractC60879RZb.A00;
                SYY.A02.A00(raB2).Cmk(raB2);
                abstractC60879RZb.A01 = true;
            }
            return abstractC60879RZb.A00;
        }
        throw AbstractC166987dD.A12("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
