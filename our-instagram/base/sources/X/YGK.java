package X;

import android.media.AudioRecord;
import android.os.Process;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class YGK implements Runnable {
    public final /* synthetic */ C72815Xne A00;

    public YGK(C72815Xne c72815Xne) {
        this.A00 = c72815Xne;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Process.setThreadPriority(-19);
        try {
            C72815Xne c72815Xne = this.A00;
            int i = c72815Xne.A01;
            byte[] bArr = new byte[i];
            AudioRecord audioRecord = c72815Xne.A04;
            if (audioRecord != null) {
                audioRecord.startRecording();
            }
            long now = c72815Xne.A07.now();
            while (true) {
                AtomicBoolean atomicBoolean = c72815Xne.A0A;
                if (atomicBoolean.get()) {
                    AudioRecord audioRecord2 = c72815Xne.A04;
                    if (audioRecord2 != null) {
                        audioRecord2.read(bArr, 0, i);
                    }
                    OutputStream outputStream = c72815Xne.A05;
                    if (outputStream == null) {
                        break;
                    }
                    outputStream.write(bArr, 0, i);
                    if ((r8.now() - now) / 1000 >= c72815Xne.A00) {
                        atomicBoolean.set(false);
                    }
                } else {
                    OutputStream outputStream2 = c72815Xne.A05;
                    if (outputStream2 != null) {
                        outputStream2.close();
                        c72815Xne.A08.onRecordingCompleted();
                        return;
                    }
                }
            }
            C14360o3.A0F("outputStream");
            throw C00O.createAndThrow();
        } catch (IllegalStateException e) {
            e = e;
            str = "Audio Record start illegal state exception";
            C0K8.A0G("mss:AndroidAudioEnhancementRecordingImpl", str, e);
        } catch (InterruptedException e2) {
            e = e2;
            str = "Audio recording thread interrupted";
            C0K8.A0G("mss:AndroidAudioEnhancementRecordingImpl", str, e);
        }
    }
}
