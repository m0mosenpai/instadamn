package com.bumptech.glide.load.resource.bitmap;

import X.AbstractC63755StB;
import X.InterfaceC65617To8;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class CenterInside extends AbstractC63755StB {
    public static final byte[] A00 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC65617To8.A00);

    @Override // X.InterfaceC65617To8
    public final int hashCode() {
        return -670243078;
    }

    @Override // X.InterfaceC65617To8
    public final void FAj(MessageDigest messageDigest) {
        messageDigest.update(A00);
    }

    @Override // X.InterfaceC65617To8
    public final boolean equals(Object obj) {
        return obj instanceof CenterInside;
    }
}
