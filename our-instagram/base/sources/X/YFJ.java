package X;

import android.graphics.Bitmap;
import java.io.File;
import java.io.IOException;
import pl.droidsonroids.gif.GifDecoder;
import pl.droidsonroids.gif.InputSource$FileSource;

/* loaded from: classes12.dex */
public final class YFJ implements XEC, AnonymousClass752 {
    public final GifDecoder A00;

    @Override // X.XEC
    public final int EMm(int i, Bitmap bitmap) {
        C14360o3.A0B(bitmap, 1);
        this.A00.seekToTime(i, bitmap);
        return 0;
    }

    @Override // X.XEC
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // X.XEC
    public final int getFrameCount() {
        return this.A00.getFrameCount();
    }

    @Override // X.XEC
    public final int getHeight() {
        return this.A00.getHeight();
    }

    @Override // X.XEC
    public final int getWidth() {
        return this.A00.getWidth();
    }

    public YFJ(String str) {
        File file = new File(str);
        if (file.exists() && file.length() > 0) {
            this.A00 = new GifDecoder(new InputSource$FileSource(str));
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Invalid GIF input: exists={");
        A1C.append(file.exists());
        A1C.append(" length=");
        A1C.append(file.length());
        A1C.append(" path=\"");
        A1C.append(str);
        A1C.append('\"');
        throw new IOException(A1C.toString());
    }

    @Override // X.AnonymousClass752
    public final XEC AM2() {
        return this;
    }
}
