package X;

import com.facebook.msys.mci.TranscodeVideoCompletionCallback;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;

/* loaded from: classes11.dex */
public final class USQ extends AbstractRunnableC94874Os {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ TranscodeVideoCompletionCallback A03;
    public final /* synthetic */ DefaultMediaTranscoder A04;
    public final /* synthetic */ MYB A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USQ(TranscodeVideoCompletionCallback transcodeVideoCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, MYB myb, String str, double d, int i, int i2) {
        super("transcodeVideo");
        this.A04 = defaultMediaTranscoder;
        this.A03 = transcodeVideoCompletionCallback;
        this.A06 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = myb;
        this.A00 = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TranscodeVideoCompletionCallback transcodeVideoCompletionCallback = this.A03;
        String str = this.A06;
        double d = this.A02;
        double d2 = this.A01;
        transcodeVideoCompletionCallback.success(str, d, d2, d, d2, 0.0d, this.A05.A06, this.A00, 100.0d * (-1.0d));
    }
}
