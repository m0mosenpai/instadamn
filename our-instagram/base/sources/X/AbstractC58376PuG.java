package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.PuG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58376PuG {
    public static final AbstractC61610RqZ A00;
    public static final ByteBuffer A01;
    public static final byte[] A04;
    public static final Charset A03 = AbstractC58318PtA.A0u();
    public static final Charset A02 = Charset.forName("ISO-8859-1");

    public static AbstractC58374PuE A00(Object obj, Object obj2) {
        AbstractC58374PuE abstractC58374PuE = (AbstractC58374PuE) ((InterfaceC65625Tpl) obj);
        AbstractC50838MdV abstractC50838MdV = (AbstractC50838MdV) abstractC58374PuE.A03(C05F.A0Y, null, null);
        abstractC50838MdV.A02(abstractC58374PuE);
        InterfaceC65625Tpl interfaceC65625Tpl = (InterfaceC65625Tpl) obj2;
        if (abstractC50838MdV.AwG().getClass().isInstance(interfaceC65625Tpl)) {
            abstractC50838MdV.A02((AbstractC58374PuE) ((AbstractC58375PuF) interfaceC65625Tpl));
            return abstractC50838MdV.A00();
        }
        throw AbstractC166987dD.A12("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    static {
        byte[] bArr = new byte[0];
        A04 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C58377PuH c58377PuH = new C58377PuH(bArr);
        try {
            c58377PuH.A0B(0);
            A00 = c58377PuH;
        } catch (C53092Ne5 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
