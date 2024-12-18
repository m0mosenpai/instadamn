package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URLConnection;

/* renamed from: X.TYk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64884TYk extends URLConnection {
    @Override // java.net.URLConnection
    public final void connect() {
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return new ByteArrayInputStream(null);
    }

    public C64884TYk(java.net.URL url) {
        super(url);
    }
}
