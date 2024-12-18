package X;

import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.Wqj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71254Wqj implements Runnable {
    public final C69438VnN A00;

    @Override // java.lang.Runnable
    public final void run() {
        C70111W4i A00;
        int i;
        try {
            ArrayList arrayList = new ArrayList();
            C69438VnN c69438VnN = this.A00;
            int i2 = c69438VnN.A03;
            if (i2 != -1 && (i = c69438VnN.A02) != -1) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ExecutorService executorService = c69438VnN.A0A;
                Future submit = executorService.submit(new CallableC71667WyK(c69438VnN, byteArrayOutputStream, c69438VnN.A01, c69438VnN.A00));
                Future submit2 = executorService.submit(new CallableC71667WyK(c69438VnN, byteArrayOutputStream2, i2, i));
                try {
                    arrayList.add((C70111W4i) submit.get());
                    arrayList.add((C70111W4i) submit2.get());
                } catch (InterruptedException | ExecutionException e) {
                    C0K8.A0F("ImageTranscodeOperation", "ImageTranscodeOperation: Failed to get primary/secondary transcode image future - ", e);
                }
            } else {
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i3 = c69438VnN.A01;
                int i4 = c69438VnN.A00;
                String str = c69438VnN.A08;
                if (str != null) {
                    A00 = c69438VnN.A04.A03(c69438VnN.A05, byteArrayOutputStream3, str, i3, i4);
                } else {
                    A00 = C70111W4i.A00(new IllegalArgumentException("transcodeImageV2: missing inputFilePath"));
                }
                arrayList.add(A00);
            }
            W8x w8x = c69438VnN.A06;
            if (arrayList.size() == 1) {
                C70111W4i c70111W4i = (C70111W4i) arrayList.get(0);
                try {
                    Execution.executeAsync(new USJ(w8x, W8x.A00(w8x, c70111W4i, true), DefaultMediaTranscoder.A01(w8x.A01, c70111W4i)), null, 4);
                    return;
                } catch (Exception unused) {
                    C0K8.A0C("DefaultMediaTranscoder", "transcodeImageV2: onComplete - Failed to write primary image to file");
                    Execution.executeAsync(new USP(w8x.A00, w8x.A02, new IOException("Failed to write primary image to file"), c70111W4i.A06, c70111W4i.A04, -1.0d, -1.0d), null, 4);
                    return;
                }
            }
            if (arrayList.size() == 2) {
                C70111W4i c70111W4i2 = (C70111W4i) arrayList.get(0);
                C70111W4i c70111W4i3 = (C70111W4i) arrayList.get(1);
                try {
                    String A002 = W8x.A00(w8x, c70111W4i2, true);
                    String A003 = W8x.A00(w8x, c70111W4i2, false);
                    C69272Vkg c69272Vkg = w8x.A01;
                    Execution.executeAsync(new USM(w8x, A002, A003, DefaultMediaTranscoder.A01(c69272Vkg, c70111W4i2), DefaultMediaTranscoder.A01(c69272Vkg, c70111W4i3)), null, 4);
                    return;
                } catch (Exception unused2) {
                    C0K8.A0C("DefaultMediaTranscoder", "transcodeImageV2: onComplete - Failed to write primary AND secondary image to file");
                    Execution.executeAsync(new USP(w8x.A00, w8x.A02, new IOException("Failed to write primary AND/OR secondary image to file"), c70111W4i2.A06, c70111W4i2.A04, c70111W4i3.A06, c70111W4i3.A04), null, 4);
                    return;
                }
            }
            C0K8.A0O("DefaultMediaTranscoder", "transcodeImageV2: onComplete - Exceeded the expected number of TranscodeResults: %d", Integer.valueOf(arrayList.size()));
            Execution.executeAsync(new USP(w8x.A00, w8x.A02, new IOException("Exceeded the expected number of TranscodeResults"), -1.0d, -1.0d, -1.0d, -1.0d), null, 4);
            return;
        } catch (Throwable th) {
            C0K8.A0F("ImageTranscodeOperation", "ImageTranscodeOperation: Failed to transcode image - ", th);
        }
        C0K8.A0F("ImageTranscodeOperation", "ImageTranscodeOperation: Failed to transcode image - ", th);
    }

    public RunnableC71254Wqj(C69438VnN c69438VnN) {
        this.A00 = c69438VnN;
    }
}
