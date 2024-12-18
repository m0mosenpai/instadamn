package X;

import java.io.Closeable;

/* loaded from: classes10.dex */
public final class THJ implements Closeable {
    public final C46h A00;
    public final /* synthetic */ C58506Pwa A01;

    public THJ(C58506Pwa c58506Pwa, C46h c46h) {
        C14360o3.A0B(c46h, 2);
        this.A01 = c58506Pwa;
        this.A00 = c46h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A01.A00.set(this.A00);
    }
}
