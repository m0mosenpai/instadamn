package com.facebook.instagrammem.mca;

import X.C14360o3;
import X.C44991Jvh;
import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class MailboxInstagramMem$BytesAvailableHandlerCallback {
    private void callbackJNI(byte[] bArr, long j, long j2, long j3, boolean z) {
        C44991Jvh c44991Jvh = (C44991Jvh) this;
        C14360o3.A0B(bArr, 0);
        synchronized (c44991Jvh) {
            if (c44991Jvh.A02) {
                return;
            }
            if (z) {
                c44991Jvh.A04 = true;
            }
            try {
                c44991Jvh.A06.A01(bArr, z);
            } catch (IOException unused) {
                C44991Jvh.A00(c44991Jvh);
            }
        }
    }
}
