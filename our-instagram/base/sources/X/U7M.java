package X;

import android.media.AudioManager;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class U7M {
    public final AudioManager A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public static final void A00(U7M u7m) {
        Enumeration keys = u7m.A01.keys();
        C14360o3.A07(keys);
        while (keys.hasMoreElements()) {
            InterfaceC95344Qu interfaceC95344Qu = (InterfaceC95344Qu) keys.nextElement();
            interfaceC95344Qu.pause();
            if (interfaceC95344Qu.getCurrentPosition() != 0) {
                interfaceC95344Qu.seekTo(0);
            }
        }
    }

    public U7M(AudioManager audioManager) {
        this.A00 = audioManager;
    }
}
