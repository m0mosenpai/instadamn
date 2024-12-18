package X;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YJ1 implements Iterator {
    public final /* synthetic */ C72339Xbb A00;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        try {
            return this.A00.available() > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    public YJ1(C72339Xbb c72339Xbb) {
        this.A00 = c72339Xbb;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.A00();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC166987dD.A1D("Remove not supported on ASN.1 InputStream iterator");
    }
}
