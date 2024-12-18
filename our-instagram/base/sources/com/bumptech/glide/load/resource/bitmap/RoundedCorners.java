package com.bumptech.glide.load.resource.bitmap;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC63755StB;
import X.InterfaceC65617To8;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class RoundedCorners extends AbstractC63755StB {
    public static final byte[] A01 = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC65617To8.A00);
    public final int A00;

    @Override // X.InterfaceC65617To8
    public final void FAj(MessageDigest messageDigest) {
        messageDigest.update(A01);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.A00);
        messageDigest.update(allocate.array());
    }

    @Override // X.InterfaceC65617To8
    public final boolean equals(Object obj) {
        if (!(obj instanceof RoundedCorners) || this.A00 != ((RoundedCorners) obj).A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65617To8
    public final int hashCode() {
        return ((527 + this.A00) * 31) - 569625254;
    }

    public RoundedCorners(int i) {
        if (AbstractC167007dF.A1O(i)) {
            this.A00 = i;
            return;
        }
        throw AbstractC166987dD.A12("roundingRadius must be greater than 0.");
    }
}
