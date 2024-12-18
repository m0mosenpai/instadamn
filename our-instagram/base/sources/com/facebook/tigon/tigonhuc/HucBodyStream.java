package com.facebook.tigon.tigonhuc;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C1T4;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonErrorCode;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes10.dex */
public final class HucBodyStream {
    public long bodyLength;
    public long bytesWritten;
    public final TigonHucCallbackForwarder callbackForwarder;
    public final CountDownLatch latch;
    public final OutputStream outputStream;

    public final synchronized void reportBodyLength(long j) {
        this.bodyLength = j;
    }

    public final void reportError(byte[] bArr, int i) {
        C14360o3.A0B(bArr, 0);
        TigonError A00 = C1T4.A00(bArr, i);
        this.callbackForwarder.onError(A00.category.value, A00.errorDomain, A00.domainErrorCode, A00.description());
    }

    public final synchronized int writeBytes(byte[] bArr, int i) {
        TigonHucCallbackForwarder tigonHucCallbackForwarder;
        int i2;
        String str;
        String str2;
        if (bArr != null && i >= 0) {
            if (i <= bArr.length) {
                try {
                    this.outputStream.write(bArr, 0, i);
                    long j = this.bytesWritten + i;
                    this.bytesWritten = j;
                    TigonHucCallbackForwarder tigonHucCallbackForwarder2 = this.callbackForwarder;
                    long j2 = this.bodyLength;
                    if (j2 == -1) {
                        j2 = j;
                    }
                    tigonHucCallbackForwarder2.onUploadProgress(j, j2);
                    return 0;
                } catch (IOException e) {
                    tigonHucCallbackForwarder = this.callbackForwarder;
                    i2 = TigonErrorCode.TRANSIENT_ERROR.value;
                    str = "HucBodyStream";
                    str2 = e.getMessage();
                    if (str2 == null) {
                        str2 = "";
                    }
                }
            }
        }
        tigonHucCallbackForwarder = this.callbackForwarder;
        i2 = TigonErrorCode.INVALID_REQUEST.value;
        str = "HucBodyStream";
        str2 = "Invalid buffer or size provided";
        tigonHucCallbackForwarder.onError(i2, str, 1, str2);
        return 1;
    }

    public final void writeEOM() {
        this.latch.countDown();
    }

    public HucBodyStream(OutputStream outputStream, CountDownLatch countDownLatch, long j, TigonHucCallbackForwarder tigonHucCallbackForwarder) {
        AbstractC167017dG.A1P(outputStream, countDownLatch);
        C14360o3.A0B(tigonHucCallbackForwarder, 4);
        this.outputStream = outputStream;
        this.latch = countDownLatch;
        this.bodyLength = j;
        this.callbackForwarder = tigonHucCallbackForwarder;
    }
}
