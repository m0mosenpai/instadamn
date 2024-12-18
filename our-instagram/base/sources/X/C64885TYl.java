package X;

import java.net.URLConnection;
import java.net.URLStreamHandler;

/* renamed from: X.TYl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64885TYl extends URLStreamHandler {
    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(java.net.URL url) {
        return new C64884TYk(url);
    }
}
