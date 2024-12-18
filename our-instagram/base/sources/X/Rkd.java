package X;

import android.media.MediaCodec;

/* loaded from: classes10.dex */
public abstract class Rkd extends IllegalStateException {
    public Rkd(MediaCodec.CodecException codecException, String str) {
        super(AbstractC13670mt.A06("Code: %s, Recoverable %s, Transient :%s, Diagnostics %s, Explanation: %s", Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isRecoverable()), Boolean.valueOf(codecException.isTransient()), codecException.getDiagnosticInfo(), str), codecException);
    }
}
