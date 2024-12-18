package X;

import com.facebook.msys.mci.TranscodeImageCompletionCallback;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;

/* loaded from: classes11.dex */
public final class USP extends AbstractRunnableC94874Os {
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ double A02;
    public final /* synthetic */ double A03;
    public final /* synthetic */ TranscodeImageCompletionCallback A04;
    public final /* synthetic */ DefaultMediaTranscoder A05;
    public final /* synthetic */ Throwable A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USP(TranscodeImageCompletionCallback transcodeImageCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, Throwable th, double d, double d2, double d3, double d4) {
        super("transcodeImageV2");
        this.A05 = defaultMediaTranscoder;
        this.A04 = transcodeImageCompletionCallback;
        this.A01 = d;
        this.A00 = d2;
        this.A03 = d3;
        this.A02 = d4;
        this.A06 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A04.failure(this.A01, this.A00, this.A03, this.A02, this.A06);
    }
}
