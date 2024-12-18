package X;

import android.media.MediaCodec;

/* loaded from: classes11.dex */
public abstract class VN1 {
    public static void A00(String str, Throwable th) {
        while (th != null && th != th.getCause()) {
            if (th instanceof MediaCodec.CodecException) {
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                C0K8.A0L("FBMediaCompositionPlayer", "%s::%s::diagnosticInfo=%s::isRecoverable=%s::isTransient=%s", codecException, str, codecException.getMessage(), codecException.getDiagnosticInfo(), Boolean.valueOf(codecException.isRecoverable()), Boolean.valueOf(codecException.isTransient()));
            } else {
                C0K8.A0L("FBMediaCompositionPlayer", "%s::%s", th, str, th.getMessage());
            }
            th = th.getCause();
        }
    }
}
