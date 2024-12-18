package X;

import com.facebook.msys.mci.TranscodeImageCompletionCallback;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes11.dex */
public final class W8x {
    public final /* synthetic */ TranscodeImageCompletionCallback A00;
    public final /* synthetic */ C69272Vkg A01;
    public final /* synthetic */ DefaultMediaTranscoder A02;
    public final /* synthetic */ String A03;

    public W8x(TranscodeImageCompletionCallback transcodeImageCompletionCallback, C69272Vkg c69272Vkg, DefaultMediaTranscoder defaultMediaTranscoder, String str) {
        this.A02 = defaultMediaTranscoder;
        this.A03 = str;
        this.A01 = c69272Vkg;
        this.A00 = transcodeImageCompletionCallback;
    }

    public static final String A00(W8x w8x, C70111W4i c70111W4i, boolean z) {
        String A0R;
        Integer num = c70111W4i.A0A;
        if (num != C05F.A00 && num != C05F.A0C) {
            throw new IllegalStateException("transcodeImageV2: onCompleted - null transcodeResult");
        }
        byte[] bArr = c70111W4i.A0B;
        if (z) {
            A0R = "primary_";
        } else {
            A0R = AnonymousClass001.A0R("secondary", w8x.A03);
        }
        File createTempFile = File.createTempFile(A0R, null);
        createTempFile.deleteOnExit();
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        fileOutputStream.write(bArr);
        fileOutputStream.close();
        return android.net.Uri.fromFile(createTempFile).toString();
    }

    public W8x() {
    }
}
