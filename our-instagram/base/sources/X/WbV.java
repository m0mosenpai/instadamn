package X;

import android.media.MediaCrypto;
import com.google.android.exoplayer2.util.Util;
import java.util.UUID;

/* loaded from: classes11.dex */
public final class WbV implements InterfaceC71856X7o {
    public static final boolean A03;
    public final MediaCrypto A00;
    public final UUID A01;
    public final byte[] A02;

    static {
        boolean z;
        if ("Amazon".equals(Util.A03)) {
            String str = Util.A04;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                A03 = z;
            }
        }
        z = false;
        A03 = z;
    }

    public WbV(MediaCrypto mediaCrypto, UUID uuid, byte[] bArr) {
        this.A00 = mediaCrypto;
        this.A01 = uuid;
        this.A02 = bArr;
    }
}
