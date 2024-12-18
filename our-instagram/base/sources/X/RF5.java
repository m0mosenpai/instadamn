package X;

import android.media.MediaCodec;

/* loaded from: classes10.dex */
public class RF5 extends C4YB {
    public final C2IG A00;

    public RF5(C2IG c2ig, Throwable th) {
        super(AnonymousClass001.A0R("Decoder failed: ", c2ig != null ? c2ig.A03 : null), th);
        this.A00 = c2ig;
        if (th instanceof MediaCodec.CodecException) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
    }
}
