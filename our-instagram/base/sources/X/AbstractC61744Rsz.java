package X;

import java.io.Closeable;

/* renamed from: X.Rsz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61744Rsz {
    public static void A00(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                C0K8.A0F("AssetFileUtil", "unable to close stream", e);
            }
        }
    }
}
