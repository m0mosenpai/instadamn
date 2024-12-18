package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.8ki, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195428ki implements InterfaceC13000lm {
    public final Map A01 = new HashMap();
    public final Map A00 = new HashMap();

    public static final Medium A00(RemoteMedia remoteMedia, File file) {
        C14360o3.A0B(remoteMedia, 0);
        C14360o3.A0B(file, 1);
        long currentTimeMillis = System.currentTimeMillis();
        int hashCode = UUID.randomUUID().hashCode();
        int i = 1;
        if (remoteMedia.A09) {
            i = 3;
        }
        String canonicalPath = file.getCanonicalPath();
        C14360o3.A07(canonicalPath);
        Medium medium = new Medium(android.net.Uri.fromFile(file), canonicalPath, hashCode, i, 0, remoteMedia.A01, currentTimeMillis / 1000, currentTimeMillis);
        medium.A0G.A00(remoteMedia.A02);
        medium.A0a = remoteMedia.A03.CDP();
        medium.A0G.A0B = true;
        return medium;
    }

    public final synchronized Medium A01(RemoteMedia remoteMedia) {
        return (Medium) this.A01.get(remoteMedia);
    }

    public final synchronized void A02(Medium medium, RemoteMedia remoteMedia) {
        C14360o3.A0B(remoteMedia, 0);
        C14360o3.A0B(medium, 1);
        this.A01.put(remoteMedia, medium);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        synchronized (this) {
            this.A01.clear();
            this.A00.clear();
        }
    }
}
