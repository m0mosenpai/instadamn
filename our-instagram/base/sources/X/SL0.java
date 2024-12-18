package X;

import java.io.File;

/* loaded from: classes10.dex */
public final class SL0 {
    public final SAX A00;
    public volatile InterfaceC65475Tks A01;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.Tks, java.lang.Object] */
    public final InterfaceC65475Tks A00() {
        File A0w;
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    File cacheDir = this.A00.A00.A00.getCacheDir();
                    if (cacheDir != null) {
                        A0w = MSW.A0w(cacheDir, "image_manager_disk_cache");
                    } else {
                        A0w = null;
                    }
                    C70373WTb c70373WTb = null;
                    if (A0w != null && (A0w.isDirectory() || A0w.mkdirs())) {
                        c70373WTb = new C70373WTb(A0w);
                    }
                    this.A01 = c70373WTb;
                }
                if (this.A01 == null) {
                    this.A01 = new Object();
                }
            }
        }
        return this.A01;
    }

    public SL0(SAX sax) {
        this.A00 = sax;
    }
}
