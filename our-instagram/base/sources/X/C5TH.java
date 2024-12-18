package X;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* renamed from: X.5TH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5TH {
    public final MediaCrypto A00;
    public final MediaFormat A01;
    public final Surface A02;
    public final C4B6 A03;
    public final C2IG A04;

    public C5TH(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface, C4B6 c4b6, C2IG c2ig) {
        this.A04 = c2ig;
        this.A01 = mediaFormat;
        this.A03 = c4b6;
        this.A02 = surface;
        this.A00 = mediaCrypto;
    }
}
