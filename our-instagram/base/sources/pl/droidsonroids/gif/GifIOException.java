package pl.droidsonroids.gif;

import X.AnonymousClass001;
import java.io.IOException;

/* loaded from: classes10.dex */
public class GifIOException extends IOException {
    public static final long serialVersionUID = 13038402904505L;
    public final String mErrnoMessage;
    public final GifError reason;

    public static GifIOException fromCode(int i) {
        if (i == GifError.NO_ERROR.errorCode) {
            return null;
        }
        return new GifIOException(i, null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.mErrnoMessage;
        GifError gifError = this.reason;
        if (str == null) {
            return gifError.getFormattedDescription();
        }
        return AnonymousClass001.A0g(gifError.getFormattedDescription(), ": ", this.mErrnoMessage);
    }

    public GifIOException(int i, String str) {
        this.reason = GifError.fromCode(i);
        this.mErrnoMessage = str;
    }
}
