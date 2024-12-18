package X;

import android.graphics.Bitmap;

/* loaded from: classes10.dex */
public final class QBF extends SAV {
    public final C63799Stt A00(Bitmap.Config config, int i) {
        Object obj = (InterfaceC65322Ti2) this.A00.poll();
        if (obj == null) {
            obj = new C63799Stt(this);
        }
        C63799Stt c63799Stt = (C63799Stt) obj;
        c63799Stt.A00 = i;
        c63799Stt.A01 = config;
        return c63799Stt;
    }
}
