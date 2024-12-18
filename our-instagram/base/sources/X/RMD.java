package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class RMD extends AbstractC61297RlH {
    public boolean A00;
    public final int A01;
    public final MessageDigest A02;
    public final ByteBuffer A03;

    public /* synthetic */ RMD(MessageDigest messageDigest, int i) {
        this();
        this.A02 = messageDigest;
        this.A01 = i;
    }

    public RMD() {
        this.A03 = AbstractC58320PtC.A17(8);
    }
}
