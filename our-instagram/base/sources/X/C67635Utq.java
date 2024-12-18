package X;

import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.TranscodeVideoCompletionCallback;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;
import java.util.List;

/* renamed from: X.Utq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67635Utq extends AbstractC55776Opl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ android.net.Uri A04;
    public final /* synthetic */ TranscodeVideoCompletionCallback A05;
    public final /* synthetic */ DefaultMediaTranscoder A06;

    public C67635Utq(android.net.Uri uri, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, int i, int i2, int i3, int i4) {
        this.A06 = defaultMediaTranscoder;
        this.A04 = uri;
        this.A05 = transcodeVideoCompletionCallback;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A02 = i4;
    }

    @Override // X.XES
    public final /* bridge */ /* synthetic */ void DEg(C70129W5q c70129W5q, Object obj) {
        Throwable th = (Throwable) obj;
        C0K8.A0F("DefaultMediaTranscoder", "transcodeVideo onException - TranscodeUtil.transcode() failed", th);
        DefaultMediaTranscoder.A02(this.A05, this.A06, th, this.A01, this.A00);
    }

    @Override // X.XES
    public final void D6f(List list) {
        if (list.size() != 1) {
            C0K8.A0O("DefaultMediaTranscoder", "transcodeVideo: onCompleted - Transcoding operation produced multiple output files (%s)", AbstractC25228BEl.A1Y(list.size()));
        }
        C55176Odf c55176Odf = (C55176Odf) list.get(0);
        Execution.executeAsync(new USL(this, c55176Odf, android.net.Uri.fromFile(c55176Odf.A0N).toString(), c55176Odf.A0J / 1000000.0d), null, 4);
    }
}
