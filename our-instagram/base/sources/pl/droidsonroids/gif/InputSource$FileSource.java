package pl.droidsonroids.gif;

import X.AbstractC72502XfH;

/* loaded from: classes12.dex */
public final class InputSource$FileSource extends AbstractC72502XfH {
    public final String mPath;

    @Override // X.AbstractC72502XfH
    public GifInfoHandle open() {
        return new GifInfoHandle(this.mPath);
    }

    public InputSource$FileSource(String str) {
        this.mPath = str;
    }
}
