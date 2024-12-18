package X;

import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class QBN extends AbstractC63755StB {
    public static final byte[] A00 = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC65617To8.A00);

    @Override // X.InterfaceC65617To8
    public final int hashCode() {
        return 1101716364;
    }

    @Override // X.InterfaceC65617To8
    public final void FAj(MessageDigest messageDigest) {
        messageDigest.update(A00);
    }

    @Override // X.InterfaceC65617To8
    public final boolean equals(Object obj) {
        return obj instanceof QBN;
    }
}
